package com.arr;

import java.util.Scanner;

public class abc 
{
	public static void main(String args[])
	{
		int choice;
	    Scanner sc=new Scanner(System.in);
	 
	

}
}
class Student
{
	String fname,lname,co;
	int age,sid;
	public void display()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter firstname");
		fname=sc.nextLine();
		System.out.println("Enter lastname");
		lname=sc.nextLine();
		System.out.println("Enter course");
		co=sc.nextLine();
	}
}
class Teacher
{
	String fn,ln,dept,desig;
	int age,eid;
	double sal;
	public void getData()
	{
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter first");
	fn=sc.nextLine();
	System.out.println("Enter last");
	ln=sc.nextLine();
	System.out.println("Enter department");
	dept=sc.nextLine();
	System.out.println("Enter designation");
	desig=sc.nextLine();
	System.out.println("Enter age");
	age=Integer.parseInt(sc.nextLine());
	System.out.println("Enter salary");
	sal=Double.parseDouble(sc.nextLine());
	System.out.println("Enter id");
	eid=Integer.parseInt(sc.nextInt());
	}
	
	
}

