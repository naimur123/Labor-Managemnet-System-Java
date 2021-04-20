package mypackage.secondpackage;
import java.sql.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.util.ArrayList; 
public class showMessage
{
	public showMessage()
	{
	  
		ArrayList<messageGet> ar = new ArrayList<messageGet>();
		  
		
		try   
		{
			  Class.forName("com.mysql.jdbc.Driver");  
              Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/labormgt5","root",""); //here mydb is database name, root is username and password  
              Statement stmt=con.createStatement();
              String sql= "Select * from message";
			  ResultSet r=stmt.executeQuery(sql);
			
		
			while(r.next())
			{
				String UserName =r.getString("UserName");
				String Message = r.getString("Message");
				String Date = r.getString("Date");
				
				
				messageGet mi = new messageGet(UserName,Message,Date);
				ar.add(mi);
			}
		}
		catch(Exception e)
        {
           System.out.println(e);
        }
		
		
		Object obj[] = ar.toArray();
		String data[][] = new String [ar.size()][3];
		
		for(int i=0; i<obj.length; i++)
		{
			
			data[i][0] = ((messageGet)obj[i]).getUserName();
			data[i][1] = ((messageGet)obj[i]).getMessage();
			data[i][2] = ((messageGet)obj[i]).getDate();
			
		}
	

			          Frame f=new Frame("Message Show");
		
		
		              String column[] = {"UserName", "Message","Date"};
		
		              JTable jt = new JTable(data,column);
					  jt.setBounds(100,200,800,400);
					  JScrollPane sp=new JScrollPane(jt); 
					  Button b1=new Button("Ok");
					  b1.setBounds(200,900,100,50);
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
