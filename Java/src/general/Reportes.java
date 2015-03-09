package general;

import Mysql.Conexion;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.HashMap;
import java.util.Map;
import javax.swing.JOptionPane;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperExportManager;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.view.JasperViewer;

public class Reportes {

    Conexion conexion = new Conexion();
    

//METODO PARA EXPORTAR A PDF UN REPORTE   

    public void resportesPDF(String ruta, String archi) {
        try {
            String rutaInforme = ruta;
            JasperPrint informe = JasperFillManager.fillReport(rutaInforme, null, conexion.getConexion());
            JasperExportManager.exportReportToPdfFile(informe, archi);

            JasperViewer ventanavisor = new JasperViewer(informe, false);
            ventanavisor.setTitle("INFORME");
            ventanavisor.setVisible(false);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "ERROR AL EXPORTAR DOCUMENTO " + e.getMessage());
        }
    }
    
  
    /*-----------------------------------------------------------------------------------
             aqui mandamos a imprimir el reporte del ciente
    -------------------------------------------------------------------------------------*/
    public void resportesPDF2(String cedula) {
               try {
                   
                    
                    String rutaInforme = "Reportes\\reporte_nuevo_cliente.jasper";
                    Map parametros  =  new HashMap(9);
                    parametros.put("num_cedula", cedula);
                    JasperPrint informe = JasperFillManager.fillReport(rutaInforme, parametros, conexion.getConexion());
                                        
                    JasperViewer ventanaVisor = new JasperViewer(informe,false);
                    ventanaVisor.setTitle("Reporte cliente");
                    ventanaVisor.setVisible(true);


                } catch (JRException ex) {
                    JOptionPane.showMessageDialog(null, ex.getMessage());
                }
    }
           
    
/*-----------------------------------------------------------------------------------
             aqui mandamos a imprimir el reporte del ciente
-------------------------------------------------------------------------------------*/
      public void resportesPDF3(String cedula) {
               try {
                   
                    
                    String rutaInforme = "Reportes\\reporte_nuevo_cliente.jasper";
                    Map parametros  =  new HashMap(9);
                    parametros.put("num_cedula", cedula);
                    JasperPrint informe = JasperFillManager.fillReport(rutaInforme, parametros, conexion.getConexion());
                                        
                    JasperViewer ventanaVisor = new JasperViewer(informe,false);
                    ventanaVisor.setTitle("Reporte cliente");
                    ventanaVisor.setVisible(true);


                } catch (JRException ex) {
                    JOptionPane.showMessageDialog(null, ex.getMessage());
                }
    }
      
      
      
      
/*-----------------------------------------------------------------------------------
             aqui mandamos a imprimir el reporte del ciente
-------------------------------------------------------------------------------------*/
      public void resportesSexoClientes(String sexo) {
               try {
                                       
                    String rutaInforme = "Reportes\\Clientes.jasper";
                    Map parametros  =  new HashMap(9);
                    parametros.put("input_sexo", sexo);
                    JasperPrint informe = JasperFillManager.fillReport(rutaInforme, parametros, conexion.getConexion());
                                        
                    JasperViewer ventanaVisor = new JasperViewer(informe,false);
                    ventanaVisor.setTitle("Reporte cliente");
                    ventanaVisor.setVisible(true);


                } catch (JRException ex) {
                    JOptionPane.showMessageDialog(null, ex.getMessage());
                }
    }
      
      
      
      
            
/*-----------------------------------------------------------------------------------
             aqui mandamos a imprimir el reporte por edad
-------------------------------------------------------------------------------------*/
      public void resportesEdad(String edad) {
               try {
                   
                    
                    String rutaInforme = "Reportes\\cliente_edad.jasper";
                    Map parametros  =  new HashMap(9);
                    parametros.put("input_edad", edad);
                    JasperPrint informe = JasperFillManager.fillReport(rutaInforme, parametros, conexion.getConexion());
                                        
                    JasperViewer ventanaVisor = new JasperViewer(informe,false);
                    ventanaVisor.setTitle("Reporte cliente");
                    ventanaVisor.setVisible(true);


                } catch (JRException ex) {
                    JOptionPane.showMessageDialog(null, ex.getMessage());
                }
    }
      
      
      
      
/*-----------------------------------------------------------------------------------
             aqui mandamos a imprimir el reporte por edad
-------------------------------------------------------------------------------------*/
      public void reportesFicha(String cedula) {
               try {
                   
                    
                    String rutaInforme = "Reportes\\ficha_seguimiento.jasper";
                    Map parametros  =  new HashMap(9);
                    parametros.put("num_cedula", cedula);
                    JasperPrint informe = JasperFillManager.fillReport(rutaInforme, parametros, conexion.getConexion());
                                        
                    JasperViewer ventanaVisor = new JasperViewer(informe,false);
                    ventanaVisor.setTitle("Reporte Ficha");
                    ventanaVisor.setVisible(true);


                } catch (JRException ex) {
                    JOptionPane.showMessageDialog(null, ex.getMessage());
                }
    }
      
      
      
      
/*-----------------------------------------------------------------------------------
             reporte de pago por cliente
-------------------------------------------------------------------------------------*/
      public void reportesPagoCliente(String cedula) {
               try {
                   
                    
                    String rutaInforme = "Reportes\\pagos_cliente.jasper";
                    Map parametros  =  new HashMap(9);
                    parametros.put("num_cedula", cedula);
                    JasperPrint informe = JasperFillManager.fillReport(rutaInforme, parametros, conexion.getConexion());
                                        
                    JasperViewer ventanaVisor = new JasperViewer(informe,false);
                    ventanaVisor.setTitle("Reporte Ficha");
                    ventanaVisor.setVisible(true);


                } catch (JRException ex) {
                    JOptionPane.showMessageDialog(null, ex.getMessage());
                }
    }
    
  
      
      
      
   
}
