
package forms;
import Mysql.Conexion;
import general.Foto;
import general.Rutina;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.filechooser.FileNameExtensionFilter;
import validaciones.Validar;

import java.io.*;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;






public class Frm_rutina extends javax.swing.JFrame {
    //para poder filtar solo imagenes de l tipo jpg,png o cualquier archivo
    private FileNameExtensionFilter filter = new FileNameExtensionFilter("Archivo de imagen","jpg");
    
    private String ruta,sql;
    
    //instanceamos un obejto tipo foto
    Foto foto = new Foto();
    
    //para poder capturar una entrada de una imegen
    private FileInputStream inputImage;
    //para hace la conexion con la base de datos 
    private Conexion cn = new Conexion();
    private Connection conexion = cn.getConexion();
    
    //declaramos un result set y prepared statement
    private PreparedStatement ps;
    ResultSet rs;
    
    //para el largo de la imagen guadar la imagen 
    private int longBytes;
       
    //para guardar  lo de rutina
    Rutina rutina = new Rutina();
    
    
    
/*-----------------------------------------------------------------------------------------
        CONSTRUCTOR DE LA CLASE
 ------------------------------------------------------------------------------------------*/  
   
    public Frm_rutina() {
        initComponents();
        ruta ="";
        txt_ruta.setEditable(false);
        
        this.setLocationRelativeTo(null);
        
        //para limitar los caracteres enla caja de texto
        this.txt_nivel.setDocument(new Validar(this.txt_nivel,15));
        cargarRutina();
        
        //desabilitamos el botones
       btn_actualizar.setEnabled(false);
       btn_eliminar.setEnabled(false);
       btn_editar.setEnabled(false);
               
        
         
        
    }

    
    
    
 /*-----------------------------------------------------------------------------------------
        MÉTODO PARA CARGAR RUTINAS
 ------------------------------------------------------------------------------------------*/
    public void cargarRutina(){
        
        //vector para guadar los titulos de las columnas que van en el jatable
        String titulos[] = {"Id rutina","Nivel","Archivo"};
        //vector para guadar los registros que traemso de la base 
        String registros[] = new String[3];
        //llenar el model con los titulos de la tabla
        DefaultTableModel model = new DefaultTableModel(null,titulos);
        
            sql = "select * from rutinas";

            try{
                ps = conexion.prepareStatement(sql);
                rs = ps.executeQuery();

                while(rs.next()){

                    registros[0] = String.valueOf(rs.getInt(1));
                    registros[1] = rs.getString(2);
                    registros[2] = String.valueOf(rs.getBinaryStream(1));
                    
                    model.addRow(registros);
                }
                tabla_rutina.setModel(model);
                
            }catch(Exception ex){
                
                JOptionPane.showMessageDialog(this, ex.getMessage());
            
            }
  
    
    }
    
    
    
    
    
    
    
    
    

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane1 = new javax.swing.JTabbedPane();
        jScrollPane2 = new javax.swing.JScrollPane();
        jPanel1 = new javax.swing.JPanel();
        jLabel26 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        txt_ruta = new javax.swing.JTextField();
        btn_elegir = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabla_rutina = new javax.swing.JTable();
        btn_eliminar = new javax.swing.JButton();
        txt_nivel = new javax.swing.JTextField();
        lbl_agregar = new javax.swing.JLabel();
        lbl_foto = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        btn_guardar = new javax.swing.JButton();
        btn_actualizar = new javax.swing.JButton();
        btn_cancelar = new javax.swing.JButton();
        btn_cancelar1 = new javax.swing.JButton();
        btn_editar = new javax.swing.JButton();
        jLabel27 = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(250, 250, 250));
        setPreferredSize(new java.awt.Dimension(960, 800));

        jTabbedPane1.setBackground(new java.awt.Color(250, 250, 250));
        jTabbedPane1.setForeground(new java.awt.Color(110, 110, 110));
        jTabbedPane1.setFont(new java.awt.Font("Dialog", 0, 16)); // NOI18N

        jScrollPane2.setBorder(null);

        jPanel1.setBackground(new java.awt.Color(250, 250, 250));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel26.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        jLabel26.setForeground(new java.awt.Color(110, 110, 110));
        jLabel26.setText("Acciones:");
        jPanel1.add(jLabel26, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 340, 90, -1));

        jLabel13.setFont(new java.awt.Font("Verdana", 0, 16)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(110, 110, 110));
        jLabel13.setText("Img rutina:");
        jPanel1.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 190, -1, -1));

        txt_ruta.setFont(new java.awt.Font("Verdana", 0, 8)); // NOI18N
        txt_ruta.setForeground(new java.awt.Color(110, 110, 110));
        txt_ruta.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(202, 202, 202), 1, true));
        txt_ruta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_rutaActionPerformed(evt);
            }
        });
        txt_ruta.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txt_rutaKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_rutaKeyTyped(evt);
            }
        });
        jPanel1.add(txt_ruta, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 190, 180, 30));

        btn_elegir.setBackground(new java.awt.Color(0, 153, 204));
        btn_elegir.setFont(new java.awt.Font("Verdana", 0, 16)); // NOI18N
        btn_elegir.setForeground(new java.awt.Color(255, 255, 255));
        btn_elegir.setText("Elegir");
        btn_elegir.setBorder(null);
        btn_elegir.setBorderPainted(false);
        btn_elegir.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_elegir.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_elegir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_elegirActionPerformed(evt);
            }
        });
        jPanel1.add(btn_elegir, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 190, 80, 30));

        jSeparator1.setBackground(new java.awt.Color(51, 204, 255));
        jPanel1.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 370, 380, 10));

        tabla_rutina.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        tabla_rutina.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                tabla_rutinaMousePressed(evt);
            }
        });
        jScrollPane1.setViewportView(tabla_rutina);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 450, 870, 200));

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
        jPanel1.add(btn_eliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 390, 100, 40));

        txt_nivel.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        txt_nivel.setForeground(new java.awt.Color(110, 110, 110));
        txt_nivel.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(202, 202, 202), 1, true));
        txt_nivel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_nivelActionPerformed(evt);
            }
        });
        txt_nivel.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txt_nivelKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_nivelKeyTyped(evt);
            }
        });
        jPanel1.add(txt_nivel, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 150, 180, 30));

        lbl_agregar.setFont(new java.awt.Font("Verdana", 1, 16)); // NOI18N
        lbl_agregar.setForeground(new java.awt.Color(110, 110, 110));
        lbl_agregar.setText("Agregar");
        jPanel1.add(lbl_agregar, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 320, -1, -1));

        lbl_foto.setBackground(new java.awt.Color(0, 0, 0));
        lbl_foto.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        lbl_foto.setForeground(new java.awt.Color(153, 153, 153));
        lbl_foto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/img.png"))); // NOI18N
        lbl_foto.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        lbl_foto.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lbl_foto.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        lbl_foto.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbl_fotoMouseClicked(evt);
            }
        });
        jPanel1.add(lbl_foto, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 110, 460, 275));

        jLabel16.setFont(new java.awt.Font("Verdana", 0, 16)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(110, 110, 110));
        jLabel16.setText("Nivel:");
        jPanel1.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 150, -1, -1));

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
        jPanel1.add(btn_guardar, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 250, 100, 40));

        btn_actualizar.setBackground(new java.awt.Color(0, 153, 204));
        btn_actualizar.setFont(new java.awt.Font("Verdana", 0, 16)); // NOI18N
        btn_actualizar.setForeground(new java.awt.Color(255, 255, 255));
        btn_actualizar.setText("Actualizar");
        btn_actualizar.setBorder(null);
        btn_actualizar.setBorderPainted(false);
        btn_actualizar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_actualizar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_actualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_actualizarActionPerformed(evt);
            }
        });
        jPanel1.add(btn_actualizar, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 390, 100, 40));

        btn_cancelar.setBackground(new java.awt.Color(0, 153, 204));
        btn_cancelar.setFont(new java.awt.Font("Verdana", 0, 16)); // NOI18N
        btn_cancelar.setForeground(new java.awt.Color(255, 255, 255));
        btn_cancelar.setText("Cancelar");
        btn_cancelar.setBorder(null);
        btn_cancelar.setBorderPainted(false);
        btn_cancelar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_cancelar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_cancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_cancelarActionPerformed(evt);
            }
        });
        jPanel1.add(btn_cancelar, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 250, 100, 40));

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
        jPanel1.add(btn_editar, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 390, 100, 40));

        jLabel27.setFont(new java.awt.Font("Verdana", 0, 24)); // NOI18N
        jLabel27.setForeground(new java.awt.Color(110, 110, 110));
        jLabel27.setText("Rutinas");
        jPanel1.add(jLabel27, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 30, 90, -1));

        jSeparator2.setBackground(new java.awt.Color(51, 204, 255));
        jPanel1.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 80, 600, 10));

        jScrollPane2.setViewportView(jPanel1);

        jTabbedPane1.addTab("Nueva rutina", jScrollPane2);

        getContentPane().add(jTabbedPane1, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txt_rutaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_rutaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_rutaActionPerformed

    private void txt_rutaKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_rutaKeyReleased

    }//GEN-LAST:event_txt_rutaKeyReleased

    private void txt_rutaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_rutaKeyTyped
        
    }//GEN-LAST:event_txt_rutaKeyTyped

    
    
    
