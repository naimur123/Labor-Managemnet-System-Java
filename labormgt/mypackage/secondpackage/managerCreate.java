package mypackage.secondpackage;

import java.sql.*;

public class managerCreate //new table create
{ 
  
  public managerCreate()
  {
	   
  
		try 
		{
              Class.forName("com.mysql.jdbc.Driver");  
              Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/labormgt5","root",""); //here mydb is database name, root is username and password  
              Statement stmt=con.createStatement();
             
	          String sql= "CREATE TABLE Manager(First VARCHAR(255),Last VARCHAR(255),AGE VARCHAR(100),DOB VARCHAR(255),userName VARCHAR(255), password VARCHAR(255))";
			  String sql2= "INSERT INTO Manager (First,Last,Age,DOB,userName,password) VALUES ('Safiqur','Rahman','40','12.01.1990',' Safiqur123 ', ' 12345 ')"; //Manager name pass primarilly setted
			  
              stmt.executeUpdate(sql); 
              stmt.executeUpdate(sql2); 			  
	  
              con.close();
        }
      catch(Exception e)
     {
           System.out.println(e);
     }
  }
}
  
		   
    		
