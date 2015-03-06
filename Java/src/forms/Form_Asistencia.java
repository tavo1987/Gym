package forms;
import javax.swing.*;
import Mysql.*;
import validaciones.Validar;
import java.sql.*;
import general.Asistencias;
import general.Fechas;
import java.awt.TextField;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;



public class Form_Asistencia extends javax.swing.JFrame {
    
    //Hacemos las conexion 
    public Conexion cn = new Conexion();//instanciamos nuestra clase conexion
    public Connection conexion = cn.getConexion();
    private  ResultSet rs;
    private PreparedStatement ps;
    private String sql;
    private Fechas fecha = new Fechas();
    
    //variables para guardar la fecha
    int day,day2;
    int month,month2;
    int year,year2;
    String fecha_desde;
    String fecha_hasta;
    
    
     
    
    
    
 /*_________________________________________________________________________
    
        contructor  de la clase
 __________________________________________________________________________*/
    public Form_Asistencia() {
        initComponents();
         setLocationRelativeTo(null);
         
         //para cargar table de asistencias
         cargarTabla();
         
         //para cargar combo con años
         cargarCombo();
         
       //intanceamos un obejeto tipo fecha para asignar a la caja fecha
          txt_fecha.setText(fecha.fechaLatina());
          
        
         //para centrar el tezto de la caja fecha
         this.txt_fecha.setHorizontalAlignment((int) TextField.CENTER_ALIGNMENT);
         this.txt_result_cedula.setHorizontalAlignment((int) TextField.CENTER_ALIGNMENT);
         this.txt_buscar_cedula.setHorizontalAlignment((int) TextField.CENTER_ALIGNMENT);
          
         //para texto solo de lectura para la caja cedula resultadoç
         txt_result_cedula.setEditable(false);
         txt_fecha.setEditable(false);
         
         
         
        //para limitar ingreso de caracteres en la cajas      
         txt_cedula.setDocument(new Validar(txt_cedula,10));
         txt_buscar_cedula.setDocument(new Validar(txt_buscar_cedula,10));
         
    }
    
    
    
    
    
    

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane1 = new javax.swing.JTabbedPane();
        jScrollPane1 = new javax.swing.JScrollPane();
        jPanel1 = new javax.swing.JPanel();
        jLabel18 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        txt_cedula = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        txt_fecha = new javax.swing.JTextField();
        btn_guardar = new javax.swing.JButton();
        btn_nuevo = new javax.swing.JButton();
        btn_cancelar = new javax.swing.JButton();
        jScrollPane4 = new javax.swing.JScrollPane();
        tabla_asistencia = new javax.swing.JTable();
        jSeparator2 = new javax.swing.JSeparator();
        jScrollPane2 = new javax.swing.JScrollPane();
        jPanel2 = new javax.swing.JPanel();
        jLabel20 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        cbo_dias = new javax.swing.JComboBox();
        cbo_meses = new javax.swing.JComboBox();
        cbo_years = new javax.swing.JComboBox();
        cbo_years2 = new javax.swing.JComboBox();
        cbo_meses2 = new javax.swing.JComboBox();
        cbo_dias2 = new javax.swing.JComboBox();
        jLabel15 = new javax.swing.JLabel();
        btn_buscar = new javax.swing.JButton();
        jLabel19 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        tabla_asistencia2 = new javax.swing.JTable();
        txt_buscar_cedula = new javax.swing.JTextField();
        btn_cancelar1 = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel16 = new javax.swing.JLabel();
        btn_eliminar = new javax.swing.JButton();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        txt_result_cedula = new javax.swing.JTextField();
        jSeparator4 = new javax.swing.JSeparator();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(800, 600));

        jTabbedPane1.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        jTabbedPane1.setForeground(new java.awt.Color(110, 110, 110));
        jTabbedPane1.setAutoscrolls(true);
        jTabbedPane1.setFont(new java.awt.Font("Verdana", 0, 16)); // NOI18N
        jTabbedPane1.setPreferredSize(new java.awt.Dimension(800, 635));

        jScrollPane1.setBorder(null);
        jScrollPane1.setPreferredSize(new java.awt.Dimension(800, 600));

        jPanel1.setBackground(new java.awt.Color(250, 250, 250));
        jPanel1.setAutoscrolls(true);
        jPanel1.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        jPanel1.setMinimumSize(new java.awt.Dimension(800, 1000));
        jPanel1.setPreferredSize(new java.awt.Dimension(800, 1200));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel18.setFont(new java.awt.Font("Verdana", 0, 24)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(110, 110, 110));
        jLabel18.setText("Registrar Asistencia");
        jPanel1.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 50, -1, -1));

        jLabel10.setFont(new java.awt.Font("Verdana", 0, 16)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(110, 110, 110));
        jLabel10.setText("Cédula:");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 170, -1, -1));

        txt_cedula.setFont(new java.awt.Font("Verdana", 0, 16)); // NOI18N
        txt_cedula.setForeground(new java.awt.Color(110, 110, 110));
        txt_cedula.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(202, 202, 202), 1, true));
        txt_cedula.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_cedulaKeyTyped(evt);
            }
        });
        jPanel1.add(txt_cedula, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 160, 350, 39));

        jLabel11.setFont(new java.awt.Font("Verdana", 0, 16)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(110, 110, 110));
        jLabel11.setText("Fecha:");
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 230, -1, -1));

        txt_fecha.setFont(new java.awt.Font("Verdana", 0, 16)); // NOI18N
        txt_fecha.setForeground(new java.awt.Color(110, 110, 110));
        txt_fecha.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(202, 202, 202), 1, true));
        jPanel1.add(txt_fecha, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 220, 350, 39));

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
        jPanel1.add(btn_guardar, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 310, 100, 40));

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
        jPanel1.add(btn_nuevo, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 310, 100, 40));

        btn_cancelar.setBackground(new java.awt.Color(250, 250, 250));
        btn_cancelar.setFont(new java.awt.Font("Verdana", 0, 16)); // NOI18N
        btn_cancelar.setForeground(new java.awt.Color(110, 110, 110));
        btn_cancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/ic_home_64.png"))); // NOI18N
        btn_cancelar.setText("Volver");
        btn_cancelar.setAutoscrolls(true);
        btn_cancelar.setBorder(null);
        btn_cancelar.setBorderPainted(false);
        btn_cancelar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_cancelar.setFocusPainted(false);
        btn_cancelar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_cancelar.setIconTextGap(-8);
        btn_cancelar.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        btn_cancelar.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btn_cancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_cancelarActionPerformed(evt);
            }
        });
        jPanel1.add(btn_cancelar, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 70, 80));

        tabla_asistencia.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane4.setViewportView(tabla_asistencia);

        jPanel1.add(jScrollPane4, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 400, 590, 210));

        jSeparator2.setBackground(new java.awt.Color(51, 204, 255));
        jPanel1.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 120, 560, 10));

        jScrollPane1.setViewportView(jPanel1);

        jTabbedPane1.addTab("Registrar", jScrollPane1);

        jScrollPane2.setBorder(null);

        jPanel2.setBackground(new java.awt.Color(250, 250, 250));
        jPanel2.setPreferredSize(new java.awt.Dimension(800, 1063));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel20.setFont(new java.awt.Font("Verdana", 0, 24)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(110, 110, 110));
        jLabel20.setText("Buscar asistencia de clientes");
        jPanel2.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 50, 370, -1));

        jLabel13.setFont(new java.awt.Font("Verdana", 0, 16)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(110, 110, 110));
        jLabel13.setText("Cédula:");
        jPanel2.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(152, 135, -1, -1));

        jLabel14.setFont(new java.awt.Font("Verdana", 0, 16)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(110, 110, 110));
        jLabel14.setText("fecha desde:");
        jPanel2.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(152, 200, -1, -1));

        cbo_dias.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        cbo_dias.setForeground(new java.awt.Color(110, 110, 110));
        cbo_dias.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31" }));
        cbo_dias.setToolTipText("");
        cbo_dias.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel2.add(cbo_dias, new org.netbeans.lib.awtextra.AbsoluteConstraints(268, 196, -1, 33));

        cbo_meses.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        cbo_meses.setForeground(new java.awt.Color(110, 110, 110));
        cbo_meses.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio", "Julio", "Agosto", "Septiembre", "Octubre", "Noviembre", "Diciembre" }));
        cbo_meses.setToolTipText("");
        cbo_meses.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        cbo_meses.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbo_mesesActionPerformed(evt);
            }
        });
        jPanel2.add(cbo_meses, new org.netbeans.lib.awtextra.AbsoluteConstraints(358, 195, -1, 33));

        cbo_years.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        cbo_years.setForeground(new java.awt.Color(110, 110, 110));
        cbo_years.setToolTipText("");
        cbo_years.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbo_yearsActionPerformed(evt);
            }
        });
        jPanel2.add(cbo_years, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 190, 70, 33));

        cbo_years2.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        cbo_years2.setForeground(new java.awt.Color(110, 110, 110));
        cbo_years2.setToolTipText("");
        cbo_years2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbo_years2ActionPerformed(evt);
            }
        });
        jPanel2.add(cbo_years2, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 240, 70, 33));

        cbo_meses2.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        cbo_meses2.setForeground(new java.awt.Color(110, 110, 110));
        cbo_meses2.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio", "Julio", "Agosto", "Septiembre", "Octubre", "Noviembre", "Diciembre" }));
        cbo_meses2.setToolTipText("");
        cbo_meses2.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        cbo_meses2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbo_meses2ActionPerformed(evt);
            }
        });
        jPanel2.add(cbo_meses2, new org.netbeans.lib.awtextra.AbsoluteConstraints(358, 240, -1, 33));

        cbo_dias2.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        cbo_dias2.setForeground(new java.awt.Color(110, 110, 110));
        cbo_dias2.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31" }));
        cbo_dias2.setToolTipText("");
        cbo_dias2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel2.add(cbo_dias2, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 240, -1, 33));

        jLabel15.setFont(new java.awt.Font("Verdana", 0, 16)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(110, 110, 110));
        jLabel15.setText("fecha hasta:");
        jPanel2.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(152, 248, -1, -1));

        btn_buscar.setBackground(new java.awt.Color(0, 153, 204));
        btn_buscar.setFont(new java.awt.Font("Verdana", 0, 16)); // NOI18N
        btn_buscar.setForeground(new java.awt.Color(255, 255, 255));
        btn_buscar.setText("Buscar");
        btn_buscar.setBorder(null);
        btn_buscar.setBorderPainted(false);
        btn_buscar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_buscar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_buscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_buscarActionPerformed(evt);
            }
        });
        jPanel2.add(btn_buscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 130, 100, 40));

        jLabel19.setFont(new java.awt.Font("Verdana", 0, 24)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(110, 110, 110));
        jLabel19.setText("Asistencias");
        jPanel2.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 600, 140, -1));

        tabla_asistencia2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane3.setViewportView(tabla_asistencia2);

        jPanel2.add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 650, 610, 170));

        txt_buscar_cedula.setFont(new java.awt.Font("Verdana", 0, 16)); // NOI18N
        txt_buscar_cedula.setForeground(new java.awt.Color(110, 110, 110));
        txt_buscar_cedula.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(202, 202, 202), 1, true));
        txt_buscar_cedula.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_buscar_cedulaKeyTyped(evt);
            }
        });
        jPanel2.add(txt_buscar_cedula, new org.netbeans.lib.awtextra.AbsoluteConstraints(268, 125, 324, 40));

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
        jPanel2.add(btn_cancelar1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 30, -1, -1));

        jSeparator1.setBackground(new java.awt.Color(51, 204, 255));
        jPanel2.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 100, 580, 21));

        jLabel16.setFont(new java.awt.Font("Verdana", 0, 16)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(110, 110, 110));
        jLabel16.setText("Acciones:");
        jPanel2.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 410, 100, -1));

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
        jPanel2.add(btn_eliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 400, 100, 40));

        jLabel22.setFont(new java.awt.Font("Verdana", 0, 24)); // NOI18N
        jLabel22.setForeground(new java.awt.Color(110, 110, 110));
        jLabel22.setText("Resultados de búsqueda");
        jPanel2.add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 340, 310, -1));

        jLabel23.setFont(new java.awt.Font("Verdana", 0, 16)); // NOI18N
        jLabel23.setForeground(new java.awt.Color(110, 110, 110));
        jLabel23.setText("Cédula");
        jPanel2.add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 540, -1, -1));

        txt_result_cedula.setBackground(new java.awt.Color(197, 230, 197));
        txt_result_cedula.setFont(new java.awt.Font("Verdana", 0, 16)); // NOI18N
        txt_result_cedula.setForeground(new java.awt.Color(110, 110, 110));
        txt_result_cedula.setText("hola");
        txt_result_cedula.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(162, 214, 162), 1, true));
        txt_result_cedula.setDisabledTextColor(new java.awt.Color(51, 153, 255));
        txt_result_cedula.setFocusable(false);
        jPanel2.add(txt_result_cedula, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 530, 431, 39));

        jSeparator4.setBackground(new java.awt.Color(51, 204, 255));
        jPanel2.add(jSeparator4, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 470, 589, 30));

        jScrollPane2.setViewportView(jPanel2);

        jTabbedPane1.addTab("Modificar asistencias", jScrollPane2);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 984, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 721, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_cancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_cancelarActionPerformed
        Home frm_home = new Home();
        frm_home.setVisible(true);
        dispose();
    }//GEN-LAST:event_btn_cancelarActionPerformed

    private void btn_cancelar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_cancelar1ActionPerformed

    }//GEN-LAST:event_btn_cancelar1ActionPerformed

    private void cbo_meses2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbo_meses2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbo_meses2ActionPerformed

    private void cbo_years2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbo_years2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbo_years2ActionPerformed

    private void cbo_yearsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbo_yearsActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbo_yearsActionPerformed

    private void cbo_mesesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbo_mesesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbo_mesesActionPerformed

    private void btn_eliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_eliminarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_eliminarActionPerformed

    
    
    
    
 /*_________________________________________________________________________
    
    Metodo para conprobar fechas
 __________________________________________________________________________*/
    
