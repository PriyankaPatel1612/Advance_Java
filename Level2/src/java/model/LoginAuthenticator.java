
package model;

import db.DBConnector;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;


public class LoginAuthenticator {
    public boolean isLogin(String uname, String pwd)
    {
        String tablePassword="";
        ResultSet rs = null;
        try{
            
            Statement st = DBConnector.getStatement();
            
            String query = "Select password From emp Where empname='"+uname+"'";
            System.out.println("Query = " + query);
            
            rs = st.executeQuery(query);
            
            if(rs.next())
            {
                tablePassword = rs.getString(1);
            }
            else{
                return false;
            }
        }
        catch(SQLException e)
        {
            System.out.println(e);
        }
        if(uname!=null && pwd!=null && !uname.trim().equals("") && pwd.equals(tablePassword))
        {
            return true;
        }
        return false;
    }
}
