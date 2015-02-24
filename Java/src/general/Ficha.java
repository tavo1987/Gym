package general;
//esto se importa pra pober utilizar la clase bigDecimal

import java.math.BigDecimal; 
import java.math.RoundingMode;
import javax.swing.JOptionPane;


public class Ficha extends Cliente{
    
    
        private double  altura;
	private double  peso;
	private double  cintura;
	private double  cuello;
	private double  cadera;
        
        
        //private double  imc;
	private double indiceCinturaAltura;
	private double grasaCorporal;
	private double masaMagra;
        //private double sobrePeso;
        private String nivel;
    
    public Ficha(){
        
                altura =0;
		peso=0;
		cintura=0;
		cuello=0;
		cadera=0;
                /*imc = 0;
                indiceCinturaAltura = 0;
                grasaCorporal=0;
                masaMagra=0;
                sobrePeso=0;*/
                nivel = null;
		           
    }
    
    
    
 /*---------------------------------------------------------------------------------------------------------------------------------------
        Metodos setter de pagos
------------------------------------------------------------------------------------------------------------------------------------------*/
    public void setAltura(double altura){
        this.altura = altura;
    }
    
    public void setPeso(double peso){
        this.peso = peso;
    }
    
    public void setCintura(double cintura){
        this.cintura = cintura;
    }
    
    public void setCuello(double cuello){
        this.cuello = cuello;
    }
    
    public void setCadera(double cadera){
        this.cadera = cadera;
    }
    /*
    public void setImc(double imc){
        this.imc = imc;
    }
    
    public void setIndiceCinturaAltura(double indiceCinturaAltura){
        this.indiceCinturaAltura = indiceCinturaAltura;
    }
    
    public void setGrasaCorporal(double grasaCorporal){
        this.grasaCorporal = grasaCorporal;
    }
    
    public void setMasaMagra(double masaMagra){
        this.masaMagra = masaMagra;
    }
    
    public void setSobrePeso(double sobrePeso){
        this.sobrePeso = sobrePeso;
    }
    */
    public void setNivel(String nivel){
        this.nivel = nivel;
    }
    
    
    
    
/*---------------------------------------------------------------------------------------------------------------------------------------
        Metodos getter de pagos
------------------------------------------------------------------------------------------------------------------------------------------*/
    public double getAltura(){
        return altura;
    }
    
    public double getPeso(){
        return peso;
    }
    
    public double getCintura(){
        return cintura;
    }
    
    public double getCuello(){
        return cuello;
    }
    
