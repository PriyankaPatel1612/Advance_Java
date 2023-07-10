
package testdatabase;

//import java.sql.*

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;



 class Type4Select {
    public static void main(String args[]){
        
        Connection con = null;
        Statement st = null;
        ResultSet rs = null;
        
        try{
            
        Class.forName("com.mysql.jdbc.Driver");
        System.out.println("Driver Loaded");
        
        con = DriverManager.getConnection("jdbc:mysql://localhost:3306/db26","root","root");
        System.out.println("Connected");
        
        st = con.createStatement();
        
        String query = "SELECT * FROM emp";
        
        rs = st.executeQuery(query);
        
        while(rs.next()){
            System.out.print(rs.getString(1)+"\t");
            System.out.print(rs.getString(2)+"\t");
            System.out.print(rs.getString(3)+"\t");
            System.out.println(rs.getString(4)+"\t");
        }
        
        }
        catch(ClassNotFoundException e){
            System.out.println(e);
        }
        
        catch(SQLException e){
            System.out.println(e);
        }
               
     }
             
}
