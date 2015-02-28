package forms;
import javax.swing.*;
import Mysql.*;
import validaciones.Validar;
import java.sql.*;
import general.Asistencias;
import general.Cliente;
import general.Fechas;
import general.Membresia;
import general.Pagos;
import javax.swing.table.DefaultTableModel;






public class Form_pagos extends javax.swing.JFrame {
    
    //Hacemos las conexion 
    public Conexion cn = new Conexion();//instanciamos nuestra clase conexion
    public Connection conexion = cn.getConexion();
    private  ResultSet rs;
    private PreparedStatement ps;
    private String sql;
    
    Cliente cliente = new Cliente();
    Fechas fecha = new Fechas();
    Membresia membresia = new Membresia();
    Pagos pagos = new Pagos();
    
     private String day,month,year;
      private String fecha_fin;
      String fecha_inicio2;

    
    
 /*_____________________________________________________________________________
     
    $Metodo contructor del la clase
 _______________________________________________________________________________*/
    
    public Form_pagos() {
        initComponents();
        setLocationRelativeTo(null);
        
        //para limitar ingreso de caracteres en la cajas      
         txt_buscar_cedula.setDocument(new Validar(txt_buscar_cedula,10));
         txt_cedula.setDocument(new Validar(txt_cedula,10));
         
         //para poner los campos de tesxto editables
          txt_costo.setEditable(false);
          txt_costo.setEditable(false);
          txt_prox_pago.setEditable(false);

         
          cargarTabla();
          cargarMembresias();  
          cargarCombo();
          
          //para ocultar caja yl el label de los dias para para la membresia especial
        lbl_dias.setVisible(false);
        txt_dias.setVisible(false);
    
    
    
     
        
 }//fin del metodo
  
   
    
    
    
 /*_________________________________________________________________________
    
    Metodo para cargar combo de años
 __________________________________________________________________________*/  
    
