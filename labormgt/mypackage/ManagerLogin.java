package mypackage;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*; 
public class ManagerLogin
{
	public ManagerLogin()
	{
		JFrame f1=new JFrame("Manager Login");
		Label l1=new Label("User Name");
		l1.setBounds(50,50,150,40);
		Label l2=new Label("Password");
		l2.setBounds(50,150,150,40);
		
		l1.setForeground(Color.black); 
        l2.setForeground(Color.black);
		
		
		TextField t1=new TextField(" ");
		t1.setBounds(50,100,200,40);
		JPasswordField t2=new JPasswordField();
		t2.setBounds(50,200,200,40);

        Button b1= new Button("Login");
		b1.setBounds(50,300,150,60);
		Button b2=new Button("Back");
        b2.setBounds(50,380,150,60);	
        b1.addActionListener(new ActionListener()
		{
		    public void actionPerformed(ActionEvent e)
		   {
			    String s1=t1.getText();				
                String s2=t2.getText();
				t1.setText(null);
				t2.setText(null);
				new managerList(s1,s2); //manager list call
				f1.setVisible(false);				
								
						        
			}
		});
		b2.addActionListener(new ActionListener()
	    {
		     public void actionPerformed(ActionEvent e) 
		 {
		      new UI(); 
		      f1.setVisible(false);
		}
		});
		
		f1.getContentPane().setBackground(Color.RED);
		f1.add(b1);
		f1.add(b2);
	    f1.add(l1);
		f1.add(l2);
		f1.add(t1);
		f1.add(t2);
	    f1.setSize(1000,1000);
		f1.setLayout(null);
		f1.setVisible(true);
	}
		public ManagerLogin(String s1,String s2)
		{
			new ManagerIn(s1);
		}
		
}		
	
