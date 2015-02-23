package general;
import javax.swing.*;



public class Membresia extends Cliente{
    
    //variables o propiedades de mi obejeto
    
    private int id_tipo_membresia;
    private String fecha_inicio;
    private String fecha_fin;
    private int asistencias;
    private int dias_total;
    
    //contructor de la clase 
    public Membresia(){
    id_tipo_membresia=0;
    fecha_inicio ="";
    fecha_fin="";
    asistencias=0;
    dias_total=0;
    

    }
    
    
 /*---------------------------------------------------------------------------------------------------------------------------------------
        Metodos setter de membresia
 ------------------------------------------------------------------------------------------------------------------------------------------*/
    public void setIdTipoMembresia(int id_tipo){
       this.id_tipo_membresia = id_tipo;
    }
 
    public void setFechaInicio(String fecha_inicio){
       this.fecha_inicio = fecha_inicio;
       
    }
    
    public void setFechaFin(String fecha_fin){
       this.fecha_fin = fecha_fin;
           
    }
    
    public void setAsistencias(int asistencias){
       this.asistencias = asistencias;
    }
    
    public void setDiasTotal(int dias_total){
        
       this.dias_total = dias_total;
    }
  
    
/*---------------------------------------------------------------------------------------------------------------------------------------
        Metodos getter de memebresia
 ------------------------------------------------------------------------------------------------------------------------------------------*/
  public int getIdTipoMembresia(){
       return id_tipo_membresia;
    }
 
    public String getFechaInicio(){
       return fecha_inicio;
       
    }
    
    public String getFechaFin(){
       return fecha_fin;
           
    }
    
    public int getAsistencias(){
       return asistencias;
    }
    
    public int getDiasTotal(){
        
      return dias_total;
    }
    
    
    
    
    
    
}
