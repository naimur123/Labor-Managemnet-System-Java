package mypackage;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*; 
public class calculation
{
	public calculation(String UserName,String start)
	{
		
		int x= Integer.parseInt(start);
		
		   if(x==8)
		  {
			int c=800;
			String result=String.valueOf(c);
			new salaryset(UserName,result);
			new laborSalary();
			new laborSalary(UserName,result);
		  }
		  else if(x==9)
		 {
			int c=700;
			String result=String.valueOf(c);
			new salaryset(UserName,result);
			new laborSalary();
			new laborSalary(UserName,result);
		  }
		   else if(x==10)
		 {
			int c=600;
			String result=String.valueOf(c);
			new salaryset(UserName,result);
			new laborSalary();
			new laborSalary(UserName,result);
		  }
		   else if(x==11)
		 {
			int c=500;
			String result=String.valueOf(c);
			new salaryset(UserName,result);
			new laborSalary();
			new laborSalary(UserName,result);
		  }
		   else if(x==12)
		 {
			int c=400;
			String result=String.valueOf(c);
			new salaryset(UserName,result);
			new laborSalary();
			new laborSalary(UserName,result);
		  }
		   else if(x==13)
		 {
			int c=300;
			String result=String.valueOf(c);
			new salaryset(UserName,result);
			new laborSalary();
			new laborSalary(UserName,result);
		  }
		   else if(x==14)
		 {
			int c=200;
			String result=String.valueOf(c);
			new salaryset(UserName,result);
			new laborSalary();
			new laborSalary(UserName,result);
		  }
		   else if(x==15)
		 {
			int c=100;
			String result=String.valueOf(c);
			new salaryset(UserName,result);
			new laborSalary();
			new laborSalary(UserName,result);
		  }
		   else if(x==16)
		 {
		
			String result="No salary";
			new salaryset(UserName,result);
			new laborSalary();
			new laborSalary(UserName,result);
		  }
			  
			

	}
}