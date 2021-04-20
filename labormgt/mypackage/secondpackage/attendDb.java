package mypackage.secondpackage;
import java.sql.*;
public class attendDb
{
	public attendDb(String s1,String s6,int s5)
	{
		try 
		{
              Class.forName("com.mysql.jdbc.Driver");  
              Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/labormgt5","root",""); //here mydb is database name, root is username and password  
              Statement stmt=con.createStatement();
             
			 String sql= "INSERT INTO attendTb (UserName,Date,StartHour) VALUES (' "+s1+ " ',' "+s6+ " ',' "+s5+ " ')";
			 
			  
              stmt.executeUpdate(sql); 
        
              con.close();
        }
      catch(Exception e)
     {
           System.out.println(e);
     }
	}
}