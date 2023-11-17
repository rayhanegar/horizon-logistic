package horizonlogistic;
import java.sql.*;

/**
 *
 * @author hasanfadhlillah
 */
public class LoginForm extends javax.swing.JFrame {    
    /**
     * Creates new form DashboardForm
     */
    public LoginForm() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        adminLoginButton = new javax.swing.JButton();
        jlHeader3 = new javax.swing.JLabel();
        customerLoginButton = new javax.swing.JButton();
        jlHeader8 = new javax.swing.JLabel();
        jlHeader1 = new javax.swing.JLabel();
        jlHeader2 = new javax.swing.JLabel();
        jlHeader4 = new javax.swing.JLabel();
        logoHL = new javax.swing.JLabel();
        emailTxt = new javax.swing.JTextField();
        passwordTxt = new javax.swing.JPasswordField();
        jlHeader9 = new javax.swing.JLabel();
        jlHeader10 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Horizon Logistic");
        setBackground(new java.awt.Color(255, 255, 255));
        setPreferredSize(new java.awt.Dimension(1000, 600));
        setResizable(false);

        adminLoginButton.setBackground(new java.awt.Color(255, 255, 0));
        adminLoginButton.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        adminLoginButton.setText("Log in as Admin");
        adminLoginButton.setFocusable(false);
        adminLoginButton.setPreferredSize(new java.awt.Dimension(250, 30));
        adminLoginButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                adminLoginButtonActionPerformed(evt);
            }
        });

        jlHeader3.setFont(new java.awt.Font("Segoe UI", 1, 48)); // NOI18N
        jlHeader3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlHeader3.setText("LOGISTIC");
        jlHeader3.setPreferredSize(new java.awt.Dimension(250, 100));
        jlHeader3.setRequestFocusEnabled(false);

        customerLoginButton.setBackground(new java.awt.Color(0, 255, 0));
        customerLoginButton.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        customerLoginButton.setText("Log in as Customer");
        customerLoginButton.setFocusable(false);
        customerLoginButton.setPreferredSize(new java.awt.Dimension(250, 30));
        customerLoginButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                customerLoginButtonActionPerformed(evt);
            }
        });

        jlHeader8.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jlHeader8.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jlHeader8.setText("Password");
        jlHeader8.setPreferredSize(new java.awt.Dimension(250, 100));
        jlHeader8.setRequestFocusEnabled(false);

        jlHeader1.setFont(new java.awt.Font("Segoe UI", 2, 18)); // NOI18N
        jlHeader1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlHeader1.setText("Hii! Welcome to");
        jlHeader1.setPreferredSize(new java.awt.Dimension(250, 100));
        jlHeader1.setRequestFocusEnabled(false);

        jlHeader2.setFont(new java.awt.Font("Segoe UI", 1, 48)); // NOI18N
        jlHeader2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlHeader2.setText("HORIZON");
        jlHeader2.setPreferredSize(new java.awt.Dimension(250, 100));
        jlHeader2.setRequestFocusEnabled(false);

        jlHeader4.setFont(new java.awt.Font("Segoe UI", 2, 18)); // NOI18N
        jlHeader4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlHeader4.setText("\"Delivering Hope, Shipping Happiness\"");
        jlHeader4.setPreferredSize(new java.awt.Dimension(250, 100));
        jlHeader4.setRequestFocusEnabled(false);

        logoHL.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Horizon Logistic Logo (transparant).png"))); // NOI18N
        logoHL.setText("jLabel1");

        emailTxt.setFont(new java.awt.Font("Segoe UI", 2, 14)); // NOI18N
        emailTxt.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        emailTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                emailTxtActionPerformed(evt);
            }
        });

        passwordTxt.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        passwordTxt.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        passwordTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                passwordTxtActionPerformed(evt);
            }
        });

        jlHeader9.setFont(new java.awt.Font("Segoe UI", 2, 14)); // NOI18N
        jlHeader9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlHeader9.setText("What would you like to log in as?");
        jlHeader9.setPreferredSize(new java.awt.Dimension(250, 100));
        jlHeader9.setRequestFocusEnabled(false);

        jlHeader10.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jlHeader10.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jlHeader10.setText("Email");
        jlHeader10.setPreferredSize(new java.awt.Dimension(250, 100));
        jlHeader10.setRequestFocusEnabled(false);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(590, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jlHeader1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jlHeader2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(160, 160, 160))
            .addGroup(layout.createSequentialGroup()
                .addGap(70, 70, 70)
                .addComponent(logoHL, javax.swing.GroupLayout.PREFERRED_SIZE, 399, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(73, 73, 73)
                        .addComponent(jlHeader4, javax.swing.GroupLayout.PREFERRED_SIZE, 346, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(adminLoginButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(customerLoginButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jlHeader3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jlHeader9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jlHeader8, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jlHeader10, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(passwordTxt, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 180, Short.MAX_VALUE)
                                    .addComponent(emailTxt, javax.swing.GroupLayout.Alignment.TRAILING))))
                        .addGap(160, 160, 160))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jlHeader1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jlHeader2, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jlHeader3, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jlHeader4, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(60, 60, 60)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(emailTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jlHeader10, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(passwordTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jlHeader8, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(3, 3, 3)
                        .addComponent(jlHeader9, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(customerLoginButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(adminLoginButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(181, 181, 181))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(logoHL, javax.swing.GroupLayout.PREFERRED_SIZE, 504, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(108, 108, 108))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void adminLoginButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_adminLoginButtonActionPerformed
        DashboardAdmin DA = new DashboardAdmin();
        DA.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_adminLoginButtonActionPerformed

    private void customerLoginButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_customerLoginButtonActionPerformed

    }//GEN-LAST:event_customerLoginButtonActionPerformed

    private void emailTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_emailTxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_emailTxtActionPerformed

    private void passwordTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_passwordTxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_passwordTxtActionPerformed

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
                new LoginForm().setVisible(true);
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
    private javax.swing.JButton adminLoginButton;
    private javax.swing.JButton customerLoginButton;
    private javax.swing.JTextField emailTxt;
    private javax.swing.JLabel jlHeader1;
    private javax.swing.JLabel jlHeader10;
    private javax.swing.JLabel jlHeader2;
    private javax.swing.JLabel jlHeader3;
    private javax.swing.JLabel jlHeader4;
    private javax.swing.JLabel jlHeader8;
    private javax.swing.JLabel jlHeader9;
    private javax.swing.JLabel logoHL;
    private javax.swing.JPasswordField passwordTxt;
    // End of variables declaration//GEN-END:variables
}