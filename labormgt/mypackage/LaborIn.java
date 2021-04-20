package mypackage;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*; 
import java.util.Date;

public class LaborIn
{
	
	public LaborIn(String s1)
	{
		        
				 JFrame f=new JFrame("Labour Admin UI");
				 Button b1=new Button("Start");
				 b1.setBounds(50,50,100,50);
				 JLabel b5=new JLabel(new ImageIcon("F:\\1.jpg")); 
				 b5.setBounds(700,50,100,100);
				 
				 Label l1=new Label("Send Message To Manager");
				 l1.setBounds(50,200,200,40);
				 TextField t2=new TextField();
		         t2.setBounds(50,250,200,100);
				 
				 
				 Button b2= new Button("Send");
		         b2.setBounds(300,300,100,50);
				 
		   
				 
				 Button b3=new Button("Update Profile");
				 b3.setBounds(700,130,100,50);
				 
				 Button b4=new Button("LogOut");
				 b4.setBounds(50,550,100,50);
				
				
  /*Start*/	    b1.addActionListener(new ActionListener() 
	            {
		               public void actionPerformed(ActionEvent e) 
		         {
					  Date date=new Date();
				      String s6=date.toString();
					  int s5=date.getHours();
					  new attendTb();//starting hour table create
					  new attendDb(s1,s6,s5);//valuee insert
					  new salary();//salary column create
					  new attendTb(s1,s5);
					  JOptionPane.showMessageDialog(null,"Your work hour has been started");
				 }});
				 b2.addActionListener(new ActionListener()
				 {
					 public void actionPerformed(ActionEvent h) 
					 {
						   Date d=new Date();
				           String s3=d.toString();
					       String s2=t2.getText();
						   new message();
						   new labormsg(s1,s2,s3);
						   JOptionPane.showMessageDialog(null,"Message Sent");
						   new messageGet();
						   new messageGet(s1,s2,s3);
						   t2.setText(null);
					  
		        }});
				b3.addActionListener(new ActionListener()
	            {
		               public void actionPerformed(ActionEvent g) 
		         {
		                   new alterlabor();
						   new updatePro(s1);
						   f.setVisible(false);
					  
		        }});
						
							
			
		        
				b4.addActionListener(new ActionListener()
	            {
		               public void actionPerformed(ActionEvent i) 
		         {
		                    new LabourLogin();
							f.setVisible(false);
					  
		        }});
				
						
		        
		
				 f.getContentPane().setBackground(Color.CYAN);
				 f.add(b1);
				 f.add(b2);
				 f.add(b3);
				 f.add(b4);
				 f.add(b5);
				
				
			
				 f.add(l1);
				
				 f.add(t2);
	

				 f.setSize(1000,1000);  
                 f.setLayout(null);  
                 f.setVisible(true); 
	}
	
}