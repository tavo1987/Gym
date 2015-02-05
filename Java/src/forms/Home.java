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

        jMenuItem3 = new javax.swing.JMenuItem();
        jLabel18 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        txt_usuario = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        txt_password = new javax.swing.JTextField();
        btn_ingresar = new javax.swing.JButton();
        btn_salir = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        mnu_salir = new javax.swing.JMenuItem();
        mnu_clientes = new javax.swing.JMenu();
        mnu_cliente_nuevo = new javax.swing.JMenuItem();
        mnu_cliente_asistencia = new javax.swing.JMenuItem();
        mnu_cliente_detalles = new javax.swing.JMenuItem();
        mnu_pagos = new javax.swing.JMenu();
        mnu_pago_nuevo = new javax.swing.JMenuItem();
        mnu_pagos_detalles = new javax.swing.JMenuItem();
        mnu_membresia = new javax.swing.JMenu();
        mnu_membresia_nuevo = new javax.swing.JMenuItem();
        mnu_membresia_detalles = new javax.swing.JMenuItem();
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

        jLabel18.setFont(new java.awt.Font("Verdana", 0, 24)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(110, 110, 110));
        jLabel18.setText("BIENVENIDO");

        jLabel10.setFont(new java.awt.Font("Verdana", 0, 16)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(110, 110, 110));
        jLabel10.setText("Usuario:");

        txt_usuario.setFont(new java.awt.Font("Verdana", 0, 16)); // NOI18N
        txt_usuario.setForeground(new java.awt.Color(110, 110, 110));
        txt_usuario.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(202, 202, 202), 1, true));

        jLabel11.setFont(new java.awt.Font("Verdana", 0, 16)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(110, 110, 110));
        jLabel11.setText("contraseña:");

        txt_password.setFont(new java.awt.Font("Verdana", 0, 16)); // NOI18N
        txt_password.setForeground(new java.awt.Color(110, 110, 110));
        txt_password.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(202, 202, 202), 1, true));

        btn_ingresar.setBackground(new java.awt.Color(0, 153, 204));
        btn_ingresar.setFont(new java.awt.Font("Verdana", 0, 16)); // NOI18N
        btn_ingresar.setForeground(new java.awt.Color(255, 255, 255));
        btn_ingresar.setText("INGRESAR");
        btn_ingresar.setBorder(null);
        btn_ingresar.setBorderPainted(false);
        btn_ingresar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

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

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/ic_person_24.png"))); // NOI18N

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/ic_lock_24.png"))); // NOI18N

        jMenuBar1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

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

        mnu_cliente_detalles.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        mnu_cliente_detalles.setForeground(new java.awt.Color(110, 110, 110));
        mnu_cliente_detalles.setText("Detalles");
        mnu_cliente_detalles.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        mnu_clientes.add(mnu_cliente_detalles);

        jMenuBar1.add(mnu_clientes);

        mnu_pagos.setForeground(new java.awt.Color(110, 110, 110));
        mnu_pagos.setText("Pagos");
        mnu_pagos.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        mnu_pagos.setFont(new java.awt.Font("Verdana", 0, 16)); // NOI18N

        mnu_pago_nuevo.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        mnu_pago_nuevo.setForeground(new java.awt.Color(110, 110, 110));
        mnu_pago_nuevo.setText("Nuevo");
        mnu_pago_nuevo.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        mnu_pagos.add(mnu_pago_nuevo);

        mnu_pagos_detalles.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        mnu_pagos_detalles.setForeground(new java.awt.Color(110, 110, 110));
        mnu_pagos_detalles.setText("Detalles");
        mnu_pagos_detalles.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        mnu_pagos.add(mnu_pagos_detalles);

        jMenuBar1.add(mnu_pagos);

        mnu_membresia.setForeground(new java.awt.Color(110, 110, 110));
        mnu_membresia.setText("Membresia");
        mnu_membresia.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        mnu_membresia.setFont(new java.awt.Font("Verdana", 0, 16)); // NOI18N

        mnu_membresia_nuevo.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        mnu_membresia_nuevo.setForeground(new java.awt.Color(110, 110, 110));
        mnu_membresia_nuevo.setText("Nuevo");
        mnu_membresia_nuevo.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        mnu_membresia.add(mnu_membresia_nuevo);

        mnu_membresia_detalles.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        mnu_membresia_detalles.setForeground(new java.awt.Color(110, 110, 110));
        mnu_membresia_detalles.setText("Detalles");
        mnu_membresia_detalles.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        mnu_membresia.add(mnu_membresia_detalles);

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

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(187, 187, 187)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel11)
                            .addComponent(jLabel10))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txt_password, javax.swing.GroupLayout.DEFAULT_SIZE, 340, Short.MAX_VALUE)
                            .addComponent(txt_usuario)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(80, 80, 80)
                        .addComponent(btn_ingresar, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(29, 29, 29)
                        .addComponent(btn_salir, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(10, 10, 10)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(jLabel1))
                .addContainerGap(124, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel18)
                .addGap(315, 315, 315))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addComponent(jLabel18)
                .addGap(47, 47, 47)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel10)
                            .addComponent(txt_usuario, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(19, 19, 19)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel11)
                            .addComponent(txt_password, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(69, 69, 69)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btn_ingresar, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn_salir, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(266, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    
    
    
/*---------------------------------------------------------
 $Menu codigo para el boton salir del menu
 ----------------------------------------------------------*/
    private void mnu_salirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnu_salirActionPerformed

        System.exit(0);
        
    }//GEN-LAST:event_mnu_salirActionPerformed

    
    
    
/*---------------------------------------------------------
 $Menu cliente nuevo llamandio al formulario
 ----------------------------------------------------------*/
    private void mnu_cliente_asistenciaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnu_cliente_asistenciaActionPerformed
       Form_Asistencia frm_asistencia = new Form_Asistencia ();
       frm_asistencia.setVisible(true);
       dispose();
    }//GEN-LAST:event_mnu_cliente_asistenciaActionPerformed

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
    private javax.swing.JMenuItem mnu_cliente_asistencia;
    private javax.swing.JMenuItem mnu_cliente_detalles;
    private javax.swing.JMenuItem mnu_cliente_nuevo;
    private javax.swing.JMenu mnu_clientes;
    private javax.swing.JMenu mnu_ficha;
    private javax.swing.JMenuItem mnu_ficha_detalles;
    private javax.swing.JMenuItem mnu_ficha_nueva;
    private javax.swing.JMenu mnu_membresia;
    private javax.swing.JMenuItem mnu_membresia_detalles;
    private javax.swing.JMenuItem mnu_membresia_nuevo;
    private javax.swing.JMenuItem mnu_pago_nuevo;
    private javax.swing.JMenu mnu_pagos;
    private javax.swing.JMenuItem mnu_pagos_detalles;
    private javax.swing.JMenuItem mnu_salir;
    private javax.swing.JMenu mnu_usuarios;
    private javax.swing.JMenuItem mnu_usuarios_detalles;
    private javax.swing.JMenuItem mnu_usuarios_nuevo;
    private javax.swing.JTextField txt_password;
    private javax.swing.JTextField txt_usuario;
    // End of variables declaration//GEN-END:variables
}
