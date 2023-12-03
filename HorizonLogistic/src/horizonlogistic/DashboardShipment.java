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
import java.util.Calendar;


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
    private String id_customer;
    private int fieldCount;
    
    /**
     * Creates new form DashboardAdmin
     */
    public DashboardShipment(String email_cust) {
        initComponents();
        setLocationRelativeTo(null);
        this.email_cust = email_cust;
        obtainCustomerID(this.email_cust);
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
        jtfJalan = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jlSidebarTitle6 = new javax.swing.JLabel();
        jbtnMakeShipment1 = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jtfKota = new javax.swing.JTextField();
        jtfNegara = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jtfZipcode = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jtfBerat = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jtfDimensi = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtaDeskripsi = new javax.swing.JTextArea();
        jLabel13 = new javax.swing.JLabel();
        jlSidebarTitle7 = new javax.swing.JLabel();
        jtfJarak = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();

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

        jtfJalan.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        jtfJalan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtfJalanActionPerformed(evt);
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

        jtfKota.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        jtfKota.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtfKotaActionPerformed(evt);
            }
        });

        jtfNegara.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        jtfNegara.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtfNegaraActionPerformed(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel8.setText("Negara");

        jtfZipcode.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        jtfZipcode.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtfZipcodeActionPerformed(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel9.setText("Kode Pos / Zipcode");

        jLabel10.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel10.setText("Berat");

        jtfBerat.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        jtfBerat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtfBeratActionPerformed(evt);
            }
        });

        jLabel11.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel11.setText("Deskripsi");

        jtfDimensi.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        jtfDimensi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtfDimensiActionPerformed(evt);
            }
        });

        jtaDeskripsi.setColumns(20);
        jtaDeskripsi.setRows(5);
        jScrollPane1.setViewportView(jtaDeskripsi);

        jLabel13.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel13.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel13.setText("Ukuran / Dimensi");

        jlSidebarTitle7.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jlSidebarTitle7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlSidebarTitle7.setText("Make the delivery you want.");
        jlSidebarTitle7.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jlSidebarTitle7.setVerticalTextPosition(javax.swing.SwingConstants.TOP);

        jtfJarak.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        jtfJarak.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtfJarakActionPerformed(evt);
            }
        });

        jLabel14.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel14.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel14.setText("Jarak");

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
                                .addComponent(jLabel13, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(18, 18, 18)
                                .addComponent(jtfDimensi, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jpContent1Layout.createSequentialGroup()
                                .addGap(46, 46, 46)
                                .addGroup(jpContent1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(jpContent1Layout.createSequentialGroup()
                                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(jtfJalan, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jpContent1Layout.createSequentialGroup()
                                        .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(jtfNegara, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jpContent1Layout.createSequentialGroup()
                                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(jtfKota, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jpContent1Layout.createSequentialGroup()
                                        .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(jtfBerat, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(jpContent1Layout.createSequentialGroup()
                                .addComponent(jLabel14, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(18, 18, 18)
                                .addComponent(jtfJarak, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(122, 122, 122))
                    .addGroup(jpContent1Layout.createSequentialGroup()
                        .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jtfZipcode, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE)
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
                    .addComponent(jtfJalan, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jpContent1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jtfKota, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jpContent1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jtfNegara, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jpContent1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jtfZipcode, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jpContent1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jtfBerat, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jpContent1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jtfDimensi, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel13, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jpContent1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel14, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jtfJarak, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jpContent1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel11, javax.swing.GroupLayout.DEFAULT_SIZE, 55, Short.MAX_VALUE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jbtnMakeShipment1)
                .addContainerGap(328, Short.MAX_VALUE))
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

    private void jtfDimensiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtfDimensiActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtfDimensiActionPerformed

    private void jtfBeratActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtfBeratActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtfBeratActionPerformed

    private void jtfZipcodeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtfZipcodeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtfZipcodeActionPerformed

    private void jtfNegaraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtfNegaraActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtfNegaraActionPerformed

    private void jtfKotaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtfKotaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtfKotaActionPerformed

    private void jbtnMakeShipment1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnMakeShipment1ActionPerformed
        // TODO add your handling code here:
        if(!checkEmpty()){
            try {
                connection = DriverManager.getConnection(connectionUrl);
                String preparedString = "INSERT INTO shipment(id_shipment, jalan, kota, negara, zipcode, berat, waktu_masuk, dimensi, deskripsi, jarak, id_delivery_leg, id_customer, id_droppoint)"
                        + " VALUES(990120, ?, ?, ?, ?, ?, GETDATE(), ?, ?, ?, 99765, ?, 33765)";
                PreparedStatement prepareStatement = connection.prepareStatement(preparedString);
                prepareStatement.setString(1, jtfJalan.getText());
                prepareStatement.setString(2, jtfKota.getText());
                prepareStatement.setString(3, jtfNegara.getText());
                prepareStatement.setString(4, jtfZipcode.getText());
                prepareStatement.setFloat(5, Float.parseFloat(jtfBerat.getText()));
//                java.util.Date currentDate = new java.util.Date();
//                java.sql.Timestamp timestamp = new java.sql.Timestamp(currentDate.getTime());
//                prepareStatement.setTimestamp(6, timestamp);
                prepareStatement.setFloat(6, Float.parseFloat(jtfDimensi.getText()));
                prepareStatement.setString(7, jtaDeskripsi.getText());
                prepareStatement.setFloat(8, Float.parseFloat(jtfJarak.getText()));
                prepareStatement.setString(9, this.id_customer);
                prepareStatement.executeUpdate();
                
                String paymentString = "INSERT INTO payment(id_payment, insurance_amount, fee_berat, fee_jarak, id_shipment)"
                        + " VALUES(89775, 100000, 200000, 200000, 990120)";
                Statement paymentStatement = connection.createStatement();
                paymentStatement.executeUpdate(paymentString);
                
                System.out.println("Successfully create a new shipment and payment.");
                JOptionPane.showMessageDialog(this, "Successfully create a new shipment and payment.", "New Shipment Made!", JOptionPane.INFORMATION_MESSAGE);
                
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }//GEN-LAST:event_jbtnMakeShipment1ActionPerformed

    private void jtfJalanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtfJalanActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtfJalanActionPerformed

    private void jbtnMakeShipmentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnMakeShipmentActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jbtnMakeShipmentActionPerformed

    private void jtfJarakActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtfJarakActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtfJarakActionPerformed

    private void obtainCustomerID(String email_cust){
        try{
            connection = DriverManager.getConnection(connectionUrl);
            PreparedStatement obtainQuery = connection.prepareStatement("SELECT id_customer FROM customer WHERE email_cust = ?");
            obtainQuery.setString(1, email_cust);
            ResultSet customer_id = obtainQuery.executeQuery();
            
            if(customer_id.next()){
                this.id_customer = customer_id.getString(1);
                System.out.println(this.id_customer);
            } else {
                System.out.println("Customer ID not found.");
            }
            
        } catch (SQLException e ){
            e.printStackTrace();
        }
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

    private boolean checkEmpty(){
        if (jtfJalan.getText().trim().isEmpty() || 
                jtfBerat.getText().trim().isEmpty() ||
                jtfDimensi.getText().trim().isEmpty() ||
                jtfKota.getText().trim().isEmpty() ||
                jtfNegara.getText().trim().isEmpty()  ||
                jtfZipcode.getText().trim().isEmpty() ||
                jtfJarak.getText().trim().isEmpty() ||
                jtaDeskripsi.getText().trim().isEmpty()) 
        {
            return true;
        } else {
            return false;
        }
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
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
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
    private javax.swing.JTextArea jtaDeskripsi;
    private javax.swing.JTextField jtfBerat;
    private javax.swing.JTextField jtfDimensi;
    private javax.swing.JTextField jtfJalan;
    private javax.swing.JTextField jtfJarak;
    private javax.swing.JTextField jtfKota;
    private javax.swing.JTextField jtfNegara;
    private javax.swing.JTextField jtfZipcode;
    // End of variables declaration//GEN-END:variables
}
