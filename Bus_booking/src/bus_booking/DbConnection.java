package bus_booking;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Ashik
 */
import java.sql.*;
import javax.swing.*;

public class DbConnection {
     Connection conn=null;
    public static Connection ConnectDb()
            {
            try
            {
                Class.forName("com.mysql.jdbc.Driver");
                Connection conn=DriverManager.getConnection("jdbc:mysql://localhost/busbooking_db","root", "");
              //  JOptionPane.showMessageDialog(null,"connected to database");
                return conn;
                
                
           /* Class.forName("com.mysql.jdbc.Driver");
            String dbpath = "jdbc:mysql://localhost/SMS";
            conn = DriverManager.getConnection(dbpath, "root", "");
            */
            }
            catch(Exception e)
            {
            JOptionPane.showMessageDialog(null,e);
            return null;
            }
            
            }
}
