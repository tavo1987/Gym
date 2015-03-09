package forms;
import javax.swing.*;
import Mysql.*;
import validaciones.*;
import java.util.*;
import java.sql.*;
import java.util.logging.*;
import javax.swing.table.DefaultTableModel;

public class Form_users extends javax.swing.JFrame {
    
    private String sql;
    private String sql2;
    private PreparedStatement ps;
    
    //Hacemos las conexion 
    public Conexion cn = new Conexion();//instanciamos nuestra clase conexion
    public Connection conexion = cn.getConexion();
    private Funciones funcion;
    ResultSet rs;
    
    
    
    
    public Form_users() {
        initComponents();
        setLocationRelativeTo(null);
      //para poner todas las cajas de testo en descativadas al inicial al formulario
        bloquear(false);
        bloquearResult(false);
        this.btn_editar1.setEnabled(false);
      //para limitar ingreso de caracteres en la cajas      
       txt_user.setDocument(new Validar(txt_user,20));
       txt_password.setDocument(new Validar(txt_password,30));
       txt_password2.setDocument(new Validar(txt_password2,30));
       txt_buscar.setDocument(new Validar(txt_buscar,20));
       
       //para limitar ingreso de caracteres en la caja de resultados    
       txt_result_password.setDocument(new Validar(txt_result_password,30));
       txt_tipo.setDocument(new Validar(txt_tipo,30));
      
       
      //para refrescar la tabla cxada vez que se ingrese un dato
        Funciones tabla = new Funciones();
           tabla.refrescarTabla(table_users, "select * from users");
           tabla.refrescarTabla(table_users2, "select * from users");
   
    }

    
    
 
/*--------------------------------------------------------------------------------
        metodo para bloquear y desbloquear cajas de texto de nuevo usuario
----------------------------------------------------------------------------------*/
    
    public void bloquear(boolean a){
          
        this.txt_user.setEnabled(a);
        this.txt_password.setEnabled(a);
        this.txt_password2.setEnabled(a);
        this.btn_cancelar.setEnabled(a);
        this.btn_guardar.setEnabled(a);
        
    }

    
    
    
/*--------------------------------------------------------------------------------
        metodo para bloquear y desbloquear cajas de texto de nuevo usuario
----------------------------------------------------------------------------------*/
 
