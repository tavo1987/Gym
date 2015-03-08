package forms;
import Mysql.Conexion;
import general.Membresia;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import validaciones.Validar;

public class Form_membresia extends javax.swing.JFrame {
    
    
    
     //Hacemos las conexion 
    public Conexion cn = new Conexion();//instanciamos nuestra clase conexion
    public Connection conexion = cn.getConexion();
    private  ResultSet rs;
    private PreparedStatement ps;
    private String sql;
     Membresia  membresia = new Membresia();

  
    public Form_membresia() {
        initComponents();
        setLocationRelativeTo(null);
        cargarTabla();
        
        //para limitar en ingreso de caracteres
        txt_id.setDocument(new Validar(txt_id,5));
        txt_result_costo.setDocument(new Validar(txt_result_costo,10));
        
        //para bloquer los botones de acciones
        btn_editar.setEnabled(false);
        btn_guardar.setEnabled(false);
        
        
        //para que no se pueda editar las cajas de testo de resultados de membresia
         
        txt_result_membresia.setEditable(false);
        txt_result_costo.setEditable(false);
        
        
    }


    
    
    

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane1 = new javax.swing.JTabbedPane();
        jScrollPane2 = new javax.swing.JScrollPane();
        jPanel2 = new javax.swing.JPanel();
        btn_editar = new javax.swing.JButton();
        btn_guardar = new javax.swing.JButton();
        jLabel20 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        txt_id = new javax.swing.JTextField();
        btn_buscar = new javax.swing.JButton();
        jLabel26 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        txt_result_membresia = new javax.swing.JTextField();
        jLabel19 = new javax.swing.JLabel();
        txt_result_costo = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        jSeparator3 = new javax.swing.JSeparator();
        jSeparator4 = new javax.swing.JSeparator();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabla_membresia = new javax.swing.JTable();
        btn_volver = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jTabbedPane1.setBackground(new java.awt.Color(250, 250, 250));
        jTabbedPane1.setForeground(new java.awt.Color(110, 110, 110));
        jTabbedPane1.setFont(new java.awt.Font("Verdana", 0, 16)); // NOI18N