    public void cargarCombo(){
        
        fecha.setYear();
        int year = fecha.getYear()+ 1;
        
        for(int i= 0;i<80;i++){        
          cbo_year.addItem(year = year - 1);
          
         }     
    }   
 
    
  /*-----------------------------------------------------------------------------------
      metodo cargar fecha de proximo pago 
 -------------------------------------------------------------------------------------*/ 
 public  void cargarProxPago(){
     
      day = this.cbo_day.getSelectedItem().toString();
      month = String.valueOf(this.cbo_month1.getSelectedIndex() + 1);
      int year = Integer.parseInt(this.cbo_year.getSelectedItem().toString());
      int month2 = Integer.parseInt(month);
      String membresia = cbo_membresia.getSelectedItem().toString();
      
      if(cbo_membresia.getSelectedIndex() > 0){
            //para pago anual
          if(membresia.equals("Anual")){
              
             year = Integer.parseInt(this.cbo_year.getSelectedItem().toString()) + 1;
             this.txt_prox_pago.setText(day +"/"+ month+ "/"+ year);
             fecha_fin=year +"-"+ month2+ "-"+ day;
            
             
            //para pago semestral
         }else if(membresia.equals("Semestral")){
              
              for(int i=0;i<6;i++){
                   month2 = month2 + 1;
                  
                  if(month2 > 12){
                      month2 = 1 + 1;
                      year = Integer.parseInt(this.cbo_year.getSelectedItem().toString()) + 1;
                  }
              }
               fecha_fin=year +"-"+ month2+ "-"+ day;
               this.txt_prox_pago.setText(day +"/"+ month2+ "/"+ year);
               
               
             //para pago   mensual
          }else if(membresia.equals("Mensual")){
                                       
                  if(month2 == 12){
                      month2 = 1;
                       year = Integer.parseInt(this.cbo_year.getSelectedItem().toString()) + 1;
                       
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
 
    
    
            
            
  
     
  /*_____________________________________________________________________________
     
    $cargar tablas de pago
 _______________________________________________________________________________*/   
     
     
     public void cargarTabla(){
		
	//vector para agreagar a las columnas titulos
	String titulos[] = {"Id Pago","Cedula","Nombre","Apellido","Tipo","Costo Unitario","total","Fecha pago","Vence"};
	//vector para guaradar los registros que se recupen de la base de datos
	String[] registros = new String[9];//cantidad de las columnas de la tabla
	//asignamos al model el vector de titulos poder insertar en la tabla los registros
	DefaultTableModel modelo = new DefaultTableModel(null,titulos);
	//la conexion a la base
	
	//mandamos la sentencia sql
	sql = "select * from vista_pagos";
			
	//creamos stament
       
	try{
             ps = conexion.prepareStatement(sql);
            rs = ps.executeQuery(sql);
            //bucle para ir cargando lo datos en el resulset
		while(rs.next()){
			registros[0] = rs.getString(1);//mismos campos de la base
			registros[1] = rs.getString(2);//mismos campos de la base
			registros[2] = rs.getString(3);//mismos campos de la base
                        registros[3] = rs.getString(4);//mismos campos de la base
                        registros[4] = rs.getString(5);//mismos campos de la base
                        registros[5] = rs.getString(6);//mismos campos de la base
                        registros[6] = rs.getString(7);//mismos campos de la base
                        registros[7] = rs.getString(8);//mismos campos de la base
                        registros[8] = rs.getString(9);//mismos campos de la base
                        

			modelo.addRow(registros);//cargamos los datos al model
		}
		
		tabla_pagos.setModel(modelo);//cargamos los datos dfel modelo a la tabla
                
		
	}catch(SQLException ex){
		JOptionPane.showMessageDialog(null,ex.getMessage());		
		
	}

}
    
    
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane1 = new javax.swing.JTabbedPane();
        jScrollPane1 = new javax.swing.JScrollPane();
        jPanel1 = new javax.swing.JPanel();
        jLabel56 = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        cbo_membresia = new javax.swing.JComboBox();
        jLabel58 = new javax.swing.JLabel();
        jLabel57 = new javax.swing.JLabel();
        txt_costo = new javax.swing.JTextField();
        cbo_day = new javax.swing.JComboBox();
        jLabel59 = new javax.swing.JLabel();
        cbo_month = new javax.swing.JComboBox();
        cbo_year = new javax.swing.JComboBox();
        jLabel60 = new javax.swing.JLabel();
        btn_guardar = new javax.swing.JButton();
        btn_cancelar = new javax.swing.JButton();
        jLabel61 = new javax.swing.JLabel();
        txt_prox_pago = new javax.swing.JTextField();
        btn_nuevo = new javax.swing.JButton();
        jLabel62 = new javax.swing.JLabel();
        jSeparator3 = new javax.swing.JSeparator();
        jScrollPane2 = new javax.swing.JScrollPane();
        tabla_pagos = new javax.swing.JTable();
        btn_cancelar1 = new javax.swing.JButton();
        txt_cedula = new javax.swing.JTextField();
        txt_dias = new javax.swing.JTextField();
        lbl_dias = new javax.swing.JLabel();
        txt_total_pagar = new javax.swing.JTextField();
        jLabel72 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        jPanel2 = new javax.swing.JPanel();
        jLabel26 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        txt_buscar_cedula = new javax.swing.JTextField();
        btn_buscar = new javax.swing.JButton();
        jLabel20 = new javax.swing.JLabel();
        btn_editar = new javax.swing.JButton();
        jLabel16 = new javax.swing.JLabel();
        btn_actualizar = new javax.swing.JButton();
        btn_eliminar = new javax.swing.JButton();
        jLabel19 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        cbo_day1 = new javax.swing.JComboBox();
        cbo_month1 = new javax.swing.JComboBox();
        cbo_year1 = new javax.swing.JComboBox();
        txt_dir = new javax.swing.JTextField();
        txt_apellildos = new javax.swing.JTextField();
        txt_nombres = new javax.swing.JTextField();
        txt_result_cedula = new javax.swing.JTextField();
        jSeparator4 = new javax.swing.JSeparator();
        jLabel23 = new javax.swing.JLabel();
        cbo_day2 = new javax.swing.JComboBox();
        cbo_month2 = new javax.swing.JComboBox();
        cbo_year2 = new javax.swing.JComboBox();
        jSeparator5 = new javax.swing.JSeparator();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jTabbedPane1.setBackground(new java.awt.Color(252, 250, 250));
        jTabbedPane1.setForeground(new java.awt.Color(110, 110, 110));
        jTabbedPane1.setFont(new java.awt.Font("Verdana", 0, 16)); // NOI18N

        jScrollPane1.setBorder(null);

        jPanel1.setBackground(new java.awt.Color(250, 250, 250));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel56.setFont(new java.awt.Font("Verdana", 0, 24)); // NOI18N
        jLabel56.setForeground(new java.awt.Color(110, 110, 110));
        jLabel56.setText("Últimos pagos");
        jPanel1.add(jLabel56, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 640, -1, -1));

        jSeparator2.setBackground(new java.awt.Color(51, 204, 255));
        jPanel1.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 690, 650, 10));

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
        jPanel1.add(cbo_membresia, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 200, 160, 43));

