package forms;
import javax.swing.*;
import Mysql.*;//clase que me hace la conexion
import validaciones.*;//clase paera validar
import general.*;
import java.util.*;
import java.sql.*;
import java.util.logging.*;

public class Form_clientes extends JFrame {
    
        Conexion cn = new Conexion();
        Connection conexion = cn.getConexion();
        PreparedStatement ps;
        ResultSet rs;
        String sql;
        
        //variables
            public String cedula;
            public  String nombres;
            public String apellidos;
            public String dir;
            public String fecha_nac;
            public String sexo;
            public String telefono;
            public String celular;
            
        //declaramos un objeto tipo cliente
            Cliente cliente = new  Cliente();

      public Form_clientes() {
        initComponents();
        setLocationRelativeTo(null);
        setTitle("Clientes");
        this.txt_cedula.requestFocus();
        //para limitar ingreso de caracteres en la cajas      
       this.txt_cedula.setDocument(new Validar(txt_cedula,10));
       this.txt_nombres.setDocument(new Validar(txt_nombres,35));
       this.txt_apellidos.setDocument(new Validar(txt_apellidos,40));
       this.txt_dir.setDocument(new Validar(txt_dir,50));
       this.txt_telefono.setDocument(new Validar(txt_telefono,10));
       this.txt_celular.setDocument(new Validar(txt_celular,10));
       
      
  
        
        
        //generamos los 100 años par el combo box de fecha de nacimiento
        for(int i=100;i>=1;i--){
            
            cbo_year.addItem(1924 + i );
            cbo_años1.addItem(1924 + i );
        
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
       
       
 /*-----------------------------------------------------------------------------------
 $Clientes Codigo genrado por netbeans para la interfas
 -------------------------------------------------------------------------------------*/
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        buttonGroup_sexo = new javax.swing.ButtonGroup();
        panelPrincipal = new javax.swing.JTabbedPane();
        spanel_personales = new javax.swing.JScrollPane();
        jPanel4 = new javax.swing.JPanel();
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
        jPanel3 = new javax.swing.JPanel();
        jLabel56 = new javax.swing.JLabel();
        jLabel58 = new javax.swing.JLabel();
        cbo_membresia = new javax.swing.JComboBox();
        jLabel57 = new javax.swing.JLabel();
        txt_dias = new javax.swing.JTextField();
        jLabel59 = new javax.swing.JLabel();
        jLabel60 = new javax.swing.JLabel();
        txt_prox_pago = new javax.swing.JTextField();
        cbo_dias1 = new javax.swing.JComboBox();
        cbo_meses1 = new javax.swing.JComboBox();
        cbo_años1 = new javax.swing.JComboBox();
        btn_siguiente2 = new javax.swing.JButton();
        btn_limpiar2 = new javax.swing.JButton();
        jSeparator2 = new javax.swing.JSeparator();
        txt_costo = new javax.swing.JTextField();
        txt_costo2 = new javax.swing.JTextField();
        jLabel71 = new javax.swing.JLabel();
        spanel_ficha = new javax.swing.JScrollPane();
        jPanel1 = new javax.swing.JPanel();
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
        jLabel53 = new javax.swing.JLabel();
        txt_cadera = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        spanel_finales = new javax.swing.JScrollPane();
        jPanel2 = new javax.swing.JPanel();
        jLabel25 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
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
        jLabel43 = new javax.swing.JLabel();
        jLabel44 = new javax.swing.JLabel();
        jLabel45 = new javax.swing.JLabel();
        jLabel46 = new javax.swing.JLabel();
        jLabel47 = new javax.swing.JLabel();
        jLabel48 = new javax.swing.JLabel();
        jLabel49 = new javax.swing.JLabel();
        jLabel50 = new javax.swing.JLabel();
        jLabel51 = new javax.swing.JLabel();
        jLabel54 = new javax.swing.JLabel();
        jLabel55 = new javax.swing.JLabel();
        jLabel61 = new javax.swing.JLabel();
        jLabel62 = new javax.swing.JLabel();
        jLabel63 = new javax.swing.JLabel();
        jLabel64 = new javax.swing.JLabel();
        jLabel65 = new javax.swing.JLabel();
        jLabel66 = new javax.swing.JLabel();
        jLabel67 = new javax.swing.JLabel();
        jLabel68 = new javax.swing.JLabel();
        jLabel69 = new javax.swing.JLabel();
        jLabel70 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        panelPrincipal.setBackground(new java.awt.Color(250, 250, 250));
        panelPrincipal.setForeground(new java.awt.Color(110, 110, 110));
        panelPrincipal.setTabLayoutPolicy(javax.swing.JTabbedPane.SCROLL_TAB_LAYOUT);
        panelPrincipal.setAutoscrolls(true);
        panelPrincipal.setFont(new java.awt.Font("Verdana", 0, 16)); // NOI18N
        panelPrincipal.setPreferredSize(new java.awt.Dimension(800, 600));

        spanel_personales.setBorder(null);
        spanel_personales.setPreferredSize(new java.awt.Dimension(800, 600));

        jPanel4.setBackground(new java.awt.Color(250, 250, 250));
        jPanel4.setToolTipText("");
        jPanel4.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jPanel4.setPreferredSize(new java.awt.Dimension(800, 900));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel10.setFont(new java.awt.Font("Verdana", 0, 16)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(110, 110, 110));
        jLabel10.setText("Cédula:");
        jPanel4.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 150, -1, -1));

