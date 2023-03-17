/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package projectjava;
import clases.Conexion;
import java.sql.*;
import java.util.Calendar;
import javax.swing.JOptionPane;
/**
 *
 * @author Tomi Altero
 */
public class Registro_proyecto extends javax.swing.JFrame {
        int id_update = 0;
        String user = "" , nom_cliente = "";
    

    /**
     * Creates new form Registro_proyecto
     */
    public Registro_proyecto() {
        initComponents();
        user = Login.user;
        id_update = Gestion_clientes.ID_update;
        setTitle("SESION DE: " +user);
        
        
        try {
            Connection cn = Conexion.conectar();
            PreparedStatement pst = cn.prepareStatement("select Nombre from clientes where ID = '" + id_update + "'");
            ResultSet rs = pst.executeQuery();  
            
            if (rs.next()) {
                nom_cliente = rs.getString("Nombre");
            
            }
        } catch (SQLException e) {
            
            JOptionPane.showConfirmDialog(null, "Error al consultar nombre del cliente");
        
        }
        jTextField1.setText(nom_cliente);
    
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        cmb_tipo_sistema = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        txt_precio = new javax.swing.JTextField();
        jComboBox2 = new javax.swing.JComboBox<>();
        jLabel5 = new javax.swing.JLabel();
        txt_dirigido = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txt_proposito = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        txt_func = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        txt_exp = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        cmb_tipoLenguaje = new javax.swing.JComboBox<>();
        jPanel2 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        setUndecorated(true);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(0, 0, 255));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("REGISTRO DE PROYECTO");

