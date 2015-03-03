package forms;
import Mysql.Conexion;
import general.Cliente;
import general.Ficha;
import general.Rutina;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import validaciones.Validar;

public class Form_ficha extends javax.swing.JFrame {
    
    
     //Hacemos las conexion 
    public Conexion cn = new Conexion();//instanciamos nuestra clase conexion
    public Connection conexion = cn.getConexion();
    private  ResultSet rs;
    private PreparedStatement ps;
    private String sql;
     Cliente cliente  = new Cliente();
    private Ficha ficha = new Ficha();
    private Rutina rutinas = new Rutina();
    
     
    
     
        
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
          txt_cedula.setDocument(new Validar(txt_cedula,10));
          txt_peso.setDocument(new Validar(txt_peso,3));
          txt_altura.setDocument(new Validar(txt_altura,3));
          txt_cintura.setDocument(new Validar(txt_cintura,3));
          txt_cuello.setDocument(new Validar(txt_cuello,2));
          txt_cadera.setDocument(new Validar(txt_cadera,3));
          txt_cedula_buscar.setDocument(new Validar( txt_cedula_buscar,10));
        
        //para cargar rutinas
        cargarRutinas();
        cargarFichas();
        
        //para esconder los demas paneles
             this.panelPrincipal.setEnabledAt(1,false);
             
        //para esconder el label cadera y la ceja de texta
          lbl_cadera1.setVisible(false);
          txt_cadera.setVisible(false);
          txt_cedula_buscar.setEditable(false);
          btn_buscar.setEnabled(false);
             
  
    }
    
 
 /*-----------------------------------------------------------------------------------------------------------
        $metodo para limpiar
 ------------------------------------------------------------------------------------------------------------*/ 
    public void limpiarFicha(){
        txt_cedula.setText("");
        txt_peso.setText("");
        txt_altura.setText("");
        txt_cintura.setText("");
        txt_cuello.setText("");
        txt_cadera.setText("");
    
    }

    
    
    
/*-----------------------------------------------------------------------------------------------------------
        $cagar tablas de las fichas que existen de los clientes
 ------------------------------------------------------------------------------------------------------------*/ 
public void cargarFichas(){
    
    String[] titulos = {"ID ficha","Cedula","Nombre","Apellidos","Nivel","Peso kg","Cintura","Cadera","% Grasa Corp","% IMC","% IMC Cintura/Altura",
        "Masa Magra","Sobrepso"};
    
    String registros[] =  new String[13];
    
    DefaultTableModel modelo = new DefaultTableModel(null,titulos);
    
        try{
            
            sql = "select * from vista_fichas\n" +
            "order by id_ficha desc";
            
            ps = conexion.prepareStatement(sql);
            
            rs = ps.executeQuery();
            
            while(rs.next()){
                
                registros[0] = String.valueOf(rs.getInt(1));
                registros[1] = String.valueOf(rs.getInt(2));
                registros[2] = rs.getString(3);
                registros[3] = rs.getString(4);
                registros[4] = rs.getString(5);
                registros[5] = String.valueOf(rs.getFloat(6));
                registros[6] = String.valueOf(rs.getFloat(7));
                registros[7] = String.valueOf(rs.getFloat(8));
                registros[8] = String.valueOf(rs.getFloat(9));
                registros[9] = String.valueOf(rs.getFloat(10));
                registros[10] = String.valueOf(rs.getFloat(11));
                registros[11] = String.valueOf(rs.getFloat(12));
                registros[12] = String.valueOf(rs.getFloat(13));
                    
                modelo.addRow(registros);
            
            }
            tabla_fichas.setModel(modelo);
            
            
        }catch(Exception ex){
           JOptionPane.showMessageDialog(rootPane, ex.getMessage());
        }  

    

}
    
    
    
    /*metodos sopbrecargdo de fichas*/
/*-----------------------------------------------------------------------------------------------------------
        $cagar tablas de las fichas que existen de los clientes sobrecargado
 ------------------------------------------------------------------------------------------------------------*/ 
public void cargarFichas(int valor){
    
    String[] titulos = {"ID ficha","Cedula","Nombre","Apellidos","Nivel","Peso kg","Cintura","Cadera","% Grasa Corp","% IMC","% IMC Cintura/Altura",
        "Masa Magra","Sobrepso"};
    
    String registros[] =  new String[13];
    
    DefaultTableModel modelo = new DefaultTableModel(null,titulos);
    
        try{
            
            sql = "select * from vista_fichas\n" +
            "where cedula  = "+valor+"  order by id_ficha desc ";
            
            ps = conexion.prepareStatement(sql);
            
            rs = ps.executeQuery();
            
            while(rs.next()){
                
                registros[0] = String.valueOf(rs.getInt(1));
                registros[1] = String.valueOf(rs.getInt(2));
                registros[2] = rs.getString(3);
                registros[3] = rs.getString(4);
                registros[4] = rs.getString(5);
                registros[5] = String.valueOf(rs.getFloat(6));
                registros[6] = String.valueOf(rs.getFloat(7));
                registros[7] = String.valueOf(rs.getFloat(8));
                registros[8] = String.valueOf(rs.getFloat(9));
                registros[9] = String.valueOf(rs.getFloat(10));
                registros[10] = String.valueOf(rs.getFloat(11));
                registros[11] = String.valueOf(rs.getFloat(12));
                registros[12] = String.valueOf(rs.getFloat(13));
                    
                modelo.addRow(registros);
            
            }
            tabla_fichas.setModel(modelo);
            
            
        }catch(Exception ex){
           JOptionPane.showMessageDialog(rootPane, ex.getMessage());
        }  

}




   /*metodos sopbrecargdo de fichas*/
