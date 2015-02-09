package Mysql;
import java.sql.*;
import javax.swing.*;


public class Conexion {
    
    Connection conectar = null;
    public Connection conectar(){
        
        try{
        //Cargamos el Driver MySQL
           Class.forName("org.gjt.mm.mysql.Driver");//PARA LLAMAR AL DRIVER
           conectar = DriverManager.getConnection("jdbc:mysql://localhost/Gym","root","ecuador1987");//AGREAGAMOS DATOS DE NUETRA BASE DE DATOS Y USUARIO
           
           JOptionPane.showMessageDialog(null, "Conexion con exito");
        }
        catch(Exception e){
        JOptionPane.showMessageDialog(null,"Sin Conexion "+e);
        }
        return conectar;
    }
    
}
