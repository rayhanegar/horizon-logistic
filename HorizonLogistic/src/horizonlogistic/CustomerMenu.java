package horizonlogistic;
import java.sql.*;
import javax.swing.JOptionPane;

/**
 *
 * @author hasanfadhlillah
 */
public class CustomerMenu extends javax.swing.JFrame {    
    /**
     * Creates new form DashboardForm
     */
    
    public CustomerMenu() {
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

        jPanel1 = new javax.swing.JPanel();
        jlHeaderMenu = new javax.swing.JLabel();
        jBtnNewShipment = new javax.swing.JButton();
        jBtnPayment = new javax.swing.JButton();
        jBtnLogout = new javax.swing.JButton();
        jBtnMyHistory = new javax.swing.JButton();
        jlTitle = new javax.swing.JLabel();
        jBtnMyProfil = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Horizon Logistic");
        setBackground(new java.awt.Color(255, 255, 255));
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setPreferredSize(new java.awt.Dimension(1000, 600));

        jlHeaderMenu.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jlHeaderMenu.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlHeaderMenu.setText("MAIN MENU");
        jlHeaderMenu.setPreferredSize(new java.awt.Dimension(250, 100));
        jlHeaderMenu.setRequestFocusEnabled(false);

        jBtnNewShipment.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jBtnNewShipment.setText("New Shipment");
        jBtnNewShipment.setFocusable(false);
        jBtnNewShipment.setPreferredSize(new java.awt.Dimension(250, 30));
        jBtnNewShipment.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnNewShipmentActionPerformed(evt);
            }
        });

        jBtnPayment.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jBtnPayment.setText("Payment");
        jBtnPayment.setFocusable(false);
        jBtnPayment.setPreferredSize(new java.awt.Dimension(250, 30));
        jBtnPayment.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnPaymentActionPerformed(evt);
            }
        });

        jBtnLogout.setBackground(new java.awt.Color(255, 0, 0));
        jBtnLogout.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jBtnLogout.setForeground(new java.awt.Color(255, 255, 255));
        jBtnLogout.setText("Log Out");
        jBtnLogout.setFocusable(false);
        jBtnLogout.setPreferredSize(new java.awt.Dimension(250, 30));
        jBtnLogout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnLogoutActionPerformed(evt);
            }
        });

        jBtnMyHistory.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jBtnMyHistory.setText("My History");
        jBtnMyHistory.setFocusable(false);
        jBtnMyHistory.setPreferredSize(new java.awt.Dimension(250, 30));
        jBtnMyHistory.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnMyHistoryActionPerformed(evt);
            }
        });

        jlTitle.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jlTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlTitle.setIcon(new javax.swing.ImageIcon(getClass().getResource("/horizonlogistic/Horizon Logistic Logo Resize.png"))); // NOI18N
        jlTitle.setText("Horizon Logistic");
        jlTitle.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jlTitle.setVerticalTextPosition(javax.swing.SwingConstants.TOP);

        jBtnMyProfil.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jBtnMyProfil.setText("My Profil");
        jBtnMyProfil.setFocusable(false);
        jBtnMyProfil.setPreferredSize(new java.awt.Dimension(250, 30));
        jBtnMyProfil.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnMyProfilActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(532, 532, 532)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(50, 50, 50)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jBtnNewShipment, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jBtnPayment, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jBtnMyHistory, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jBtnMyProfil, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jBtnLogout, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(jlHeaderMenu, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(582, 582, 582)
                        .addComponent(jlTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 249, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(118, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(65, 65, 65)
                .addComponent(jlTitle)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jlHeaderMenu, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jBtnNewShipment, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jBtnPayment, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jBtnMyHistory, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jBtnMyProfil, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jBtnLogout, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(114, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jBtnPaymentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnPaymentActionPerformed
        
    }//GEN-LAST:event_jBtnPaymentActionPerformed

    private void jBtnNewShipmentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnNewShipmentActionPerformed
        DashboardShipment DS = new DashboardShipment();
        DS.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jBtnNewShipmentActionPerformed

    private void jBtnLogoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnLogoutActionPerformed
        int responseLogout = JOptionPane.showConfirmDialog(this, "Do you want to log out?", "Confirm Log Out", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
        if(responseLogout == JOptionPane.YES_OPTION){
            LoginForm LF = new LoginForm();
            LF.setVisible(true);
            this.dispose();
        }else if(responseLogout == JOptionPane.NO_OPTION){
 
        }else if(responseLogout == JOptionPane.CLOSED_OPTION){

        }
    }//GEN-LAST:event_jBtnLogoutActionPerformed

    private void jBtnMyHistoryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnMyHistoryActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jBtnMyHistoryActionPerformed

    private void jBtnMyProfilActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnMyProfilActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jBtnMyProfilActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CustomerMenu().setVisible(true);
                new DashboardAdmin().setVisible(false);
            }
        });
        
        String connectionUrl =
                "jdbc:sqlserver://HASANFADHLILLAH:1433;"
                + "database=Horizon_Logistic;"
                + "user=sa;"
                + "password=sannskuy;"
                + "encrypt=false;"
                + "trustServerCertificate=false;"
                + "loginTimeout=30;";

        ResultSet setResult = null;

        try (Connection connection = DriverManager.getConnection(connectionUrl);) {
            System.out.println("Yeay, Connected successfully!");
        }
        catch (SQLException e) {
            e.printStackTrace();
            System.out.println("Sorry, Connection failed :)");
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBtnLogout;
    private javax.swing.JButton jBtnMyHistory;
    private javax.swing.JButton jBtnMyProfil;
    private javax.swing.JButton jBtnNewShipment;
    private javax.swing.JButton jBtnPayment;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel jlHeaderMenu;
    private javax.swing.JLabel jlTitle;
    // End of variables declaration//GEN-END:variables
}