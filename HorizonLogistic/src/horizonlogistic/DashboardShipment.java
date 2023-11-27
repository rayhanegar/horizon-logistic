/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package horizonlogistic;

import java.awt.Component;
import java.sql.*;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;
import javax.swing.DefaultComboBoxModel;
import javax.swing.ButtonGroup;


/**
 *
 * @author RAYHAN EGAR
 */
public class DashboardShipment extends javax.swing.JFrame {
    
    private String connectionUrl = "jdbc:sqlserver://HASHBROWN:1433;"
                + "database=Horizon_Logistic;"
                + "user=sa;"
                + "password=basisdata;"
                + "encrypt=false;"
                + "trustServerCertificate=false;"
                + "loginTimeout=30;";
    
    private ResultSet resultSet = null;
    private Connection connection;
    private Statement statement;
    private PreparedStatement preparedStatement;
    private Map<String, JTextField> jtfMap;
    private Map<String, JLabel> jlMap;
    private String section;
    private String email_cust;
    private int fieldCount;
    
    /**
     * Creates new form DashboardAdmin
     */
    public DashboardShipment() {
        initComponents();
        setLocationRelativeTo(null);
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jpSidebar = new javax.swing.JPanel();
        jlSidebarTitle = new javax.swing.JLabel();
        jbtnBackMenu = new javax.swing.JButton();
        jlSidebarTitle1 = new javax.swing.JLabel();
        jlSidebarTitle3 = new javax.swing.JLabel();
        jlSidebarTitle4 = new javax.swing.JLabel();
        jlSidebarTitle5 = new javax.swing.JLabel();
        jpContent = new javax.swing.JPanel();
        jbtnMakeShipment = new javax.swing.JButton();
        jpContent1 = new javax.swing.JPanel();
        jTextField6 = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jlSidebarTitle6 = new javax.swing.JLabel();
        jbtnMakeShipment1 = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jTextField7 = new javax.swing.JTextField();
        jTextField8 = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jTextField9 = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jTextField10 = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jTextField11 = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jLabel13 = new javax.swing.JLabel();
        jlSidebarTitle7 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Horizon Logistic");
        setLocation(new java.awt.Point(0, 0));
        setPreferredSize(new java.awt.Dimension(1000, 600));
        setResizable(false);

        jpSidebar.setBackground(new java.awt.Color(255, 255, 255));
        jpSidebar.setFocusable(false);
        jpSidebar.setPreferredSize(new java.awt.Dimension(250, 600));

        jlSidebarTitle.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jlSidebarTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlSidebarTitle.setText("DASHBOARD");
        jlSidebarTitle.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jlSidebarTitle.setVerticalTextPosition(javax.swing.SwingConstants.TOP);

        jbtnBackMenu.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jbtnBackMenu.setText("Back to Menu");
        jbtnBackMenu.setPreferredSize(new java.awt.Dimension(150, 30));
        jbtnBackMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnBackMenuActionPerformed(evt);
            }
        });

        jlSidebarTitle1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jlSidebarTitle1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlSidebarTitle1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/horizonlogistic/Horizon Logistic Logo Resize.png"))); // NOI18N
        jlSidebarTitle1.setText("Horizon Logistic");
        jlSidebarTitle1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jlSidebarTitle1.setVerticalTextPosition(javax.swing.SwingConstants.TOP);

        jlSidebarTitle3.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jlSidebarTitle3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlSidebarTitle3.setText("==============");
        jlSidebarTitle3.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jlSidebarTitle3.setVerticalTextPosition(javax.swing.SwingConstants.TOP);

        jlSidebarTitle4.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jlSidebarTitle4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlSidebarTitle4.setText("==============");
        jlSidebarTitle4.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jlSidebarTitle4.setVerticalTextPosition(javax.swing.SwingConstants.TOP);

        jlSidebarTitle5.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jlSidebarTitle5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlSidebarTitle5.setText("SHIPMENT");
        jlSidebarTitle5.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jlSidebarTitle5.setVerticalTextPosition(javax.swing.SwingConstants.TOP);

        javax.swing.GroupLayout jpSidebarLayout = new javax.swing.GroupLayout(jpSidebar);
        jpSidebar.setLayout(jpSidebarLayout);
        jpSidebarLayout.setHorizontalGroup(
            jpSidebarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpSidebarLayout.createSequentialGroup()
                .addGap(49, 49, 49)
                .addComponent(jbtnBackMenu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jpSidebarLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jpSidebarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jlSidebarTitle3, javax.swing.GroupLayout.DEFAULT_SIZE, 238, Short.MAX_VALUE)
                    .addComponent(jlSidebarTitle, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jlSidebarTitle4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jlSidebarTitle1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
            .addGroup(jpSidebarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jpSidebarLayout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jlSidebarTitle5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addContainerGap()))
        );
        jpSidebarLayout.setVerticalGroup(
            jpSidebarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpSidebarLayout.createSequentialGroup()
                .addGap(61, 61, 61)
                .addComponent(jlSidebarTitle1)
                .addGap(18, 18, 18)
                .addComponent(jlSidebarTitle4)
                .addGap(44, 44, 44)
                .addComponent(jlSidebarTitle)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jlSidebarTitle3)
                .addGap(66, 66, 66)
                .addComponent(jbtnBackMenu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jpSidebarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jpSidebarLayout.createSequentialGroup()
                    .addGap(263, 263, 263)
                    .addComponent(jlSidebarTitle5)
                    .addContainerGap(392, Short.MAX_VALUE)))
        );

        jpContent.setBackground(new java.awt.Color(255, 255, 255));
        jpContent.setPreferredSize(new java.awt.Dimension(600, 100));

        jbtnMakeShipment.setBackground(new java.awt.Color(255, 255, 0));
        jbtnMakeShipment.setFont(new java.awt.Font("Segoe UI", 2, 18)); // NOI18N
        jbtnMakeShipment.setText("Make Your Shipment");
        jbtnMakeShipment.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnMakeShipmentActionPerformed(evt);
            }
        });

        jpContent1.setBackground(new java.awt.Color(255, 255, 255));
        jpContent1.setPreferredSize(new java.awt.Dimension(600, 100));

        jTextField6.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        jTextField6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField6ActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel6.setText("Jalan");

        jlSidebarTitle6.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jlSidebarTitle6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlSidebarTitle6.setText("Please fill in the required data below!");
        jlSidebarTitle6.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jlSidebarTitle6.setVerticalTextPosition(javax.swing.SwingConstants.TOP);

        jbtnMakeShipment1.setBackground(new java.awt.Color(255, 255, 0));
        jbtnMakeShipment1.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        jbtnMakeShipment1.setText("Make My Shipment");
        jbtnMakeShipment1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnMakeShipment1ActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel7.setText("Kota");

        jTextField7.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        jTextField7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField7ActionPerformed(evt);
            }
        });

        jTextField8.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        jTextField8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField8ActionPerformed(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel8.setText("Negara");

        jTextField9.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        jTextField9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField9ActionPerformed(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel9.setText("Kode Pos / Zipcode");

        jLabel10.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel10.setText("Berat");

        jTextField10.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        jTextField10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField10ActionPerformed(evt);
            }
        });

        jLabel11.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel11.setText("Deskripsi");

        jTextField11.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        jTextField11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField11ActionPerformed(evt);
            }
        });

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        jLabel13.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel13.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel13.setText("Ukuran / Dimensi");

        jlSidebarTitle7.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jlSidebarTitle7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlSidebarTitle7.setText("Make the delivery you want.");
        jlSidebarTitle7.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jlSidebarTitle7.setVerticalTextPosition(javax.swing.SwingConstants.TOP);

        javax.swing.GroupLayout jpContent1Layout = new javax.swing.GroupLayout(jpContent1);
        jpContent1.setLayout(jpContent1Layout);
        jpContent1Layout.setHorizontalGroup(
            jpContent1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpContent1Layout.createSequentialGroup()
                .addGap(94, 94, 94)
                .addGroup(jpContent1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(jpContent1Layout.createSequentialGroup()
                        .addGroup(jpContent1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jpContent1Layout.createSequentialGroup()
                                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jTextField6, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jpContent1Layout.createSequentialGroup()
                                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jTextField8, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jpContent1Layout.createSequentialGroup()
                                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jTextField7, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jpContent1Layout.createSequentialGroup()
                                .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jTextField10, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jpContent1Layout.createSequentialGroup()
                                .addComponent(jLabel13, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(18, 18, 18)
                                .addComponent(jTextField11, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(122, 122, 122))
                    .addGroup(jpContent1Layout.createSequentialGroup()
                        .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jTextField9, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(121, 121, 121))
                    .addGroup(jpContent1Layout.createSequentialGroup()
                        .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(jpContent1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jbtnMakeShipment1)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 314, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpContent1Layout.createSequentialGroup()
                .addGap(0, 129, Short.MAX_VALUE)
                .addComponent(jlSidebarTitle6, javax.swing.GroupLayout.PREFERRED_SIZE, 519, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(96, 96, 96))
            .addGroup(jpContent1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpContent1Layout.createSequentialGroup()
                    .addContainerGap(126, Short.MAX_VALUE)
                    .addComponent(jlSidebarTitle7, javax.swing.GroupLayout.PREFERRED_SIZE, 519, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(99, 99, 99)))
        );
        jpContent1Layout.setVerticalGroup(
            jpContent1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpContent1Layout.createSequentialGroup()
                .addGap(94, 94, 94)
                .addComponent(jlSidebarTitle6)
                .addGap(18, 18, 18)
                .addGroup(jpContent1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField6, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jpContent1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField7, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jpContent1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField8, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jpContent1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField9, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jpContent1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField10, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jpContent1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField11, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel13, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jpContent1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane1)
                    .addComponent(jLabel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jbtnMakeShipment1)
                .addContainerGap(335, Short.MAX_VALUE))
            .addGroup(jpContent1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jpContent1Layout.createSequentialGroup()
                    .addGap(51, 51, 51)
                    .addComponent(jlSidebarTitle7)
                    .addContainerGap(742, Short.MAX_VALUE)))
        );

        javax.swing.GroupLayout jpContentLayout = new javax.swing.GroupLayout(jpContent);
        jpContent.setLayout(jpContentLayout);
        jpContentLayout.setHorizontalGroup(
            jpContentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpContentLayout.createSequentialGroup()
                .addGap(291, 291, 291)
                .addComponent(jbtnMakeShipment)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(jpContent1, javax.swing.GroupLayout.DEFAULT_SIZE, 744, Short.MAX_VALUE)
        );
        jpContentLayout.setVerticalGroup(
            jpContentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpContentLayout.createSequentialGroup()
                .addComponent(jpContent1, javax.swing.GroupLayout.PREFERRED_SIZE, 825, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jbtnMakeShipment)
                .addGap(80, 80, 80))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jpSidebar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jpContent, javax.swing.GroupLayout.DEFAULT_SIZE, 744, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jpSidebar, javax.swing.GroupLayout.DEFAULT_SIZE, 687, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jpContent, javax.swing.GroupLayout.PREFERRED_SIZE, 687, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
 
    private void jbtnBackMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnBackMenuActionPerformed
        CustomerMenu CM = new CustomerMenu(email_cust);
        CM.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jbtnBackMenuActionPerformed

    private void jTextField11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField11ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField11ActionPerformed

    private void jTextField10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField10ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField10ActionPerformed

    private void jTextField9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField9ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField9ActionPerformed

    private void jTextField8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField8ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField8ActionPerformed

    private void jTextField7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField7ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField7ActionPerformed

    private void jbtnMakeShipment1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnMakeShipment1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jbtnMakeShipment1ActionPerformed

    private void jTextField6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField6ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField6ActionPerformed

    private void jbtnMakeShipmentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnMakeShipmentActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jbtnMakeShipmentActionPerformed

    private boolean checkEmpty() {
        for (int i = 0; i < fieldCount; i++) {
            String textFieldAccessor = "jtfField" + Integer.toString(i+1);
            if (jtfMap.get(textFieldAccessor).getText().trim().isEmpty()) {
                return true;
            }
        }
        return false;
    }
    private void connectQuery(String sqlQuery){
        try {
            connection = DriverManager.getConnection(connectionUrl);
            statement = connection.createStatement();
            resultSet = statement.executeQuery(sqlQuery);
        } catch (SQLException e){
            e.printStackTrace();
        }
    }
    
    private String[] extractData(JTable table, int row, int col){
        int colCount = table.getColumnCount();
        String[] extracted = new String[colCount-1]; // -1 to exclude button
        try {
            for (int i = 0; i<colCount-1; i++){
            extracted[i] = table.getValueAt(row, i).toString();
            System.out.println(extracted[i]);
        }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return extracted;
    }  

    /**
     * @param args the command line arguments
     */
//    public static void main(String args[]) {
//        /* Set the Nimbus look and feel */
//        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
//        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
//         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
//         */
//        try {
//            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
//                if ("Nimbus".equals(info.getName())) {
//                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
//                    break;
//                }
//            }
//        } catch (ClassNotFoundException ex) {
//            java.util.logging.Logger.getLogger(DashboardShipment.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (InstantiationException ex) {
//            java.util.logging.Logger.getLogger(DashboardShipment.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (IllegalAccessException ex) {
//            java.util.logging.Logger.getLogger(DashboardShipment.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
//            java.util.logging.Logger.getLogger(DashboardShipment.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        }
//        //</editor-fold>
//        /* Create and display the form */
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                new DashboardShipment().setVisible(false);
//                new LoginForm().setVisible(true);
//            }
//        });
//    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextField jTextField10;
    private javax.swing.JTextField jTextField11;
    private javax.swing.JTextField jTextField6;
    private javax.swing.JTextField jTextField7;
    private javax.swing.JTextField jTextField8;
    private javax.swing.JTextField jTextField9;
    private javax.swing.JButton jbtnBackMenu;
    private javax.swing.JButton jbtnMakeShipment;
    private javax.swing.JButton jbtnMakeShipment1;
    private javax.swing.JLabel jlSidebarTitle;
    private javax.swing.JLabel jlSidebarTitle1;
    private javax.swing.JLabel jlSidebarTitle3;
    private javax.swing.JLabel jlSidebarTitle4;
    private javax.swing.JLabel jlSidebarTitle5;
    private javax.swing.JLabel jlSidebarTitle6;
    private javax.swing.JLabel jlSidebarTitle7;
    private javax.swing.JPanel jpContent;
    private javax.swing.JPanel jpContent1;
    private javax.swing.JPanel jpSidebar;
    // End of variables declaration//GEN-END:variables
}
