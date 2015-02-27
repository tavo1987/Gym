package forms;

import javax.swing.*;
import Mysql.*;
import validaciones.Validar;
import java.sql.*;
import general.Asistencias;
import general.Cliente;
import general.Fechas;
import javax.swing.table.DefaultTableModel;


public class Form_modificar_clientes extends javax.swing.JFrame {

     //Hacemos las conexion 
    public Conexion cn = new Conexion();//instanciamos nuestra clase conexion
    public Connection conexion = cn.getConexion();
    private  ResultSet rs;
    private PreparedStatement ps;
    private String sql;

    
    
    
    
 /*_____________________________________________________________________________
     
    $Metodo contructor del la clase
 __________________________________________________________________________*/
    public Form_modificar_clientes() {
        initComponents();
        setLocationRelativeTo(null);
        
         //para limitar ingreso de caracteres en la cajas      
         txt_cedula.setDocument(new Validar(txt_cedula,10));
         
        txt_result_cedula.setDocument(new Validar(txt_result_cedula,10));
        txt_nombres.setDocument(new Validar(txt_nombres,30));
        txt_apellidos.setDocument(new Validar(txt_apellidos,30));
        txt_dir.setDocument(new Validar(txt_dir,100));
        txt_fecha_nacimiento.setDocument(new Validar(txt_fecha_nacimiento,10));
        txt_sexo.setDocument(new Validar(txt_sexo,9));
        txt_telefono.setDocument(new Validar(txt_telefono,10));
        txt_celular.setDocument(new Validar(txt_celular,10));
         
         //para poner los campos de tesxto editables
         bloquearCampos(false);
        
        
        
    }
    
    
    
    
    
    
/*_____________________________________________________________________________
     
    $Metodo para poder bloquear los campos editar los campos de texto 
 __________________________________________________________________________*/
 public void bloquearCampos(boolean a){
     
     
    txt_result_cedula.setEditable(a);
    txt_nombres.setEditable(a);
    txt_apellidos.setEditable(a);
    txt_dir.setEditable(a);
    txt_fecha_nacimiento.setEditable(a);    
    txt_sexo.setEditable(a);
    txt_telefono.setEditable(a);
    txt_celular.setEditable(a);
   
 }
    
    
    

 
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane1 = new javax.swing.JTabbedPane();
        jScrollPane1 = new javax.swing.JScrollPane();
        jPanel1 = new javax.swing.JPanel();
        jLabel20 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        txt_cedula = new javax.swing.JTextField();
        btn_buscar = new javax.swing.JButton();
        jLabel16 = new javax.swing.JLabel();
        txt_result_cedula = new javax.swing.JTextField();
        btn_editar = new javax.swing.JButton();
        btn_eliminar = new javax.swing.JButton();
        jLabel17 = new javax.swing.JLabel();
        txt_nombres = new javax.swing.JTextField();
        jLabel18 = new javax.swing.JLabel();
        txt_apellidos = new javax.swing.JTextField();
        jLabel21 = new javax.swing.JLabel();
        txt_fecha_nacimiento = new javax.swing.JTextField();
        jLabel22 = new javax.swing.JLabel();
        txt_sexo = new javax.swing.JTextField();
        jLabel23 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        txt_telefono = new javax.swing.JTextField();
        jLabel25 = new javax.swing.JLabel();
        txt_celular = new javax.swing.JTextField();
        jLabel26 = new javax.swing.JLabel();
        btn_actualizar = new javax.swing.JButton();
        jLabel19 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        btn_cancelar1 = new javax.swing.JButton();
        txt_dir = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jTabbedPane1.setBackground(new java.awt.Color(110, 110, 110));
        jTabbedPane1.setForeground(new java.awt.Color(110, 110, 110));
        jTabbedPane1.setFont(new java.awt.Font("Verdana", 0, 16)); // NOI18N

