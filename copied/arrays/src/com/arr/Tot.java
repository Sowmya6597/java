package com.arr;
import java.util.Scanner;
public class Tot {
	public static void main(String args[])
	{   
		System.out.println("Java            200");
		System.out.println("C               400");
		System.out.println("Cpp             300");
		System.out.println("Angular         500");
		Scanner sc=new Scanner(System.in);
		StringBuffer sb=new StringBuffer();
		String choice=sc.nextLine();
		String course=choice;
		int price=0;
		if(course.contains("Java"))
		{
			sb.append("Java        200");
             price=price+200;       
		}
		if(course.contains("C"))
		{
			sb.append("C        400");
             price=price+400;
		}
		if(course.contains("Cpp"))
		{
			sb.append("Cpp        300");
             price=price+300;
		}
		if(course.contains("Angular"))
		{
			sb.append("Angular        500");
             price=price+500;
		}
		System.out.println(price);
	}

	
}
		
		
		
		
		
		
		
		
		
	


