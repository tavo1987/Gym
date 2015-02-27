package validaciones;
import javax.swing.text.*;//para traer las clases PlainDocument y BadLocationException
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;


public  class Validar extends PlainDocument{

    public static void soloNumeros(ActionEvent evt) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
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
         //metodo utilizado al presionar tecla
        public static void soloNumeros(java.awt.event.KeyEvent evt){
               char a = evt.getKeyChar();

                if(a < '0' || a > '9')evt.consume();
        }
        
         //metodo utilizado al presionar tecla
        public static void soloNumerosDos(java.awt.event.KeyEvent evt, JTextField caja){
               

                if(!Character.isDigit(evt.getKeyChar()) && evt.getKeyChar() != '.') {
                    evt.consume();
                }
                
                //par que no ingrese mas de un punto en las cademas decimales
                if(evt.getKeyChar() == '.' && caja.getText().contains(".")){
                    evt.consume();
                
                }
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
                        && car !='ñ'
                        && car !='á' //Minúsculas             
                        && car !='é'            
                        && car !='í'            
                        && car !='ó'           
                        && car !='ú' 
                        && car !='Ñ'
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
        
 /*---------------------------------------------------------------------------------
    para validar cedula
 -------------------------------------------------------------------------------------*/      

public static boolean VerificarCedula(String cedula){
        int total =0;
        int tamañoLongitudCedula = 10;
        int[] coeficientes = {2,1,2,1,2,1,2,1,2};
        int numeroProvincias = 24;
        int tercerDigito = 6;

        if(cedula.matches("[0-9]*") && cedula.length() == tamañoLongitudCedula){
           int provincia = Integer.parseInt(cedula.charAt(0)+""+ cedula.charAt(1));//para coger el numero 1 y  2 de la cedula utilizacmos charAt
           int digitoTres = Integer.parseInt(cedula.charAt(2)+"");

           if(provincia > 0 && provincia <= numeroProvincias && digitoTres < tercerDigito )
            {
                int digitoVerificadorRecibido = Integer.parseInt(cedula.charAt(9)+"");//cogemos el novemo digito de la cadena recibida cedula
                 
                //multiplicamo por el vector coeficiente toda la cdena exeptio el decimo numero
                for(int i=0;i < coeficientes.length;i++){
                    int valor = coeficientes[i] * Integer.parseInt(cedula.charAt(i)+"");
                    
                    total = (valor>= 10)? total + (valor-9) : total + valor;
                    
                    }
                
                int digitoVerificadorObtenido = (total % 10) != 0 ? 10 - (total % 10) : 0;
                
                //(total>= 10) ? (total % 10) != 0 ?   10 - (total % 10) : (total % 10):total; fallo con 0202016051&
                
                if(digitoVerificadorObtenido == digitoVerificadorRecibido ){
                    return true;
                
                }
           
            }else{
               return false;
           }

        }else{
            return false;
        }
        return false;
}
  
///fin de la clase Validar    
}
