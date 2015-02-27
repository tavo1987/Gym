
package general;
import java.util.Calendar;
import java.util.GregorianCalendar;

public class Fechas {
        
        private int year;
        private int day;
        private int month;
    
        Calendar fecha = new GregorianCalendar();
        
        public Fechas(){
            
            
            int day = 0;
            int month = 0;
            int year = 0;
            
        }
        
        
        
        
/*---------------------------------------------------------------------------------------------------------------------------------------
    Metodos setter de fecha
 ------------------------------------------------------------------------------------------------------------------------------------------*/
    public void setDay(){
        this.day = fecha.get(Calendar.DAY_OF_MONTH);
                
    }
    
    public void setMonth(){
        this.month = fecha.get(Calendar.MONTH);
                
    }
    public void setYear(){
        this.year =fecha.get(Calendar.YEAR);
                
    }


    
    
    
    
/*---------------------------------------------------------------------------------------------------------------------------------------
    Metodos setter de fecha
------------------------------------------------------------------------------------------------------------------------------------------*/
   public int getDay(){
        return day;
                
    }
    
    public int getMonth(){
        return month;
                
    }
    public int getYear(){
        return year;
                
    }
    
   
    
    
/*---------------------------------------------------------------------------------------------------------------------------------------
    Metodos para fecha año/mes/dia
------------------------------------------------------------------------------------------------------------------------------------------*/
    public String fechaLatina(){
        
        String fecha2;
        this.day = fecha.get(Calendar.DAY_OF_MONTH);
        this.month = fecha.get(Calendar.MONTH)+1;
        this.year =fecha.get(Calendar.YEAR);
        
        fecha2 = String.valueOf(day+"/"+month+"/"+year);
        return fecha2;
    }

    
    
    
    
/*---------------------------------------------------------------------------------------------------------------------------------------
    Metodos para fecha año/mes/dia
------------------------------------------------------------------------------------------------------------------------------------------*/
    public String fechaEuropa(){
        
        String fecha2;
        
        this.day = fecha.get(Calendar.DAY_OF_MONTH);
        this.month = fecha.get(Calendar.MONTH)+1;
        this.year =fecha.get(Calendar.YEAR);
        
        fecha2 = String.valueOf(year+"-"+month+"-"+day);
        return fecha2;
    }
  
    
/*public static void main(String[] args){
        Fechas fecha = new Fechas();
    
        System.out.println(fecha.fechaLatina());
        System.out.println(fecha.fechaEuropa());
        
        
        fecha.setDay();
        System.out.println(fecha.getDay());
        
    }   */
       
        
}



