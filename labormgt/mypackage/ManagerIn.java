package mypackage;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class ManagerIn
{
	
	public ManagerIn(String s1)
	{
		         JFrame f=new JFrame("Into Manager");
				 Button b1=new Button("Messages");
				 b1.setBounds(100,150,100,40);
				 b1.addActionListener(new ActionListener()
	            {
		          public void actionPerformed(ActionEvent e) 
		        {
		             new showMessage();
					  
		        }});
				
				 Button b2=new Button("Labor List");
				 b2.setBounds(100,250,100,40);
				 b2.addActionListener(new ActionListener()
	            {
		          public void actionPerformed(ActionEvent e) 
		        {
					  new showlabor();
		     
		             
					  
		        }});
				 Button b3=new Button("Labor Salary");
				 b3.setBounds(100,350,120,40);
				
				b3.addActionListener(new ActionListener()
	            {
		               public void actionPerformed(ActionEvent f) 
		         {
					  
					   new showlaborSalary();
		              
					  
		        }});
				 Label l1=new Label("Want To Fire A Labor?Please Type UserName & Click 0n Fire.");
				 l1.setBounds(100,450,400,50);
				 l1.setForeground(Color.red); 
				 TextField t1=new TextField();
		         t1.setBounds(100,500,100,50);
				 Button b4=new Button("Fire Labor");
				 b4.setBounds(220,500,100,50);
				 
			    
				 b4.addActionListener(new ActionListener()
	            {
		          public void actionPerformed(ActionEvent e) 
		        {
		              String s6=t1.getText();
					  t1.setText(null);
					  new laborDel(s6);
		        }
		        });
				Button b5=new Button("LogOut");
				b5.setBounds(200,650,100,40);
				b5.addActionListener(new ActionListener()
	            {
		          public void actionPerformed(ActionEvent e) 
		        {
		              new UI();
					  f.setVisible(false);
		        }
		        });
				
				
				 f.getContentPane().setBackground(Color.CYAN);
				 f.add(b1);
				 f.add(b2);
				 f.add(b3);
				 f.add(b4);
				 f.add(b5);
				 f.add(l1);
				 f.add(t1);
				
				
				
				 f.setSize(1000,1000);  
                 f.setLayout(null);  
                 f.setVisible(true); 

				 
	}
	
	
}