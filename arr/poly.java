package com.arr;

public class poly 
{
	public static final double PI=3.14;
	public void area(double a)
	{
		System.out.println("square area is" +a*a);
	}
	public void area(double a,double b)
	{
		System.out.println("rectangle area is" +2*(a*b));
	}
	public void area(int a,float b)
	{
		System.out.println("triangle area is" +(a*b)/2);
	}
	public void area(int a)
	{
		System.out.println("circle area is" +PI*a*a);
	}
public static void main(String args[])
{
	poly p=new poly();
	p.area(2.2,2.3);
	
}
	
}
                     