     public void bloquearResult(boolean a){
          
       
        this.txt_result_password.setEnabled(a);
        
    }
    
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        jScrollPane3 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jScrollPane1 = new javax.swing.JScrollPane();
        jPanel1 = new javax.swing.JPanel();
        jSeparator2 = new javax.swing.JSeparator();
        jLabel18 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        txt_user = new javax.swing.JTextField();
        btn_guardar = new javax.swing.JButton();
        btn_cancelar = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();
        txt_password = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        txt_password2 = new javax.swing.JTextField();
        btn_nuevo = new javax.swing.JButton();
        btn_volver = new javax.swing.JButton();
        jScrollPane4 = new javax.swing.JScrollPane();
        table_users = new javax.swing.JTable();
        jLabel13 = new javax.swing.JLabel();
        cbo_tipos_users = new javax.swing.JComboBox();
        jLabel19 = new javax.swing.JLabel();
        jSeparator3 = new javax.swing.JSeparator();
        jScrollPane2 = new javax.swing.JScrollPane();
        jPanel2 = new javax.swing.JPanel();
        jSeparator4 = new javax.swing.JSeparator();
        jSeparator5 = new javax.swing.JSeparator();
        jLabel16 = new javax.swing.JLabel();
        btn_cancelar2 = new javax.swing.JButton();
        jLabel20 = new javax.swing.JLabel();
        btn_buscar = new javax.swing.JButton();
        txt_buscar = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        txt_result_user = new javax.swing.JTextField();
        jLabel21 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        txt_result_password = new javax.swing.JTextField();
        jLabel22 = new javax.swing.JLabel();
        txt_tipo = new javax.swing.JTextField();
        btn_guardar2 = new javax.swing.JButton();
        btn_eliminar = new javax.swing.JButton();
        btn_editar1 = new javax.swing.JButton();
        jScrollPane5 = new javax.swing.JScrollPane();
        table_users2 = new javax.swing.JTable();

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane3.setViewportView(jTable1);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(960, 768));

        jTabbedPane1.setForeground(new java.awt.Color(110, 110, 110));
        jTabbedPane1.setFont(new java.awt.Font("Verdana", 0, 16)); // NOI18N
        jTabbedPane1.setPreferredSize(new java.awt.Dimension(960, 768));

        jScrollPane1.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_ALWAYS);
        jScrollPane1.setPreferredSize(new java.awt.Dimension(960, 768));

        jPanel1.setBackground(new java.awt.Color(250, 250, 250));
        jPanel1.setPreferredSize(new java.awt.Dimension(960, 758));
        jPanel1.setLayout(new java.awt.GridBagLayout());

        jSeparator2.setBackground(new java.awt.Color(51, 204, 255));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.gridwidth = 26;
        gridBagConstraints.ipadx = 599;
        gridBagConstraints.ipady = 9;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(20, 90, 0, 270);
        jPanel1.add(jSeparator2, gridBagConstraints);

        jLabel18.setFont(new java.awt.Font("Verdana", 0, 24)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(110, 110, 110));
        jLabel18.setText("Últimos usuario agregados");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 11;
        gridBagConstraints.gridwidth = 11;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(50, 6, 0, 0);
        jPanel1.add(jLabel18, gridBagConstraints);

        jLabel10.setFont(new java.awt.Font("Verdana", 0, 16)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(110, 110, 110));
        jLabel10.setText("Tipo de usario:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 9;
        gridBagConstraints.gridwidth = 3;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(32, 74, 0, 0);
        jPanel1.add(jLabel10, gridBagConstraints);

        txt_user.setFont(new java.awt.Font("Verdana", 0, 16)); // NOI18N
        txt_user.setForeground(new java.awt.Color(110, 110, 110));
        txt_user.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(202, 202, 202), 1, true));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 8;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.gridwidth = 17;
        gridBagConstraints.gridheight = 2;
        gridBagConstraints.ipadx = 348;
        gridBagConstraints.ipady = 16;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(40, 10, 0, 0);
        jPanel1.add(txt_user, gridBagConstraints);

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
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 10;
        gridBagConstraints.gridwidth = 4;
        gridBagConstraints.ipadx = 36;
        gridBagConstraints.ipady = 19;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(54, 99, 0, 0);
        jPanel1.add(btn_guardar, gridBagConstraints);

        btn_cancelar.setBackground(new java.awt.Color(0, 153, 204));
        btn_cancelar.setFont(new java.awt.Font("Verdana", 0, 16)); // NOI18N
        btn_cancelar.setForeground(new java.awt.Color(255, 255, 255));
        btn_cancelar.setText("Cancelar");
        btn_cancelar.setBorder(null);
        btn_cancelar.setBorderPainted(false);
        btn_cancelar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_cancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_cancelarActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 12;
        gridBagConstraints.gridy = 10;
        gridBagConstraints.gridwidth = 12;
        gridBagConstraints.ipadx = 30;
        gridBagConstraints.ipady = 19;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(54, 8, 0, 0);
        jPanel1.add(btn_cancelar, gridBagConstraints);

        jLabel11.setFont(new java.awt.Font("Verdana", 0, 16)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(110, 110, 110));
        jLabel11.setText("Contraseña:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 5;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(27, 74, 0, 0);
        jPanel1.add(jLabel11, gridBagConstraints);

        txt_password.setFont(new java.awt.Font("Verdana", 0, 16)); // NOI18N
        txt_password.setForeground(new java.awt.Color(110, 110, 110));
        txt_password.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(202, 202, 202), 1, true));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 8;
        gridBagConstraints.gridy = 5;
        gridBagConstraints.gridwidth = 17;
        gridBagConstraints.gridheight = 2;
        gridBagConstraints.ipadx = 348;
        gridBagConstraints.ipady = 16;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(18, 10, 0, 0);
        jPanel1.add(txt_password, gridBagConstraints);

        jLabel12.setFont(new java.awt.Font("Verdana", 0, 16)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(110, 110, 110));
        jLabel12.setText("Repetir contraseña:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 7;
        gridBagConstraints.gridwidth = 5;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(37, 74, 0, 0);
        jPanel1.add(jLabel12, gridBagConstraints);

        txt_password2.setFont(new java.awt.Font("Verdana", 0, 16)); // NOI18N
        txt_password2.setForeground(new java.awt.Color(110, 110, 110));
        txt_password2.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(202, 202, 202), 1, true));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 8;
        gridBagConstraints.gridy = 7;
        gridBagConstraints.gridwidth = 17;
        gridBagConstraints.gridheight = 2;
        gridBagConstraints.ipadx = 348;
        gridBagConstraints.ipady = 16;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(28, 10, 0, 0);
        jPanel1.add(txt_password2, gridBagConstraints);

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
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 8;
        gridBagConstraints.gridy = 10;
        gridBagConstraints.ipadx = 49;
        gridBagConstraints.ipady = 19;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(54, 23, 0, 0);
        jPanel1.add(btn_nuevo, gridBagConstraints);

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
        gridBagConstraints.ipady = 3;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(24, 21, 0, 0);
        jPanel1.add(btn_volver, gridBagConstraints);

        table_users.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        table_users.setForeground(new java.awt.Color(0, 153, 255));
        table_users.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID ", "USUARIO", "CONTRASEÑA", "TIPO"
            }
        ));
        table_users.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        table_users.setGridColor(new java.awt.Color(204, 204, 204));
        table_users.setSelectionBackground(new java.awt.Color(137, 215, 245));
        jScrollPane4.setViewportView(table_users);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 13;
        gridBagConstraints.gridwidth = 26;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.ipadx = 598;
        gridBagConstraints.ipady = 179;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(10, 70, 73, 270);
        jPanel1.add(jScrollPane4, gridBagConstraints);

        jLabel13.setFont(new java.awt.Font("Verdana", 0, 16)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(110, 110, 110));
        jLabel13.setText("Usuario:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(49, 74, 0, 0);
        jPanel1.add(jLabel13, gridBagConstraints);

        cbo_tipos_users.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        cbo_tipos_users.setForeground(new java.awt.Color(110, 110, 110));
        cbo_tipos_users.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Normal", "Administrador" }));
        cbo_tipos_users.setToolTipText("");
        cbo_tipos_users.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        cbo_tipos_users.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbo_tipos_usersActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 8;
        gridBagConstraints.gridy = 9;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.ipady = 8;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(20, 10, 0, 0);
        jPanel1.add(cbo_tipos_users, gridBagConstraints);

        jLabel19.setFont(new java.awt.Font("Verdana", 0, 24)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(110, 110, 110));
        jLabel19.setText("Nuevo usuario");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 5;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridwidth = 6;
        gridBagConstraints.gridheight = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(80, 10, 0, 0);
        jPanel1.add(jLabel19, gridBagConstraints);

        jSeparator3.setBackground(new java.awt.Color(51, 204, 255));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 12;
        gridBagConstraints.gridwidth = 26;
        gridBagConstraints.ipadx = 619;
        gridBagConstraints.ipady = 9;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(20, 70, 0, 270);
        jPanel1.add(jSeparator3, gridBagConstraints);

        jScrollPane1.setViewportView(jPanel1);

        jTabbedPane1.addTab("Nuevo usuario", jScrollPane1);

        jPanel2.setBackground(new java.awt.Color(250, 250, 250));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jSeparator4.setBackground(new java.awt.Color(51, 204, 255));
        jPanel2.add(jSeparator4, new org.netbeans.lib.awtextra.AbsoluteConstraints(119, 359, 600, 11));

        jSeparator5.setBackground(new java.awt.Color(51, 204, 255));
        jPanel2.add(jSeparator5, new org.netbeans.lib.awtextra.AbsoluteConstraints(136, 98, 589, 11));

        jLabel16.setFont(new java.awt.Font("Verdana", 0, 16)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(110, 110, 110));
        jLabel16.setText("Acciones:");
        jPanel2.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 299, 100, -1));

        btn_cancelar2.setBackground(new java.awt.Color(0, 153, 204));
        btn_cancelar2.setFont(new java.awt.Font("Verdana", 0, 16)); // NOI18N
        btn_cancelar2.setForeground(new java.awt.Color(255, 255, 255));
        btn_cancelar2.setText("Cancelar");
        btn_cancelar2.setBorder(null);
        btn_cancelar2.setBorderPainted(false);
        btn_cancelar2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_cancelar2.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_cancelar2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_cancelar2ActionPerformed(evt);
            }
        });
        jPanel2.add(btn_cancelar2, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 290, 100, 40));

        jLabel20.setFont(new java.awt.Font("Verdana", 0, 24)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(110, 110, 110));
        jLabel20.setText("Resultados de búsqueda");
        jPanel2.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 229, 310, -1));

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
        jPanel2.add(btn_buscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 130, 100, 40));

        txt_buscar.setFont(new java.awt.Font("Verdana", 0, 16)); // NOI18N
        txt_buscar.setForeground(new java.awt.Color(110, 110, 110));
        txt_buscar.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(202, 202, 202), 1, true));
        txt_buscar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txt_buscarKeyReleased(evt);
            }
        });
        jPanel2.add(txt_buscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 130, 242, 39));

        jLabel14.setFont(new java.awt.Font("Verdana", 0, 16)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(110, 110, 110));
        jLabel14.setText("Nombre:");
        jPanel2.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 139, -1, -1));

        jLabel26.setFont(new java.awt.Font("Verdana", 0, 24)); // NOI18N
        jLabel26.setForeground(new java.awt.Color(110, 110, 110));
        jLabel26.setText("Buscar  pagos");
        jPanel2.add(jLabel26, new org.netbeans.lib.awtextra.AbsoluteConstraints(325, 39, 197, -1));

        txt_result_user.setBackground(new java.awt.Color(197, 230, 197));
        txt_result_user.setFont(new java.awt.Font("Verdana", 1, 16)); // NOI18N
        txt_result_user.setForeground(new java.awt.Color(0, 102, 204));
        txt_result_user.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(162, 214, 162), 1, true));
        txt_result_user.setDisabledTextColor(new java.awt.Color(0, 102, 204));
        txt_result_user.setEnabled(false);
        jPanel2.add(txt_result_user, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 390, 431, 39));

        jLabel21.setFont(new java.awt.Font("Verdana", 0, 16)); // NOI18N
        jLabel21.setForeground(new java.awt.Color(110, 110, 110));
        jLabel21.setText("Nombre de usuario:");
        jPanel2.add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 400, -1, -1));

        jLabel17.setFont(new java.awt.Font("Verdana", 0, 16)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(110, 110, 110));
        jLabel17.setText("Contraseña:");
        jPanel2.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 510, -1, -1));

        txt_result_password.setBackground(new java.awt.Color(197, 230, 197));
        txt_result_password.setFont(new java.awt.Font("Verdana", 1, 16)); // NOI18N
        txt_result_password.setForeground(new java.awt.Color(0, 102, 255));
        txt_result_password.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(162, 214, 162), 1, true));
        txt_result_password.setDisabledTextColor(new java.awt.Color(0, 102, 204));
        jPanel2.add(txt_result_password, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 510, 431, 39));

        jLabel22.setFont(new java.awt.Font("Verdana", 0, 16)); // NOI18N
        jLabel22.setForeground(new java.awt.Color(110, 110, 110));
        jLabel22.setText("Tipo:");
        jPanel2.add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 460, -1, -1));

        txt_tipo.setBackground(new java.awt.Color(197, 230, 197));
        txt_tipo.setFont(new java.awt.Font("Verdana", 1, 16)); // NOI18N
        txt_tipo.setForeground(new java.awt.Color(0, 102, 255));
        txt_tipo.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(162, 214, 162), 1, true));
        txt_tipo.setDisabledTextColor(new java.awt.Color(0, 102, 204));
        txt_tipo.setEnabled(false);
        jPanel2.add(txt_tipo, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 450, 431, 39));

        btn_guardar2.setBackground(new java.awt.Color(0, 153, 204));
        btn_guardar2.setFont(new java.awt.Font("Verdana", 0, 16)); // NOI18N
        btn_guardar2.setForeground(new java.awt.Color(255, 255, 255));
        btn_guardar2.setText("Guardar");
        btn_guardar2.setBorder(null);
        btn_guardar2.setBorderPainted(false);
        btn_guardar2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_guardar2.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_guardar2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_guardar2ActionPerformed(evt);
            }
        });
        jPanel2.add(btn_guardar2, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 600, 100, 40));

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
        jPanel2.add(btn_eliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 290, 100, 40));

        btn_editar1.setBackground(new java.awt.Color(0, 153, 204));
        btn_editar1.setFont(new java.awt.Font("Verdana", 0, 16)); // NOI18N
        btn_editar1.setForeground(new java.awt.Color(255, 255, 255));
        btn_editar1.setText("Editar");
        btn_editar1.setBorder(null);
        btn_editar1.setBorderPainted(false);
        btn_editar1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_editar1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_editar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_editar1ActionPerformed(evt);
            }
        });
        jPanel2.add(btn_editar1, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 290, 100, 40));

        table_users2.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        table_users2.setForeground(new java.awt.Color(0, 153, 255));
        table_users2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID ", "USUARIO", "CONTRASEÑA", "TIPO"
            }
        ));
        table_users2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        table_users2.setGridColor(new java.awt.Color(204, 204, 204));
        table_users2.setSelectionBackground(new java.awt.Color(137, 215, 245));
        jScrollPane5.setViewportView(table_users2);

        jPanel2.add(jScrollPane5, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 680, 670, 205));

        jScrollPane2.setViewportView(jPanel2);

        jTabbedPane1.addTab("Modificar usarios", jScrollPane2);

        getContentPane().add(jTabbedPane1, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    
    
    
/*-----------------------------------------------------------------------------------
        metodo  para el  boton regresar al home
-------------------------------------------------------------------------------------*/
    private void btn_volverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_volverActionPerformed
        Home frm_home = new Home();
        frm_home.setVisible(true);
        dispose();
    }//GEN-LAST:event_btn_volverActionPerformed

    
    
    
    
    private void cbo_tipos_usersActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbo_tipos_usersActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbo_tipos_usersActionPerformed

    
    
    