        jPanel1.setBackground(new java.awt.Color(250, 250, 250));
        jPanel1.setForeground(new java.awt.Color(110, 110, 110));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel20.setFont(new java.awt.Font("Verdana", 0, 24)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(110, 110, 110));
        jLabel20.setText("Resultados de búsqueda");
        jPanel1.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 200, 310, -1));

        jLabel13.setFont(new java.awt.Font("Verdana", 0, 16)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(110, 110, 110));
        jLabel13.setText("Cédula:");
        jPanel1.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 130, -1, -1));

        txt_cedula.setFont(new java.awt.Font("Verdana", 0, 16)); // NOI18N
        txt_cedula.setForeground(new java.awt.Color(110, 110, 110));
        txt_cedula.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(202, 202, 202), 1, true));
        txt_cedula.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_cedulaKeyTyped(evt);
            }
        });
        jPanel1.add(txt_cedula, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 120, 242, 39));

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
        jPanel1.add(btn_buscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 120, 100, 40));

        jLabel16.setFont(new java.awt.Font("Verdana", 0, 16)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(110, 110, 110));
        jLabel16.setText("Acciones:");
        jPanel1.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 270, 100, -1));

        txt_result_cedula.setBackground(new java.awt.Color(197, 230, 197));
        txt_result_cedula.setFont(new java.awt.Font("Verdana", 0, 16)); // NOI18N
        txt_result_cedula.setForeground(new java.awt.Color(110, 110, 110));
        txt_result_cedula.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(162, 214, 162), 1, true));
        txt_result_cedula.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_result_cedulaKeyTyped(evt);
            }
        });
        jPanel1.add(txt_result_cedula, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 361, 431, 39));

        btn_editar.setBackground(new java.awt.Color(0, 153, 204));
        btn_editar.setFont(new java.awt.Font("Verdana", 0, 16)); // NOI18N
        btn_editar.setForeground(new java.awt.Color(255, 255, 255));
        btn_editar.setText("Editar");
        btn_editar.setBorder(null);
        btn_editar.setBorderPainted(false);
        btn_editar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_editar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_editar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_editarActionPerformed(evt);
            }
        });
        jPanel1.add(btn_editar, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 260, 100, 40));

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
        jPanel1.add(btn_eliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 260, 100, 40));

        jLabel17.setFont(new java.awt.Font("Verdana", 0, 16)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(110, 110, 110));
        jLabel17.setText("Nombres:");
        jPanel1.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 431, -1, -1));

        txt_nombres.setBackground(new java.awt.Color(197, 230, 197));
        txt_nombres.setFont(new java.awt.Font("Verdana", 0, 16)); // NOI18N
        txt_nombres.setForeground(new java.awt.Color(110, 110, 110));
        txt_nombres.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(162, 214, 162), 1, true));
        txt_nombres.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_nombresKeyTyped(evt);
            }
        });
        jPanel1.add(txt_nombres, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 421, 431, 39));

        jLabel18.setFont(new java.awt.Font("Verdana", 0, 16)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(110, 110, 110));
        jLabel18.setText("Apellidos:");
        jPanel1.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 491, -1, -1));

        txt_apellidos.setBackground(new java.awt.Color(197, 230, 197));
        txt_apellidos.setFont(new java.awt.Font("Verdana", 0, 16)); // NOI18N
        txt_apellidos.setForeground(new java.awt.Color(110, 110, 110));
        txt_apellidos.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(162, 214, 162), 1, true));
        txt_apellidos.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_apellidosKeyTyped(evt);
            }
        });
        jPanel1.add(txt_apellidos, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 481, 431, 39));

        jLabel21.setFont(new java.awt.Font("Verdana", 0, 16)); // NOI18N
        jLabel21.setForeground(new java.awt.Color(110, 110, 110));
        jLabel21.setText("Dirección:");
        jPanel1.add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 561, -1, -1));

        txt_fecha_nacimiento.setBackground(new java.awt.Color(197, 230, 197));
        txt_fecha_nacimiento.setFont(new java.awt.Font("Verdana", 0, 16)); // NOI18N
        txt_fecha_nacimiento.setForeground(new java.awt.Color(110, 110, 110));
        txt_fecha_nacimiento.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(162, 214, 162), 1, true));
        txt_fecha_nacimiento.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_fecha_nacimientoKeyTyped(evt);
            }
        });
        jPanel1.add(txt_fecha_nacimiento, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 600, 431, 39));

        jLabel22.setFont(new java.awt.Font("Verdana", 0, 16)); // NOI18N
        jLabel22.setForeground(new java.awt.Color(110, 110, 110));
        jLabel22.setText("Fecha Nacimiento:");
        jPanel1.add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 621, -1, -1));

        txt_sexo.setBackground(new java.awt.Color(197, 230, 197));
        txt_sexo.setFont(new java.awt.Font("Verdana", 0, 16)); // NOI18N
        txt_sexo.setForeground(new java.awt.Color(110, 110, 110));
        txt_sexo.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(162, 214, 162), 1, true));
        jPanel1.add(txt_sexo, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 661, 431, 39));

        jLabel23.setFont(new java.awt.Font("Verdana", 0, 16)); // NOI18N
        jLabel23.setForeground(new java.awt.Color(110, 110, 110));
        jLabel23.setText("Sexo:");
        jPanel1.add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 681, -1, -1));

        jLabel24.setFont(new java.awt.Font("Verdana", 0, 16)); // NOI18N
        jLabel24.setForeground(new java.awt.Color(110, 110, 110));
        jLabel24.setText("Teléfono:");
        jPanel1.add(jLabel24, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 741, -1, -1));

        txt_telefono.setBackground(new java.awt.Color(197, 230, 197));
        txt_telefono.setFont(new java.awt.Font("Verdana", 0, 16)); // NOI18N
        txt_telefono.setForeground(new java.awt.Color(110, 110, 110));
        txt_telefono.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(162, 214, 162), 1, true));
        jPanel1.add(txt_telefono, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 721, 431, 39));

        jLabel25.setFont(new java.awt.Font("Verdana", 0, 16)); // NOI18N
        jLabel25.setForeground(new java.awt.Color(110, 110, 110));
        jLabel25.setText("Celular:");
        jPanel1.add(jLabel25, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 801, -1, -1));

        txt_celular.setBackground(new java.awt.Color(197, 230, 197));
        txt_celular.setFont(new java.awt.Font("Verdana", 0, 16)); // NOI18N
        txt_celular.setForeground(new java.awt.Color(110, 110, 110));
        txt_celular.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(162, 214, 162), 1, true));
        jPanel1.add(txt_celular, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 781, 431, 39));

        jLabel26.setFont(new java.awt.Font("Verdana", 0, 24)); // NOI18N
        jLabel26.setForeground(new java.awt.Color(110, 110, 110));
        jLabel26.setText("Buscar  clientes");
        jPanel1.add(jLabel26, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 60, 197, -1));

        btn_actualizar.setBackground(new java.awt.Color(0, 153, 204));
        btn_actualizar.setFont(new java.awt.Font("Verdana", 0, 16)); // NOI18N
        btn_actualizar.setForeground(new java.awt.Color(255, 255, 255));
        btn_actualizar.setText("Actualizar");
        btn_actualizar.setBorder(null);
        btn_actualizar.setBorderPainted(false);
        btn_actualizar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_actualizar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jPanel1.add(btn_actualizar, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 260, 100, 40));

        jLabel19.setFont(new java.awt.Font("Verdana", 0, 16)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(110, 110, 110));
        jLabel19.setText("Cédula:");
        jPanel1.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 371, -1, -1));

        jSeparator1.setBackground(new java.awt.Color(51, 204, 255));
        jPanel1.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 320, 589, 11));

        btn_cancelar1.setBackground(new java.awt.Color(250, 250, 250));
        btn_cancelar1.setFont(new java.awt.Font("Verdana", 0, 16)); // NOI18N
        btn_cancelar1.setForeground(new java.awt.Color(110, 110, 110));
        btn_cancelar1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/ic_home_64.png"))); // NOI18N
        btn_cancelar1.setText("Volver");
        btn_cancelar1.setAutoscrolls(true);
        btn_cancelar1.setBorder(null);
        btn_cancelar1.setBorderPainted(false);
        btn_cancelar1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_cancelar1.setFocusPainted(false);
        btn_cancelar1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_cancelar1.setIconTextGap(-8);
        btn_cancelar1.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        btn_cancelar1.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btn_cancelar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_cancelar1ActionPerformed(evt);
            }
        });
        jPanel1.add(btn_cancelar1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 30, -1, -1));

        txt_dir.setBackground(new java.awt.Color(197, 230, 197));
        txt_dir.setFont(new java.awt.Font("Verdana", 0, 16)); // NOI18N
        txt_dir.setForeground(new java.awt.Color(110, 110, 110));
        txt_dir.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(162, 214, 162), 1, true));
        txt_dir.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_dirKeyTyped(evt);
            }
        });
        jPanel1.add(txt_dir, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 541, 431, 39));

        jScrollPane1.setViewportView(jPanel1);
        jPanel1.getAccessibleContext().setAccessibleName("");
        jPanel1.getAccessibleContext().setAccessibleDescription("");

        jTabbedPane1.addTab("Modificar clientes", jScrollPane1);

        getContentPane().add(jTabbedPane1, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_eliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_eliminarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_eliminarActionPerformed




/*_____________________________________________________________________________
     
    $Metodo para el boton volver que regresa al home
 __________________________________________________________________________*/
    private void btn_cancelar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_cancelar1ActionPerformed
        Home frm_home = new Home();
        frm_home.setVisible(true);
        dispose();
        
        
        
        
        
        
    }//GEN-LAST:event_btn_cancelar1ActionPerformed

    
    
    
    
    /*_____________________________________________________________________________
     
    $Metodo para validar soo numetos en el campor de busqueda de cliente
 __________________________________________________________________________*/
    private void txt_cedulaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_cedulaKeyTyped

        Validar.soloNumeros(evt);
        
    }//GEN-LAST:event_txt_cedulaKeyTyped

    
    
    
    
 /*_____________________________________________________________________________
     
    $Metodo para busqueda de clientes por su numero de cedulla
 __________________________________________________________________________*/
    private void btn_buscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_buscarActionPerformed
           
        
        Cliente cliente = new Cliente();
        String cedula = txt_cedula.getText();
        
        if(Validar.VerificarCedula(cedula)){
            
            //para gurdar el vector que retorna la clase buscarCliente
            String[] registros = cliente.buscarClientes(Integer.parseInt(cedula));
            
            txt_result_cedula.setText(registros[0]); 
            txt_nombres.setText(registros[1]); 
            txt_apellidos.setText(registros[2]); 
            txt_dir.setText(registros[3]); 
            txt_fecha_nacimiento.setText(registros[4]);
            
            txt_sexo.setText(registros[5]); 
            txt_telefono.setText(registros[6]); 
            txt_celular.setText(registros[7]); 
            
            
            
        }else{
        
            JOptionPane.showMessageDialog(this, "Cédula incorrecta");
        }
        
        
        
    }//GEN-LAST:event_btn_buscarActionPerformed

    
    
    
  /*_____________________________________________________________________________
     
    $Metodo para el boton editar
 __________________________________________________________________________*/  

    private void btn_editarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_editarActionPerformed
        bloquearCampos(true);
    }//GEN-LAST:event_btn_editarActionPerformed

    private void txt_result_cedulaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_result_cedulaKeyTyped
        Validar.soloNumeros(evt);
    }//GEN-LAST:event_txt_result_cedulaKeyTyped

    private void txt_nombresKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_nombresKeyTyped
       Validar.soloLetras(evt);
    }//GEN-LAST:event_txt_nombresKeyTyped

    private void txt_apellidosKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_apellidosKeyTyped
        Validar.soloLetras(evt);
    }//GEN-LAST:event_txt_apellidosKeyTyped

    private void txt_dirKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_dirKeyTyped
       Validar.soloLetrasAcentos(evt);
    }//GEN-LAST:event_txt_dirKeyTyped

    private void txt_fecha_nacimientoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_fecha_nacimientoKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_fecha_nacimientoKeyTyped

    
    
    
    
    
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
            java.util.logging.Logger.getLogger(Form_modificar_clientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Form_modificar_clientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Form_modificar_clientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Form_modificar_clientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Form_modificar_clientes().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_actualizar;
    private javax.swing.JButton btn_buscar;
    private javax.swing.JButton btn_cancelar1;
    private javax.swing.JButton btn_editar;
    private javax.swing.JButton btn_eliminar;
    private javax.swing.JLabel jLabel13;
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
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTextField txt_apellidos;
    private javax.swing.JTextField txt_cedula;
    private javax.swing.JTextField txt_celular;
    private javax.swing.JTextField txt_dir;
    private javax.swing.JTextField txt_fecha_nacimiento;
    private javax.swing.JTextField txt_nombres;
    private javax.swing.JTextField txt_result_cedula;
    private javax.swing.JTextField txt_sexo;
    private javax.swing.JTextField txt_telefono;
    // End of variables declaration//GEN-END:variables
}
