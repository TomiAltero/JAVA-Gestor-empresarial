/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package projectjava;
import clases.Conexion;
import java.sql.*;
import projectjava.Gestion_clientes;

/**
 *
 * @author Tomi Altero
 */
public class info_proyectos extends javax.swing.JFrame {
    int id_update = Gestion_clientes.ID_update;
    
    
    
    /**
     * Creates new form info_proyectos
     */
    public info_proyectos() {
        initComponents();
        
        try {
            Connection cn = Conexion.conectar();
            PreparedStatement pst = cn.prepareStatement("select * from actividades where ID = '" + id_update + "'");
            
            ResultSet rs = pst.executeQuery();
            
            
            if(rs.next()) {
            
                txt_system.setText(rs.getString("Tipo_sistema"));
                txt_precio.setText(rs.getString("Precio"));
                txt_leng.setText(rs.getString("Tipo_lenguaje"));
                txt_dirigido.setText(rs.getString("proj_dirigido"));
                txt_dirigido1.setText(rs.getString("proposito"));
                txt_dirigido2.setText(rs.getString("prin_func"));
                



            }
             
            
        } catch (Exception e) {
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        txt_system = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txt_precio = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txt_leng = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        txt_dirigido = new javax.swing.JTextField();
        txt_dirigido1 = new javax.swing.JTextField();
        txt_dirigido2 = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("Tipo de sistema:");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(26, 124, 104, -1));

        txt_system.setBackground(new java.awt.Color(255, 255, 255));
        txt_system.setForeground(new java.awt.Color(0, 0, 0));
        txt_system.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        getContentPane().add(txt_system, new org.netbeans.lib.awtextra.AbsoluteConstraints(136, 121, 187, -1));

        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("Precio:");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(26, 164, 104, -1));

        txt_precio.setBackground(new java.awt.Color(255, 255, 255));
        txt_precio.setForeground(new java.awt.Color(0, 0, 0));
        txt_precio.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        getContentPane().add(txt_precio, new org.netbeans.lib.awtextra.AbsoluteConstraints(136, 161, 187, -1));

        jLabel5.setForeground(new java.awt.Color(0, 0, 0));
        jLabel5.setText("Para quien va dirigido");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(26, 213, 236, -1));

        jLabel6.setForeground(new java.awt.Color(0, 0, 0));
        jLabel6.setText("Cual es el propósito");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(534, 121, 227, -1));

        jLabel7.setForeground(new java.awt.Color(0, 0, 0));
        jLabel7.setText("Nombrar las principales funcionalidades");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(534, 304, 250, -1));

        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("Tipo de lenguaje:");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(26, 415, 104, -1));

        txt_leng.setBackground(new java.awt.Color(255, 255, 255));
        txt_leng.setForeground(new java.awt.Color(0, 0, 0));
        txt_leng.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        getContentPane().add(txt_leng, new org.netbeans.lib.awtextra.AbsoluteConstraints(136, 412, 187, -1));

        jPanel1.setBackground(new java.awt.Color(0, 0, 255));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("CLIENTE");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(327, 327, 327))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addComponent(jLabel4)
                .addContainerGap(40, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 850, -1));

        txt_dirigido.setBackground(new java.awt.Color(255, 255, 255));
        txt_dirigido.setForeground(new java.awt.Color(0, 0, 0));
        txt_dirigido.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        getContentPane().add(txt_dirigido, new org.netbeans.lib.awtextra.AbsoluteConstraints(26, 247, 267, 139));

        txt_dirigido1.setBackground(new java.awt.Color(255, 255, 255));
        txt_dirigido1.setForeground(new java.awt.Color(0, 0, 0));
        txt_dirigido1.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        getContentPane().add(txt_dirigido1, new org.netbeans.lib.awtextra.AbsoluteConstraints(534, 149, 267, 139));

        txt_dirigido2.setBackground(new java.awt.Color(255, 255, 255));
        txt_dirigido2.setForeground(new java.awt.Color(0, 0, 0));
        txt_dirigido2.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        getContentPane().add(txt_dirigido2, new org.netbeans.lib.awtextra.AbsoluteConstraints(534, 326, 267, 139));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 890, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 420, Short.MAX_VALUE)
        );

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(-10, 90, 890, 420));

        pack();
    }// </editor-fold>//GEN-END:initComponents

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
            java.util.logging.Logger.getLogger(info_proyectos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(info_proyectos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(info_proyectos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(info_proyectos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new info_proyectos().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTextField txt_dirigido;
    private javax.swing.JTextField txt_dirigido1;
    private javax.swing.JTextField txt_dirigido2;
    private javax.swing.JTextField txt_leng;
    private javax.swing.JTextField txt_precio;
    private javax.swing.JTextField txt_system;
    // End of variables declaration//GEN-END:variables
}