    public double getCadera(){
        return cadera;
    }
    /*
    public double getImc(){
        return imc;
    }
    
    public double getIndiceCinturaAltura(){
        return indiceCinturaAltura;
    }
    
    public double getGrasaCorporal(){
        return grasaCorporal;
    }
    
    public double getMasaMagra(){
        return masaMagra;
    }
    
    public double getSobrePeso(){
        return sobrePeso;
    }
    */
    public String getNivel(){
        return nivel;
    }
    
    
    
    
/*---------------------------------------------------------------------------------------------------------------------------------------
        Metodo para calcular el indice de masa corporal
------------------------------------------------------------------------------------------------------------------------------------------*/
    public double imc(){
		
		//esto cvonvierte los centimentros a metros
		double alturaMetros = this.altura / 100;
		
		//esto eleva la variable alturaMetros al cuadrado mediande el metodo pow
		alturaMetros = Math.pow(alturaMetros, 2);
		
		//formula que calcula el indice de masa corporal 
		double imc = peso / alturaMetros;
		
		//aqui redondeados la varible doble imc a dos decimales
		BigDecimal round = new BigDecimal(imc);
		round = round.setScale(2, RoundingMode.HALF_UP);//el 2 para 2 decimales, redonde hacia arriba
		
				
		//System.out.println("Tu indice de masa corporal es: " + round + "Kg/M2" );
                
		return Double.parseDouble(round.toString());
                
        }
    
    
    
    
/*---------------------------------------------------------------------------------------------------------------------------------------
        Metodo para calcular el indice de altura / cintura
------------------------------------------------------------------------------------------------------------------------------------------*/
        public double indice_cintura_Altura(){
		
        //formula que calcula el indice de altura / cintura
         indiceCinturaAltura = cintura / (this.altura /100);
         
         
       //aqui redondeados la varible doble imc a dos decimales
 		BigDecimal round = new BigDecimal(indiceCinturaAltura);
 		round = round.setScale(2, RoundingMode.HALF_UP);//el 2 para 2 decimales, redonde hacia arriba
 		
 	return Double.parseDouble(round.toString());
        
        //System.out.println("Tu indice de Cintura/Altura es: " + round+ "%");
        
		
	}

        
        
        
        
/*---------------------------------------------------------------------------------------------------------------------------------------
        Metodo para calcular grasa corporal
------------------------------------------------------------------------------------------------------------------------------------------*/
    public double grasaCorporal(String sexo){
		
					
            if(sexo.equalsIgnoreCase("Masculino")){

                    //fomula para calcular el indice de grasa corporal para hombre
                     grasaCorporal = 495/(1.0324-0.19077*(Math.log10(cintura-cuello)) + 0.15456*(Math.log10(altura)))-  450;

                    //aqui redondeados la varible doble grasaCorporal a dos decimales
                     BigDecimal grasa = new BigDecimal(grasaCorporal);
                     grasa = grasa.setScale(2, RoundingMode.HALF_UP);


                     return Double.parseDouble(grasa.toString());
                     //System.out.println("Tu indice de grasa corporal es: " + grasa+ "%");
            }
            else if(sexo.equalsIgnoreCase("Femenino")){

                    //fomula para calcular el indice de grasa corporal para mujeres
                     grasaCorporal=495/(1.29579-0.35004*(Math.log10(cintura+cadera-cuello))+0.22100*(Math.log10(altura)))-450;

                     //aqui redondeados la varible doble grasaCorporal a dos decimales
                     BigDecimal grasa = new BigDecimal(grasaCorporal);
                     grasa = grasa.setScale(2, RoundingMode.HALF_UP );

                     return Double.parseDouble(grasa.toString());
                     //System.out.println("Tu indice de grasa corporal es: " + grasa +"%");

            }
            else{
                return grasaCorporal;              
            }
	 
    }
    
    
    
    
 /*---------------------------------------------------------------------------------------------------------------------------------------
        Metodo para calcular masa magra
------------------------------------------------------------------------------------------------------------------------------------------*/
   public double masaMagra(){
 		
 		//formaula para sacar la masa magra corporal
 		double masaMagra = (peso * (100 - grasaCorporal))/100;
 		this.masaMagra =masaMagra;
 		
 		//aqui redondeados la varible doble masa a dos decimales
		 BigDecimal masa= new BigDecimal(masaMagra);
		 masa = masa.setScale(2, RoundingMode.HALF_UP );
		 
                 return Double.parseDouble(masa.toString());
                 
 		//System.out.println("Masa corporal magra: "+  masa + "Kg");
 		
 		
	  }
   
   
   
   
 /*---------------------------------------------------------------------------------------------------------------------------------------
       Metodo para calcular sobre peso
------------------------------------------------------------------------------------------------------------------------------------------*/
   	public double sobrePeso(){
 	 		
               if(this.peso > 0 && this.masaMagra > 0){
                   
                //formaula para sacar la masa magra corporal
                double grasaKg = peso - masaMagra; 

                //aqui redondeados la varible doble masa a dos decimales
                 BigDecimal masa= new BigDecimal(grasaKg);
                 masa = masa.setScale(2, RoundingMode.HALF_UP );

                 //formula para sacr grasa
               // double  libras = grasaKg * 2.2046;
                //aqui redondeados la varible doble masa a dos decimales
                 //BigDecimal librasRound= new BigDecimal(libras);
                // librasRound = librasRound.setScale(2, RoundingMode.HALF_UP );
 		
                 return Double.parseDouble(masa.toString());
 		//System.out.println("Usted tiene: "+  masa + "Kg ("+  librasRound + " libras) de sobre peso");
 	 		
 	 		
 		  }    
               
                  return 0; 
                   
        }
        
        //para probar que funcionan los metodos 
       /*public static void main(String[] args) {
           
           Ficha persona = new Ficha();
        
                double imc = persona.imc();
		double indice= persona.indice_cintura_Altura();
		double grasa =persona.grasaCorporal();
		double masa =persona.masaMagra();
		double sobrepeso =persona.sobrePeso();
                
                JOptionPane.showMessageDialog(null, "tu imc:" + imc + " indice: " +indice+ " grasaCorporal: " +grasa + " Masa Magra: "+ masa + " sobrepeso: " + sobrepeso);
        }*/
  
    
}



 
