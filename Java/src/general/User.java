
package general;


public class User {
    
    private String user;
    private String tipo;
    
    
    public User(){
    
        user = "";
        tipo = "";

    }
    
    
    
    
    
    
  /*________________________________________________________________________________
    
        METODOS SETTER DE LA CACLASE USUARIO
    __________________________________________________________________________________*/
    
    public void setUser(String user){
        this.user = user;
        
    }
    
   public void setTipo(String tipo){
   
       this.tipo = tipo;
       
   }
   
   
   
   
   
   /*________________________________________________________________________________
    
        METODOS GETTER DE LA CACLASE USUARIO
    __________________________________________________________________________________*/
    
    public String getUser(){
    
        return this.user;
        
    }
    
    public String getTipo(){
        return this.tipo;
    }
    
    
    
    
    
}
