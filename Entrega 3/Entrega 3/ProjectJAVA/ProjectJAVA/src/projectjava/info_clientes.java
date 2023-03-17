/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package projectjava;
import clases.Conexion;
import com.itextpdf.text.Chunk;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.sql.*;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import com.itextpdf.text.Document;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;
import java.io.FileOutputStream;


import projectjava.Gestion_clientes;
import static projectjava.Gestion_clientes.ID_update;

/**
 *
 * @author Tomi Altero
 */
public class info_clientes extends javax.swing.JFrame {
    
    int id_cliente = Gestion_clientes.ID_update;
    DefaultTableModel modelo = new DefaultTableModel();

    /**
     * Creates new form info_clientes
     */
    public info_clientes() {
        initComponents();
        
        try {
            Connection cn = Conexion.conectar();
            PreparedStatement pst = cn.prepareStatement("select * from clientes where ID = '" + id_cliente + "'" );
            ResultSet rs = pst.executeQuery();
            
            if(rs.next()) {
                
                txt_name.setText(rs.getString("Nombre"));
                txt_mail.setText(rs.getString("Mail"));
                txt_telefono.setText(rs.getString("Telefono"));
                txt_dir.setText(rs.getString("Direccion"));
                
                
            
            }
            cn.close();
        } catch (Exception e) {
            
            JOptionPane.showMessageDialog(null, "Error al mostrar datos");
        }
        
        try {
            Connection cn = Conexion.conectar();
            PreparedStatement pst = cn.prepareStatement("select ID , Tipo_sistema , Precio , Tipo_lenguaje, Estatus from actividades where id_cliente = '" + id_cliente + "'");
            ResultSet rs = pst.executeQuery();
            
            tbl_equipos = new JTable(modelo);
            jScrollPane1.setViewportView(tbl_equipos);
            
            modelo.addColumn("ID");
            modelo.addColumn("Tipo de sistema");
            modelo.addColumn("Precio");
            modelo.addColumn("Lenguaje");
            modelo.addColumn("Estatus");
            
            
            while(rs.next()) {
                Object[] fila = new Object[5];
                
                for(int i = 0; i < 5; i ++) {
                
                   fila[i] = rs.getObject(i + 1);
                }
                modelo.addRow(fila);
            
            }
            cn.close();

        } catch (Exception e) {
            
            JOptionPane.showMessageDialog(null, "Error para rellenar datos en la tabla");
        }
        
            tbl_equipos.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e){
                int fila_point = tbl_equipos.rowAtPoint(e.getPoint());
                int columna_point = 0;
                
                if(fila_point > -1){
                    ID_update = (int)modelo.getValueAt(fila_point, columna_point);
                    info_proyectos v = new info_proyectos();
                    v.setVisible(true);
                    
                    
                }
            }
        });
        
        
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
        jButton4 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        txt_name = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txt_telefono = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txt_dir = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbl_equipos = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        txt_mail = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(0, 0, 255));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("INFORMACION DEL CLIENTE");

        jButton4.setBackground(new java.awt.Color(0, 0, 255));
        jButton4.setText("X");
        jButton4.setBorder(null);
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(266, 266, 266)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 256, Short.MAX_VALUE)
                .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(jLabel1)
                .addContainerGap(42, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 799, -1));

        jLabel2.setBackground(new java.awt.Color(0, 0, 0));
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("Nombre: ");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 119, 62, -1));

        txt_name.setBackground(new java.awt.Color(255, 255, 255));
        txt_name.setForeground(new java.awt.Color(0, 0, 0));
        txt_name.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        getContentPane().add(txt_name, new org.netbeans.lib.awtextra.AbsoluteConstraints(74, 116, 200, -1));

        jLabel3.setBackground(new java.awt.Color(0, 0, 0));
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("Mail:");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 200, 62, -1));

        txt_telefono.setBackground(new java.awt.Color(255, 255, 255));
        txt_telefono.setForeground(new java.awt.Color(0, 0, 0));
        txt_telefono.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        getContentPane().add(txt_telefono, new org.netbeans.lib.awtextra.AbsoluteConstraints(74, 270, 200, -1));

        jLabel4.setBackground(new java.awt.Color(0, 0, 0));
        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setText("Telefono:");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 273, 62, -1));

        txt_dir.setBackground(new java.awt.Color(255, 255, 255));
        txt_dir.setForeground(new java.awt.Color(0, 0, 0));
        txt_dir.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        getContentPane().add(txt_dir, new org.netbeans.lib.awtextra.AbsoluteConstraints(74, 344, 200, -1));

        jLabel5.setBackground(new java.awt.Color(0, 0, 0));
        jLabel5.setForeground(new java.awt.Color(0, 0, 0));
        jLabel5.setText("Direccion:");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 347, 62, -1));

        tbl_equipos.setBackground(new java.awt.Color(255, 255, 255));
        tbl_equipos.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        tbl_equipos.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(tbl_equipos);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(292, 116, 501, 250));

        jButton1.setBackground(new java.awt.Color(255, 255, 255));
        jButton1.setForeground(new java.awt.Color(0, 0, 0));
        jButton1.setText("Registrar proyecto");
        jButton1.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(426, 384, 285, 30));

        jButton3.setBackground(new java.awt.Color(255, 255, 255));
        jButton3.setForeground(new java.awt.Color(0, 0, 0));
        jButton3.setText("Registrar datos como PDF");
        jButton3.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(426, 425, 285, 30));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        txt_mail.setBackground(new java.awt.Color(255, 255, 255));
        txt_mail.setForeground(new java.awt.Color(0, 0, 0));
        txt_mail.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        txt_mail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_mailActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(74, 74, 74)
                .addComponent(txt_mail, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(526, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(99, 99, 99)
                .addComponent(txt_mail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(281, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 90, 800, 400));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        Registro_proyecto v = new Registro_proyecto();
        v.setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        this.dispose();
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
            Document documento = new Document();
            
            
            try {
                String ruta = System.getProperty("src/images");
                PdfWriter.getInstance(documento, new FileOutputStream(ruta + txt_name.getText().trim() + ".pdf"));
                
                com.itextpdf.text.Image imagen = com.itextpdf.text.Image.getInstance("src/images/BUSINESS_HELPER_1.png");
                com.itextpdf.text.Image header2 = com.itextpdf.text.Image.getInstance("src/images/BUSINESS_HELPER.png");
                imagen.scaleToFit(650, 200);
                imagen.setAlignment(Chunk.ALIGN_LEFT);
                
                
                
                Paragraph parrafo3 = new Paragraph();
                parrafo3.add("Informacion del cliente" + "\n" + "\n");
                
                
                
                PdfPTable tablaCliente = new PdfPTable(5);
                tablaCliente.addCell("ID");
                tablaCliente.addCell("Nombre");
                tablaCliente.addCell("Mail");
                tablaCliente.addCell("Telefono");
                tablaCliente.addCell("Direccion");
                
                documento.open();
                documento.add(imagen);
                
                try {
                    Connection cn = Conexion.conectar();
                    PreparedStatement pst = cn.prepareStatement("select * from clientes where ID = '" + id_cliente + "'");
                    ResultSet rs = pst.executeQuery();
                    
                    if(rs.next()) {
                        do {
                            tablaCliente.addCell(rs.getString(1));
                            tablaCliente.addCell(rs.getString(2));
                            tablaCliente.addCell(rs.getString(3));
                            tablaCliente.addCell(rs.getString(4));
                            tablaCliente.addCell(rs.getString(5));
                        
                        
                        
                        }while (rs.next());
                            documento.add(tablaCliente);
                    }
                    
                    
                    Paragraph parrafo2 = new Paragraph();
                    parrafo2.setAlignment(Paragraph.ALIGN_CENTER);
                    parrafo2.add("\n \n Proyectos registrados. \n \n");
                    documento.add(parrafo2);
                    
                    PdfPTable tablaProyectos = new PdfPTable(5);
                    tablaProyectos.addCell("ID");
                    tablaProyectos.addCell("Tipo de sistemas");
                    tablaProyectos.addCell("Precio");
                    tablaProyectos.addCell("Lenguaje");
                    tablaProyectos.addCell("Estatus");
                    
                    try {
                        Connection cn2 = Conexion.conectar();
                        
                        PreparedStatement pst2 = cn.prepareStatement("select ID , Tipo_sistema , Precio , Tipo_lenguaje , Estatus from actividades where id_cliente = '" + id_cliente + "'");
                        ResultSet rs2 = pst2.executeQuery();
                        
                        if(rs2.next()) {
                            do {
                                tablaProyectos.addCell(rs2.getString(1));
                                tablaProyectos.addCell(rs2.getString(2));
                                tablaProyectos.addCell(rs2.getString(3));
                                tablaProyectos.addCell(rs2.getString(4));
                                tablaProyectos.addCell(rs2.getString(5));
                                
                            
                            }while(rs2.next());
                            documento.add(tablaProyectos);
                        
                        }
                        
                        
                    } catch (Exception e) {
                        JOptionPane.showMessageDialog(null, "Error al cargar proyectos");
                    }

                    
                } catch (Exception e) {
                    JOptionPane.showMessageDialog(null, "Haz imgresado mal los datos");
                }
            
        } catch (Exception e) {
            JOptionPane.showConfirmDialog(null, "No se a podido crear el PDF");
        }
            
            documento.close();
    }//GEN-LAST:event_jButton3ActionPerformed

    private void txt_mailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_mailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_mailActionPerformed

    /**
     * @param args the command line arguments
     */


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tbl_equipos;
    private javax.swing.JTextField txt_dir;
    private javax.swing.JTextField txt_mail;
    private javax.swing.JTextField txt_name;
    private javax.swing.JTextField txt_telefono;
    // End of variables declaration//GEN-END:variables
}