public void cargarFichas(String valor){
    
    String[] titulos = {"ID ficha","Cedula","Nombre","Apellidos","Nivel","Peso kg","Cintura","Cadera","% Grasa Corp","% IMC","% IMC Cintura/Altura",
        "Masa Magra","Sobrepso"};
    
    String registros[] =  new String[13];
    
    DefaultTableModel modelo = new DefaultTableModel(null,titulos);
    
        try{
            
            sql = "select * from vista_fichas\n" +
            " where nombres like '"+valor+"%' or apellidos like '"+valor+"%' order by id_ficha desc";
            
            ps = conexion.prepareStatement(sql);
            
            rs = ps.executeQuery();
            
            while(rs.next()){
                
                registros[0] = String.valueOf(rs.getInt(1));
                registros[1] = String.valueOf(rs.getInt(2));
                registros[2] = rs.getString(3);
                registros[3] = rs.getString(4);
                registros[4] = rs.getString(5);
                registros[5] = String.valueOf(rs.getFloat(6));
                registros[6] = String.valueOf(rs.getFloat(7));
                registros[7] = String.valueOf(rs.getFloat(8));
                registros[8] = String.valueOf(rs.getFloat(9));
                registros[9] = String.valueOf(rs.getFloat(10));
                registros[10] = String.valueOf(rs.getFloat(11));
                registros[11] = String.valueOf(rs.getFloat(12));
                registros[12] = String.valueOf(rs.getFloat(13));
                    
                modelo.addRow(registros);
            
            }
            tabla_fichas.setModel(modelo);
            
            
        }catch(Exception ex){
           JOptionPane.showMessageDialog(rootPane, ex.getMessage());
        }  

    

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

        buttonGroup1 = new javax.swing.ButtonGroup();
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
        lbl_cadera1 = new javax.swing.JLabel();
        txt_cadera = new javax.swing.JTextField();
        btn_siguiente3 = new javax.swing.JButton();
        btn_limpiar3 = new javax.swing.JButton();
        btn_cancelar1 = new javax.swing.JButton();
        jLabel14 = new javax.swing.JLabel();
        txt_cedula = new javax.swing.JTextField();
        spanel_final = new javax.swing.JScrollPane();
        jPanel2 = new javax.swing.JPanel();
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
        jSeparator16 = new javax.swing.JSeparator();
        jLabel35 = new javax.swing.JLabel();
        lbl_imc_altura = new javax.swing.JLabel();
        jSeparator17 = new javax.swing.JSeparator();
        jLabel32 = new javax.swing.JLabel();
        lbl_masa_magra = new javax.swing.JLabel();
        jSeparator18 = new javax.swing.JSeparator();
        jLabel43 = new javax.swing.JLabel();
        lbl_grasa = new javax.swing.JLabel();
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
        lbl_nivel = new javax.swing.JLabel();
        jLabel54 = new javax.swing.JLabel();
        jSeparator28 = new javax.swing.JSeparator();
        jLabel75 = new javax.swing.JLabel();
        lbl_rutina = new javax.swing.JLabel();
        jSeparator30 = new javax.swing.JSeparator();
        spanel_buscar = new javax.swing.JScrollPane();
        jPanel3 = new javax.swing.JPanel();
        jLabel65 = new javax.swing.JLabel();
        lbl_buscar = new javax.swing.JLabel();
        txt_cedula_buscar = new javax.swing.JTextField();
        btn_buscar = new javax.swing.JButton();
        jLabel66 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        btn_eliminar = new javax.swing.JButton();
        jScrollPane4 = new javax.swing.JScrollPane();
        tabla_fichas = new javax.swing.JTable();
        jSeparator2 = new javax.swing.JSeparator();
        jSeparator3 = new javax.swing.JSeparator();
        jSeparator5 = new javax.swing.JSeparator();
        cbo_buscar = new javax.swing.JComboBox();

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
        jPanel1.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 40, -1, -1));

        jSeparator1.setBackground(new java.awt.Color(51, 204, 255));
        jPanel1.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 100, 490, 10));

        cbo_nivel.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        cbo_nivel.setForeground(new java.awt.Color(110, 110, 110));
        cbo_nivel.setToolTipText("");
        cbo_nivel.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jPanel1.add(cbo_nivel, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 180, 150, 30));

        jLabel21.setFont(new java.awt.Font("Verdana", 0, 16)); // NOI18N
        jLabel21.setForeground(new java.awt.Color(110, 110, 110));
        jLabel21.setText("Nivel:");
        jPanel1.add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 180, -1, 30));

        jLabel22.setFont(new java.awt.Font("Verdana", 0, 16)); // NOI18N
        jLabel22.setForeground(new java.awt.Color(110, 110, 110));
        jLabel22.setText("Peso Kg:");
        jPanel1.add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 230, -1, 30));

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
        jPanel1.add(txt_peso, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 230, 310, 30));

        txt_altura.setFont(new java.awt.Font("Verdana", 0, 16)); // NOI18N
        txt_altura.setForeground(new java.awt.Color(110, 110, 110));
        txt_altura.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(202, 202, 202), 1, true));
        txt_altura.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_alturaKeyTyped(evt);
            }
        });
        jPanel1.add(txt_altura, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 280, 310, 30));

        jLabel23.setFont(new java.awt.Font("Verdana", 0, 16)); // NOI18N
        jLabel23.setForeground(new java.awt.Color(110, 110, 110));
        jLabel23.setText("Altura cm:");
        jPanel1.add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 280, -1, -1));

        jLabel24.setFont(new java.awt.Font("Verdana", 0, 16)); // NOI18N
        jLabel24.setForeground(new java.awt.Color(110, 110, 110));
        jLabel24.setText("Cintura cm:");
        jPanel1.add(jLabel24, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 330, 105, -1));

        txt_cintura.setFont(new java.awt.Font("Verdana", 0, 16)); // NOI18N
        txt_cintura.setForeground(new java.awt.Color(110, 110, 110));
        txt_cintura.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(202, 202, 202), 1, true));
        txt_cintura.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_cinturaKeyTyped(evt);
            }
        });
        jPanel1.add(txt_cintura, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 330, 310, 30));

        txt_cuello.setFont(new java.awt.Font("Verdana", 0, 16)); // NOI18N
        txt_cuello.setForeground(new java.awt.Color(110, 110, 110));
        txt_cuello.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(202, 202, 202), 1, true));
        txt_cuello.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_cuelloKeyTyped(evt);
            }
        });
        jPanel1.add(txt_cuello, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 370, 310, 30));

        jLabel52.setFont(new java.awt.Font("Verdana", 0, 16)); // NOI18N
        jLabel52.setForeground(new java.awt.Color(110, 110, 110));
        jLabel52.setText("Cuello cm:");
        jPanel1.add(jLabel52, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 380, -1, -1));

        lbl_cadera1.setFont(new java.awt.Font("Verdana", 0, 16)); // NOI18N
        lbl_cadera1.setForeground(new java.awt.Color(110, 110, 110));
        lbl_cadera1.setText("Cadera cm:");
        jPanel1.add(lbl_cadera1, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 430, 97, -1));

        txt_cadera.setFont(new java.awt.Font("Verdana", 0, 16)); // NOI18N
        txt_cadera.setForeground(new java.awt.Color(110, 110, 110));
        txt_cadera.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(202, 202, 202), 1, true));
        txt_cadera.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_caderaKeyTyped(evt);
            }
        });
        jPanel1.add(txt_cadera, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 420, 310, 30));

        btn_siguiente3.setBackground(new java.awt.Color(0, 153, 204));
        btn_siguiente3.setFont(new java.awt.Font("Verdana", 0, 16)); // NOI18N
        btn_siguiente3.setForeground(new java.awt.Color(255, 255, 255));
        btn_siguiente3.setText("Siguiente");
        btn_siguiente3.setBorder(null);
        btn_siguiente3.setBorderPainted(false);
        btn_siguiente3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_siguiente3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_siguiente3ActionPerformed(evt);
            }
        });
        jPanel1.add(btn_siguiente3, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 490, 100, 40));

        btn_limpiar3.setBackground(new java.awt.Color(0, 153, 204));
        btn_limpiar3.setFont(new java.awt.Font("Verdana", 0, 16)); // NOI18N
        btn_limpiar3.setForeground(new java.awt.Color(255, 255, 255));
        btn_limpiar3.setText("Limpiar");
        btn_limpiar3.setBorder(null);
        btn_limpiar3.setBorderPainted(false);
        btn_limpiar3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_limpiar3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_limpiar3ActionPerformed(evt);
            }
        });
        jPanel1.add(btn_limpiar3, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 490, 100, 40));

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

        jLabel14.setFont(new java.awt.Font("Verdana", 0, 16)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(110, 110, 110));
        jLabel14.setText("Cédula:");
        jPanel1.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 131, 100, 30));

        txt_cedula.setFont(new java.awt.Font("Verdana", 0, 16)); // NOI18N
        txt_cedula.setForeground(new java.awt.Color(110, 110, 110));
        txt_cedula.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(202, 202, 202), 1, true));
        txt_cedula.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_cedulaKeyTyped(evt);
            }
        });
        jPanel1.add(txt_cedula, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 130, 310, 30));

        spanel_nuevo.setViewportView(jPanel1);

        panelPrincipal.addTab("Nueva ficha", spanel_nuevo);

        spanel_final.setBackground(new java.awt.Color(250, 250, 250));
        spanel_final.setBorder(null);

        jPanel2.setBackground(new java.awt.Color(250, 250, 250));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btn_cancelar.setBackground(new java.awt.Color(0, 153, 204));
        btn_cancelar.setFont(new java.awt.Font("Verdana", 0, 16)); // NOI18N
        btn_cancelar.setForeground(new java.awt.Color(255, 255, 255));
        btn_cancelar.setText("Cancelar");
        btn_cancelar.setBorder(null);
        btn_cancelar.setBorderPainted(false);
        btn_cancelar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_cancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_cancelarActionPerformed(evt);
            }
        });
        jPanel2.add(btn_cancelar, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 520, 100, 40));

        btn_guardar.setBackground(new java.awt.Color(0, 153, 204));
        btn_guardar.setFont(new java.awt.Font("Verdana", 0, 16)); // NOI18N
        btn_guardar.setForeground(new java.awt.Color(255, 255, 255));
        btn_guardar.setText("Guardar");
        btn_guardar.setBorder(null);
        btn_guardar.setBorderPainted(false);
        btn_guardar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_guardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_guardarActionPerformed(evt);
            }
        });
        jPanel2.add(btn_guardar, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 520, 100, 40));

        jLabel31.setFont(new java.awt.Font("Verdana", 0, 24)); // NOI18N
        jLabel31.setForeground(new java.awt.Color(51, 153, 255));
        jLabel31.setText("Datos Finales");
        jPanel2.add(jLabel31, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 70, 180, -1));

        jSeparator19.setBackground(new java.awt.Color(0, 153, 255));
        jPanel2.add(jSeparator19, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 120, 650, 20));

        jLabel42.setFont(new java.awt.Font("Verdana", 0, 16)); // NOI18N
        jLabel42.setForeground(new java.awt.Color(110, 110, 110));
        jLabel42.setText("Cédula:");
        jPanel2.add(jLabel42, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 170, -1, -1));

        lbl_cedula.setFont(new java.awt.Font("Verdana", 0, 16)); // NOI18N
        lbl_cedula.setForeground(new java.awt.Color(0, 153, 255));
        lbl_cedula.setText("Datos");
        jPanel2.add(lbl_cedula, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 170, 190, -1));

        jLabel37.setFont(new java.awt.Font("Verdana", 0, 16)); // NOI18N
        jLabel37.setForeground(new java.awt.Color(110, 110, 110));
        jLabel37.setText("Altura:");
        jPanel2.add(jLabel37, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 170, -1, -1));

        lbl_altura.setFont(new java.awt.Font("Verdana", 0, 16)); // NOI18N
        lbl_altura.setForeground(new java.awt.Color(0, 153, 255));
        lbl_altura.setText("Datos");
        jPanel2.add(lbl_altura, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 170, 100, -1));

        lbl_cuello.setFont(new java.awt.Font("Verdana", 0, 16)); // NOI18N
        lbl_cuello.setForeground(new java.awt.Color(0, 153, 255));
        lbl_cuello.setText("Datos");
        jPanel2.add(lbl_cuello, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 210, 90, -1));

        jSeparator13.setBackground(new java.awt.Color(110, 110, 110));
        jPanel2.add(jSeparator13, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 200, 300, 10));

        jSeparator20.setBackground(new java.awt.Color(110, 110, 110));
        jPanel2.add(jSeparator20, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 200, 280, 10));

        lbl_nombre.setFont(new java.awt.Font("Verdana", 0, 16)); // NOI18N
        lbl_nombre.setForeground(new java.awt.Color(0, 153, 255));
        lbl_nombre.setText("Datos");
        jPanel2.add(lbl_nombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 210, 190, -1));

        jLabel27.setFont(new java.awt.Font("Verdana", 0, 16)); // NOI18N
        jLabel27.setForeground(new java.awt.Color(110, 110, 110));
        jLabel27.setText("Nombre:");
        jPanel2.add(jLabel27, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 210, -1, -1));

        jLabel39.setFont(new java.awt.Font("Verdana", 0, 16)); // NOI18N
        jLabel39.setForeground(new java.awt.Color(110, 110, 110));
        jLabel39.setText("Cuello:");
        jPanel2.add(jLabel39, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 210, -1, -1));

        jSeparator14.setBackground(new java.awt.Color(110, 110, 110));
        jPanel2.add(jSeparator14, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 240, 300, 10));

        jSeparator7.setBackground(new java.awt.Color(110, 110, 110));
        jPanel2.add(jSeparator7, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 240, 280, 10));

        lbl_apellidos.setFont(new java.awt.Font("Verdana", 0, 16)); // NOI18N
        lbl_apellidos.setForeground(new java.awt.Color(0, 153, 255));
        lbl_apellidos.setText("Datos");
        jPanel2.add(lbl_apellidos, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 250, 190, -1));

        jLabel28.setFont(new java.awt.Font("Verdana", 0, 16)); // NOI18N
        jLabel28.setForeground(new java.awt.Color(110, 110, 110));
        jLabel28.setText("Apellido:");
        jPanel2.add(jLabel28, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 250, -1, -1));

        jLabel41.setFont(new java.awt.Font("Verdana", 0, 16)); // NOI18N
        jLabel41.setForeground(new java.awt.Color(110, 110, 110));
        jLabel41.setText("Cintura:");
        jPanel2.add(jLabel41, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 250, -1, -1));

        lbl_cintura.setFont(new java.awt.Font("Verdana", 0, 16)); // NOI18N
        lbl_cintura.setForeground(new java.awt.Color(0, 153, 255));
        lbl_cintura.setText("Datos");
        jPanel2.add(lbl_cintura, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 250, 90, -1));

        jSeparator15.setBackground(new java.awt.Color(110, 110, 110));
        jPanel2.add(jSeparator15, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 280, 300, 10));

        lbl_imc.setFont(new java.awt.Font("Verdana", 0, 16)); // NOI18N
        lbl_imc.setForeground(new java.awt.Color(0, 153, 255));
        lbl_imc.setText("Datos");
        jPanel2.add(lbl_imc, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 290, 90, -1));

        jLabel34.setFont(new java.awt.Font("Verdana", 0, 16)); // NOI18N
        jLabel34.setForeground(new java.awt.Color(110, 110, 110));
        jLabel34.setText("IMC:");
        jPanel2.add(jLabel34, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 290, -1, -1));

        jSeparator16.setBackground(new java.awt.Color(110, 110, 110));
        jPanel2.add(jSeparator16, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 320, 300, 10));

        jLabel35.setFont(new java.awt.Font("Verdana", 0, 16)); // NOI18N
        jLabel35.setForeground(new java.awt.Color(110, 110, 110));
        jLabel35.setText("indice de Cintura/Altura:");
        jPanel2.add(jLabel35, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 330, -1, -1));

        lbl_imc_altura.setFont(new java.awt.Font("Verdana", 0, 16)); // NOI18N
        lbl_imc_altura.setForeground(new java.awt.Color(0, 153, 255));
        lbl_imc_altura.setText("Datos");
        jPanel2.add(lbl_imc_altura, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 330, 90, -1));

        jSeparator17.setBackground(new java.awt.Color(110, 110, 110));
        jPanel2.add(jSeparator17, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 360, 300, 10));

        jLabel32.setFont(new java.awt.Font("Verdana", 0, 16)); // NOI18N
        jLabel32.setForeground(new java.awt.Color(110, 110, 110));
        jLabel32.setText("Masa corporal magra:");
        jPanel2.add(jLabel32, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 370, -1, -1));

        lbl_masa_magra.setFont(new java.awt.Font("Verdana", 0, 16)); // NOI18N
        lbl_masa_magra.setForeground(new java.awt.Color(0, 153, 255));
        lbl_masa_magra.setText("Datos");
        jPanel2.add(lbl_masa_magra, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 370, 100, -1));

        jSeparator18.setBackground(new java.awt.Color(110, 110, 110));
        jPanel2.add(jSeparator18, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 400, 300, 20));

        jLabel43.setFont(new java.awt.Font("Verdana", 0, 16)); // NOI18N
        jLabel43.setForeground(new java.awt.Color(110, 110, 110));
        jLabel43.setText("Grasa corporal:");
        jPanel2.add(jLabel43, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 410, -1, -1));

        lbl_grasa.setFont(new java.awt.Font("Verdana", 0, 16)); // NOI18N
        lbl_grasa.setForeground(new java.awt.Color(0, 153, 255));
        lbl_grasa.setText("Datos");
        jPanel2.add(lbl_grasa, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 410, 120, -1));

        jSeparator26.setBackground(new java.awt.Color(110, 110, 110));
        jPanel2.add(jSeparator26, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 280, 280, 10));

        jLabel33.setFont(new java.awt.Font("Verdana", 0, 16)); // NOI18N
        jLabel33.setForeground(new java.awt.Color(110, 110, 110));
        jLabel33.setText("Peso");
        jPanel2.add(jLabel33, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 290, -1, -1));

        lbl_peso.setFont(new java.awt.Font("Verdana", 0, 16)); // NOI18N
        lbl_peso.setForeground(new java.awt.Color(0, 153, 255));
        lbl_peso.setText("Datos");
        jPanel2.add(lbl_peso, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 290, 190, -1));

        jLabel36.setFont(new java.awt.Font("Verdana", 0, 16)); // NOI18N
        jLabel36.setForeground(new java.awt.Color(110, 110, 110));
        jLabel36.setText("Sobrepeso");
        jPanel2.add(jLabel36, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 450, -1, -1));

        jSeparator12.setBackground(new java.awt.Color(110, 110, 110));
        jPanel2.add(jSeparator12, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 440, 300, 10));

        lbl_sobrepeso.setFont(new java.awt.Font("Verdana", 0, 16)); // NOI18N
        lbl_sobrepeso.setForeground(new java.awt.Color(0, 153, 255));
        lbl_sobrepeso.setText("Datos");
        jPanel2.add(lbl_sobrepeso, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 450, 120, -1));

        jSeparator6.setBackground(new java.awt.Color(110, 110, 110));
        jPanel2.add(jSeparator6, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 320, 280, 10));

        jLabel38.setFont(new java.awt.Font("Verdana", 0, 16)); // NOI18N
        jLabel38.setForeground(new java.awt.Color(110, 110, 110));
        jLabel38.setText("Sexo");
        jPanel2.add(jLabel38, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 330, -1, -1));

        lbl_sexo.setFont(new java.awt.Font("Verdana", 0, 16)); // NOI18N
        lbl_sexo.setForeground(new java.awt.Color(0, 153, 255));
        lbl_sexo.setText("Datos");
        jPanel2.add(lbl_sexo, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 330, 190, -1));

        jSeparator11.setBackground(new java.awt.Color(110, 110, 110));
        jPanel2.add(jSeparator11, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 360, 280, 10));

        jLabel40.setFont(new java.awt.Font("Verdana", 0, 16)); // NOI18N
        jLabel40.setForeground(new java.awt.Color(110, 110, 110));
        jLabel40.setText("Cadera:");
        jPanel2.add(jLabel40, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 370, -1, -1));

        lbl_result_cadera.setFont(new java.awt.Font("Verdana", 0, 16)); // NOI18N
        lbl_result_cadera.setForeground(new java.awt.Color(0, 153, 255));
        lbl_result_cadera.setText("Datos");
        jPanel2.add(lbl_result_cadera, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 370, 90, -1));

        lbl_nivel.setFont(new java.awt.Font("Verdana", 0, 16)); // NOI18N
        lbl_nivel.setForeground(new java.awt.Color(0, 153, 255));
        lbl_nivel.setText("Datos");
        jPanel2.add(lbl_nivel, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 450, 120, -1));

        jLabel54.setFont(new java.awt.Font("Verdana", 0, 16)); // NOI18N
        jLabel54.setForeground(new java.awt.Color(110, 110, 110));
        jLabel54.setText("Nivel:");
        jPanel2.add(jLabel54, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 450, -1, -1));

        jSeparator28.setBackground(new java.awt.Color(110, 110, 110));
        jPanel2.add(jSeparator28, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 440, 280, 20));

        jLabel75.setFont(new java.awt.Font("Verdana", 0, 16)); // NOI18N
        jLabel75.setForeground(new java.awt.Color(110, 110, 110));
        jLabel75.setText("Rutina:");
        jPanel2.add(jLabel75, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 410, -1, -1));

        lbl_rutina.setFont(new java.awt.Font("Verdana", 0, 16)); // NOI18N
        lbl_rutina.setForeground(new java.awt.Color(0, 153, 255));
        lbl_rutina.setText("Datos");
        jPanel2.add(lbl_rutina, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 410, 120, -1));

        jSeparator30.setBackground(new java.awt.Color(110, 110, 110));
        jPanel2.add(jSeparator30, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 400, 280, 10));

        spanel_final.setViewportView(jPanel2);

        panelPrincipal.addTab("Datos Finales", spanel_final);

        spanel_buscar.setBackground(new java.awt.Color(250, 250, 250));
        spanel_buscar.setBorder(null);

        jPanel3.setBackground(new java.awt.Color(250, 250, 250));
        jPanel3.setPreferredSize(new java.awt.Dimension(800, 977));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel65.setFont(new java.awt.Font("Verdana", 0, 24)); // NOI18N
        jLabel65.setForeground(new java.awt.Color(110, 110, 110));
        jLabel65.setText("Buscar  fichas de clientes");
        jPanel3.add(jLabel65, new org.netbeans.lib.awtextra.AbsoluteConstraints(293, 42, 343, -1));

        lbl_buscar.setFont(new java.awt.Font("Verdana", 0, 16)); // NOI18N
        lbl_buscar.setForeground(new java.awt.Color(110, 110, 110));
        lbl_buscar.setText("Cédula:");
        jPanel3.add(lbl_buscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 140, -1, -1));

        txt_cedula_buscar.setFont(new java.awt.Font("Verdana", 0, 16)); // NOI18N
        txt_cedula_buscar.setForeground(new java.awt.Color(110, 110, 110));
        txt_cedula_buscar.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(202, 202, 202), 1, true));
        txt_cedula_buscar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txt_cedula_buscarKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_cedula_buscarKeyTyped(evt);
            }
        });
        jPanel3.add(txt_cedula_buscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 130, 242, 39));

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
        jPanel3.add(btn_buscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 190, 100, 40));

        jLabel66.setFont(new java.awt.Font("Verdana", 0, 24)); // NOI18N
        jLabel66.setForeground(new java.awt.Color(110, 110, 110));
        jLabel66.setText("Resultados de búsqueda");
        jPanel3.add(jLabel66, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 270, 310, -1));

        jLabel16.setFont(new java.awt.Font("Verdana", 0, 16)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(110, 110, 110));
        jLabel16.setText("Acciones:");
        jPanel3.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 330, 80, -1));

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
        jPanel3.add(btn_eliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 320, 100, 40));

        tabla_fichas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane4.setViewportView(tabla_fichas);

        jPanel3.add(jScrollPane4, new org.netbeans.lib.awtextra.AbsoluteConstraints(24, 390, 780, 330));

        jSeparator2.setBackground(new java.awt.Color(51, 204, 255));
        jPanel3.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(118, 84, 673, 22));

        jSeparator3.setBackground(new java.awt.Color(51, 204, 255));
        jPanel3.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 93, 1, 10));

        jSeparator5.setBackground(new java.awt.Color(51, 204, 255));
        jPanel3.add(jSeparator5, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 370, 673, 22));

        cbo_buscar.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Buscar por...", "Cedula", "Nombres" }));
        cbo_buscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbo_buscarActionPerformed(evt);
            }
        });
        jPanel3.add(cbo_buscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 130, 110, 40));

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

    
    
    
    
 /*---------------------------------------------------------
    $metodo para eliminar
 ----------------------------------------------------------*/    
    private void btn_eliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_eliminarActionPerformed
            
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

    
    
    
 /*-----------------------------------------------------------------------------------------------------------
        $metodo para el boton siguiente ficha nueva 
 ------------------------------------------------------------------------------------------------------------*/ 
    
    private void btn_siguiente3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_siguiente3ActionPerformed
        if( txt_cedula.getText().length() > 0 && txt_peso.getText().length() > 0  && txt_altura.getText().length() > 0 && txt_cintura.getText().length() > 0 &&
                     txt_cuello.getText().length() > 0) {
            
            String cedula = txt_cedula.getText();
            
            String[] registro = cliente.buscarClientes(Integer.parseInt(cedula));
            
            if(Validar.VerificarCedula(cedula) && !registro[0].equals("")){
                
               cliente.setCi(Integer.parseInt(cedula));
               
     
                    if(registro[5].equals("Femenino")){

                        lbl_cadera1.setVisible(true);
                        txt_cadera.setVisible(true);
                        JOptionPane.showMessageDialog(rootPane, "Ingresa la medida de tu cadera por favor");
                        txt_cadera.requestFocus();
       
                        if(txt_cadera.getText().length()>0){
                            
                                //variables para girdar datos corporale
                                double altura = Double.parseDouble(this.txt_altura.getText());
                                double peso = Double.parseDouble(this.txt_peso.getText());
                                double cintura = Double.parseDouble(this.txt_cintura.getText());
                                double cuello = Double.parseDouble(this.txt_cuello.getText());
                                double cadera = Double.parseDouble(this.txt_cadera.getText());
                            
                            
                               //damos valores a las propiedas del objeto tipo ficha
                               cliente.setSexo(registro[5]);
                               ficha.setAltura(altura);
                               ficha.setPeso(peso);
                               ficha.setCintura(cintura);
                               ficha.setCuello(cuello);
                               ficha.setCadera(cadera);
                               ficha.setNivel(cbo_nivel.getSelectedItem().toString());
                               
                               
                                /*--------------------------------------------------------------------------
                                para pasar  todos los datos al formulario final para confirmar y gurdar
                               ------------------------------------------------------------------------------*/
                               
                               //asgignar resultado de la base datos a form dato finales
                                lbl_cedula.setText(registro[0]);
                                lbl_nombre.setText(registro[1]);
                                lbl_apellidos.setText(registro[2]);
                                lbl_peso.setText(String.valueOf(ficha.getPeso()));
                                lbl_sexo.setText(cliente.getSexo());
                                lbl_result_cadera.setText(String.valueOf(ficha.getCadera())+" cm");
                                lbl_nivel.setText(ficha.getNivel());
                               
                               
                               lbl_altura.setText(String.valueOf(ficha.getAltura())+" cm");
                               lbl_cuello.setText(String.valueOf(ficha.getCuello())+" cm");
                               lbl_cintura.setText(String.valueOf(ficha.getCintura())+" cm");
                               lbl_imc.setText(String.valueOf(ficha.imc())+"%");
                               lbl_imc_altura.setText(String.valueOf(ficha.indice_cintura_Altura())+"%");
                               lbl_grasa.setText(String.valueOf(ficha.grasaCorporal(cliente.getSexo()))+" %");
                               lbl_masa_magra.setText(String.valueOf(ficha.masaMagra())+" Kg");
                               lbl_sobrepeso.setText(String.valueOf(ficha.sobrePeso())+" Kg");
                               
                               //para ingresar el id de rutina
                                rutinas.SetIdRutina(cbo_nivel.getSelectedItem().toString());
                                lbl_rutina.setText(String.valueOf(rutinas.getIdRutina()));
                                
                                //para enviarlos a la siguiente pestaña
                                this.panelPrincipal.setEnabledAt(0, false);
                                this.panelPrincipal.setEnabledAt(1, true);
                                panelPrincipal.setSelectedIndex(1); 
                        
                        }
        
                    }else{//si no es muejer ejecutamos esto
                                //variables para girdar datos corporale
                                double altura = Double.parseDouble(this.txt_altura.getText());
                                double peso = Double.parseDouble(this.txt_peso.getText());
                                double cintura = Double.parseDouble(this.txt_cintura.getText());
                                double cuello = Double.parseDouble(this.txt_cuello.getText());
                                
                            
                            
                               //damos valores a las propiedas del objeto tipo ficha
                               cliente.setSexo(registro[5]);
                               ficha.setAltura(altura);
                               ficha.setPeso(peso);
                               ficha.setCintura(cintura);
                               ficha.setCuello(cuello);
                               ficha.setNivel(cbo_nivel.getSelectedItem().toString());
                               
                               
                                /*--------------------------------------------------------------------------
                                para pasar  todos los datos al formulario final para confirmar y gurdar
                               ------------------------------------------------------------------------------*/
                               
                               //asgignar resultado de la base datos a form dato finales
                                lbl_cedula.setText(registro[0]);
                                lbl_nombre.setText(registro[1]);
                                lbl_apellidos.setText(registro[2]);
                                lbl_peso.setText(String.valueOf(ficha.getPeso()));
                                lbl_sexo.setText(cliente.getSexo());
                                lbl_result_cadera.setText(String.valueOf(ficha.getCadera())+" cm");
                                lbl_nivel.setText(ficha.getNivel());
                               
                               
                               lbl_altura.setText(String.valueOf(ficha.getAltura())+" cm");
                               lbl_cuello.setText(String.valueOf(ficha.getCuello())+" cm");
                               lbl_cintura.setText(String.valueOf(ficha.getCintura())+" cm");
                               lbl_imc.setText(String.valueOf(ficha.imc())+"%");
                               lbl_imc_altura.setText(String.valueOf(ficha.indice_cintura_Altura())+"%");
                               lbl_grasa.setText(String.valueOf(ficha.grasaCorporal(cliente.getSexo()))+" %");
                               lbl_masa_magra.setText(String.valueOf(ficha.masaMagra())+" Kg");
                               lbl_sobrepeso.setText(String.valueOf(ficha.sobrePeso())+" Kg");
                               
                               //para ingresar el id de rutina
                                rutinas.SetIdRutina(cbo_nivel.getSelectedItem().toString());
                                lbl_rutina.setText(String.valueOf(rutinas.getIdRutina()));
                                
                                //para enviarlos a la siguiente pestaña
                                this.panelPrincipal.setEnabledAt(0, false);
                                this.panelPrincipal.setEnabledAt(1, true);
                                panelPrincipal.setSelectedIndex(1); 


                    }//if else para validar si es femenino o masculino
               
               
               //JOptionPane.showMessageDialog(rootPane, registro[0]+ "-"+registro[1]+ "-"+registro[2]+ "-"+registro[5]);
                              
   
            }else{
        
            JOptionPane.showMessageDialog(rootPane, "Cedula incorrecta");
            txt_cedula.setText("");
            txt_cedula.requestFocus();
            } //fin del if/else para validar si la cedula es correcta
            
        }else{
            
          JOptionPane.showMessageDialog(rootPane, "Llene toos los campos");
        } //fin del if/else para validarque llene todos los campos

    }//GEN-LAST:event_btn_siguiente3ActionPerformed

    
 
    
  /*-----------------------------------------------------------------------------------------------------------
        Para validar que solo escriba numemeros en la caja de texto
 ------------------------------------------------------------------------------------------------------------*/    
    
    private void txt_cedulaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_cedulaKeyTyped
            Validar.soloNumeros(evt);
    }//GEN-LAST:event_txt_cedulaKeyTyped

    
    
    
    
  /*-----------------------------------------------------------------------------------------------------------
        Metodo para el boton guradar
 ------------------------------------------------------------------------------------------------------------*/       
    private void btn_guardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_guardarActionPerformed
            ficha.setFicha(cliente.getCi(),rutinas.getIdRutina(), cliente.getSexo());
             JOptionPane.showMessageDialog(rootPane, "Ficha Guardada con éxito");
             
             int confirm = JOptionPane.showConfirmDialog(rootPane,"¿Desea agragar otra ficha?");
             
             if(confirm == JOptionPane.YES_OPTION){
                 
                //para enviarlos a la siguiente pestaña
                this.panelPrincipal.setEnabledAt(1, false);
                this.panelPrincipal.setEnabledAt(0, true);
                panelPrincipal.setSelectedIndex(0); 
                limpiarFicha();
             }
             
             
    }//GEN-LAST:event_btn_guardarActionPerformed

    
    
    
