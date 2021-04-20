package mypackage.secondpackage;
import java.sql.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;  
public class managerList
{
  public managerList(String s1,String s2)
  {
	   
  
		try 
		{
              Class.forName("com.mysql.jdbc.Driver");  
              Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/labormgt5","root",""); //here mydb is database name, root is username and password  
              Statement stmt=con.createStatement();
             
	          String sql= "Select * from Manager where userName = ' "+s1+" '  and password= ' "+s2+" ' ";
			  ResultSet rs=stmt.executeQuery(sql);
			  if(rs.next()) //if username and pass is correct
			  {
                 JOptionPane.showMessageDialog(null,"Usernamer and pass matched");
				
				 new ManagerLogin(s1,s2); 
				
			  }
              else
              {
                 				  
	                  JOptionPane.showMessageDialog(null,"Usernamer and pass doesnt matched");
					 
			  }
			   
	  
              con.close();
        }
      catch(Exception e)
     {
           System.out.println(e);
     }
  }
}