public boolean verificarFecha(){
    
    //para comprobar la fechas
       
            day = Integer.parseInt(cbo_dias.getSelectedItem().toString());
            month = cbo_meses.getSelectedIndex() + 1;
            year = Integer.parseInt(cbo_years.getSelectedItem().toString());
        
            day2 = Integer.parseInt(cbo_dias2.getSelectedItem().toString());
            month2 = cbo_meses2.getSelectedIndex() + 1;
            
            year2 = Integer.parseInt(cbo_years2.getSelectedItem().toString());
        
                if(day > day2 || month > month2){

                   return false;
                    //JOptionPane.showMessageDialog(rootPane, day +":"+ day2 +"/"+ month +":"+ month2);
                }else{

                    
                    fecha_desde = String.valueOf(year+"-"+month+"-"+day);          
                    fecha_hasta = String.valueOf(year2+"-"+month2+"-"+day2);          

                    return true;
                    
                    // JOptionPane.showMessageDialog(rootPane, day +":"+ day2 +"/"+ month +":"+ month2);
                 }    
    
}

    
    
    
    
/*_________________________________________________________________________
    
    Metodo para cargar combo
 __________________________________________________________________________*/  
    
    public void cargarCombo(){
        
        fecha.setYear();
        int year = fecha.getYear()+ 1;
        
        for(int i= 0;i<30;i++){        
          cbo_years.addItem(year = year - 1);
          cbo_years2.addItem(year);
         }     
    }
    

    
    
    
    
 /*_________________________________________________________________________
    
    Metodo para gurdar la asistencia de los clientes
 __________________________________________________________________________*/
    
    private void btn_guardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_guardarActionPerformed
       //instanceamos un objeto de tipoa asistencia     
       Asistencias asistencia = new Asistencias();
       String cedula = txt_cedula.getText();
       asistencia.setDate(fecha.fechaEuropa());
            
       
       
       if(Validar.VerificarCedula(cedula) && !cedula.equals("")){
           
           if(asistencia.insertAsistencia(Integer.parseInt(cedula))){
                  
                   JOptionPane.showMessageDialog(this, "cliente asistencias agregada con éxito");
                   cargarTabla();
           }else{
                       JOptionPane.showMessageDialog(this, "El cliente con la cédula " + cedula+ " No existe");
           }
       
       }else{
                
         JOptionPane.showMessageDialog(this, "Cédula incorrecta");
         txt_cedula.setText("");
         txt_cedula.requestFocus();
           
       }
      
    }//GEN-LAST:event_btn_guardarActionPerformed

    
    
 /*_________________________________________________________________________
    
    Metodo para el boton limpiar
 __________________________________________________________________________*/  
    
    private void btn_nuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_nuevoActionPerformed
        this.txt_cedula.setText("");
             
        txt_cedula.requestFocus();
        
    }//GEN-LAST:event_btn_nuevoActionPerformed

    
    
    
  /*_________________________________________________________________________
    
    Metodo para controlar que no escriba letras
 __________________________________________________________________________*/  
      
    private void txt_cedulaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_cedulaKeyTyped
            Validar.soloNumeros(evt);
    }//GEN-LAST:event_txt_cedulaKeyTyped

    private void txt_buscar_cedulaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_buscar_cedulaKeyTyped
            Validar.soloNumeros(evt);
    }//GEN-LAST:event_txt_buscar_cedulaKeyTyped

    
    
    
    