/*-----------------------------------------------------------------------------------------
        METODO PARA CARGAR LA FOTO DEL DOCENTE
 ------------------------------------------------------------------------------------------*/   
     
    public void cargarfoto(String id) {
        Image dtCat = foto.recuperarfotos(id);
        ImageIcon icon = new ImageIcon(dtCat);
        //Se extrae la imagen del icono
        Image img = icon.getImage();
        //Se modifica su tamaño
        Image newimg = img.getScaledInstance(460, 275, java.awt.Image.SCALE_SMOOTH);
        //SE GENERA EL IMAGE ICON CON LA NUEVA IMAGEN
        ImageIcon newIcon = new ImageIcon(newimg);
        //Se coloca el nuevo icono modificado
        if (newIcon == null) {
            JOptionPane.showMessageDialog(null, "no tiene imagen","ADVERTENCIA",JOptionPane.ERROR);
        } else {
            lbl_foto.setIcon(newIcon);//Seteamos la foto el el label llamado jLFoto del frame HISTORIALASISITENCIA
            lbl_foto.setSize(460, 275);//Seteamos el tamaño para la foto  
        }
    }
    
    
   
    
    
    
  /*-----------------------------------------------------------------------------------------
        MÉTODO PARA ELEGIRLA FOTO DE LA RUTINA
 ------------------------------------------------------------------------------------------*/   
    
    private void btn_elegirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_elegirActionPerformed
            JFileChooser ventana = new JFileChooser();
            ventana.setFileFilter(filter);
            int option = ventana.showOpenDialog(this);
            
            //si hacemos click en el boton abrir    
            if(option == JFileChooser.APPROVE_OPTION){
                
                try {
                    
                    //declaramos un entero para guirdar el largo de byes de l aimagen
                    
                    inputImage = new FileInputStream(ventana.getSelectedFile());
                    longBytes = (int)ventana.getSelectedFile().length();
                    
                    //guardamos ruta del archivo
                    String fil = ventana.getSelectedFile().getPath();
                    //obtener la direccion donde se gurdara la imagen
                    String file = ventana.getSelectedFile().toString();
                    
                    //modifcamos la imagen
                    ImageIcon icon = new ImageIcon(fil);
                    //extraemos la imagen del icono
                    Image img = icon.getImage();
                    //cambiando la imagen de tamaño
                    img = img.getScaledInstance(460,275,Image.SCALE_SMOOTH);
                    //gurdadmos como icono la imagen modificada
                    icon.setImage(img);
                    
                    //ingresamos la imagen que elija en el lbl
                    lbl_foto.setIcon(icon);
                    txt_ruta.setText(file);
                    
                } catch (FileNotFoundException ex) {
                    Logger.getLogger(Frm_rutina.class.getName()).log(Level.SEVERE, null, ex);
                }
        
            }
    }//GEN-LAST:event_btn_elegirActionPerformed

    
    
    
    
    
    
