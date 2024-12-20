
package GUI;

import Classes.Form_DatabaseConnector;
import javax.swing.JOptionPane;

import java.sql.Connection;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class login extends javax.swing.JFrame {
    
    
    public login() {
        initComponents();
        
    }
    
   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        login_email = new javax.swing.JTextField();
        login_password = new javax.swing.JPasswordField();
        LOGIN_text = new javax.swing.JLabel();
        Email_text = new javax.swing.JLabel();
        Password_text = new javax.swing.JLabel();
        login_button = new javax.swing.JButton();
        show_password_button = new javax.swing.JCheckBox();
        jLabel5 = new javax.swing.JLabel();
        signup_button = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        login_email.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        login_email.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));
        login_email.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                login_emailActionPerformed(evt);
            }
        });
        getContentPane().add(login_email, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 270, 370, 30));

        login_password.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        login_password.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));
        login_password.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                login_passwordActionPerformed(evt);
            }
        });
        getContentPane().add(login_password, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 350, 370, 31));

        LOGIN_text.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        LOGIN_text.setForeground(new java.awt.Color(255, 255, 255));
        LOGIN_text.setText("LOG IN");
        getContentPane().add(LOGIN_text, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 170, -1, -1));

        Email_text.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        Email_text.setForeground(new java.awt.Color(255, 255, 255));
        Email_text.setText("Email:");
        getContentPane().add(Email_text, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 240, -1, -1));

        Password_text.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        Password_text.setForeground(new java.awt.Color(255, 255, 255));
        Password_text.setText("Password:");
        getContentPane().add(Password_text, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 320, -1, -1));

        login_button.setBackground(new java.awt.Color(102, 51, 0));
        login_button.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        login_button.setForeground(new java.awt.Color(255, 255, 255));
        login_button.setText("Log in");
        login_button.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                login_buttonMouseClicked(evt);
            }
        });
        login_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                login_buttonActionPerformed(evt);
            }
        });
        getContentPane().add(login_button, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 440, -1, -1));

        show_password_button.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        show_password_button.setForeground(new java.awt.Color(255, 255, 255));
        show_password_button.setText("show password");
        show_password_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                show_password_buttonActionPerformed(evt);
            }
        });
        getContentPane().add(show_password_button, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 400, -1, -1));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("I don't have an account");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 500, -1, 30));

        signup_button.setBackground(new java.awt.Color(204, 204, 255));
        signup_button.setFont(new java.awt.Font("Segoe UI", 1, 10)); // NOI18N
        signup_button.setText("sign up");
        signup_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                signup_buttonActionPerformed(evt);
            }
        });
        getContentPane().add(signup_button, new org.netbeans.lib.awtextra.AbsoluteConstraints(880, 500, -1, 30));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Login Background.png"))); // NOI18N
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 985, 544));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void login_emailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_login_emailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_login_emailActionPerformed

    private void login_passwordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_login_passwordActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_login_passwordActionPerformed

    private void login_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_login_buttonActionPerformed
        
        String username = login_email.getText();
        String password = String.valueOf(login_password.getPassword());
        
        PreparedStatement ps = null;
        ResultSet rs = null;
        
        String query ="SELECT * FROM signup WHERE emailAdd = ? AND password = ?";
        
        if(username.trim().toLowerCase().equals("username") || password.trim().toLowerCase().equals("password")){
            JOptionPane.showMessageDialog(null , "Enter a valid username & password" , "Login Failed", 1);
            
        }
        else {
            try {
                 ps = Form_DatabaseConnector.getConnection().prepareStatement(query);
            ps.setString(1, username);
            ps.setString(2, password);
            rs = ps.executeQuery();
            
            if (rs.next()){
               // System.out.println("Login");
               Homepage Hm = new Homepage();
               Hm.setVisible(true);
               // hide login form
               this.dispose();
            }
            else {
                JOptionPane.showMessageDialog(null , "Invalid username or password" , "Login Failed", 2);
            }
            }
            catch(SQLException ex){
                try {
                    ps = Form_DatabaseConnector.getConnection().prepareStatement(query);
                } catch (SQLException ex1) {
                    Logger.getLogger(login.class.getName()).log(Level.SEVERE, null, ex1);
                }
                try {
                    ps.setString(1, username);
                } catch (SQLException ex1) {
                    Logger.getLogger(login.class.getName()).log(Level.SEVERE, null, ex1);
                }
                try {
                    ps.setString(2, password);
                } catch (SQLException ex1) {
                    Logger.getLogger(login.class.getName()).log(Level.SEVERE, null, ex1);
                }
                try {
                    rs = ps.executeQuery();
                } catch (SQLException ex1) {
                    Logger.getLogger(login.class.getName()).log(Level.SEVERE, null, ex1);
                }
            
                try {
                    if (rs.next()){
                        System.out.println("Login");
                    }
                    else {
                        System.out.println(ex.getMessage());
                    }   } catch (SQLException ex1) {
                    Logger.getLogger(login.class.getName()).log(Level.SEVERE, null, ex1);
                }
                
            }
            
        }
    }//GEN-LAST:event_login_buttonActionPerformed

    private void signup_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_signup_buttonActionPerformed
       
        signUp signUpFrame = new signUp();
        signUpFrame.setVisible(true);
        signUpFrame.pack();
        signUpFrame.setLocationRelativeTo(null);
        this.dispose();
    }//GEN-LAST:event_signup_buttonActionPerformed

    private void show_password_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_show_password_buttonActionPerformed

    if (show_password_button.isSelected()){
           login_password.setEchoChar((char)0);
        }
        else {
           login_password.setEchoChar('*');
        }
    }//GEN-LAST:event_show_password_buttonActionPerformed

    private void login_buttonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_login_buttonMouseClicked
        // TODO add your handling code here:
      Homepage HomepageFrame  = new  Homepage();
      HomepageFrame.setVisible(true);
      HomepageFrame.pack();
      HomepageFrame.setLocationRelativeTo(null);
    }//GEN-LAST:event_login_buttonMouseClicked

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
            java.util.logging.Logger.getLogger(login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new login().setVisible(true);
        });
    }

    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Email_text;
    private javax.swing.JLabel LOGIN_text;
    private javax.swing.JLabel Password_text;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JButton login_button;
    private javax.swing.JTextField login_email;
    private javax.swing.JPasswordField login_password;
    private javax.swing.JCheckBox show_password_button;
    private javax.swing.JButton signup_button;
    // End of variables declaration//GEN-END:variables
}

