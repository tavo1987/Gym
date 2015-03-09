package forms;
import javax.swing.*;
import Mysql.*;//clase que me hace la conexion
import validaciones.*;//clase paera validar
import general.*;
import java.awt.Component;
import java.awt.TextField;
import java.util.*;
import java.sql.*;


public class Form_clientes extends JFrame {
    
        Conexion cn = new Conexion();
        Connection conexion = cn.getConexion();
        PreparedStatement ps;
        ResultSet rs;
        String sql;
        
        //variables
            private String cedula;
            private String nombres;
            private String apellidos;
            private String dir;
           
            private String telefono;
            private String celular;
            private String day,month,year;
            private String fecha_fin;
            String fecha_inicio2;
        
        
         
        
        
            
        //declaramos un objeto tipo cliente
            Cliente cliente = new  Cliente();
        //instacnceamos calsde ficha
          Ficha ficha = new Ficha();
          Membresia membresia = new Membresia();
          Pagos pagos = new Pagos();
          Rutina rutinas =  new Rutina();

          
          
          
          
          
      public Form_clientes() {
            initComponents();
            setLocationRelativeTo(null);
        
        
            //para esconder los demas paneles
             this.panelPrincipal.setEnabledAt(1,false);
             this.panelPrincipal.setEnabledAt(2,false);
             this.panelPrincipal.setEnabledAt(3,false);
             this.panelPrincipal.setEnabledAt(4,false);
             
                try{
                    
                    /*this.panelPrincipal.removeTabAt(1);
                    this.panelPrincipal.removeTabAt(1);
                    this.panelPrincipal.removeTabAt(1);*/

                }catch(Exception ex){
                   JOptionPane.showMessageDialog(rootPane, ex.getMessage());
                }  

        
        //para cargar el combo nivel con  rutinas que existen
           cargarRutinas();
   
         
        //this.panelPrincipal.addTab("Datos Finales", spanel_finales);//para agregar
       
        //cargamos los datos de la tablam mebresia
        cargarMembresias();
        setTitle("Clientes");
        this.txt_cedula.requestFocus();
        //para limitar ingreso de caracteres en la cajas      
        this.txt_cedula.setDocument(new Validar(txt_cedula,10));
        this.txt_nombres.setDocument(new Validar(txt_nombres,35));
        this.txt_apellidos.setDocument(new Validar(txt_apellidos,40));
        this.txt_dir.setDocument(new Validar(txt_dir,100));
        this.txt_telefono.setDocument(new Validar(txt_telefono,10));
        this.txt_celular.setDocument(new Validar(txt_celular,10));
        this.txt_dias.setDocument(new Validar(txt_dias,3));

       this.txt_peso.setDocument(new Validar(txt_peso,3));
       this.txt_altura.setDocument(new Validar(txt_altura,3));
       this.txt_cintura.setDocument(new Validar(txt_cintura,3));
       this.txt_cuello.setDocument(new Validar(txt_cuello,3));
       this.txt_cadera.setDocument(new Validar(txt_cadera,3));
      
       
      //para centrar el texto de las cajas de texto 
        this.txt_costo.setHorizontalAlignment((int) TextField.CENTER_ALIGNMENT);
        this.txt_dias.setHorizontalAlignment((int) TextField.CENTER_ALIGNMENT);
  
      //para ocultar caja yl el label de los dias para para la membresia especial
        lbl_dias.setVisible(false);
        txt_dias.setVisible(false);
        
      //para ocultar caja para que ingresa medida de cadera 
        txt_cadera.setVisible(true);
        lbl_cadera.setVisible(false);
        
      //generamos los 100 años par el combo box de fecha de nacimiento
        for(int i=100;i>=1;i--){
            
            cbo_year.addItem(1924 + i );
            cbo_years1.addItem(1924 + i );
        
        }
        
        
    }

      
      
      
  /*-----------------------------------------------------------------------------------
      metodo para limpiar cajas de texto
 -------------------------------------------------------------------------------------*/ 
      
 public void limpiar(){
      this.txt_cedula.setText("");
       this.txt_nombres.setText("");
       this.txt_apellidos.setText("");
       this.txt_dir.setText("");
       this.txt_telefono.setText("");
       this.txt_celular.setText("");
  }
 
 
 
 
 
/*-----------------------------------------------------------------------------------------------------------------------------------------
        Metodos cargar combo de rutinas existentes
 ------------------------------------------------------------------------------------------------------------------------------------------*/
 public void cargarRutinas(){
        
        try{
            
            sql = "select nivel from rutinas";
            
            ps = conexion.prepareStatement(sql);
            rs = ps.executeQuery();
            
            while(rs.next()){
                cbo_nivel.addItem(rs.getString("nivel"));
            }
        
        
        }catch(Exception ex){
             JOptionPane.showMessageDialog(null, ex.getMessage());
            
        } 
        
 }//fin del metodo
 
 
 
  /*-----------------------------------------------------------------------------------
      metodo cargar fecha de proximo pago 
 -------------------------------------------------------------------------------------*/ 
 public  void cargarProxPago(){
     
      day = this.cbo_days1.getSelectedItem().toString();
      month = String.valueOf(this.cbo_month1.getSelectedIndex() + 1);
      int year = Integer.parseInt(this.cbo_years1.getSelectedItem().toString());
      int month2 = Integer.parseInt(month);
      String membresia = cbo_membresia.getSelectedItem().toString();
      
      if(cbo_membresia.getSelectedIndex() > 0){
            //para pago anual
          if(membresia.equals("Anual")){
              
             year = Integer.parseInt(this.cbo_years1.getSelectedItem().toString()) + 1;
             this.txt_prox_pago.setText(day +"/"+ month+ "/"+ year);
             fecha_fin=year +"-"+ month2+ "-"+ day;
            
             
            //para pago semestral
         }else if(membresia.equals("Semestral")){
              
              for(int i=0;i<6;i++){
                   month2 = month2 + 1;
                  
                  if(month2 > 12){
                      month2 = 1 + 1;
                      year = Integer.parseInt(this.cbo_years1.getSelectedItem().toString()) + 1;
                  }
              }
               fecha_fin=year +"-"+ month2+ "-"+ day;
               this.txt_prox_pago.setText(day +"/"+ month2+ "/"+ year);
               
               
             //para pago   mensual
          }else if(membresia.equals("Mensual")){
                                       
                  if(month2 == 12){
                      month2 = 1;
                       year = Integer.parseInt(this.cbo_years1.getSelectedItem().toString()) + 1;
                       
                      fecha_fin=year +"-"+ month2+ "-"+ day;
                      this.txt_prox_pago.setText(day +"/"+ month2+ "/"+ year);
                                           
                  }else{
                         this.txt_prox_pago.setText(day +"/"+ (month2 +1 )+ "/"+ year);
                         fecha_fin=year +"-"+ (month2 + 1) + "-"+ day;
                 }
              //para pago diario
          }else if(membresia.equals("Diario")){
                fecha_fin=year +"-"+ month+ "-"+ day;
               this.txt_prox_pago.setText(day+"/"+month+"/"+year);
          }
          else if(membresia.equals("Especial") && !txt_dias.getText().equals("")){
                    
                     this.txt_dias.requestFocus();
               }       
       
      }

    
 }
 
 
 
 
   /*-----------------------------------------------------------------------------------
      metodo para cargar mmebresias
 -------------------------------------------------------------------------------------*/ 
 public void cargarMembresias(){
        try{
            sql = "select tipo , costo from tipo";
            
            ps = conexion.prepareStatement(sql);
            rs = ps.executeQuery();
            
            while(rs.next()){
                cbo_membresia.addItem( rs.getString("tipo")) ;
              
                            
            }
            
        }catch(Exception ex){
             JOptionPane.showMessageDialog(rootPane, ex.getMessage());
        }  
 }
 
 
       
       
 /*-----------------------------------------------------------------------------------
 $Clientes Codigo genrado por netbeans para la interfas
 -------------------------------------------------------------------------------------*/
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup_sexo = new javax.swing.ButtonGroup();
        panelPrincipal = new javax.swing.JTabbedPane();
        spanel_personales = new javax.swing.JScrollPane();
        panel_personales = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        txt_nombres = new javax.swing.JTextField();
        txt_cedula = new javax.swing.JTextField();
        txt_apellidos = new javax.swing.JTextField();
        txt_dir = new javax.swing.JTextField();
        txt_telefono = new javax.swing.JTextField();
        radio_masculino = new javax.swing.JRadioButton();
        radio_femenino = new javax.swing.JRadioButton();
        jLabel18 = new javax.swing.JLabel();
        cbo_day = new javax.swing.JComboBox();
        cbo_year = new javax.swing.JComboBox();
        cbo_month = new javax.swing.JComboBox();
        btn_cancelar = new javax.swing.JButton();
        btn_siguiente = new javax.swing.JButton();
        txt_celular = new javax.swing.JTextField();
        btn_limpiar = new javax.swing.JButton();
        jSeparator3 = new javax.swing.JSeparator();
        btn_volver = new javax.swing.JButton();
        spanel_membresia = new javax.swing.JScrollPane();
        panel_membresia = new javax.swing.JPanel();
        jLabel56 = new javax.swing.JLabel();
        lbl_dias = new javax.swing.JLabel();
        cbo_membresia = new javax.swing.JComboBox();
        jLabel57 = new javax.swing.JLabel();
        txt_dias = new javax.swing.JTextField();
        jLabel59 = new javax.swing.JLabel();
        jLabel60 = new javax.swing.JLabel();
        txt_prox_pago = new javax.swing.JTextField();
        cbo_days1 = new javax.swing.JComboBox();
        cbo_month1 = new javax.swing.JComboBox();
        cbo_years1 = new javax.swing.JComboBox();
        btn_siguiente2 = new javax.swing.JButton();
        btn_atras = new javax.swing.JButton();
        jSeparator2 = new javax.swing.JSeparator();
        txt_costo = new javax.swing.JTextField();
        jLabel71 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel72 = new javax.swing.JLabel();
        txt_total_pagar = new javax.swing.JTextField();
        btn_limpiar42 = new javax.swing.JButton();
        spanel_ficha = new javax.swing.JScrollPane();
        panel_ficha = new javax.swing.JPanel();
        jLabel19 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        cbo_nivel = new javax.swing.JComboBox();
        jLabel22 = new javax.swing.JLabel();
        txt_peso = new javax.swing.JTextField();
        jLabel23 = new javax.swing.JLabel();
        txt_altura = new javax.swing.JTextField();
        jLabel24 = new javax.swing.JLabel();
        txt_cintura = new javax.swing.JTextField();
        btn_siguiente3 = new javax.swing.JButton();
        btn_limpiar3 = new javax.swing.JButton();
        jLabel52 = new javax.swing.JLabel();
        txt_cuello = new javax.swing.JTextField();
        lbl_cadera = new javax.swing.JLabel();
        txt_cadera = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        btn_atras2 = new javax.swing.JButton();
        spanel_finales = new javax.swing.JScrollPane();
        panel_final = new javax.swing.JPanel();
        jLabel25 = new javax.swing.JLabel();
        lbl_cintura = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();
        jLabel30 = new javax.swing.JLabel();
        jLabel32 = new javax.swing.JLabel();
        jLabel33 = new javax.swing.JLabel();
        jLabel34 = new javax.swing.JLabel();
        jLabel35 = new javax.swing.JLabel();
        jLabel36 = new javax.swing.JLabel();
        jLabel37 = new javax.swing.JLabel();
        jLabel38 = new javax.swing.JLabel();
        jLabel39 = new javax.swing.JLabel();
        jLabel40 = new javax.swing.JLabel();
        jLabel41 = new javax.swing.JLabel();
        jLabel31 = new javax.swing.JLabel();
        jLabel42 = new javax.swing.JLabel();
        lbl_sobrepeso = new javax.swing.JLabel();
        lbl_nombre = new javax.swing.JLabel();
        lbl_apellidos = new javax.swing.JLabel();
        lbl_dir = new javax.swing.JLabel();
        lbl_edad = new javax.swing.JLabel();
        lbl_peso = new javax.swing.JLabel();
        lbl_sexo = new javax.swing.JLabel();
        lbl_altura = new javax.swing.JLabel();
        lbl_cuello = new javax.swing.JLabel();
        lbl_cedula = new javax.swing.JLabel();
        lbl_imc = new javax.swing.JLabel();
        lbl_imc_altura = new javax.swing.JLabel();
        lbl_result_cadera = new javax.swing.JLabel();
        lbl_tipo_membresia = new javax.swing.JLabel();
        jLabel64 = new javax.swing.JLabel();
        lbl_costo = new javax.swing.JLabel();
        jLabel66 = new javax.swing.JLabel();
        jLabel67 = new javax.swing.JLabel();
        lbl_fecha_pago = new javax.swing.JLabel();
        lbl_prox_pago = new javax.swing.JLabel();
        jSeparator4 = new javax.swing.JSeparator();
        jSeparator5 = new javax.swing.JSeparator();
        jSeparator6 = new javax.swing.JSeparator();
        jSeparator7 = new javax.swing.JSeparator();
        jSeparator8 = new javax.swing.JSeparator();
        jSeparator9 = new javax.swing.JSeparator();
        jSeparator10 = new javax.swing.JSeparator();
        jSeparator13 = new javax.swing.JSeparator();
        jSeparator14 = new javax.swing.JSeparator();
        jSeparator15 = new javax.swing.JSeparator();
        jSeparator16 = new javax.swing.JSeparator();
        jSeparator17 = new javax.swing.JSeparator();
        jSeparator18 = new javax.swing.JSeparator();
        lbl_masa_magra = new javax.swing.JLabel();
        jSeparator19 = new javax.swing.JSeparator();
        jSeparator20 = new javax.swing.JSeparator();
        jSeparator21 = new javax.swing.JSeparator();
        jSeparator22 = new javax.swing.JSeparator();
        jSeparator23 = new javax.swing.JSeparator();
        jLabel74 = new javax.swing.JLabel();
        jSeparator12 = new javax.swing.JSeparator();
        jLabel53 = new javax.swing.JLabel();
        lbl_nivel = new javax.swing.JLabel();
        jSeparator24 = new javax.swing.JSeparator();
        jSeparator25 = new javax.swing.JSeparator();
        jLabel69 = new javax.swing.JLabel();
        jLabel75 = new javax.swing.JLabel();
        lbl_rutina = new javax.swing.JLabel();
        btn_atras_final = new javax.swing.JButton();
        btn_guardar = new javax.swing.JButton();
        jSeparator27 = new javax.swing.JSeparator();
        jLabel79 = new javax.swing.JLabel();
        lbl_total = new javax.swing.JLabel();
        jLabel43 = new javax.swing.JLabel();
        lbl_grasa = new javax.swing.JLabel();
        jLabel44 = new javax.swing.JLabel();
        lbl_telefono = new javax.swing.JLabel();
        jSeparator26 = new javax.swing.JSeparator();
        jLabel45 = new javax.swing.JLabel();
        lbl_celular = new javax.swing.JLabel();
        jSeparator29 = new javax.swing.JSeparator();
        panel_final1 = new javax.swing.JPanel();
        jLabel46 = new javax.swing.JLabel();
        jSeparator28 = new javax.swing.JSeparator();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panelPrincipal.setBackground(new java.awt.Color(250, 250, 250));
        panelPrincipal.setForeground(new java.awt.Color(110, 110, 110));
        panelPrincipal.setTabLayoutPolicy(javax.swing.JTabbedPane.SCROLL_TAB_LAYOUT);
        panelPrincipal.setAutoscrolls(true);
        panelPrincipal.setFont(new java.awt.Font("Verdana", 0, 16)); // NOI18N
        panelPrincipal.setPreferredSize(new java.awt.Dimension(800, 600));

