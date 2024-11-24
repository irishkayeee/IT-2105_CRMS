
package Classes;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;


public class Form_CreateSubjects {
     private int id;
        private String className;
        private String section;
        private String subject;
        private String room;
        private String code;
        
          public Form_CreateSubjects(){
            
        }
        
    public Form_CreateSubjects(int id, String className, String section, String subject, String room, String code) {
        this.id = id;
        this.className = className;
        this.section = section;
        this.subject = subject;
        this.room = room;
        this.code = code;
    }
    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getclassName() {
        return className;
    }

    public void setclassName(String className) {
        this.className = className;
    }

    public String getsection() {
        return section;
    }

    public void setsection(String section) {
        this.section = section;
    }

    public String getSubject() {
    return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    // Getter and Setter for Room
    public String getRoom() {
        return room;
    }

    public void setRoom(String room) {
        this.room = room;
    }

    // Getter and Setter for Code
    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }    
    
    public ResultSet getData(String query){
         
         java.sql.PreparedStatement ps;
         ResultSet rs = null;
         try {
             
             
             ps = Form_DatabaseConnector.getConnection().prepareStatement(query);
             rs = ps.executeQuery();
                     } catch (SQLException ex) {
             Logger.getLogger(Form_SignUp.class.getName()).log(Level.SEVERE, null, ex);
         }
         return rs;

    }
}

