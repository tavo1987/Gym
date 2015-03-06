package forms;

import Mysql.Conexion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import validaciones.Validar;
import general.User;



public class Login extends javax.swing.JFrame {
    
  /*/instanceamos una clase tipo user como estatica y para poder leer desde otro form su oontenido*/
    static User usuario = new User();

 
    public Login() {
        initComponents();
         setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        txt_usuario = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        lbl_iconkey = new javax.swing.JLabel();
        txt_password = new javax.swing.JPasswordField();
        btn_salir = new javax.swing.JButton();
        btn_ingresar = new javax.swing.JButton();
        lbl_pass = new javax.swing.JLabel();
        lbl_user = new javax.swing.JLabel();
        lbl_bienvenido = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(250, 250, 250));
        setPreferredSize(new java.awt.Dimension(600, 400));
        getContentPane().setLayout(new java.awt.GridBagLayout());

        txt_usuario.setFont(new java.awt.Font("Verdana", 0, 16)); // NOI18N
        txt_usuario.setForeground(new java.awt.Color(110, 110, 110));
        txt_usuario.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(202, 202, 202), 1, true));
        txt_usuario.setDisabledTextColor(new java.awt.Color(0, 153, 255));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.gridwidth = 9;
        gridBagConstraints.gridheight = 2;
        gridBagConstraints.ipadx = 218;
        gridBagConstraints.ipady = 16;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(40, 13, 0, 0);
        getContentPane().add(txt_usuario, gridBagConstraints);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/ic_person_24.png"))); // NOI18N
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 12;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.gridheight = 3;
        gridBagConstraints.ipady = 16;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(40, 0, 0, 98);
        getContentPane().add(jLabel1, gridBagConstraints);

        lbl_iconkey.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/ic_lock_24.png"))); // NOI18N
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 12;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.gridheight = 2;
        gridBagConstraints.ipady = 15;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(20, 0, 0, 98);
        getContentPane().add(lbl_iconkey, gridBagConstraints);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.gridwidth = 9;
        gridBagConstraints.gridheight = 2;
        gridBagConstraints.ipadx = 216;
        gridBagConstraints.ipady = 20;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(20, 13, 0, 0);
        getContentPane().add(txt_password, gridBagConstraints);

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
        gridBagConstraints.gridy = 6;
        gridBagConstraints.gridwidth = 5;
        gridBagConstraints.ipadx = 52;
        gridBagConstraints.ipady = 29;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(51, 30, 55, 0);
        getContentPane().add(btn_salir, gridBagConstraints);

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
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 6;
        gridBagConstraints.gridwidth = 3;
        gridBagConstraints.ipadx = 16;
        gridBagConstraints.ipady = 29;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(51, 21, 55, 0);
        getContentPane().add(btn_ingresar, gridBagConstraints);

        lbl_pass.setFont(new java.awt.Font("Verdana", 0, 16)); // NOI18N
        lbl_pass.setForeground(new java.awt.Color(110, 110, 110));
        lbl_pass.setText("contraseña:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(30, 40, 0, 0);
        getContentPane().add(lbl_pass, gridBagConstraints);

        lbl_user.setFont(new java.awt.Font("Verdana", 0, 16)); // NOI18N
        lbl_user.setForeground(new java.awt.Color(110, 110, 110));
        lbl_user.setText("Usuario:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(50, 40, 0, 0);
        getContentPane().add(lbl_user, gridBagConstraints);

        lbl_bienvenido.setFont(new java.awt.Font("Verdana", 0, 24)); // NOI18N
        lbl_bienvenido.setForeground(new java.awt.Color(110, 110, 110));
        lbl_bienvenido.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_bienvenido.setText("ENTRAR");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridwidth = 4;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(40, 53, 0, 0);
        getContentPane().add(lbl_bienvenido, gridBagConstraints);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_salirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_salirActionPerformed
        int confirm;

        confirm = JOptionPane.showConfirmDialog(rootPane, "Esta seguro que desea salir del programa");

        if(confirm == JOptionPane.YES_OPTION){
            System.exit(0);
        }

    }//GEN-LAST:event_btn_salirActionPerformed

    private void btn_ingresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_ingresarActionPerformed

        Conexion cn = new Conexion();
        Connection conexion = cn.getConexion();
        PreparedStatement ps;
        ResultSet rs;
        String sql,user,pass,result_tipo;
        
        
       

        user = Validar.quitarEspaciosEnBlanco(txt_usuario);
        pass = Validar.quitarEspaciosEnBlanco(txt_password);
        sql = "select * from users where usuario = '"+user+"' and  password = '"+pass+"'";

        if(user.length() > 0 && pass.length() > 0){
            try{

                ps = conexion.prepareStatement(sql);
                rs = ps.executeQuery(sql);

                if(rs.next()){
                    result_tipo = rs.getString("tipo");
                    usuario.setTipo(result_tipo); //primero guardamos el usuario 
                     Home frm_home = new Home();//luego llamamos el metodo de home
                    
                    if(result_tipo.equalsIgnoreCase("administrador")){
                        JOptionPane.showMessageDialog(this, "Login correcto");
                         
                        frm_home.lbl_result_tipo.setText(result_tipo);
                        frm_home.lbl_result_user.setText(user);
                        
                       
                        setVisible(false);
                        frm_home.setVisible(true);
                        
                                                

                    }else{
                        JOptionPane.showMessageDialog(this, "Login correcto");
                         
                        frm_home.lbl_result_tipo.setText(result_tipo);
                        frm_home.lbl_result_user.setText(user); 
                        
                       
                        setVisible(false);
                        frm_home.setVisible(true);
                         
                         
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
        /* Set the Nimbus look and feel */
        

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_ingresar;
    private javax.swing.JButton btn_salir;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel lbl_bienvenido;
    private javax.swing.JLabel lbl_iconkey;
    private javax.swing.JLabel lbl_pass;
    private javax.swing.JLabel lbl_user;
    private javax.swing.JPasswordField txt_password;
    private javax.swing.JTextField txt_usuario;
    // End of variables declaration//GEN-END:variables
}
