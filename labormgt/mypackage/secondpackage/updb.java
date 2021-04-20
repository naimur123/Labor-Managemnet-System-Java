package mypacakage.secondpackage;
import java.sql.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*; 
public class updb
{
	public updb(String s1,String s2,String s3,String s4,String s5)
	{
			
		try 
		{
              Class.forName("com.mysql.jdbc.Driver");  
              Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/labormgt5","root",""); //here mydb is database name, root is username and password  
              Statement stmt=con.createStatement();
              String sql= "Update labor SET Address='"+s2+"',Email='"+s3+"',MobileNo='"+s4+"',Password='"+s5+"' WHERE  UserName='"+s1+"' ";
			  stmt.executeUpdate(sql); 
			   
			  
			  JOptionPane.showMessageDialog(null,"Successfully Updated");
			  JOptionPane.showMessageDialog(null,"Please Login Again");
			  new LabourLogin();
              		  
	  
              con.close();
        }
      catch(Exception e)
     {
           System.out.println(e);
     }
	}
}