        spanel_personales.setBorder(null);
        spanel_personales.setPreferredSize(new java.awt.Dimension(800, 600));

        panel_personales.setBackground(new java.awt.Color(250, 250, 250));
        panel_personales.setToolTipText("");
        panel_personales.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        panel_personales.setPreferredSize(new java.awt.Dimension(800, 900));
        panel_personales.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel10.setFont(new java.awt.Font("Verdana", 0, 16)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(110, 110, 110));
        jLabel10.setText("Cédula:");
        panel_personales.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 150, -1, -1));

        jLabel11.setFont(new java.awt.Font("Verdana", 0, 16)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(110, 110, 110));
        jLabel11.setText("Nombre:");
        panel_personales.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 210, -1, -1));

        jLabel12.setFont(new java.awt.Font("Verdana", 0, 16)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(110, 110, 110));
        jLabel12.setText("Apellido:");
        panel_personales.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 270, -1, -1));

        jLabel13.setFont(new java.awt.Font("Verdana", 0, 16)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(110, 110, 110));
        jLabel13.setText("Teléfono:");
        panel_personales.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(181, 480, -1, -1));

        jLabel14.setFont(new java.awt.Font("Verdana", 0, 16)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(110, 110, 110));
        jLabel14.setText("Fecha Nacimiento:");
        panel_personales.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(181, 380, -1, -1));

        jLabel15.setFont(new java.awt.Font("Verdana", 0, 16)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(110, 110, 110));
        jLabel15.setText("Dirección:");
        panel_personales.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 330, -1, -1));

        jLabel16.setFont(new java.awt.Font("Verdana", 0, 16)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(110, 110, 110));
        jLabel16.setText("Sexo:");
        panel_personales.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(181, 430, -1, -1));

        jLabel17.setFont(new java.awt.Font("Verdana", 0, 16)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(110, 110, 110));
        jLabel17.setText("Celular:");
        panel_personales.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(181, 550, -1, -1));

        txt_nombres.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        txt_nombres.setForeground(new java.awt.Color(110, 110, 110));
        txt_nombres.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(202, 202, 202), 1, true));
        txt_nombres.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_nombresKeyTyped(evt);
            }
        });
        panel_personales.add(txt_nombres, new org.netbeans.lib.awtextra.AbsoluteConstraints(321, 200, 350, 39));

        txt_cedula.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        txt_cedula.setForeground(new java.awt.Color(110, 110, 110));
        txt_cedula.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(202, 202, 202), 1, true));
        txt_cedula.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_cedulaKeyTyped(evt);
            }
        });
        panel_personales.add(txt_cedula, new org.netbeans.lib.awtextra.AbsoluteConstraints(321, 140, 350, 39));

        txt_apellidos.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        txt_apellidos.setForeground(new java.awt.Color(110, 110, 110));
        txt_apellidos.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(202, 202, 202), 1, true));
        txt_apellidos.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_apellidosKeyTyped(evt);
            }
        });
        panel_personales.add(txt_apellidos, new org.netbeans.lib.awtextra.AbsoluteConstraints(321, 260, 350, 39));

        txt_dir.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        txt_dir.setForeground(new java.awt.Color(110, 110, 110));
        txt_dir.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(202, 202, 202), 1, true));
        panel_personales.add(txt_dir, new org.netbeans.lib.awtextra.AbsoluteConstraints(321, 320, 350, 39));

        txt_telefono.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        txt_telefono.setForeground(new java.awt.Color(110, 110, 110));
        txt_telefono.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(202, 202, 202), 1, true));
        txt_telefono.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_telefonoActionPerformed(evt);
            }
        });
        txt_telefono.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_telefonoKeyTyped(evt);
            }
        });
        panel_personales.add(txt_telefono, new org.netbeans.lib.awtextra.AbsoluteConstraints(321, 480, 350, 39));

        radio_masculino.setBackground(new java.awt.Color(250, 250, 250));
        buttonGroup_sexo.add(radio_masculino);
        radio_masculino.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        radio_masculino.setForeground(new java.awt.Color(110, 110, 110));
        radio_masculino.setSelected(true);
        radio_masculino.setText("Masculino");
        radio_masculino.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radio_masculinoActionPerformed(evt);
            }
        });
        panel_personales.add(radio_masculino, new org.netbeans.lib.awtextra.AbsoluteConstraints(381, 440, -1, -1));

        radio_femenino.setBackground(new java.awt.Color(250, 250, 250));
        buttonGroup_sexo.add(radio_femenino);
        radio_femenino.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        radio_femenino.setForeground(new java.awt.Color(110, 110, 110));
        radio_femenino.setText("Femenino");
        panel_personales.add(radio_femenino, new org.netbeans.lib.awtextra.AbsoluteConstraints(531, 440, -1, -1));

        jLabel18.setFont(new java.awt.Font("Verdana", 0, 24)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(110, 110, 110));
        jLabel18.setText("Datos Personales");
        panel_personales.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(331, 2, -1, -1));

        cbo_day.setBackground(new java.awt.Color(250, 250, 250));
        cbo_day.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        cbo_day.setForeground(new java.awt.Color(110, 110, 110));
        cbo_day.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31" }));
        cbo_day.setToolTipText("");
        cbo_day.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        panel_personales.add(cbo_day, new org.netbeans.lib.awtextra.AbsoluteConstraints(351, 380, -1, 33));

        cbo_year.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        cbo_year.setForeground(new java.awt.Color(110, 110, 110));
        cbo_year.setToolTipText("");
        cbo_year.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbo_yearActionPerformed(evt);
            }
        });
        panel_personales.add(cbo_year, new org.netbeans.lib.awtextra.AbsoluteConstraints(587, 380, 70, 33));

        cbo_month.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        cbo_month.setForeground(new java.awt.Color(110, 110, 110));
        cbo_month.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio", "Julio", "Agosto", "Septiembre", "Octubre", "Noviembre", "Diciembre" }));
        cbo_month.setToolTipText("");
        cbo_month.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        cbo_month.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbo_monthActionPerformed(evt);
            }
        });
        panel_personales.add(cbo_month, new org.netbeans.lib.awtextra.AbsoluteConstraints(451, 380, -1, 33));

        btn_cancelar.setBackground(new java.awt.Color(0, 153, 204));
        btn_cancelar.setFont(new java.awt.Font("Verdana", 0, 16)); // NOI18N
        btn_cancelar.setForeground(new java.awt.Color(255, 255, 255));
        btn_cancelar.setText("Cancelar");
        btn_cancelar.setBorder(null);
        btn_cancelar.setBorderPainted(false);
        btn_cancelar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_cancelar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_cancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_cancelarActionPerformed(evt);
            }
        });
        panel_personales.add(btn_cancelar, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 630, 100, 40));

        btn_siguiente.setBackground(new java.awt.Color(0, 153, 204));
        btn_siguiente.setFont(new java.awt.Font("Verdana", 0, 16)); // NOI18N
        btn_siguiente.setForeground(new java.awt.Color(255, 255, 255));
        btn_siguiente.setText("Siguiente");
        btn_siguiente.setBorder(null);
        btn_siguiente.setBorderPainted(false);
        btn_siguiente.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_siguiente.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_siguiente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_siguienteActionPerformed(evt);
            }
        });
        panel_personales.add(btn_siguiente, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 630, 100, 40));

        txt_celular.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        txt_celular.setForeground(new java.awt.Color(110, 110, 110));
        txt_celular.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(202, 202, 202), 1, true));
        txt_celular.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_celularKeyTyped(evt);
            }
        });
        panel_personales.add(txt_celular, new org.netbeans.lib.awtextra.AbsoluteConstraints(321, 540, 350, 39));

        btn_limpiar.setBackground(new java.awt.Color(0, 153, 204));
        btn_limpiar.setFont(new java.awt.Font("Verdana", 0, 16)); // NOI18N
        btn_limpiar.setForeground(new java.awt.Color(255, 255, 255));
        btn_limpiar.setText("Limpiar");
        btn_limpiar.setBorder(null);
        btn_limpiar.setBorderPainted(false);
        btn_limpiar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_limpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_limpiarActionPerformed(evt);
            }
        });
        panel_personales.add(btn_limpiar, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 630, 100, 40));

        jSeparator3.setBackground(new java.awt.Color(51, 204, 255));
        panel_personales.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(191, 52, 478, 12));

        btn_volver.setBackground(new java.awt.Color(250, 250, 250));
        btn_volver.setFont(new java.awt.Font("Verdana", 0, 16)); // NOI18N
        btn_volver.setForeground(new java.awt.Color(110, 110, 110));
        btn_volver.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/ic_home_64.png"))); // NOI18N
        btn_volver.setText("Volver");
        btn_volver.setAutoscrolls(true);
        btn_volver.setBorder(null);
        btn_volver.setBorderPainted(false);
        btn_volver.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_volver.setFocusPainted(false);
        btn_volver.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_volver.setIconTextGap(-8);
        btn_volver.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        btn_volver.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btn_volver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_volverActionPerformed(evt);
            }
        });
        panel_personales.add(btn_volver, new org.netbeans.lib.awtextra.AbsoluteConstraints(21, 30, 70, 90));

        spanel_personales.setViewportView(panel_personales);

        panelPrincipal.addTab("Datos personales", spanel_personales);

        spanel_membresia.setBorder(null);

        panel_membresia.setBackground(new java.awt.Color(250, 250, 250));
        panel_membresia.setPreferredSize(new java.awt.Dimension(800, 900));
        panel_membresia.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel56.setFont(new java.awt.Font("Verdana", 0, 24)); // NOI18N
        jLabel56.setForeground(new java.awt.Color(110, 110, 110));
        jLabel56.setText("Datos Personales");
        panel_membresia.add(jLabel56, new org.netbeans.lib.awtextra.AbsoluteConstraints(314, 50, -1, -1));

        lbl_dias.setFont(new java.awt.Font("Verdana", 0, 16)); // NOI18N
        lbl_dias.setForeground(new java.awt.Color(110, 110, 110));
        lbl_dias.setText("Días:");
        panel_membresia.add(lbl_dias, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 170, 50, -1));

        cbo_membresia.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        cbo_membresia.setForeground(new java.awt.Color(110, 110, 110));
        cbo_membresia.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Elije membresia" }));
        cbo_membresia.setToolTipText("");
        cbo_membresia.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        cbo_membresia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbo_membresiaActionPerformed(evt);
            }
        });
        panel_membresia.add(cbo_membresia, new org.netbeans.lib.awtextra.AbsoluteConstraints(314, 160, 150, 43));

        jLabel57.setFont(new java.awt.Font("Verdana", 0, 16)); // NOI18N
        jLabel57.setForeground(new java.awt.Color(110, 110, 110));
        jLabel57.setText("Costo:");
        panel_membresia.add(jLabel57, new org.netbeans.lib.awtextra.AbsoluteConstraints(184, 230, -1, -1));

        txt_dias.setFont(new java.awt.Font("Verdana", 0, 16)); // NOI18N
        txt_dias.setForeground(new java.awt.Color(110, 110, 110));
        txt_dias.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(202, 202, 202), 1, true));
        txt_dias.setDisabledTextColor(new java.awt.Color(0, 204, 255));
        txt_dias.addInputMethodListener(new java.awt.event.InputMethodListener() {
            public void caretPositionChanged(java.awt.event.InputMethodEvent evt) {
            }
            public void inputMethodTextChanged(java.awt.event.InputMethodEvent evt) {
                txt_diasInputMethodTextChanged(evt);
            }
        });
        txt_dias.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_diasActionPerformed(evt);
            }
        });
        txt_dias.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txt_diasKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_diasKeyTyped(evt);
            }
        });
        panel_membresia.add(txt_dias, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 160, 130, 40));

        jLabel59.setFont(new java.awt.Font("Verdana", 0, 16)); // NOI18N
        jLabel59.setForeground(new java.awt.Color(110, 110, 110));
        jLabel59.setText("Fecha pago:");
        panel_membresia.add(jLabel59, new org.netbeans.lib.awtextra.AbsoluteConstraints(184, 291, -1, -1));

        jLabel60.setFont(new java.awt.Font("Verdana", 0, 16)); // NOI18N
        jLabel60.setForeground(new java.awt.Color(110, 110, 110));
        jLabel60.setText("Proximo pago:");
        panel_membresia.add(jLabel60, new org.netbeans.lib.awtextra.AbsoluteConstraints(184, 361, 160, 30));

        txt_prox_pago.setFont(new java.awt.Font("Verdana", 0, 16)); // NOI18N
        txt_prox_pago.setForeground(new java.awt.Color(110, 110, 110));
        txt_prox_pago.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(202, 202, 202), 1, true));
        txt_prox_pago.setDisabledTextColor(new java.awt.Color(110, 110, 110));
        txt_prox_pago.setEnabled(false);
        panel_membresia.add(txt_prox_pago, new org.netbeans.lib.awtextra.AbsoluteConstraints(356, 351, 350, 39));

        cbo_days1.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        cbo_days1.setForeground(new java.awt.Color(110, 110, 110));
        cbo_days1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31" }));
        cbo_days1.setToolTipText("");
        cbo_days1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        cbo_days1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbo_days1ActionPerformed(evt);
            }
        });
        panel_membresia.add(cbo_days1, new org.netbeans.lib.awtextra.AbsoluteConstraints(314, 281, 70, 33));

        cbo_month1.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        cbo_month1.setForeground(new java.awt.Color(110, 110, 110));
        cbo_month1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio", "Julio", "Agosto", "Septiembre", "Octubre", "Noviembre", "Diciembre" }));
        cbo_month1.setToolTipText("");
        cbo_month1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        cbo_month1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbo_month1ActionPerformed(evt);
            }
        });
        panel_membresia.add(cbo_month1, new org.netbeans.lib.awtextra.AbsoluteConstraints(444, 281, -1, 33));

        cbo_years1.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        cbo_years1.setForeground(new java.awt.Color(110, 110, 110));
        cbo_years1.setToolTipText("");
        cbo_years1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbo_years1ActionPerformed(evt);
            }
        });
        panel_membresia.add(cbo_years1, new org.netbeans.lib.awtextra.AbsoluteConstraints(574, 281, 73, 33));

        btn_siguiente2.setBackground(new java.awt.Color(0, 153, 204));
        btn_siguiente2.setFont(new java.awt.Font("Verdana", 0, 16)); // NOI18N
        btn_siguiente2.setForeground(new java.awt.Color(255, 255, 255));
        btn_siguiente2.setText("Siguiente");
        btn_siguiente2.setBorder(null);
        btn_siguiente2.setBorderPainted(false);
        btn_siguiente2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_siguiente2.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_siguiente2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_siguiente2ActionPerformed(evt);
            }
        });
        panel_membresia.add(btn_siguiente2, new org.netbeans.lib.awtextra.AbsoluteConstraints(578, 510, 100, 40));

        btn_atras.setBackground(new java.awt.Color(0, 153, 204));
        btn_atras.setFont(new java.awt.Font("Verdana", 0, 16)); // NOI18N
        btn_atras.setForeground(new java.awt.Color(255, 255, 255));
        btn_atras.setText("Atrás");
        btn_atras.setBorder(null);
        btn_atras.setBorderPainted(false);
        btn_atras.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_atras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_atrasActionPerformed(evt);
            }
        });
        panel_membresia.add(btn_atras, new org.netbeans.lib.awtextra.AbsoluteConstraints(261, 510, 100, 40));

        jSeparator2.setBackground(new java.awt.Color(51, 204, 255));
        panel_membresia.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(224, 110, 426, 10));

        txt_costo.setFont(new java.awt.Font("Verdana", 0, 16)); // NOI18N
        txt_costo.setForeground(new java.awt.Color(110, 110, 110));
        txt_costo.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(202, 202, 202), 1, true));
        txt_costo.setDisabledTextColor(new java.awt.Color(110, 110, 110));
        txt_costo.setEnabled(false);
        panel_membresia.add(txt_costo, new org.netbeans.lib.awtextra.AbsoluteConstraints(314, 220, 150, 39));

        jLabel71.setFont(new java.awt.Font("Verdana", 0, 16)); // NOI18N
        jLabel71.setForeground(new java.awt.Color(110, 110, 110));
        jLabel71.setText("Membresia:");
        panel_membresia.add(jLabel71, new org.netbeans.lib.awtextra.AbsoluteConstraints(184, 170, 100, -1));

        jLabel1.setFont(new java.awt.Font("Verdana", 2, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(110, 110, 110));
        jLabel1.setText("Dólares");
        panel_membresia.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(476, 221, 74, 39));

        jLabel72.setFont(new java.awt.Font("Verdana", 0, 16)); // NOI18N
        jLabel72.setForeground(new java.awt.Color(110, 110, 110));
        jLabel72.setText("Total a pagar:");
        panel_membresia.add(jLabel72, new org.netbeans.lib.awtextra.AbsoluteConstraints(184, 427, 160, 30));

        txt_total_pagar.setFont(new java.awt.Font("Verdana", 0, 16)); // NOI18N
        txt_total_pagar.setForeground(new java.awt.Color(110, 110, 110));
        txt_total_pagar.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(202, 202, 202), 1, true));
        txt_total_pagar.setDisabledTextColor(new java.awt.Color(110, 110, 110));
        txt_total_pagar.setEnabled(false);
        panel_membresia.add(txt_total_pagar, new org.netbeans.lib.awtextra.AbsoluteConstraints(356, 423, 350, 39));

        btn_limpiar42.setBackground(new java.awt.Color(0, 153, 204));
        btn_limpiar42.setFont(new java.awt.Font("Verdana", 0, 16)); // NOI18N
        btn_limpiar42.setForeground(new java.awt.Color(255, 255, 255));
        btn_limpiar42.setText("Limpiar");
        btn_limpiar42.setBorder(null);
        btn_limpiar42.setBorderPainted(false);
        btn_limpiar42.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_limpiar42.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_limpiar42ActionPerformed(evt);
            }
        });
        panel_membresia.add(btn_limpiar42, new org.netbeans.lib.awtextra.AbsoluteConstraints(408, 510, 100, 40));

        spanel_membresia.setViewportView(panel_membresia);

        panelPrincipal.addTab("Datos Membresia", spanel_membresia);

        spanel_ficha.setBorder(null);
        spanel_ficha.setOpaque(false);
        spanel_ficha.setPreferredSize(new java.awt.Dimension(960, 600));

        panel_ficha.setBackground(new java.awt.Color(250, 250, 250));
        panel_ficha.setPreferredSize(new java.awt.Dimension(800, 900));
        panel_ficha.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel19.setFont(new java.awt.Font("Verdana", 0, 24)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(110, 110, 110));
        jLabel19.setText("Datos Corporales");
        panel_ficha.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(143, 46, -1, -1));

        jLabel21.setFont(new java.awt.Font("Verdana", 0, 16)); // NOI18N
        jLabel21.setForeground(new java.awt.Color(110, 110, 110));
        jLabel21.setText("Nivel:");
        panel_ficha.add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(37, 130, -1, -1));

        cbo_nivel.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        cbo_nivel.setForeground(new java.awt.Color(110, 110, 110));
        cbo_nivel.setToolTipText("");
        cbo_nivel.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        cbo_nivel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbo_nivelActionPerformed(evt);
            }
        });
        panel_ficha.add(cbo_nivel, new org.netbeans.lib.awtextra.AbsoluteConstraints(147, 120, 180, 40));

        jLabel22.setFont(new java.awt.Font("Verdana", 0, 16)); // NOI18N
        jLabel22.setForeground(new java.awt.Color(110, 110, 110));
        jLabel22.setText("Peso Kg:");
        panel_ficha.add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(37, 190, -1, -1));

        txt_peso.setFont(new java.awt.Font("Verdana", 0, 16)); // NOI18N
        txt_peso.setForeground(new java.awt.Color(110, 110, 110));
        txt_peso.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(202, 202, 202), 1, true));
        txt_peso.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_pesoKeyTyped(evt);
            }
        });
        panel_ficha.add(txt_peso, new org.netbeans.lib.awtextra.AbsoluteConstraints(147, 180, 350, 39));

        jLabel23.setFont(new java.awt.Font("Verdana", 0, 16)); // NOI18N
        jLabel23.setForeground(new java.awt.Color(110, 110, 110));
        jLabel23.setText("Altura cm:");
        panel_ficha.add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(37, 250, -1, -1));

        txt_altura.setFont(new java.awt.Font("Verdana", 0, 16)); // NOI18N
        txt_altura.setForeground(new java.awt.Color(110, 110, 110));
        txt_altura.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(202, 202, 202), 1, true));
        txt_altura.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_alturaKeyTyped(evt);
            }
        });
        panel_ficha.add(txt_altura, new org.netbeans.lib.awtextra.AbsoluteConstraints(147, 240, 350, 39));

        jLabel24.setFont(new java.awt.Font("Verdana", 0, 16)); // NOI18N
        jLabel24.setForeground(new java.awt.Color(110, 110, 110));
        jLabel24.setText("Cintura cm:");
        panel_ficha.add(jLabel24, new org.netbeans.lib.awtextra.AbsoluteConstraints(37, 300, 105, -1));

        txt_cintura.setFont(new java.awt.Font("Verdana", 0, 16)); // NOI18N
        txt_cintura.setForeground(new java.awt.Color(110, 110, 110));
        txt_cintura.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(202, 202, 202), 1, true));
        txt_cintura.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_cinturaKeyTyped(evt);
            }
        });
        panel_ficha.add(txt_cintura, new org.netbeans.lib.awtextra.AbsoluteConstraints(147, 290, 350, 39));

        btn_siguiente3.setBackground(new java.awt.Color(0, 153, 204));
        btn_siguiente3.setFont(new java.awt.Font("Verdana", 0, 16)); // NOI18N
        btn_siguiente3.setForeground(new java.awt.Color(255, 255, 255));
        btn_siguiente3.setText("Siguiente");
        btn_siguiente3.setBorder(null);
        btn_siguiente3.setBorderPainted(false);
        btn_siguiente3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_siguiente3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_siguiente3ActionPerformed(evt);
            }
        });
        panel_ficha.add(btn_siguiente3, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 500, 100, 40));

        btn_limpiar3.setBackground(new java.awt.Color(0, 153, 204));
        btn_limpiar3.setFont(new java.awt.Font("Verdana", 0, 16)); // NOI18N
        btn_limpiar3.setForeground(new java.awt.Color(255, 255, 255));
        btn_limpiar3.setText("limpiar");
        btn_limpiar3.setBorder(null);
        btn_limpiar3.setBorderPainted(false);
        btn_limpiar3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_limpiar3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_limpiar3ActionPerformed(evt);
            }
        });
        panel_ficha.add(btn_limpiar3, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 500, 100, 40));

        jLabel52.setFont(new java.awt.Font("Verdana", 0, 16)); // NOI18N
        jLabel52.setForeground(new java.awt.Color(110, 110, 110));
        jLabel52.setText("Cuello cm:");
        panel_ficha.add(jLabel52, new org.netbeans.lib.awtextra.AbsoluteConstraints(37, 360, -1, -1));

        txt_cuello.setFont(new java.awt.Font("Verdana", 0, 16)); // NOI18N
        txt_cuello.setForeground(new java.awt.Color(110, 110, 110));
        txt_cuello.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(202, 202, 202), 1, true));
        txt_cuello.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_cuelloKeyTyped(evt);
            }
        });
        panel_ficha.add(txt_cuello, new org.netbeans.lib.awtextra.AbsoluteConstraints(147, 350, 350, 39));

        lbl_cadera.setFont(new java.awt.Font("Verdana", 0, 16)); // NOI18N
        lbl_cadera.setForeground(new java.awt.Color(110, 110, 110));
        lbl_cadera.setText("Cadera cm:");
        panel_ficha.add(lbl_cadera, new org.netbeans.lib.awtextra.AbsoluteConstraints(37, 410, 97, -1));

        txt_cadera.setFont(new java.awt.Font("Verdana", 0, 16)); // NOI18N
        txt_cadera.setForeground(new java.awt.Color(110, 110, 110));
        txt_cadera.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(202, 202, 202), 1, true));
        txt_cadera.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_caderaKeyTyped(evt);
            }
        });
        panel_ficha.add(txt_cadera, new org.netbeans.lib.awtextra.AbsoluteConstraints(147, 400, 350, 39));

        jSeparator1.setBackground(new java.awt.Color(51, 204, 255));
        panel_ficha.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(37, 90, 490, 10));

        btn_atras2.setBackground(new java.awt.Color(0, 153, 204));
        btn_atras2.setFont(new java.awt.Font("Verdana", 0, 16)); // NOI18N
        btn_atras2.setForeground(new java.awt.Color(255, 255, 255));
        btn_atras2.setText("Atras");
        btn_atras2.setBorder(null);
        btn_atras2.setBorderPainted(false);
        btn_atras2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_atras2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_atras2ActionPerformed(evt);
            }
        });
        panel_ficha.add(btn_atras2, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 500, 100, 40));

        spanel_ficha.setViewportView(panel_ficha);

        panelPrincipal.addTab("Ficha ", spanel_ficha);

        spanel_finales.setBorder(null);
        spanel_finales.setPreferredSize(new java.awt.Dimension(800, 600));

        panel_final.setBackground(new java.awt.Color(250, 250, 250));
        panel_final.setPreferredSize(new java.awt.Dimension(800, 900));
        panel_final.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel25.setBackground(new java.awt.Color(0, 153, 255));
        jLabel25.setFont(new java.awt.Font("Verdana", 0, 24)); // NOI18N
        jLabel25.setForeground(new java.awt.Color(51, 153, 255));
        jLabel25.setText("Datos de Membresia:");
        panel_final.add(jLabel25, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 550, 260, -1));

        lbl_cintura.setFont(new java.awt.Font("Verdana", 0, 16)); // NOI18N
        lbl_cintura.setForeground(new java.awt.Color(0, 153, 255));
        lbl_cintura.setText("Datos");
        panel_final.add(lbl_cintura, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 180, 90, -1));

        jLabel27.setFont(new java.awt.Font("Verdana", 0, 16)); // NOI18N
        jLabel27.setForeground(new java.awt.Color(110, 110, 110));
        jLabel27.setText("Nombre:");
        panel_final.add(jLabel27, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 140, -1, -1));

        jLabel28.setFont(new java.awt.Font("Verdana", 0, 16)); // NOI18N
        jLabel28.setForeground(new java.awt.Color(110, 110, 110));
        jLabel28.setText("Apellido:");
        panel_final.add(jLabel28, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 180, -1, -1));

        jLabel29.setFont(new java.awt.Font("Verdana", 0, 16)); // NOI18N
        jLabel29.setForeground(new java.awt.Color(110, 110, 110));
        jLabel29.setText("Dirección:");
        panel_final.add(jLabel29, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 220, -1, -1));

        jLabel30.setFont(new java.awt.Font("Verdana", 0, 16)); // NOI18N
        jLabel30.setForeground(new java.awt.Color(110, 110, 110));
        jLabel30.setText("Fecha nac:");
        panel_final.add(jLabel30, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 260, -1, -1));

        jLabel32.setFont(new java.awt.Font("Verdana", 0, 16)); // NOI18N
        jLabel32.setForeground(new java.awt.Color(110, 110, 110));
        jLabel32.setText("Masa corporal magra:");
        panel_final.add(jLabel32, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 300, -1, -1));

        jLabel33.setFont(new java.awt.Font("Verdana", 0, 16)); // NOI18N
        jLabel33.setForeground(new java.awt.Color(110, 110, 110));
        jLabel33.setText("Peso");
        panel_final.add(jLabel33, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 380, -1, -1));

        jLabel34.setFont(new java.awt.Font("Verdana", 0, 16)); // NOI18N
        jLabel34.setForeground(new java.awt.Color(110, 110, 110));
        jLabel34.setText("IMC:");
        panel_final.add(jLabel34, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 220, -1, -1));

        jLabel35.setFont(new java.awt.Font("Verdana", 0, 16)); // NOI18N
        jLabel35.setForeground(new java.awt.Color(110, 110, 110));
        jLabel35.setText("indice de Cintura/Altura:");
        panel_final.add(jLabel35, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 260, -1, -1));

        jLabel36.setFont(new java.awt.Font("Verdana", 0, 16)); // NOI18N
        jLabel36.setForeground(new java.awt.Color(110, 110, 110));
        jLabel36.setText("Sobrepeso");
        panel_final.add(jLabel36, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 380, -1, -1));

        jLabel37.setFont(new java.awt.Font("Verdana", 0, 16)); // NOI18N
        jLabel37.setForeground(new java.awt.Color(110, 110, 110));
        jLabel37.setText("Altura:");
        panel_final.add(jLabel37, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 100, -1, -1));

        jLabel38.setFont(new java.awt.Font("Verdana", 0, 16)); // NOI18N
        jLabel38.setForeground(new java.awt.Color(110, 110, 110));
        jLabel38.setText("Sexo");
        panel_final.add(jLabel38, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 420, -1, -1));

        jLabel39.setFont(new java.awt.Font("Verdana", 0, 16)); // NOI18N
        jLabel39.setForeground(new java.awt.Color(110, 110, 110));
        jLabel39.setText("Cuello:");
        panel_final.add(jLabel39, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 140, -1, -1));

        jLabel40.setFont(new java.awt.Font("Verdana", 0, 16)); // NOI18N
        jLabel40.setForeground(new java.awt.Color(110, 110, 110));
        jLabel40.setText("Cadera:");
        panel_final.add(jLabel40, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 460, -1, -1));

        jLabel41.setFont(new java.awt.Font("Verdana", 0, 16)); // NOI18N
        jLabel41.setForeground(new java.awt.Color(110, 110, 110));
        jLabel41.setText("Cintura:");
        panel_final.add(jLabel41, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 180, -1, -1));

        jLabel31.setFont(new java.awt.Font("Verdana", 0, 24)); // NOI18N
        jLabel31.setForeground(new java.awt.Color(51, 153, 255));
        jLabel31.setText("Datos Personales:");
        panel_final.add(jLabel31, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 40, 220, -1));

        jLabel42.setFont(new java.awt.Font("Verdana", 0, 16)); // NOI18N
        jLabel42.setForeground(new java.awt.Color(110, 110, 110));
        jLabel42.setText("Cédula:");
        panel_final.add(jLabel42, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 100, -1, -1));

        lbl_sobrepeso.setFont(new java.awt.Font("Verdana", 0, 16)); // NOI18N
        lbl_sobrepeso.setForeground(new java.awt.Color(0, 153, 255));
        lbl_sobrepeso.setText("Datos");
        panel_final.add(lbl_sobrepeso, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 380, 120, -1));

        lbl_nombre.setFont(new java.awt.Font("Verdana", 0, 16)); // NOI18N
        lbl_nombre.setForeground(new java.awt.Color(0, 153, 255));
        lbl_nombre.setText("Datos");
        panel_final.add(lbl_nombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 140, 190, -1));

        lbl_apellidos.setFont(new java.awt.Font("Verdana", 0, 16)); // NOI18N
        lbl_apellidos.setForeground(new java.awt.Color(0, 153, 255));
        lbl_apellidos.setText("Datos");
        panel_final.add(lbl_apellidos, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 180, 190, -1));

        lbl_dir.setFont(new java.awt.Font("Verdana", 0, 16)); // NOI18N
        lbl_dir.setForeground(new java.awt.Color(0, 153, 255));
        lbl_dir.setText("Datos");
        panel_final.add(lbl_dir, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 220, 210, 20));

        lbl_edad.setFont(new java.awt.Font("Verdana", 0, 16)); // NOI18N
        lbl_edad.setForeground(new java.awt.Color(0, 153, 255));
        lbl_edad.setText("Datos");
        panel_final.add(lbl_edad, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 260, 190, -1));

        lbl_peso.setFont(new java.awt.Font("Verdana", 0, 16)); // NOI18N
        lbl_peso.setForeground(new java.awt.Color(0, 153, 255));
        lbl_peso.setText("Datos");
        panel_final.add(lbl_peso, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 380, 190, -1));

        lbl_sexo.setFont(new java.awt.Font("Verdana", 0, 16)); // NOI18N
        lbl_sexo.setForeground(new java.awt.Color(0, 153, 255));
        lbl_sexo.setText("Datos");
        panel_final.add(lbl_sexo, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 420, 190, -1));

        lbl_altura.setFont(new java.awt.Font("Verdana", 0, 16)); // NOI18N
        lbl_altura.setForeground(new java.awt.Color(0, 153, 255));
        lbl_altura.setText("Datos");
        panel_final.add(lbl_altura, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 100, 100, -1));

        lbl_cuello.setFont(new java.awt.Font("Verdana", 0, 16)); // NOI18N
        lbl_cuello.setForeground(new java.awt.Color(0, 153, 255));
        lbl_cuello.setText("Datos");
        panel_final.add(lbl_cuello, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 140, 90, -1));

        lbl_cedula.setFont(new java.awt.Font("Verdana", 0, 16)); // NOI18N
        lbl_cedula.setForeground(new java.awt.Color(0, 153, 255));
        lbl_cedula.setText("Datos");
        panel_final.add(lbl_cedula, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 100, 190, -1));

        lbl_imc.setFont(new java.awt.Font("Verdana", 0, 16)); // NOI18N
        lbl_imc.setForeground(new java.awt.Color(0, 153, 255));
        lbl_imc.setText("Datos");
        panel_final.add(lbl_imc, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 220, 90, -1));

        lbl_imc_altura.setFont(new java.awt.Font("Verdana", 0, 16)); // NOI18N
        lbl_imc_altura.setForeground(new java.awt.Color(0, 153, 255));
        lbl_imc_altura.setText("Datos");
        panel_final.add(lbl_imc_altura, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 260, 90, -1));

        lbl_result_cadera.setFont(new java.awt.Font("Verdana", 0, 16)); // NOI18N
        lbl_result_cadera.setForeground(new java.awt.Color(0, 153, 255));
        lbl_result_cadera.setText("Datos");
        panel_final.add(lbl_result_cadera, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 460, 90, -1));

        lbl_tipo_membresia.setFont(new java.awt.Font("Verdana", 0, 16)); // NOI18N
        lbl_tipo_membresia.setForeground(new java.awt.Color(0, 153, 255));
        lbl_tipo_membresia.setText("Datos");
        panel_final.add(lbl_tipo_membresia, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 610, 130, -1));

        jLabel64.setFont(new java.awt.Font("Verdana", 0, 16)); // NOI18N
        jLabel64.setForeground(new java.awt.Color(110, 110, 110));
        jLabel64.setText("Tipo");
        panel_final.add(jLabel64, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 610, -1, -1));

        lbl_costo.setFont(new java.awt.Font("Verdana", 0, 16)); // NOI18N
        lbl_costo.setForeground(new java.awt.Color(0, 153, 255));
        lbl_costo.setText("Datos");
        panel_final.add(lbl_costo, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 610, 190, 20));

        jLabel66.setFont(new java.awt.Font("Verdana", 0, 16)); // NOI18N
        jLabel66.setForeground(new java.awt.Color(110, 110, 110));
        jLabel66.setText("Costo:");
        panel_final.add(jLabel66, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 610, -1, 20));

        jLabel67.setFont(new java.awt.Font("Verdana", 0, 16)); // NOI18N
        jLabel67.setForeground(new java.awt.Color(110, 110, 110));
        jLabel67.setText("Próximo pago:");
        panel_final.add(jLabel67, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 690, -1, 30));

        lbl_fecha_pago.setFont(new java.awt.Font("Verdana", 0, 16)); // NOI18N
        lbl_fecha_pago.setForeground(new java.awt.Color(0, 153, 255));
        lbl_fecha_pago.setText("Datos");
        panel_final.add(lbl_fecha_pago, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 650, 130, 30));

        lbl_prox_pago.setFont(new java.awt.Font("Verdana", 0, 16)); // NOI18N
        lbl_prox_pago.setForeground(new java.awt.Color(0, 153, 255));
        lbl_prox_pago.setText("Datos");
        panel_final.add(lbl_prox_pago, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 690, 130, 30));

        jSeparator4.setBackground(new java.awt.Color(110, 110, 110));
        panel_final.add(jSeparator4, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 410, 290, 10));

        jSeparator5.setBackground(new java.awt.Color(0, 153, 255));
        panel_final.add(jSeparator5, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 590, 290, 10));

        jSeparator6.setBackground(new java.awt.Color(110, 110, 110));
        panel_final.add(jSeparator6, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 450, 290, 10));

        jSeparator7.setBackground(new java.awt.Color(110, 110, 110));
        panel_final.add(jSeparator7, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 170, 290, 10));

        jSeparator8.setBackground(new java.awt.Color(110, 110, 110));
        panel_final.add(jSeparator8, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 210, 290, 10));

        jSeparator9.setBackground(new java.awt.Color(110, 110, 110));
        panel_final.add(jSeparator9, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 250, 290, 10));

        jSeparator10.setBackground(new java.awt.Color(110, 110, 110));
        panel_final.add(jSeparator10, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 290, 290, 10));

        jSeparator13.setBackground(new java.awt.Color(110, 110, 110));
        panel_final.add(jSeparator13, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 130, 290, 10));

        jSeparator14.setBackground(new java.awt.Color(110, 110, 110));
        panel_final.add(jSeparator14, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 170, 290, 10));

        jSeparator15.setBackground(new java.awt.Color(110, 110, 110));
        panel_final.add(jSeparator15, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 210, 290, 10));

        jSeparator16.setBackground(new java.awt.Color(110, 110, 110));
        panel_final.add(jSeparator16, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 250, 290, 10));

        jSeparator17.setBackground(new java.awt.Color(110, 110, 110));
        panel_final.add(jSeparator17, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 290, 290, 10));

        jSeparator18.setBackground(new java.awt.Color(110, 110, 110));
        panel_final.add(jSeparator18, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 330, 290, 20));

        lbl_masa_magra.setFont(new java.awt.Font("Verdana", 0, 16)); // NOI18N
        lbl_masa_magra.setForeground(new java.awt.Color(0, 153, 255));
        lbl_masa_magra.setText("Datos");
        panel_final.add(lbl_masa_magra, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 300, 100, -1));

        jSeparator19.setBackground(new java.awt.Color(0, 153, 255));
        panel_final.add(jSeparator19, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 80, 640, 10));

        jSeparator20.setBackground(new java.awt.Color(110, 110, 110));
        panel_final.add(jSeparator20, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 130, 290, 10));

        jSeparator21.setBackground(new java.awt.Color(110, 110, 110));
        panel_final.add(jSeparator21, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 640, 280, 10));

        jSeparator22.setBackground(new java.awt.Color(110, 110, 110));
        panel_final.add(jSeparator22, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 680, 280, 10));

        jSeparator23.setBackground(new java.awt.Color(110, 110, 110));
        panel_final.add(jSeparator23, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 770, 280, 10));

        jLabel74.setFont(new java.awt.Font("Verdana", 0, 16)); // NOI18N
        jLabel74.setForeground(new java.awt.Color(110, 110, 110));
        jLabel74.setText("Fecha de pago:");
        panel_final.add(jLabel74, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 650, -1, 30));

        jSeparator12.setBackground(new java.awt.Color(110, 110, 110));
        panel_final.add(jSeparator12, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 370, 290, 10));

        jLabel53.setFont(new java.awt.Font("Verdana", 0, 16)); // NOI18N
        jLabel53.setForeground(new java.awt.Color(110, 110, 110));
        jLabel53.setText("Nivel:");
        panel_final.add(jLabel53, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 740, -1, -1));

        lbl_nivel.setFont(new java.awt.Font("Verdana", 0, 16)); // NOI18N
        lbl_nivel.setForeground(new java.awt.Color(0, 153, 255));
        lbl_nivel.setText("Datos");
        panel_final.add(lbl_nivel, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 740, 120, -1));

        jSeparator24.setBackground(new java.awt.Color(110, 110, 110));
        panel_final.add(jSeparator24, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 720, 280, 10));

        jSeparator25.setBackground(new java.awt.Color(0, 153, 255));
        panel_final.add(jSeparator25, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 590, 280, 10));

        jLabel69.setBackground(new java.awt.Color(0, 153, 255));
        jLabel69.setFont(new java.awt.Font("Verdana", 0, 24)); // NOI18N
        jLabel69.setForeground(new java.awt.Color(51, 153, 255));
        jLabel69.setText("Datos de Pago:");
        panel_final.add(jLabel69, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 550, 260, 30));

        jLabel75.setFont(new java.awt.Font("Verdana", 0, 16)); // NOI18N
        jLabel75.setForeground(new java.awt.Color(110, 110, 110));
        jLabel75.setText("Rutina:");
        panel_final.add(jLabel75, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 780, -1, -1));

        lbl_rutina.setFont(new java.awt.Font("Verdana", 0, 16)); // NOI18N
        lbl_rutina.setForeground(new java.awt.Color(0, 153, 255));
        lbl_rutina.setText("Datos");
        panel_final.add(lbl_rutina, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 780, 120, -1));

        btn_atras_final.setBackground(new java.awt.Color(0, 153, 204));
        btn_atras_final.setFont(new java.awt.Font("Verdana", 0, 16)); // NOI18N
        btn_atras_final.setForeground(new java.awt.Color(255, 255, 255));
        btn_atras_final.setText("Atras");
        btn_atras_final.setBorder(null);
        btn_atras_final.setBorderPainted(false);
        btn_atras_final.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_atras_final.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_atras_finalActionPerformed(evt);
            }
        });
        panel_final.add(btn_atras_final, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 840, 100, 40));

        btn_guardar.setBackground(new java.awt.Color(0, 153, 204));
        btn_guardar.setFont(new java.awt.Font("Verdana", 0, 16)); // NOI18N
        btn_guardar.setForeground(new java.awt.Color(255, 255, 255));
        btn_guardar.setText("Guardar");
        btn_guardar.setBorder(null);
        btn_guardar.setBorderPainted(false);
        btn_guardar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_guardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_guardarActionPerformed(evt);
            }
        });
        panel_final.add(btn_guardar, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 840, 100, 40));

        jSeparator27.setBackground(new java.awt.Color(110, 110, 110));
        panel_final.add(jSeparator27, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 640, 280, 10));

        jLabel79.setFont(new java.awt.Font("Verdana", 0, 16)); // NOI18N
        jLabel79.setForeground(new java.awt.Color(110, 110, 110));
        jLabel79.setText("Total:");
        panel_final.add(jLabel79, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 650, -1, 20));

        lbl_total.setFont(new java.awt.Font("Verdana", 0, 16)); // NOI18N
        lbl_total.setForeground(new java.awt.Color(0, 153, 255));
        lbl_total.setText("Datos");
        panel_final.add(lbl_total, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 650, 190, 20));

        jLabel43.setFont(new java.awt.Font("Verdana", 0, 16)); // NOI18N
        jLabel43.setForeground(new java.awt.Color(110, 110, 110));
        jLabel43.setText("Grasa corporal:");
        panel_final.add(jLabel43, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 340, -1, -1));

        lbl_grasa.setFont(new java.awt.Font("Verdana", 0, 16)); // NOI18N
        lbl_grasa.setForeground(new java.awt.Color(0, 153, 255));
        lbl_grasa.setText("Datos");
        panel_final.add(lbl_grasa, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 340, 120, -1));

        jLabel44.setFont(new java.awt.Font("Verdana", 0, 16)); // NOI18N
        jLabel44.setForeground(new java.awt.Color(110, 110, 110));
        jLabel44.setText("Telefono:");
        panel_final.add(jLabel44, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 300, -1, -1));

        lbl_telefono.setFont(new java.awt.Font("Verdana", 0, 16)); // NOI18N
        lbl_telefono.setForeground(new java.awt.Color(0, 153, 255));
        lbl_telefono.setText("Datos");
        panel_final.add(lbl_telefono, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 300, 170, -1));

        jSeparator26.setBackground(new java.awt.Color(110, 110, 110));
        panel_final.add(jSeparator26, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 370, 290, 10));

        jLabel45.setFont(new java.awt.Font("Verdana", 0, 16)); // NOI18N
        jLabel45.setForeground(new java.awt.Color(110, 110, 110));
        jLabel45.setText("Celular:");
        panel_final.add(jLabel45, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 340, -1, -1));

        lbl_celular.setFont(new java.awt.Font("Verdana", 0, 16)); // NOI18N
        lbl_celular.setForeground(new java.awt.Color(0, 153, 255));
        lbl_celular.setText("datos");
        panel_final.add(lbl_celular, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 340, 190, -1));

        jSeparator29.setBackground(new java.awt.Color(110, 110, 110));
        panel_final.add(jSeparator29, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 330, 290, 10));

        spanel_finales.setViewportView(panel_final);

        panelPrincipal.addTab("Datos finales", spanel_finales);

        panel_final1.setBackground(new java.awt.Color(250, 250, 250));
        panel_final1.setPreferredSize(new java.awt.Dimension(800, 900));
        panel_final1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel46.setFont(new java.awt.Font("Verdana", 0, 24)); // NOI18N
        jLabel46.setForeground(new java.awt.Color(51, 153, 255));
        jLabel46.setText("Imprimir");
        panel_final1.add(jLabel46, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 40, 120, -1));

        jSeparator28.setBackground(new java.awt.Color(0, 153, 255));
        panel_final1.add(jSeparator28, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 80, 330, 10));

        jButton1.setBackground(new java.awt.Color(0, 153, 204));
        jButton1.setFont(new java.awt.Font("Verdana", 0, 16)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Imprimir");
        jButton1.setBorder(null);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        panel_final1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 110, 160, 60));

        panelPrincipal.addTab("Imprimir", panel_final1);

        getContentPane().add(panelPrincipal, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 991, 958));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cbo_monthActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbo_monthActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbo_monthActionPerformed

    private void cbo_yearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbo_yearActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbo_yearActionPerformed

    private void radio_masculinoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radio_masculinoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_radio_masculinoActionPerformed

    private void txt_telefonoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_telefonoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_telefonoActionPerformed

    private void cbo_nivelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbo_nivelActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbo_nivelActionPerformed

    
  
    
    
    
