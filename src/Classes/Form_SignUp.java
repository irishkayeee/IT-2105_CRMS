
package Classes;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class Form_SignUp {

        private int id;
        private String firstName;
        private String lastName;
        private String email;
        private String password;
        private String role_;
       
        public Form_SignUp(){
            
        }
        
    public Form_SignUp(int id, String firstName, String lastName, String email, String password, String role_) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.password = password;
        this.role_ = role_;
    }
    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
    
    public String getRole_() {
        return role_;
    }

    public void setRole_(String role_) {
        this.role_ = role_;
    }
    
    public ResultSet getData(String query){
         
         PreparedStatement ps;
         ResultSet rs = null;
         try {
             
             
             ps = Form_DatabaseConnector.getConnection().prepareStatement(query);
             rs = ps.executeQuery();
                     } catch (SQLException ex) {
             Logger.getLogger(Form_SignUp.class.getName()).log(Level.SEVERE, null, ex);
         }
         return rs;
     }
    
    //create account
    public void createAccount(String _firstName, String _lastName, String _email, String _password, String _role_) {
        String insertQuery = "INSERT INTO signup(firstName, lastName, emailAdd, password, role) VALUES (?, ?, ?, ?, ?)";
        PreparedStatement ps;

        try {
            ps = Form_DatabaseConnector.getConnection().prepareStatement(insertQuery);
            ps.setString(1, _firstName);
            ps.setString(2, _lastName);
            ps.setString(3, _email);
            ps.setString(4, _password); 
            ps.setString(5, _role_);

            if (ps.executeUpdate() != 0 ) {
                JOptionPane.showMessageDialog(null, "The Account has been added", "Add Informations", JOptionPane.INFORMATION_MESSAGE);
            } else {
                JOptionPane.showMessageDialog(null, "Account has not been added", "Add Informations", JOptionPane.ERROR_MESSAGE);
            }

        } catch (SQLException ex) {
            Logger.getLogger(Form_SignUp.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, "Error: " + ex.getMessage(), "Database Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    
}
