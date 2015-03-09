package forms;
import javax.swing.*;






public class Home extends JFrame {

    //instanceamos un cliente tipo users
   
    
    
    public Home() {
        initComponents();
        setLocationRelativeTo(null);
        setTitle("Bienvenido");
        
   
        //si es administrador desbloqueamos el menu usuario
        if(Login.usuario.getTipo().equalsIgnoreCase("Administrador")){
             bloquearMenu(true,true);
            
         }else{
        
             bloquearMenu(true,false);
        }
        
        //JOptionPane.showMessageDialog(rootPane,Login.usuario.getTipo()) ;
 }

    
    
    
    
    
/*---------------------------------------------------------
    $Home codigo de la interfaz generado por netbeans 
 ----------------------------------------------------------*/
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuItem3 = new javax.swing.JMenuItem();
        jSeparator2 = new javax.swing.JSeparator();
        btn_rutina = new javax.swing.JButton();
        lbl_bienvenido1 = new javax.swing.JLabel();
        btn_clientes = new javax.swing.JButton();
        btn_membresia = new javax.swing.JButton();
        btn_buscar_cliente = new javax.swing.JButton();
        btn_pago = new javax.swing.JButton();
        btn_buscar_membresia = new javax.swing.JButton();
        jSeparator3 = new javax.swing.JSeparator();
        btn_membresia1 = new javax.swing.JButton();
        lbl_result_tipo = new javax.swing.JLabel();
        lbl_bienvenido2 = new javax.swing.JLabel();
        lbl_tipo = new javax.swing.JLabel();
        lbl_result_user = new javax.swing.JLabel();
        lbl_user2 = new javax.swing.JLabel();
        btn_ficha1 = new javax.swing.JButton();
        btn_buscar_membresia1 = new javax.swing.JButton();
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
        setPreferredSize(new java.awt.Dimension(960, 800));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jSeparator2.setBackground(new java.awt.Color(51, 204, 255));
        getContentPane().add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 320, 840, 10));

        btn_rutina.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        btn_rutina.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/dumbbell-512.png"))); // NOI18N
        btn_rutina.setText("Nueva rutina");
        btn_rutina.setBorder(null);
        btn_rutina.setBorderPainted(false);
        btn_rutina.setContentAreaFilled(false);
        btn_rutina.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_rutina.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_rutina.setIconTextGap(20);
        btn_rutina.setInheritsPopupMenu(true);
        btn_rutina.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        btn_rutina.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btn_rutina.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_rutinaActionPerformed(evt);
            }
        });
        getContentPane().add(btn_rutina, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 150, 160, 160));

        lbl_bienvenido1.setBackground(new java.awt.Color(119, 119, 119));
        lbl_bienvenido1.setFont(new java.awt.Font("Harlow Solid Italic", 0, 64)); // NOI18N
        lbl_bienvenido1.setForeground(new java.awt.Color(153, 153, 153));
        lbl_bienvenido1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_bienvenido1.setText("Bienvenido");
        getContentPane().add(lbl_bienvenido1, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 30, 380, 80));

        btn_clientes.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        btn_clientes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/create_user_man2_male-512.png"))); // NOI18N
        btn_clientes.setText("Nuevo cliente");
        btn_clientes.setBorder(null);
        btn_clientes.setBorderPainted(false);
        btn_clientes.setContentAreaFilled(false);
        btn_clientes.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_clientes.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_clientes.setIconTextGap(-4);
        btn_clientes.setInheritsPopupMenu(true);
        btn_clientes.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        btn_clientes.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btn_clientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_clientesActionPerformed(evt);
            }
        });
        getContentPane().add(btn_clientes, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 150, -1, 160));

        btn_membresia.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        btn_membresia.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/exit.png"))); // NOI18N
        btn_membresia.setBorder(null);
        btn_membresia.setBorderPainted(false);
        btn_membresia.setContentAreaFilled(false);
        btn_membresia.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_membresia.setDoubleBuffered(true);
        btn_membresia.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_membresia.setIconTextGap(-4);
        btn_membresia.setInheritsPopupMenu(true);
        btn_membresia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_membresiaActionPerformed(evt);
            }
        });
        getContentPane().add(btn_membresia, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 50, 30, -1));

        btn_buscar_cliente.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        btn_buscar_cliente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/buscar.png"))); // NOI18N
        btn_buscar_cliente.setText("Buscar cliente");
        btn_buscar_cliente.setBorder(null);
        btn_buscar_cliente.setBorderPainted(false);
        btn_buscar_cliente.setContentAreaFilled(false);
        btn_buscar_cliente.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_buscar_cliente.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_buscar_cliente.setIconTextGap(-4);
        btn_buscar_cliente.setInheritsPopupMenu(true);
        btn_buscar_cliente.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        btn_buscar_cliente.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btn_buscar_cliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_buscar_clienteActionPerformed(evt);
            }
        });
        getContentPane().add(btn_buscar_cliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 340, -1, 160));

        btn_pago.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        btn_pago.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/pago.png"))); // NOI18N
        btn_pago.setText("Nuevo Pago");
        btn_pago.setBorder(null);
        btn_pago.setBorderPainted(false);
        btn_pago.setContentAreaFilled(false);
        btn_pago.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_pago.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_pago.setIconTextGap(20);
        btn_pago.setInheritsPopupMenu(true);
        btn_pago.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        btn_pago.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btn_pago.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_pagoActionPerformed(evt);
            }
        });
        getContentPane().add(btn_pago, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 160, 150, 150));

        btn_buscar_membresia.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        btn_buscar_membresia.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/reporte.png"))); // NOI18N
        btn_buscar_membresia.setText("Reportes");
        btn_buscar_membresia.setBorder(null);
        btn_buscar_membresia.setBorderPainted(false);
        btn_buscar_membresia.setContentAreaFilled(false);
        btn_buscar_membresia.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_buscar_membresia.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_buscar_membresia.setIconTextGap(20);
        btn_buscar_membresia.setInheritsPopupMenu(true);
        btn_buscar_membresia.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        btn_buscar_membresia.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btn_buscar_membresia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_buscar_membresiaActionPerformed(evt);
            }
        });
        getContentPane().add(btn_buscar_membresia, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 340, 170, 160));

        jSeparator3.setBackground(new java.awt.Color(110, 110, 110));
        jSeparator3.setForeground(new java.awt.Color(51, 153, 255));
        getContentPane().add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 90, 270, 20));

        btn_membresia1.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        btn_membresia1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/asistencia.png"))); // NOI18N
        btn_membresia1.setText("Nueva asistencia");
        btn_membresia1.setBorder(null);
        btn_membresia1.setBorderPainted(false);
        btn_membresia1.setContentAreaFilled(false);
        btn_membresia1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_membresia1.setDoubleBuffered(true);
        btn_membresia1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_membresia1.setIconTextGap(20);
        btn_membresia1.setInheritsPopupMenu(true);
        btn_membresia1.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        btn_membresia1.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btn_membresia1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_membresia1ActionPerformed(evt);
            }
        });
        getContentPane().add(btn_membresia1, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 160, 160, 150));

        lbl_result_tipo.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        lbl_result_tipo.setForeground(new java.awt.Color(0, 153, 255));
        lbl_result_tipo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_result_tipo.setText("usuario");
        getContentPane().add(lbl_result_tipo, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 10, -1, -1));

        lbl_bienvenido2.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        lbl_bienvenido2.setForeground(new java.awt.Color(110, 110, 110));
        lbl_bienvenido2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_bienvenido2.setText("Cerrar Sesión");
        getContentPane().add(lbl_bienvenido2, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 90, -1, -1));

        lbl_tipo.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        lbl_tipo.setForeground(new java.awt.Color(110, 110, 110));
        lbl_tipo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_tipo.setText("Tipo:");
        getContentPane().add(lbl_tipo, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 10, -1, -1));

        lbl_result_user.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        lbl_result_user.setForeground(new java.awt.Color(0, 153, 255));
        lbl_result_user.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_result_user.setText("usuario");
        getContentPane().add(lbl_result_user, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 10, -1, -1));

        lbl_user2.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        lbl_user2.setForeground(new java.awt.Color(110, 110, 110));
        lbl_user2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_user2.setText("Usuario:");
        getContentPane().add(lbl_user2, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 10, -1, -1));

        btn_ficha1.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        btn_ficha1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/ficha.png"))); // NOI18N
        btn_ficha1.setText("Nueva ficha");
        btn_ficha1.setBorder(null);
        btn_ficha1.setBorderPainted(false);
        btn_ficha1.setContentAreaFilled(false);
        btn_ficha1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_ficha1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_ficha1.setIconTextGap(20);
        btn_ficha1.setInheritsPopupMenu(true);
        btn_ficha1.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        btn_ficha1.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btn_ficha1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_ficha1ActionPerformed(evt);
            }
        });
        getContentPane().add(btn_ficha1, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 150, 160, 160));

        btn_buscar_membresia1.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        btn_buscar_membresia1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/busca_membresia.png"))); // NOI18N
        btn_buscar_membresia1.setText("Buscar membresia");
        btn_buscar_membresia1.setBorder(null);
        btn_buscar_membresia1.setBorderPainted(false);
        btn_buscar_membresia1.setContentAreaFilled(false);
        btn_buscar_membresia1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_buscar_membresia1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_buscar_membresia1.setIconTextGap(20);
        btn_buscar_membresia1.setInheritsPopupMenu(true);
        btn_buscar_membresia1.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        btn_buscar_membresia1.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btn_buscar_membresia1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_buscar_membresia1ActionPerformed(evt);
            }
        });
        getContentPane().add(btn_buscar_membresia1, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 340, 170, 160));

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

    private void btn_clientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_clientesActionPerformed
             Form_clientes frm_clientes = new Form_clientes();
        frm_clientes.setVisible(true);
        dispose();
    }//GEN-LAST:event_btn_clientesActionPerformed

    private void btn_membresiaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_membresiaActionPerformed
        int confirm = JOptionPane.showConfirmDialog(rootPane, "Esta seguro que desea cerrar sesion");
        if(confirm == JOptionPane.YES_OPTION){
           Login login = new Login();
           login.setVisible(true);
           dispose();
        }
        
    }//GEN-LAST:event_btn_membresiaActionPerformed

    private void btn_buscar_clienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_buscar_clienteActionPerformed
        Form_modificar_clientes frm_modificar_clientes = new Form_modificar_clientes();
        frm_modificar_clientes.setVisible(true);
        dispose();
    }//GEN-LAST:event_btn_buscar_clienteActionPerformed

    private void btn_pagoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_pagoActionPerformed
      Form_pagos frm_pagos = new Form_pagos();
     frm_pagos.setVisible(true);
     dispose();
     
    }//GEN-LAST:event_btn_pagoActionPerformed

    private void btn_buscar_membresiaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_buscar_membresiaActionPerformed
        Form_reportes frm_reportes = new Form_reportes();
       frm_reportes.setVisible(true);
       dispose();   
    }//GEN-LAST:event_btn_buscar_membresiaActionPerformed

    private void btn_rutinaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_rutinaActionPerformed
        Frm_rutina frm_rutina = new Frm_rutina();
        frm_rutina.setVisible(true);
        dispose();
    }//GEN-LAST:event_btn_rutinaActionPerformed

    private void btn_membresia1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_membresia1ActionPerformed
        Form_Asistencia frm_asi = new Form_Asistencia();
       frm_asi.setVisible(true);
       dispose();        // TODO add your handling code here:
    }//GEN-LAST:event_btn_membresia1ActionPerformed

    private void btn_ficha1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_ficha1ActionPerformed
        Form_ficha ficha  = new Form_ficha();
        ficha.setVisible(true);
        dispose();
    }//GEN-LAST:event_btn_ficha1ActionPerformed

    private void btn_buscar_membresia1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_buscar_membresia1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_buscar_membresia1ActionPerformed

    
    
    
    
    
    
    
    
    
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new  Login().setVisible(true);
            }
        });
    }
    
    
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_buscar_cliente;
    private javax.swing.JButton btn_buscar_membresia;
    private javax.swing.JButton btn_buscar_membresia1;
    private javax.swing.JButton btn_clientes;
    private javax.swing.JButton btn_ficha1;
    private javax.swing.JButton btn_membresia;
    private javax.swing.JButton btn_membresia1;
    private javax.swing.JButton btn_pago;
    private javax.swing.JButton btn_rutina;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JLabel lbl_bienvenido1;
    private javax.swing.JLabel lbl_bienvenido2;
    public javax.swing.JLabel lbl_result_tipo;
    public javax.swing.JLabel lbl_result_user;
    private javax.swing.JLabel lbl_tipo;
    private javax.swing.JLabel lbl_user2;
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
    // End of variables declaration//GEN-END:variables
}
