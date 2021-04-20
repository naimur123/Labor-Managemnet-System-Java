package mypackage.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*; 
public class UI
{
	
	public UI()
	{
	   JFrame f=new JFrame("USER LOGIN");
		
       JRadioButton rb1,rb2; 
       
    
       Label l1=new Label("Select Login Option");
	   l1.setBounds(100,50,200,50);
       l1.setForeground(Color.black);
	   rb1=new JRadioButton("Manager");    
       rb1.setBounds(100,100,100,30);      
       rb2=new JRadioButton("Labour");    
       rb2.setBounds(100,150,100,30);    
       Button b=new Button("OK");    
       b.setBounds(100,250,70,30); 

       f.getContentPane().setBackground(Color.CYAN);	   
       f.add(l1);
       f.add(rb1);
	   f.add(rb2);
	   f.add(b);	
       f.setSize(1000,1000);
	   f.setLayout(null);
	   f.setVisible(true);
	  

    b.addActionListener(new ActionListener(){
    public void actionPerformed(ActionEvent e){
    
	 if(rb1.isSelected() && rb2.isSelected())
     {
	      JOptionPane.showMessageDialog(null,"Select one","Alert",JOptionPane.WARNING_MESSAGE);
     }
     
	else if(rb1.isSelected())
	{ 
    
       new ManagerLogin();
       f.setVisible(false);     
    }    
    else
	{    
     
         new LabourLogin();

         f.setVisible(false); 
    }
	

    }
    });

	}
}
	