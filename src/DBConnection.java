import java.sql.*;
import javax.swing.*;
/**
 *
 * @author Hamza
 */
public class DBConnection {
    static Connection conn=null;
    private DBConnection(){}
    public static Connection getDBConnection(){
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost/billeterie","billeterie","billeterie");
            return conn;
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e); 
             return null;
        }
    }
    
    
}
