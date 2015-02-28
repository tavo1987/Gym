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
    Cliente cliente = new Cliente();
    Fechas fecha = new Fechas();
    
    
    
    
 /*_____________________________________________________________________________
     
    $Metodo contructor del la clase
 _______________________________________________________________________________*/
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
         txt_result_cedula.setEditable(false);
          txt_fecha_nacimiento.setEditable(false);    
         txt_sexo.setEditable(false);
         btn_editar.setEnabled(false);
         btn_eliminar.setEnabled(false);
         btn_guardar.setEnabled(false);
         
         
         //para cargar combo de años
         cargarCombo();
         
        
        
    }
 
    
    
    
    
/*_________________________________________________________________________
    
    Metodo para cargar combo de años
 __________________________________________________________________________*/  
    
    public void cargarCombo(){
        
        fecha.setYear();
        int year = fecha.getYear()+ 1;
        
        for(int i= 0;i<80;i++){        
          cbo_year.addItem(year = year - 1);
          
         }     
    }
 
    
    
    
    
 /*_____________________________________________________________________________
     
    $Metodo obtener fecha los conmbos dia mes año
 _______________________________________________________________________________*/
    
    public void cargarFecha(){
        //fecha
        String day2,month2,year2;
        day2 = this.cbo_day.getSelectedItem().toString();
        month2 = String.valueOf(this.cbo_month.getSelectedIndex());
        year2 = this.cbo_year.getSelectedItem().toString();
        
        this.txt_fecha_nacimiento.setText(year2+"-"+month2+"-"+day2);
    
    }
    
    
    
    
    
   
