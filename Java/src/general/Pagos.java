package general;


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
        
        return id_membresia;
        
    }
    
    public float getCosto(){
    return costo;
    
    }
    
    public float getTotal(){
        
        return total;
    }      
    
}