/*---------------------------------------------------------------------------------------------------------------
    metodo para saber que seleciona del combo box mwebresia el usuario y poder cargar el costo de la misma
 --------------------------------------------------------------------------------------------------------------*/
    private void cbo_membresiaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbo_membresiaActionPerformed
        if(cbo_membresia.getSelectedIndex() > 0){
            
            try{
                sql = "select costo from tipo where tipo = '"+cbo_membresia.getSelectedItem().toString()+"'";
                                
                ps = conexion.prepareStatement(sql);
                rs = ps.executeQuery();
                  if(rs.next()){
                        txt_costo.setText(String.valueOf(rs.getFloat("costo")));
                        txt_total_pagar.setText(String.valueOf(rs.getFloat("costo")));
                        
                        if(cbo_membresia.getSelectedItem().toString().equals("Especial")){
                           lbl_dias.setVisible(true);
                           txt_dias.setVisible(true);
                           txt_total_pagar.setText("");
                           txt_prox_pago.setText("");
                           txt_dias.setText("");
                           txt_dias.requestFocus();
                           
                        }else{
                           lbl_dias.setVisible(false);
                           txt_dias.setVisible(false);
                        }
                       cargarProxPago(); 
                    }
              
               }catch(Exception ex){
                   JOptionPane.showMessageDialog(rootPane, ex.getMessage());
                }  
            //JOptionPane.showMessageDialog(rootPane, "elegiste la membresia "  + cbo_membresia.getSelectedItem().toString());        // TODO add your handling code here:        
        }else{
            txt_dias.setText("");
            txt_costo.setText("");
            txt_prox_pago.setText("");
            txt_total_pagar.setText("");
        
        } 
        
        
    }//GEN-LAST:event_cbo_membresiaActionPerformed

    
    
    