/*-----------------------------------------------------------------------------------
        metodo  para el  boton buscar clientes
-------------------------------------------------------------------------------------*/
    private void btn_buscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_buscarActionPerformed
        String buscar;
        buscar = Validar.quitarEspaciosEnBlanco(txt_buscar);
        //para combrobar que no se ingrese espacios en blanco
        if(buscar.length()>0 ){
            try {
                sql = "select * from users where usuario = '"+buscar+"'";
                ps = conexion.prepareStatement(sql);
                rs = ps.executeQuery(sql);
                 //para cargar datos si existen en la base                       
                if(rs.next()){//para verficar que no se creen usarios con el mismo nomrbe
                      this.btn_editar1.setEnabled(true);
                              
                      JOptionPane.showMessageDialog(this, "Usuario encontrado");
                      this.txt_result_user.setText(rs.getString("usuario"));
                      this.txt_result_password.setText(rs.getString("password"));
                      this.txt_tipo.setText(rs.getString("tipo"));
                    
                 }else{
                    JOptionPane.showMessageDialog(this, "Usuario no existe");
                    txt_buscar.setText("");
                    txt_buscar.requestFocus();
                }//fin de compirbar que el usuario exista
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(this, ex.getMessage());
            }
            
        }else{
            JOptionPane.showMessageDialog(this, "Llene el campo de busqueda");
            txt_buscar.setText("");
            txt_buscar.requestFocus();
        }//fin para combrobar que no se ingrese espacios en blanco
        
    }//GEN-LAST:event_btn_buscarActionPerformed

    
    
    
    
    
