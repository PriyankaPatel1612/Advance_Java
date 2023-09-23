
package model;


public class LoginAuthenticator {
    public boolean isLogin(String uname, String pwd)
    {
        if(uname!=null && pwd!=null && uname.equalsIgnoreCase("Priya") && pwd.equals("12345"))
        {
            return true;
        }
        return false;
    }
}
