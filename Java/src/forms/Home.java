package forms;
import javax.swing.*;
import Mysql.*;//clase que me hace la conexion
import validaciones.*;//clase paera validar
import java.util.*;
import java.sql.*;
import java.util.logging.*;


public class Home extends JFrame {

    public Home() {
        initComponents();
        setLocationRelativeTo(null);
        setTitle("Bienvenido");
        bloquearMenu(false,false);
        
        //para limitar ingreso de caracteres en la cajas      
       this.txt_usuario.setDocument(new Validar(txt_usuario,20));
       this.txt_password.setDocument(new Validar(txt_password,30));
         }

/*---------------------------------------------------------
    $Home codigo de la interfaz generado por netbeans 
 ----------------------------------------------------------*/
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuItem3 = new javax.swing.JMenuItem();
        lbl_bienvenido = new javax.swing.JLabel();
        lbl_user = new javax.swing.JLabel();
        txt_usuario = new javax.swing.JTextField();
        lbl_pass = new javax.swing.JLabel();
        btn_ingresar = new javax.swing.JButton();
        btn_salir = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        lbl_iconkey = new javax.swing.JLabel();
        txt_password = new javax.swing.JPasswordField();
        jSeparator2 = new javax.swing.JSeparator();
        jMenuBar1 = new javax.swing.JMenuBar();
        mnu_archivo = new javax.swing.JMenu();
        mnu_salir = new javax.swing.JMenuItem();
        mnu_clientes = new javax.swing.JMenu();
        mnu_cliente_nuevo = new javax.swing.JMenuItem();
        mnu_cliente_asistencia = new javax.swing.JMenuItem();
        mnu_cliente_modificar = new javax.swing.JMenuItem();
        mnu_pagos = new javax.swing.JMenu();
        mnu_membresia = new javax.swing.JMenu();
        mnu_ficha = new javax.swing.JMenu();
        mnu_usuarios = new javax.swing.JMenu();

        jMenuItem3.setText("jMenuItem3");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Bienvenidos");
        setBounds(new java.awt.Rectangle(0, 0, 600, 0));
        setFont(new java.awt.Font("Verdana", 0, 16)); // NOI18N
        setMinimumSize(new java.awt.Dimension(826, 603));
        setPreferredSize(new java.awt.Dimension(826, 603));

        lbl_bienvenido.setFont(new java.awt.Font("Verdana", 0, 24)); // NOI18N
        lbl_bienvenido.setForeground(new java.awt.Color(110, 110, 110));
        lbl_bienvenido.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_bienvenido.setText("ENTRAR");

        lbl_user.setFont(new java.awt.Font("Verdana", 0, 16)); // NOI18N
        lbl_user.setForeground(new java.awt.Color(110, 110, 110));
        lbl_user.setText("Usuario:");