/*-----------------------------------------------------------------------------------
        metodo  para el boton eliminar 
-------------------------------------------------------------------------------------*/    
    
    
    private void btn_guardar2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_guardar2ActionPerformed
      String pass = Validar.quitarEspaciosEnBlanco(txt_result_password);
      //String user = Validar.quitarEspaciosEnBlanco(txt_result_user);
      
      if(pass.length() > 0){
          
          try {
              int confirm = JOptionPane.showConfirmDialog(rootPane, "Esta seguro que quiere cambiar su contraseña");
              if(confirm == JOptionPane.YES_OPTION){
                sql = "update users set password = '"+pass+"' where usuario= '"+txt_result_user.getText()+"'";
                ps = conexion.prepareStatement(sql);
                ps.executeUpdate(sql);
                JOptionPane.showMessageDialog(this, "Felicidades su nueva contraseña es " + pass);
                    this.btn_editar1.setEnabled(false);
                    this.txt_result_user.setText("");
                    this.txt_tipo.setText("");
                    this.txt_result_password.setText("");
                    this.txt_buscar.setText("");
                    this.txt_buscar.requestFocus();
                cargarTabla();
              }else if(confirm == JOptionPane.NO_OPTION || confirm == JOptionPane.CANCEL_OPTION){
                JOptionPane.showMessageDialog(this, "La contraseña no se cambio");
              }
              
          } catch (SQLException ex) {
              JOptionPane.showMessageDialog(this, ex.getMessage());
          }
      }
      
    }//GEN-LAST:event_btn_guardar2ActionPerformed

    
    
    
