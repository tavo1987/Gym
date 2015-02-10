package validaciones;
import javax.swing.text.*;//para traer las clases PlainDocument y BadLocationException
import javax.swing.*;
import java.awt.*;



public  class Validar extends PlainDocument{
    
    private String cajaTexto;
    private JTextField caja;
    private int  length; 
    
    public  Validar(){
        cajaTexto= null;
        length = length;
        caja =  caja;
     
    }

    public Validar(JTextField caja, int length) {
        this.caja = caja;
        this.length = length;
    }
 

/*--------------------------------------------------------------------------------
    método set para maximo o maximo de caracteres
---------------------------------------------------------------------------------*/
    public void setLength(int length){
        this.length = length;
    }


    
    
/*--------------------------------------------------------------------------------
    método para validar espacion en blanco
---------------------------------------------------------------------------------*/    
    
    public static boolean validarEspacionEnBlanco(String cajaTexto){
        
        String texto = cajaTexto;
        texto = texto.replaceAll(" +", "");
        texto.trim();
        
        if(texto.length() == 0){
            return true;
        }else{
            return false;
        }
   }


/*--------------------------------------------------------------------------------
    método para validar maximo de caracteres
---------------------------------------------------------------------------------*/    
 public void insertString(int args0,String arg1,AttributeSet arg2) throws BadLocationException{
 
     if(caja.getText().length()+arg1.length() > this.length){
         
         return;
     }
     super.insertString(args0, arg1, arg2);
 }
    

    
    
}
