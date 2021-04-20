package mypackage;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*; 
public class LabourLogin
{
	public LabourLogin()
	{
		JFrame f1=new JFrame("Labour Login UI");
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
		Button b2= new Button("SignUp");
		b2.setBounds(300,300,100,60);
		Button b3= new Button("Back");
		b3.setBounds(50,400,150,60);
		
		b1.addActionListener(new ActionListener()
	   {
		   public void actionPerformed(ActionEvent e) 
		 {
			 laborCheck c=new laborCheck();
		     String s1=t1.getText();  
             String s2=t2.getText();
		     new laborCheck();
			 if(c.checkLogin(s1,s2))
                {
                 
                    JOptionPane.showMessageDialog(null, "You have logged in successfully","Success",
                                        JOptionPane.INFORMATION_MESSAGE);
									new	LabourLogin(s1,s2);
									f1.setVisible(false);
									
                }
                else
                {
                    
                    JOptionPane.showMessageDialog(null, "Login failed!","Failed!!",
                                        JOptionPane.ERROR_MESSAGE);
                }
		    
		 }});
		b2.addActionListener(new ActionListener()
	   {
		   public void actionPerformed(ActionEvent e) 
		 {
		
		     new registration();
		     f1.setVisible(false);
		 }});
		b3.addActionListener(new ActionListener()
	   {
		public void actionPerformed(ActionEvent e) 
		{
		 new UI(); 
		f1.setVisible(false);
		}});
		
		
		
	    
        f1.getContentPane().setBackground(Color.GREEN);
		f1.add(b1);
		f1.add(b2);
		f1.add(b3);
	    f1.add(l1);
		f1.add(l2);
		f1.add(t1);
		f1.add(t2);
	    f1.setSize(1000,1000);
		f1.setLayout(null);
		f1.setVisible(true);
	}
	public LabourLogin(String s1,String s2)
		{
			     new LaborIn(s1);
				
		}
}	