/*-----------------------------------------------------------------------------------
        metodo  para el boton eliminar 
-------------------------------------------------------------------------------------*/
    private void btn_eliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_eliminarActionPerformed
        
        try {
            String usuario  = Validar.quitarEspaciosEnBlanco(txt_buscar);
            
            sql = "select * from users where usuario = '"+usuario+"'";
            
            ps = conexion.prepareStatement(sql);
            rs = ps.executeQuery(sql);
            
            if(rs.next()){
                int confirm = JOptionPane.showConfirmDialog(this, "Esta seguro que desea eliminar el usuario "+usuario );
                
                
                if(confirm  == JOptionPane.YES_OPTION){
                   
                    sql = "delete from users where usuario = '"+usuario+"'";
                    ps = conexion.prepareStatement(sql);
                    ps.executeUpdate(sql);
                    JOptionPane.showMessageDialog(this, "El usuario " + usuario +" fué eliminado con éxito");
                    this.btn_editar1.setEnabled(false);
                    this.txt_result_user.setText("");
                    this.txt_tipo.setText("");
                    this.txt_result_password.setText("");
                    this.txt_buscar.setText("");
                    this.txt_buscar.requestFocus();
                    cargarTabla();
                    
                }else if(confirm == JOptionPane.CANCEL_OPTION || confirm == JOptionPane.NO_OPTION){
                    JOptionPane.showMessageDialog(this, "No se Elimino el usuario");
                }
                
            }
        } catch (SQLException ex) {
             JOptionPane.showConfirmDialog(this, ex.getMessage());
        }
        
        
    }//GEN-LAST:event_btn_eliminarActionPerformed

    
    
    
    
