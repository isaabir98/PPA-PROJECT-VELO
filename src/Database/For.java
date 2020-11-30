/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Database;

import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;

/**
 *
 * @author hp
 */
public class For {
    public static Connection connect()
    {
    Connection con =null;
    try{
    Class.forName("com.mysql.cj.jdbc.Driver");
    con=DriverManager.getConnection("jdbc:mysql://localhost:3306/velo", "root","");
    }
    catch(Exception e)
    {
    System.out.println("Some errors");
    JOptionPane.showMessageDialog(null,e);
    }
    return con;
    }
    
}
