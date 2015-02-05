package forms;
import javax.swing.*;

public class Form_clientes extends JFrame {

      public Form_clientes() {
        initComponents();
        setLocationRelativeTo(null);
        setTitle("Clientes");
  
        
        
        //generamos los 100 años par el combo box de fecha de nacimiento
        for(int i=100;i>=1;i--){
            
            cbo_años.addItem(1924 + i );
            cbo_años1.addItem(1924 + i );
        
        }
        
        
    }

       
       
       
 /*---------------------------------------------------------
 $Clientes Codigo genrado por netbeans para la interfas
 ----------------------------------------------------------*/
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup_sexo = new javax.swing.ButtonGroup();
        jTabbedPane1 = new javax.swing.JTabbedPane();
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
        cbo_dias = new javax.swing.JComboBox();
        cbo_años = new javax.swing.JComboBox();
        cbo_meses = new javax.swing.JComboBox();
        btn_cancelar = new javax.swing.JButton();
        btn_siguiente = new javax.swing.JButton();
        jScrollBar2 = new javax.swing.JScrollBar();
        txt_celular1 = new javax.swing.JTextField();
        btn_limpiar = new javax.swing.JButton();
        spanel_membresia = new javax.swing.JScrollPane();
        jPanel3 = new javax.swing.JPanel();
        jLabel56 = new javax.swing.JLabel();
        jLabel58 = new javax.swing.JLabel();
        cbo_membresia = new javax.swing.JComboBox();
        jLabel57 = new javax.swing.JLabel();
        txt_costo = new javax.swing.JTextField();
        jLabel59 = new javax.swing.JLabel();
        jLabel60 = new javax.swing.JLabel();
        txt_prox_pago = new javax.swing.JTextField();
        cbo_dias1 = new javax.swing.JComboBox();
        cbo_meses1 = new javax.swing.JComboBox();
        cbo_años1 = new javax.swing.JComboBox();
        btn_siguiente2 = new javax.swing.JButton();
        btn_limpiar2 = new javax.swing.JButton();
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
        setPreferredSize(new java.awt.Dimension(800, 600));

        jTabbedPane1.setForeground(new java.awt.Color(110, 110, 110));
        jTabbedPane1.setTabLayoutPolicy(javax.swing.JTabbedPane.SCROLL_TAB_LAYOUT);
        jTabbedPane1.setAutoscrolls(true);
        jTabbedPane1.setFont(new java.awt.Font("Verdana", 0, 16)); // NOI18N
        jTabbedPane1.setPreferredSize(new java.awt.Dimension(800, 600));

        spanel_personales.setBorder(null);
        spanel_personales.setPreferredSize(new java.awt.Dimension(800, 600));

        jPanel4.setToolTipText("");
        jPanel4.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jPanel4.setPreferredSize(new java.awt.Dimension(800, 900));
        jPanel4.setLayout(null);

        jLabel10.setFont(new java.awt.Font("Verdana", 0, 16)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(110, 110, 110));
        jLabel10.setText("Cédula:");
        jPanel4.add(jLabel10);
        jLabel10.setBounds(130, 120, 63, 21);

        jLabel11.setFont(new java.awt.Font("Verdana", 0, 16)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(110, 110, 110));
        jLabel11.setText("Nombres:");
        jPanel4.add(jLabel11);
        jLabel11.setBounds(130, 180, 79, 21);

        jLabel12.setFont(new java.awt.Font("Verdana", 0, 16)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(110, 110, 110));
        jLabel12.setText("Apellidos:");
        jPanel4.add(jLabel12);
        jLabel12.setBounds(130, 240, 82, 21);

        jLabel13.setFont(new java.awt.Font("Verdana", 0, 16)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(110, 110, 110));
        jLabel13.setText("Teléfono:");
        jPanel4.add(jLabel13);
        jLabel13.setBounds(130, 440, 78, 21);

        jLabel14.setFont(new java.awt.Font("Verdana", 0, 16)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(110, 110, 110));
        jLabel14.setText("Fecha Nacimiento:");
        jPanel4.add(jLabel14);
        jLabel14.setBounds(130, 330, 152, 21);

        jLabel15.setFont(new java.awt.Font("Verdana", 0, 16)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(110, 110, 110));
        jLabel15.setText("Dirección:");
        jPanel4.add(jLabel15);
        jLabel15.setBounds(130, 290, 81, 21);

