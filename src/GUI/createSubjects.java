package GUI;

import Classes.DB;
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
        jLabel1 = new javax.swing.JLabel();
        class_name = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        class_subject = new javax.swing.JTextField();
        class_room = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        btnCreate = new javax.swing.JButton();
        cancel = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();

        jFrame1.setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        jFrame1.getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        class_section.setBackground(new java.awt.Color(249, 249, 249));
        class_section.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(204, 204, 204), null));
        getContentPane().add(class_section, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 160, 510, 40));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setText("Create class ");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, -1, -1));

        class_name.setBackground(new java.awt.Color(249, 249, 249));
        class_name.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(204, 204, 204), null));
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

        btnCreate.setText("create");
        btnCreate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCreateActionPerformed(evt);
            }
        });
        getContentPane().add(btnCreate, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 360, 70, -1));

        cancel.setText("cancel");
        cancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelActionPerformed(evt);
            }
        });
        getContentPane().add(cancel, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 360, -1, -1));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 550, 410));

        setSize(new java.awt.Dimension(566, 415));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnCreateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCreateActionPerformed

    // Get values from text fields
    String className = class_section.getText().trim();
    String section = class_name.getText().trim();
    String subject = class_subject.getText().trim();
    String room = class_room.getText().trim();

    // Check if any field is empty
    if (className.isEmpty() || section.isEmpty() || subject.isEmpty() || room.isEmpty()) {
        // Show popup message
        JOptionPane.showMessageDialog(this, "Please fill out all necessary information", "Input Error", JOptionPane.ERROR_MESSAGE);
    } else {
            // SQL query to insert data into the database
            String query = "INSERT INTO createclass (className, section, subject, room) VALUES (?, ?, ?, ?)";
            
            try (Connection conn = DB.getConnection(); 
                PreparedStatement pst = conn.prepareStatement(query)) {
                
                // Set the parameters in the query
                pst.setString(1, className);
                pst.setString(2, section);
                pst.setString(3, subject);
                pst.setString(4, room);
                
                int rowsAffected = pst.executeUpdate();
                
                if (rowsAffected > 0) {
                    JOptionPane.showMessageDialog(this, "Class created successfully!", "Success", JOptionPane.INFORMATION_MESSAGE);
                    this.setVisible(false);
                    
                    HomePage Hm = new HomePage();
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

  
    public static void main(String args[]) {
       
        java.awt.EventQueue.invokeLater(() -> {
            new createSubjects().setVisible(true);
        });
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCreate;
    private javax.swing.JButton cancel;
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
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables


}
