package examples;

import java.util.Scanner;

public class Nameyear {
	public static void main(String args[])
	{
		int year;
		String name;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter name and year");
		
		name=sc.nextLine();
		year=sc.nextInt();
		System.out.println("My name is"  +name+  "I'll graduate in" +year);
	}
	

}
