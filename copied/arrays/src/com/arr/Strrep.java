package com.arr;

import java.util.Scanner;

public class Strrep {
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a string");
		String str=sc.nextLine();
		if(str.contains("yes")||str.contains("today")||str.contains("why")||str.contains("you"));
	{
		str=str.replace("yes","s");
	    str=str.replace("today","2day");
	    str=str.replace("why","y");
	    str=str.replace("you","u");
	}
	System.out.println(str);
	
	
			}

}
