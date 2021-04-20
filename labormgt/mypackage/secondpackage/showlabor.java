package mypacakge.secondpackage;
import java.sql.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.util.ArrayList; 
public class showlabor
{
	public showlabor()
	{
	  
		ArrayList<labor> ar = new ArrayList<labor>();
		  
		
		try   
		{
			  Class.forName("com.mysql.jdbc.Driver");  
              Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/labormgt5","root",""); //here mydb is database name, root is username and password  
              Statement stmt=con.createStatement();
              String sql= "Select * from labor";
			  ResultSet r=stmt.executeQuery(sql);
			
		
			while(r.next())
			{
				String First = r.getString("First");
				String Last=r.getString("Last");
				String UserName =r.getString("UserName");
				String Age = r.getString("Age");
				String DOB = r.getString("DOB");
				
				labor mi = new labor(First,Last,UserName,Age,DOB);
				ar.add(mi);
			}
		}
		catch(Exception e)
        {
           System.out.println(e);
        }
		
		
		Object obj[] = ar.toArray();
		String data[][] = new String [ar.size()][5];
		
		for(int i=0; i<obj.length; i++)
		{
			data[i][0] = ((labor)obj[i]).getFirst();
			data[i][1] = ((labor)obj[i]).getLast();
			data[i][2] = ((labor)obj[i]).getUserName();
			data[i][3] = ((labor)obj[i]).getAge();
			data[i][4] = ((labor)obj[i]).getDOB();
			
			
		}
	

			          Frame f=new Frame("Labor List");
		
		
		              String column[] = {"First", "Last", "UserName", "Age","DOB"};
		
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