/*-----------------------------------------------------------------------------------------------------------
        método para el boton limpiar
 ------------------------------------------------------------------------------------------------------------*/   
    private void btn_limpiar3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_limpiar3ActionPerformed
        limpiarFicha();
        txt_cedula.requestFocus();
    }//GEN-LAST:event_btn_limpiar3ActionPerformed

    
    
    
    
/*-----------------------------------------------------------------------------------------------------------
        método para el boton cancelar
 ------------------------------------------------------------------------------------------------------------*/  
    private void btn_cancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_cancelarActionPerformed
        Home home = new Home();
        home.setVisible(true);
        dispose();
       
    }//GEN-LAST:event_btn_cancelarActionPerformed

    /*-----------------------------------------------------------------------------------------------------------
        método para el boton cancelar
 ------------------------------------------------------------------------------------------------------------*/  
    private void txt_cedula_buscarKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_cedula_buscarKeyReleased
            if(cbo_buscar.getSelectedItem().equals("Nombres")){
                cargarFichas(txt_cedula_buscar.getText());
            }
    }//GEN-LAST:event_txt_cedula_buscarKeyReleased

    
    
/*-----------------------------------------------------------------------------------------------------------
        método para cbo_buscar segun eleccion moficiamos los caracteres que puede escribir
 ------------------------------------------------------------------------------------------------------------*/  
    private void cbo_buscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbo_buscarActionPerformed
        if(cbo_buscar.getSelectedIndex()>0){
            if(cbo_buscar.getSelectedItem().toString().equals("Cedula")){
                lbl_buscar.setText("Cedula:");
                txt_cedula_buscar.setEditable(true);
                txt_cedula_buscar.requestFocus();
                txt_cedula_buscar.setDocument(new Validar( txt_cedula_buscar,10));
                btn_buscar.setEnabled(true);
            
            }if(cbo_buscar.getSelectedItem().toString().equals("Nombres")){
                lbl_buscar.setText("Nombres:");
                txt_cedula_buscar.setEditable(true);
                txt_cedula_buscar.requestFocus();
                txt_cedula_buscar.setDocument(new Validar( txt_cedula_buscar,20));
                btn_buscar.setEnabled(false);
            }
        
        }else{
            lbl_buscar.setText("Cedula");
                txt_cedula_buscar.setEditable(false);
                lbl_buscar.setText("Buscar:");
                btn_buscar.setEnabled(false);
                
        }
    }//GEN-LAST:event_cbo_buscarActionPerformed

    
    
    
    
  /*-----------------------------------------------------------------------------------------------------------
        método para la caja de tezto de busqueda
 ------------------------------------------------------------------------------------------------------------*/    
    private void txt_cedula_buscarKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_cedula_buscarKeyTyped
       if(cbo_buscar.getSelectedIndex()>0){
            if(cbo_buscar.getSelectedItem().toString().equals("Cedula")){
                lbl_buscar.setText("Cedula");
                Validar.soloNumeros(evt);
            
            }if(cbo_buscar.getSelectedItem().toString().equals("Nombres")){
               
                Validar.soloLetrasAcentos(evt);
            }
        
        }
        
    }//GEN-LAST:event_txt_cedula_buscarKeyTyped

    private void btn_buscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_buscarActionPerformed
        if(txt_cedula_buscar.getText().length()>0){
            
            if(Validar.VerificarCedula(txt_cedula_buscar.getText())){
                cargarFichas(Integer.parseInt(txt_cedula_buscar.getText()));
            }else{
            
             JOptionPane.showMessageDialog(rootPane, "Cedula incorrecta");
             txt_cedula_buscar.setText("");
             txt_cedula_buscar.requestFocus();
            }
            
            
        }else{
            JOptionPane.showMessageDialog(rootPane, "Llene el campo de búsqueda");
        }
    }//GEN-LAST:event_btn_buscarActionPerformed


    
    
    
    
    public static void main(String args[]) {

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
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JComboBox cbo_buscar;
    private javax.swing.JComboBox cbo_nivel;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
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
    private javax.swing.JLabel jLabel52;
    private javax.swing.JLabel jLabel54;
    private javax.swing.JLabel jLabel65;
    private javax.swing.JLabel jLabel66;
    private javax.swing.JLabel jLabel75;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JSeparator jSeparator1;
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
    private javax.swing.JSeparator jSeparator26;
    private javax.swing.JSeparator jSeparator28;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator30;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JSeparator jSeparator6;
    private javax.swing.JSeparator jSeparator7;
    private javax.swing.JLabel lbl_altura;
    private javax.swing.JLabel lbl_apellidos;
    private javax.swing.JLabel lbl_buscar;
    private javax.swing.JLabel lbl_cadera1;
    private javax.swing.JLabel lbl_cedula;
    private javax.swing.JLabel lbl_cintura;
    private javax.swing.JLabel lbl_cuello;
    private javax.swing.JLabel lbl_grasa;
    private javax.swing.JLabel lbl_imc;
    private javax.swing.JLabel lbl_imc_altura;
    private javax.swing.JLabel lbl_masa_magra;
    private javax.swing.JLabel lbl_nivel;
    private javax.swing.JLabel lbl_nombre;
    private javax.swing.JLabel lbl_peso;
    private javax.swing.JLabel lbl_result_cadera;
    private javax.swing.JLabel lbl_rutina;
    private javax.swing.JLabel lbl_sexo;
    private javax.swing.JLabel lbl_sobrepeso;
    private javax.swing.JTabbedPane panelPrincipal;
    private javax.swing.JScrollPane spanel_buscar;
    private javax.swing.JScrollPane spanel_final;
    private javax.swing.JScrollPane spanel_nuevo;
    private javax.swing.JTable tabla_fichas;
    private javax.swing.JTextField txt_altura;
    private javax.swing.JTextField txt_cadera;
    private javax.swing.JTextField txt_cedula;
    private javax.swing.JTextField txt_cedula_buscar;
    private javax.swing.JTextField txt_cintura;
    private javax.swing.JTextField txt_cuello;
    private javax.swing.JTextField txt_peso;
    // End of variables declaration//GEN-END:variables
}
