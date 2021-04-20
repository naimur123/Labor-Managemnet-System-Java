package mypackage.secondpackage;

import java.sql.*;

public class message //new table create
{ 
  
  public message()
  {
	   
  
		try 
		{
              Class.forName("com.mysql.jdbc.Driver");  
              Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/labormgt5","root",""); //here mydb is database name, root is username and password  
              Statement stmt=con.createStatement();
             
	          String sql= "CREATE TABLE message(UserName VARCHAR(100),Message VARCHAR(250), Date VARCHAR(100))";
			  
			  
              stmt.executeUpdate(sql); 
            		  
	  
              con.close();
        }
      catch(Exception e)
     {
           System.out.println(e);
     }
  }
}  
  
		   
    		
