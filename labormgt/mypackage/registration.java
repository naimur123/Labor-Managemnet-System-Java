package mypackage;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*; 
public class registration
{
	public registration()
	{
		Frame f2=new Frame("Register");
				
		
		Label l1=new Label("First Name");
		l1.setBounds(50,50,100,40);
		TextField t1=new TextField();
		t1.setBounds(180,50,100,40);
		Label l2=new Label("Last Name");
		l2.setBounds(50,100,100,40);
		TextField t2=new TextField();
		t2.setBounds(180,100,100,40);
		Label l3=new Label("Set UserName");
		l3.setBounds(50,150,100,40);
		TextField t3=new TextField();
		t3.setBounds(180,150,100,40);
		Label l4=new Label("Age");
		l4.setBounds(50,200,100,40);
		TextField t4=new TextField();
		t4.setBounds(180,200,100,40);
		Label l5=new Label("DOB");
		l5.setBounds(50,250,100,40);
		TextField t5=new TextField();
		t5.setBounds(180,250,100,40);
	    Label l6=new Label("Password");
		l6.setBounds(50,300,100,40);
		JPasswordField t6=new JPasswordField();
		t6.setBounds(180,300,100,40);
		
		
	
		l1.setForeground(Color.red); 
        l2.setForeground(Color.blue);
		
		
        Button b1= new Button("Register");
		b1.setBounds(50,450,100,60);
		Button b2= new Button("Back");
		b2.setBounds(50,500,100,60);
		b1.addActionListener(new ActionListener()
	    {
		   public void actionPerformed(ActionEvent e)
			{
			    String s1=t1.getText();  
			    String s2=t2.getText();
                String s3=t3.getText(); 
                String s4=t4.getText();
				String s5=t5.getText();
				String s6=t6.getText();
				new labor();
				new labor(s1,s2,s3,s4,s5);
			    new laborList(s1,s2,s3,s4,s5,s6); //labor list call
				f2.setVisible(false);
								
						        
			}
		}); 
					 
		b2.addActionListener(new ActionListener()
	    {
		     public void actionPerformed(ActionEvent e) 
		 {
		      new LabourLogin(); 
		      f2.setVisible(false);
		}
		});
	    
        
		f2.add(b1);
		f2.add(b2);
	    f2.add(l1);
		f2.add(l2);
		f2.add(l3);
		f2.add(l4);
		f2.add(l5);
		f2.add(l6);
	    f2.add(t1);
		f2.add(t2);
		f2.add(t3);
		f2.add(t4);
		f2.add(t5);
		f2.add(t6);
		
	    f2.setSize(1000,1000);
		f2.setLayout(null);
		f2.setVisible(true);
	}
		
}
