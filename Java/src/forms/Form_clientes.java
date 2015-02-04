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
        txt_celular = new javax.swing.JTextField();
        radio_masculino = new javax.swing.JRadioButton();
        radio_femenino = new javax.swing.JRadioButton();
        jLabel18 = new javax.swing.JLabel();
        cbo_dias = new javax.swing.JComboBox();
        cbo_años = new javax.swing.JComboBox();
        cbo_meses = new javax.swing.JComboBox();
        btn_cancelar = new javax.swing.JButton();
        btn_nuevo = new javax.swing.JButton();
        btn_guardar = new javax.swing.JButton();
        jScrollBar2 = new javax.swing.JScrollBar();
        spanel_membresia = new javax.swing.JScrollPane();
        jPanel3 = new javax.swing.JPanel();
        jLabel52 = new javax.swing.JLabel();
        jLabel53 = new javax.swing.JLabel();
        jLabel54 = new javax.swing.JLabel();
        jLabel55 = new javax.swing.JLabel();
        jLabel56 = new javax.swing.JLabel();
        spanel_ficha = new javax.swing.JScrollPane();
        jPanel1 = new javax.swing.JPanel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        txt_cedula1 = new javax.swing.JTextField();
        cbo_nivel = new javax.swing.JComboBox();
        jLabel22 = new javax.swing.JLabel();
        txt_cedula2 = new javax.swing.JTextField();
        jLabel23 = new javax.swing.JLabel();
        txt_cedula3 = new javax.swing.JTextField();
        jLabel24 = new javax.swing.JLabel();
        txt_cedula4 = new javax.swing.JTextField();
        btn_guardar1 = new javax.swing.JButton();
        btn_guardar2 = new javax.swing.JButton();
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

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jTabbedPane1.setForeground(new java.awt.Color(110, 110, 110));
        jTabbedPane1.setTabLayoutPolicy(javax.swing.JTabbedPane.SCROLL_TAB_LAYOUT);
        jTabbedPane1.setAutoscrolls(true);
        jTabbedPane1.setFont(new java.awt.Font("Verdana", 0, 16)); // NOI18N
        jTabbedPane1.setPreferredSize(new java.awt.Dimension(960, 600));

        spanel_personales.setBorder(null);
        spanel_personales.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        spanel_personales.setPreferredSize(new java.awt.Dimension(768, 600));
        spanel_personales.setVerticalScrollBar(jScrollBar2);

        jPanel4.setToolTipText("");
        jPanel4.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jPanel4.setPreferredSize(new java.awt.Dimension(768, 800));

        jLabel10.setFont(new java.awt.Font("Verdana", 0, 16)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(110, 110, 110));
        jLabel10.setText("Cédula:");

        jLabel11.setFont(new java.awt.Font("Verdana", 0, 16)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(110, 110, 110));
        jLabel11.setText("Nombres:");

        jLabel12.setFont(new java.awt.Font("Verdana", 0, 16)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(110, 110, 110));
        jLabel12.setText("Apellidos:");

        jLabel13.setFont(new java.awt.Font("Verdana", 0, 16)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(110, 110, 110));
        jLabel13.setText("Teléfono:");

        jLabel14.setFont(new java.awt.Font("Verdana", 0, 16)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(110, 110, 110));
        jLabel14.setText("Fecha Nacimiento:");

        jLabel15.setFont(new java.awt.Font("Verdana", 0, 16)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(110, 110, 110));
        jLabel15.setText("Dirección:");

        jLabel16.setFont(new java.awt.Font("Verdana", 0, 16)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(110, 110, 110));
        jLabel16.setText("Sexo:");

        jLabel17.setFont(new java.awt.Font("Verdana", 0, 16)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(110, 110, 110));
        jLabel17.setText("Celular:");

        txt_nombres.setFont(new java.awt.Font("Verdana", 0, 16)); // NOI18N
        txt_nombres.setForeground(new java.awt.Color(110, 110, 110));
        txt_nombres.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(202, 202, 202), 1, true));

        txt_cedula.setFont(new java.awt.Font("Verdana", 0, 16)); // NOI18N
        txt_cedula.setForeground(new java.awt.Color(110, 110, 110));
        txt_cedula.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(202, 202, 202), 1, true));

        txt_apellidos.setFont(new java.awt.Font("Verdana", 0, 16)); // NOI18N
        txt_apellidos.setForeground(new java.awt.Color(110, 110, 110));
        txt_apellidos.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(202, 202, 202), 1, true));

        txt_dir.setFont(new java.awt.Font("Verdana", 0, 16)); // NOI18N
        txt_dir.setForeground(new java.awt.Color(110, 110, 110));
        txt_dir.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(202, 202, 202), 1, true));

        txt_telefono.setFont(new java.awt.Font("Verdana", 0, 16)); // NOI18N
        txt_telefono.setForeground(new java.awt.Color(110, 110, 110));
        txt_telefono.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(202, 202, 202), 1, true));
        txt_telefono.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_telefonoActionPerformed(evt);
            }
        });

        txt_celular.setFont(new java.awt.Font("Verdana", 0, 16)); // NOI18N
        txt_celular.setForeground(new java.awt.Color(110, 110, 110));
        txt_celular.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(202, 202, 202), 1, true));

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

        buttonGroup_sexo.add(radio_femenino);
        radio_femenino.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        radio_femenino.setForeground(new java.awt.Color(110, 110, 110));
        radio_femenino.setText("Femenino");

        jLabel18.setFont(new java.awt.Font("Verdana", 0, 24)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(110, 110, 110));
        jLabel18.setText("Datos Personales");

        cbo_dias.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        cbo_dias.setForeground(new java.awt.Color(110, 110, 110));
        cbo_dias.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31" }));
        cbo_dias.setToolTipText("");
        cbo_dias.setBorder(null);
        cbo_dias.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        cbo_años.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        cbo_años.setForeground(new java.awt.Color(110, 110, 110));
        cbo_años.setToolTipText("");
        cbo_años.setBorder(null);
        cbo_años.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbo_añosActionPerformed(evt);
            }
        });

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

        btn_cancelar.setBackground(new java.awt.Color(0, 153, 204));
        btn_cancelar.setFont(new java.awt.Font("Verdana", 0, 16)); // NOI18N
        btn_cancelar.setForeground(new java.awt.Color(255, 255, 255));
        btn_cancelar.setText("CANCELAR");
        btn_cancelar.setBorder(null);
        btn_cancelar.setBorderPainted(false);
        btn_cancelar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_cancelar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        btn_nuevo.setBackground(new java.awt.Color(0, 153, 204));
        btn_nuevo.setFont(new java.awt.Font("Verdana", 0, 16)); // NOI18N
        btn_nuevo.setForeground(new java.awt.Color(255, 255, 255));
        btn_nuevo.setText("NUEVO");
        btn_nuevo.setBorder(null);
        btn_nuevo.setBorderPainted(false);
        btn_nuevo.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_nuevo.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        btn_guardar.setBackground(new java.awt.Color(0, 153, 204));
        btn_guardar.setFont(new java.awt.Font("Verdana", 0, 16)); // NOI18N
        btn_guardar.setForeground(new java.awt.Color(255, 255, 255));
        btn_guardar.setText("GUARDAR");
        btn_guardar.setBorder(null);
        btn_guardar.setBorderPainted(false);
        btn_guardar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_guardar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(249, 249, 249)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                                .addComponent(jLabel12)
                                .addGap(18, 18, 18)
                                .addComponent(txt_apellidos, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addGroup(jPanel4Layout.createSequentialGroup()
                                        .addComponent(jLabel11)
                                        .addGap(18, 18, 18)
                                        .addComponent(txt_nombres, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel4Layout.createSequentialGroup()
                                        .addComponent(jLabel10)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(txt_cedula, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGroup(jPanel4Layout.createSequentialGroup()
                                                .addGap(11, 11, 11)
                                                .addComponent(jLabel18)))))
                                .addGap(3, 3, 3)))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(jPanel4Layout.createSequentialGroup()
                                    .addComponent(jLabel14)
                                    .addGap(18, 18, 18)
                                    .addComponent(cbo_dias, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(49, 49, 49)
                                    .addComponent(cbo_meses, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(cbo_años, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(jPanel4Layout.createSequentialGroup()
                                    .addComponent(jLabel15)
                                    .addGap(18, 18, 18)
                                    .addComponent(txt_dir, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel16)
                                    .addComponent(jLabel13)
                                    .addComponent(jLabel17))
                                .addGap(21, 21, 21)
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txt_celular, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txt_telefono, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel4Layout.createSequentialGroup()
                                        .addComponent(radio_masculino)
                                        .addGap(43, 43, 43)
                                        .addComponent(radio_femenino)))))
                        .addContainerGap(257, Short.MAX_VALUE))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btn_guardar, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40)
                .addComponent(btn_nuevo, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40)
                .addComponent(btn_cancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(177, 177, 177))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addComponent(jLabel18)
                .addGap(49, 49, 49)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(txt_cedula, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(txt_nombres, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel12)
                    .addComponent(txt_apellidos, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(13, 13, 13)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel15)
                    .addComponent(txt_dir, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cbo_dias, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel14)
                    .addComponent(cbo_meses, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbo_años, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel16)
                    .addComponent(radio_masculino)
                    .addComponent(radio_femenino))
                .addGap(9, 9, 9)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel13)
                    .addComponent(txt_telefono, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(11, 11, 11)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel17)
                    .addComponent(txt_celular, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(73, 73, 73)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_guardar, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_nuevo, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_cancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(696, Short.MAX_VALUE))
        );

        spanel_personales.setViewportView(jPanel4);

        jTabbedPane1.addTab("Datos personales", spanel_personales);

        jLabel52.setFont(new java.awt.Font("Verdana", 0, 16)); // NOI18N
        jLabel52.setForeground(new java.awt.Color(110, 110, 110));
        jLabel52.setText("Cédula:");

        jLabel53.setFont(new java.awt.Font("Verdana", 0, 16)); // NOI18N
        jLabel53.setForeground(new java.awt.Color(0, 153, 255));
        jLabel53.setText("Datos");

        jLabel54.setFont(new java.awt.Font("Verdana", 0, 16)); // NOI18N
        jLabel54.setForeground(new java.awt.Color(110, 110, 110));
        jLabel54.setText("Nombres:");

        jLabel55.setFont(new java.awt.Font("Verdana", 0, 16)); // NOI18N
        jLabel55.setForeground(new java.awt.Color(0, 153, 255));
        jLabel55.setText("Datos");

        jLabel56.setFont(new java.awt.Font("Verdana", 0, 24)); // NOI18N
        jLabel56.setForeground(new java.awt.Color(110, 110, 110));
        jLabel56.setText("Datos Personales");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(286, 286, 286)
                        .addComponent(jLabel56))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(225, 225, 225)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel52)
                            .addComponent(jLabel54))
                        .addGap(65, 65, 65)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel55, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel53, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(461, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(82, 82, 82)
                .addComponent(jLabel56)
                .addGap(58, 58, 58)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel52)
                    .addComponent(jLabel53))
                .addGap(41, 41, 41)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel54)
                    .addComponent(jLabel55))
                .addContainerGap(1084, Short.MAX_VALUE))
        );

        spanel_membresia.setViewportView(jPanel3);

        jTabbedPane1.addTab("Datos Membresia", spanel_membresia);

        spanel_ficha.setBorder(null);
        spanel_ficha.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        spanel_ficha.setPreferredSize(new java.awt.Dimension(960, 600));

        jLabel19.setFont(new java.awt.Font("Verdana", 0, 24)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(110, 110, 110));
        jLabel19.setText("Datos Corporales");

        jLabel20.setFont(new java.awt.Font("Verdana", 0, 16)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(110, 110, 110));
        jLabel20.setText("Cédula:");

        jLabel21.setFont(new java.awt.Font("Verdana", 0, 16)); // NOI18N
        jLabel21.setForeground(new java.awt.Color(110, 110, 110));
        jLabel21.setText("Nivel:");

        txt_cedula1.setFont(new java.awt.Font("Verdana", 0, 16)); // NOI18N
        txt_cedula1.setForeground(new java.awt.Color(110, 110, 110));
        txt_cedula1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(202, 202, 202), 1, true));

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
        jLabel22.setText("Peso:");

        txt_cedula2.setFont(new java.awt.Font("Verdana", 0, 16)); // NOI18N
        txt_cedula2.setForeground(new java.awt.Color(110, 110, 110));
        txt_cedula2.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(202, 202, 202), 1, true));

        jLabel23.setFont(new java.awt.Font("Verdana", 0, 16)); // NOI18N
        jLabel23.setForeground(new java.awt.Color(110, 110, 110));
        jLabel23.setText("altura");

        txt_cedula3.setFont(new java.awt.Font("Verdana", 0, 16)); // NOI18N
        txt_cedula3.setForeground(new java.awt.Color(110, 110, 110));
        txt_cedula3.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(202, 202, 202), 1, true));

        jLabel24.setFont(new java.awt.Font("Verdana", 0, 16)); // NOI18N
        jLabel24.setForeground(new java.awt.Color(110, 110, 110));
        jLabel24.setText("cintura");

        txt_cedula4.setFont(new java.awt.Font("Verdana", 0, 16)); // NOI18N
        txt_cedula4.setForeground(new java.awt.Color(110, 110, 110));
        txt_cedula4.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(202, 202, 202), 1, true));

        btn_guardar1.setBackground(new java.awt.Color(0, 153, 204));
        btn_guardar1.setFont(new java.awt.Font("Verdana", 0, 16)); // NOI18N
        btn_guardar1.setForeground(new java.awt.Color(255, 255, 255));
        btn_guardar1.setText("GUARDAR");
        btn_guardar1.setBorder(null);
        btn_guardar1.setBorderPainted(false);
        btn_guardar1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        btn_guardar2.setBackground(new java.awt.Color(0, 153, 204));
        btn_guardar2.setFont(new java.awt.Font("Verdana", 0, 16)); // NOI18N
        btn_guardar2.setForeground(new java.awt.Color(255, 255, 255));
        btn_guardar2.setText("CANCELAR");
        btn_guardar2.setBorder(null);
        btn_guardar2.setBorderPainted(false);
        btn_guardar2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(274, 274, 274)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel21)
                            .addComponent(jLabel20)
                            .addComponent(jLabel22)
                            .addComponent(jLabel23)
                            .addComponent(jLabel24))
                        .addGap(21, 21, 21)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txt_cedula4, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txt_cedula2, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txt_cedula1, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cbo_nivel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txt_cedula3, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel19)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(322, 322, 322)
                        .addComponent(btn_guardar1, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(63, 63, 63)
                        .addComponent(btn_guardar2, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(293, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(46, 46, 46)
                .addComponent(jLabel19)
                .addGap(41, 41, 41)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel20)
                    .addComponent(txt_cedula1, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cbo_nivel, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel21))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel22)
                    .addComponent(txt_cedula2, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_cedula3, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel23))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_cedula4, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel24))
                .addGap(44, 44, 44)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_guardar1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_guardar2, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(880, Short.MAX_VALUE))
        );

        spanel_ficha.setViewportView(jPanel1);

        jTabbedPane1.addTab("Ficha ", spanel_ficha);

        spanel_finales.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        spanel_finales.setPreferredSize(new java.awt.Dimension(960, 600));

        jPanel2.setPreferredSize(new java.awt.Dimension(960, 900));
        jPanel2.setLayout(null);

        jLabel25.setFont(new java.awt.Font("Verdana", 0, 24)); // NOI18N
        jLabel25.setForeground(new java.awt.Color(110, 110, 110));
        jLabel25.setText("Datos de Membresia");
        jPanel2.add(jLabel25);
        jLabel25.setBounds(370, 470, 260, 30);

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
        jLabel43.setBounds(280, 100, 63, 21);

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
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 1363, Short.MAX_VALUE)
                .addContainerGap())
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
    private javax.swing.JButton btn_guardar;
    private javax.swing.JButton btn_guardar1;
    private javax.swing.JButton btn_guardar2;
    private javax.swing.JButton btn_nuevo;
    private javax.swing.ButtonGroup buttonGroup_sexo;
    private javax.swing.JComboBox cbo_años;
    private javax.swing.JComboBox cbo_dias;
    private javax.swing.JComboBox cbo_meses;
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
    private javax.swing.JLabel jLabel20;
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
    private javax.swing.JTextField txt_apellidos;
    private javax.swing.JTextField txt_cedula;
    private javax.swing.JTextField txt_cedula1;
    private javax.swing.JTextField txt_cedula2;
    private javax.swing.JTextField txt_cedula3;
    private javax.swing.JTextField txt_cedula4;
    private javax.swing.JTextField txt_celular;
    private javax.swing.JTextField txt_dir;
    private javax.swing.JTextField txt_nombres;
    private javax.swing.JTextField txt_telefono;
    // End of variables declaration//GEN-END:variables
}