/*-----------------------------------------------------------------------------------
        metodo  el boton nuevo y desbloquear cajas de texto para ingrear un user
-------------------------------------------------------------------------------------*/
    
    private void btn_nuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_nuevoActionPerformed
        bloquear(true);
        
        this.txt_user.setText("");
        this.txt_password.setText("");
        this.txt_password2.setText("");
    }//GEN-LAST:event_btn_nuevoActionPerformed

    
    
    
/*-----------------------------------------------------------------------------------
        metodo  el boton cancelar y bloquear cajas de texto para ingrear un user
 ------------------------------------------------------------------------------------*/
    private void btn_cancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_cancelarActionPerformed
         bloquear(false);
        
        this.txt_user.setText("");
        this.txt_password.setText("");
        this.txt_password2.setText("");
    }//GEN-LAST:event_btn_cancelarActionPerformed

 
    
 /*-----------------------------------------------------------------------------------
        metodo cargar tabla
 ------------------------------------------------------------------------------------*/   
public void cargarTabla(){
		
	//vector para agreagar a las columnas titulos
	String titulos[] = {"Id","Usuarios","passsword","tipo",};
	//vector para guaradar los registros que se recupen de la base de datos
	String[] registros = new String[4];//cantidad de las columnas de la tabla
	//asignamos al model el vector de titulos poder insertar en la tabla los registros
	DefaultTableModel modelo = new DefaultTableModel(null,titulos);
	//la conexion a la base
	
	//mandamos la sentencia sql
	sql = "select * from users";
			
	//creamos stament
       
	try{
             ps = conexion.prepareStatement(sql);
            rs = ps.executeQuery(sql);
            //bucle para ir cargando lo datos en el resulset
		while(rs.next()){
			registros[0] = rs.getString("id");//mismos campos de la base
			registros[1] = rs.getString("usuario");//mismos campos de la base
			registros[2] = rs.getString("password");//mismos campos de la base
                        registros[3] = rs.getString("tipo");//mismos campos de la base

			modelo.addRow(registros);//cargamos los datos al model
		}
		
		table_users.setModel(modelo);//cargamos los datos dfel modelo a la tabla
                table_users2.setModel(modelo);//cargamos los datos dfel modelo a la tabla
		
	}catch(SQLException ex){
		JOptionPane.showMessageDialog(null,ex.getMessage());		
		
	}

}
/*sobre carga del metodo cargar tabla*/  

