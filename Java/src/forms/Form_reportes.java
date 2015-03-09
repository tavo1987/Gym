package forms;

import Mysql.Conexion;
import java.sql.*;
import general.Reportes;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import validaciones.Validar;


public class Form_reportes extends javax.swing.JFrame {

    private Reportes reporte = new Reportes();
    
    //para la conexion
    Conexion cn = new Conexion();
    Connection conexion = cn.getConexion();
    String sql;
     
    private PreparedStatement ps;
    private ResultSet rs;
    
    
    
    public Form_reportes() {
        initComponents();
        setLocationRelativeTo(null);
        setTitle("Reportes");
        
       this.txt_edad.setDocument(new Validar(txt_edad,4));
       txt_cedula.setDocument(new Validar(txt_cedula,10));
       txt_cedula1.setDocument(new Validar(txt_cedula1,10));
       
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        buttonGroup1 = new javax.swing.ButtonGroup();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        btn_reporte_edad = new javax.swing.JButton();
        radio_masculino = new javax.swing.JRadioButton();
        radio_femenino = new javax.swing.JRadioButton();
        jLabel16 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jSeparator3 = new javax.swing.JSeparator();
        btn_repote_sexo1 = new javax.swing.JButton();
        txt_edad = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jSeparator4 = new javax.swing.JSeparator();
        btn_volver = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel20 = new javax.swing.JLabel();
        jSeparator5 = new javax.swing.JSeparator();
        btn_volver1 = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();
        txt_cedula = new javax.swing.JTextField();
        btn_reporte_ficha = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jLabel21 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        txt_cedula1 = new javax.swing.JTextField();
        btn_reporte_ficha1 = new javax.swing.JButton();
        btn_volver2 = new javax.swing.JButton();
        jSeparator6 = new javax.swing.JSeparator();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(960, 768));

        jTabbedPane1.setBackground(new java.awt.Color(250, 250, 250));
        jTabbedPane1.setForeground(new java.awt.Color(110, 110, 110));
        jTabbedPane1.setFont(new java.awt.Font("Verdana", 0, 16)); // NOI18N

        jPanel1.setBackground(new java.awt.Color(250, 250, 250));
        jPanel1.setLayout(new java.awt.GridBagLayout());

        btn_reporte_edad.setBackground(new java.awt.Color(0, 153, 204));
        btn_reporte_edad.setFont(new java.awt.Font("Verdana", 0, 16)); // NOI18N
        btn_reporte_edad.setForeground(new java.awt.Color(255, 255, 255));
        btn_reporte_edad.setText("Generar reporte");
        btn_reporte_edad.setBorder(null);
        btn_reporte_edad.setBorderPainted(false);
        btn_reporte_edad.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_reporte_edad.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_reporte_edad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_reporte_edadActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 12;
        gridBagConstraints.gridy = 8;
        gridBagConstraints.gridwidth = 24;
        gridBagConstraints.gridheight = 3;
        gridBagConstraints.ipadx = 31;
        gridBagConstraints.ipady = 19;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(8, 8, 0, 0);
        jPanel1.add(btn_reporte_edad, gridBagConstraints);

        radio_masculino.setBackground(new java.awt.Color(250, 250, 250));
        buttonGroup1.add(radio_masculino);
        radio_masculino.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        radio_masculino.setForeground(new java.awt.Color(110, 110, 110));
        radio_masculino.setSelected(true);
        radio_masculino.setText("Masculino");
        radio_masculino.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radio_masculinoActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.gridwidth = 3;
        gridBagConstraints.gridheight = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(18, 14, 0, 0);
        jPanel1.add(radio_masculino, gridBagConstraints);

        radio_femenino.setBackground(new java.awt.Color(250, 250, 250));
        buttonGroup1.add(radio_femenino);
        radio_femenino.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        radio_femenino.setForeground(new java.awt.Color(110, 110, 110));
        radio_femenino.setText("Femenino");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 7;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.gridwidth = 5;
        gridBagConstraints.gridheight = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(18, 18, 0, 0);
        jPanel1.add(radio_femenino, gridBagConstraints);