/*---------------------------------------------------------------------------------------------------------------
    metodo obtener mes del cbo_month de la interfaz membresia
 --------------------------------------------------------------------------------------------------------------*/     
    private void cbo_month1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbo_month1ActionPerformed
       
      cargarProxPago();
    }//GEN-LAST:event_cbo_month1ActionPerformed

    
    
    
/*---------------------------------------------------------------------------------------------------------------
    metodo obtener mes del cbo años de la interfaz membresia
 --------------------------------------------------------------------------------------------------------------*/  
    private void cbo_years1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbo_years1ActionPerformed
      cargarProxPago();     
      
    }//GEN-LAST:event_cbo_years1ActionPerformed

    
    
    
    
    private void btn_volverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_volverActionPerformed
        Home frm_home = new Home();
        frm_home.setVisible(true);
        dispose();
              
    }//GEN-LAST:event_btn_volverActionPerformed

    
    
    
  /*---------------------------------------------------------------------------------
    metodo para el boton agregar usuario
 -------------------------------------------------------------------------------------*/
    
    private void btn_siguienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_siguienteActionPerformed
               
            cedula = Validar.quitarEspaciosEnBlanco(txt_cedula);
            nombres= Validar.quitarEspaciosEnBlanco(txt_nombres);
            apellidos= Validar.quitarEspaciosEnBlanco(txt_apellidos);
            
            //quitamos espacios al inicio y al final de la cadena
            dir = txt_dir.getText();
            telefono=Validar.quitarEspaciosEnBlanco(txt_telefono);
            celular=Validar.quitarEspaciosEnBlanco(txt_celular);
            //verificar telefono
            
            
      
        /*dato importantisimoooooo jajaja por lo simple que es y lo mucho que demore en descubirlo el cadenaTexto.trim().length() > 0   en las cadenas verifica
         que asi se ponga espacios en blanco en una cadena  nos dara 0  por el contrario devolvera el largo de la cadena ya que si solo ponemos  cadenaTextp.lenght( )> 0 con
        espacios en blanco falla y nos devuelve el numero de caracteres en blanco que ingresemos */

        if(  cedula.length() > 0 && nombres.length() >  0 && apellidos.length() > 0 
        && dir.trim().length() > 0  && telefono.length() > 0  && celular.length() > 0)
        {

            
            if(!nombres.matches("[A-Z-áéíóúÁÉÍÓÚ][a-zA-Z-áéíóúÁÉÍÓÚ]*\\D{2}")){
                 JOptionPane.showMessageDialog(rootPane, "El nombre debe Empezar con mayúsculas y tener minimo 3 caracteres");
                 txt_nombres.setText("");
                 txt_nombres.requestFocus();
                
            }else if(!apellidos.matches("[A-Z-áéíóúÁÉÍÓÚ][a-zA-Z-áéíóúÁÉÍÓÚ]*\\D{2}")){
                 JOptionPane.showMessageDialog(rootPane, "El apellido debe Empezar con mayúsculas y tener minimo 3 caracteres");
                 txt_apellidos.setText("");
                 txt_apellidos.requestFocus();
                 
            }else if(telefono.length() < 7){
                  JOptionPane.showMessageDialog(rootPane, "Número de telefono incorrecto");
                 txt_telefono.setText("");
                 txt_telefono.requestFocus();
                 
            }else if(celular.length() < 10){
                JOptionPane.showMessageDialog(rootPane, "Número de ceular incorrecto");
                txt_celular.setText("");
                txt_celular.requestFocus();
                
            }else{
                
                 //para guargar los que tenga en el combo
                    if(this.radio_masculino.isSelected()){
                        cliente.setSexo( radio_masculino.getText());

                    }else{
                        cliente.setSexo( radio_femenino.getText());
                    }

                    //fecha
                    String day2,month2,year2;
                    day2 = this.cbo_day.getSelectedItem().toString();
                    month2 = String.valueOf(this.cbo_month.getSelectedIndex() + 1);
                    year2 = this.cbo_year.getSelectedItem().toString();
                    
 
                  if(Validar.Numero(cedula) && Validar.VerificarCedula(cedula) && !cedula.equals("2222222222")){
                      
                        try {
                            sql = "select * from clientes where cedula = "+cedula+"";
                            ps = conexion.prepareStatement(sql);
                            rs = ps.executeQuery(sql);
                            
                            if(rs.next()){
                                 JOptionPane.showMessageDialog(rootPane, "El cliente con la cedula "+ rs.getString("cedula") + " ya existe");
                            
                            }else{
                            
                                cliente.setCi(Integer.parseInt(cedula));
                                cliente.setNombres(nombres);
                                cliente.setApellidos(apellidos);
                                cliente.setDir(dir.trim());
                                cliente.setFechaNacimiento(year2 + "-" + month2 + "-" + day2);
                                cliente.setTelefono(telefono);
                                cliente.setCelular(celular);

                                //para mostra la caja cadera solo si sexp es femenino
                                if(cliente.getSexo().equals("Femenino")){
                                    lbl_cadera.setVisible(true);
                                    txt_cadera.setVisible(true);
                                  }else{
                                    lbl_cadera.setVisible(false);
                                    txt_cadera.setVisible(false);
                                  }

                                //JOptionPane.showMessageDialog(rootPane, "Todo ok " + cliente.getFechaNacimiento() +"  "+ cliente.getSexo() + " " + cliente.getDir());
                                //JOptionPane.showMessageDialog(rootPane, "Datos ingresados conexito");
                               
                                this.panelPrincipal.setEnabledAt(0, false);
                                this.panelPrincipal.setEnabledAt(1, true);
                                this.panelPrincipal.setSelectedIndex(1);
                                
                                
                               
                                 //panelPrincipal.setSelectedIndex(0);
 
                            }//fin de if par comprobar que no exista ya la cedula que se queire guardar
                            
                        } catch (SQLException ex) {
                           JOptionPane.showMessageDialog(rootPane, ex.getMessage());
                        }
                    
                  }else{
                      
                      JOptionPane.showMessageDialog(rootPane, "cedula incorrecta");
                      txt_cedula.setText("");
                      txt_cedula.requestFocus();
                  }//find del if y else para verficar que la cedula sea correcta
          
            }//find del if y else para verficar nombres,apellidos,telefonos
            
        }else{
            JOptionPane.showMessageDialog(rootPane, "Llene todos los campos");
        }//find del if y else para verficar que esten llenos todos los campos
           
    }//GEN-LAST:event_btn_siguienteActionPerformed

    

    
    
    
    