public void cargarTabla(String valor){
		
	//vector para agreagar a las columnas titulos
	String titulos[] = {"Id","Usuarios","passsword","tipo",};
	//vector para guaradar los registros que se recupen de la base de datos
	String[] registros = new String[4];//cantidad de las columnas de la tabla
	//asignamos al model el vector de titulos poder insertar en la tabla los registros
	DefaultTableModel modelo = new DefaultTableModel(null,titulos);
	//la conexion a la base
	
	//mandamos la sentencia sql
	sql = "select * from users where usuario like '"+valor+"%'";
			
	//creamos stament
       
	try{
             ps = conexion.prepareStatement(sql);
            rs = ps.executeQuery(sql);
            //bucle para ir cargando lo datos en el resulset
		while(rs.next()){
			registros[0] = rs.getString("id");//mismos campos de la base
			registros[1] = rs.getString("usuario");//mismos campos de la base
			registros[2] = rs.getString("password");//mismos campos de la base
                        registros[3] = rs.getString("tipo");//mismos campos de la base

			modelo.addRow(registros);//cargamos los datos al model
		}
		
		table_users2.setModel(modelo);//cargamos los datos dfel modelo a la tabla
		
	}catch(SQLException ex){
		JOptionPane.showMessageDialog(null,ex.getMessage());		
		
	}

}



 
                    
                    
/*-----------------------------------------------------------------------------------
        metodo  el boton guardar nuevo usuario
 ------------------------------------------------------------------------------------*/
    private void btn_guardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_guardarActionPerformed
        
        String user,pass,pass2,tipo;    
        //llamando a la clase validaciones para validar cajas de texto en blanco
        user = Validar.quitarEspaciosEnBlanco(txt_user);
        pass = Validar.quitarEspaciosEnBlanco(txt_password);
        pass2 = Validar.quitarEspaciosEnBlanco(txt_password2);
        tipo = String.valueOf(this.cbo_tipos_users.getSelectedItem());
        
        //para validar que las cajas de contraseña sean iguales
        if(pass.equals(pass2) ){
            //para validar que las cajas no esten vacias
           if(user.length()>0 && pass.length() > 0 && pass2.length() > 0){
   
                   try {
                       sql2 = "select * from users where usuario = '"+user+"'";
                       ps = conexion.prepareStatement(sql2);
                       rs = ps.executeQuery(sql2);
                                              
                       if(rs.next()){//para verficar que no se creen usarios con el mismo nombre
                            
                             JOptionPane.showMessageDialog(this, "El usuario "+user+" ya existe");
                
                        }else{
                                sql = "Insert into users(usuario,password,tipo) values(?,?,?)";
                               //vector para gurdar registros de la tabla

                               try {
                                   ps = conexion.prepareStatement(sql);
                                   ps.setString(1, user);
                                   ps.setString(2, pass);
                                   ps.setString(3, tipo);

                                   int n = ps.executeUpdate();
                                   if(n > 0){

                                       JOptionPane.showMessageDialog(this,"Cliente guradado cone éxito");
                                       cargarTabla();
                                   }

                               }catch (SQLException ex) {
                                   JOptionPane.showMessageDialog(this, ex.getMessage());
                               }//fin de try
                        }
                        
                        
                       
                   }catch (SQLException ex) {
                     JOptionPane.showMessageDialog(this, ex.getMessage());
                   }//fin de try
        
        }else{
            JOptionPane.showMessageDialog(null,"Llene todos los campos");
        }//fin de else para verificar campos vacios
        }else{
            JOptionPane.showMessageDialog(rootPane, "La contraseñas no coinciden");
            txt_password.setText("");
            txt_password2.setText("");
            txt_password.requestFocus();
            
        }//fin de else para verificar las contraseñas
    
    }//GEN-LAST:event_btn_guardarActionPerformed

    
    