/*_____________________________________________________________________________
     
    $Metodo para poder bloquear los campos editar los campos de texto 
 __________________________________________________________________________*/
 public void bloquearCampos(boolean a){
     
     
   
    txt_nombres.setEditable(a);
    txt_apellidos.setEditable(a);
    txt_dir.setEditable(a);
    txt_telefono.setEditable(a);
    txt_celular.setEditable(a);
   
 }
    
    
    

 
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
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
        btn_guardar = new javax.swing.JButton();
        jLabel19 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        btn_cancelar1 = new javax.swing.JButton();
        txt_dir = new javax.swing.JTextField();
        cbo_day = new javax.swing.JComboBox();
        cbo_month = new javax.swing.JComboBox();
        cbo_year = new javax.swing.JComboBox();
        radio_masculino = new javax.swing.JRadioButton();
        radio_femenino = new javax.swing.JRadioButton();
        jLabel27 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();

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
        jPanel1.add(txt_result_cedula, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 361, 440, 39));

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
        jPanel1.add(btn_eliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 260, 100, 40));

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
        jPanel1.add(txt_nombres, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 421, 440, 39));

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
        jPanel1.add(txt_apellidos, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 481, 440, 39));

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
        jPanel1.add(txt_fecha_nacimiento, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 600, 110, 39));

        jLabel22.setFont(new java.awt.Font("Verdana", 0, 16)); // NOI18N
        jLabel22.setForeground(new java.awt.Color(110, 110, 110));
        jLabel22.setText("Nuevo:");
        jPanel1.add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 660, -1, 40));

        txt_sexo.setBackground(new java.awt.Color(197, 230, 197));
        txt_sexo.setFont(new java.awt.Font("Verdana", 0, 16)); // NOI18N
        txt_sexo.setForeground(new java.awt.Color(110, 110, 110));
        txt_sexo.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(162, 214, 162), 1, true));
        txt_sexo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_sexoKeyTyped(evt);
            }
        });
        jPanel1.add(txt_sexo, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 661, 110, 39));

        jLabel23.setFont(new java.awt.Font("Verdana", 0, 16)); // NOI18N
        jLabel23.setForeground(new java.awt.Color(110, 110, 110));
        jLabel23.setText("Sexo:");
        jPanel1.add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 670, -1, -1));

        jLabel24.setFont(new java.awt.Font("Verdana", 0, 16)); // NOI18N
        jLabel24.setForeground(new java.awt.Color(110, 110, 110));
        jLabel24.setText("Teléfono:");
        jPanel1.add(jLabel24, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 730, -1, -1));

        txt_telefono.setBackground(new java.awt.Color(197, 230, 197));
        txt_telefono.setFont(new java.awt.Font("Verdana", 0, 16)); // NOI18N
        txt_telefono.setForeground(new java.awt.Color(110, 110, 110));
        txt_telefono.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(162, 214, 162), 1, true));
        txt_telefono.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_telefonoKeyTyped(evt);
            }
        });
        jPanel1.add(txt_telefono, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 710, 440, 39));

        jLabel25.setFont(new java.awt.Font("Verdana", 0, 16)); // NOI18N
        jLabel25.setForeground(new java.awt.Color(110, 110, 110));
        jLabel25.setText("Celular:");
        jPanel1.add(jLabel25, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 780, -1, -1));

        txt_celular.setBackground(new java.awt.Color(197, 230, 197));
        txt_celular.setFont(new java.awt.Font("Verdana", 0, 16)); // NOI18N
        txt_celular.setForeground(new java.awt.Color(110, 110, 110));
        txt_celular.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(162, 214, 162), 1, true));
        txt_celular.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_celularKeyTyped(evt);
            }
        });
        jPanel1.add(txt_celular, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 770, 440, 39));

        jLabel26.setFont(new java.awt.Font("Verdana", 0, 24)); // NOI18N
        jLabel26.setForeground(new java.awt.Color(110, 110, 110));
        jLabel26.setText("Buscar  clientes");
        jPanel1.add(jLabel26, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 60, 197, -1));

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
        jPanel1.add(btn_guardar, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 850, 100, 40));

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
        jPanel1.add(txt_dir, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 541, 440, 39));

        cbo_day.setBackground(new java.awt.Color(250, 250, 250));
        cbo_day.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        cbo_day.setForeground(new java.awt.Color(110, 110, 110));
        cbo_day.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "dia", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31" }));
        cbo_day.setToolTipText("");
        cbo_day.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        cbo_day.setEnabled(false);
        cbo_day.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbo_dayActionPerformed(evt);
            }
        });
        jPanel1.add(cbo_day, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 600, -1, 40));

        cbo_month.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        cbo_month.setForeground(new java.awt.Color(110, 110, 110));
        cbo_month.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Mes", "Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio", "Julio", "Agosto", "Septiembre", "Octubre", "Noviembre", "Diciembre" }));
        cbo_month.setToolTipText("");
        cbo_month.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        cbo_month.setEnabled(false);
        cbo_month.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbo_monthActionPerformed(evt);
            }
        });
        jPanel1.add(cbo_month, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 600, -1, 40));

        cbo_year.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        cbo_year.setForeground(new java.awt.Color(110, 110, 110));
        cbo_year.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Año" }));
        cbo_year.setToolTipText("");
        cbo_year.setEnabled(false);
        cbo_year.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbo_yearActionPerformed(evt);
            }
        });
        jPanel1.add(cbo_year, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 600, 70, 40));

        radio_masculino.setBackground(new java.awt.Color(250, 250, 250));
        buttonGroup1.add(radio_masculino);
        radio_masculino.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        radio_masculino.setForeground(new java.awt.Color(110, 110, 110));
        radio_masculino.setSelected(true);
        radio_masculino.setText("Masculino");
        radio_masculino.setEnabled(false);
        radio_masculino.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radio_masculinoActionPerformed(evt);
            }
        });
        jPanel1.add(radio_masculino, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 670, -1, -1));

        radio_femenino.setBackground(new java.awt.Color(250, 250, 250));
        buttonGroup1.add(radio_femenino);
        radio_femenino.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        radio_femenino.setForeground(new java.awt.Color(110, 110, 110));
        radio_femenino.setText("Femenino");
        radio_femenino.setEnabled(false);
        radio_femenino.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radio_femeninoActionPerformed(evt);
            }
        });
        jPanel1.add(radio_femenino, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 670, -1, -1));

        jLabel27.setFont(new java.awt.Font("Verdana", 0, 16)); // NOI18N
        jLabel27.setForeground(new java.awt.Color(110, 110, 110));
        jLabel27.setText("Fecha Nacimiento:");
        jPanel1.add(jLabel27, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 610, -1, -1));

        jLabel28.setFont(new java.awt.Font("Verdana", 0, 16)); // NOI18N
        jLabel28.setForeground(new java.awt.Color(110, 110, 110));
        jLabel28.setText("Nueva:");
        jPanel1.add(jLabel28, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 600, -1, 40));

        jScrollPane1.setViewportView(jPanel1);
        jPanel1.getAccessibleContext().setAccessibleName("");
        jPanel1.getAccessibleContext().setAccessibleDescription("");

        jTabbedPane1.addTab("Modificar clientes", jScrollPane1);

        getContentPane().add(jTabbedPane1, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    
    
    
    
 /*_____________________________________________________________________________
     
    $Metodo para limpiar cajas de resultado de busqueda
 __________________________________________________________________________*/
    
public void limpiar(){
     
     txt_result_cedula.setText("");
     txt_nombres.setText("");
     txt_apellidos.setText("");
     txt_dir.setText("");
     txt_fecha_nacimiento.setText("");
     txt_sexo.setText("");
     txt_telefono.setText("");
     txt_celular.setText("");

}
    
    
    
    
/*_____________________________________________________________________________
     
    Boton eliminar para eliminar cliente
 __________________________________________________________________________*/
    private void btn_eliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_eliminarActionPerformed
        
        int confirm = JOptionPane.showConfirmDialog(null, "¿Está seguro que desea eliminar el cliente con cedula "+txt_result_cedula.getText()+ ""
                + "? \n Todos sus registros seran eliminados");
        
        
        try{
            if(confirm == JOptionPane.YES_OPTION){
        
            cliente.eliminarCliente(Integer.parseInt(txt_result_cedula.getText()));
            
            limpiar();
            bloquearCampos(false);
            btn_editar.setEnabled(false);
            btn_eliminar.setEnabled(false);
            btn_guardar.setEnabled(false);
            cbo_day.setEnabled(false);
            cbo_month.setEnabled(false);
            cbo_year.setEnabled(false);
            radio_masculino.setEnabled(false);
            radio_femenino.setEnabled(false);
            
            
            }

        }catch(Exception ex){
           JOptionPane.showMessageDialog(rootPane, ex.getMessage());
        }  

        
        txt_cedula.requestFocus();
        
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
            
            if(txt_result_cedula.getText().length() > 0){
                btn_editar.setEnabled(true);
                btn_eliminar.setEnabled(true);
            
            }
            
            txt_cedula.setText("");
            txt_cedula.requestFocus();

            
            
        }else{
        
            JOptionPane.showMessageDialog(this, "cedula incorrecta o campo de búsqueda vacio");
        }
        
        
        
    }//GEN-LAST:event_btn_buscarActionPerformed

    
    
    
  /*_____________________________________________________________________________
     
    $Metodo para el boton editar
 __________________________________________________________________________*/  

    private void btn_editarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_editarActionPerformed
        bloquearCampos(true);
        txt_nombres.requestFocus();
        btn_guardar.setEnabled(true);
        cbo_day.setEnabled(true);
        cbo_month.setEnabled(true);
        cbo_year.setEnabled(true);
        radio_masculino.setEnabled(true);
        radio_femenino.setEnabled(true);

    }//GEN-LAST:event_btn_editarActionPerformed

    private void txt_result_cedulaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_result_cedulaKeyTyped
        Validar.soloNumeros(evt);
    }//GEN-LAST:event_txt_result_cedulaKeyTyped

    private void txt_nombresKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_nombresKeyTyped
       Validar.soloLetras(evt);
    }//GEN-LAST:event_txt_nombresKeyTyped

    private void txt_apellidosKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_apellidosKeyTyped
        Validar.soloLetrasAcentos(evt);
    }//GEN-LAST:event_txt_apellidosKeyTyped

    private void txt_fecha_nacimientoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_fecha_nacimientoKeyTyped
        
    }//GEN-LAST:event_txt_fecha_nacimientoKeyTyped

    
    
    
    