/*---------------------------------------------------------------------------------
    metodo para el boto limpiar
 -------------------------------------------------------------------------------------*/
    private void btn_limpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_limpiarActionPerformed
       limpiar();
       this.txt_cedula.requestFocus();
    }//GEN-LAST:event_btn_limpiarActionPerformed

    
    
    
    
   /*---------------------------------------------------------------------------------
    metodo para cancelar
 -------------------------------------------------------------------------------------*/
    private void btn_cancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_cancelarActionPerformed
        
        int confirm;
        
        confirm = JOptionPane.showConfirmDialog(rootPane, "Esta seguro que desea cancelar accion");
        
        if(confirm == JOptionPane.YES_OPTION){
        limpiar();
        Home frm_home = new Home();
        frm_home.setVisible(true);
        dispose();
        }
        
    }//GEN-LAST:event_btn_cancelarActionPerformed

    
    
    
/*---------------------------------------------------------------------------------
    para no permitir letras en la caja de texto de cedula
 -------------------------------------------------------------------------------------*/
    private void txt_cedulaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_cedulaKeyTyped
        
              Validar.soloNumeros(evt);
    }//GEN-LAST:event_txt_cedulaKeyTyped

    private void txt_nombresKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_nombresKeyTyped
        Validar.soloLetrasAcentos(evt);
    }//GEN-LAST:event_txt_nombresKeyTyped

    private void txt_apellidosKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_apellidosKeyTyped
         Validar.soloLetrasAcentos(evt);
    }//GEN-LAST:event_txt_apellidosKeyTyped

    private void txt_telefonoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_telefonoKeyTyped
         Validar.soloNumeros(evt);
    }//GEN-LAST:event_txt_telefonoKeyTyped

    private void txt_celularKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_celularKeyTyped
          Validar.soloNumeros(evt);
    }//GEN-LAST:event_txt_celularKeyTyped

    
    
    

    private void txt_diasKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_diasKeyTyped
         
        
        Validar.soloNumeros(evt);
         
         
          //JOptionPane.showMessageDialog(rootPane, "Datos ingresados conexito");
                  
    }//GEN-LAST:event_txt_diasKeyTyped


    


