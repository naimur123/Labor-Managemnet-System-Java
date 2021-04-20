package mypackage.secondpackage;
import java.sql.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*; 
public class laborList
{
	public laborList(String s1,String s2,String s3,String s4,String s5,String s6)
	{
			try 
		{
              Class.forName("com.mysql.jdbc.Driver");  
              Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/labormgt5","root",""); //here mydb is database name, root is username and password  
              Statement stmt=con.createStatement();
              String sql= "INSERT INTO labor (First,Last,UserName,Age,DOB,Password) VALUES ('"+s1+"', '"+s2+"','"+s3+"', '"+s4+"','"+s5+"','"+s6+"')";
			  stmt.executeUpdate(sql); 
			  
			  JOptionPane.showMessageDialog(null,"Successfully Registered");
			  JOptionPane.showMessageDialog(null,"Please Login");
			  new LabourLogin();
              		  
	  
              con.close();
        }
      catch(Exception e)
     {
           System.out.println(e);
     }
	}

}
	