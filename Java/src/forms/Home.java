package forms;
import javax.swing.*;

public class Home extends JFrame {

    public Home() {
        initComponents();
        setLocationRelativeTo(null);
        setTitle("Bienvenido");
    }

/*---------------------------------------------------------
    $Home codigo de la interfaz generado por netbeans 
 ----------------------------------------------------------*/
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        jMenuItem3 = new javax.swing.JMenuItem();
        jLabel18 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        txt_usuario = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        btn_ingresar = new javax.swing.JButton();
        btn_salir = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txt_password = new javax.swing.JPasswordField();
        jSeparator2 = new javax.swing.JSeparator();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        mnu_salir = new javax.swing.JMenuItem();
        mnu_clientes = new javax.swing.JMenu();
        mnu_cliente_nuevo = new javax.swing.JMenuItem();
        mnu_cliente_asistencia = new javax.swing.JMenuItem();
        mnu_cliente_modificar = new javax.swing.JMenuItem();
        mnu_pagos = new javax.swing.JMenu();
        mnu_membresia = new javax.swing.JMenu();
        mnu_ficha = new javax.swing.JMenu();
        mnu_ficha_nueva = new javax.swing.JMenuItem();
        mnu_ficha_detalles = new javax.swing.JMenuItem();
        mnu_usuarios = new javax.swing.JMenu();
        mnu_usuarios_nuevo = new javax.swing.JMenuItem();
        mnu_usuarios_detalles = new javax.swing.JMenuItem();

        jMenuItem3.setText("jMenuItem3");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Bienvenidos");
        setBounds(new java.awt.Rectangle(0, 0, 600, 0));
        setFont(new java.awt.Font("Verdana", 0, 16)); // NOI18N
        setMinimumSize(new java.awt.Dimension(826, 603));
        setPreferredSize(new java.awt.Dimension(826, 603));
        getContentPane().setLayout(new java.awt.GridBagLayout());

        jLabel18.setFont(new java.awt.Font("Verdana", 0, 24)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(110, 110, 110));
        jLabel18.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel18.setText("BIENVENIDO");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridwidth = 4;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(39, 79, 0, 0);
        getContentPane().add(jLabel18, gridBagConstraints);