/*-------------------------------------------------------------------------------------
    metodo para el boton siguiente2 que sirve para guardar datos de la membresia y pago
 -------------------------------------------------------------------------------------*/

    private void btn_siguiente2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_siguiente2ActionPerformed
       
      if(txt_costo.getText().length() >  0 && txt_prox_pago.getText().length() > 0 && txt_total_pagar.getText().length() > 0){
          
        
       
       month = String.valueOf(this.cbo_month1.getSelectedIndex() + 1);
       
       String mem = cbo_membresia.getSelectedItem().toString(); 
       float costo = Float.parseFloat(txt_costo.getText());
       float total = Float.parseFloat(txt_total_pagar.getText());
       String fecha_inicio = cbo_years1.getSelectedItem().toString() +"-"+ String.valueOf(this.cbo_month1.getSelectedIndex() + 1) + "-"+cbo_days1.getSelectedItem().toString();
       
       fecha_inicio2 = cbo_days1.getSelectedItem().toString() + "/"+String.valueOf(this.cbo_month1.getSelectedIndex() + 1) + "/"+cbo_years1.getSelectedItem().toString();
       
     
        
       if(!mem.equals("Especial") && txt_costo.toString().length() > 0 
         && txt_total_pagar.toString().length() > 0 && !fecha_inicio.equals("") 
         && cbo_membresia.getSelectedIndex() > 0){
                   
           try{
                 sql = "select id_tipo from tipo where tipo = '"+mem+"'";
                 
                 
                 ps = conexion.prepareStatement(sql);
                 rs = ps.executeQuery(sql);
                 
                if(rs.next())
                    membresia.setIdTipoMembresia(rs.getInt("id_tipo"));
                    
                }catch(Exception ex){
                     JOptionPane.showMessageDialog(rootPane, ex.getMessage());
                 }
           
                              
               membresia.setFechaInicio(fecha_inicio);
                membresia.setFechaFin(fecha_fin);
                membresia.setAsistencias(0);
                membresia.setDiasTotal(0);
                
                pagos.setCosto(costo);
                pagos.setTotal(total);
                
                
               //JOptionPane.showMessageDialog(rootPane, membresia.getIdTipoMembresia() +" - "+ membresia.getFechaInicio() +" - "+ membresia.getFechaFin());
                this.panelPrincipal.setEnabledAt(1, false);
                this.panelPrincipal.setEnabledAt(2, true);
                panelPrincipal.setSelectedIndex(2);         

                
           
       }else if(mem.equals("Especial") && txt_costo.toString().length() > 0 
         && txt_total_pagar.toString().length() > 0 && !fecha_inicio.equals("") 
         && cbo_membresia.getSelectedIndex() > 0 && txt_dias.getText().toString().length() > 0 &&  Integer.parseInt(txt_dias.getText()) >  0
         && !txt_total_pagar.getText().equals("")){
           
          try{
                 sql = "select id_tipo from tipo where tipo = '"+mem+"'";
                 ps = conexion.prepareStatement(sql);
                 rs = ps.executeQuery(sql);
                 
                if(rs.next())
                    membresia.setIdTipoMembresia(rs.getInt("id_tipo"));
                }catch(Exception ex){
                     JOptionPane.showMessageDialog(rootPane, ex.getMessage());
                 }
          
                 
                membresia.setFechaInicio(fecha_inicio);
                membresia.setFechaFin(null);
                membresia.setAsistencias(0);
                membresia.setDiasTotal(Integer.parseInt(txt_dias.getText()));
                
                pagos.setCosto(costo);
                pagos.setTotal(total);

                this.panelPrincipal.setEnabledAt(1, false);
                this.panelPrincipal.setEnabledAt(2, true);
                panelPrincipal.setSelectedIndex(2);  

                JOptionPane.showMessageDialog(rootPane, membresia.getIdTipoMembresia() +" - "+ membresia.getFechaInicio() +" - "+ membresia.getFechaFin()+ membresia.getDiasTotal());
       
       }else{
           JOptionPane.showMessageDialog(rootPane, "Escoge una membresia y llena todos los campos");
       }
  
      }else{
               JOptionPane.showMessageDialog(rootPane, "Llena todos losc campos para continuar");
      
      }
        
    }//GEN-LAST:event_btn_siguiente2ActionPerformed

    
    
    
    
    
    