        jLabel58.setFont(new java.awt.Font("Verdana", 0, 16)); // NOI18N
        jLabel58.setForeground(new java.awt.Color(110, 110, 110));
        jLabel58.setText("Membresia:");
        jPanel1.add(jLabel58, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 210, 100, -1));

        jLabel57.setFont(new java.awt.Font("Verdana", 0, 16)); // NOI18N
        jLabel57.setForeground(new java.awt.Color(110, 110, 110));
        jLabel57.setText("Costo:");
        jPanel1.add(jLabel57, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 270, -1, -1));

        txt_costo.setFont(new java.awt.Font("Verdana", 0, 16)); // NOI18N
        txt_costo.setForeground(new java.awt.Color(110, 110, 110));
        txt_costo.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(202, 202, 202), 1, true));
        jPanel1.add(txt_costo, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 260, 350, 39));

        cbo_day.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        cbo_day.setForeground(new java.awt.Color(110, 110, 110));
        cbo_day.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31" }));
        cbo_day.setToolTipText("");
        cbo_day.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel1.add(cbo_day, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 320, 70, 33));

        jLabel59.setFont(new java.awt.Font("Verdana", 0, 16)); // NOI18N
        jLabel59.setForeground(new java.awt.Color(110, 110, 110));
        jLabel59.setText("Fecha pago:");
        jPanel1.add(jLabel59, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 324, -1, -1));

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
        jPanel1.add(cbo_month, new org.netbeans.lib.awtextra.AbsoluteConstraints(458, 320, -1, 33));

        cbo_year.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        cbo_year.setForeground(new java.awt.Color(110, 110, 110));
        cbo_year.setToolTipText("");
        cbo_year.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbo_yearActionPerformed(evt);
            }
        });
        jPanel1.add(cbo_year, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 320, 80, 33));

        jLabel60.setFont(new java.awt.Font("Verdana", 0, 16)); // NOI18N
        jLabel60.setForeground(new java.awt.Color(110, 110, 110));
        jLabel60.setText("Proximo pago:");
        jPanel1.add(jLabel60, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 377, 160, 30));

        btn_guardar.setBackground(new java.awt.Color(0, 153, 204));
        btn_guardar.setFont(new java.awt.Font("Verdana", 0, 16)); // NOI18N
        btn_guardar.setForeground(new java.awt.Color(255, 255, 255));
        btn_guardar.setText("Guardar");
        btn_guardar.setBorder(null);
        btn_guardar.setBorderPainted(false);
        btn_guardar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_guardar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_guardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_guardarActionPerformed(evt);
            }
        });
        jPanel1.add(btn_guardar, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 530, 100, 40));

        btn_cancelar.setBackground(new java.awt.Color(0, 153, 204));
        btn_cancelar.setFont(new java.awt.Font("Verdana", 0, 16)); // NOI18N
        btn_cancelar.setForeground(new java.awt.Color(255, 255, 255));
        btn_cancelar.setText("Cancelar");
        btn_cancelar.setBorder(null);
        btn_cancelar.setBorderPainted(false);
        btn_cancelar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel1.add(btn_cancelar, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 530, 100, 40));

        jLabel61.setFont(new java.awt.Font("Verdana", 0, 16)); // NOI18N
        jLabel61.setForeground(new java.awt.Color(110, 110, 110));
        jLabel61.setText("Cédula:");
        jPanel1.add(jLabel61, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 150, -1, -1));

        txt_prox_pago.setFont(new java.awt.Font("Verdana", 0, 16)); // NOI18N
        txt_prox_pago.setForeground(new java.awt.Color(110, 110, 110));
        txt_prox_pago.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(202, 202, 202), 1, true));
        jPanel1.add(txt_prox_pago, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 370, 350, 39));

        btn_nuevo.setBackground(new java.awt.Color(0, 153, 204));
        btn_nuevo.setFont(new java.awt.Font("Verdana", 0, 16)); // NOI18N
        btn_nuevo.setForeground(new java.awt.Color(255, 255, 255));
        btn_nuevo.setText("Nuevo");
        btn_nuevo.setBorder(null);
        btn_nuevo.setBorderPainted(false);
        btn_nuevo.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_nuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_nuevoActionPerformed(evt);
            }
        });
        jPanel1.add(btn_nuevo, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 530, 100, 40));

        jLabel62.setFont(new java.awt.Font("Verdana", 0, 24)); // NOI18N
        jLabel62.setForeground(new java.awt.Color(110, 110, 110));
        jLabel62.setText("Pagos");
        jPanel1.add(jLabel62, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 40, -1, -1));

        jSeparator3.setBackground(new java.awt.Color(51, 204, 255));
        jPanel1.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(206, 90, 480, 10));

        tabla_pagos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane2.setViewportView(tabla_pagos);

        jPanel1.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 730, 750, 200));

        btn_cancelar1.setBackground(new java.awt.Color(250, 250, 250));
        btn_cancelar1.setFont(new java.awt.Font("Verdana", 0, 16)); // NOI18N
        btn_cancelar1.setForeground(new java.awt.Color(110, 110, 110));
        btn_cancelar1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/ic_home_64.png"))); // NOI18N
        btn_cancelar1.setText("Volver");
        btn_cancelar1.setAutoscrolls(true);
        btn_cancelar1.setBorder(null);
        btn_cancelar1.setBorderPainted(false);
        btn_cancelar1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_cancelar1.setFocusPainted(false);
        btn_cancelar1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_cancelar1.setIconTextGap(-8);
        btn_cancelar1.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        btn_cancelar1.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btn_cancelar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_cancelar1ActionPerformed(evt);
            }
        });
        jPanel1.add(btn_cancelar1, new org.netbeans.lib.awtextra.AbsoluteConstraints(23, 23, -1, -1));

        txt_cedula.setFont(new java.awt.Font("Verdana", 0, 16)); // NOI18N
        txt_cedula.setForeground(new java.awt.Color(110, 110, 110));
        txt_cedula.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(202, 202, 202), 1, true));
        txt_cedula.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_cedulaActionPerformed(evt);
            }
        });
        txt_cedula.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_cedulaKeyTyped(evt);
            }
        });
        jPanel1.add(txt_cedula, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 140, 350, 39));

        txt_dias.setFont(new java.awt.Font("Verdana", 0, 16)); // NOI18N
        txt_dias.setForeground(new java.awt.Color(110, 110, 110));
        txt_dias.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(202, 202, 202), 1, true));
        txt_dias.setDisabledTextColor(new java.awt.Color(0, 204, 255));
        txt_dias.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txt_diasKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_diasKeyTyped(evt);
            }
        });
        jPanel1.add(txt_dias, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 200, 120, 40));

        lbl_dias.setFont(new java.awt.Font("Verdana", 0, 16)); // NOI18N
        lbl_dias.setForeground(new java.awt.Color(110, 110, 110));
        lbl_dias.setText("Días:");
        jPanel1.add(lbl_dias, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 200, -1, 40));

        txt_total_pagar.setFont(new java.awt.Font("Verdana", 0, 16)); // NOI18N
        txt_total_pagar.setForeground(new java.awt.Color(110, 110, 110));
        txt_total_pagar.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(202, 202, 202), 1, true));
        txt_total_pagar.setDisabledTextColor(new java.awt.Color(110, 110, 110));
        txt_total_pagar.setEnabled(false);
        jPanel1.add(txt_total_pagar, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 440, 350, 39));

        jLabel72.setFont(new java.awt.Font("Verdana", 0, 16)); // NOI18N
        jLabel72.setForeground(new java.awt.Color(110, 110, 110));
        jLabel72.setText("Total a pagar:");
        jPanel1.add(jLabel72, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 450, 160, 30));

        jScrollPane1.setViewportView(jPanel1);

        jTabbedPane1.addTab("Nuevos", jScrollPane1);

        jPanel2.setBackground(new java.awt.Color(250, 250, 250));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel26.setFont(new java.awt.Font("Verdana", 0, 24)); // NOI18N
        jLabel26.setForeground(new java.awt.Color(110, 110, 110));
        jLabel26.setText("Buscar  pagos");
        jPanel2.add(jLabel26, new org.netbeans.lib.awtextra.AbsoluteConstraints(325, 39, 197, -1));

        jLabel13.setFont(new java.awt.Font("Verdana", 0, 16)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(110, 110, 110));
        jLabel13.setText("Cédula:");
        jPanel2.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 139, -1, -1));

        txt_buscar_cedula.setFont(new java.awt.Font("Verdana", 0, 16)); // NOI18N
        txt_buscar_cedula.setForeground(new java.awt.Color(110, 110, 110));
        txt_buscar_cedula.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(202, 202, 202), 1, true));
        txt_buscar_cedula.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_buscar_cedulaKeyTyped(evt);
            }
        });
        jPanel2.add(txt_buscar_cedula, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 129, 242, 39));

        btn_buscar.setBackground(new java.awt.Color(0, 153, 204));
        btn_buscar.setFont(new java.awt.Font("Verdana", 0, 16)); // NOI18N
        btn_buscar.setForeground(new java.awt.Color(255, 255, 255));
        btn_buscar.setText("Buscar");
        btn_buscar.setBorder(null);
        btn_buscar.setBorderPainted(false);
        btn_buscar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_buscar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jPanel2.add(btn_buscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(594, 129, 100, 40));

        jLabel20.setFont(new java.awt.Font("Verdana", 0, 24)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(110, 110, 110));
        jLabel20.setText("Resultados de búsqueda");
        jPanel2.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 229, 310, -1));

        btn_editar.setBackground(new java.awt.Color(0, 153, 204));
        btn_editar.setFont(new java.awt.Font("Verdana", 0, 16)); // NOI18N
        btn_editar.setForeground(new java.awt.Color(255, 255, 255));
        btn_editar.setText("Editar");
        btn_editar.setBorder(null);
        btn_editar.setBorderPainted(false);
        btn_editar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_editar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jPanel2.add(btn_editar, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 289, 100, 40));

        jLabel16.setFont(new java.awt.Font("Verdana", 0, 16)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(110, 110, 110));
        jLabel16.setText("Acciones:");
        jPanel2.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 299, 100, -1));

        btn_actualizar.setBackground(new java.awt.Color(0, 153, 204));
        btn_actualizar.setFont(new java.awt.Font("Verdana", 0, 16)); // NOI18N
        btn_actualizar.setForeground(new java.awt.Color(255, 255, 255));
        btn_actualizar.setText("Actualizar");
        btn_actualizar.setBorder(null);
        btn_actualizar.setBorderPainted(false);
        btn_actualizar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_actualizar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jPanel2.add(btn_actualizar, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 290, 100, 40));

        btn_eliminar.setBackground(new java.awt.Color(0, 153, 204));
        btn_eliminar.setFont(new java.awt.Font("Verdana", 0, 16)); // NOI18N
        btn_eliminar.setForeground(new java.awt.Color(255, 255, 255));
        btn_eliminar.setText("Eliminar");
        btn_eliminar.setBorder(null);
        btn_eliminar.setBorderPainted(false);
        btn_eliminar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_eliminar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_eliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_eliminarActionPerformed(evt);
            }
        });
        jPanel2.add(btn_eliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(594, 289, 100, 40));

        jLabel19.setFont(new java.awt.Font("Verdana", 0, 16)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(110, 110, 110));
        jLabel19.setText("Cédula:");
        jPanel2.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 400, -1, -1));

        jLabel17.setFont(new java.awt.Font("Verdana", 0, 16)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(110, 110, 110));
        jLabel17.setText("Nombres:");
        jPanel2.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 460, -1, -1));

        jLabel18.setFont(new java.awt.Font("Verdana", 0, 16)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(110, 110, 110));
        jLabel18.setText("Apellidos:");
        jPanel2.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 520, -1, -1));

        jLabel21.setFont(new java.awt.Font("Verdana", 0, 16)); // NOI18N
        jLabel21.setForeground(new java.awt.Color(110, 110, 110));
        jLabel21.setText("Dirección:");
        jPanel2.add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 590, -1, -1));

        jLabel22.setFont(new java.awt.Font("Verdana", 0, 16)); // NOI18N
        jLabel22.setForeground(new java.awt.Color(110, 110, 110));
        jLabel22.setText("Fecha pago:");
        jPanel2.add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 650, -1, -1));

        cbo_day1.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        cbo_day1.setForeground(new java.awt.Color(110, 110, 110));
        cbo_day1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31" }));
        cbo_day1.setToolTipText("");
        cbo_day1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel2.add(cbo_day1, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 640, 80, 33));

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
        jPanel2.add(cbo_month1, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 640, 140, 33));

        cbo_year1.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        cbo_year1.setForeground(new java.awt.Color(110, 110, 110));
        cbo_year1.setToolTipText("");
        cbo_year1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbo_year1ActionPerformed(evt);
            }
        });
        jPanel2.add(cbo_year1, new org.netbeans.lib.awtextra.AbsoluteConstraints(616, 640, 110, 33));

        txt_dir.setBackground(new java.awt.Color(197, 230, 197));
        txt_dir.setFont(new java.awt.Font("Verdana", 0, 16)); // NOI18N
        txt_dir.setForeground(new java.awt.Color(110, 110, 110));
        txt_dir.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(162, 214, 162), 1, true));
        jPanel2.add(txt_dir, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 570, 431, 39));

        txt_apellildos.setBackground(new java.awt.Color(197, 230, 197));
        txt_apellildos.setFont(new java.awt.Font("Verdana", 0, 16)); // NOI18N
        txt_apellildos.setForeground(new java.awt.Color(110, 110, 110));
        txt_apellildos.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(162, 214, 162), 1, true));
        jPanel2.add(txt_apellildos, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 510, 431, 39));

        txt_nombres.setBackground(new java.awt.Color(197, 230, 197));
        txt_nombres.setFont(new java.awt.Font("Verdana", 0, 16)); // NOI18N
        txt_nombres.setForeground(new java.awt.Color(110, 110, 110));
        txt_nombres.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(162, 214, 162), 1, true));
        jPanel2.add(txt_nombres, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 450, 431, 39));

        txt_result_cedula.setBackground(new java.awt.Color(197, 230, 197));
        txt_result_cedula.setFont(new java.awt.Font("Verdana", 0, 16)); // NOI18N
        txt_result_cedula.setForeground(new java.awt.Color(110, 110, 110));
        txt_result_cedula.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(162, 214, 162), 1, true));
        jPanel2.add(txt_result_cedula, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 390, 431, 39));

        jSeparator4.setBackground(new java.awt.Color(51, 204, 255));
        jPanel2.add(jSeparator4, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 359, 589, 11));

        jLabel23.setFont(new java.awt.Font("Verdana", 0, 16)); // NOI18N
        jLabel23.setForeground(new java.awt.Color(110, 110, 110));
        jLabel23.setText("Fecha prox pago:");
        jPanel2.add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 710, -1, -1));

        cbo_day2.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        cbo_day2.setForeground(new java.awt.Color(110, 110, 110));
        cbo_day2.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31" }));
        cbo_day2.setToolTipText("");
        cbo_day2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel2.add(cbo_day2, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 700, 80, 33));

        cbo_month2.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        cbo_month2.setForeground(new java.awt.Color(110, 110, 110));
        cbo_month2.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio", "Julio", "Agosto", "Septiembre", "Octubre", "Noviembre", "Diciembre" }));
        cbo_month2.setToolTipText("");
        cbo_month2.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        cbo_month2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbo_month2ActionPerformed(evt);
            }
        });
        jPanel2.add(cbo_month2, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 700, 140, 33));

        cbo_year2.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        cbo_year2.setForeground(new java.awt.Color(110, 110, 110));
        cbo_year2.setToolTipText("");
        cbo_year2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbo_year2ActionPerformed(evt);
            }
        });
        jPanel2.add(cbo_year2, new org.netbeans.lib.awtextra.AbsoluteConstraints(616, 700, 110, 33));

        jSeparator5.setBackground(new java.awt.Color(51, 204, 255));
        jPanel2.add(jSeparator5, new org.netbeans.lib.awtextra.AbsoluteConstraints(136, 98, 589, 11));

        jScrollPane3.setViewportView(jPanel2);

        jTabbedPane1.addTab("Detalles de Pagos", jScrollPane3);

        getContentPane().add(jTabbedPane1, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    
    
    
    
    
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
            lbl_dias.setVisible(false);
        txt_dias.setVisible(false);
        
        } 
    }//GEN-LAST:event_cbo_membresiaActionPerformed

    
    
    
    
    
    private void cbo_monthActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbo_monthActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbo_monthActionPerformed

    private void cbo_yearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbo_yearActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbo_yearActionPerformed

    private void btn_eliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_eliminarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_eliminarActionPerformed

    private void cbo_month1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbo_month1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbo_month1ActionPerformed

    private void cbo_year1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbo_year1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbo_year1ActionPerformed

    private void cbo_month2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbo_month2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbo_month2ActionPerformed

    private void cbo_year2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbo_year2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbo_year2ActionPerformed

    
    
