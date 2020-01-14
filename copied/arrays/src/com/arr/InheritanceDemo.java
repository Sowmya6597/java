package com.arr;

import java.util.Scanner;

public class InheritanceDemo 
{
	public static void main(String args[])
	{
		Employee emp=new Employee();
		emp.getData();
		emp.display();
		Manager m = new Manager();
		m.getData();
		m.display();
		Developer d=new Developer();
		d.getData();
		d.display();
		
	}
}
class Employee
{
	int id;
	String name;
	String company;
	
public void display()
{
	System.out.println(id+ ":" +name+ ":" +company);
}
public void getData()
{
	Scanner sc=new Scanner(System.in);
    System.out.println("Enter id:");
    id=Integer.parseInt(sc.nextLine());
    System.out.println("Enter name:");
    name=sc.nextLine();
    System.out.println("Enter company name");
    company=sc.nextLine();
    //sc.close();
}
}
class Manager extends Employee
{
	String[] team;
	String department;
	public void display()
	{
	System.out.println(team+ ":"+department+":");
    }
	public void getData()
	{
		int size,i;
		Scanner sc=new Scanner(System.in);
	    System.out.println("Enter team:");
	    size=Integer.parseInt(sc.nextLine());
	    team=new String[size];
	    System.out.println("Enter members");
	    for(i=0;i<size;i++)
	    {
	    	team[i]=sc.nextLine();
	    }
	    System.out.println("Enter department:");
	    department=sc.nextLine();
	  //  sc.close();
	}
	}
		
	
class Developer extends Employee
{
	String projectname;
	String duration;
	String domain;
	public void display()
	{
	System.out.println(projectname+ ":"+duration+":"+domain);
    }
	public void getData()
	{
		Scanner sc=new Scanner(System.in);
	    System.out.println("Enter projectname:");
	    projectname=sc.nextLine();
	    System.out.println("Enter duration:");
	    duration=sc.nextLine();
	    System.out.println("Enter domain:");
	    domain=sc.nextLine();
	   // sc.close();
    }
}


