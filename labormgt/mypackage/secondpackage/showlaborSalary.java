package mypackage.secondpackage;
import java.sql.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.util.ArrayList; 
public class showlaborSalary
{
	public showlaborSalary()
	{
	  
		ArrayList<laborSalary> ar = new ArrayList<laborSalary>();
		  
		
		try   
		{
			  Class.forName("com.mysql.jdbc.Driver");  
              Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/labormgt5","root",""); //here mydb is database name, root is username and password  
              Statement stmt=con.createStatement();
              String sql= "Select * from attendTb";
			  ResultSet r=stmt.executeQuery(sql);
			
		
			while(r.next())
			{
				String UserName =r.getString("UserName");
				String result = r.getString("Salary");
				
				
				laborSalary mi = new laborSalary(UserName,result);
				ar.add(mi);
			}
		}
		catch(Exception e)
        {
           System.out.println(e);
        }
		
		
		Object obj[] = ar.toArray();
		String data[][] = new String [ar.size()][2];
		
		for(int i=0; i<obj.length; i++)
		{
			
			data[i][0] = ((laborSalary)obj[i]).getUserName();
			data[i][1] = ((laborSalary)obj[i]).getresult();
			
			
			
		}
	

			          Frame f=new Frame("Labor List");
		
		
		              String column[] = {"UserName", "Salary"};
		
		              JTable jt = new JTable(data,column);
					  jt.setBounds(100,200,400,400);
					  JScrollPane sp=new JScrollPane(jt); 
					  Button b1=new Button("Ok");
					  b1.setBounds(200,800,100,50);
					  b1.addActionListener(new ActionListener()
	                  {
		                  public void actionPerformed(ActionEvent e) 
		                {
		                       
								f.setVisible(false);
		                }});
				      f.add(sp);
				      f.add(jt);
					  f.add(b1);
                      f.setSize(1000,1000);
                      f.setLayout(null);				  
                      f.setVisible(true);
	                  
		
	}
}
