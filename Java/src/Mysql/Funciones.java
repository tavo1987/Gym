package Mysql;
import java.sql.*;
import javax.swing.*;
import javax.swing.table.*;//para lamar a al default table model
import java.util.*;


public class Funciones{
   private PreparedStatement ps;
   private ResultSet rs;
   private ResultSetMetaData rsm;
   DefaultTableModel dtm;

    public Funciones() {
        this.ps = ps;
        this.rs = rs;
        this.rsm = rsm;
        this.dtm = dtm;
    }

    
    
    
/*---------------------------------------------------------------------------------
    Metodo para llenar un jtable
----------------------------------------------------------------------------------*/
   public void llenarTabla(JTable tabla, String sql)throws Exception{
       
       Conexion cn = new Conexion();//instanciamos nuestra clase conexion
       Connection conexion = cn.getConexion();
	
       ps = conexion.prepareStatement(sql);
       rs = ps.executeQuery();
       rsm = rs.getMetaData();
       
       //declaramos un array tipo list para guardar todos los resultados que se obtenga
       ArrayList<Object[]> datos =  new ArrayList<>();
       while(rs.next()){
           Object[] filas = new Object[rsm.getColumnCount()];
           for(int i=0 ; i<filas.length ; i++){
               filas[i]=rs.getObject(i+1);
           }
           datos.add(filas);
       }//fin del while
       dtm = (DefaultTableModel)tabla.getModel();
       for(int i=0;i<datos.size();i++){
           dtm.addRow(datos.get(i));
       }
       
   }
   
   
  
   
/*---------------------------------------------------------------------------------
    Metodo para refrescar un jTable que recibe dos parametros un jtable y un string
----------------------------------------------------------------------------------*/
    public void refrescarTabla(JTable tabla,String sql){
        
            try {
               llenarTabla(tabla, sql);
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, e.getMessage());
            }
    }
   
    
    
}
