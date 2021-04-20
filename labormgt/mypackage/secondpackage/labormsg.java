package mypackage.secondpackage;

import java.sql.*;



public class labormsg //new table create
{ 
  
  public labormsg(String s1,String s2,String s3)
  {
	   
      
		try 
		{
              Class.forName("com.mysql.jdbc.Driver");  
              Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/labormgt5","root",""); //here mydb is database name, root is username and password  
              Statement stmt=con.createStatement();
             
			 String sql= "INSERT INTO message (UserName,Message,Date) VALUES (' "+s1+ " ',' "+s2+ " ',' "+s3+ " ')";
			 
			  
              stmt.executeUpdate(sql); 
        
              con.close();
        }
      catch(Exception e)
     {
           System.out.println(e);
     }
  }  
  
}  		
	