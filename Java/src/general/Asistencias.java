package general;

import Mysql.Conexion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;


public class Asistencias {
    
      //Hacemos las conexion 
    public Conexion cn = new Conexion();//instanciamos nuestra clase conexion
    public Connection conexion = cn.getConexion();
    private  ResultSet rs;
    private PreparedStatement ps;
    private String sql;
    
    
    
    //variables del objeto tipo asistencias
    private String date;
    
    
    //contructor de asistencias
    public Asistencias(){  
       
        date="";
    }
    
    
    
    
/*---------------------------------------------------------------------------------------------------------------------------------------
        Metodos setter de asistencia
 ------------------------------------------------------------------------------------------------------------------------------------------*/
    
    public void setDate(String date){
        
        this.date= date;
    }
    
    
    
    
/*--------------------------------------------------------------------------------------------------------------------------------------
        Metodos getter de asistencia
 ------------------------------------------------------------------------------------------------------------------------------------------*/
    public String getDate(){
        return this.date;
    }
    

    
    
/*--------------------------------------------------------------------------------------------------------------------------------------
        insertar asistencia
 ------------------------------------------------------------------------------------------------------------------------------------------*/
    public boolean insertAsistencia(int cedula){
    
        try{
            
            sql = "select cedula from clientes  where cedula = "+cedula+"" ;
            ps = conexion.prepareStatement(sql);
            rs = ps.executeQuery(sql);
            
            
                //para verificar si el cliente existe antes de insertar la asistencia
                if(rs.next()){
                    sql = "insert into asistencia(cedula,date) values(?,?)";
                    ps = conexion.prepareStatement(sql);

                    ps.setInt(1, cedula);
                    ps.setString(2, getDate());
                    ps.executeUpdate();

                    return true;
                }    

        }catch(Exception ex){
           JOptionPane.showMessageDialog(null, ex.getMessage());
        }  
   
        return false;
    
    }//fin del metodo insertar asistencia
    
    
    
}
