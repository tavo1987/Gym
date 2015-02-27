package general;
import Mysql.*;
import java.awt.Component;
import java.sql.*;
import javax.swing.JOptionPane;




public class Cliente{
    
    private int cedula;
    private String nombres;
    private String apellidos;
    private String dir;
    private String fecha_nac;
    private String sexo;
    private String telefono;
    private String celular;
    
    //variables para los metodos
    Conexion cn = new Conexion();
        Connection conexion = cn.getConexion();
        PreparedStatement ps;
        ResultSet rs;
        String sql;
    
    
    
    public Cliente(){
     super();
     cedula = 0;
     nombres= "";
     apellidos="";
     dir="";
     fecha_nac="";
     sexo="";
     telefono="";
     celular="";
    }
    
    
    
    
    /*---------------------------------------------------------------------------------------------------------------------------------------
     Contructor sobrecargado
    ------------------------------------------------------------------------------------------------------------------------------------------
     public Cliente(int cedula,String nombres,String apellidos,String dir, String fecha_nac, String sexo, String telefono,String celular){
     this.cedula = cedula;
     this.nombres= nombres;
     this.apellidos= apellidos;
     this.dir= dir;
     this.fecha_nac=fecha_nac;
     this.sexo=sexo;
     this.telefono=telefono;
     this.celular=celular;
    }
     
     /*---------------------------------------------------------------------------------------------------------------------------------------
        Metodos setter de cliente
    ------------------------------------------------------------------------------------------------------------------------------------------*/
    public void setCi(int ci){
       this.cedula = ci;
    }
     
     public void setNombres(String nombres){
       this.nombres = nombres;
    }
    
    public void setApellidos(String apellidos){
       this.apellidos = apellidos;
    }
    
    public void setDir(String dir){
       this.dir = dir;
    }
    
    public void setFechaNacimiento(String fecha_nac){
       this.fecha_nac = fecha_nac;
       
    }
    
     public void setSexo(String sexo){
       this.sexo = sexo;
       
    }
     
    public void setTelefono(String telefono){
       this.telefono = telefono;
       
    }
    
    public void setCelular(String celular){
       this.celular = celular;
       
    }
    
    
    
    
    /*---------------------------------------------------------------------------------------------------------------------------------------
        Metodos getter de cliente
    ------------------------------------------------------------------------------------------------------------------------------------------*/
     public int getCi(){
       return cedula;
    }
     
     public String getNombres(){
      return this.nombres;
    }
    
    public String getApellidos(){
      return this.apellidos;
    }
    
    public String getDir(){
       return this.dir;
    }
    
    public String getFechaNacimiento(){
     return this.fecha_nac;
       
    }
    
     public String getSexo(){
     return this.sexo;
       
    }
     
    public String getTelefono(){
      return this.telefono;
       
    }
    
    public String getCelular(){
      return this.celular;
       
    }
    
    
    
   /*---------------------------------------------------------------------------------------------------------------------------------------
        Metodos insertar cliente
    ------------------------------------------------------------------------------------------------------------------------------------------*/
    
    public  boolean SetCliente(){
        
          try{
                     
            sql = "insert into clientes(cedula,nombres,apellidos, direccion,fecha_nacimiento,sexo,telefono,celular)"
                    + "values(?,?,?,?,?,?,?,?)";

        //vector para gurdar registros de la tabla

                      ps = conexion.prepareStatement(sql);
                        //mandamos los valores a ejecutar
                        ps.setInt(1,this.getCi());
                        ps.setString(2, this.getNombres());
                        ps.setString(3, this.getApellidos());
                        ps.setString(4, this.getDir());
                        ps.setString(5, this.getFechaNacimiento());
                        ps.setString(6, this.getSexo());
                        ps.setString(7, this.getTelefono());
                        ps.setString(8, this.getCelular());
                        

                        int n = ps.executeUpdate();
                        
                        if(n > 0){
                             return true;   
                        }else{
                             return false;
                        }

          }catch(Exception ex){
              
             JOptionPane.showMessageDialog(null, ex.getMessage());
             return false;
          }  
               
        
    }
    
    
    
    
 /*----------------------------------------------------------------------------------------------------------------------------------------
        Metodos buscar cliente
 ------------------------------------------------------------------------------------------------------------------------------------------*/
     
public String[] buscarClientes(int cedula){    
    
     String[] registros = new String[9];
    
    try{  
        sql = "select * from clientes where cedula = "+cedula+"";
        ps =  conexion.prepareStatement(sql);
        
        rs = ps.executeQuery();
        
        if(rs.next()){
            
           registros[0]  = String.valueOf(rs.getInt("cedula"));
           registros[1]  = rs.getString("nombres");
           registros[2]  = rs.getString("apellidos");
           registros[3]  = rs.getString("direccion");
           registros[4]  = rs.getString("fecha_nacimiento");
           registros[5]  = rs.getString("sexo");
           registros[6]  = rs.getString("telefono");
           registros[7]  = rs.getString("celular");
           
           JOptionPane.showMessageDialog(null, "Cliente encontrado");
           return registros;
        }
        
    
    }catch(Exception ex){
        JOptionPane.showMessageDialog(null, ex.getMessage());
    } 
    JOptionPane.showMessageDialog(null, "cliente no existe");
    return registros; 
    
}




 /*----------------------------------------------------------------------------------------------------------------------------------------
        Metodos actulizar cliente
 ------------------------------------------------------------------------------------------------------------------------------------------*/
   public boolean updateCliente(int cedula){
       
          
      
       try{
            sql="update clientes set nombres = ?,apellidos = ?,direccion = ?,"
                    + "fecha_nacimiento = ?,sexo= ?,telefono=?,celular=?  where cedula = "+cedula+"";
                       
            ps = conexion.prepareStatement(sql);
            
            ps.setString(1, this.getNombres());
            ps.setString(2, this.getApellidos());
            ps.setString(3, this.getDir());
            ps.setString(4, this.getFechaNacimiento());
            ps.setString(5, this.getSexo());
            ps.setString(6, this.getTelefono());
            ps.setString(7, this.getCelular());

           int n = ps.executeUpdate();
           
           if(n > 0){
               JOptionPane.showMessageDialog(null, "Datos acutlizado con éxito");
               return true;
               
           }
            
            
        }catch(Exception ex){
            JOptionPane.showMessageDialog(null, ex.getMessage());
        
        }
       
        JOptionPane.showMessageDialog(null, "Los datos no se acutlizarón");
        return false;
       
   }
   
   
   
   
/*----------------------------------------------------------------------------------------------------------------------------------------
        Metodo para eliminar clientes
 ------------------------------------------------------------------------------------------------------------------------------------------*/
         public boolean eliminarCliente(int cedula){
       
      
       try{
               sql="delete from clientes where cedula = "+cedula+"";
               ps = conexion.prepareStatement(sql);

               int n = ps.executeUpdate();

               if(n > 0){
                   JOptionPane.showMessageDialog(null, "Cliente eliminado");
                   return true;

               }
     
        }catch(Exception ex){
            JOptionPane.showMessageDialog(null, ex.getMessage());
        
        }
       
        JOptionPane.showMessageDialog(null, "No se elimino el cliente");
        return false;
       
   } 
         
    
    
    
}