/*-----------------------------------------------------------------------------------------
        MÉTODO PARA eliminar LA IMAGEN EN LA BASE DE DATOS
 ------------------------------------------------------------------------------------------*/   
    
    private void btn_eliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_eliminarActionPerformed
        
                
        
            int confirm = JOptionPane.showConfirmDialog(rootPane, "¿Está seguro que desea eliminar la rutina con id="+rutina.getIdRutina()+"?");

            if(confirm == JOptionPane.YES_OPTION){
                 rutina.eliminarRutina();
                cargarRutina();
               }
      
    }//GEN-LAST:event_btn_eliminarActionPerformed

    
    
    
    
    private void txt_nivelKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_nivelKeyTyped
            Validar.soloLetras(evt);
    }//GEN-LAST:event_txt_nivelKeyTyped

    private void txt_nivelKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_nivelKeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_nivelKeyReleased

    private void txt_nivelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_nivelActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_nivelActionPerformed

    private void lbl_fotoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl_fotoMouseClicked
           JFileChooser ventana = new JFileChooser();
            ventana.setFileFilter(filter);
            int option = ventana.showOpenDialog(this);
            
            //si hacemos click en el boton abrir    
            if(option == JFileChooser.APPROVE_OPTION){
                
                //guardamos ruta del archivo
                String fil = ventana.getSelectedFile().getPath();
                //obtener la direccion donde se gurdara la imagen 
                String file = ventana.getSelectedFile().toString();
                
                //modifcamos la imagen
                ImageIcon icon = new ImageIcon(fil);
                //extraemos la imagen del icono
                Image img = icon.getImage();
                //cambiando la imagen de tamaño
                img = img.getScaledInstance(460,275,Image.SCALE_SMOOTH); 
                //gurdadmos como icono la imagen modificada
                icon.setImage(img);
                
                //ingresamos la imagen que elija en el lbl
                lbl_foto.setIcon(icon);
                txt_ruta.setText(file);
        
            }
             
    }//GEN-LAST:event_lbl_fotoMouseClicked

    
    
     
  /*-----------------------------------------------------------------------------------------
        MÉTODO PARA GUADAR
 ------------------------------------------------------------------------------------------*/      
    
    private void btn_guardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_guardarActionPerformed
           if(txt_nivel.getText().length() > 0 && txt_ruta.getText().length()>0){
            
             
                
                //llamamos al metodo insertar rutina y le enviamos el nivel  imagen y el largo de la img
                rutina.insertarRutina(txt_nivel.getText(), inputImage, longBytes);
                cargarRutina();
              
                txt_nivel.setText("");
                txt_ruta.setText("");
                txt_nivel.requestFocus();
                                
        
        }else{
            JOptionPane.showMessageDialog(this, "Llena todos los campos");
        }
           
    }//GEN-LAST:event_btn_guardarActionPerformed

    
    
    
   /*-----------------------------------------------------------------------------------------
        MÉTODO ACTUALIZAR LAS RUTINAS
 ------------------------------------------------------------------------------------------*/     
    private void btn_actualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_actualizarActionPerformed
        
                
        if(txt_nivel.getText().length() > 0 && txt_ruta.getText().length()>0){
            
                //llamamos al metodo insertar rutina y le enviamos el nivel  imagen y el largo de la img
                rutina.actulizarRutina(txt_nivel.getText(), inputImage, longBytes);
                cargarRutina();
                
                btn_editar.setEnabled(false);
                btn_eliminar.setEnabled(false);
                btn_editar.setEnabled(false);
                btn_actualizar.setEnabled(false);
                txt_nivel.setText("");
                txt_ruta.setText("");
                txt_nivel.requestFocus();
                                
        
        }else{
            JOptionPane.showMessageDialog(this, "Llena todos los campos");
        }
   
        
    }//GEN-LAST:event_btn_actualizarActionPerformed



   /*-----------------------------------------------------------------------------------------
        MÉTODO CANCELAR LA MEMBRESIA
 ------------------------------------------------------------------------------------------*/  
    private void btn_cancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_cancelarActionPerformed
        int confirm = JOptionPane.showConfirmDialog(rootPane, "¿Está seguro que desea cancelar?");

            if(confirm == JOptionPane.YES_OPTION){
                
                txt_nivel.setText("");
                this.txt_ruta.setText("");
                txt_nivel.requestFocus();
                //desabilitamos el botones
                btn_actualizar.setEnabled(false);
                btn_eliminar.setEnabled(false);
               }
            
    }//GEN-LAST:event_btn_cancelarActionPerformed

    
    
  /*-----------------------------------------------------------------------------------------
        MÉTODO PARA CARGAR DATOS DESDE LA BASE DATOS SELECCIONADOS DE LA TABLA
 ------------------------------------------------------------------------------------------*/   
          
    private void tabla_rutinaMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabla_rutinaMousePressed
        
        int fila = this.tabla_rutina.getSelectedRow();
        
        //limpiar();
        
        
        try {
            //obtenemos el id del al rutina
            String id = tabla_rutina.getValueAt(fila, 0).toString();
            //guardamos el id de la rutina
            rutina.SetIdRutina(Integer.parseInt( tabla_rutina.getValueAt(fila, 0).toString()));
            
            
            this.txt_nivel.setText(tabla_rutina.getValueAt(fila, 1).toString());
            
            
            sql = "select archivo from rutinas where id_rutina = "+id+"";
            ps = conexion.prepareStatement(sql);
            rs = ps.executeQuery();
            
            if(rs.next()) {
                cargarfoto(id);//llama al metodo para cargar la foto en el table y le invia el parametro DNI
                lbl_agregar.setVisible(false);
                txt_ruta.setText("");
                
                
                 //habilitamos los botones
                btn_editar.setEnabled(true);
                btn_eliminar.setEnabled(true);
            }
    
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null,e.getMessage());
            
        }
    }//GEN-LAST:event_tabla_rutinaMousePressed

    private void btn_cancelar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_cancelar1ActionPerformed
        Home frm_home = new Home();
        frm_home.setVisible(true);
        dispose();

    }//GEN-LAST:event_btn_cancelar1ActionPerformed

    
    
    
/*-----------------------------------------------------------------------------------------
        MÉTODO PARA EDITAR
 ------------------------------------------------------------------------------------------*/   
    
    private void btn_editarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_editarActionPerformed
        
          JOptionPane.showMessageDialog(null,"Cuando modifiques la foto o el nombre se la rutina\n presiona actulizar para guardar los cambios");
          txt_nivel.requestFocus();
          btn_actualizar.setEnabled(true);
          
    }//GEN-LAST:event_btn_editarActionPerformed

    
    
    
    
  
    public static void main(String args[]) {
      
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Frm_rutina().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_actualizar;
    private javax.swing.JButton btn_cancelar;
    private javax.swing.JButton btn_cancelar1;
    private javax.swing.JButton btn_editar;
    private javax.swing.JButton btn_elegir;
    private javax.swing.JButton btn_eliminar;
    private javax.swing.JButton btn_guardar;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JLabel lbl_agregar;
    private javax.swing.JLabel lbl_foto;
    private javax.swing.JTable tabla_rutina;
    private javax.swing.JTextField txt_nivel;
    private javax.swing.JTextField txt_ruta;
    // End of variables declaration//GEN-END:variables
}
