package forms;
import javax.swing.*;

public class Home extends JFrame {

    public Home() {
        initComponents();
        setLocationRelativeTo(null);
    }

/*---------------------------------------------------------
 $Home codigo de la interfaz generado por netbeans 
 ----------------------------------------------------------*/
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuItem3 = new javax.swing.JMenuItem();
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

        jMenuItem3.setText("jMenuItem3");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jMenu1.setText("Archivo");

        mnu_salir.setText("Salir");
        mnu_salir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnu_salirActionPerformed(evt);
            }
        });
        jMenu1.add(mnu_salir);

        jMenuBar1.add(jMenu1);

        mnu_clientes.setText("Clientes");

        mnu_cliente_nuevo.setText("Nuevo");
        mnu_clientes.add(mnu_cliente_nuevo);

        mnu_cliente_asistencia.setText("Asistencia");
        mnu_cliente_asistencia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnu_cliente_asistenciaActionPerformed(evt);
            }
        });
        mnu_clientes.add(mnu_cliente_asistencia);

        mnu_cliente_detalles.setText("Detalles");
        mnu_clientes.add(mnu_cliente_detalles);

        jMenuBar1.add(mnu_clientes);

        mnu_pagos.setText("Pagos");

        mnu_pago_nuevo.setText("Nuevo");
        mnu_pagos.add(mnu_pago_nuevo);

        mnu_pagos_detalles.setText("Detalles");
        mnu_pagos.add(mnu_pagos_detalles);

        jMenuBar1.add(mnu_pagos);

        mnu_membresia.setText("Membresia");

        mnu_membresia_nuevo.setText("Nuevo");
        mnu_membresia.add(mnu_membresia_nuevo);

        mnu_membresia_detalles.setText("Detalles");
        mnu_membresia.add(mnu_membresia_detalles);

        jMenuBar1.add(mnu_membresia);

        mnu_ficha.setText("Ficha de seguimiento");

        mnu_ficha_nueva.setText("Nueva");
        mnu_ficha.add(mnu_ficha_nueva);

        mnu_ficha_detalles.setText("Detalles");
        mnu_ficha.add(mnu_ficha_detalles);

        jMenuBar1.add(mnu_ficha);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 800, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 579, Short.MAX_VALUE)
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
 $Menu cliente nuevo
 ----------------------------------------------------------*/
    private void mnu_cliente_asistenciaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnu_cliente_asistenciaActionPerformed
       
    }//GEN-LAST:event_mnu_cliente_asistenciaActionPerformed

    
    
    
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
    // End of variables declaration//GEN-END:variables
}
