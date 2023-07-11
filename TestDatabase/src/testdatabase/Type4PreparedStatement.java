
package testdatabase;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class Type4PreparedStatement {
    public static void main(String args[])
    {
           try
           {
               Connection con = null;
               PreparedStatement pst = null;
               
               Scanner sc = new Scanner(System.in);
               System.out.println("Enter your id: ");
               int id = sc.nextInt();
               System.out.println("Enter your name: ");
               String name = sc.next();
               System.out.println("Enter your salary: ");
               int salary = sc.nextInt();
               System.out.println("Enter your city: ");
               String city = sc.next();
               
               Class.forName("com.mysql.jdbc.Driver");
               System.out.println("Loaded");
               
               con = DriverManager.getConnection("jdbc:mysql://localhost:3306/db26","root","root");
               System.out.println("Connected");
               
               pst = con.prepareStatement("INSERT INTO emp VALUES(?,?,?,?)");
               pst.setInt(1, id);
               pst.setString(2, name);
               pst.setInt(3, salary);
               pst.setString(4, city);
               
               //String query = "INSERT INTO emp VALUES('104','Rahul','12345','Indore')";
               
               int i = pst.executeUpdate();
               
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