        jButton2.setBackground(new java.awt.Color(0, 0, 255));
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setText("X");
        jButton2.setBorder(null);
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(315, 315, 315)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 224, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(362, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(95, 95, 95))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1)
                .addGap(39, 39, 39))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 901, -1));

        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("Nombre del cliente:");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 130, 123, -1));

        jTextField1.setBackground(new java.awt.Color(255, 255, 255));
        jTextField1.setForeground(new java.awt.Color(0, 0, 0));
        jTextField1.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        getContentPane().add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(135, 127, 246, -1));

        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("Tipo de Sistema:");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 181, 100, -1));

        cmb_tipo_sistema.setBackground(new java.awt.Color(0, 0, 255));
        cmb_tipo_sistema.setForeground(new java.awt.Color(255, 255, 255));
        cmb_tipo_sistema.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Pagina WEB", "IA(Inteligencia Artificial)", "Sistema de escritorio", "Videojuego" }));
        cmb_tipo_sistema.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        cmb_tipo_sistema.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmb_tipo_sistemaActionPerformed(evt);
            }
        });
        getContentPane().add(cmb_tipo_sistema, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 203, -1, -1));

        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setText("Precio:");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 254, 100, -1));

        txt_precio.setBackground(new java.awt.Color(255, 255, 255));
        txt_precio.setForeground(new java.awt.Color(0, 0, 0));
        txt_precio.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        getContentPane().add(txt_precio, new org.netbeans.lib.awtextra.AbsoluteConstraints(131, 251, 160, -1));

        jComboBox2.setBackground(new java.awt.Color(0, 0, 255));
        jComboBox2.setForeground(new java.awt.Color(255, 255, 255));
        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "ARS", "USD", "EUR" }));
        jComboBox2.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        getContentPane().add(jComboBox2, new org.netbeans.lib.awtextra.AbsoluteConstraints(309, 251, -1, -1));

        jLabel5.setForeground(new java.awt.Color(0, 0, 0));
        jLabel5.setText("Para quien va dirigido");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 417, 236, -1));

        txt_dirigido.setBackground(new java.awt.Color(255, 255, 255));
        txt_dirigido.setForeground(new java.awt.Color(0, 0, 0));
        txt_dirigido.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        getContentPane().add(txt_dirigido, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 439, 267, 139));

        jLabel6.setForeground(new java.awt.Color(0, 0, 0));
        jLabel6.setText("Cual es el propósito");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(496, 127, 227, -1));

        txt_proposito.setBackground(new java.awt.Color(255, 255, 255));
        txt_proposito.setForeground(new java.awt.Color(0, 0, 0));
        txt_proposito.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        txt_proposito.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_propositoActionPerformed(evt);
            }
        });
        getContentPane().add(txt_proposito, new org.netbeans.lib.awtextra.AbsoluteConstraints(496, 155, 250, 126));

        jLabel7.setForeground(new java.awt.Color(0, 0, 0));
        jLabel7.setText("Nombrar las principales funcionalidades");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(496, 319, 250, -1));

        txt_func.setBackground(new java.awt.Color(255, 255, 255));
        txt_func.setForeground(new java.awt.Color(0, 0, 0));
        txt_func.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        txt_func.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_funcActionPerformed(evt);
            }
        });
        getContentPane().add(txt_func, new org.netbeans.lib.awtextra.AbsoluteConstraints(496, 347, 250, 126));

        jLabel8.setForeground(new java.awt.Color(0, 0, 0));
        jLabel8.setText("Explicacion principal");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 319, 267, -1));

        txt_exp.setBackground(new java.awt.Color(255, 255, 255));
        txt_exp.setForeground(new java.awt.Color(0, 0, 0));
        txt_exp.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        getContentPane().add(txt_exp, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 345, 246, -1));

        jLabel9.setBackground(new java.awt.Color(0, 0, 0));
        jLabel9.setForeground(new java.awt.Color(0, 0, 0));
        jLabel9.setText("Tipo lenguaje:");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(508, 491, -1, -1));

        cmb_tipoLenguaje.setBackground(new java.awt.Color(0, 0, 255));
        cmb_tipoLenguaje.setForeground(new java.awt.Color(255, 255, 255));
        cmb_tipoLenguaje.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Python", "JavaScript", "JAVA", "C++", "C#", "Swift" }));
        cmb_tipoLenguaje.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        getContentPane().add(cmb_tipoLenguaje, new org.netbeans.lib.awtextra.AbsoluteConstraints(496, 513, -1, -1));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        jButton1.setBackground(new java.awt.Color(255, 255, 255));
        jButton1.setForeground(new java.awt.Color(0, 0, 0));
        jButton1.setText("Registrar proyecto");
        jButton1.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(518, Short.MAX_VALUE)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(116, 116, 116))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(469, Short.MAX_VALUE)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32))
        );

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 110, 820, 550));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txt_propositoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_propositoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_propositoActionPerformed

    private void txt_funcActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_funcActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_funcActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        int validacion = 0;
        String tipo_sistema , estatus , precio,exp_principal , proj_dir , proposito , princ_func , select_moneda  , mes_register ,dia_register ,age_register, tipo_lenguaje;
        
        tipo_sistema = cmb_tipo_sistema.getSelectedItem().toString();
        select_moneda = jComboBox2.getSelectedItem().toString();
        tipo_lenguaje = cmb_tipoLenguaje.getSelectedItem().toString();
        precio = txt_precio.getText().trim();
        exp_principal = txt_exp.getText().trim();
        proj_dir = txt_dirigido.getText().trim();
        proposito = txt_proposito.getText().trim(); 
        princ_func = txt_func.getText().trim();
        
        estatus = "Nuevo ingreso";
        
        Calendar c = Calendar.getInstance();
        dia_register = Integer.toString(c.get(Calendar.DATE));
        mes_register = Integer.toString(c.get(Calendar.MONTH));
        age_register = Integer.toString(c.get(Calendar.YEAR));
        
        if (precio.equals("")) {
            validacion ++;
        }
        
        if(exp_principal.equals("")) {
            validacion ++;
        
        }
        
        if(proj_dir.equals("")) {
            validacion ++;
        
        }
        
        if (proposito.equals("")) {
            validacion ++;
        
        }
        
        if(princ_func.equals("")) {
            validacion++;
        }
        
        if (validacion == 0) {
            
            try {
                Connection cn = Conexion.conectar();
                
                PreparedStatement pst = cn.prepareStatement("insert into actividades values (? , ? , ? , ? , ? , ? , ? , ? , ? ,? , ? , ? , ?)");
                
                pst.setInt(1, 0);
                pst.setString(2, tipo_sistema);
                pst.setString(3, precio + " " + select_moneda);
                pst.setString(4, estatus);
                pst.setString(5, exp_principal);
                pst.setString(6, proj_dir);
                pst.setString(7, proposito);
                pst.setString(8, princ_func);
                pst.setString(9, tipo_lenguaje);
                pst.setString(10, dia_register);
                pst.setString(11, mes_register);
                pst.setString(12, age_register);
                pst.setInt(13, id_update);
                
                
                
                pst.executeUpdate();
                cn.close();
            
            } catch (SQLException e) {
                System.err.println(e);
                JOptionPane.showConfirmDialog(null, "ERROR al confirmar datos");    
            }
        
            
        }else {
        
            JOptionPane.showMessageDialog(null, "Debes llenar todos los campos de texto");
        }
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        this.dispose();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void cmb_tipo_sistemaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmb_tipo_sistemaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmb_tipo_sistemaActionPerformed

    /**
     * @param args the command line arguments
     */


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> cmb_tipoLenguaje;
    private javax.swing.JComboBox<String> cmb_tipo_sistema;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JComboBox<String> jComboBox2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField txt_dirigido;
    private javax.swing.JTextField txt_exp;
    private javax.swing.JTextField txt_func;
    private javax.swing.JTextField txt_precio;
    private javax.swing.JTextField txt_proposito;
    // End of variables declaration//GEN-END:variables
}