        jLabel10.setFont(new java.awt.Font("Verdana", 0, 16)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(110, 110, 110));
        jLabel10.setText("Usuario:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(8, 139, 0, 0);
        getContentPane().add(jLabel10, gridBagConstraints);

        txt_usuario.setFont(new java.awt.Font("Verdana", 0, 16)); // NOI18N
        txt_usuario.setForeground(new java.awt.Color(110, 110, 110));
        txt_usuario.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(202, 202, 202), 1, true));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.gridwidth = 13;
        gridBagConstraints.gridheight = 3;
        gridBagConstraints.ipadx = 455;
        gridBagConstraints.ipady = 16;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(8, 10, 0, 0);
        getContentPane().add(txt_usuario, gridBagConstraints);

        jLabel11.setFont(new java.awt.Font("Verdana", 0, 16)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(110, 110, 110));
        jLabel11.setText("contraseña:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 5;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(17, 139, 0, 0);
        getContentPane().add(jLabel11, gridBagConstraints);

        btn_ingresar.setBackground(new java.awt.Color(0, 153, 204));
        btn_ingresar.setFont(new java.awt.Font("Verdana", 0, 16)); // NOI18N
        btn_ingresar.setForeground(new java.awt.Color(255, 255, 255));
        btn_ingresar.setText("INGRESAR");
        btn_ingresar.setBorder(null);
        btn_ingresar.setBorderPainted(false);
        btn_ingresar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 7;
        gridBagConstraints.gridwidth = 3;
        gridBagConstraints.ipadx = 64;
        gridBagConstraints.ipady = 29;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(77, 4, 266, 0);
        getContentPane().add(btn_ingresar, gridBagConstraints);

        btn_salir.setBackground(new java.awt.Color(0, 153, 204));
        btn_salir.setFont(new java.awt.Font("Verdana", 0, 16)); // NOI18N
        btn_salir.setForeground(new java.awt.Color(255, 255, 255));
        btn_salir.setText("SALIR");
        btn_salir.setBorder(null);
        btn_salir.setBorderPainted(false);
        btn_salir.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_salir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_salirActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 6;
        gridBagConstraints.gridy = 7;
        gridBagConstraints.gridwidth = 5;
        gridBagConstraints.ipadx = 100;
        gridBagConstraints.ipady = 29;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(77, 43, 266, 0);
        getContentPane().add(btn_salir, gridBagConstraints);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/ic_person_24.png"))); // NOI18N
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 16;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.gridheight = 2;
        gridBagConstraints.ipady = 10;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(8, 4, 0, 95);
        getContentPane().add(jLabel1, gridBagConstraints);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/ic_lock_24.png"))); // NOI18N
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 16;
        gridBagConstraints.gridy = 5;
        gridBagConstraints.gridheight = 2;
        gridBagConstraints.ipady = 15;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(11, 4, 0, 95);
        getContentPane().add(jLabel2, gridBagConstraints);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 5;
        gridBagConstraints.gridwidth = 13;
        gridBagConstraints.gridheight = 2;
        gridBagConstraints.ipadx = 451;
        gridBagConstraints.ipady = 19;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(11, 10, 0, 0);
        getContentPane().add(txt_password, gridBagConstraints);

        jSeparator2.setBackground(new java.awt.Color(51, 204, 255));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.gridwidth = 12;
        gridBagConstraints.ipadx = 589;
        gridBagConstraints.ipady = 9;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(31, 110, 0, 0);
        getContentPane().add(jSeparator2, gridBagConstraints);

        jMenuBar1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jMenuBar1.setMinimumSize(new java.awt.Dimension(800, 600));

        jMenu1.setForeground(new java.awt.Color(110, 110, 110));
        jMenu1.setText("Archivo");
        jMenu1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jMenu1.setFont(new java.awt.Font("Verdana", 0, 16)); // NOI18N

        mnu_salir.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        mnu_salir.setForeground(new java.awt.Color(110, 110, 110));
        mnu_salir.setText("Salir");
        mnu_salir.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        mnu_salir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnu_salirActionPerformed(evt);
            }
        });
        jMenu1.add(mnu_salir);

        jMenuBar1.add(jMenu1);

        mnu_clientes.setForeground(new java.awt.Color(110, 110, 110));
        mnu_clientes.setText("Clientes");
        mnu_clientes.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        mnu_clientes.setFont(new java.awt.Font("Verdana", 0, 16)); // NOI18N

        mnu_cliente_nuevo.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        mnu_cliente_nuevo.setForeground(new java.awt.Color(110, 110, 110));
        mnu_cliente_nuevo.setText("Nuevo");
        mnu_cliente_nuevo.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        mnu_cliente_nuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnu_cliente_nuevoActionPerformed(evt);
            }
        });
        mnu_clientes.add(mnu_cliente_nuevo);

        mnu_cliente_asistencia.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        mnu_cliente_asistencia.setForeground(new java.awt.Color(110, 110, 110));
        mnu_cliente_asistencia.setText("Asistencia");
        mnu_cliente_asistencia.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        mnu_cliente_asistencia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnu_cliente_asistenciaActionPerformed(evt);
            }
        });
        mnu_clientes.add(mnu_cliente_asistencia);

        mnu_cliente_modificar.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        mnu_cliente_modificar.setForeground(new java.awt.Color(110, 110, 110));
        mnu_cliente_modificar.setText("Modificar clientes");
        mnu_cliente_modificar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        mnu_cliente_modificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnu_cliente_modificarActionPerformed(evt);
            }
        });
        mnu_clientes.add(mnu_cliente_modificar);

        jMenuBar1.add(mnu_clientes);

        mnu_pagos.setForeground(new java.awt.Color(110, 110, 110));
        mnu_pagos.setText("Pagos");
        mnu_pagos.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        mnu_pagos.setFont(new java.awt.Font("Verdana", 0, 16)); // NOI18N
        mnu_pagos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                mnu_pagosMouseClicked(evt);
            }
        });
        jMenuBar1.add(mnu_pagos);

        mnu_membresia.setForeground(new java.awt.Color(110, 110, 110));
        mnu_membresia.setText("Membresia");
        mnu_membresia.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        mnu_membresia.setFont(new java.awt.Font("Verdana", 0, 16)); // NOI18N
        mnu_membresia.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                mnu_membresiaMouseClicked(evt);
            }
        });
        jMenuBar1.add(mnu_membresia);

        mnu_ficha.setBackground(new java.awt.Color(252, 252, 252));
        mnu_ficha.setForeground(new java.awt.Color(110, 110, 110));
        mnu_ficha.setText("Ficha");
        mnu_ficha.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        mnu_ficha.setFont(new java.awt.Font("Verdana", 0, 16)); // NOI18N

        mnu_ficha_nueva.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        mnu_ficha_nueva.setForeground(new java.awt.Color(110, 110, 110));
        mnu_ficha_nueva.setText("Nueva");
        mnu_ficha_nueva.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        mnu_ficha.add(mnu_ficha_nueva);

        mnu_ficha_detalles.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        mnu_ficha_detalles.setForeground(new java.awt.Color(110, 110, 110));
        mnu_ficha_detalles.setText("Detalles");
        mnu_ficha_detalles.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        mnu_ficha.add(mnu_ficha_detalles);

        jMenuBar1.add(mnu_ficha);

        mnu_usuarios.setBackground(new java.awt.Color(252, 252, 252));
        mnu_usuarios.setForeground(new java.awt.Color(110, 110, 110));
        mnu_usuarios.setText("Usuarios");
        mnu_usuarios.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        mnu_usuarios.setFont(new java.awt.Font("Verdana", 0, 16)); // NOI18N

        mnu_usuarios_nuevo.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        mnu_usuarios_nuevo.setForeground(new java.awt.Color(110, 110, 110));
        mnu_usuarios_nuevo.setText("Nuevo");
        mnu_usuarios_nuevo.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        mnu_usuarios.add(mnu_usuarios_nuevo);

        mnu_usuarios_detalles.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        mnu_usuarios_detalles.setForeground(new java.awt.Color(110, 110, 110));
        mnu_usuarios_detalles.setText("Detalles");
        mnu_usuarios_detalles.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        mnu_usuarios.add(mnu_usuarios_detalles);

        jMenuBar1.add(mnu_usuarios);

        setJMenuBar(jMenuBar1);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    
    
    
