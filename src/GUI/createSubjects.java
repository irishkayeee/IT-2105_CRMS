package GUI;

import Classes.Form_DatabaseConnector;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class createSubjects extends javax.swing.JFrame {

    public createSubjects() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jFrame1 = new javax.swing.JFrame();
        class_section = new javax.swing.JTextField();
        class_name = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        class_subject = new javax.swing.JTextField();
        class_room = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        cancel = new javax.swing.JButton();
        btnCreate = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        class_code = new javax.swing.JTextField();

        jFrame1.setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        jFrame1.getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        class_section.setBackground(new java.awt.Color(249, 249, 249));
        class_section.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(204, 204, 204), null));
        getContentPane().add(class_section, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 160, 510, 40));

        class_name.setBackground(new java.awt.Color(249, 249, 249));
        class_name.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(204, 204, 204), null));
        class_name.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                class_nameActionPerformed(evt);
            }
        });
        getContentPane().add(class_name, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 90, 510, 40));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(51, 51, 51));
        jLabel2.setText("Section");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 140, -1, -1));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(51, 51, 51));
        jLabel3.setText("Class name (required)");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 60, -1, -1));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(51, 51, 51));
        jLabel4.setText("Subject");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 210, -1, -1));

        class_subject.setBackground(new java.awt.Color(249, 249, 249));
        class_subject.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(204, 204, 204), null));
        getContentPane().add(class_subject, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 230, 510, 40));

        class_room.setBackground(new java.awt.Color(249, 249, 249));
        class_room.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(204, 204, 204), null));
        getContentPane().add(class_room, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 300, 510, 40));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(51, 51, 51));
        jLabel5.setText("Room");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 280, -1, -1));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setText("Create class ");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, -1, -1));

        cancel.setText("cancel");
        cancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelActionPerformed(evt);
            }
        });
        jPanel1.add(cancel, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 430, -1, -1));

        btnCreate.setText("create");
        btnCreate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCreateActionPerformed(evt);
            }
        });
        jPanel1.add(btnCreate, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 430, 70, -1));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(51, 51, 51));
        jLabel6.setText("Class Code ( 5 to 8 characters long)");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 350, -1, -1));

        class_code.setBackground(new java.awt.Color(249, 249, 249));
        class_code.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(204, 204, 204), null));
        class_code.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                class_codeActionPerformed(evt);
            }
        });
        jPanel1.add(class_code, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 370, 510, 40));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 550, 490));

        setSize(new java.awt.Dimension(566, 474));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnCreateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCreateActionPerformed

    // Get values from text fields
    String className = class_section.getText().trim();
    String section = class_name.getText().trim();
    String subject = class_subject.getText().trim();
    String room = class_room.getText().trim();
    String classCode = class_code.getText().trim();

    // Check if any field is empty
    if (className.isEmpty() || section.isEmpty() || subject.isEmpty() || room.isEmpty()) {
        // Show popup message
        JOptionPane.showMessageDialog(this, "Please fill out all necessary information", "Input Error", JOptionPane.ERROR_MESSAGE);
    } else {
            // SQL query to insert data into the database
            String query = "INSERT INTO createclass (className, section, subject, room, classcode) VALUES (?, ?, ?, ?, ?)";
            
            try (Connection conn = Form_DatabaseConnector.getConnection(); 
                PreparedStatement pst = conn.prepareStatement(query)) {
                
                // Set the parameters in the query
                pst.setString(1, className);
                pst.setString(2, section);
                pst.setString(3, subject);
                pst.setString(4, room);
                pst.setString(5, classCode);
                
                int rowsAffected = pst.executeUpdate();
                
                if (rowsAffected > 0) {
                    JOptionPane.showMessageDialog(this, "Class created successfully!", "Success", JOptionPane.INFORMATION_MESSAGE);
                    this.setVisible(false);
                    
                    HomePage Hm = new HomePage();
                    HomePage.loadClassDataToTable();
                    
                    this.setVisible(false);
                    Hm.setVisible(true);
                    
                    
             
                } else {
                    JOptionPane.showMessageDialog(this, "Failed to create class", "Error", JOptionPane.ERROR_MESSAGE);
                    
                }
            } 
            catch (SQLException e) {
                JOptionPane.showMessageDialog(this, "Database error: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
            }
        }
    
        
    
    }//GEN-LAST:event_btnCreateActionPerformed

    
    private void cancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelActionPerformed
        this.setVisible(false);
        createclass_button createclassButton = new createclass_button();
        createclassButton.setVisible(true);
    }//GEN-LAST:event_cancelActionPerformed

    private void class_codeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_class_codeActionPerformed
        // TODO add your handling code here:
         String classCode = class_code.getText(); // Assuming `class_code` is a JTextField

    if (classCode == null || classCode.trim().isEmpty()) {
        JOptionPane.showMessageDialog(this, "Class code cannot be empty.", "Error", JOptionPane.ERROR_MESSAGE);
        return;
    }

    saveClassCodeToDatabase(classCode);
}

// Method to save the class code to the database
private void saveClassCodeToDatabase(String classCode) {
    String query = "INSERT INTO createclass (classcode) VALUES (?)";

    try (Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/classroom_system_database", "username", "password");
         PreparedStatement ps = con.prepareStatement(query)) {

        ps.setString(1, classCode); // Set the class code parameter
        int rowsAffected = ps.executeUpdate();

        if (rowsAffected > 0) {
            JOptionPane.showMessageDialog(this, "Class code saved successfully!", "Success", JOptionPane.INFORMATION_MESSAGE);
        } else {
            JOptionPane.showMessageDialog(this, "Failed to save class code.", "Error", JOptionPane.ERROR_MESSAGE);
        }
    } catch (SQLException e) {
        e.printStackTrace();
        JOptionPane.showMessageDialog(this, "Database error: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
    }
    }//GEN-LAST:event_class_codeActionPerformed

    private void class_nameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_class_nameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_class_nameActionPerformed

  
    public static void main(String args[]) {
       
        java.awt.EventQueue.invokeLater(() -> {
            new createSubjects().setVisible(true);
        });
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCreate;
    private javax.swing.JButton cancel;
    private javax.swing.JTextField class_code;
    private javax.swing.JTextField class_name;
    private javax.swing.JTextField class_room;
    private javax.swing.JTextField class_section;
    private javax.swing.JTextField class_subject;
    private javax.swing.JFrame jFrame1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables

    private static class HomePage {

        private static void loadClassDataToTable() {
            throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        }

        public HomePage() {
        }

        private void setVisible(boolean b) {
            throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        }
    }

    private static class DriverManager {

        private static Connection getConnection(String jdbcmysqllocalhost3306your_database, String username, String password) {
            throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        }

        public DriverManager() {
        }
    }


}