/*_________________________________________________________________________
    
    Metodo para el boton buscar
 __________________________________________________________________________*/  
    private void btn_buscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_buscarActionPerformed
        //vector para agreagar a las columnas titulos
	String titulos[] = {"Cedula","Nombres","Apellidos","Fecha yy-mm-dd"};
	//vector para guaradar los registros que se recupen de la base de datos
	String[] registros = new String[4];//cantidad de las columnas de la tabla
	//asignamos al model el vector de titulos poder insertar en la tabla los registros
	DefaultTableModel modelo = new DefaultTableModel(null,titulos);
	
        int contador = 0;
 
        
        if(txt_buscar_cedula.getText().length() > 0 &&  verificarFecha()){
            
            
            
              int cedula = Integer.parseInt(this.txt_buscar_cedula.getText());
         
                try {

                        CallableStatement cst = conexion.prepareCall("{call sp_asistencia(?,?,?)}");
                        cst.setInt(1,cedula );
                        cst.setString(2,fecha_desde );
                        cst.setString(3,fecha_hasta);
                        rs = cst.executeQuery();

                        while(rs.next()){
                              registros[0] = rs.getString(1);
                              registros[1] = rs.getString(2);
                              registros[2] = rs.getString(3);
                              registros[3] = rs.getString(4);
      
                              txt_result_cedula.setText(rs.getString(1));
                              modelo.addRow(registros);//cargamos los datos al model
                              contador++;
                              
                        }
                    JOptionPane.showMessageDialog(rootPane, "Se encontraron " + contador + " resultados");
                       tabla_asistencia2.setModel(modelo);

                } catch (SQLException ex) {
                    JOptionPane.showMessageDialog(rootPane, ex.getMessage());

                }//find el catch
        }else{
                    JOptionPane.showMessageDialog(rootPane, "Llena el campo de busqueda y seleccione las fechas correctamente");
                   
        }//fin del if para verificar cajas vacias
        
    }//GEN-LAST:event_btn_buscarActionPerformed

    
    
    
    
    
    

    
   
    
    
    
    