/*________________________________________________________________________________
     
    $Metodo para el boton girdar
 _________________________________________________________________________________*/  
    private void btn_guardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_guardarActionPerformed
            int cedula = Integer.parseInt(txt_result_cedula.getText());
            String nombre = txt_nombres.getText();
            String apellido= txt_apellidos.getText();
            String dir= txt_dir.getText();
            String fecha= txt_fecha_nacimiento.getText();
            String sexo= txt_sexo.getText();
            String telefono= txt_telefono.getText();
            String celular= txt_celular.getText();
            
            if(nombre.length() > 0 && apellido.length()>0 && dir.trim().length()>0 && fecha.length()>0 &&
               sexo.length()>0 && telefono.length()>0 && celular.length()>0){
 /*---------------------------------------------------------------------------------------------------------------------------------------*/
                    if(!nombre.matches("[A-Z-áéíóúÁÉÍÓÚ][a-zA-Z-áéíóúÁÉÍÓÚ]*\\D{2}")){
                        JOptionPane.showMessageDialog(rootPane, "El nombre debe Empezar con mayúsculas y tener minimo 3 caracteres");
                        txt_nombres.setText("");
                        txt_nombres.requestFocus();

                   }else if(!apellido.matches("[A-Z-áéíóúÁÉÍÓÚ][a-zA-Z-áéíóúÁÉÍÓÚ]*\\D{2}")){
                        JOptionPane.showMessageDialog(rootPane, "El apellido debe Empezar con mayúsculas y tener minimo 3 caracteres");
                        txt_apellidos.setText("");
                        txt_apellidos.requestFocus();

                   }else if(telefono.length() < 7){
                         JOptionPane.showMessageDialog(rootPane, "Número de telefono incorrecto");
                        txt_telefono.setText("");
                        txt_telefono.requestFocus();

                   }else if(celular.length() < 10){
                       JOptionPane.showMessageDialog(rootPane, "Número de ceular incorrecto");
                       txt_celular.setText("");
                       txt_celular.requestFocus();

                   }else{

                             


                           cliente.setNombres(nombre);
                           cliente.setApellidos(apellido);
                           cliente.setDir(dir.trim());
                           cliente.setSexo(sexo);
                           cliente.setFechaNacimiento(fecha);
                           cliente.setTelefono(telefono);
                           cliente.setCelular(celular);
                           
                           cliente.updateCliente(cedula);
                           
                           int confirm = JOptionPane.showConfirmDialog(rootPane, "¿Desea seguir Editando?");
                           
                           if(confirm == JOptionPane.YES_OPTION){
                               
                               txt_nombres.requestFocus();
                           
                           }else if(confirm == JOptionPane.NO_OPTION){

                                //para limpiar todo las cajas
                                limpiar();
                                bloquearCampos(false);
                                btn_editar.setEnabled(false);
                                btn_eliminar.setEnabled(false);
                                btn_guardar.setEnabled(false);
                                cbo_day.setEnabled(false);
                                cbo_month.setEnabled(false);
                                cbo_year.setEnabled(false);
                                radio_masculino.setEnabled(false);
                                radio_femenino.setEnabled(false);
                                
                           }

                   }//find del if y else para verficar nombres,apellidos,telefonos
                
            
 /*---------------------------------------------------------------------------------------------------------------------------------------*/
                        
            
            }else{
            
               JOptionPane.showMessageDialog(rootPane, "llena todo slo campos");

            }
            
                        
        
        
            
            
    }//GEN-LAST:event_btn_guardarActionPerformed

    private void txt_telefonoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_telefonoKeyTyped
        Validar.soloNumeros(evt);
    }//GEN-LAST:event_txt_telefonoKeyTyped

    private void txt_celularKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_celularKeyTyped
               Validar.soloNumeros(evt);
    }//GEN-LAST:event_txt_celularKeyTyped

    private void txt_sexoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_sexoKeyTyped
               Validar.soloLetras(evt);
    }//GEN-LAST:event_txt_sexoKeyTyped

    
    
    
 /*________________________________________________________________________________
     
    $Metodo para combo meses para carga meses
 _________________________________________________________________________________*/     
    
    private void cbo_monthActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbo_monthActionPerformed
       if(cbo_day.getSelectedIndex()>0 && cbo_month.getSelectedIndex()>0 && cbo_year.getSelectedIndex()>0){
                    cargarFecha();
        }else{
            this.txt_fecha_nacimiento.setText("");
          } 
        
    }//GEN-LAST:event_cbo_monthActionPerformed

    
    
