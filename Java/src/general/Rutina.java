package general;
import Mysql.*;
import java.awt.Component;
import java.sql.*;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;


public class Rutina {
    
    private int id_rutina;
    private String nivel_rutina;
    
    
    //variables para los metodos
        Conexion cn = new Conexion();
        Connection conexion = cn.getConexion();
        PreparedStatement ps;
        ResultSet rs;
        String sql;
    
    public Rutina(){
        id_rutina=0;
        nivel_rutina = "";    
    }
    
/*---------------------------------------------------------------------------------------------------------------------------------------
        Metodos setter rutina
 ------------------------------------------------------------------------------------------------------------------------------------------*/
    
    public void SetIdRutina(int rutina){
        
        this.id_rutina = rutina;
    
    }

 /*-----------------------------------------------------------------------------------------------------------------------------------------
        Metodos insertar la rutina
 ------------------------------------------------------------------------------------------------------------------------------------------*/
   
    public  void SetIdRutina(String nivel){
        
          try{
            
            sql = "select id_rutina from rutinas where nivel = '"+nivel+"'";
            ps = conexion.prepareStatement(sql);
            rs = ps.executeQuery(sql);

            if(rs.next()){
                
                this.id_rutina = rs.getInt("id_rutina");
            }

          }catch(Exception ex){
              
             JOptionPane.showMessageDialog(null, ex.getMessage());
            
          }  
    
    }//fin del metodo
    

    public void SetNivelRutina(String nivel){
        
        this.nivel_rutina = nivel;
    
    }

   
/*-----------------------------------------------------------------------------------------------------------------------------------------
        Metodos getter de memebresia
 ------------------------------------------------------------------------------------------------------------------------------------------*/
    
    public int getIdRutina(){
    
        return this.id_rutina;
    }
    
    public String getNivelRutina(){
        return this.nivel_rutina;
    }
 
    
    
    
    

    
    
    

 
 
    

    
    
    
}