/*-----------------------------------------------------------------------------
  Metodo para volver al menu de inicio  
 ------------------------------------------------------------------------------*/
    private void btn_cancelar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_cancelar1ActionPerformed
        Home frm_home =new Home();
        frm_home.setVisible(true);
        dispose();
    }//GEN-LAST:event_btn_cancelar1ActionPerformed

    private void txt_cedulaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_cedulaActionPerformed
            Validar.soloNumeros(evt);
    }//GEN-LAST:event_txt_cedulaActionPerformed

    private void txt_cedulaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_cedulaKeyTyped
        Validar.soloNumeros(evt);
    }//GEN-LAST:event_txt_cedulaKeyTyped

    private void txt_buscar_cedulaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_buscar_cedulaKeyTyped
            Validar.soloNumeros(evt);
    }//GEN-LAST:event_txt_buscar_cedulaKeyTyped

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

    private void txt_diasKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_diasKeyTyped

        Validar.soloNumeros(evt);

        //JOptionPane.showMessageDialog(rootPane, "Datos ingresados conexito");

    }//GEN-LAST:event_txt_diasKeyTyped

    private void btn_nuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_nuevoActionPerformed
      cbo_membresia.setSelectedIndex(0);
        txt_costo.setText("");
        txt_prox_pago.setText("");
        lbl_dias.setVisible(false);
        txt_dias.setVisible(false);
    }//GEN-LAST:event_btn_nuevoActionPerformed

    
    
    
    
    
    private void btn_guardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_guardarActionPerformed
            
    
          if(txt_costo.getText().length() >  0 && txt_prox_pago.getText().length() > 0 
                  && txt_total_pagar.getText().length() > 0 && txt_cedula.getText().length()>0){
              
              if(Validar.VerificarCedula(txt_cedula.getText())){
                  
                   String fecha_inicio = cbo_year.getSelectedItem().toString() +"-"+ String.valueOf(this.cbo_month.getSelectedIndex() + 1) + "-"+cbo_day.getSelectedItem().toString();
                   String mem = cbo_membresia.getSelectedItem().toString(); 
                   
                  try{
                      
    
                      
                      sql = "select * from clientes where cedula = "+txt_cedula.getText()+"";
                      ps =  conexion.prepareStatement(sql);
                      rs = ps.executeQuery();
                      //hacemos esto para obtener el id de mebresia del cliente para ingresarlo en pagos
                      if(rs.next()){
                          
                           
                            
                          
                          sql = "select id_tipo from tipo where tipo = '"+mem+"'";
                 
                 
                            ps = conexion.prepareStatement(sql);
                            rs = ps.executeQuery(sql);
                           if(rs.next()){
                               membresia.setIdTipoMembresia(rs.getInt("id_tipo"));
                           }
                           
                           if(!mem.equals("Especial")){
/*________________________________________________________________________________________________________________________*/
                               
                                membresia.setFechaInicio(fecha_inicio);
                                membresia.setFechaFin(fecha_fin);
                                membresia.setAsistencias(0);
                                membresia.setDiasTotal(0);
                                membresia.setMembresia(Integer.parseInt(txt_cedula.getText()));
                                                                       
                               
                                sql="select max(id_membresia) from membresia where cedula = "+txt_cedula.getText()+"";
                                ps =  conexion.prepareStatement(sql);
                                rs = ps.executeQuery();
                           
                                    if(rs.next()){

                                       pagos.setIdMembresia(rs.getInt(1));
                                       pagos.setCosto(Float.parseFloat(txt_costo.getText()));
                                       pagos.setTotal(Float.parseFloat(txt_total_pagar.getText()));

                                       //llamamos a los metodos de insertar
                                       
                                       pagos.setPago(Integer.parseInt(txt_cedula.getText()));
                                        cargarTabla();

                                        JOptionPane.showMessageDialog(rootPane,"id:"+membresia.getIdTipoMembresia()+ " costo: " + pagos.getCosto()
                                                +" total:" + pagos.getTotal() + " fechaini:" + membresia.getFechaInicio()+ " fechaend: " + membresia.getFechaFin() );

                                    }else{
                                        JOptionPane.showMessageDialog(rootPane,"aqui se queda");
                                    
                                    }
  
/*____________________________________________________________________________________________________________________________*/                               

                           }else{
/*______________________________________________________________________________________________________________________________*/
                               
                                membresia.setFechaInicio(fecha_inicio);
                                membresia.setFechaFin(fecha_fin);
                                membresia.setAsistencias(0);
                                membresia.setDiasTotal(0);
                                membresia.setMembresia(Integer.parseInt(txt_cedula.getText()));
                               
                               
                                sql="select max(id_membresia) from membresia where cedula = "+txt_cedula.getText()+"";
                                ps =  conexion.prepareStatement(sql);
                                rs = ps.executeQuery();
                           
                                    if(rs.next()){


                                       pagos.setIdMembresia(rs.getInt(1));
                                       pagos.setCosto(Float.parseFloat(txt_costo.getText()));
                                       pagos.setTotal(Float.parseFloat(txt_total_pagar.getText()));

                                       //llamamos a los metodos de insertar
                                       membresia.setMembresia(Integer.parseInt(txt_cedula.getText()));
                                       pagos.setPago(Integer.parseInt(txt_cedula.getText()));
                                       cargarTabla();

                                        JOptionPane.showMessageDialog(rootPane,"id:"+membresia.getIdTipoMembresia()+ " costo: " + pagos.getCosto()
                                                +" total:" + pagos.getTotal() + " fechaini:" + membresia.getFechaInicio()+ " fechaend: " + membresia.getFechaFin() );

                                    }else{
                                        JOptionPane.showMessageDialog(rootPane,"aqui se queda con membresia especial");
                                    
                                    }
  
/*_____________________________________________________________________________________________________________________________________*/    
                           
                           }

              
                      }else{
                      
                       JOptionPane.showMessageDialog(rootPane,"El cliente no existe");
                       txt_cedula.setText("");
                       txt_cedula.requestFocus();
                      }
                      

                    }catch(Exception ex){
                       JOptionPane.showMessageDialog(rootPane, ex.getMessage());
                    }  
      
              }else{
                  JOptionPane.showMessageDialog(rootPane, "Cedula incorrecta ");
                  txt_cedula.setText("");
                  txt_cedula.requestFocus();
              }
              
          
          }else{
               
              JOptionPane.showMessageDialog(rootPane, "Llena todos los datos");
              txt_cedula.requestFocus();
          }
      

    }//GEN-LAST:event_btn_guardarActionPerformed


    
    
    
    
    
    public static void main(String args[]) {
      

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Form_pagos().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_actualizar;
    private javax.swing.JButton btn_buscar;
    private javax.swing.JButton btn_cancelar;
    private javax.swing.JButton btn_cancelar1;
    private javax.swing.JButton btn_editar;
    private javax.swing.JButton btn_eliminar;
    private javax.swing.JButton btn_guardar;
    private javax.swing.JButton btn_nuevo;
    private javax.swing.JComboBox cbo_day;
    private javax.swing.JComboBox cbo_day1;
    private javax.swing.JComboBox cbo_day2;
    private javax.swing.JComboBox cbo_membresia;
    private javax.swing.JComboBox cbo_month;
    private javax.swing.JComboBox cbo_month1;
    private javax.swing.JComboBox cbo_month2;
    private javax.swing.JComboBox cbo_year;
    private javax.swing.JComboBox cbo_year1;
    private javax.swing.JComboBox cbo_year2;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel56;
    private javax.swing.JLabel jLabel57;
    private javax.swing.JLabel jLabel58;
    private javax.swing.JLabel jLabel59;
    private javax.swing.JLabel jLabel60;
    private javax.swing.JLabel jLabel61;
    private javax.swing.JLabel jLabel62;
    private javax.swing.JLabel jLabel72;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JLabel lbl_dias;
    private javax.swing.JTable tabla_pagos;
    private javax.swing.JTextField txt_apellildos;
    private javax.swing.JTextField txt_buscar_cedula;
    private javax.swing.JTextField txt_cedula;
    private javax.swing.JTextField txt_costo;
    private javax.swing.JTextField txt_dias;
    private javax.swing.JTextField txt_dir;
    private javax.swing.JTextField txt_nombres;
    private javax.swing.JTextField txt_prox_pago;
    private javax.swing.JTextField txt_result_cedula;
    private javax.swing.JTextField txt_total_pagar;
    // End of variables declaration//GEN-END:variables
}
