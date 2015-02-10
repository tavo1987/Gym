package forms;
import javax.swing.*;
import Mysql.*;
import validaciones.*;

public class Form_users extends javax.swing.JFrame {
    
    
    public Form_users() {
        initComponents();
        setLocationRelativeTo(null);
      //para poner todas las cajas de testo en descativadas al inicial al formulario
        bloquear(false);
      //para limitar ingreso de caracteres en la cajas      
       txt_user.setDocument(new Validar(txt_user,20));
       txt_password.setDocument(new Validar(txt_password,30));
       txt_password2.setDocument(new Validar(txt_password2,30));
       
      
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

    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

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
        btn_editar = new javax.swing.JButton();
        jLabel20 = new javax.swing.JLabel();
        btn_buscar = new javax.swing.JButton();
        txt_nombre_user = new javax.swing.JTextField();
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

        jTabbedPane1.setForeground(new java.awt.Color(110, 110, 110));
        jTabbedPane1.setFont(new java.awt.Font("Verdana", 0, 16)); // NOI18N

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jSeparator2.setBackground(new java.awt.Color(51, 204, 255));
        jPanel1.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(165, 141, 560, 10));

        jLabel18.setFont(new java.awt.Font("Verdana", 0, 24)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(110, 110, 110));
        jLabel18.setText("Últimos usuario agregados");
        jPanel1.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(283, 542, -1, -1));

        jLabel10.setFont(new java.awt.Font("Verdana", 0, 16)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(110, 110, 110));
        jLabel10.setText("Usuario:");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(165, 375, -1, -1));

        txt_user.setFont(new java.awt.Font("Verdana", 0, 16)); // NOI18N
        txt_user.setForeground(new java.awt.Color(110, 110, 110));
        txt_user.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(202, 202, 202), 1, true));
        jPanel1.add(txt_user, new org.netbeans.lib.awtextra.AbsoluteConstraints(337, 180, 350, 39));

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
        jPanel1.add(btn_guardar, new org.netbeans.lib.awtextra.AbsoluteConstraints(261, 442, 100, 40));

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
        jPanel1.add(btn_cancelar, new org.netbeans.lib.awtextra.AbsoluteConstraints(554, 442, 100, 40));

        jLabel11.setFont(new java.awt.Font("Verdana", 0, 16)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(110, 110, 110));
        jLabel11.setText("Contraseña:");
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(165, 246, -1, -1));

        txt_password.setFont(new java.awt.Font("Verdana", 0, 16)); // NOI18N
        txt_password.setForeground(new java.awt.Color(110, 110, 110));
        txt_password.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(202, 202, 202), 1, true));
        jPanel1.add(txt_password, new org.netbeans.lib.awtextra.AbsoluteConstraints(337, 237, 350, 39));

        jLabel12.setFont(new java.awt.Font("Verdana", 0, 16)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(110, 110, 110));
        jLabel12.setText("Repetir contraseña:");
        jPanel1.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(165, 313, -1, -1));

        txt_password2.setFont(new java.awt.Font("Verdana", 0, 16)); // NOI18N
        txt_password2.setForeground(new java.awt.Color(110, 110, 110));
        txt_password2.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(202, 202, 202), 1, true));
        jPanel1.add(txt_password2, new org.netbeans.lib.awtextra.AbsoluteConstraints(337, 304, 350, 39));

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
        jPanel1.add(btn_nuevo, new org.netbeans.lib.awtextra.AbsoluteConstraints(415, 442, 100, 40));

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
        jPanel1.add(btn_volver, new org.netbeans.lib.awtextra.AbsoluteConstraints(21, 24, 70, 80));

        table_users.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane4.setViewportView(table_users);

        jPanel1.add(jScrollPane4, new org.netbeans.lib.awtextra.AbsoluteConstraints(104, 614, 654, 205));

        jLabel13.setFont(new java.awt.Font("Verdana", 0, 16)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(110, 110, 110));
        jLabel13.setText("Usuario:");
        jPanel1.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(165, 189, -1, -1));

        cbo_tipos_users.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        cbo_tipos_users.setForeground(new java.awt.Color(110, 110, 110));
        cbo_tipos_users.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Normal", "Administrador" }));
        cbo_tipos_users.setToolTipText("");
        cbo_tipos_users.setBorder(null);
        cbo_tipos_users.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        cbo_tipos_users.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbo_tipos_usersActionPerformed(evt);
            }
        });
        jPanel1.add(cbo_tipos_users, new org.netbeans.lib.awtextra.AbsoluteConstraints(337, 363, -1, 33));

        jLabel19.setFont(new java.awt.Font("Verdana", 0, 24)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(110, 110, 110));
        jLabel19.setText("Nuevo usuario");
        jPanel1.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(341, 74, -1, -1));

        jSeparator3.setBackground(new java.awt.Color(51, 204, 255));
        jPanel1.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(165, 583, 560, 10));

        jScrollPane1.setViewportView(jPanel1);

        jTabbedPane1.addTab("Nuevo usuario", jScrollPane1);

        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jSeparator4.setBackground(new java.awt.Color(51, 204, 255));
        jPanel2.add(jSeparator4, new org.netbeans.lib.awtextra.AbsoluteConstraints(119, 359, 600, 11));

        jSeparator5.setBackground(new java.awt.Color(51, 204, 255));
        jPanel2.add(jSeparator5, new org.netbeans.lib.awtextra.AbsoluteConstraints(136, 98, 589, 11));

        jLabel16.setFont(new java.awt.Font("Verdana", 0, 16)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(110, 110, 110));
        jLabel16.setText("Acciones:");
        jPanel2.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 299, 100, -1));

        btn_editar.setBackground(new java.awt.Color(0, 153, 204));
        btn_editar.setFont(new java.awt.Font("Verdana", 0, 16)); // NOI18N
        btn_editar.setForeground(new java.awt.Color(255, 255, 255));
        btn_editar.setText("Editar");
        btn_editar.setBorder(null);
        btn_editar.setBorderPainted(false);
        btn_editar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_editar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jPanel2.add(btn_editar, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 290, 100, 40));

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
        jPanel2.add(btn_buscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(594, 129, 100, 40));

        txt_nombre_user.setFont(new java.awt.Font("Verdana", 0, 16)); // NOI18N
        txt_nombre_user.setForeground(new java.awt.Color(110, 110, 110));
        txt_nombre_user.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(202, 202, 202), 1, true));
        jPanel2.add(txt_nombre_user, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 129, 242, 39));

        jLabel14.setFont(new java.awt.Font("Verdana", 0, 16)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(110, 110, 110));
        jLabel14.setText("Nombre:");
        jPanel2.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 139, -1, -1));

        jLabel26.setFont(new java.awt.Font("Verdana", 0, 24)); // NOI18N
        jLabel26.setForeground(new java.awt.Color(110, 110, 110));
        jLabel26.setText("Buscar  pagos");
        jPanel2.add(jLabel26, new org.netbeans.lib.awtextra.AbsoluteConstraints(325, 39, 197, -1));

        txt_result_user.setBackground(new java.awt.Color(197, 230, 197));
        txt_result_user.setFont(new java.awt.Font("Verdana", 0, 16)); // NOI18N
        txt_result_user.setForeground(new java.awt.Color(110, 110, 110));
        txt_result_user.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(162, 214, 162), 1, true));
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
        txt_result_password.setFont(new java.awt.Font("Verdana", 0, 16)); // NOI18N
        txt_result_password.setForeground(new java.awt.Color(110, 110, 110));
        txt_result_password.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(162, 214, 162), 1, true));
        jPanel2.add(txt_result_password, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 510, 431, 39));

        jLabel22.setFont(new java.awt.Font("Verdana", 0, 16)); // NOI18N
        jLabel22.setForeground(new java.awt.Color(110, 110, 110));
        jLabel22.setText("Tipo:");
        jPanel2.add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 460, -1, -1));

        txt_tipo.setBackground(new java.awt.Color(197, 230, 197));
        txt_tipo.setFont(new java.awt.Font("Verdana", 0, 16)); // NOI18N
        txt_tipo.setForeground(new java.awt.Color(110, 110, 110));
        txt_tipo.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(162, 214, 162), 1, true));
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
        jPanel2.add(btn_guardar2, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 610, 100, 40));

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

        jScrollPane2.setViewportView(jPanel2);

        jTabbedPane1.addTab("Modificar usarios", jScrollPane2);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 882, Short.MAX_VALUE)
        );

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

    private void btn_buscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_buscarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_buscarActionPerformed

    private void btn_guardar2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_guardar2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_guardar2ActionPerformed

    private void btn_eliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_eliminarActionPerformed
        // TODO add your handling code here:
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
        metodo  el boton guardar nuevo usuario
 ------------------------------------------------------------------------------------*/
    private void btn_guardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_guardarActionPerformed
        
        //variables para las cajas de texto
        String user = this.txt_user.getText();
        String password = this.txt_password.getText();
        String password2 = this.txt_password2.getText();
        
        //llamando a la clase validaciones para validar cajas de texto en blanco
        boolean usuario = Validar.validarEspacionEnBlanco(user);
        boolean pass = Validar.validarEspacionEnBlanco(password);
        boolean pass2 = Validar.validarEspacionEnBlanco(password2);
        
       //Declaramos la clase validar
              
        
        if(usuario == false && pass == false && pass2 == false){
            
            JOptionPane.showMessageDialog(null,"Todo ok");
        
        }else{
            JOptionPane.showMessageDialog(null,"Llene todos los campos");
        }
        
      
        
    }//GEN-LAST:event_btn_guardarActionPerformed

    
    
    
    
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Form_users.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Form_users.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Form_users.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Form_users.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Form_users().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_buscar;
    private javax.swing.JButton btn_cancelar;
    private javax.swing.JButton btn_editar;
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
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable table_users;
    private javax.swing.JTextField txt_nombre_user;
    private javax.swing.JTextField txt_password;
    private javax.swing.JTextField txt_password2;
    private javax.swing.JTextField txt_result_password;
    private javax.swing.JTextField txt_result_user;
    private javax.swing.JTextField txt_tipo;
    private javax.swing.JTextField txt_user;
    // End of variables declaration//GEN-END:variables
}
