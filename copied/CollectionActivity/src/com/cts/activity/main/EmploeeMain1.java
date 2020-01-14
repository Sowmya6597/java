package com.cts.activity.main;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;
import java.sql.Statement;

public class EmploeeMain1 {
	public static void main(String args[])throws ClassNotFoundException,SQLException
	{
		Scanner sc=new Scanner(System.in);
		Class.forName("com.mysql.jdbc.Driver");
		String url="jdbc:mysql://localhost:3306/cts";
		String username="root";
		String password="admin";
		Connection con=DriverManager.getConnection(url,username,password);
		System.out.println("Connection Established");
		//String query="insert into emp values(104,'abc',6748399)";
		//String query="update emp set name='def' where id=104";
		//Statement stmt=con.createStatement();
		/*int result=stmt.executeUpdate(query);
		 if(result>0)
		 {
			 System.out.println("data executed successfully");
		 }
		 else
		{
			System.out.println("try again");*/
			String query="insert into emp values(?,?,?)";
			 PreparedStatement ps=con.prepareStatement(query);
			 ps.setInt(1,id);
			 ps.setString(2,name);
			 ps.setLong(3,phone);
			 
		
			


		