/*________________________________________________________________________________
     
    $Metodo para combo años
 _________________________________________________________________________________*/      
    
    private void cbo_yearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbo_yearActionPerformed
        if(cbo_day.getSelectedIndex()>0 && cbo_month.getSelectedIndex()>0 && cbo_year.getSelectedIndex()>0){
             cargarFecha();
          }else{
            this.txt_fecha_nacimiento.setText("");
          }                
       
    }//GEN-LAST:event_cbo_yearActionPerformed

    
    
    private void radio_masculinoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radio_masculinoActionPerformed
            txt_sexo.setText(radio_masculino.getText());
    }//GEN-LAST:event_radio_masculinoActionPerformed

    private void radio_femeninoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radio_femeninoActionPerformed
     txt_sexo.setText(radio_femenino.getText());
    }//GEN-LAST:event_radio_femeninoActionPerformed



/*________________________________________________________________________________
     
    $Metodo para combo dias para carga dias
 _________________________________________________________________________________*/  


    private void cbo_dayActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbo_dayActionPerformed
        
      if(cbo_day.getSelectedIndex()>0 && cbo_month.getSelectedIndex()>0 && cbo_year.getSelectedIndex()>0){
                    cargarFecha();
        }else{
            this.txt_fecha_nacimiento.setText("");
          } 

    }//GEN-LAST:event_cbo_dayActionPerformed

    
    
    
    
    
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
       

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Form_modificar_clientes().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_buscar;
    private javax.swing.JButton btn_cancelar1;
    private javax.swing.JButton btn_editar;
    private javax.swing.JButton btn_eliminar;
    private javax.swing.JButton btn_guardar;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JComboBox cbo_day;
    private javax.swing.JComboBox cbo_month;
    private javax.swing.JComboBox cbo_year;
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
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JRadioButton radio_femenino;
    private javax.swing.JRadioButton radio_masculino;
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
