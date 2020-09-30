
package Database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;


public class DatabaseConnection {
    public Connection getConnection() {
        String username = "root";
        

        String jdbcUrl ="jdbc:mysql://localhost:3306/velo?serverTimezone=UTC";
        try {

            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection(jdbcUrl, username, "");
            return con;

        } catch (ClassNotFoundException | SQLException e) {

            JOptionPane.showMessageDialog(null, "Check your internet Connection!");
            return null;
        }
    
    
    }
}
