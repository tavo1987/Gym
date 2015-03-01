package general;

import javax.swing.JOptionPane;


public class Pagos extends Membresia{
    
    private int id_membresia;
    private float costo;
    private float total;
    
    public Pagos(){
        
        id_membresia = 0;
        costo = 0;
        total = 0;
    
    }
   
    
    
    

    /*---------------------------------------------------------------------------------------------------------------------------------------
        Metodos setter de pagos
    ------------------------------------------------------------------------------------------------------------------------------------------*/
    
    public void setIdMembresia(int id_membresia){
        
        this.id_membresia = id_membresia;
        
    }
    
    public void setCosto(float costo){
    this.costo = costo;
    
    }
    
    public void setTotal(float total){
        
        this.total = total;
    }
    
    
    
    
    /*---------------------------------------------------------------------------------------------------------------------------------------
        Metodos getter de pagos
    ------------------------------------------------------------------------------------------------------------------------------------------*/
    
    public int getIdMembresia(){
        
        return this.id_membresia;
        
    }
    
    public float getCosto(){
    return costo;
    
    }
    
    public float getTotal(){
        
        return total;
    }
    
    
    
    
    /*---------------------------------------------------------------------------------------------------------------------------------------
        Metodos insertar pagos
    ------------------------------------------------------------------------------------------------------------------------------------------*/
     public boolean setPago(int cedula){
            
        try{
               
            sql = "insert into pagos(cedula, id_membresia, costo,total) values(?,?,?,?)";

                    //vector para gurdar registros de la tabla
 
                       ps = conexion.prepareStatement(sql);
                        //mandamos los valores a ejecutar
                        ps.setInt(1,cedula);
                        ps.setInt(2, this.getIdMembresia());
                        ps.setFloat(3, this.getCosto());
                        ps.setFloat(4, this.getTotal());
                        
                        int n = ps.executeUpdate();
                        
                        if(n > 0){
                            JOptionPane.showMessageDialog(null, "Pago insertado cone éxito");
                             return true;   
                        }else{
                            JOptionPane.showMessageDialog(null, "El pago no se inserto");
                             return false;
                        }

          }catch(Exception ex){
              
             JOptionPane.showMessageDialog(null, ex.getMessage());
             return false;
          }  
    
    }
     
     
     
     
/*----------------------------------------------------------------------------------------------------------------------------------------
        Metodos buscar pagos
 ------------------------------------------------------------------------------------------------------------------------------------------*/
     
public String[] buscarPagos(int cedula){    
    
            String[] registros = new String[7];

           try{  
               sql = "select * from clientes where cedula = "+cedula+"";
               ps =  conexion.prepareStatement(sql);
               rs = ps.executeQuery();

               if(rs.next()){
                   sql="call sp_pagos("+cedula+")";
               ps =  conexion.prepareStatement(sql);
               rs = ps.executeQuery();

                       if(rs.next()){

                          registros[0]  = String.valueOf(rs.getInt("cedula"));
                          registros[1]  = rs.getString("nombres");
                          registros[2]  = rs.getString("apellidos");
                          registros[3]  = rs.getString("tipo");
                          registros[4]  = rs.getString("date_ini");
                          registros[5]  = rs.getString("date_end");
                          registros[6]  = rs.getString("total");


                          JOptionPane.showMessageDialog(null, "Pago encontrado");
                          return registros;
                       }
               }


           }catch(Exception ex){
               JOptionPane.showMessageDialog(null, ex.getMessage());
           } 
           JOptionPane.showMessageDialog(null, "Cliente no existe");
           return registros; 
    
        }


/*----------------------------------------------------------------------------------------------------------------------------------------
        Metodo eliminar
 ------------------------------------------------------------------------------------------------------------------------------------------*/
     
public void eliminarPago(int cedula){    
    
           int id_pago;
           int id_membresia;

           try{  
               sql = "select * from clientes where cedula = "+cedula+"";
               ps =  conexion.prepareStatement(sql);
               rs = ps.executeQuery();

               if(rs.next()){
                   sql="call sp_pagos("+cedula+")";
               ps =  conexion.prepareStatement(sql);
               rs = ps.executeQuery();

                       if(rs.next()){

                           id_membresia = rs.getInt("id_membresia");
                           id_pago  = rs.getInt("id_pago");
                                                   
                           sql="delete from membresia where id_membresia = "+id_membresia+"";
                            ps =  conexion.prepareStatement(sql);
                            ps.executeUpdate();
                           
                             JOptionPane.showMessageDialog(null,"Pago eliminado con éxito");
                        }
               }else{
                    JOptionPane.showMessageDialog(null, "Cliente no existe");
               }

           }catch(Exception ex){
               JOptionPane.showMessageDialog(null, ex.getMessage());
           } 
                 
     }

    
}
