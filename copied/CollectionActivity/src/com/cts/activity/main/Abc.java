package com.cts.activity.main;
import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;
import java.sql.PreparedStatement;
public class Abc {
	public static void main(String args[])throws ClassNotFoundException,SQLException
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter id");
		int id=Integer.parseInt(sc.nextLine());
		System.out.println("Enter name");
		String empname=sc.nextLine();
		System.out.println("Enter phone number");
		long empphone=Long.parseLong(sc.nextLine());
	 Class.forName("com.mysql.jdbc.Driver");
	 String url="jdbc:mysql://localhost:3306/cts";	
	 String username="root";
	 String password="admin";
	 Connection con=DriverManager.getConnection(url,username,password);
	 System.out.println("Connection established");
	 Statement stmt=con.createStatement();
	 /*String query="insert into emp values(104,'sowmya',93849876)";
	 String query="update emp set name='varsha'where id=103";
	 String query="delete from emp where id=103";*/
	
	 String query="insert into emp values(?,?,?)";
	 PreparedStatement ps=con.prepareStatement(query);
	 ps.setInt(1,id);
	 ps.setString(2, empname);
	 ps.setLong(3,empphone);
	 int result=ps.executeUpdate();
	 if(result>0)
	 {
		 System.out.println("data executed successfully");
	 }
	 else
	{
		System.out.println("try again");
	}
	 
	 }
}
