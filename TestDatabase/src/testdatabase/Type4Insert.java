
package testdatabase;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Type4Insert {
    public static void main(String args[])
    {
           try
           {
               Connection con = null;
               Statement st = null;
               
               Class.forName("com.mysql.jdbc.Driver");
               System.out.println("Loaded");
               
               con = DriverManager.getConnection("jdbc:mysql://localhost:3306/db26","root","root");
               System.out.println("Connected");
               
               st = con.createStatement();
               
               String query = "INSERT INTO emp VALUES('104','Rahul','12345','Indore')";
               
               int i = st.executeUpdate(query);
               
               if(i>0)
               {
                   System.out.println("Record inserted!");
               }
               else
               {
                   System.out.println("Insertion failed!");
               }
               con.close();
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
            
}
