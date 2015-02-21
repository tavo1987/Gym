package validaciones;
import javax.swing.text.*;//para traer las clases PlainDocument y BadLocationException
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;


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
 
 
 
 
 
 /*--------------------------------------------------------------------------------
    validacion para solo numeros
---------------------------------------------------------------------------------*/ 
        public static boolean Numero(String texto){

               if(texto.trim().matches(".*\\D+.*")){
                   return false;
               }else
                return true;

                }

        public static void soloNumeros(java.awt.event.KeyEvent evt){
               char a = evt.getKeyChar();

                if(a < '0' || a > '9')evt.consume();
        }
        
/*--------------------------------------------------------------------------------
    validacion para solo letras
---------------------------------------------------------------------------------*/ 
        public static void soloLetras(java.awt.event.KeyEvent evt){
               char a = evt.getKeyChar();

                if((a<'a' || a>'z') && (a<'A' || a>'Z')) evt.consume();
        }

        
        
        
        
/*--------------------------------------------------------------------------------
    validacion para solo letras y tildes 
---------------------------------------------------------------------------------*/ 
        public static void soloLetrasAcentos(java.awt.event.KeyEvent evt){
               char car = evt.getKeyChar();
               
                       if((car<'a' || car>'z') && (car<'A' || car>'Z')             
                        && car !='á' //Minúsculas             
                        && car !='é'            
                        && car !='í'            
                        && car !='ó'           
                        && car !='ú'   
                        && car !='Á' //Mayúsculas             
                        && car !='É'            
                        && car !='Í'            
                        && car !='Ó'           
                        && car !='Ú')//fin la condicion if
                           
                        //&& (car!=(char)KeyEvent.VK_SPACE))//para permitir espacios en blanco
                        //$$ (car!=(char) KeyEvent.VK_MINUS))//guiones
                        /*para simbolos especiales
                           && car !='('  
                            && car !=')'
                            && car !=';'
                           */
                    {      
                      evt.consume();   
                    }
             
        }
        
        


    
    
}
