
package forms;

public class Frm_rutina extends javax.swing.JFrame {

   
    public Frm_rutina() {
        initComponents();
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel19 = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        Nivel = new javax.swing.JLabel();
        txt_user = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(250, 250, 250));
        setPreferredSize(new java.awt.Dimension(960, 800));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel19.setFont(new java.awt.Font("Verdana", 0, 24)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(110, 110, 110));
        jLabel19.setText("Nueva rutina");
        getContentPane().add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 70, -1, -1));

        jSeparator2.setBackground(new java.awt.Color(51, 204, 255));
        getContentPane().add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 130, 600, 10));

        Nivel.setFont(new java.awt.Font("Verdana", 0, 16)); // NOI18N
        Nivel.setForeground(new java.awt.Color(110, 110, 110));
        Nivel.setText("Nivel:");
        getContentPane().add(Nivel, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 190, -1, -1));

        txt_user.setFont(new java.awt.Font("Verdana", 0, 16)); // NOI18N
        txt_user.setForeground(new java.awt.Color(110, 110, 110));
        txt_user.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(202, 202, 202), 1, true));
        getContentPane().add(txt_user, new org.netbeans.lib.awtextra.AbsoluteConstraints(337, 180, 350, 39));

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(jTable1);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 330, 800, 250));

        pack();
    }// </editor-fold>//GEN-END:initComponents

  
    public static void main(String args[]) {
      
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Frm_rutina().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Nivel;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField txt_user;
    // End of variables declaration//GEN-END:variables
}