/*-----------------------------------------------------------------------------------
        metodo  desbloaquera cajas y pode editar el usuario que se buscaba
 ------------------------------------------------------------------------------------*/    
    
    private void btn_editar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_editar1ActionPerformed
        JOptionPane.showMessageDialog(this, "Sólo puede editar la contraseña");
        bloquearResult(true);
        this.txt_result_password.requestFocus();
    }//GEN-LAST:event_btn_editar1ActionPerformed

    private void btn_cancelar2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_cancelar2ActionPerformed
         this.btn_editar1.setEnabled(false);
         this.txt_result_user.setText("");
         this.txt_tipo.setText("");
         this.txt_result_password.setText("");
    }//GEN-LAST:event_btn_cancelar2ActionPerformed

    
 

/*-----------------------------------------------------------------------------------
        metodo  para filtar los usuarios que se busca desde el caja de texto buscar 
 ------------------------------------------------------------------------------------*/    
    
    private void txt_buscarKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_buscarKeyReleased
            cargarTabla(txt_buscar.getText());
    }//GEN-LAST:event_txt_buscarKeyReleased
//fin del metodo guardar del botn guardar
    
    


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_buscar;
    private javax.swing.JButton btn_cancelar;
    private javax.swing.JButton btn_cancelar2;
    private javax.swing.JButton btn_editar1;
    private javax.swing.JButton btn_eliminar;
    private javax.swing.JButton btn_guardar;
    private javax.swing.JButton btn_guardar2;
    private javax.swing.JButton btn_nuevo;
    private javax.swing.JButton btn_volver;
    private javax.swing.JComboBox cbo_tipos_users;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable table_users;
    private javax.swing.JTable table_users2;
    private javax.swing.JTextField txt_buscar;
    private javax.swing.JTextField txt_password;
    private javax.swing.JTextField txt_password2;
    private javax.swing.JTextField txt_result_password;
    private javax.swing.JTextField txt_result_user;
    private javax.swing.JTextField txt_tipo;
    private javax.swing.JTextField txt_user;
    // End of variables declaration//GEN-END:variables
}
