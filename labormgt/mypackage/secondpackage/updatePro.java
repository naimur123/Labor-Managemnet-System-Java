package mypackage.secondpackage;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*; 
public class updatePro
{
	public updatePro(String s1)
	{
		JFrame f2=new JFrame("Update Info");
				
		
		Label l1=new Label("Address");
		l1.setBounds(50,50,100,40);
		TextField t1=new TextField();
		t1.setBounds(250,50,100,40);
		Label l2=new Label("Email");
		l2.setBounds(50,100,100,40);
		TextField t2=new TextField();
		t2.setBounds(250,100,100,40);
		Label l3=new Label("Mobile Number");
		l3.setBounds(50,150,150,40);
		TextField t3=new TextField();
		t3.setBounds(250,150,100,40);
	    Label l6=new Label("Change Password");
		l6.setBounds(50,300,200,40);
		JPasswordField t6=new JPasswordField();
		t6.setBounds(250,300,100,40);
		
		
		
		
        Button b1= new Button("Update");
		b1.setBounds(50,450,100,60);
		Button b2= new Button("Back");
		b2.setBounds(50,600,100,60);
		
		b1.addActionListener(new ActionListener()
	    {
		   public void actionPerformed(ActionEvent e)
			{
			    String s2=t1.getText();  
			    String s3=t2.getText();
                String s4=t3.getText(); 
                String s5=t6.getText();
				if(s2.isEmpty() ) 
		       {
				   JOptionPane.showMessageDialog(null, "FillUp Form!","Failed!!",
                                        JOptionPane.ERROR_MESSAGE);
			   }
			   else if(s3.isEmpty() ) 
		       {
				   JOptionPane.showMessageDialog(null, "FillUp Form!","Failed!!",
                                        JOptionPane.ERROR_MESSAGE);
			   }
			   else if(s4.isEmpty() ) 
		       {
				   JOptionPane.showMessageDialog(null, "FillUp Form!","Failed!!",
                                        JOptionPane.ERROR_MESSAGE);
			   }
			   else if(s5.isEmpty() ) 
		       {
				   JOptionPane.showMessageDialog(null, "FillUp Form!","Failed!!",
                                        JOptionPane.ERROR_MESSAGE);
			   }
			   else
			   {
				     new updb(s1,s2,s3,s4,s5); 
					 
				
			   }
		}});
        		
					 
		b2.addActionListener(new ActionListener()
	    {
		     public void actionPerformed(ActionEvent e) 
		 {
		      new LaborIn(s1); 
		      f2.setVisible(false);
		}
		});
	    
		f2.getContentPane().setBackground(Color.CYAN);
        f2.add(l1);
		f2.add(l2);
		f2.add(l3);
		f2.add(b1);
		f2.add(b2);
		f2.add(l3);
		f2.add(l6);
	    f2.add(t1);
		f2.add(t2);
		f2.add(t3);
		f2.add(t6);
		
	    f2.setSize(1000,1000);
		f2.setLayout(null);
		f2.setVisible(true);
	}
		
}