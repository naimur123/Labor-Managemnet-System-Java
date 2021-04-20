package mypackage.secondpackage;
import java.sql.*;
public class salary
{
	public salary()
	{
		try 
		{
              Class.forName("com.mysql.jdbc.Driver");  
              Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/labormgt5","root",""); //here mydb is database name, root is username and password  
              Statement stmt=con.createStatement();
             
	          String sql= "Alter Table attendTb ADD (Salary VARCHAR(100))";
			  
			  
              stmt.executeUpdate(sql); 
			  
			
            		  
	  
              con.close();
        }
      catch(Exception e)
     {
           System.out.println(e);
     }
	}
	
}