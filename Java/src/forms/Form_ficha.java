package forms;
import Mysql.Conexion;
import general.Membresia;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.*;
import validaciones.Validar;

public class Form_ficha extends javax.swing.JFrame {
    
    
     //Hacemos las conexion 
    public Conexion cn = new Conexion();//instanciamos nuestra clase conexion
    public Connection conexion = cn.getConexion();
    private  ResultSet rs;
    private PreparedStatement ps;
    private String sql;
     
    
     
        
        /*para bloquer los botones de acciones
        btn_editar.setEnabled(false);
        btn_guardar.setEnabled(false);*/
        
        
        //para que no se pueda editar las cajas de testo de resultados de membresia
         
        /*txt_result_membresia.setEditable(false);
        txt_result_costo.setEditable(false);*/

    
    
    
/*---------------------------------------------------------
    $metodo constructor de la clase
 ----------------------------------------------------------*/ 
   
    public Form_ficha() {
        initComponents();
        setLocationRelativeTo(null);
        
        //para limitar en ingreso de caracteres
        txt_peso.setDocument(new Validar(txt_peso,3));
        txt_altura.setDocument(new Validar(txt_altura,3));
       txt_cintura.setDocument(new Validar(txt_cintura,3));
        txt_cuello.setDocument(new Validar(txt_cuello,2));
        txt_cadera.setDocument(new Validar(txt_cadera,3));
        
        //para cargar rutinas
        cargarRutinas();
        
        //para esconder los demas paneles
             this.panelPrincipal.setEnabledAt(1,false);
             
        
        
    }
    
    
    
    
    /*-----------------------------------------------------------------------------------------------------------------------------------------
        Metodos cargar combo de rutinas existentes
 ------------------------------------------------------------------------------------------------------------------------------------------*/
 public void cargarRutinas(){
        
        try{
            
            sql = "select nivel from rutinas";
            
            ps = conexion.prepareStatement(sql);
            rs = ps.executeQuery();
            
            while(rs.next()){
                cbo_nivel.addItem(rs.getString("nivel"));
            }
        
        
        }catch(Exception ex){
             JOptionPane.showMessageDialog(null, ex.getMessage());
            
        } 
        
 }//fin del metodo

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelPrincipal = new javax.swing.JTabbedPane();
        spanel_nuevo = new javax.swing.JScrollPane();
        jPanel1 = new javax.swing.JPanel();
        jLabel19 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        cbo_nivel = new javax.swing.JComboBox();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        txt_peso = new javax.swing.JTextField();
        txt_altura = new javax.swing.JTextField();
        jLabel23 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        txt_cintura = new javax.swing.JTextField();
        txt_cuello = new javax.swing.JTextField();
        jLabel52 = new javax.swing.JLabel();
        jLabel53 = new javax.swing.JLabel();
        txt_cadera = new javax.swing.JTextField();
        btn_siguiente3 = new javax.swing.JButton();
        btn_limpiar3 = new javax.swing.JButton();
        btn_cancelar1 = new javax.swing.JButton();
        spanel_final = new javax.swing.JScrollPane();
        jPanel2 = new javax.swing.JPanel();
        jLabel20 = new javax.swing.JLabel();
        btn_cancelar = new javax.swing.JButton();
        btn_guardar = new javax.swing.JButton();
        jLabel31 = new javax.swing.JLabel();
        jSeparator19 = new javax.swing.JSeparator();
        jLabel42 = new javax.swing.JLabel();
        lbl_cedula = new javax.swing.JLabel();
        jLabel37 = new javax.swing.JLabel();
        lbl_altura = new javax.swing.JLabel();
        lbl_cuello = new javax.swing.JLabel();
        jSeparator13 = new javax.swing.JSeparator();
        jSeparator20 = new javax.swing.JSeparator();
        lbl_nombre = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        jLabel39 = new javax.swing.JLabel();
        jSeparator14 = new javax.swing.JSeparator();
        jSeparator7 = new javax.swing.JSeparator();
        lbl_apellidos = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        jLabel41 = new javax.swing.JLabel();
        lbl_cintura = new javax.swing.JLabel();
        jSeparator15 = new javax.swing.JSeparator();
        lbl_imc = new javax.swing.JLabel();
        jLabel34 = new javax.swing.JLabel();
        jSeparator8 = new javax.swing.JSeparator();
        lbl_dir = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();
        jLabel30 = new javax.swing.JLabel();
        lbl_edad = new javax.swing.JLabel();
        jSeparator9 = new javax.swing.JSeparator();
        jSeparator16 = new javax.swing.JSeparator();
        jLabel35 = new javax.swing.JLabel();
        lbl_imc_altura = new javax.swing.JLabel();
        jSeparator10 = new javax.swing.JSeparator();
        jSeparator17 = new javax.swing.JSeparator();
        jLabel44 = new javax.swing.JLabel();
        lbl_telefono = new javax.swing.JLabel();
        jLabel32 = new javax.swing.JLabel();
        lbl_masa_magra = new javax.swing.JLabel();
        jSeparator29 = new javax.swing.JSeparator();
        jSeparator18 = new javax.swing.JSeparator();
        jLabel43 = new javax.swing.JLabel();
        lbl_grasa = new javax.swing.JLabel();
        jLabel45 = new javax.swing.JLabel();
        lbl_celular = new javax.swing.JLabel();
        jSeparator26 = new javax.swing.JSeparator();
        jLabel33 = new javax.swing.JLabel();
        lbl_peso = new javax.swing.JLabel();
        jLabel36 = new javax.swing.JLabel();
        jSeparator12 = new javax.swing.JSeparator();
        lbl_sobrepeso = new javax.swing.JLabel();
        jSeparator6 = new javax.swing.JSeparator();
        jLabel38 = new javax.swing.JLabel();
        lbl_sexo = new javax.swing.JLabel();
        jSeparator11 = new javax.swing.JSeparator();
        jLabel40 = new javax.swing.JLabel();
        lbl_result_cadera = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        jLabel64 = new javax.swing.JLabel();
        lbl_tipo_membresia = new javax.swing.JLabel();
        jSeparator21 = new javax.swing.JSeparator();
        jLabel69 = new javax.swing.JLabel();
        jLabel68 = new javax.swing.JLabel();
        lbl_costo = new javax.swing.JLabel();
        jSeparator25 = new javax.swing.JSeparator();
        jLabel79 = new javax.swing.JLabel();
        lbl_total = new javax.swing.JLabel();
        jSeparator27 = new javax.swing.JSeparator();
        jSeparator22 = new javax.swing.JSeparator();
        lbl_fecha_pago = new javax.swing.JLabel();
        jLabel74 = new javax.swing.JLabel();
        jSeparator23 = new javax.swing.JSeparator();
        jLabel70 = new javax.swing.JLabel();
        lbl_prox_pago = new javax.swing.JLabel();
        jSeparator24 = new javax.swing.JSeparator();
        lbl_nivel = new javax.swing.JLabel();
        jLabel54 = new javax.swing.JLabel();
        jSeparator28 = new javax.swing.JSeparator();
        jLabel75 = new javax.swing.JLabel();
        lbl_rutina = new javax.swing.JLabel();
        spanel_buscar = new javax.swing.JScrollPane();
        jPanel3 = new javax.swing.JPanel();
        jLabel65 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        txt_cedula = new javax.swing.JTextField();
        btn_buscar = new javax.swing.JButton();
        jLabel66 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        btn_eliminar = new javax.swing.JButton();
        txt_result_cedula = new javax.swing.JTextField();
        jLabel67 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        txt_nombres = new javax.swing.JTextField();
        txt_apellidos = new javax.swing.JTextField();
        jLabel18 = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        table_fichas = new javax.swing.JTable();
        jSeparator2 = new javax.swing.JSeparator();
        jSeparator3 = new javax.swing.JSeparator();
        jSeparator5 = new javax.swing.JSeparator();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        panelPrincipal.setBackground(new java.awt.Color(250, 250, 250));
        panelPrincipal.setForeground(new java.awt.Color(110, 110, 110));
        panelPrincipal.setFont(new java.awt.Font("Verdana", 0, 16)); // NOI18N

