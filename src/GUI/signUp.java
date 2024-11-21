package GUI;

import Classes.Signup;
import javax.swing.ButtonGroup;
import javax.swing.JOptionPane;
import javax.swing.JRadioButton;

import javax.swing.JOptionPane;


public class signUp extends javax.swing.JFrame {

     Signup signup = new Signup();

    public signUp() {
        initComponents();
        
        ButtonGroup btn_group = new ButtonGroup();
        btn_group.add(rbTeacher);
        btn_group.add(rbStudent);
        
    }
    
    public boolean verify()
    { 
        String email = jTextField_email.getText();
        String password = jTextField_password.getText();

        if(!email.trim().equals("") && !password.trim().equals(""))
        {
            return true;
        }
        else 
        {
            JOptionPane.showMessageDialog(null , "Enter all the necessary information" , "Invalid Information", 2);
             return false;
        }
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        role = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jTextField_firstName = new javax.swing.JTextField();
        jTextField_lastName = new javax.swing.JTextField();
        jTextField_email = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        showpass_signup = new javax.swing.JCheckBox();
        jLabel8 = new javax.swing.JLabel();
        rbTeacher = new javax.swing.JRadioButton();
        rbStudent = new javax.swing.JRadioButton();
        jTextField_password = new javax.swing.JPasswordField();
        jLabel9 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("SIGN UP");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 120, -1, -1));

        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("First Name: ");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 180, -1, -1));

        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Last Name:");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 250, -1, -1));

        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Email:");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 320, -1, 20));

        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Password: ");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 390, -1, 20));

        jTextField_firstName.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        jTextField_firstName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField_firstNameActionPerformed(evt);
            }
        });
        getContentPane().add(jTextField_firstName, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 210, 358, 30));

        jTextField_lastName.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        jTextField_lastName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField_lastNameActionPerformed(evt);
            }
        });
        getContentPane().add(jTextField_lastName, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 280, 358, 30));

        jTextField_email.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        jTextField_email.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField_emailActionPerformed(evt);
            }
        });
        getContentPane().add(jTextField_email, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 350, 358, 30));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("I have an account");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 500, 110, 30));

        jButton1.setBackground(new java.awt.Color(102, 51, 0));
        jButton1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Submit");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 480, -1, -1));

        jButton2.setBackground(new java.awt.Color(204, 204, 255));
        jButton2.setFont(new java.awt.Font("Segoe UI", 1, 10)); // NOI18N
        jButton2.setText("Login");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(880, 500, -1, 30));

        showpass_signup.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        showpass_signup.setForeground(new java.awt.Color(255, 255, 255));
        showpass_signup.setText("show password");
        showpass_signup.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                showpass_signupActionPerformed(evt);
            }
        });
        getContentPane().add(showpass_signup, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 460, -1, -1));

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Select your role to get started!");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 270, -1, -1));

        role.add(rbTeacher);
        rbTeacher.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        rbTeacher.setForeground(new java.awt.Color(255, 255, 255));
        rbTeacher.setText("Teacher");
        rbTeacher.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbTeacherActionPerformed(evt);
            }
        });
        getContentPane().add(rbTeacher, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 310, -1, -1));

        role.add(rbStudent);
        rbStudent.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        rbStudent.setForeground(new java.awt.Color(255, 255, 255));
        rbStudent.setText("Student");
        getContentPane().add(rbStudent, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 340, -1, -1));
        getContentPane().add(jTextField_password, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 420, 360, 30));

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Login Background.png"))); // NOI18N
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 985, 544));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jTextField_firstNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField_firstNameActionPerformed

    }//GEN-LAST:event_jTextField_firstNameActionPerformed

    private void jTextField_lastNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField_lastNameActionPerformed

    }//GEN-LAST:event_jTextField_lastNameActionPerformed

    private void jTextField_emailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField_emailActionPerformed
     
    }//GEN-LAST:event_jTextField_emailActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
                                                                     
        String firstName = "";
        String lastName = "";
        String email = "";
        String password = "";
        String role_ = null; 

    try {
        firstName = jTextField_firstName.getText();
        lastName = jTextField_lastName.getText();
        email = jTextField_email.getText();
        password = jTextField_password.getText();

    if (rbTeacher.isSelected()) {
        role_ = "Teacher";
    } else if (rbStudent.isSelected()) {
        role_ = "Student";
    } else {
        
        throw new Exception("No role selected");
    }
    } catch (Exception ex) {
        JOptionPane.showMessageDialog(null, "Error: " + ex.getMessage(), "Invalid Role", JOptionPane.ERROR_MESSAGE);
    }

// Proceed only if all inputs are valid and a role is set
    if (verify() && role_ != null) {
        Signup signup = new Signup();
        signup.createAccount(firstName, lastName, email, password, role_);
    }

    }//GEN-LAST:event_jButton1ActionPerformed

    private void showpass_signupActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_showpass_signupActionPerformed
         if (showpass_signup.isSelected()){
           jTextField_password.setEchoChar((char)0);
        }
        else {
           jTextField_password.setEchoChar('*');
        }
        
    }//GEN-LAST:event_showpass_signupActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        login loginFrame = new login();
        loginFrame.setVisible(true);
        loginFrame.pack();
        loginFrame.setLocationRelativeTo(null);
        this.dispose();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void rbTeacherActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbTeacherActionPerformed
      
    }//GEN-LAST:event_rbTeacherActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(() -> {
            new signUp().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField jTextField_email;
    private javax.swing.JTextField jTextField_firstName;
    private javax.swing.JTextField jTextField_lastName;
    private javax.swing.JPasswordField jTextField_password;
    private javax.swing.JRadioButton rbStudent;
    private javax.swing.JRadioButton rbTeacher;
    private javax.swing.ButtonGroup role;
    private javax.swing.JCheckBox showpass_signup;
    // End of variables declaration//GEN-END:variables
}
