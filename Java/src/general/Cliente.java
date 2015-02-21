package general;


public class Cliente {
    
    private long cedula;
    private String nombres;
    private String apellidos;
    private String dir;
    private String fecha_nac;
    private String sexo;
    private String telefono;
    private String celular;
    
    public Cliente(){
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
    ------------------------------------------------------------------------------------------------------------------------------------------*/
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
    public void setCi(long ci){
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
     public long getCi(){
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
     
     


        
    
    
    
}
