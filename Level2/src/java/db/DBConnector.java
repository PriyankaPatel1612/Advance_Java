
package db;

import java.sql.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnector {
    static Connection con;
    static Statement st;
    
    static 
    {
        try
        {
            Class.forName("com.mysql.jdbc.Driver");
            System.out.println("driver loaded");
            
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/db26","root","root");
            System.out.println("connected");
            
            st = con.createStatement();
            
        }
        catch(ClassNotFoundException e)
        {
            System.out.println(e);
        }
        catch(SQLException e)
        {
            System.out.println(e);
        }  
    }
    
    public static Connection getConnection()
    {
        return con;
    }
    
    public static Statement getStatement()
    {
        return st;
    }
}