        spanel_nuevo.setBackground(new java.awt.Color(250, 250, 250));
        spanel_nuevo.setBorder(null);

        jPanel1.setBackground(new java.awt.Color(250, 250, 250));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel19.setFont(new java.awt.Font("Verdana", 0, 24)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(110, 110, 110));
        jLabel19.setText("Datos Corporales");
        jPanel1.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 80, -1, -1));

        jSeparator1.setBackground(new java.awt.Color(51, 204, 255));
        jPanel1.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 120, 490, 10));

        cbo_nivel.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        cbo_nivel.setForeground(new java.awt.Color(110, 110, 110));
        cbo_nivel.setToolTipText("");
        cbo_nivel.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jPanel1.add(cbo_nivel, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 150, 180, 40));

        jLabel21.setFont(new java.awt.Font("Verdana", 0, 16)); // NOI18N
        jLabel21.setForeground(new java.awt.Color(110, 110, 110));
        jLabel21.setText("Nivel:");
        jPanel1.add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 160, -1, -1));

        jLabel22.setFont(new java.awt.Font("Verdana", 0, 16)); // NOI18N
        jLabel22.setForeground(new java.awt.Color(110, 110, 110));
        jLabel22.setText("Peso Kg:");
        jPanel1.add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 220, -1, -1));

        txt_peso.setFont(new java.awt.Font("Verdana", 0, 16)); // NOI18N
        txt_peso.setForeground(new java.awt.Color(110, 110, 110));
        txt_peso.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(202, 202, 202), 1, true));
        txt_peso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_pesoActionPerformed(evt);
            }
        });
        txt_peso.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_pesoKeyTyped(evt);
            }
        });
        jPanel1.add(txt_peso, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 210, 350, 39));

        txt_altura.setFont(new java.awt.Font("Verdana", 0, 16)); // NOI18N
        txt_altura.setForeground(new java.awt.Color(110, 110, 110));
        txt_altura.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(202, 202, 202), 1, true));
        txt_altura.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_alturaKeyTyped(evt);
            }
        });
        jPanel1.add(txt_altura, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 270, 350, 39));

        jLabel23.setFont(new java.awt.Font("Verdana", 0, 16)); // NOI18N
        jLabel23.setForeground(new java.awt.Color(110, 110, 110));
        jLabel23.setText("Altura cm:");
        jPanel1.add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 280, -1, -1));

        jLabel24.setFont(new java.awt.Font("Verdana", 0, 16)); // NOI18N
        jLabel24.setForeground(new java.awt.Color(110, 110, 110));
        jLabel24.setText("Cintura cm:");
        jPanel1.add(jLabel24, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 330, 105, -1));

        txt_cintura.setFont(new java.awt.Font("Verdana", 0, 16)); // NOI18N
        txt_cintura.setForeground(new java.awt.Color(110, 110, 110));
        txt_cintura.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(202, 202, 202), 1, true));
        txt_cintura.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_cinturaKeyTyped(evt);
            }
        });
        jPanel1.add(txt_cintura, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 320, 350, 39));

        txt_cuello.setFont(new java.awt.Font("Verdana", 0, 16)); // NOI18N
        txt_cuello.setForeground(new java.awt.Color(110, 110, 110));
        txt_cuello.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(202, 202, 202), 1, true));
        txt_cuello.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_cuelloKeyTyped(evt);
            }
        });
        jPanel1.add(txt_cuello, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 380, 350, 39));

        jLabel52.setFont(new java.awt.Font("Verdana", 0, 16)); // NOI18N
        jLabel52.setForeground(new java.awt.Color(110, 110, 110));
        jLabel52.setText("Cuello cm:");
        jPanel1.add(jLabel52, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 390, -1, -1));

        jLabel53.setFont(new java.awt.Font("Verdana", 0, 16)); // NOI18N
        jLabel53.setForeground(new java.awt.Color(110, 110, 110));
        jLabel53.setText("Cadera cm:");
        jPanel1.add(jLabel53, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 440, 97, -1));

        txt_cadera.setFont(new java.awt.Font("Verdana", 0, 16)); // NOI18N
        txt_cadera.setForeground(new java.awt.Color(110, 110, 110));
        txt_cadera.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(202, 202, 202), 1, true));
        txt_cadera.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_caderaKeyTyped(evt);
            }
        });
        jPanel1.add(txt_cadera, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 430, 350, 39));

        btn_siguiente3.setBackground(new java.awt.Color(0, 153, 204));
        btn_siguiente3.setFont(new java.awt.Font("Verdana", 0, 16)); // NOI18N
        btn_siguiente3.setForeground(new java.awt.Color(255, 255, 255));
        btn_siguiente3.setText("Siguiente");
        btn_siguiente3.setBorder(null);
        btn_siguiente3.setBorderPainted(false);
        btn_siguiente3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel1.add(btn_siguiente3, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 530, 100, 40));

        btn_limpiar3.setBackground(new java.awt.Color(0, 153, 204));
        btn_limpiar3.setFont(new java.awt.Font("Verdana", 0, 16)); // NOI18N
        btn_limpiar3.setForeground(new java.awt.Color(255, 255, 255));
        btn_limpiar3.setText("Limpiar");
        btn_limpiar3.setBorder(null);
        btn_limpiar3.setBorderPainted(false);
        btn_limpiar3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel1.add(btn_limpiar3, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 530, 100, 40));

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

        spanel_nuevo.setViewportView(jPanel1);

        panelPrincipal.addTab("Nueva ficha", spanel_nuevo);

        spanel_final.setBackground(new java.awt.Color(250, 250, 250));
        spanel_final.setBorder(null);

        jPanel2.setBackground(new java.awt.Color(250, 250, 250));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel20.setFont(new java.awt.Font("Verdana", 1, 36)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(110, 110, 110));
        jLabel20.setText("Datos finales");
        jPanel2.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 50, -1, -1));

        btn_cancelar.setBackground(new java.awt.Color(0, 153, 204));
        btn_cancelar.setFont(new java.awt.Font("Verdana", 0, 16)); // NOI18N
        btn_cancelar.setForeground(new java.awt.Color(255, 255, 255));
        btn_cancelar.setText("Cancelar");
        btn_cancelar.setBorder(null);
        btn_cancelar.setBorderPainted(false);
        btn_cancelar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel2.add(btn_cancelar, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 950, 100, 40));

        btn_guardar.setBackground(new java.awt.Color(0, 153, 204));
        btn_guardar.setFont(new java.awt.Font("Verdana", 0, 16)); // NOI18N
        btn_guardar.setForeground(new java.awt.Color(255, 255, 255));
        btn_guardar.setText("Guardar");
        btn_guardar.setBorder(null);
        btn_guardar.setBorderPainted(false);
        btn_guardar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel2.add(btn_guardar, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 950, 100, 40));

        jLabel31.setFont(new java.awt.Font("Verdana", 0, 24)); // NOI18N
        jLabel31.setForeground(new java.awt.Color(51, 153, 255));
        jLabel31.setText("Datos Personales:");
        jPanel2.add(jLabel31, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 130, 220, -1));

        jSeparator19.setBackground(new java.awt.Color(0, 153, 255));
        jPanel2.add(jSeparator19, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 170, 640, 10));

        jLabel42.setFont(new java.awt.Font("Verdana", 0, 16)); // NOI18N
        jLabel42.setForeground(new java.awt.Color(110, 110, 110));
        jLabel42.setText("Cédula:");
        jPanel2.add(jLabel42, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 220, -1, -1));

        lbl_cedula.setFont(new java.awt.Font("Verdana", 0, 16)); // NOI18N
        lbl_cedula.setForeground(new java.awt.Color(0, 153, 255));
        lbl_cedula.setText("Datos");
        jPanel2.add(lbl_cedula, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 220, 190, -1));

        jLabel37.setFont(new java.awt.Font("Verdana", 0, 16)); // NOI18N
        jLabel37.setForeground(new java.awt.Color(110, 110, 110));
        jLabel37.setText("Altura:");
        jPanel2.add(jLabel37, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 220, -1, -1));

        lbl_altura.setFont(new java.awt.Font("Verdana", 0, 16)); // NOI18N
        lbl_altura.setForeground(new java.awt.Color(0, 153, 255));
        lbl_altura.setText("Datos");
        jPanel2.add(lbl_altura, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 220, 100, -1));

        lbl_cuello.setFont(new java.awt.Font("Verdana", 0, 16)); // NOI18N
        lbl_cuello.setForeground(new java.awt.Color(0, 153, 255));
        lbl_cuello.setText("Datos");
        jPanel2.add(lbl_cuello, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 260, 90, -1));

        jSeparator13.setBackground(new java.awt.Color(110, 110, 110));
        jPanel2.add(jSeparator13, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 250, 290, 10));

        jSeparator20.setBackground(new java.awt.Color(110, 110, 110));
        jPanel2.add(jSeparator20, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 250, 290, 10));

        lbl_nombre.setFont(new java.awt.Font("Verdana", 0, 16)); // NOI18N
        lbl_nombre.setForeground(new java.awt.Color(0, 153, 255));
        lbl_nombre.setText("Datos");
        jPanel2.add(lbl_nombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 260, 190, -1));

        jLabel27.setFont(new java.awt.Font("Verdana", 0, 16)); // NOI18N
        jLabel27.setForeground(new java.awt.Color(110, 110, 110));
        jLabel27.setText("Nombre:");
        jPanel2.add(jLabel27, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 260, -1, -1));

        jLabel39.setFont(new java.awt.Font("Verdana", 0, 16)); // NOI18N
        jLabel39.setForeground(new java.awt.Color(110, 110, 110));
        jLabel39.setText("Cuello:");
        jPanel2.add(jLabel39, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 260, -1, -1));

        jSeparator14.setBackground(new java.awt.Color(110, 110, 110));
        jPanel2.add(jSeparator14, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 290, 290, 10));

        jSeparator7.setBackground(new java.awt.Color(110, 110, 110));
        jPanel2.add(jSeparator7, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 290, 290, 10));

        lbl_apellidos.setFont(new java.awt.Font("Verdana", 0, 16)); // NOI18N
        lbl_apellidos.setForeground(new java.awt.Color(0, 153, 255));
        lbl_apellidos.setText("Datos");
        jPanel2.add(lbl_apellidos, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 300, 190, -1));

        jLabel28.setFont(new java.awt.Font("Verdana", 0, 16)); // NOI18N
        jLabel28.setForeground(new java.awt.Color(110, 110, 110));
        jLabel28.setText("Apellido:");
        jPanel2.add(jLabel28, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 300, -1, -1));

        jLabel41.setFont(new java.awt.Font("Verdana", 0, 16)); // NOI18N
        jLabel41.setForeground(new java.awt.Color(110, 110, 110));
        jLabel41.setText("Cintura:");
        jPanel2.add(jLabel41, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 300, -1, -1));

        lbl_cintura.setFont(new java.awt.Font("Verdana", 0, 16)); // NOI18N
        lbl_cintura.setForeground(new java.awt.Color(0, 153, 255));
        lbl_cintura.setText("Datos");
        jPanel2.add(lbl_cintura, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 300, 90, -1));

        jSeparator15.setBackground(new java.awt.Color(110, 110, 110));
        jPanel2.add(jSeparator15, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 330, 290, 10));

        lbl_imc.setFont(new java.awt.Font("Verdana", 0, 16)); // NOI18N
        lbl_imc.setForeground(new java.awt.Color(0, 153, 255));
        lbl_imc.setText("Datos");
        jPanel2.add(lbl_imc, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 340, 90, -1));

        jLabel34.setFont(new java.awt.Font("Verdana", 0, 16)); // NOI18N
        jLabel34.setForeground(new java.awt.Color(110, 110, 110));
        jLabel34.setText("IMC:");
        jPanel2.add(jLabel34, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 340, -1, -1));

        jSeparator8.setBackground(new java.awt.Color(110, 110, 110));
        jPanel2.add(jSeparator8, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 330, 290, 10));

        lbl_dir.setFont(new java.awt.Font("Verdana", 0, 16)); // NOI18N
        lbl_dir.setForeground(new java.awt.Color(0, 153, 255));
        lbl_dir.setText("Datos");
        jPanel2.add(lbl_dir, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 340, 210, 20));

        jLabel29.setFont(new java.awt.Font("Verdana", 0, 16)); // NOI18N
        jLabel29.setForeground(new java.awt.Color(110, 110, 110));
        jLabel29.setText("Dirección:");
        jPanel2.add(jLabel29, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 340, -1, -1));

        jLabel30.setFont(new java.awt.Font("Verdana", 0, 16)); // NOI18N
        jLabel30.setForeground(new java.awt.Color(110, 110, 110));
        jLabel30.setText("Fecha nac:");
        jPanel2.add(jLabel30, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 380, -1, -1));

        lbl_edad.setFont(new java.awt.Font("Verdana", 0, 16)); // NOI18N
        lbl_edad.setForeground(new java.awt.Color(0, 153, 255));
        lbl_edad.setText("Datos");
        jPanel2.add(lbl_edad, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 380, 190, -1));

        jSeparator9.setBackground(new java.awt.Color(110, 110, 110));
        jPanel2.add(jSeparator9, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 370, 290, 10));

        jSeparator16.setBackground(new java.awt.Color(110, 110, 110));
        jPanel2.add(jSeparator16, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 370, 290, 10));

        jLabel35.setFont(new java.awt.Font("Verdana", 0, 16)); // NOI18N
        jLabel35.setForeground(new java.awt.Color(110, 110, 110));
        jLabel35.setText("indice de Cintura/Altura:");
        jPanel2.add(jLabel35, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 380, -1, -1));

        lbl_imc_altura.setFont(new java.awt.Font("Verdana", 0, 16)); // NOI18N
        lbl_imc_altura.setForeground(new java.awt.Color(0, 153, 255));
        lbl_imc_altura.setText("Datos");
        jPanel2.add(lbl_imc_altura, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 380, 90, -1));

        jSeparator10.setBackground(new java.awt.Color(110, 110, 110));
        jPanel2.add(jSeparator10, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 410, 290, 10));

        jSeparator17.setBackground(new java.awt.Color(110, 110, 110));
        jPanel2.add(jSeparator17, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 410, 290, 10));

        jLabel44.setFont(new java.awt.Font("Verdana", 0, 16)); // NOI18N
        jLabel44.setForeground(new java.awt.Color(110, 110, 110));
        jLabel44.setText("Telefono:");
        jPanel2.add(jLabel44, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 420, -1, -1));

        lbl_telefono.setFont(new java.awt.Font("Verdana", 0, 16)); // NOI18N
        lbl_telefono.setForeground(new java.awt.Color(0, 153, 255));
        lbl_telefono.setText("Datos");
        jPanel2.add(lbl_telefono, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 420, 170, -1));

        jLabel32.setFont(new java.awt.Font("Verdana", 0, 16)); // NOI18N
        jLabel32.setForeground(new java.awt.Color(110, 110, 110));
        jLabel32.setText("Masa corporal magra:");
        jPanel2.add(jLabel32, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 420, -1, -1));

        lbl_masa_magra.setFont(new java.awt.Font("Verdana", 0, 16)); // NOI18N
        lbl_masa_magra.setForeground(new java.awt.Color(0, 153, 255));
        lbl_masa_magra.setText("Datos");
        jPanel2.add(lbl_masa_magra, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 420, 100, -1));

        jSeparator29.setBackground(new java.awt.Color(110, 110, 110));
        jPanel2.add(jSeparator29, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 450, 290, 10));

        jSeparator18.setBackground(new java.awt.Color(110, 110, 110));
        jPanel2.add(jSeparator18, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 450, 290, 20));

        jLabel43.setFont(new java.awt.Font("Verdana", 0, 16)); // NOI18N
        jLabel43.setForeground(new java.awt.Color(110, 110, 110));
        jLabel43.setText("Grasa corporal:");
        jPanel2.add(jLabel43, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 460, -1, -1));

        lbl_grasa.setFont(new java.awt.Font("Verdana", 0, 16)); // NOI18N
        lbl_grasa.setForeground(new java.awt.Color(0, 153, 255));
        lbl_grasa.setText("Datos");
        jPanel2.add(lbl_grasa, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 460, 120, -1));

        jLabel45.setFont(new java.awt.Font("Verdana", 0, 16)); // NOI18N
        jLabel45.setForeground(new java.awt.Color(110, 110, 110));
        jLabel45.setText("Celular:");
        jPanel2.add(jLabel45, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 460, -1, -1));

        lbl_celular.setFont(new java.awt.Font("Verdana", 0, 16)); // NOI18N
        lbl_celular.setForeground(new java.awt.Color(0, 153, 255));
        lbl_celular.setText("datos");
        jPanel2.add(lbl_celular, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 460, 190, -1));

        jSeparator26.setBackground(new java.awt.Color(110, 110, 110));
        jPanel2.add(jSeparator26, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 490, 290, 10));

        jLabel33.setFont(new java.awt.Font("Verdana", 0, 16)); // NOI18N
        jLabel33.setForeground(new java.awt.Color(110, 110, 110));
        jLabel33.setText("Peso");
        jPanel2.add(jLabel33, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 500, -1, -1));

        lbl_peso.setFont(new java.awt.Font("Verdana", 0, 16)); // NOI18N
        lbl_peso.setForeground(new java.awt.Color(0, 153, 255));
        lbl_peso.setText("Datos");
        jPanel2.add(lbl_peso, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 500, 190, -1));

        jLabel36.setFont(new java.awt.Font("Verdana", 0, 16)); // NOI18N
        jLabel36.setForeground(new java.awt.Color(110, 110, 110));
        jLabel36.setText("Sobrepeso");
        jPanel2.add(jLabel36, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 500, -1, -1));

        jSeparator12.setBackground(new java.awt.Color(110, 110, 110));
        jPanel2.add(jSeparator12, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 490, 290, 10));

        lbl_sobrepeso.setFont(new java.awt.Font("Verdana", 0, 16)); // NOI18N
        lbl_sobrepeso.setForeground(new java.awt.Color(0, 153, 255));
        lbl_sobrepeso.setText("Datos");
        jPanel2.add(lbl_sobrepeso, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 500, 120, -1));

        jSeparator6.setBackground(new java.awt.Color(110, 110, 110));
        jPanel2.add(jSeparator6, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 530, 290, 10));

        jLabel38.setFont(new java.awt.Font("Verdana", 0, 16)); // NOI18N
        jLabel38.setForeground(new java.awt.Color(110, 110, 110));
        jLabel38.setText("Sexo");
        jPanel2.add(jLabel38, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 540, -1, -1));

        lbl_sexo.setFont(new java.awt.Font("Verdana", 0, 16)); // NOI18N
        lbl_sexo.setForeground(new java.awt.Color(0, 153, 255));
        lbl_sexo.setText("Datos");
        jPanel2.add(lbl_sexo, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 540, 190, -1));

        jSeparator11.setBackground(new java.awt.Color(110, 110, 110));
        jPanel2.add(jSeparator11, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 570, 290, 10));

        jLabel40.setFont(new java.awt.Font("Verdana", 0, 16)); // NOI18N
        jLabel40.setForeground(new java.awt.Color(110, 110, 110));
        jLabel40.setText("Cadera:");
        jPanel2.add(jLabel40, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 580, -1, -1));

        lbl_result_cadera.setFont(new java.awt.Font("Verdana", 0, 16)); // NOI18N
        lbl_result_cadera.setForeground(new java.awt.Color(0, 153, 255));
        lbl_result_cadera.setText("Datos");
        jPanel2.add(lbl_result_cadera, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 580, 90, -1));

        jLabel25.setBackground(new java.awt.Color(0, 153, 255));
        jLabel25.setFont(new java.awt.Font("Verdana", 0, 24)); // NOI18N
        jLabel25.setForeground(new java.awt.Color(51, 153, 255));
        jLabel25.setText("Datos de Membresia:");
        jPanel2.add(jLabel25, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 650, 260, -1));

        jLabel64.setFont(new java.awt.Font("Verdana", 0, 16)); // NOI18N
        jLabel64.setForeground(new java.awt.Color(110, 110, 110));
        jLabel64.setText("Tipo");
        jPanel2.add(jLabel64, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 710, -1, -1));

        lbl_tipo_membresia.setFont(new java.awt.Font("Verdana", 0, 16)); // NOI18N
        lbl_tipo_membresia.setForeground(new java.awt.Color(0, 153, 255));
        lbl_tipo_membresia.setText("Datos");
        jPanel2.add(lbl_tipo_membresia, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 710, 130, -1));

        jSeparator21.setBackground(new java.awt.Color(0, 153, 255));
        jPanel2.add(jSeparator21, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 690, 290, 10));

        jLabel69.setBackground(new java.awt.Color(0, 153, 255));
        jLabel69.setFont(new java.awt.Font("Verdana", 0, 24)); // NOI18N
        jLabel69.setForeground(new java.awt.Color(51, 153, 255));
        jLabel69.setText("Datos de Pago:");
        jPanel2.add(jLabel69, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 650, 260, 30));

        jLabel68.setFont(new java.awt.Font("Verdana", 0, 16)); // NOI18N
        jLabel68.setForeground(new java.awt.Color(110, 110, 110));
        jLabel68.setText("Costo:");
        jPanel2.add(jLabel68, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 710, -1, 20));

        lbl_costo.setFont(new java.awt.Font("Verdana", 0, 16)); // NOI18N
        lbl_costo.setForeground(new java.awt.Color(0, 153, 255));
        lbl_costo.setText("Datos");
        jPanel2.add(lbl_costo, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 710, 190, 20));

        jSeparator25.setBackground(new java.awt.Color(0, 153, 255));
        jPanel2.add(jSeparator25, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 690, 280, 10));

        jLabel79.setFont(new java.awt.Font("Verdana", 0, 16)); // NOI18N
        jLabel79.setForeground(new java.awt.Color(110, 110, 110));
        jLabel79.setText("Total:");
        jPanel2.add(jLabel79, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 750, -1, 20));

        lbl_total.setFont(new java.awt.Font("Verdana", 0, 16)); // NOI18N
        lbl_total.setForeground(new java.awt.Color(0, 153, 255));
        lbl_total.setText("Datos");
        jPanel2.add(lbl_total, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 750, 190, 20));

        jSeparator27.setBackground(new java.awt.Color(110, 110, 110));
        jPanel2.add(jSeparator27, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 740, 280, 10));

        jSeparator22.setBackground(new java.awt.Color(110, 110, 110));
        jPanel2.add(jSeparator22, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 740, 280, 10));

        lbl_fecha_pago.setFont(new java.awt.Font("Verdana", 0, 16)); // NOI18N
        lbl_fecha_pago.setForeground(new java.awt.Color(0, 153, 255));
        lbl_fecha_pago.setText("Datos");
        jPanel2.add(lbl_fecha_pago, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 750, 130, 30));

        jLabel74.setFont(new java.awt.Font("Verdana", 0, 16)); // NOI18N
        jLabel74.setForeground(new java.awt.Color(110, 110, 110));
        jLabel74.setText("Fecha de pago:");
        jPanel2.add(jLabel74, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 750, -1, 30));

        jSeparator23.setBackground(new java.awt.Color(110, 110, 110));
        jPanel2.add(jSeparator23, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 780, 280, 10));

        jLabel70.setFont(new java.awt.Font("Verdana", 0, 16)); // NOI18N
        jLabel70.setForeground(new java.awt.Color(110, 110, 110));
        jLabel70.setText("Próximo pago:");
        jPanel2.add(jLabel70, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 790, -1, 30));

        lbl_prox_pago.setFont(new java.awt.Font("Verdana", 0, 16)); // NOI18N
        lbl_prox_pago.setForeground(new java.awt.Color(0, 153, 255));
        lbl_prox_pago.setText("Datos");
        jPanel2.add(lbl_prox_pago, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 790, 130, 30));

        jSeparator24.setBackground(new java.awt.Color(110, 110, 110));
        jPanel2.add(jSeparator24, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 820, 280, 10));

        lbl_nivel.setFont(new java.awt.Font("Verdana", 0, 16)); // NOI18N
        lbl_nivel.setForeground(new java.awt.Color(0, 153, 255));
        lbl_nivel.setText("Datos");
        jPanel2.add(lbl_nivel, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 840, 120, -1));

        jLabel54.setFont(new java.awt.Font("Verdana", 0, 16)); // NOI18N
        jLabel54.setForeground(new java.awt.Color(110, 110, 110));
        jLabel54.setText("Nivel:");
        jPanel2.add(jLabel54, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 840, -1, -1));

        jSeparator28.setBackground(new java.awt.Color(110, 110, 110));
        jPanel2.add(jSeparator28, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 870, 280, 10));

        jLabel75.setFont(new java.awt.Font("Verdana", 0, 16)); // NOI18N
        jLabel75.setForeground(new java.awt.Color(110, 110, 110));
        jLabel75.setText("Rutina:");
        jPanel2.add(jLabel75, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 880, -1, -1));

        lbl_rutina.setFont(new java.awt.Font("Verdana", 0, 16)); // NOI18N
        lbl_rutina.setForeground(new java.awt.Color(0, 153, 255));
        lbl_rutina.setText("Datos");
        jPanel2.add(lbl_rutina, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 880, 120, -1));

        spanel_final.setViewportView(jPanel2);

        panelPrincipal.addTab("Detallles de fichas", spanel_final);

        spanel_buscar.setBackground(new java.awt.Color(250, 250, 250));
        spanel_buscar.setBorder(null);

        jPanel3.setBackground(new java.awt.Color(250, 250, 250));
        jPanel3.setPreferredSize(new java.awt.Dimension(800, 977));

        jLabel65.setFont(new java.awt.Font("Verdana", 0, 24)); // NOI18N
        jLabel65.setForeground(new java.awt.Color(110, 110, 110));
        jLabel65.setText("Buscar  fichas de clientes");

        jLabel13.setFont(new java.awt.Font("Verdana", 0, 16)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(110, 110, 110));
        jLabel13.setText("Cédula:");

        txt_cedula.setFont(new java.awt.Font("Verdana", 0, 16)); // NOI18N
        txt_cedula.setForeground(new java.awt.Color(110, 110, 110));
        txt_cedula.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(202, 202, 202), 1, true));

        btn_buscar.setBackground(new java.awt.Color(0, 153, 204));
        btn_buscar.setFont(new java.awt.Font("Verdana", 0, 16)); // NOI18N
        btn_buscar.setForeground(new java.awt.Color(255, 255, 255));
        btn_buscar.setText("Buscar");
        btn_buscar.setBorder(null);
        btn_buscar.setBorderPainted(false);
        btn_buscar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_buscar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        jLabel66.setFont(new java.awt.Font("Verdana", 0, 24)); // NOI18N
        jLabel66.setForeground(new java.awt.Color(110, 110, 110));
        jLabel66.setText("Resultados de búsqueda");

        jLabel16.setFont(new java.awt.Font("Verdana", 0, 16)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(110, 110, 110));
        jLabel16.setText("Acciones:");

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

        txt_result_cedula.setBackground(new java.awt.Color(197, 230, 197));
        txt_result_cedula.setFont(new java.awt.Font("Verdana", 0, 16)); // NOI18N
        txt_result_cedula.setForeground(new java.awt.Color(110, 110, 110));
        txt_result_cedula.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(162, 214, 162), 1, true));

        jLabel67.setFont(new java.awt.Font("Verdana", 0, 16)); // NOI18N
        jLabel67.setForeground(new java.awt.Color(110, 110, 110));
        jLabel67.setText("Cédula:");

        jLabel17.setFont(new java.awt.Font("Verdana", 0, 16)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(110, 110, 110));
        jLabel17.setText("Nombres:");

        txt_nombres.setBackground(new java.awt.Color(197, 230, 197));
        txt_nombres.setFont(new java.awt.Font("Verdana", 0, 16)); // NOI18N
        txt_nombres.setForeground(new java.awt.Color(110, 110, 110));
        txt_nombres.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(162, 214, 162), 1, true));

        txt_apellidos.setBackground(new java.awt.Color(197, 230, 197));
        txt_apellidos.setFont(new java.awt.Font("Verdana", 0, 16)); // NOI18N
        txt_apellidos.setForeground(new java.awt.Color(110, 110, 110));
        txt_apellidos.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(162, 214, 162), 1, true));

        jLabel18.setFont(new java.awt.Font("Verdana", 0, 16)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(110, 110, 110));
        jLabel18.setText("Apellidos:");

        table_fichas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane4.setViewportView(table_fichas);

        jSeparator2.setBackground(new java.awt.Color(51, 204, 255));

        jSeparator3.setBackground(new java.awt.Color(51, 204, 255));

        jSeparator5.setBackground(new java.awt.Color(51, 204, 255));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 664, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGap(235, 235, 235)
                                .addComponent(jLabel13)
                                .addGap(7, 7, 7)
                                .addComponent(txt_cedula, javax.swing.GroupLayout.PREFERRED_SIZE, 242, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(8, 8, 8)
                                .addComponent(btn_buscar, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGap(293, 293, 293)
                                .addComponent(jLabel65, javax.swing.GroupLayout.PREFERRED_SIZE, 343, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGap(251, 251, 251)
                                .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btn_eliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGap(315, 315, 315)
                                .addComponent(jLabel66, javax.swing.GroupLayout.PREFERRED_SIZE, 310, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGap(118, 118, 118)
                                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 673, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(177, 177, 177)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGap(115, 115, 115)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txt_result_cedula, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 431, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txt_nombres, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 431, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txt_apellidos, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 431, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(jLabel67)
                            .addComponent(jLabel17)
                            .addComponent(jLabel18))))
                .addContainerGap(606, Short.MAX_VALUE))
            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel3Layout.createSequentialGroup()
                    .addGap(210, 210, 210)
                    .addComponent(jSeparator3, javax.swing.GroupLayout.DEFAULT_SIZE, 1, Short.MAX_VALUE)
                    .addGap(1186, 1186, 1186)))
            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel3Layout.createSequentialGroup()
                    .addGap(128, 128, 128)
                    .addComponent(jSeparator5, javax.swing.GroupLayout.PREFERRED_SIZE, 673, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(596, Short.MAX_VALUE)))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addComponent(jLabel65)
                .addGap(12, 12, 12)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jLabel13))
                    .addComponent(txt_cedula, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_buscar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(62, 62, 62)
                .addComponent(jLabel66)
                .addGap(34, 34, 34)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel16)
                    .addComponent(btn_eliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(64, 64, 64)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel67)
                    .addComponent(txt_result_cedula, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(19, 19, 19)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel17)
                    .addComponent(txt_nombres, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel18)
                    .addComponent(txt_apellidos, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(49, 49, 49)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(181, Short.MAX_VALUE))
            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel3Layout.createSequentialGroup()
                    .addGap(93, 93, 93)
                    .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(887, Short.MAX_VALUE)))
            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel3Layout.createSequentialGroup()
                    .addGap(358, 358, 358)
                    .addComponent(jSeparator5, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(610, Short.MAX_VALUE)))
        );

        spanel_buscar.setViewportView(jPanel3);

        panelPrincipal.addTab("Buscar fichas", spanel_buscar);

        getContentPane().add(panelPrincipal, java.awt.BorderLayout.PAGE_START);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    
    
    