/*---------------------------------------------------------
    $Menu codigo para el boton salir del menu
 ----------------------------------------------------------*/
    private void mnu_salirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnu_salirActionPerformed

        System.exit(0);
        
    }//GEN-LAST:event_mnu_salirActionPerformed

    
    
    
/*---------------------------------------------------------
    $Menu cliente nuevo llamandio al formulario  asistencia
 ----------------------------------------------------------*/
    private void mnu_cliente_asistenciaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnu_cliente_asistenciaActionPerformed
       Form_Asistencia frm_asistencia = new Form_Asistencia ();
       frm_asistencia.setVisible(true);
       dispose();
    }//GEN-LAST:event_mnu_cliente_asistenciaActionPerformed

    
    
    
 /*---------------------------------------------------------
    $metodo para llamar el formulario clientes
 ----------------------------------------------------------*/
    private void mnu_cliente_nuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnu_cliente_nuevoActionPerformed
        
        Form_clientes frm_clientes = new Form_clientes();
        frm_clientes.setVisible(true);
        dispose();
        
    }//GEN-LAST:event_mnu_cliente_nuevoActionPerformed

    
    
    
 /*---------------------------------------------------------
    $Home boton para salir de la aplicación 
 ----------------------------------------------------------*/
    private void btn_salirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_salirActionPerformed
            
        System.exit(0);
    }//GEN-LAST:event_btn_salirActionPerformed

    
    
    
  /*---------------------------------------------------------
    $metodo para llamar el formulario modificar clientes
 ----------------------------------------------------------*/
    private void mnu_cliente_modificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnu_cliente_modificarActionPerformed
        Form_modificar_clientes frm_modificar_clientes = new Form_modificar_clientes();
        frm_modificar_clientes.setVisible(true);
        dispose();
    }//GEN-LAST:event_mnu_cliente_modificarActionPerformed

    
/*---------------------------------------------------------
    $metodo para llamar el formulario de pagos
 ----------------------------------------------------------*/   
    
    private void mnu_pagosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mnu_pagosMouseClicked
     Form_pagos frm_pagos = new Form_pagos();
     frm_pagos.setVisible(true);
     dispose();
     
    }//GEN-LAST:event_mnu_pagosMouseClicked

    
    

  
    
    
    
        
/*---------------------------------------------------------
    $metodo para llamar el formulario de membresia
 ----------------------------------------------------------*/   
    private void mnu_membresiaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mnu_membresiaMouseClicked
        Form_membresia frm_membresia = new Form_membresia();
       frm_membresia.setVisible(true);
       dispose();        // TODO add your handling code here:
    }//GEN-LAST:event_mnu_membresiaMouseClicked

    
    
    
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Home().setVisible(true);
            }
        });
    }
    
    
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_ingresar;
    private javax.swing.JButton btn_salir;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JMenuItem mnu_cliente_asistencia;
    private javax.swing.JMenuItem mnu_cliente_modificar;
    private javax.swing.JMenuItem mnu_cliente_nuevo;
    private javax.swing.JMenu mnu_clientes;
    private javax.swing.JMenu mnu_ficha;
    private javax.swing.JMenuItem mnu_ficha_detalles;
    private javax.swing.JMenuItem mnu_ficha_nueva;
    private javax.swing.JMenu mnu_membresia;
    private javax.swing.JMenu mnu_pagos;
    private javax.swing.JMenuItem mnu_salir;
    private javax.swing.JMenu mnu_usuarios;
    private javax.swing.JMenuItem mnu_usuarios_detalles;
    private javax.swing.JMenuItem mnu_usuarios_nuevo;
    private javax.swing.JPasswordField txt_password;
    private javax.swing.JTextField txt_usuario;
    // End of variables declaration//GEN-END:variables
}