        jPanel2.setBackground(new java.awt.Color(250, 250, 250));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

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
        jPanel2.add(btn_editar, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 260, 100, 40));

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
        jPanel2.add(btn_guardar, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 360, 100, 40));

        jLabel20.setFont(new java.awt.Font("Verdana", 0, 24)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(110, 110, 110));
        jLabel20.setText("Resultados de búsqueda");
        jPanel2.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 200, 310, -1));

        jLabel16.setFont(new java.awt.Font("Verdana", 0, 16)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(110, 110, 110));
        jLabel16.setText("Acciones:");
        jPanel2.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 270, 90, -1));

        jLabel13.setFont(new java.awt.Font("Verdana", 0, 16)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(110, 110, 110));
        jLabel13.setText("ID:");
        jPanel2.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 130, -1, -1));

        txt_id.setFont(new java.awt.Font("Verdana", 0, 16)); // NOI18N
        txt_id.setForeground(new java.awt.Color(110, 110, 110));
        txt_id.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(202, 202, 202), 1, true));
        txt_id.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_idActionPerformed(evt);
            }
        });
        txt_id.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txt_idKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_idKeyTyped(evt);
            }
        });
        jPanel2.add(txt_id, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 120, 242, 39));

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
        jPanel2.add(btn_buscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 120, 100, 40));

        jLabel26.setFont(new java.awt.Font("Verdana", 0, 24)); // NOI18N
        jLabel26.setForeground(new java.awt.Color(110, 110, 110));
        jLabel26.setText("Buscar membresia");
        jPanel2.add(jLabel26, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 40, 260, -1));

        jSeparator1.setBackground(new java.awt.Color(51, 204, 255));
        jPanel2.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 91, 580, 10));

        txt_result_membresia.setBackground(new java.awt.Color(197, 230, 197));
        txt_result_membresia.setFont(new java.awt.Font("Verdana", 0, 16)); // NOI18N
        txt_result_membresia.setForeground(new java.awt.Color(110, 110, 110));
        txt_result_membresia.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(162, 214, 162), 1, true));
        jPanel2.add(txt_result_membresia, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 360, 140, 39));

        jLabel19.setFont(new java.awt.Font("Verdana", 0, 16)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(110, 110, 110));
        jLabel19.setText("Membresia:");
        jPanel2.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 370, -1, -1));

        txt_result_costo.setBackground(new java.awt.Color(197, 230, 197));
        txt_result_costo.setFont(new java.awt.Font("Verdana", 0, 16)); // NOI18N
        txt_result_costo.setForeground(new java.awt.Color(110, 110, 110));
        txt_result_costo.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(162, 214, 162), 1, true));
        txt_result_costo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_result_costoKeyTyped(evt);
            }
        });
        jPanel2.add(txt_result_costo, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 360, 170, 39));

        jLabel17.setFont(new java.awt.Font("Verdana", 0, 16)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(110, 110, 110));
        jLabel17.setText("Costo:");
        jPanel2.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 370, -1, -1));

        jSeparator3.setBackground(new java.awt.Color(51, 204, 255));
        jPanel2.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 320, 720, 11));

        jSeparator4.setBackground(new java.awt.Color(51, 204, 255));
        jPanel2.add(jSeparator4, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 320, 589, 11));

        tabla_membresia.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(tabla_membresia);

        jPanel2.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 450, 670, 200));

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
        jPanel2.add(btn_volver, new org.netbeans.lib.awtextra.AbsoluteConstraints(21, 30, 70, 90));

        jScrollPane2.setViewportView(jPanel2);

        jTabbedPane1.addTab("Detalles de membresia", jScrollPane2);

        getContentPane().add(jTabbedPane1, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    
    
    
    
 /*-----------------------------------------------------------------------------------------
        Para buscar el la mebresia
 ------------------------------------------------------------------------------------------*/
    
    private void btn_buscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_buscarActionPerformed
        
        if(txt_id.getText().length()>0){
            
            int id = Integer.parseInt(txt_id.getText());
            
           
            String[] registros = membresia.buscarMembresia(id);
            
            txt_result_membresia.setText(registros[0]);
            txt_result_costo.setText(registros[1]);
            
            btn_editar.setEnabled(true);
            
        
        }else{
            JOptionPane.showMessageDialog(rootPane,"Ingrese el id de la membresia que desea modificar");
            txt_id.requestFocus();
        }
    }//GEN-LAST:event_btn_buscarActionPerformed

    
    
    
    
    
    private void txt_idKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_idKeyTyped
            Validar.soloNumeros(evt);
    }//GEN-LAST:event_txt_idKeyTyped

    private void btn_editarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_editarActionPerformed
       JOptionPane.showMessageDialog(rootPane, "Ingresa nuevo precio");
       btn_guardar.setEnabled(true);
       txt_result_costo.setEditable(true);
       txt_result_costo.requestFocus();
    }//GEN-LAST:event_btn_editarActionPerformed

    private void btn_guardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_guardarActionPerformed
        
            if(txt_result_costo.getText().length()>0 && !txt_result_costo.getText().equals(".")){
            
            int confirm = JOptionPane.showConfirmDialog(rootPane, "¿Está seguro que desea actualizar el precio?");
            if(confirm == JOptionPane.YES_OPTION){
                
                int id = Integer.parseInt(txt_id.getText());
                double costo = Double.parseDouble(txt_result_costo.getText());
                membresia.updaterMemebresia(id, costo);
                cargarTabla();
                
                txt_result_costo.setText("");
                txt_result_costo.setEditable(false);
                btn_guardar.setEnabled(false);
                btn_editar.setEnabled(false);
                txt_id.setText("");
                txt_id.requestFocus();
            }
            
            
            
            }else{
                 JOptionPane.showMessageDialog(rootPane, "Ingresa conrrectamente el nuevo precio");
                 txt_result_costo.setText("");
                 txt_result_costo.requestFocus();
            }
        
        
    }//GEN-LAST:event_btn_guardarActionPerformed

    private void txt_result_costoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_result_costoKeyTyped
        Validar.soloNumerosDos(evt, txt_result_costo);
    }//GEN-LAST:event_txt_result_costoKeyTyped

    private void txt_idActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_idActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_idActionPerformed

    private void txt_idKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_idKeyReleased
        
        if(txt_id.getText().length()<=0){
            btn_editar.setEnabled(false);
            btn_guardar.setEnabled(false);
            txt_result_costo.setText("");
            txt_result_membresia.setText("");
             
            
        }
        
    }//GEN-LAST:event_txt_idKeyReleased

    private void btn_volverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_volverActionPerformed
        Home frm_home = new Home();
        frm_home.setVisible(true);
        dispose();

    }//GEN-LAST:event_btn_volverActionPerformed

     
    
    
    
    
/*-----------------------------------------------------------------------------------------
        cargar tabla de membresia
 ------------------------------------------------------------------------------------------*/
    public void cargarTabla(){
        
        //vector para agreagar a las columnas titulos
	String titulos[] = {"Id Pago","Nombre","Costo"};
	//vector para guaradar los registros que se recupen de la base de datos
	String[] registros = new String[3];//cantidad de las columnas de la tabla
	//asignamos al model el vector de titulos poder insertar en la tabla los registros
	DefaultTableModel modelo = new DefaultTableModel(null,titulos);
	//la conexion a la base
	
	
         try{  
              
               sql="select * from  tipo";
               ps =  conexion.prepareStatement(sql);
               rs = ps.executeQuery();
              
               
                       while(rs.next()){

                          registros[0]  = String.valueOf(rs.getInt(1));
                          registros[1]  = rs.getString(2);
                          registros[2]  = String.valueOf(rs.getFloat(3));
                           
                          modelo.addRow(registros);
                          }
                       tabla_membresia.setModel(modelo);
                        

           }catch(Exception ex){
               JOptionPane.showMessageDialog(null, ex.getMessage()+ "hola");
           } 

    }
    
    
    
    
    
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
     

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Form_membresia().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_buscar;
    private javax.swing.JButton btn_editar;
    private javax.swing.JButton btn_guardar;
    private javax.swing.JButton btn_volver;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTable tabla_membresia;
    private javax.swing.JTextField txt_id;
    private javax.swing.JTextField txt_result_costo;
    private javax.swing.JTextField txt_result_membresia;
    // End of variables declaration//GEN-END:variables
}
