package mypackage;

import java.lang.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*; 

public class labor
{
	String  First;
	String Last;
	String UserName;
	String Age;
	String DOB;
	
	
	public labor(){}
	public labor(String s1, String s2, String s3,String s4,String s5)
	{
		this.First=s1;
		this.Last=s2;
		this.UserName=s3;
		this.Age=s4;
		this.DOB=s5;
	}
	
	public void setFirst(String First){this.First= First;}
	public void setLast(String Last){this.Last= Last;}
	public void setUserName(String UserName){this.UserName=UserName;}
	public void setAge(String Age){this.Age=Age;}
	public void setDOB(String DOB){this.DOB=DOB;}
	
	public String getFirst(){return First;}
	public String getLast(){return Last;}
	public String getUserName(){return UserName;}
	public String getAge(){return Age;}
	public String getDOB(){return DOB;}
	
	
	
}