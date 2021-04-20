package mypackage;
import java.sql.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class messageGet
{
	String  UserName;
	String Message;
	String Date;
	
	
	
	public messageGet(){}
	public messageGet(String s1, String s2,String s3)
	{
		this.UserName=s1;
		this.Message=s2;
		this.Date=s3;
		
	}
	
	
	public void setUserName(String UserName){this.UserName=UserName;}
	public void setMessage(String Message){this.Message=Message;}
	
	
	
	
	public String getUserName(){return UserName;}
	public String getMessage(){return Message;}
	public String getDate(){return Date;}

	
	
	
}