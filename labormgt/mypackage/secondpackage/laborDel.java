package mypackage.secondpackage;
import java.sql.*;
import javax.swing.*;
public class laborDel
{
	laborDel(String s6)
	{
	{
			
			try 
		{
              Class.forName("com.mysql.jdbc.Driver");  
              Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/labormgt5","root",""); //here mydb is database name, root is username and password  
              Statement stmt=con.createStatement();
              String sql= "DELETE FROM labor WHERE UserName='"+s6+"' ";
			  stmt.executeUpdate(sql); 
			   
			  
			  JOptionPane.showMessageDialog(null,"Successfully Fired");
              con.close();
        }
      catch(Exception e)
     {
           System.out.println(e);
     }
	}	
	}
	
}