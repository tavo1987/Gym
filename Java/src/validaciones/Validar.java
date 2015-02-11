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
    método para quitar espacion en blanco
---------------------------------------------------------------------------------*/    
    
    public static String quitarEspaciosEnBlanco(JTextField cajaTexto){
        
        String texto = cajaTexto.getText();
        texto = texto.replaceAll(" +", "");
        texto.trim();
       
        return texto;
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