        jLabel16.setFont(new java.awt.Font("Verdana", 0, 16)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(110, 110, 110));
        jLabel16.setText("Sexo:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(18, 59, 0, 0);
        jPanel1.add(jLabel16, gridBagConstraints);

        jLabel18.setFont(new java.awt.Font("Verdana", 0, 24)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(110, 110, 110));
        jLabel18.setText("Reporte clientes por sexo");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridwidth = 12;
        gridBagConstraints.gridheight = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(100, 49, 0, 0);
        jPanel1.add(jLabel18, gridBagConstraints);

        jSeparator3.setBackground(new java.awt.Color(51, 204, 255));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.gridwidth = 37;
        gridBagConstraints.ipadx = 477;
        gridBagConstraints.ipady = 11;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(20, 49, 0, 12);
        jPanel1.add(jSeparator3, gridBagConstraints);

        btn_repote_sexo1.setBackground(new java.awt.Color(0, 153, 204));
        btn_repote_sexo1.setFont(new java.awt.Font("Verdana", 0, 16)); // NOI18N
        btn_repote_sexo1.setForeground(new java.awt.Color(255, 255, 255));
        btn_repote_sexo1.setText("Generar reporte");
        btn_repote_sexo1.setBorder(null);
        btn_repote_sexo1.setBorderPainted(false);
        btn_repote_sexo1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_repote_sexo1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_repote_sexo1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_repote_sexo1ActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 12;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.gridwidth = 25;
        gridBagConstraints.gridheight = 3;
        gridBagConstraints.ipadx = 31;
        gridBagConstraints.ipady = 19;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(8, 18, 0, 0);
        jPanel1.add(btn_repote_sexo1, gridBagConstraints);

        txt_edad.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        txt_edad.setForeground(new java.awt.Color(110, 110, 110));
        txt_edad.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(202, 202, 202), 1, true));
        txt_edad.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_edadKeyTyped(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 4;
        gridBagConstraints.gridy = 8;
        gridBagConstraints.gridwidth = 4;
        gridBagConstraints.gridheight = 2;
        gridBagConstraints.ipadx = 98;
        gridBagConstraints.ipady = 21;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(8, 9, 0, 0);
        jPanel1.add(txt_edad, gridBagConstraints);

        jLabel10.setFont(new java.awt.Font("Verdana", 0, 16)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(110, 110, 110));
        jLabel10.setText("Ingresar edad:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 8;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(18, 49, 0, 0);
        jPanel1.add(jLabel10, gridBagConstraints);

        jLabel19.setFont(new java.awt.Font("Verdana", 0, 24)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(110, 110, 110));
        jLabel19.setText("Reporte de clientes por edad");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 6;
        gridBagConstraints.gridwidth = 23;
        gridBagConstraints.ipadx = 27;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(40, 49, 0, 0);
        jPanel1.add(jLabel19, gridBagConstraints);

        jSeparator4.setBackground(new java.awt.Color(51, 204, 255));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 7;
        gridBagConstraints.gridwidth = 37;
        gridBagConstraints.ipadx = 477;
        gridBagConstraints.ipady = 11;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(10, 49, 0, 12);
        jPanel1.add(jSeparator4, gridBagConstraints);

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
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.ipadx = 6;
        gridBagConstraints.ipady = 13;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(30, 21, 0, 0);
        jPanel1.add(btn_volver, gridBagConstraints);

        jTabbedPane1.addTab("Clientes", jPanel1);

        jPanel2.setBackground(new java.awt.Color(250, 250, 250));
        jPanel2.setLayout(new java.awt.GridBagLayout());

        jLabel20.setFont(new java.awt.Font("Verdana", 0, 24)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(110, 110, 110));
        jLabel20.setText("Reporte fichas de clientes");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.gridheight = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(100, 49, 0, 0);
        jPanel2.add(jLabel20, gridBagConstraints);

        jSeparator5.setBackground(new java.awt.Color(51, 204, 255));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.gridwidth = 5;
        gridBagConstraints.ipadx = 477;
        gridBagConstraints.ipady = 11;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(20, 49, 0, 0);
        jPanel2.add(jSeparator5, gridBagConstraints);

        btn_volver1.setBackground(new java.awt.Color(250, 250, 250));
        btn_volver1.setFont(new java.awt.Font("Verdana", 0, 16)); // NOI18N
        btn_volver1.setForeground(new java.awt.Color(110, 110, 110));
        btn_volver1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/ic_home_64.png"))); // NOI18N
        btn_volver1.setText("Volver");
        btn_volver1.setAutoscrolls(true);
        btn_volver1.setBorder(null);
        btn_volver1.setBorderPainted(false);
        btn_volver1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_volver1.setFocusPainted(false);
        btn_volver1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_volver1.setIconTextGap(-8);
        btn_volver1.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        btn_volver1.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btn_volver1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_volver1ActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.ipadx = 6;
        gridBagConstraints.ipady = 13;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(30, 21, 0, 0);
        jPanel2.add(btn_volver1, gridBagConstraints);

        jLabel11.setFont(new java.awt.Font("Verdana", 0, 16)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(110, 110, 110));
        jLabel11.setText("Ingresar cedula:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(38, 49, 0, 0);
        jPanel2.add(jLabel11, gridBagConstraints);

        txt_cedula.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        txt_cedula.setForeground(new java.awt.Color(110, 110, 110));
        txt_cedula.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(202, 202, 202), 1, true));
        txt_cedula.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_cedulaKeyTyped(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.gridwidth = 3;
        gridBagConstraints.gridheight = 2;
        gridBagConstraints.ipadx = 158;
        gridBagConstraints.ipady = 21;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(28, 16, 0, 0);
        jPanel2.add(txt_cedula, gridBagConstraints);

        btn_reporte_ficha.setBackground(new java.awt.Color(0, 153, 204));
        btn_reporte_ficha.setFont(new java.awt.Font("Verdana", 0, 16)); // NOI18N
        btn_reporte_ficha.setForeground(new java.awt.Color(255, 255, 255));
        btn_reporte_ficha.setText("Generar reporte");
        btn_reporte_ficha.setBorder(null);
        btn_reporte_ficha.setBorderPainted(false);
        btn_reporte_ficha.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_reporte_ficha.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_reporte_ficha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_reporte_fichaActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 5;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.gridwidth = 6;
        gridBagConstraints.gridheight = 3;
        gridBagConstraints.ipadx = 31;
        gridBagConstraints.ipady = 19;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(28, 20, 120, 0);
        jPanel2.add(btn_reporte_ficha, gridBagConstraints);

        jTabbedPane1.addTab("fichas seguimiento", jPanel2);

        jPanel3.setBackground(new java.awt.Color(252, 250, 250));
        jPanel3.setLayout(new java.awt.GridBagLayout());

        jLabel21.setFont(new java.awt.Font("Verdana", 0, 24)); // NOI18N
        jLabel21.setForeground(new java.awt.Color(110, 110, 110));
        jLabel21.setText("Reporte de pagos por cliente");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridwidth = 3;
        gridBagConstraints.gridheight = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(100, 49, 0, 0);
        jPanel3.add(jLabel21, gridBagConstraints);

        jLabel12.setFont(new java.awt.Font("Verdana", 0, 16)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(110, 110, 110));
        jLabel12.setText("Ingresar cedula:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(38, 49, 0, 0);
        jPanel3.add(jLabel12, gridBagConstraints);

        txt_cedula1.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        txt_cedula1.setForeground(new java.awt.Color(110, 110, 110));
        txt_cedula1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(202, 202, 202), 1, true));
        txt_cedula1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_cedula1KeyTyped(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.gridheight = 2;
        gridBagConstraints.ipadx = 158;
        gridBagConstraints.ipady = 21;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(28, 16, 0, 0);
        jPanel3.add(txt_cedula1, gridBagConstraints);

        btn_reporte_ficha1.setBackground(new java.awt.Color(0, 153, 204));
        btn_reporte_ficha1.setFont(new java.awt.Font("Verdana", 0, 16)); // NOI18N
        btn_reporte_ficha1.setForeground(new java.awt.Color(255, 255, 255));
        btn_reporte_ficha1.setText("Generar reporte");
        btn_reporte_ficha1.setBorder(null);
        btn_reporte_ficha1.setBorderPainted(false);
        btn_reporte_ficha1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_reporte_ficha1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_reporte_ficha1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_reporte_ficha1ActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.gridwidth = 6;
        gridBagConstraints.gridheight = 3;
        gridBagConstraints.ipadx = 31;
        gridBagConstraints.ipady = 19;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(28, 10, 120, 10);
        jPanel3.add(btn_reporte_ficha1, gridBagConstraints);

        btn_volver2.setBackground(new java.awt.Color(250, 250, 250));
        btn_volver2.setFont(new java.awt.Font("Verdana", 0, 16)); // NOI18N
        btn_volver2.setForeground(new java.awt.Color(110, 110, 110));
        btn_volver2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/ic_home_64.png"))); // NOI18N
        btn_volver2.setText("Volver");
        btn_volver2.setAutoscrolls(true);
        btn_volver2.setBorder(null);
        btn_volver2.setBorderPainted(false);
        btn_volver2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_volver2.setFocusPainted(false);
        btn_volver2.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_volver2.setIconTextGap(-8);
        btn_volver2.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        btn_volver2.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btn_volver2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_volver2ActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.ipadx = 6;
        gridBagConstraints.ipady = 13;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(30, 21, 0, 0);
        jPanel3.add(btn_volver2, gridBagConstraints);

        jSeparator6.setBackground(new java.awt.Color(51, 204, 255));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.gridwidth = 5;
        gridBagConstraints.ipadx = 477;
        gridBagConstraints.ipady = 11;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(20, 49, 0, 0);
        jPanel3.add(jSeparator6, gridBagConstraints);

        jTabbedPane1.addTab("Pagos", jPanel3);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    
    
/*---------------------------------------------------------------------------------
    metodo para el reporte de cliente
 -------------------------------------------------------------------------------------*/
    
    private void btn_reporte_edadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_reporte_edadActionPerformed
        
       if(txt_edad.getText().length()>0){
           reporte.resportesEdad(txt_edad.getText());
       }else{
           JOptionPane.showMessageDialog(rootPane,"Inngresa la edad");
       }

    }//GEN-LAST:event_btn_reporte_edadActionPerformed

    
    
    
    
    private void radio_masculinoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radio_masculinoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_radio_masculinoActionPerformed

    
    
    
    
 /*---------------------------------------------------------------------------------
    metodo para generar reporte de clientes
 -------------------------------------------------------------------------------------*/
    private void btn_repote_sexo1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_repote_sexo1ActionPerformed
        if(radio_masculino.isSelected()){
            reporte.resportesSexoClientes(radio_masculino.getText());
        }else{
                reporte.resportesSexoClientes(radio_femenino.getText());
        }   
    }//GEN-LAST:event_btn_repote_sexo1ActionPerformed

    private void txt_edadKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_edadKeyTyped

        Validar.soloNumeros(evt);
    }//GEN-LAST:event_txt_edadKeyTyped

    private void btn_volverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_volverActionPerformed
        Home frm_home = new Home();
        frm_home.setVisible(true);
        dispose();

    }//GEN-LAST:event_btn_volverActionPerformed

    private void btn_volver1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_volver1ActionPerformed
        Home frm_home = new Home();
        frm_home.setVisible(true);
        dispose();
    }//GEN-LAST:event_btn_volver1ActionPerformed

    private void txt_cedulaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_cedulaKeyTyped
        Validar.soloNumeros(evt);
    }//GEN-LAST:event_txt_cedulaKeyTyped

    
    
    
  /*---------------------------------------------------------------------------------
    Para generar reporte de fichas de seguiemiento
 -------------------------------------------------------------------------------------*/  
    
    private void btn_reporte_fichaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_reporte_fichaActionPerformed
        
        if(txt_cedula.getText().length()>0 && Validar.VerificarCedula(txt_cedula.getText())){
            
            try{
                sql= "select * from  clientes where cedula = "+txt_cedula.getText()+"";
                ps = conexion.prepareStatement(sql);
                rs = ps.executeQuery();
                
                if(rs.next()){
                     reporte.reportesFicha(txt_cedula.getText());
                    
                }else{
                   JOptionPane.showMessageDialog(rootPane,"Cliente no existe");
                }

                
            }catch(Exception ex){
                 JOptionPane.showMessageDialog(rootPane,ex.getMessage() + "Error");
            }
            
        }else{
            JOptionPane.showMessageDialog(this, "Cedula incorecta ");
            txt_cedula.setText("");
            txt_cedula.requestFocus();
        }
        
        
    }//GEN-LAST:event_btn_reporte_fichaActionPerformed

    private void txt_cedula1KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_cedula1KeyTyped
        Validar.soloNumeros(evt);
    }//GEN-LAST:event_txt_cedula1KeyTyped

    
    
    
    
