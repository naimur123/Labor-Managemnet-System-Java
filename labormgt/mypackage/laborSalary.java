package mypackage;
import java.sql.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class laborSalary
{
	String  UserName;
	String result;
	
	
	
	public laborSalary(){}
	public laborSalary(String UserName, String result)
	{
		this.UserName=UserName;
		this.result=result;
		
	}
	
	
	public void setUserName(String UserName){this.UserName=UserName;}
	public void setresult(String result){this.result=result;}
	
	
	
	
	public String getUserName(){return UserName;}
	public String getresult(){return result;}

	
	
	
}