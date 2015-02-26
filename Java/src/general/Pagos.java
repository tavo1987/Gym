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
                             return true;   
                        }else{
                             return false;
                        }

          }catch(Exception ex){
              
             JOptionPane.showMessageDialog(null, ex.getMessage());
             return false;
          }  
    
    }
    
}