/*_________________________________________________________________________
    
    Metodo cargar la tabla de asistencias
 __________________________________________________________________________*/  
    
 public void  cargarTabla(){
     
     //vector para agreagar a las columnas titulos
	String titulos[] = {"Cédula","Nombres","Tipo","Nº Asistencias","Dias Disponibles"};
	//vector para guaradar los registros que se recupen de la base de datos
	String[] registros = new String[5];//cantidad de las columnas de la tabla
	//asignamos al model el vector de titulos poder insertar en la tabla los registros
	DefaultTableModel modelo = new DefaultTableModel(null,titulos);
	//la conexion a la base
	
	//mandamos la sentencia sql
	sql = "select * from vista_asistencias";
			
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
                       
                       

			modelo.addRow(registros);//cargamos los datos al model
		}
		
		tabla_asistencia.setModel(modelo);//cargamos los datos dfel modelo a la tabla
                tabla_asistencia2.setModel(modelo);
                
		
	}catch(SQLException ex){
		JOptionPane.showMessageDialog(null,ex.getMessage());		
		
	}
     
     
 }
    
    
    
    
    
/*_________________________________________________________________________
    
    Metodo para volver al menu principal desde la interfaz de asistencia
 __________________________________________________________________________*/    

    
    
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {

        

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Form_Asistencia().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_buscar;
    private javax.swing.JButton btn_cancelar;
    private javax.swing.JButton btn_cancelar1;
    private javax.swing.JButton btn_eliminar;
    private javax.swing.JButton btn_guardar;
    private javax.swing.JButton btn_nuevo;
    private javax.swing.JComboBox cbo_dias;
    private javax.swing.JComboBox cbo_dias2;
    private javax.swing.JComboBox cbo_meses;
    private javax.swing.JComboBox cbo_meses2;
    private javax.swing.JComboBox cbo_years;
    private javax.swing.JComboBox cbo_years2;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTable tabla_asistencia;
    private javax.swing.JTable tabla_asistencia2;
    private javax.swing.JTextField txt_buscar_cedula;
    private javax.swing.JTextField txt_cedula;
    private javax.swing.JTextField txt_fecha;
    private javax.swing.JTextField txt_result_cedula;
    // End of variables declaration//GEN-END:variables
}