/*---------------------------------------------------------
    $metodo para volver al menu home
 ----------------------------------------------------------*/ 
    private void btn_cancelar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_cancelar1ActionPerformed
        Home frm_home = new Home();
        frm_home.setVisible(true);
        dispose();
    }//GEN-LAST:event_btn_cancelar1ActionPerformed

    private void btn_eliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_eliminarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_eliminarActionPerformed

    private void txt_pesoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_pesoActionPerformed
        
    }//GEN-LAST:event_txt_pesoActionPerformed

    private void txt_pesoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_pesoKeyTyped
        Validar.soloNumeros(evt);
    }//GEN-LAST:event_txt_pesoKeyTyped

    private void txt_alturaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_alturaKeyTyped
            Validar.soloNumeros(evt);
    }//GEN-LAST:event_txt_alturaKeyTyped

    private void txt_cinturaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_cinturaKeyTyped
        Validar.soloNumeros(evt);
    }//GEN-LAST:event_txt_cinturaKeyTyped

    private void txt_cuelloKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_cuelloKeyTyped
                Validar.soloNumeros(evt);
    }//GEN-LAST:event_txt_cuelloKeyTyped

    private void txt_caderaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_caderaKeyTyped
         Validar.soloNumeros(evt);
    }//GEN-LAST:event_txt_caderaKeyTyped

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
     

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Form_ficha().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_buscar;
    private javax.swing.JButton btn_cancelar;
    private javax.swing.JButton btn_cancelar1;
    private javax.swing.JButton btn_eliminar;
    private javax.swing.JButton btn_guardar;
    private javax.swing.JButton btn_limpiar3;
    private javax.swing.JButton btn_siguiente3;
    private javax.swing.JComboBox cbo_nivel;
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
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel38;
    private javax.swing.JLabel jLabel39;
    private javax.swing.JLabel jLabel40;
    private javax.swing.JLabel jLabel41;
    private javax.swing.JLabel jLabel42;
    private javax.swing.JLabel jLabel43;
    private javax.swing.JLabel jLabel44;
    private javax.swing.JLabel jLabel45;
    private javax.swing.JLabel jLabel52;
    private javax.swing.JLabel jLabel53;
    private javax.swing.JLabel jLabel54;
    private javax.swing.JLabel jLabel64;
    private javax.swing.JLabel jLabel65;
    private javax.swing.JLabel jLabel66;
    private javax.swing.JLabel jLabel67;
    private javax.swing.JLabel jLabel68;
    private javax.swing.JLabel jLabel69;
    private javax.swing.JLabel jLabel70;
    private javax.swing.JLabel jLabel74;
    private javax.swing.JLabel jLabel75;
    private javax.swing.JLabel jLabel79;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator10;
    private javax.swing.JSeparator jSeparator11;
    private javax.swing.JSeparator jSeparator12;
    private javax.swing.JSeparator jSeparator13;
    private javax.swing.JSeparator jSeparator14;
    private javax.swing.JSeparator jSeparator15;
    private javax.swing.JSeparator jSeparator16;
    private javax.swing.JSeparator jSeparator17;
    private javax.swing.JSeparator jSeparator18;
    private javax.swing.JSeparator jSeparator19;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator20;
    private javax.swing.JSeparator jSeparator21;
    private javax.swing.JSeparator jSeparator22;
    private javax.swing.JSeparator jSeparator23;
    private javax.swing.JSeparator jSeparator24;
    private javax.swing.JSeparator jSeparator25;
    private javax.swing.JSeparator jSeparator26;
    private javax.swing.JSeparator jSeparator27;
    private javax.swing.JSeparator jSeparator28;
    private javax.swing.JSeparator jSeparator29;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JSeparator jSeparator6;
    private javax.swing.JSeparator jSeparator7;
    private javax.swing.JSeparator jSeparator8;
    private javax.swing.JSeparator jSeparator9;
    private javax.swing.JLabel lbl_altura;
    private javax.swing.JLabel lbl_apellidos;
    private javax.swing.JLabel lbl_cedula;
    private javax.swing.JLabel lbl_celular;
    private javax.swing.JLabel lbl_cintura;
    private javax.swing.JLabel lbl_costo;
    private javax.swing.JLabel lbl_cuello;
    private javax.swing.JLabel lbl_dir;
    private javax.swing.JLabel lbl_edad;
    private javax.swing.JLabel lbl_fecha_pago;
    private javax.swing.JLabel lbl_grasa;
    private javax.swing.JLabel lbl_imc;
    private javax.swing.JLabel lbl_imc_altura;
    private javax.swing.JLabel lbl_masa_magra;
    private javax.swing.JLabel lbl_nivel;
    private javax.swing.JLabel lbl_nombre;
    private javax.swing.JLabel lbl_peso;
    private javax.swing.JLabel lbl_prox_pago;
    private javax.swing.JLabel lbl_result_cadera;
    private javax.swing.JLabel lbl_rutina;
    private javax.swing.JLabel lbl_sexo;
    private javax.swing.JLabel lbl_sobrepeso;
    private javax.swing.JLabel lbl_telefono;
    private javax.swing.JLabel lbl_tipo_membresia;
    private javax.swing.JLabel lbl_total;
    private javax.swing.JTabbedPane panelPrincipal;
    private javax.swing.JScrollPane spanel_buscar;
    private javax.swing.JScrollPane spanel_final;
    private javax.swing.JScrollPane spanel_nuevo;
    private javax.swing.JTable table_fichas;
    private javax.swing.JTextField txt_altura;
    private javax.swing.JTextField txt_apellidos;
    private javax.swing.JTextField txt_cadera;
    private javax.swing.JTextField txt_cedula;
    private javax.swing.JTextField txt_cintura;
    private javax.swing.JTextField txt_cuello;
    private javax.swing.JTextField txt_nombres;
    private javax.swing.JTextField txt_peso;
    private javax.swing.JTextField txt_result_cedula;
    // End of variables declaration//GEN-END:variables
}
