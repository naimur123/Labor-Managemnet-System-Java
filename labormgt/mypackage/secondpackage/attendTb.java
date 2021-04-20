package mypackage.secondpackage;

import java.sql.*;

public class attendTb //new table create
{ 
  
  public attendTb()
  {
	   
  
		try 
		{
              Class.forName("com.mysql.jdbc.Driver");  
              Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/labormgt5","root",""); //here mydb is database name, root is username and password  
              Statement stmt=con.createStatement();
             
	          String sql= "CREATE TABLE attendTb (UserName VARCHAR(100),Date VARCHAR(100),StartHour INTEGER)";
			  
			  
              stmt.executeUpdate(sql); 
            		  
	  
              con.close();
        }
      catch(Exception e)
     {
           System.out.println(e);
     }
  }
  public attendTb(String s1,int s5)
  {
	  try 
		{
              Class.forName("com.mysql.jdbc.Driver");  
              Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/labormgt5","root",""); //here mydb is database name, root is username and password  
              Statement stmt=con.createStatement();
			  String sql= "Select * from attendTb";
			  ResultSet r=stmt.executeQuery(sql);
			
		
			while(r.next())
			{
				String UserName=r.getString("UserName");
			    String start = r.getString("StartHour"); 
				new calculation(UserName,start);
			}
			
		}
      catch(Exception e)
     {
           System.out.println(e);
     }
	  
  }
}  
  
		   
    		
