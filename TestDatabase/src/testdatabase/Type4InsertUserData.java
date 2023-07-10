
package testdatabase;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class Type4InsertUserData {
    public static void main(String args[])
    {
           try
           {
               Connection con = null;
               Statement st = null;
               
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
               
               st = con.createStatement();
               
               //String query = "INSERT INTO emp VALUES('104','Rahul','12345','Indore')";
               String query = "INSERT INTO emp VALUES('"+id+"','"+name+"','"+salary+"','"+city+"')";
               
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
