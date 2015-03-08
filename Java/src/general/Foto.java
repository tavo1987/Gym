package general;
import Mysql.Conexion;
import java.awt.Image;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.sql.*;
import java.util.Iterator;
import javax.imageio.ImageIO;
import javax.imageio.ImageReadParam;
import javax.imageio.ImageReader;
import javax.imageio.stream.ImageInputStream;
import javax.swing.JOptionPane;



public class Foto {
        
    Conexion conexion;
    private Image data;
    
     public Foto() {
        conexion = new Conexion();
    }
    
     
     
     
     
//metodo que dada una cadena de bytes la convierte en una imagen con extension jpeg
    private Image ConvertirImagen(byte[] bytes) throws IOException {
        ByteArrayInputStream bis = new ByteArrayInputStream(bytes);
        
                
        Iterator readers = ImageIO.getImageReadersByFormatName("jpeg");
        
               
        ImageReader reader = (ImageReader) readers.next();
        Object source = bis; // File or InputStream
        ImageInputStream iis = ImageIO.createImageInputStream(source);
        reader.setInput(iis, true);
        ImageReadParam param = reader.getDefaultReadParam();
        return reader.read(0, param);
    }
    
    
    
    
    
    //METODO PARA RECUPERAR LA IMAGEN DE LA BASE DE DATOS
    public Image recuperarfotos(String id) {

        try {
            
            String sql = "select archivo from rutinas where id_rutina = "+id+"";
            
            PreparedStatement ps = conexion.getConexion().prepareStatement(sql);
            
            ResultSet rs = ps.executeQuery();
            
            int i = 0;
                while (rs.next()) {
                    // se lee la cadena de bytes de la base de datos
                    byte[] b = rs.getBytes("archivo");
                    //esta cadena de bytes sera convertida en una imagen
                    data = ConvertirImagen(b);                   
                    i++;
                }
            rs.close();
        } catch (IOException | SQLException ex) {
           JOptionPane.showMessageDialog(null, ex.getMessage());
        }
        
        return data;

    }
    
}