        jLabel11.setFont(new java.awt.Font("Verdana", 0, 16)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(110, 110, 110));
        jLabel11.setText("Nombre:");
        jPanel4.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 210, -1, -1));

        jLabel12.setFont(new java.awt.Font("Verdana", 0, 16)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(110, 110, 110));
        jLabel12.setText("Apellido:");
        jPanel4.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 270, -1, -1));

        jLabel13.setFont(new java.awt.Font("Verdana", 0, 16)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(110, 110, 110));
        jLabel13.setText("Teléfono:");
        jPanel4.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(181, 480, -1, -1));

        jLabel14.setFont(new java.awt.Font("Verdana", 0, 16)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(110, 110, 110));
        jLabel14.setText("Fecha Nacimiento:");
        jPanel4.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(181, 380, -1, -1));

        jLabel15.setFont(new java.awt.Font("Verdana", 0, 16)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(110, 110, 110));
        jLabel15.setText("Dirección:");
        jPanel4.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 330, -1, -1));

        jLabel16.setFont(new java.awt.Font("Verdana", 0, 16)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(110, 110, 110));
        jLabel16.setText("Sexo:");
        jPanel4.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(181, 430, -1, -1));

        jLabel17.setFont(new java.awt.Font("Verdana", 0, 16)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(110, 110, 110));
        jLabel17.setText("Celular:");
        jPanel4.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(181, 550, -1, -1));

        txt_nombres.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        txt_nombres.setForeground(new java.awt.Color(110, 110, 110));
        txt_nombres.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(202, 202, 202), 1, true));
        txt_nombres.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_nombresKeyTyped(evt);
            }
        });
        jPanel4.add(txt_nombres, new org.netbeans.lib.awtextra.AbsoluteConstraints(321, 200, 350, 39));

        txt_cedula.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        txt_cedula.setForeground(new java.awt.Color(110, 110, 110));
        txt_cedula.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(202, 202, 202), 1, true));
        txt_cedula.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_cedulaKeyTyped(evt);
            }
        });
        jPanel4.add(txt_cedula, new org.netbeans.lib.awtextra.AbsoluteConstraints(321, 140, 350, 39));

        txt_apellidos.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        txt_apellidos.setForeground(new java.awt.Color(110, 110, 110));
        txt_apellidos.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(202, 202, 202), 1, true));
        txt_apellidos.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_apellidosKeyTyped(evt);
            }
        });
        jPanel4.add(txt_apellidos, new org.netbeans.lib.awtextra.AbsoluteConstraints(321, 260, 350, 39));

        txt_dir.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        txt_dir.setForeground(new java.awt.Color(110, 110, 110));
        txt_dir.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(202, 202, 202), 1, true));
        jPanel4.add(txt_dir, new org.netbeans.lib.awtextra.AbsoluteConstraints(321, 320, 350, 39));

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
        jPanel4.add(txt_telefono, new org.netbeans.lib.awtextra.AbsoluteConstraints(321, 480, 350, 39));

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
        jPanel4.add(radio_masculino, new org.netbeans.lib.awtextra.AbsoluteConstraints(381, 440, -1, -1));

        radio_femenino.setBackground(new java.awt.Color(250, 250, 250));
        buttonGroup_sexo.add(radio_femenino);
        radio_femenino.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        radio_femenino.setForeground(new java.awt.Color(110, 110, 110));
        radio_femenino.setText("Femenino");
        jPanel4.add(radio_femenino, new org.netbeans.lib.awtextra.AbsoluteConstraints(531, 440, -1, -1));

        jLabel18.setFont(new java.awt.Font("Verdana", 0, 24)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(110, 110, 110));
        jLabel18.setText("Datos Personales");
        jPanel4.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(331, 2, -1, -1));

        cbo_day.setBackground(new java.awt.Color(250, 250, 250));
        cbo_day.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        cbo_day.setForeground(new java.awt.Color(110, 110, 110));
        cbo_day.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31" }));
        cbo_day.setToolTipText("");
        cbo_day.setBorder(null);
        cbo_day.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel4.add(cbo_day, new org.netbeans.lib.awtextra.AbsoluteConstraints(351, 380, -1, 33));

        cbo_year.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        cbo_year.setForeground(new java.awt.Color(110, 110, 110));
        cbo_year.setToolTipText("");
        cbo_year.setBorder(null);
        cbo_year.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbo_yearActionPerformed(evt);
            }
        });
        jPanel4.add(cbo_year, new org.netbeans.lib.awtextra.AbsoluteConstraints(587, 380, 70, 33));

        cbo_month.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        cbo_month.setForeground(new java.awt.Color(110, 110, 110));
        cbo_month.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio", "Julio", "Agosto", "Septiembre", "Octubre", "Noviembre", "Diciembre" }));
        cbo_month.setToolTipText("");
        cbo_month.setBorder(null);
        cbo_month.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        cbo_month.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbo_monthActionPerformed(evt);
            }
        });
        jPanel4.add(cbo_month, new org.netbeans.lib.awtextra.AbsoluteConstraints(451, 380, -1, 33));

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
        jPanel4.add(btn_cancelar, new org.netbeans.lib.awtextra.AbsoluteConstraints(521, 630, 100, 40));

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
        jPanel4.add(btn_siguiente, new org.netbeans.lib.awtextra.AbsoluteConstraints(251, 630, 100, 40));

        txt_celular.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        txt_celular.setForeground(new java.awt.Color(110, 110, 110));
        txt_celular.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(202, 202, 202), 1, true));
        txt_celular.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_celularKeyTyped(evt);
            }
        });
        jPanel4.add(txt_celular, new org.netbeans.lib.awtextra.AbsoluteConstraints(321, 540, 350, 39));

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
        jPanel4.add(btn_limpiar, new org.netbeans.lib.awtextra.AbsoluteConstraints(391, 630, 100, 40));

        jSeparator3.setBackground(new java.awt.Color(51, 204, 255));
        jPanel4.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(191, 52, 478, 12));

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
        jPanel4.add(btn_volver, new org.netbeans.lib.awtextra.AbsoluteConstraints(21, 30, 70, 90));

        spanel_personales.setViewportView(jPanel4);

        panelPrincipal.addTab("Datos personales", spanel_personales);

        spanel_membresia.setBorder(null);

        jPanel3.setBackground(new java.awt.Color(250, 250, 250));
        jPanel3.setPreferredSize(new java.awt.Dimension(800, 900));
        jPanel3.setLayout(new java.awt.GridBagLayout());

        jLabel56.setFont(new java.awt.Font("Verdana", 0, 24)); // NOI18N
        jLabel56.setForeground(new java.awt.Color(110, 110, 110));
        jLabel56.setText("Datos Personales");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridwidth = 16;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(50, 30, 0, 0);
        jPanel3.add(jLabel56, gridBagConstraints);

        jLabel58.setFont(new java.awt.Font("Verdana", 0, 16)); // NOI18N
        jLabel58.setForeground(new java.awt.Color(110, 110, 110));
        jLabel58.setText("Días:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 17;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.gridwidth = 17;
        gridBagConstraints.ipadx = 7;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(50, 16, 0, 0);
        jPanel3.add(jLabel58, gridBagConstraints);

        cbo_membresia.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        cbo_membresia.setForeground(new java.awt.Color(110, 110, 110));
        cbo_membresia.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Elije membresia" }));
        cbo_membresia.setToolTipText("");
        cbo_membresia.setBorder(null);
        cbo_membresia.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        cbo_membresia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbo_membresiaActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.gridwidth = 10;
        gridBagConstraints.gridheight = 3;
        gridBagConstraints.ipadx = 26;
        gridBagConstraints.ipady = 23;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(40, 30, 0, 0);
        jPanel3.add(cbo_membresia, gridBagConstraints);

        jLabel57.setFont(new java.awt.Font("Verdana", 0, 16)); // NOI18N
        jLabel57.setForeground(new java.awt.Color(110, 110, 110));
        jLabel57.setText("Costo:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 5;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(27, 184, 0, 0);
        jPanel3.add(jLabel57, gridBagConstraints);

        txt_dias.setFont(new java.awt.Font("Verdana", 0, 16)); // NOI18N
        txt_dias.setForeground(new java.awt.Color(110, 110, 110));
        txt_dias.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(202, 202, 202), 1, true));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 34;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.gridwidth = 101;
        gridBagConstraints.gridheight = 2;
        gridBagConstraints.ipadx = 128;
        gridBagConstraints.ipady = 17;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(40, 0, 0, 0);
        jPanel3.add(txt_dias, gridBagConstraints);

        jLabel59.setFont(new java.awt.Font("Verdana", 0, 16)); // NOI18N
        jLabel59.setForeground(new java.awt.Color(110, 110, 110));
        jLabel59.setText("Fecha pago:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 7;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(31, 184, 0, 0);
        jPanel3.add(jLabel59, gridBagConstraints);

        jLabel60.setFont(new java.awt.Font("Verdana", 0, 16)); // NOI18N
        jLabel60.setForeground(new java.awt.Color(110, 110, 110));
        jLabel60.setText("Proximo pago:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 9;
        gridBagConstraints.gridwidth = 3;
        gridBagConstraints.gridheight = 2;
        gridBagConstraints.ipadx = 42;
        gridBagConstraints.ipady = 9;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(47, 184, 0, 0);
        jPanel3.add(jLabel60, gridBagConstraints);

        txt_prox_pago.setFont(new java.awt.Font("Verdana", 0, 16)); // NOI18N
        txt_prox_pago.setForeground(new java.awt.Color(110, 110, 110));
        txt_prox_pago.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(202, 202, 202), 1, true));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 9;
        gridBagConstraints.gridwidth = 134;
        gridBagConstraints.ipadx = 348;
        gridBagConstraints.ipady = 16;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(37, 30, 0, 264);
        jPanel3.add(txt_prox_pago, gridBagConstraints);

        cbo_dias1.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        cbo_dias1.setForeground(new java.awt.Color(110, 110, 110));
        cbo_dias1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31" }));
        cbo_dias1.setToolTipText("");
        cbo_dias1.setBorder(null);
        cbo_dias1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 7;
        gridBagConstraints.gridwidth = 4;
        gridBagConstraints.gridheight = 2;
        gridBagConstraints.ipadx = 29;
        gridBagConstraints.ipady = 13;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(21, 30, 0, 0);
        jPanel3.add(cbo_dias1, gridBagConstraints);

        cbo_meses1.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        cbo_meses1.setForeground(new java.awt.Color(110, 110, 110));
        cbo_meses1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio", "Julio", "Agosto", "Septiembre", "Octubre", "Noviembre", "Diciembre" }));
        cbo_meses1.setToolTipText("");
        cbo_meses1.setBorder(null);
        cbo_meses1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        cbo_meses1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbo_meses1ActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 9;
        gridBagConstraints.gridy = 7;
        gridBagConstraints.gridwidth = 26;
        gridBagConstraints.gridheight = 2;
        gridBagConstraints.ipady = 13;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(21, 60, 0, 0);
        jPanel3.add(cbo_meses1, gridBagConstraints);

        cbo_años1.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        cbo_años1.setForeground(new java.awt.Color(110, 110, 110));
        cbo_años1.setToolTipText("");
        cbo_años1.setBorder(null);
        cbo_años1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbo_años1ActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 57;
        gridBagConstraints.gridy = 7;
        gridBagConstraints.gridwidth = 42;
        gridBagConstraints.gridheight = 2;
        gridBagConstraints.ipadx = 44;
        gridBagConstraints.ipady = 13;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(21, 30, 0, 0);
        jPanel3.add(cbo_años1, gridBagConstraints);

        btn_siguiente2.setBackground(new java.awt.Color(0, 153, 204));
        btn_siguiente2.setFont(new java.awt.Font("Verdana", 0, 16)); // NOI18N
        btn_siguiente2.setForeground(new java.awt.Color(255, 255, 255));
        btn_siguiente2.setText("Siguiente");
        btn_siguiente2.setBorder(null);
        btn_siguiente2.setBorderPainted(false);
        btn_siguiente2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_siguiente2.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 5;
        gridBagConstraints.gridy = 11;
        gridBagConstraints.gridwidth = 5;
        gridBagConstraints.ipadx = 23;
        gridBagConstraints.ipady = 19;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(60, 10, 410, 0);
        jPanel3.add(btn_siguiente2, gridBagConstraints);

        btn_limpiar2.setBackground(new java.awt.Color(0, 153, 204));
        btn_limpiar2.setFont(new java.awt.Font("Verdana", 0, 16)); // NOI18N
        btn_limpiar2.setForeground(new java.awt.Color(255, 255, 255));
        btn_limpiar2.setText("Limpiar");
        btn_limpiar2.setBorder(null);
        btn_limpiar2.setBorderPainted(false);
        btn_limpiar2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 17;
        gridBagConstraints.gridy = 11;
        gridBagConstraints.gridwidth = 41;
        gridBagConstraints.ipadx = 39;
        gridBagConstraints.ipady = 19;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(60, 20, 410, 0);
        jPanel3.add(btn_limpiar2, gridBagConstraints);

        jSeparator2.setBackground(new java.awt.Color(51, 204, 255));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.gridwidth = 100;
        gridBagConstraints.ipadx = 425;
        gridBagConstraints.ipady = 9;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(30, 224, 0, 0);
        jPanel3.add(jSeparator2, gridBagConstraints);

        txt_costo.setFont(new java.awt.Font("Verdana", 0, 16)); // NOI18N
        txt_costo.setForeground(new java.awt.Color(110, 110, 110));
        txt_costo.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(202, 202, 202), 1, true));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 5;
        gridBagConstraints.gridwidth = 134;
        gridBagConstraints.gridheight = 2;
        gridBagConstraints.ipadx = 348;
        gridBagConstraints.ipady = 16;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(17, 30, 0, 264);
        jPanel3.add(txt_costo, gridBagConstraints);

        txt_costo2.setFont(new java.awt.Font("Verdana", 0, 16)); // NOI18N
        txt_costo2.setForeground(new java.awt.Color(110, 110, 110));
        txt_costo2.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(202, 202, 202), 1, true));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 5;
        gridBagConstraints.gridwidth = 134;
        gridBagConstraints.gridheight = 2;
        gridBagConstraints.ipadx = 348;
        gridBagConstraints.ipady = 16;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(17, 30, 0, 264);
        jPanel3.add(txt_costo2, gridBagConstraints);

        jLabel71.setFont(new java.awt.Font("Verdana", 0, 16)); // NOI18N
        jLabel71.setForeground(new java.awt.Color(110, 110, 110));
        jLabel71.setText("Membresia:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.ipadx = 5;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(50, 184, 0, 0);
        jPanel3.add(jLabel71, gridBagConstraints);

        spanel_membresia.setViewportView(jPanel3);

        panelPrincipal.addTab("Datos Membresia", spanel_membresia);

        spanel_ficha.setBorder(null);
        spanel_ficha.setOpaque(false);
        spanel_ficha.setPreferredSize(new java.awt.Dimension(960, 600));

        jPanel1.setBackground(new java.awt.Color(250, 250, 250));
        jPanel1.setPreferredSize(new java.awt.Dimension(800, 900));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel19.setFont(new java.awt.Font("Verdana", 0, 24)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(110, 110, 110));
        jLabel19.setText("Datos Corporales");
        jPanel1.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(143, 46, -1, -1));

        jLabel21.setFont(new java.awt.Font("Verdana", 0, 16)); // NOI18N
        jLabel21.setForeground(new java.awt.Color(110, 110, 110));
        jLabel21.setText("Nivel:");
        jPanel1.add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(37, 130, -1, -1));

        cbo_nivel.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        cbo_nivel.setForeground(new java.awt.Color(110, 110, 110));
        cbo_nivel.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Principiante", "Intermidio", "Experto" }));
        cbo_nivel.setToolTipText("");
        cbo_nivel.setBorder(null);
        cbo_nivel.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        cbo_nivel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbo_nivelActionPerformed(evt);
            }
        });
        jPanel1.add(cbo_nivel, new org.netbeans.lib.awtextra.AbsoluteConstraints(147, 120, 180, 40));

        jLabel22.setFont(new java.awt.Font("Verdana", 0, 16)); // NOI18N
        jLabel22.setForeground(new java.awt.Color(110, 110, 110));
        jLabel22.setText("Peso Kg:");
        jPanel1.add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(37, 190, -1, -1));

        txt_peso.setFont(new java.awt.Font("Verdana", 0, 16)); // NOI18N
        txt_peso.setForeground(new java.awt.Color(110, 110, 110));
        txt_peso.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(202, 202, 202), 1, true));
        jPanel1.add(txt_peso, new org.netbeans.lib.awtextra.AbsoluteConstraints(147, 180, 350, 39));

        jLabel23.setFont(new java.awt.Font("Verdana", 0, 16)); // NOI18N
        jLabel23.setForeground(new java.awt.Color(110, 110, 110));
        jLabel23.setText("Altura cm:");
        jPanel1.add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(37, 250, -1, -1));

        txt_altura.setFont(new java.awt.Font("Verdana", 0, 16)); // NOI18N
        txt_altura.setForeground(new java.awt.Color(110, 110, 110));
        txt_altura.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(202, 202, 202), 1, true));
        jPanel1.add(txt_altura, new org.netbeans.lib.awtextra.AbsoluteConstraints(147, 240, 350, 39));

        jLabel24.setFont(new java.awt.Font("Verdana", 0, 16)); // NOI18N
        jLabel24.setForeground(new java.awt.Color(110, 110, 110));
        jLabel24.setText("Cintura cm:");
        jPanel1.add(jLabel24, new org.netbeans.lib.awtextra.AbsoluteConstraints(37, 300, 105, -1));

        txt_cintura.setFont(new java.awt.Font("Verdana", 0, 16)); // NOI18N
        txt_cintura.setForeground(new java.awt.Color(110, 110, 110));
        txt_cintura.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(202, 202, 202), 1, true));
        jPanel1.add(txt_cintura, new org.netbeans.lib.awtextra.AbsoluteConstraints(147, 290, 350, 39));

        btn_siguiente3.setBackground(new java.awt.Color(0, 153, 204));
        btn_siguiente3.setFont(new java.awt.Font("Verdana", 0, 16)); // NOI18N
        btn_siguiente3.setForeground(new java.awt.Color(255, 255, 255));
        btn_siguiente3.setText("Siguiente");
        btn_siguiente3.setBorder(null);
        btn_siguiente3.setBorderPainted(false);
        btn_siguiente3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel1.add(btn_siguiente3, new org.netbeans.lib.awtextra.AbsoluteConstraints(127, 500, 100, 40));

        btn_limpiar3.setBackground(new java.awt.Color(0, 153, 204));
        btn_limpiar3.setFont(new java.awt.Font("Verdana", 0, 16)); // NOI18N
        btn_limpiar3.setForeground(new java.awt.Color(255, 255, 255));
        btn_limpiar3.setText("Limpiar");
        btn_limpiar3.setBorder(null);
        btn_limpiar3.setBorderPainted(false);
        btn_limpiar3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel1.add(btn_limpiar3, new org.netbeans.lib.awtextra.AbsoluteConstraints(287, 500, 100, 40));

        jLabel52.setFont(new java.awt.Font("Verdana", 0, 16)); // NOI18N
        jLabel52.setForeground(new java.awt.Color(110, 110, 110));
        jLabel52.setText("Cuello cm:");
        jPanel1.add(jLabel52, new org.netbeans.lib.awtextra.AbsoluteConstraints(37, 360, -1, -1));

        txt_cuello.setFont(new java.awt.Font("Verdana", 0, 16)); // NOI18N
        txt_cuello.setForeground(new java.awt.Color(110, 110, 110));
        txt_cuello.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(202, 202, 202), 1, true));
        jPanel1.add(txt_cuello, new org.netbeans.lib.awtextra.AbsoluteConstraints(147, 350, 350, 39));

        jLabel53.setFont(new java.awt.Font("Verdana", 0, 16)); // NOI18N
        jLabel53.setForeground(new java.awt.Color(110, 110, 110));
        jLabel53.setText("Cadera cm:");
        jPanel1.add(jLabel53, new org.netbeans.lib.awtextra.AbsoluteConstraints(37, 410, 97, -1));

        txt_cadera.setFont(new java.awt.Font("Verdana", 0, 16)); // NOI18N
        txt_cadera.setForeground(new java.awt.Color(110, 110, 110));
        txt_cadera.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(202, 202, 202), 1, true));
        jPanel1.add(txt_cadera, new org.netbeans.lib.awtextra.AbsoluteConstraints(147, 400, 350, 39));

        jSeparator1.setBackground(new java.awt.Color(51, 204, 255));
        jPanel1.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(37, 90, 490, 10));

        spanel_ficha.setViewportView(jPanel1);

        panelPrincipal.addTab("Ficha ", spanel_ficha);

        spanel_finales.setBorder(null);
        spanel_finales.setPreferredSize(new java.awt.Dimension(800, 600));

        jPanel2.setBackground(new java.awt.Color(250, 250, 250));
        jPanel2.setPreferredSize(new java.awt.Dimension(800, 900));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel25.setFont(new java.awt.Font("Verdana", 0, 24)); // NOI18N
        jLabel25.setForeground(new java.awt.Color(110, 110, 110));
        jLabel25.setText("Datos de Membresia");
        jPanel2.add(jLabel25, new org.netbeans.lib.awtextra.AbsoluteConstraints(277, 480, 260, -1));

        jLabel26.setFont(new java.awt.Font("Verdana", 0, 16)); // NOI18N
        jLabel26.setForeground(new java.awt.Color(0, 153, 255));
        jLabel26.setText("Datos");
        jPanel2.add(jLabel26, new org.netbeans.lib.awtextra.AbsoluteConstraints(157, 430, 63, -1));

        jLabel27.setFont(new java.awt.Font("Verdana", 0, 16)); // NOI18N
        jLabel27.setForeground(new java.awt.Color(110, 110, 110));
        jLabel27.setText("Nombres:");
        jPanel2.add(jLabel27, new org.netbeans.lib.awtextra.AbsoluteConstraints(44, 135, -1, -1));

        jLabel28.setFont(new java.awt.Font("Verdana", 0, 16)); // NOI18N
        jLabel28.setForeground(new java.awt.Color(110, 110, 110));
        jLabel28.setText("Apellidos:");
        jPanel2.add(jLabel28, new org.netbeans.lib.awtextra.AbsoluteConstraints(44, 170, -1, -1));

        jLabel29.setFont(new java.awt.Font("Verdana", 0, 16)); // NOI18N
        jLabel29.setForeground(new java.awt.Color(110, 110, 110));
        jLabel29.setText("Dirección:");
        jPanel2.add(jLabel29, new org.netbeans.lib.awtextra.AbsoluteConstraints(44, 209, -1, -1));

        jLabel30.setFont(new java.awt.Font("Verdana", 0, 16)); // NOI18N
        jLabel30.setForeground(new java.awt.Color(110, 110, 110));
        jLabel30.setText("Edad");
        jPanel2.add(jLabel30, new org.netbeans.lib.awtextra.AbsoluteConstraints(47, 250, -1, -1));

        jLabel32.setFont(new java.awt.Font("Verdana", 0, 16)); // NOI18N
        jLabel32.setForeground(new java.awt.Color(110, 110, 110));
        jLabel32.setText("Masa corporal magra");
        jPanel2.add(jLabel32, new org.netbeans.lib.awtextra.AbsoluteConstraints(397, 200, -1, -1));

        jLabel33.setFont(new java.awt.Font("Verdana", 0, 16)); // NOI18N
        jLabel33.setForeground(new java.awt.Color(110, 110, 110));
        jLabel33.setText("Peso");
        jPanel2.add(jLabel33, new org.netbeans.lib.awtextra.AbsoluteConstraints(47, 290, -1, -1));

        jLabel34.setFont(new java.awt.Font("Verdana", 0, 16)); // NOI18N
        jLabel34.setForeground(new java.awt.Color(110, 110, 110));
        jLabel34.setText("imc");
        jPanel2.add(jLabel34, new org.netbeans.lib.awtextra.AbsoluteConstraints(397, 100, -1, -1));

        jLabel35.setFont(new java.awt.Font("Verdana", 0, 16)); // NOI18N
        jLabel35.setForeground(new java.awt.Color(110, 110, 110));
        jLabel35.setText("indice de Cintura/Altura");
        jPanel2.add(jLabel35, new org.netbeans.lib.awtextra.AbsoluteConstraints(397, 240, -1, -1));

        jLabel36.setFont(new java.awt.Font("Verdana", 0, 16)); // NOI18N
        jLabel36.setForeground(new java.awt.Color(110, 110, 110));
        jLabel36.setText("sobrepeso");
        jPanel2.add(jLabel36, new org.netbeans.lib.awtextra.AbsoluteConstraints(397, 160, -1, -1));

        jLabel37.setFont(new java.awt.Font("Verdana", 0, 16)); // NOI18N
        jLabel37.setForeground(new java.awt.Color(110, 110, 110));
        jLabel37.setText("Altura");
        jPanel2.add(jLabel37, new org.netbeans.lib.awtextra.AbsoluteConstraints(47, 370, -1, -1));

        jLabel38.setFont(new java.awt.Font("Verdana", 0, 16)); // NOI18N
        jLabel38.setForeground(new java.awt.Color(110, 110, 110));
        jLabel38.setText("Sexo");
        jPanel2.add(jLabel38, new org.netbeans.lib.awtextra.AbsoluteConstraints(47, 330, -1, -1));

        jLabel39.setFont(new java.awt.Font("Verdana", 0, 16)); // NOI18N
        jLabel39.setForeground(new java.awt.Color(110, 110, 110));
        jLabel39.setText("cuello");
        jPanel2.add(jLabel39, new org.netbeans.lib.awtextra.AbsoluteConstraints(47, 400, -1, -1));

        jLabel40.setFont(new java.awt.Font("Verdana", 0, 16)); // NOI18N
        jLabel40.setForeground(new java.awt.Color(110, 110, 110));
        jLabel40.setText("Cadera");
        jPanel2.add(jLabel40, new org.netbeans.lib.awtextra.AbsoluteConstraints(397, 130, -1, -1));

        jLabel41.setFont(new java.awt.Font("Verdana", 0, 16)); // NOI18N
        jLabel41.setForeground(new java.awt.Color(110, 110, 110));
        jLabel41.setText("cintura");
        jPanel2.add(jLabel41, new org.netbeans.lib.awtextra.AbsoluteConstraints(47, 430, -1, -1));

        jLabel31.setFont(new java.awt.Font("Verdana", 0, 24)); // NOI18N
        jLabel31.setForeground(new java.awt.Color(110, 110, 110));
        jLabel31.setText("Datos Personales");
        jPanel2.add(jLabel31, new org.netbeans.lib.awtextra.AbsoluteConstraints(247, 23, 220, -1));

        jLabel42.setFont(new java.awt.Font("Verdana", 0, 16)); // NOI18N
        jLabel42.setForeground(new java.awt.Color(110, 110, 110));
        jLabel42.setText("Cédula:");
        jPanel2.add(jLabel42, new org.netbeans.lib.awtextra.AbsoluteConstraints(43, 96, -1, -1));

        jLabel43.setFont(new java.awt.Font("Verdana", 0, 16)); // NOI18N
        jLabel43.setForeground(new java.awt.Color(0, 153, 255));
        jLabel43.setText("Datos");
        jPanel2.add(jLabel43, new org.netbeans.lib.awtextra.AbsoluteConstraints(617, 240, 63, -1));

        jLabel44.setFont(new java.awt.Font("Verdana", 0, 16)); // NOI18N
        jLabel44.setForeground(new java.awt.Color(0, 153, 255));
        jLabel44.setText("Datos");
        jPanel2.add(jLabel44, new org.netbeans.lib.awtextra.AbsoluteConstraints(157, 140, 63, -1));

        jLabel45.setFont(new java.awt.Font("Verdana", 0, 16)); // NOI18N
        jLabel45.setForeground(new java.awt.Color(0, 153, 255));
        jLabel45.setText("Datos");
        jPanel2.add(jLabel45, new org.netbeans.lib.awtextra.AbsoluteConstraints(157, 170, 63, -1));

        jLabel46.setFont(new java.awt.Font("Verdana", 0, 16)); // NOI18N
        jLabel46.setForeground(new java.awt.Color(0, 153, 255));
        jLabel46.setText("Datos");
        jPanel2.add(jLabel46, new org.netbeans.lib.awtextra.AbsoluteConstraints(157, 210, 63, -1));

        jLabel47.setFont(new java.awt.Font("Verdana", 0, 16)); // NOI18N
        jLabel47.setForeground(new java.awt.Color(0, 153, 255));
        jLabel47.setText("Datos");
        jPanel2.add(jLabel47, new org.netbeans.lib.awtextra.AbsoluteConstraints(157, 250, 63, -1));

        jLabel48.setFont(new java.awt.Font("Verdana", 0, 16)); // NOI18N
        jLabel48.setForeground(new java.awt.Color(0, 153, 255));
        jLabel48.setText("Datos");
        jPanel2.add(jLabel48, new org.netbeans.lib.awtextra.AbsoluteConstraints(157, 290, 63, -1));

        jLabel49.setFont(new java.awt.Font("Verdana", 0, 16)); // NOI18N
        jLabel49.setForeground(new java.awt.Color(0, 153, 255));
        jLabel49.setText("Datos");
        jPanel2.add(jLabel49, new org.netbeans.lib.awtextra.AbsoluteConstraints(157, 330, 63, -1));

        jLabel50.setFont(new java.awt.Font("Verdana", 0, 16)); // NOI18N
        jLabel50.setForeground(new java.awt.Color(0, 153, 255));
        jLabel50.setText("Datos");
        jPanel2.add(jLabel50, new org.netbeans.lib.awtextra.AbsoluteConstraints(157, 370, 63, -1));

        jLabel51.setFont(new java.awt.Font("Verdana", 0, 16)); // NOI18N
        jLabel51.setForeground(new java.awt.Color(0, 153, 255));
        jLabel51.setText("Datos");
        jPanel2.add(jLabel51, new org.netbeans.lib.awtextra.AbsoluteConstraints(157, 400, 63, -1));

        jLabel54.setFont(new java.awt.Font("Verdana", 0, 16)); // NOI18N
        jLabel54.setForeground(new java.awt.Color(0, 153, 255));
        jLabel54.setText("Datos");
        jPanel2.add(jLabel54, new org.netbeans.lib.awtextra.AbsoluteConstraints(157, 100, 63, -1));

        jLabel55.setFont(new java.awt.Font("Verdana", 0, 16)); // NOI18N
        jLabel55.setForeground(new java.awt.Color(0, 153, 255));
        jLabel55.setText("Datos");
        jPanel2.add(jLabel55, new org.netbeans.lib.awtextra.AbsoluteConstraints(617, 100, 63, -1));

        jLabel61.setFont(new java.awt.Font("Verdana", 0, 16)); // NOI18N
        jLabel61.setForeground(new java.awt.Color(0, 153, 255));
        jLabel61.setText("Datos");
        jPanel2.add(jLabel61, new org.netbeans.lib.awtextra.AbsoluteConstraints(617, 150, 63, -1));

        jLabel62.setFont(new java.awt.Font("Verdana", 0, 16)); // NOI18N
        jLabel62.setForeground(new java.awt.Color(0, 153, 255));
        jLabel62.setText("Datos");
        jPanel2.add(jLabel62, new org.netbeans.lib.awtextra.AbsoluteConstraints(617, 200, 63, -1));

        jLabel63.setFont(new java.awt.Font("Verdana", 0, 16)); // NOI18N
        jLabel63.setForeground(new java.awt.Color(0, 153, 255));
        jLabel63.setText("Datos");
        jPanel2.add(jLabel63, new org.netbeans.lib.awtextra.AbsoluteConstraints(187, 550, 63, -1));

        jLabel64.setFont(new java.awt.Font("Verdana", 0, 16)); // NOI18N
        jLabel64.setForeground(new java.awt.Color(110, 110, 110));
        jLabel64.setText("Tipo");
        jPanel2.add(jLabel64, new org.netbeans.lib.awtextra.AbsoluteConstraints(77, 550, -1, -1));

        jLabel65.setFont(new java.awt.Font("Verdana", 0, 16)); // NOI18N
        jLabel65.setForeground(new java.awt.Color(0, 153, 255));
        jLabel65.setText("Datos");
        jPanel2.add(jLabel65, new org.netbeans.lib.awtextra.AbsoluteConstraints(187, 580, 63, 30));

        jLabel66.setFont(new java.awt.Font("Verdana", 0, 16)); // NOI18N
        jLabel66.setForeground(new java.awt.Color(110, 110, 110));
        jLabel66.setText("cintura");
        jPanel2.add(jLabel66, new org.netbeans.lib.awtextra.AbsoluteConstraints(77, 580, -1, 30));

        jLabel67.setFont(new java.awt.Font("Verdana", 0, 16)); // NOI18N
        jLabel67.setForeground(new java.awt.Color(110, 110, 110));
        jLabel67.setText("cintura");
        jPanel2.add(jLabel67, new org.netbeans.lib.awtextra.AbsoluteConstraints(77, 620, -1, 30));

        jLabel68.setFont(new java.awt.Font("Verdana", 0, 16)); // NOI18N
        jLabel68.setForeground(new java.awt.Color(0, 153, 255));
        jLabel68.setText("Datos");
        jPanel2.add(jLabel68, new org.netbeans.lib.awtextra.AbsoluteConstraints(187, 620, 63, 30));

        jLabel69.setFont(new java.awt.Font("Verdana", 0, 16)); // NOI18N
        jLabel69.setForeground(new java.awt.Color(110, 110, 110));
        jLabel69.setText("cintura");
        jPanel2.add(jLabel69, new org.netbeans.lib.awtextra.AbsoluteConstraints(77, 670, -1, 30));

        jLabel70.setFont(new java.awt.Font("Verdana", 0, 16)); // NOI18N
        jLabel70.setForeground(new java.awt.Color(0, 153, 255));
        jLabel70.setText("Datos");
        jPanel2.add(jLabel70, new org.netbeans.lib.awtextra.AbsoluteConstraints(187, 670, 63, 30));

        spanel_finales.setViewportView(jPanel2);

        panelPrincipal.addTab("Datos finales", spanel_finales);

        getContentPane().add(panelPrincipal, java.awt.BorderLayout.CENTER);

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

    private void cbo_membresiaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbo_membresiaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbo_membresiaActionPerformed

    private void cbo_meses1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbo_meses1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbo_meses1ActionPerformed

    private void cbo_años1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbo_años1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbo_años1ActionPerformed

    private void btn_volverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_volverActionPerformed
        Home frm_home = new Home();
        frm_home.setVisible(true);
        dispose();
        
        
    }//GEN-LAST:event_btn_volverActionPerformed

    
    
    
  /*---------------------------------------------------------------------------------
    metodo para el boto agregar usuario
 -------------------------------------------------------------------------------------*/
    
    private void btn_siguienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_siguienteActionPerformed
               
            cedula = Validar.quitarEspaciosEnBlanco(txt_cedula);
            nombres= Validar.quitarEspaciosEnBlanco(txt_nombres);
            apellidos= Validar.quitarEspaciosEnBlanco(txt_apellidos);
            
            //quitamos espacios al inicioy al final de la cadena
            dir = txt_dir.getText();
              
            
            telefono=Validar.quitarEspaciosEnBlanco(txt_telefono);
            celular=Validar.quitarEspaciosEnBlanco(txt_celular);
         
            //para guargar los que tenga en el combo
            if(this.radio_masculino.isSelected()){
                cliente.setSexo( radio_masculino.getText());
                
            }else{
                cliente.setSexo( radio_femenino.getText());
            }
            
            //fecha
            String day,month,year;
            day = this.cbo_day.getSelectedItem().toString();
            month = String.valueOf(this.cbo_month.getSelectedIndex() + 1);
            year = this.cbo_year.getSelectedItem().toString();
          
           
            
            
            
           
            /*dato importantisimoooooo jajaja por lo simple que es y lo mucho que demore en descubirlo el cadenaTexto.trim().length() > 0   en las cadenas verifica
             que asi se ponga espacios en blanco en una cadena  nos dara 0  por el contrario devolvera el largo de la cadena ya que si solo ponemos  cadenaTextp.lenght( )> 0 con
            espacios en blanco falla y nos devuelve el numero de caracteres en blanco que ingresemos */
            
                if(  cedula.length() > 0 && nombres.length() >  0 && apellidos.length() > 0 
                && dir.trim().length() > 0  && telefono.length() > 0  && celular.length() > 0)
                {
                    
                  if(Validar.Numero(cedula)){
                    cliente.setCi(Long.parseLong(cedula));
                    cliente.setNombres(nombres);
                    cliente.setApellidos(apellidos);
                    cliente.setDir(dir.trim());
                    cliente.setFechaNacimiento(year + "-" + month + "-" + day);
                    JOptionPane.showMessageDialog(rootPane, "Todo ok " + cliente.getFechaNacimiento() +"  "+ cliente.getSexo() + " " + cliente.getDir());
                  }else{
                       JOptionPane.showMessageDialog(rootPane, "cedula incorrecta");
                  }
                                                      
                  
                    
                }else{
                        JOptionPane.showMessageDialog(rootPane, "Llene todos los campos");
                }
                
           
        
            //panelPrincipal.setSelectedIndex(1);
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
        limpiar();
           Home frm_home = new Home();
        frm_home.setVisible(true);
        dispose();
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

  
    public static void main(String args[]) {
        
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Form_clientes().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_cancelar;
    private javax.swing.JButton btn_limpiar;
    private javax.swing.JButton btn_limpiar2;
    private javax.swing.JButton btn_limpiar3;
    private javax.swing.JButton btn_siguiente;
    private javax.swing.JButton btn_siguiente2;
    private javax.swing.JButton btn_siguiente3;
    private javax.swing.JButton btn_volver;
    private javax.swing.ButtonGroup buttonGroup_sexo;
    private javax.swing.JComboBox cbo_años1;
    private javax.swing.JComboBox cbo_day;
    private javax.swing.JComboBox cbo_dias1;
    private javax.swing.JComboBox cbo_membresia;
    private javax.swing.JComboBox cbo_meses1;
    private javax.swing.JComboBox cbo_month;
    private javax.swing.JComboBox cbo_nivel;
    private javax.swing.JComboBox cbo_year;
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
    private javax.swing.JLabel jLabel26;
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
    private javax.swing.JLabel jLabel47;
    private javax.swing.JLabel jLabel48;
    private javax.swing.JLabel jLabel49;
    private javax.swing.JLabel jLabel50;
    private javax.swing.JLabel jLabel51;
    private javax.swing.JLabel jLabel52;
    private javax.swing.JLabel jLabel53;
    private javax.swing.JLabel jLabel54;
    private javax.swing.JLabel jLabel55;
    private javax.swing.JLabel jLabel56;
    private javax.swing.JLabel jLabel57;
    private javax.swing.JLabel jLabel58;
    private javax.swing.JLabel jLabel59;
    private javax.swing.JLabel jLabel60;
    private javax.swing.JLabel jLabel61;
    private javax.swing.JLabel jLabel62;
    private javax.swing.JLabel jLabel63;
    private javax.swing.JLabel jLabel64;
    private javax.swing.JLabel jLabel65;
    private javax.swing.JLabel jLabel66;
    private javax.swing.JLabel jLabel67;
    private javax.swing.JLabel jLabel68;
    private javax.swing.JLabel jLabel69;
    private javax.swing.JLabel jLabel70;
    private javax.swing.JLabel jLabel71;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JTabbedPane panelPrincipal;
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
    private javax.swing.JTextField txt_costo2;
    private javax.swing.JTextField txt_cuello;
    private javax.swing.JTextField txt_dias;
    private javax.swing.JTextField txt_dir;
    private javax.swing.JTextField txt_nombres;
    private javax.swing.JTextField txt_peso;
    private javax.swing.JTextField txt_prox_pago;
    private javax.swing.JTextField txt_telefono;
    // End of variables declaration//GEN-END:variables
}
