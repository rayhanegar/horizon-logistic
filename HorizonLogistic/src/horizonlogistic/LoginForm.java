package horizonlogistic;
import java.sql.*;
import javax.swing.JOptionPane;

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
        logoHL = new javax.swing.JLabel();
        jlHeader1 = new javax.swing.JLabel();
        jlHeader2 = new javax.swing.JLabel();
        jlHeader3 = new javax.swing.JLabel();
        jlHeader4 = new javax.swing.JLabel();
        jlEmail = new javax.swing.JLabel();
        emailTxt = new javax.swing.JTextField();
        jlPassword = new javax.swing.JLabel();
        passwordTxt = new javax.swing.JPasswordField();
        jlDesc = new javax.swing.JLabel();
        customerLoginButton = new javax.swing.JButton();
        adminLoginButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Horizon Logistic");
        setBackground(new java.awt.Color(255, 255, 255));
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setPreferredSize(new java.awt.Dimension(1000, 600));

        logoHL.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Horizon Logistic Logo (transparant).png"))); // NOI18N

        jlHeader1.setFont(new java.awt.Font("Segoe UI", 2, 18)); // NOI18N
        jlHeader1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlHeader1.setText("Hi! Welcome to");
        jlHeader1.setPreferredSize(new java.awt.Dimension(250, 100));
        jlHeader1.setRequestFocusEnabled(false);

        jlHeader2.setFont(new java.awt.Font("Segoe UI", 1, 48)); // NOI18N
        jlHeader2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlHeader2.setText("HORIZON");
        jlHeader2.setPreferredSize(new java.awt.Dimension(250, 100));
        jlHeader2.setRequestFocusEnabled(false);

        jlHeader3.setFont(new java.awt.Font("Segoe UI", 1, 48)); // NOI18N
        jlHeader3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlHeader3.setText("LOGISTIC");
        jlHeader3.setPreferredSize(new java.awt.Dimension(250, 100));
        jlHeader3.setRequestFocusEnabled(false);

        jlHeader4.setFont(new java.awt.Font("Segoe UI", 2, 18)); // NOI18N
        jlHeader4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlHeader4.setText("\"Delivering Hope, Shipping Happiness\"");
        jlHeader4.setPreferredSize(new java.awt.Dimension(250, 100));
        jlHeader4.setRequestFocusEnabled(false);

        jlEmail.setBackground(new java.awt.Color(255, 255, 255));
        jlEmail.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jlEmail.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jlEmail.setText("Email");
        jlEmail.setPreferredSize(new java.awt.Dimension(250, 100));
        jlEmail.setRequestFocusEnabled(false);

        emailTxt.setFont(new java.awt.Font("Segoe UI", 2, 14)); // NOI18N
        emailTxt.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        emailTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                emailTxtActionPerformed(evt);
            }
        });

        jlPassword.setBackground(new java.awt.Color(255, 255, 255));
        jlPassword.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jlPassword.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jlPassword.setText("Password");
        jlPassword.setPreferredSize(new java.awt.Dimension(250, 100));
        jlPassword.setRequestFocusEnabled(false);

        passwordTxt.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        passwordTxt.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        passwordTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                passwordTxtActionPerformed(evt);
            }
        });

        jlDesc.setFont(new java.awt.Font("Segoe UI", 2, 14)); // NOI18N
        jlDesc.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlDesc.setText("What would you like to log in as?");
        jlDesc.setPreferredSize(new java.awt.Dimension(250, 100));
        jlDesc.setRequestFocusEnabled(false);

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

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(78, 78, 78)
                .addComponent(logoHL)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 82, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jlHeader2, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap())
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jlHeader1, javax.swing.GroupLayout.DEFAULT_SIZE, 350, Short.MAX_VALUE)
                                    .addComponent(jlHeader4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jlHeader3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(90, 90, 90)))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jlDesc, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jlEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jlPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGap(18, 18, 18)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(emailTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(passwordTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addContainerGap()))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(adminLoginButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(customerLoginButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(142, 142, 142))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(49, 49, 49)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(logoHL, javax.swing.GroupLayout.PREFERRED_SIZE, 504, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jlHeader1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jlHeader2, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jlHeader3, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jlHeader4, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(37, 37, 37)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jlEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(emailTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jlPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(passwordTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jlDesc, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(customerLoginButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(adminLoginButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(47, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void adminLoginButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_adminLoginButtonActionPerformed
        String emailUser = "admin@gmail.com";
        String password = "admin123";
        
        if(emailTxt.getText().equals(emailUser) && passwordTxt.getText().equals(password)){
            DashboardAdmin DA = new DashboardAdmin();
            DA.setVisible(true);
            this.dispose();
        } else {
            JOptionPane.showMessageDialog(null, "Sorry, email or password is wrong!", "Login Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_adminLoginButtonActionPerformed

    private void customerLoginButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_customerLoginButtonActionPerformed
        String emailCust = emailTxt.getText();
        String passwordCust = passwordTxt.getText();
         
        String connectionUrl =
                "jdbc:sqlserver://DESKTOP-OOI580Q:1433;"
                + "database=Horizon_Logistic;"
                + "user=sa;"
                + "password=123;"
                + "encrypt=false;"
                + "trustServerCertificate=false;"
                + "loginTimeout=30;";
        
        try {
            Connection connection = DriverManager.getConnection(connectionUrl);

            String sql = "SELECT * FROM customer WHERE email_cust = ?";
            PreparedStatement statement = connection.prepareStatement(sql);
            
            statement.setString(1, emailCust);
            ResultSet result = statement.executeQuery();
            
            if (result.next()) {
                DashboardAdmin DA = new DashboardAdmin();
                DA.setVisible(true);
                this.dispose();
            } else {
                JOptionPane.showMessageDialog(null, "Sorry, email or password is wrong!", "Login Error", JOptionPane.ERROR_MESSAGE);
            }
            connection.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
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
                new DashboardAdmin().setVisible(false);
            }
        });
        
        String connectionUrl =
                "jdbc:sqlserver://DESKTOP-OOI580Q:1433;"
                + "database=Horizon_Logistic;"
                + "user=sa;"
                + "password=123;"
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
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel jlDesc;
    private javax.swing.JLabel jlEmail;
    private javax.swing.JLabel jlHeader1;
    private javax.swing.JLabel jlHeader2;
    private javax.swing.JLabel jlHeader3;
    private javax.swing.JLabel jlHeader4;
    private javax.swing.JLabel jlPassword;
    private javax.swing.JLabel logoHL;
    private javax.swing.JPasswordField passwordTxt;
    // End of variables declaration//GEN-END:variables
}