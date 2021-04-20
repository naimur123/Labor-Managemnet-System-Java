package mypackage.secondpackage;

import java.sql.*;



public class laborCreate //new table create
{ 
  
  public laborCreate()
  {
	   
  
		try 
		{
              Class.forName("com.mysql.jdbc.Driver");  
              Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/labormgt5","root",""); //here mydb is database name, root is username and password  
              Statement stmt=con.createStatement();
             
	          String sql= "CREATE TABLE labor(First VARCHAR(255), Last VARCHAR(255),UserName VARCHAR(100),Age VARCHAR(100),DOB VARCHAR(100),Password VARCHAR(100))";
              stmt.executeUpdate(sql); 
              			  
	  
              con.close();
        }
      catch(Exception e)
     {
           System.out.println(e);
     }
  }  
  
}  		
	