/*---------------------------------------------------------------------------------
    Para generar reporte de pagos por cliente
 -------------------------------------------------------------------------------------*/  
    private void btn_reporte_ficha1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_reporte_ficha1ActionPerformed
             if(txt_cedula1.getText().length()>0 && Validar.VerificarCedula(txt_cedula1.getText())){
            
            try{
                sql= "select * from  clientes where cedula = "+txt_cedula1.getText()+"";
                ps = conexion.prepareStatement(sql);
                rs = ps.executeQuery();
                
                if(rs.next()){
                     reporte.reportesPagoCliente(txt_cedula1.getText());
                    
                }else{
                   JOptionPane.showMessageDialog(rootPane,"Cliente no existe");
                }

                
            }catch(Exception ex){
                 JOptionPane.showMessageDialog(rootPane,ex.getMessage() + "Error");
            }
            
        }else{
            JOptionPane.showMessageDialog(this, "Cedula incorecta ");
            txt_cedula1.setText("");
            txt_cedula1.requestFocus();
        }
    }//GEN-LAST:event_btn_reporte_ficha1ActionPerformed

    
    
    
    
    private void btn_volver2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_volver2ActionPerformed
        Home frm_home = new Home();
        frm_home.setVisible(true);
        dispose();
    }//GEN-LAST:event_btn_volver2ActionPerformed


    public static void main(String args[]) {



        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Form_reportes().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_reporte_edad;
    private javax.swing.JButton btn_reporte_ficha;
    private javax.swing.JButton btn_reporte_ficha1;
    private javax.swing.JButton btn_repote_sexo1;
    private javax.swing.JButton btn_volver;
    private javax.swing.JButton btn_volver1;
    private javax.swing.JButton btn_volver2;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JSeparator jSeparator6;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JRadioButton radio_femenino;
    private javax.swing.JRadioButton radio_masculino;
    private javax.swing.JTextField txt_cedula;
    private javax.swing.JTextField txt_cedula1;
    private javax.swing.JTextField txt_edad;
    // End of variables declaration//GEN-END:variables
}