        jLabel16.setFont(new java.awt.Font("Verdana", 0, 16)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(110, 110, 110));
        jLabel16.setText("Sexo:");
        jPanel4.add(jLabel16);
        jLabel16.setBounds(130, 380, 46, 21);

        jLabel17.setFont(new java.awt.Font("Verdana", 0, 16)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(110, 110, 110));
        jLabel17.setText("Celular:");
        jPanel4.add(jLabel17);
        jLabel17.setBounds(130, 490, 64, 21);

        txt_nombres.setFont(new java.awt.Font("Verdana", 0, 16)); // NOI18N
        txt_nombres.setForeground(new java.awt.Color(110, 110, 110));
        txt_nombres.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(202, 202, 202), 1, true));
        jPanel4.add(txt_nombres);
        txt_nombres.setBounds(260, 170, 350, 39);

        txt_cedula.setFont(new java.awt.Font("Verdana", 0, 16)); // NOI18N
        txt_cedula.setForeground(new java.awt.Color(110, 110, 110));
        txt_cedula.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(202, 202, 202), 1, true));
        jPanel4.add(txt_cedula);
        txt_cedula.setBounds(260, 110, 350, 39);

        txt_apellidos.setFont(new java.awt.Font("Verdana", 0, 16)); // NOI18N
        txt_apellidos.setForeground(new java.awt.Color(110, 110, 110));
        txt_apellidos.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(202, 202, 202), 1, true));
        jPanel4.add(txt_apellidos);
        txt_apellidos.setBounds(260, 220, 350, 39);

        txt_dir.setFont(new java.awt.Font("Verdana", 0, 16)); // NOI18N
        txt_dir.setForeground(new java.awt.Color(110, 110, 110));
        txt_dir.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(202, 202, 202), 1, true));
        jPanel4.add(txt_dir);
        txt_dir.setBounds(260, 280, 350, 39);

        txt_telefono.setFont(new java.awt.Font("Verdana", 0, 16)); // NOI18N
        txt_telefono.setForeground(new java.awt.Color(110, 110, 110));
        txt_telefono.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(202, 202, 202), 1, true));
        txt_telefono.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_telefonoActionPerformed(evt);
            }
        });
        jPanel4.add(txt_telefono);
        txt_telefono.setBounds(260, 420, 350, 39);

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
        jPanel4.add(radio_masculino);
        radio_masculino.setBounds(260, 380, 93, 27);

        buttonGroup_sexo.add(radio_femenino);
        radio_femenino.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        radio_femenino.setForeground(new java.awt.Color(110, 110, 110));
        radio_femenino.setText("Femenino");
        jPanel4.add(radio_femenino);
        radio_femenino.setBounds(380, 380, 93, 27);

        jLabel18.setFont(new java.awt.Font("Verdana", 0, 24)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(110, 110, 110));
        jLabel18.setText("Datos Personales");
        jPanel4.add(jLabel18);
        jLabel18.setBounds(290, 50, 206, 30);

        cbo_dias.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        cbo_dias.setForeground(new java.awt.Color(110, 110, 110));
        cbo_dias.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31" }));
        cbo_dias.setToolTipText("");
        cbo_dias.setBorder(null);
        cbo_dias.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel4.add(cbo_dias);
        cbo_dias.setBounds(300, 330, 41, 33);

        cbo_años.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        cbo_años.setForeground(new java.awt.Color(110, 110, 110));
        cbo_años.setToolTipText("");
        cbo_años.setBorder(null);
        cbo_años.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbo_añosActionPerformed(evt);
            }
        });
        jPanel4.add(cbo_años);
        cbo_años.setBounds(540, 330, 70, 33);

        cbo_meses.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        cbo_meses.setForeground(new java.awt.Color(110, 110, 110));
        cbo_meses.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio", "Julio", "Agosto", "Septiembre", "Octubre", "Noviembre", "Diciembre" }));
        cbo_meses.setToolTipText("");
        cbo_meses.setBorder(null);
        cbo_meses.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        cbo_meses.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbo_mesesActionPerformed(evt);
            }
        });
        jPanel4.add(cbo_meses);
        cbo_meses.setBounds(400, 330, 97, 33);

        btn_cancelar.setBackground(new java.awt.Color(0, 153, 204));
        btn_cancelar.setFont(new java.awt.Font("Verdana", 0, 16)); // NOI18N
        btn_cancelar.setForeground(new java.awt.Color(255, 255, 255));
        btn_cancelar.setText("Cancelar");
        btn_cancelar.setBorder(null);
        btn_cancelar.setBorderPainted(false);
        btn_cancelar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_cancelar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jPanel4.add(btn_cancelar);
        btn_cancelar.setBounds(490, 560, 100, 40);

        btn_siguiente.setBackground(new java.awt.Color(0, 153, 204));
        btn_siguiente.setFont(new java.awt.Font("Verdana", 0, 16)); // NOI18N
        btn_siguiente.setForeground(new java.awt.Color(255, 255, 255));
        btn_siguiente.setText("Siguiente");
        btn_siguiente.setBorder(null);
        btn_siguiente.setBorderPainted(false);
        btn_siguiente.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_siguiente.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jPanel4.add(btn_siguiente);
        btn_siguiente.setBounds(230, 560, 100, 40);
        jPanel4.add(jScrollBar2);
        jScrollBar2.setBounds(0, 0, 0, 0);

        txt_celular1.setFont(new java.awt.Font("Verdana", 0, 16)); // NOI18N
        txt_celular1.setForeground(new java.awt.Color(110, 110, 110));
        txt_celular1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(202, 202, 202), 1, true));
        jPanel4.add(txt_celular1);
        txt_celular1.setBounds(260, 480, 350, 39);

        btn_limpiar.setBackground(new java.awt.Color(0, 153, 204));
        btn_limpiar.setFont(new java.awt.Font("Verdana", 0, 16)); // NOI18N
        btn_limpiar.setForeground(new java.awt.Color(255, 255, 255));
        btn_limpiar.setText("Limpiar");
        btn_limpiar.setBorder(null);
        btn_limpiar.setBorderPainted(false);
        btn_limpiar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel4.add(btn_limpiar);
        btn_limpiar.setBounds(360, 560, 100, 40);

        spanel_personales.setViewportView(jPanel4);

        jTabbedPane1.addTab("Datos personales", spanel_personales);

        spanel_membresia.setBorder(null);

        jPanel3.setPreferredSize(new java.awt.Dimension(800, 900));
        jPanel3.setLayout(null);

        jLabel56.setFont(new java.awt.Font("Verdana", 0, 24)); // NOI18N
        jLabel56.setForeground(new java.awt.Color(110, 110, 110));
        jLabel56.setText("Datos Personales");
        jPanel3.add(jLabel56);
        jLabel56.setBounds(260, 60, 206, 30);

        jLabel58.setFont(new java.awt.Font("Verdana", 0, 16)); // NOI18N
        jLabel58.setForeground(new java.awt.Color(110, 110, 110));
        jLabel58.setText("Membresia:");
        jPanel3.add(jLabel58);
        jLabel58.setBounds(120, 190, 95, 21);

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
        jPanel3.add(cbo_membresia);
        cbo_membresia.setBounds(250, 170, 350, 43);

        jLabel57.setFont(new java.awt.Font("Verdana", 0, 16)); // NOI18N
        jLabel57.setForeground(new java.awt.Color(110, 110, 110));
        jLabel57.setText("Costo:");
        jPanel3.add(jLabel57);
        jLabel57.setBounds(120, 250, 54, 21);

        txt_costo.setFont(new java.awt.Font("Verdana", 0, 16)); // NOI18N
        txt_costo.setForeground(new java.awt.Color(110, 110, 110));
        txt_costo.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(202, 202, 202), 1, true));
        jPanel3.add(txt_costo);
        txt_costo.setBounds(250, 230, 350, 39);

        jLabel59.setFont(new java.awt.Font("Verdana", 0, 16)); // NOI18N
        jLabel59.setForeground(new java.awt.Color(110, 110, 110));
        jLabel59.setText("Fecha pago:");
        jPanel3.add(jLabel59);
        jLabel59.setBounds(120, 300, 120, 21);

        jLabel60.setFont(new java.awt.Font("Verdana", 0, 16)); // NOI18N
        jLabel60.setForeground(new java.awt.Color(110, 110, 110));
        jLabel60.setText("Proximo pago:");
        jPanel3.add(jLabel60);
        jLabel60.setBounds(120, 370, 118, 21);

        txt_prox_pago.setFont(new java.awt.Font("Verdana", 0, 16)); // NOI18N
        txt_prox_pago.setForeground(new java.awt.Color(110, 110, 110));
        txt_prox_pago.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(202, 202, 202), 1, true));
        jPanel3.add(txt_prox_pago);
        txt_prox_pago.setBounds(250, 350, 350, 39);

        cbo_dias1.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        cbo_dias1.setForeground(new java.awt.Color(110, 110, 110));
        cbo_dias1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31" }));
        cbo_dias1.setToolTipText("");
        cbo_dias1.setBorder(null);
        cbo_dias1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel3.add(cbo_dias1);
        cbo_dias1.setBounds(250, 290, 70, 33);

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
        jPanel3.add(cbo_meses1);
        cbo_meses1.setBounds(370, 290, 97, 33);

        cbo_años1.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        cbo_años1.setForeground(new java.awt.Color(110, 110, 110));
        cbo_años1.setToolTipText("");
        cbo_años1.setBorder(null);
        cbo_años1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbo_años1ActionPerformed(evt);
            }
        });
        jPanel3.add(cbo_años1);
        cbo_años1.setBounds(520, 290, 80, 33);

        btn_siguiente2.setBackground(new java.awt.Color(0, 153, 204));
        btn_siguiente2.setFont(new java.awt.Font("Verdana", 0, 16)); // NOI18N
        btn_siguiente2.setForeground(new java.awt.Color(255, 255, 255));
        btn_siguiente2.setText("Siguiente");
        btn_siguiente2.setBorder(null);
        btn_siguiente2.setBorderPainted(false);
        btn_siguiente2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_siguiente2.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jPanel3.add(btn_siguiente2);
        btn_siguiente2.setBounds(290, 450, 100, 40);

        btn_limpiar2.setBackground(new java.awt.Color(0, 153, 204));
        btn_limpiar2.setFont(new java.awt.Font("Verdana", 0, 16)); // NOI18N
        btn_limpiar2.setForeground(new java.awt.Color(255, 255, 255));
        btn_limpiar2.setText("Limpiar");
        btn_limpiar2.setBorder(null);
        btn_limpiar2.setBorderPainted(false);
        btn_limpiar2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel3.add(btn_limpiar2);
        btn_limpiar2.setBounds(430, 450, 100, 40);

        spanel_membresia.setViewportView(jPanel3);

        jTabbedPane1.addTab("Datos Membresia", spanel_membresia);

        spanel_ficha.setBorder(null);
        spanel_ficha.setOpaque(false);
        spanel_ficha.setPreferredSize(new java.awt.Dimension(960, 600));

        jPanel1.setPreferredSize(new java.awt.Dimension(800, 900));

        jLabel19.setFont(new java.awt.Font("Verdana", 0, 24)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(110, 110, 110));
        jLabel19.setText("Datos Corporales");

        jLabel21.setFont(new java.awt.Font("Verdana", 0, 16)); // NOI18N
        jLabel21.setForeground(new java.awt.Color(110, 110, 110));
        jLabel21.setText("Nivel:");

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

        jLabel22.setFont(new java.awt.Font("Verdana", 0, 16)); // NOI18N
        jLabel22.setForeground(new java.awt.Color(110, 110, 110));
        jLabel22.setText("Peso Kg:");

        txt_peso.setFont(new java.awt.Font("Verdana", 0, 16)); // NOI18N
        txt_peso.setForeground(new java.awt.Color(110, 110, 110));
        txt_peso.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(202, 202, 202), 1, true));

        jLabel23.setFont(new java.awt.Font("Verdana", 0, 16)); // NOI18N
        jLabel23.setForeground(new java.awt.Color(110, 110, 110));
        jLabel23.setText("Altura cm:");

        txt_altura.setFont(new java.awt.Font("Verdana", 0, 16)); // NOI18N
        txt_altura.setForeground(new java.awt.Color(110, 110, 110));
        txt_altura.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(202, 202, 202), 1, true));

        jLabel24.setFont(new java.awt.Font("Verdana", 0, 16)); // NOI18N
        jLabel24.setForeground(new java.awt.Color(110, 110, 110));
        jLabel24.setText("Cintura cm:");

        txt_cintura.setFont(new java.awt.Font("Verdana", 0, 16)); // NOI18N
        txt_cintura.setForeground(new java.awt.Color(110, 110, 110));
        txt_cintura.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(202, 202, 202), 1, true));

        btn_siguiente3.setBackground(new java.awt.Color(0, 153, 204));
        btn_siguiente3.setFont(new java.awt.Font("Verdana", 0, 16)); // NOI18N
        btn_siguiente3.setForeground(new java.awt.Color(255, 255, 255));
        btn_siguiente3.setText("Siguiente");
        btn_siguiente3.setBorder(null);
        btn_siguiente3.setBorderPainted(false);
        btn_siguiente3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        btn_limpiar3.setBackground(new java.awt.Color(0, 153, 204));
        btn_limpiar3.setFont(new java.awt.Font("Verdana", 0, 16)); // NOI18N
        btn_limpiar3.setForeground(new java.awt.Color(255, 255, 255));
        btn_limpiar3.setText("Limpiar");
        btn_limpiar3.setBorder(null);
        btn_limpiar3.setBorderPainted(false);
        btn_limpiar3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        jLabel52.setFont(new java.awt.Font("Verdana", 0, 16)); // NOI18N
        jLabel52.setForeground(new java.awt.Color(110, 110, 110));
        jLabel52.setText("Cuello cm:");

        txt_cuello.setFont(new java.awt.Font("Verdana", 0, 16)); // NOI18N
        txt_cuello.setForeground(new java.awt.Color(110, 110, 110));
        txt_cuello.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(202, 202, 202), 1, true));

        jLabel53.setFont(new java.awt.Font("Verdana", 0, 16)); // NOI18N
        jLabel53.setForeground(new java.awt.Color(110, 110, 110));
        jLabel53.setText("Cadera cm:");

        txt_cadera.setFont(new java.awt.Font("Verdana", 0, 16)); // NOI18N
        txt_cadera.setForeground(new java.awt.Color(110, 110, 110));
        txt_cadera.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(202, 202, 202), 1, true));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(178, 178, 178)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(btn_siguiente3, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(49, 49, 49)
                            .addComponent(btn_limpiar3, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(120, 120, 120))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(jLabel53, javax.swing.GroupLayout.DEFAULT_SIZE, 97, Short.MAX_VALUE)
                            .addGap(18, 18, 18)
                            .addComponent(txt_cadera, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(jLabel52)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txt_cuello, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel22)
                                .addComponent(jLabel21))
                            .addGap(38, 38, 38)
                            .addComponent(txt_peso, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel24, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(jLabel23)
                                    .addGap(0, 0, Short.MAX_VALUE)))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(txt_altura, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txt_cintura, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(88, 88, 88)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(cbo_nivel, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel19))))
                .addContainerGap(157, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(46, 46, 46)
                .addComponent(jLabel19)
                .addGap(30, 30, 30)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cbo_nivel, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel21))
                .addGap(22, 22, 22)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_peso, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel22))
                .addGap(25, 25, 25)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_altura, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel23))
                .addGap(30, 30, 30)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel24)
                    .addComponent(txt_cintura, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel52)
                    .addComponent(txt_cuello, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel53)
                    .addComponent(txt_cadera, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(65, 65, 65)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_siguiente3, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_limpiar3, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        spanel_ficha.setViewportView(jPanel1);

        jTabbedPane1.addTab("Ficha ", spanel_ficha);

        spanel_finales.setBorder(null);
        spanel_finales.setPreferredSize(new java.awt.Dimension(800, 600));

        jPanel2.setPreferredSize(new java.awt.Dimension(800, 900));
        jPanel2.setLayout(null);

        jLabel25.setFont(new java.awt.Font("Verdana", 0, 24)); // NOI18N
        jLabel25.setForeground(new java.awt.Color(110, 110, 110));
        jLabel25.setText("Datos de Membresia");
        jPanel2.add(jLabel25);
        jLabel25.setBounds(400, 480, 260, 30);

        jLabel26.setFont(new java.awt.Font("Verdana", 0, 16)); // NOI18N
        jLabel26.setForeground(new java.awt.Color(0, 153, 255));
        jLabel26.setText("Datos");
        jPanel2.add(jLabel26);
        jLabel26.setBounds(280, 430, 63, 21);

        jLabel27.setFont(new java.awt.Font("Verdana", 0, 16)); // NOI18N
        jLabel27.setForeground(new java.awt.Color(110, 110, 110));
        jLabel27.setText("Nombres:");
        jPanel2.add(jLabel27);
        jLabel27.setBounds(167, 135, 79, 21);

        jLabel28.setFont(new java.awt.Font("Verdana", 0, 16)); // NOI18N
        jLabel28.setForeground(new java.awt.Color(110, 110, 110));
        jLabel28.setText("Apellidos:");
        jPanel2.add(jLabel28);
        jLabel28.setBounds(167, 170, 82, 21);

        jLabel29.setFont(new java.awt.Font("Verdana", 0, 16)); // NOI18N
        jLabel29.setForeground(new java.awt.Color(110, 110, 110));
        jLabel29.setText("Dirección:");
        jPanel2.add(jLabel29);
        jLabel29.setBounds(167, 209, 81, 21);

        jLabel30.setFont(new java.awt.Font("Verdana", 0, 16)); // NOI18N
        jLabel30.setForeground(new java.awt.Color(110, 110, 110));
        jLabel30.setText("Edad");
        jPanel2.add(jLabel30);
        jLabel30.setBounds(170, 250, 40, 21);

        jLabel32.setFont(new java.awt.Font("Verdana", 0, 16)); // NOI18N
        jLabel32.setForeground(new java.awt.Color(110, 110, 110));
        jLabel32.setText("Masa corporal magra");
        jPanel2.add(jLabel32);
        jLabel32.setBounds(520, 200, 170, 21);

        jLabel33.setFont(new java.awt.Font("Verdana", 0, 16)); // NOI18N
        jLabel33.setForeground(new java.awt.Color(110, 110, 110));
        jLabel33.setText("Peso");
        jPanel2.add(jLabel33);
        jLabel33.setBounds(170, 290, 39, 21);

        jLabel34.setFont(new java.awt.Font("Verdana", 0, 16)); // NOI18N
        jLabel34.setForeground(new java.awt.Color(110, 110, 110));
        jLabel34.setText("imc");
        jPanel2.add(jLabel34);
        jLabel34.setBounds(520, 100, 28, 21);

        jLabel35.setFont(new java.awt.Font("Verdana", 0, 16)); // NOI18N
        jLabel35.setForeground(new java.awt.Color(110, 110, 110));
        jLabel35.setText("indice de Cintura/Altura");
        jPanel2.add(jLabel35);
        jLabel35.setBounds(520, 240, 195, 21);

        jLabel36.setFont(new java.awt.Font("Verdana", 0, 16)); // NOI18N
        jLabel36.setForeground(new java.awt.Color(110, 110, 110));
        jLabel36.setText("sobrepeso");
        jPanel2.add(jLabel36);
        jLabel36.setBounds(520, 160, 84, 21);

        jLabel37.setFont(new java.awt.Font("Verdana", 0, 16)); // NOI18N
        jLabel37.setForeground(new java.awt.Color(110, 110, 110));
        jLabel37.setText("Altura");
        jPanel2.add(jLabel37);
        jLabel37.setBounds(170, 370, 49, 21);

        jLabel38.setFont(new java.awt.Font("Verdana", 0, 16)); // NOI18N
        jLabel38.setForeground(new java.awt.Color(110, 110, 110));
        jLabel38.setText("Sexo");
        jPanel2.add(jLabel38);
        jLabel38.setBounds(170, 330, 39, 21);

        jLabel39.setFont(new java.awt.Font("Verdana", 0, 16)); // NOI18N
        jLabel39.setForeground(new java.awt.Color(110, 110, 110));
        jLabel39.setText("cuello");
        jPanel2.add(jLabel39);
        jLabel39.setBounds(170, 400, 48, 21);

        jLabel40.setFont(new java.awt.Font("Verdana", 0, 16)); // NOI18N
        jLabel40.setForeground(new java.awt.Color(110, 110, 110));
        jLabel40.setText("Cadera");
        jPanel2.add(jLabel40);
        jLabel40.setBounds(520, 130, 57, 21);

        jLabel41.setFont(new java.awt.Font("Verdana", 0, 16)); // NOI18N
        jLabel41.setForeground(new java.awt.Color(110, 110, 110));
        jLabel41.setText("cintura");
        jPanel2.add(jLabel41);
        jLabel41.setBounds(170, 430, 56, 21);

        jLabel31.setFont(new java.awt.Font("Verdana", 0, 24)); // NOI18N
        jLabel31.setForeground(new java.awt.Color(110, 110, 110));
        jLabel31.setText("Datos Personales");
        jPanel2.add(jLabel31);
        jLabel31.setBounds(370, 23, 220, 30);

        jLabel42.setFont(new java.awt.Font("Verdana", 0, 16)); // NOI18N
        jLabel42.setForeground(new java.awt.Color(110, 110, 110));
        jLabel42.setText("Cédula:");
        jPanel2.add(jLabel42);
        jLabel42.setBounds(166, 96, 63, 21);

        jLabel43.setFont(new java.awt.Font("Verdana", 0, 16)); // NOI18N
        jLabel43.setForeground(new java.awt.Color(0, 153, 255));
        jLabel43.setText("Datos");
        jPanel2.add(jLabel43);
        jLabel43.setBounds(740, 240, 63, 21);

        jLabel44.setFont(new java.awt.Font("Verdana", 0, 16)); // NOI18N
        jLabel44.setForeground(new java.awt.Color(0, 153, 255));
        jLabel44.setText("Datos");
        jPanel2.add(jLabel44);
        jLabel44.setBounds(280, 140, 63, 21);

        jLabel45.setFont(new java.awt.Font("Verdana", 0, 16)); // NOI18N
        jLabel45.setForeground(new java.awt.Color(0, 153, 255));
        jLabel45.setText("Datos");
        jPanel2.add(jLabel45);
        jLabel45.setBounds(280, 170, 63, 21);

        jLabel46.setFont(new java.awt.Font("Verdana", 0, 16)); // NOI18N
        jLabel46.setForeground(new java.awt.Color(0, 153, 255));
        jLabel46.setText("Datos");
        jPanel2.add(jLabel46);
        jLabel46.setBounds(280, 210, 63, 21);

        jLabel47.setFont(new java.awt.Font("Verdana", 0, 16)); // NOI18N
        jLabel47.setForeground(new java.awt.Color(0, 153, 255));
        jLabel47.setText("Datos");
        jPanel2.add(jLabel47);
        jLabel47.setBounds(280, 250, 63, 21);

        jLabel48.setFont(new java.awt.Font("Verdana", 0, 16)); // NOI18N
        jLabel48.setForeground(new java.awt.Color(0, 153, 255));
        jLabel48.setText("Datos");
        jPanel2.add(jLabel48);
        jLabel48.setBounds(280, 290, 63, 21);

        jLabel49.setFont(new java.awt.Font("Verdana", 0, 16)); // NOI18N
        jLabel49.setForeground(new java.awt.Color(0, 153, 255));
        jLabel49.setText("Datos");
        jPanel2.add(jLabel49);
        jLabel49.setBounds(280, 330, 63, 21);

        jLabel50.setFont(new java.awt.Font("Verdana", 0, 16)); // NOI18N
        jLabel50.setForeground(new java.awt.Color(0, 153, 255));
        jLabel50.setText("Datos");
        jPanel2.add(jLabel50);
        jLabel50.setBounds(280, 370, 63, 21);

        jLabel51.setFont(new java.awt.Font("Verdana", 0, 16)); // NOI18N
        jLabel51.setForeground(new java.awt.Color(0, 153, 255));
        jLabel51.setText("Datos");
        jPanel2.add(jLabel51);
        jLabel51.setBounds(280, 400, 63, 21);

        jLabel54.setFont(new java.awt.Font("Verdana", 0, 16)); // NOI18N
        jLabel54.setForeground(new java.awt.Color(0, 153, 255));
        jLabel54.setText("Datos");
        jPanel2.add(jLabel54);
        jLabel54.setBounds(280, 100, 63, 21);

        jLabel55.setFont(new java.awt.Font("Verdana", 0, 16)); // NOI18N
        jLabel55.setForeground(new java.awt.Color(0, 153, 255));
        jLabel55.setText("Datos");
        jPanel2.add(jLabel55);
        jLabel55.setBounds(740, 100, 63, 21);

        jLabel61.setFont(new java.awt.Font("Verdana", 0, 16)); // NOI18N
        jLabel61.setForeground(new java.awt.Color(0, 153, 255));
        jLabel61.setText("Datos");
        jPanel2.add(jLabel61);
        jLabel61.setBounds(740, 150, 63, 21);

        jLabel62.setFont(new java.awt.Font("Verdana", 0, 16)); // NOI18N
        jLabel62.setForeground(new java.awt.Color(0, 153, 255));
        jLabel62.setText("Datos");
        jPanel2.add(jLabel62);
        jLabel62.setBounds(740, 200, 63, 21);

        jLabel63.setFont(new java.awt.Font("Verdana", 0, 16)); // NOI18N
        jLabel63.setForeground(new java.awt.Color(0, 153, 255));
        jLabel63.setText("Datos");
        jPanel2.add(jLabel63);
        jLabel63.setBounds(310, 550, 63, 21);

        jLabel64.setFont(new java.awt.Font("Verdana", 0, 16)); // NOI18N
        jLabel64.setForeground(new java.awt.Color(110, 110, 110));
        jLabel64.setText("Tipo");
        jPanel2.add(jLabel64);
        jLabel64.setBounds(200, 550, 35, 21);

        jLabel65.setFont(new java.awt.Font("Verdana", 0, 16)); // NOI18N
        jLabel65.setForeground(new java.awt.Color(0, 153, 255));
        jLabel65.setText("Datos");
        jPanel2.add(jLabel65);
        jLabel65.setBounds(310, 580, 63, 30);

        jLabel66.setFont(new java.awt.Font("Verdana", 0, 16)); // NOI18N
        jLabel66.setForeground(new java.awt.Color(110, 110, 110));
        jLabel66.setText("cintura");
        jPanel2.add(jLabel66);
        jLabel66.setBounds(200, 580, 56, 30);

        jLabel67.setFont(new java.awt.Font("Verdana", 0, 16)); // NOI18N
        jLabel67.setForeground(new java.awt.Color(110, 110, 110));
        jLabel67.setText("cintura");
        jPanel2.add(jLabel67);
        jLabel67.setBounds(200, 620, 56, 30);

        jLabel68.setFont(new java.awt.Font("Verdana", 0, 16)); // NOI18N
        jLabel68.setForeground(new java.awt.Color(0, 153, 255));
        jLabel68.setText("Datos");
        jPanel2.add(jLabel68);
        jLabel68.setBounds(310, 620, 63, 30);

        jLabel69.setFont(new java.awt.Font("Verdana", 0, 16)); // NOI18N
        jLabel69.setForeground(new java.awt.Color(110, 110, 110));
        jLabel69.setText("cintura");
        jPanel2.add(jLabel69);
        jLabel69.setBounds(200, 670, 56, 30);

        jLabel70.setFont(new java.awt.Font("Verdana", 0, 16)); // NOI18N
        jLabel70.setForeground(new java.awt.Color(0, 153, 255));
        jLabel70.setText("Datos");
        jPanel2.add(jLabel70);
        jLabel70.setBounds(310, 670, 63, 30);

        spanel_finales.setViewportView(jPanel2);

        jTabbedPane1.addTab("Datos finales", spanel_finales);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 698, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cbo_mesesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbo_mesesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbo_mesesActionPerformed

    private void cbo_añosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbo_añosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbo_añosActionPerformed

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
    private javax.swing.ButtonGroup buttonGroup_sexo;
    private javax.swing.JComboBox cbo_años;
    private javax.swing.JComboBox cbo_años1;
    private javax.swing.JComboBox cbo_dias;
    private javax.swing.JComboBox cbo_dias1;
    private javax.swing.JComboBox cbo_membresia;
    private javax.swing.JComboBox cbo_meses;
    private javax.swing.JComboBox cbo_meses1;
    private javax.swing.JComboBox cbo_nivel;
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
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollBar jScrollBar2;
    private javax.swing.JTabbedPane jTabbedPane1;
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
    private javax.swing.JTextField txt_celular1;
    private javax.swing.JTextField txt_cintura;
    private javax.swing.JTextField txt_costo;
    private javax.swing.JTextField txt_cuello;
    private javax.swing.JTextField txt_dir;
    private javax.swing.JTextField txt_nombres;
    private javax.swing.JTextField txt_peso;
    private javax.swing.JTextField txt_prox_pago;
    private javax.swing.JTextField txt_telefono;
    // End of variables declaration//GEN-END:variables
}