/*---------------------------------------------------------------------------------
   para obtener fechas e los cbo
 -------------------------------------------------------------------------------------*/    
 
    private void cbo_days1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbo_days1ActionPerformed
       
       cargarProxPago();
    }//GEN-LAST:event_cbo_days1ActionPerformed


    
    
/*---------------------------------------------------------------------------------
   para obtener fechas de los cbo
 -------------------------------------------------------------------------------------*/    
    private void btn_atrasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_atrasActionPerformed
        this.panelPrincipal.setEnabledAt(1,false);
        this.panelPrincipal.setEnabledAt(0,true);
        panelPrincipal.setSelectedIndex(0);                  
           
       
    }//GEN-LAST:event_btn_atrasActionPerformed

    
    
    
    
/*-------------------------------------------------------------------------------------
       METODO CON EVENTO KEYRELEASED PARA CALCULAR VALOR A PAGAR EN MEBRESIA ESPECIAL
 -------------------------------------------------------------------------------------*/  
    private void txt_diasKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_diasKeyReleased
         if(!txt_dias.getText().equals("") && Integer.parseInt(txt_dias.getText()) > 0){
             
            float total;
            total =  Float.parseFloat(txt_costo.getText()) * Float.parseFloat(txt_dias.getText());
            this.txt_prox_pago.setText("Hasta agotar los " + txt_dias.getText() + " contratados");
            this.txt_total_pagar.setText(String.valueOf(total ));
            
    
            }
         else{
                this.txt_total_pagar.setText("");
                this.txt_prox_pago.setText("");
         }
    }//GEN-LAST:event_txt_diasKeyReleased

    
    
    
    
 /*-------------------------------------------------------------------------------------
       METODO LIMPIAR BOTONES
 -------------------------------------------------------------------------------------*/    
    private void btn_limpiar42ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_limpiar42ActionPerformed
        
        cbo_membresia.setSelectedIndex(0);
        txt_costo.setText("");
        txt_prox_pago.setText("");
        lbl_dias.setVisible(false);
        txt_dias.setVisible(false);
    }//GEN-LAST:event_btn_limpiar42ActionPerformed

    
    
    
    
    
 /*-------------------------------------------------------------------------------------
       METODO SIGUIENTE 3 PARA GUARDAR LOS DATOS DE FICHA
 -------------------------------------------------------------------------------------*/  
    private void btn_siguiente3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_siguiente3ActionPerformed
     
        
            
          if(cliente.getSexo().equals("Femenino") && cliente.getSexo().length() > 0){
            
                 if( txt_peso.getText().length() > 0  && txt_altura.getText().length() > 0 && txt_cintura.getText().length() > 0 &&
                     txt_cuello.getText().length() > 0 &&  txt_cadera.getText().length() > 0) {
        
                        double altura = Double.parseDouble(this.txt_altura.getText());
                        double peso = Double.parseDouble(this.txt_peso.getText());
                        double cintura = Double.parseDouble(this.txt_cintura.getText());
                        double cuello = Double.parseDouble(this.txt_cuello.getText());
                        double cadera = Double.parseDouble(this.txt_cadera.getText());
                    
                           if(peso > 0 && altura > 0 && cintura > 0 && cuello > 0 && cadera > 0){
                               
                              
                          
                               ficha.setAltura(altura);
                               ficha.setPeso(peso);
                               ficha.setCintura(cintura);
                               ficha.setCuello(cuello);
                               ficha.setCadera(cadera);
                               ficha.setNivel(cbo_nivel.getSelectedItem().toString());
                               
                               
                               
                               
                               /*--------------------------------------------------------------------------
                                para pasar  todos los datos al formulario final para confirmar y gurdar
                               ------------------------------------------------------------------------------*/
                               lbl_cedula.setText(String.valueOf(cliente.getCi()));
                               lbl_nombre.setText(cliente.getNombres());
                               lbl_apellidos.setText(cliente.getApellidos());
                               lbl_dir.setText(cliente.getDir());
                               lbl_edad.setText(cliente.getFechaNacimiento());
                               lbl_telefono.setText(cliente.getTelefono());
                               lbl_celular.setText(cliente.getCelular());
                               lbl_peso.setText(String.valueOf(ficha.getPeso()));
                               lbl_sexo.setText(cliente.getSexo());
                               lbl_result_cadera.setText(String.valueOf(ficha.getCadera())+" cm");
                               
                               lbl_altura.setText(String.valueOf(ficha.getAltura())+" cm");
                               lbl_cuello.setText(String.valueOf(ficha.getCuello())+" cm");
                               lbl_cintura.setText(String.valueOf(ficha.getCintura())+" cm");
                               lbl_imc.setText(String.valueOf(ficha.imc())+"%");
                               lbl_imc_altura.setText(String.valueOf(ficha.indice_cintura_Altura())+"%");
                               lbl_grasa.setText(String.valueOf(ficha.grasaCorporal(cliente.getSexo()))+" %");
                               lbl_masa_magra.setText(String.valueOf(ficha.masaMagra())+" Kg");
                               lbl_sobrepeso.setText(String.valueOf(ficha.sobrePeso())+" Kg");
                             
                               
                               
                               //datos de memebresia
                               lbl_tipo_membresia.setText(cbo_membresia.getSelectedItem().toString());
                               lbl_fecha_pago.setText(fecha_inicio2);
                               lbl_prox_pago.setText(this.txt_prox_pago.getText());
                               lbl_nivel.setText(ficha.getNivel());
                               
                               //para ingresar el id de rutina
                                rutinas.SetIdRutina(cbo_nivel.getSelectedItem().toString());
                               lbl_rutina.setText(String.valueOf(rutinas.getIdRutina()));
                               
                               //datos de pago
                               lbl_costo.setText(String.valueOf("$" +pagos.getCosto())+" dólares");
                               lbl_total.setText(String.valueOf("$"+pagos.getTotal())+" dólares");
                               
                               
                               //JOptionPane.showMessageDialog(null, "id_rutina:" + rutinas.getIdRutina());

                               
                               
                               //para enviarlos a la siguiente pestaña
                                this.panelPrincipal.setEnabledAt(2, false);
                                this.panelPrincipal.setEnabledAt(3, true);
                                panelPrincipal.setSelectedIndex(3); 
                               
                               
                               /*-----------------------prueba--------------------------------------
                                    double imc = ficha.imc();
                                    double indice= ficha.indice_cintura_Altura();
                                    double grasa =ficha.grasaCorporal(cliente.getSexo());
                                    double masa =ficha.masaMagra();
                                    double sobrepeso = ficha.sobrePeso();
                
                                 JOptionPane.showMessageDialog(null, "tu imc:" + imc + " indice: " +indice+ " grasaCorporal: " +grasa + " Masa Magra: "+ masa + " sobrepeso: " + sobrepeso);
                               -----------------------fin prueba--------------------------------------*/

                           }else{
                               JOptionPane.showMessageDialog(rootPane, "Ingrese números mayores a cero");
                           }//fin del segundo if para verificar numeros mayores a cero
                    
                }else{
                      JOptionPane.showMessageDialog(rootPane, "Llene toos los campos");
                 }//fin del segundo if para verificar que llene todos los campos
        
            }else if(cliente.getSexo().equals("Masculino") && cliente.getSexo().length() > 0){
                   if( txt_peso.getText().length() > 0  && txt_altura.getText().length() > 0 && txt_cintura.getText().length() > 0 &&
                     txt_cuello.getText().length() > 0) {
        
                        double peso = Double.parseDouble(this.txt_peso.getText());
                        double altura = Double.parseDouble(this.txt_altura.getText());
                        double cintura = Double.parseDouble(this.txt_cintura.getText());
                        double cuello = Double.parseDouble(this.txt_cuello.getText());
                                            
                           if(peso > 0 && altura > 0 && cintura > 0 && cuello > 0 ){
                                                          
                               ficha.setAltura(altura);
                               ficha.setPeso(peso);
                               ficha.setCintura(cintura);
                               ficha.setCuello(cuello);
                               ficha.setNivel(cbo_nivel.getSelectedItem().toString());
                               
                               /*--------------------------------------------------------------------------
                                para pasar  todos los datos al formulario final para confirmar y gurdar
                               ------------------------------------------------------------------------------*/
                               lbl_cedula.setText(String.valueOf(cliente.getCi()));
                               lbl_nombre.setText(cliente.getNombres());
                               lbl_apellidos.setText(cliente.getApellidos());
                               lbl_dir.setText(cliente.getDir());
                               lbl_edad.setText(cliente.getFechaNacimiento());
                               lbl_telefono.setText(cliente.getTelefono());
                               lbl_celular.setText(cliente.getCelular());
                               lbl_peso.setText(String.valueOf(ficha.getPeso()));
                               lbl_sexo.setText(cliente.getSexo());
                               lbl_result_cadera.setText(String.valueOf(ficha.getCadera())+"cm");
                               
                               lbl_altura.setText(String.valueOf(ficha.getAltura())+"cm");
                               lbl_cuello.setText(String.valueOf(ficha.getCuello())+"cm");
                               lbl_cintura.setText(String.valueOf(ficha.getCintura())+"cm");
                               lbl_imc.setText(String.valueOf(ficha.imc())+"%");
                               lbl_imc_altura.setText(String.valueOf(ficha.indice_cintura_Altura())+" %");
                               lbl_grasa.setText(String.valueOf(ficha.grasaCorporal(cliente.getSexo()))+" %");
                               lbl_masa_magra.setText(String.valueOf(ficha.masaMagra())+" Kg");
                               lbl_sobrepeso.setText(String.valueOf(ficha.sobrePeso())+" Kg");
                               
                               
                               
                               
                               //datos de memebresia
                               lbl_tipo_membresia.setText(cbo_membresia.getSelectedItem().toString());
                               lbl_fecha_pago.setText(fecha_inicio2);
                               lbl_prox_pago.setText(this.txt_prox_pago.getText());
                               lbl_nivel.setText(ficha.getNivel());
                               
                               //para ingresar el id de rutina
                                rutinas.SetIdRutina(cbo_nivel.getSelectedItem().toString());
                               lbl_rutina.setText(String.valueOf(rutinas.getIdRutina()));
                               
                               //datos de pago
                               lbl_costo.setText(String.valueOf(pagos.getCosto())+"$ dólares");
                               lbl_total.setText(String.valueOf(pagos.getTotal())+"$ dólares");
                               
                                this.panelPrincipal.setEnabledAt(2, false);
                                this.panelPrincipal.setEnabledAt(3, true);
                                panelPrincipal.setSelectedIndex(3); 
                               
                               /*-----------------------prueba--------------------------------------
                                    double imc = ficha.imc();
                                    double indice= ficha.indice_cintura_Altura();
                                    double grasa =ficha.grasaCorporal(cliente.getSexo());
                                    double masa =ficha.masaMagra();
                                    double sobrepeso = ficha.sobrePeso();
                
                                 JOptionPane.showMessageDialog(null, "tu imc:" + imc + " indice: " +indice+ " grasaCorporal: " +grasa + " Masa Magra: "+ masa + " sobrepeso: " + sobrepeso);
                               -----------------------fin prueba--------------------------------------*/

                           }else{
                               JOptionPane.showMessageDialog(rootPane, "Ingrese números mayores a cero");
                           }//fin del segundo if para verificar numeros mayores a cero
                    
                }else{
                      JOptionPane.showMessageDialog(rootPane, "Llene toos los campos");
                 }//fin del segundo if para verificar que llene todos los campos
            
            
            }else{
               JOptionPane.showMessageDialog(rootPane, "Asegurese de haber llenado su datos personales antes");
          }//fin del  primer if para verificar que el sexo del cliente este lleno
     
    }//GEN-LAST:event_btn_siguiente3ActionPerformed

    
    
    
