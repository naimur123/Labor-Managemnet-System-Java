package mypackage.secondpackage;
import java.sql.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;  
public class laborCheck
{
    Connection con;
    Statement stat;
    ResultSet rs;
   public laborCheck()
    {
		
        try{
			Class.forName("com.mysql.jdbc.Driver");
            con=DriverManager.getConnection("jdbc:mysql://localhost:3306/labormgt5","root","");
               stat=con.createStatement();
           }
        catch (Exception ae) 
        {
            System.out.println("error while connecting: "+ae);
        }
    }
        //return boolean
    public Boolean checkLogin(String s1,String s2)
    {
        try {        
			 
			String sql= "select * from labor where UserName='"+s1+"' and Password='"+s2+"'"; 	
    
            rs=stat.executeQuery(sql);
            if(rs.next())
            {
                //TRUE if the query founds any corresponding data
				//JOptionPane.showMessageDialog(null,"Usernamer and pass matched");
                return true;
				
            }
            else
            {
				//JOptionPane.showMessageDialog(null,"Usernamer and pass doesnt matched");
					 
                return false;
            }
        } catch (Exception e) {
            // TODO Auto-generated catch block
            System.out.println("error while validating: "+e);
            return false;
        }
		
}

}