        txt_usuario.setFont(new java.awt.Font("Verdana", 0, 16)); // NOI18N
        txt_usuario.setForeground(new java.awt.Color(110, 110, 110));
        txt_usuario.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(202, 202, 202), 1, true));
        txt_usuario.setDisabledTextColor(new java.awt.Color(0, 153, 255));

        lbl_pass.setFont(new java.awt.Font("Verdana", 0, 16)); // NOI18N
        lbl_pass.setForeground(new java.awt.Color(110, 110, 110));
        lbl_pass.setText("contraseña:");

        btn_ingresar.setBackground(new java.awt.Color(0, 153, 204));
        btn_ingresar.setFont(new java.awt.Font("Verdana", 0, 16)); // NOI18N
        btn_ingresar.setForeground(new java.awt.Color(255, 255, 255));
        btn_ingresar.setText("INGRESAR");
        btn_ingresar.setBorder(null);
        btn_ingresar.setBorderPainted(false);
        btn_ingresar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_ingresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_ingresarActionPerformed(evt);
            }
        });

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

        lbl_iconkey.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/ic_lock_24.png"))); // NOI18N

        jSeparator2.setBackground(new java.awt.Color(51, 204, 255));

        jMenuBar1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jMenuBar1.setMinimumSize(new java.awt.Dimension(800, 600));

        mnu_archivo.setForeground(new java.awt.Color(110, 110, 110));
        mnu_archivo.setText("Archivo");
        mnu_archivo.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        mnu_archivo.setFont(new java.awt.Font("Verdana", 0, 16)); // NOI18N

        mnu_salir.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        mnu_salir.setForeground(new java.awt.Color(110, 110, 110));
        mnu_salir.setText("Salir");
        mnu_salir.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        mnu_salir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnu_salirActionPerformed(evt);
            }
        });
        mnu_archivo.add(mnu_salir);

        jMenuBar1.add(mnu_archivo);

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
        mnu_ficha.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                mnu_fichaMouseClicked(evt);
            }
        });
        jMenuBar1.add(mnu_ficha);

        mnu_usuarios.setBackground(new java.awt.Color(252, 252, 252));
        mnu_usuarios.setForeground(new java.awt.Color(110, 110, 110));
        mnu_usuarios.setText("Usuarios");
        mnu_usuarios.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        mnu_usuarios.setFont(new java.awt.Font("Verdana", 0, 16)); // NOI18N
        mnu_usuarios.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                mnu_usuariosMouseClicked(evt);
            }
        });
        jMenuBar1.add(mnu_usuarios);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(110, 110, 110)
                        .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 590, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(139, 139, 139)
                        .addComponent(lbl_user)
                        .addGap(38, 38, 38)
                        .addComponent(txt_usuario, javax.swing.GroupLayout.PREFERRED_SIZE, 457, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(4, 4, 4)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(139, 139, 139)
                        .addComponent(lbl_pass)
                        .addGap(10, 10, 10)
                        .addComponent(txt_password, javax.swing.GroupLayout.PREFERRED_SIZE, 457, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(4, 4, 4)
                        .addComponent(lbl_iconkey))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(212, 212, 212)
                        .addComponent(btn_ingresar, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(43, 43, 43)
                        .addComponent(btn_salir, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(lbl_bienvenido)
                        .addGap(263, 263, 263)))
                .addGap(95, 95, 95))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addComponent(lbl_bienvenido)
                .addGap(29, 29, 29)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(8, 8, 8)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbl_user)
                    .addComponent(txt_usuario, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(11, 11, 11)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(lbl_pass))
                    .addComponent(txt_password, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbl_iconkey, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(77, 77, 77)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btn_ingresar, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_salir, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    
    
    
    
/*---------------------------------------------------------
    Metodo para bloquar opciones del menu
 ----------------------------------------------------------*/
 public void bloquearMenu(boolean opcion, boolean admin){
     
     this.mnu_archivo.setVisible(opcion);
     this.mnu_clientes.setVisible(opcion);
     this.mnu_pagos.setVisible(opcion);
     this.mnu_membresia.setVisible(opcion);
     this.mnu_ficha.setVisible(opcion);
     this.mnu_usuarios.setVisible(admin);
     
     
 }
 
 
 
 
 /*---------------------------------------------------------
    Metodo para bloquar el login
 ----------------------------------------------------------*/
 public void bloquearLogin(boolean opcion){
     
     this.txt_usuario.setEnabled(opcion);
     this.txt_password.setVisible(opcion);
     this.btn_ingresar.setVisible(opcion);
     this.lbl_pass.setVisible(opcion);
     this.lbl_iconkey.setVisible(opcion);
     
         
     
 } 
 
    
 
 
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

    
    
    
 /*-------------------------------------------------------------------------
    $metodo para llamar el formulario de Ficha de cliente o e seguimiento
 ---------------------------------------------------------------------------*/   
    private void mnu_fichaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mnu_fichaMouseClicked
        Form_ficha frm_ficha = new Form_ficha();
        frm_ficha.setVisible(true);
        dispose();
    }//GEN-LAST:event_mnu_fichaMouseClicked

    private void mnu_usuariosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mnu_usuariosMouseClicked
        Form_users frm_users = new Form_users();
        frm_users.setVisible(true);
        dispose();
       
    }//GEN-LAST:event_mnu_usuariosMouseClicked

    
    
    
 /*-------------------------------------------------------------------------
    $metodo para el boton login o ingresar al sistema
 ---------------------------------------------------------------------------*/   
    private void btn_ingresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_ingresarActionPerformed
         
        Conexion cn = new Conexion();
        Connection conexion = cn.getConexion();
        PreparedStatement ps;
        ResultSet rs;
        String sql,user,pass,result_user,result_tipo;
        
        user = Validar.quitarEspaciosEnBlanco(txt_usuario);
        pass = Validar.quitarEspaciosEnBlanco(txt_password);
        sql = "select * from users where usuario = '"+user+"' and  password = '"+pass+"'";
        
        if(user.length() > 0 && pass.length() > 0){
            try{
                
                ps = conexion.prepareStatement(sql);
                rs = ps.executeQuery(sql);
                
                if(rs.next()){
                    result_tipo = rs.getString("tipo");
                    
                    if(result_tipo.equalsIgnoreCase("administrador")){
                        JOptionPane.showMessageDialog(this, "Login correcto");
                        lbl_bienvenido.setText("BIENVENIDO " + user.toUpperCase());
                        bloquearMenu(true,true);
                        bloquearLogin(false);
                        txt_usuario.setText("               " + user.toUpperCase());
                        
                        
                    }else{
                        JOptionPane.showMessageDialog(this, "Login correcto");
                         lbl_bienvenido.setText("BIENVENIDO " + user.toUpperCase());
                         bloquearMenu(true,false);
                         bloquearLogin(false);
                        txt_usuario.setText("              "+ user.toUpperCase());
                    }
                }else{
                    JOptionPane.showMessageDialog(this, "Usuario o contraseña no existen");
                    txt_usuario.setText("");
                    txt_password.setText("");
                    txt_usuario.requestFocus();
                }
                
            }catch(Exception ex){
                JOptionPane.showMessageDialog(this, ex.getMessage());
            }
            
        
        }else{
            JOptionPane.showMessageDialog(null,"No puedes dejar las cajas vacias. Ingresa tus datos");
            txt_usuario.setText("");
            txt_password.setText("");
            txt_usuario.requestFocus();
        }
        
        
    }//GEN-LAST:event_btn_ingresarActionPerformed

    
    
    
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
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JLabel lbl_bienvenido;
    private javax.swing.JLabel lbl_iconkey;
    private javax.swing.JLabel lbl_pass;
    private javax.swing.JLabel lbl_user;
    private javax.swing.JMenu mnu_archivo;
    private javax.swing.JMenuItem mnu_cliente_asistencia;
    private javax.swing.JMenuItem mnu_cliente_modificar;
    private javax.swing.JMenuItem mnu_cliente_nuevo;
    private javax.swing.JMenu mnu_clientes;
    private javax.swing.JMenu mnu_ficha;
    private javax.swing.JMenu mnu_membresia;
    private javax.swing.JMenu mnu_pagos;
    private javax.swing.JMenuItem mnu_salir;
    private javax.swing.JMenu mnu_usuarios;
    private javax.swing.JPasswordField txt_password;
    private javax.swing.JTextField txt_usuario;
    // End of variables declaration//GEN-END:variables
}