/*-------------------------------------------------------------------------------------
       METODO SIGUIENTE 3 PARA GUARDAR LOS DATO DE FICHA
 -------------------------------------------------------------------------------------*/      
    
    private void btn_limpiar3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_limpiar3ActionPerformed
        this.txt_peso.setText("");
        this.txt_altura.setText("");
        this.txt_cintura.setText("");
        this.txt_cuello.setText("");
        this.txt_cadera.setText("");
        this.txt_peso.requestFocus();
        
    }//GEN-LAST:event_btn_limpiar3ActionPerformed

    
    
    
    
    
    
    private void txt_pesoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_pesoKeyTyped
            Validar.soloNumeros(evt);
    }//GEN-LAST:event_txt_pesoKeyTyped

    private void txt_alturaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_alturaKeyTyped
            Validar.soloNumeros(evt);
    }//GEN-LAST:event_txt_alturaKeyTyped

    private void txt_cinturaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_cinturaKeyTyped
            Validar.soloNumeros(evt);
    }//GEN-LAST:event_txt_cinturaKeyTyped

    private void txt_cuelloKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_cuelloKeyTyped
            Validar.soloNumeros(evt);
    }//GEN-LAST:event_txt_cuelloKeyTyped

    private void txt_caderaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_caderaKeyTyped
      Validar.soloNumeros(evt);
    }//GEN-LAST:event_txt_caderaKeyTyped

    private void btn_atras2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_atras2ActionPerformed
        this.panelPrincipal.setEnabledAt(2,false);
        this.panelPrincipal.setEnabledAt(1,true);
        panelPrincipal.setSelectedIndex(1);   
    }//GEN-LAST:event_btn_atras2ActionPerformed

    private void btn_atras_finalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_atras_finalActionPerformed
        this.panelPrincipal.setEnabledAt(3,false);
        this.panelPrincipal.setEnabledAt(2,true);
        panelPrincipal.setSelectedIndex(2);   
    }//GEN-LAST:event_btn_atras_finalActionPerformed

    
    
    
    
    
    private void btn_guardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_guardarActionPerformed
    
        if(cliente.SetCliente() && membresia.setMembresia(cliente.getCi())){
           //para traer el id de membresia
                try{
                    sql = "select id_membresia from membresia where cedula = '"+cliente.getCi()+"'";
                    ps = conexion.prepareStatement(sql);
                    rs = ps.executeQuery(sql);
                    
                 if(rs.next())
                    pagos.setIdMembresia(rs.getInt("id_membresia"));
                    
                  }catch(Exception ex){
                     JOptionPane.showMessageDialog(rootPane, ex.getMessage());
                 }
                pagos.setPago(cliente.getCi());
                ficha.setFicha(cliente.getCi(),rutinas.getIdRutina(), cliente.getSexo());
                
                JOptionPane.showMessageDialog(rootPane, "Cliente Ingresado con éxito");
                this.panelPrincipal.setEnabledAt(3,false);
                this.panelPrincipal.setEnabledAt(4,true);
                panelPrincipal.setSelectedIndex(4);
           
          
           
       }else{
           JOptionPane.showMessageDialog(rootPane, "algo falló");
          
       }
    }//GEN-LAST:event_btn_guardarActionPerformed

    private void txt_diasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_diasActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_diasActionPerformed

    private void txt_diasInputMethodTextChanged(java.awt.event.InputMethodEvent evt) {//GEN-FIRST:event_txt_diasInputMethodTextChanged
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_diasInputMethodTextChanged

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        
        //Aquí imprimimos el reporte
        Reportes reporte_cliente = new Reportes();
        reporte_cliente.resportesPDF2(String.valueOf(cliente.getCi()));//llamanos al metodo y le enciamos el parametro cedula del cliente
        
        
        int confirm = JOptionPane.showConfirmDialog(rootPane, "¿Desea registrar otro cliente?");

           if(confirm == JOptionPane.YES_OPTION){
                this.panelPrincipal.setEnabledAt(4,false);
                this.panelPrincipal.setEnabledAt(0,true);
                panelPrincipal.setSelectedIndex(0);
                
                //para limpiar las cajas de texto
                limpiar();
                cbo_membresia.setSelectedIndex(0);
                txt_costo.setText("");
                txt_prox_pago.setText("");
                lbl_dias.setVisible(false);
                txt_dias.setVisible(false);
                this.txt_peso.setText("");
                this.txt_altura.setText("");
                this.txt_cintura.setText("");
                this.txt_cuello.setText("");
                this.txt_cadera.setText("");
                this.txt_cedula.requestFocus();
               
                
           }else if(confirm == JOptionPane.NO_OPTION || confirm == JOptionPane.CANCEL_OPTION){
              
               Home home = new Home();
               home.setVisible(true);
               dispose();
               
           }
    }//GEN-LAST:event_jButton1ActionPerformed

    
    
    
    
    
  
    public static void main(String args[]) {
        
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Form_clientes().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_atras;
    private javax.swing.JButton btn_atras2;
    private javax.swing.JButton btn_atras_final;
    private javax.swing.JButton btn_cancelar;
    private javax.swing.JButton btn_guardar;
    private javax.swing.JButton btn_limpiar;
    private javax.swing.JButton btn_limpiar3;
    private javax.swing.JButton btn_limpiar42;
    private javax.swing.JButton btn_siguiente;
    private javax.swing.JButton btn_siguiente2;
    private javax.swing.JButton btn_siguiente3;
    private javax.swing.JButton btn_volver;
    private javax.swing.ButtonGroup buttonGroup_sexo;
    private javax.swing.JComboBox cbo_day;
    private javax.swing.JComboBox cbo_days1;
    private javax.swing.JComboBox cbo_membresia;
    private javax.swing.JComboBox cbo_month;
    private javax.swing.JComboBox cbo_month1;
    private javax.swing.JComboBox cbo_nivel;
    private javax.swing.JComboBox cbo_year;
    private javax.swing.JComboBox cbo_years1;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel38;
    private javax.swing.JLabel jLabel39;
    private javax.swing.JLabel jLabel40;
    private javax.swing.JLabel jLabel41;
    private javax.swing.JLabel jLabel42;
    private javax.swing.JLabel jLabel43;
    private javax.swing.JLabel jLabel44;
    private javax.swing.JLabel jLabel45;
    private javax.swing.JLabel jLabel46;
    private javax.swing.JLabel jLabel52;
    private javax.swing.JLabel jLabel53;
    private javax.swing.JLabel jLabel56;
    private javax.swing.JLabel jLabel57;
    private javax.swing.JLabel jLabel59;
    private javax.swing.JLabel jLabel60;
    private javax.swing.JLabel jLabel64;
    private javax.swing.JLabel jLabel66;
    private javax.swing.JLabel jLabel67;
    private javax.swing.JLabel jLabel69;
    private javax.swing.JLabel jLabel71;
    private javax.swing.JLabel jLabel72;
    private javax.swing.JLabel jLabel74;
    private javax.swing.JLabel jLabel75;
    private javax.swing.JLabel jLabel79;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator10;
    private javax.swing.JSeparator jSeparator12;
    private javax.swing.JSeparator jSeparator13;
    private javax.swing.JSeparator jSeparator14;
    private javax.swing.JSeparator jSeparator15;
    private javax.swing.JSeparator jSeparator16;
    private javax.swing.JSeparator jSeparator17;
    private javax.swing.JSeparator jSeparator18;
    private javax.swing.JSeparator jSeparator19;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator20;
    private javax.swing.JSeparator jSeparator21;
    private javax.swing.JSeparator jSeparator22;
    private javax.swing.JSeparator jSeparator23;
    private javax.swing.JSeparator jSeparator24;
    private javax.swing.JSeparator jSeparator25;
    private javax.swing.JSeparator jSeparator26;
    private javax.swing.JSeparator jSeparator27;
    private javax.swing.JSeparator jSeparator28;
    private javax.swing.JSeparator jSeparator29;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JSeparator jSeparator6;
    private javax.swing.JSeparator jSeparator7;
    private javax.swing.JSeparator jSeparator8;
    private javax.swing.JSeparator jSeparator9;
    private javax.swing.JLabel lbl_altura;
    private javax.swing.JLabel lbl_apellidos;
    private javax.swing.JLabel lbl_cadera;
    private javax.swing.JLabel lbl_cedula;
    private javax.swing.JLabel lbl_celular;
    private javax.swing.JLabel lbl_cintura;
    private javax.swing.JLabel lbl_costo;
    private javax.swing.JLabel lbl_cuello;
    private javax.swing.JLabel lbl_dias;
    private javax.swing.JLabel lbl_dir;
    private javax.swing.JLabel lbl_edad;
    private javax.swing.JLabel lbl_fecha_pago;
    private javax.swing.JLabel lbl_grasa;
    private javax.swing.JLabel lbl_imc;
    private javax.swing.JLabel lbl_imc_altura;
    private javax.swing.JLabel lbl_masa_magra;
    private javax.swing.JLabel lbl_nivel;
    private javax.swing.JLabel lbl_nombre;
    private javax.swing.JLabel lbl_peso;
    private javax.swing.JLabel lbl_prox_pago;
    private javax.swing.JLabel lbl_result_cadera;
    private javax.swing.JLabel lbl_rutina;
    private javax.swing.JLabel lbl_sexo;
    private javax.swing.JLabel lbl_sobrepeso;
    private javax.swing.JLabel lbl_telefono;
    private javax.swing.JLabel lbl_tipo_membresia;
    private javax.swing.JLabel lbl_total;
    private javax.swing.JTabbedPane panelPrincipal;
    private javax.swing.JPanel panel_ficha;
    private javax.swing.JPanel panel_final;
    private javax.swing.JPanel panel_final1;
    private javax.swing.JPanel panel_membresia;
    private javax.swing.JPanel panel_personales;
    private javax.swing.JRadioButton radio_femenino;
    private javax.swing.JRadioButton radio_masculino;
    private javax.swing.JScrollPane spanel_ficha;
    private javax.swing.JScrollPane spanel_finales;
    private javax.swing.JScrollPane spanel_membresia;
    private javax.swing.JScrollPane spanel_personales;
    private javax.swing.JTextField txt_altura;
    private javax.swing.JTextField txt_apellidos;
    private javax.swing.JTextField txt_cadera;
    private javax.swing.JTextField txt_cedula;
    private javax.swing.JTextField txt_celular;
    private javax.swing.JTextField txt_cintura;
    private javax.swing.JTextField txt_costo;
    private javax.swing.JTextField txt_cuello;
    private javax.swing.JTextField txt_dias;
    private javax.swing.JTextField txt_dir;
    private javax.swing.JTextField txt_nombres;
    private javax.swing.JTextField txt_peso;
    private javax.swing.JTextField txt_prox_pago;
    private javax.swing.JTextField txt_telefono;
    private javax.swing.JTextField txt_total_pagar;
    // End of variables declaration//GEN-END:variables
}
