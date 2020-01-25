package examples;

import java.util.Scanner;

public class Posneg {
	public static void main(String args[])
	{
		int n;
		System.out.println("Enter any number");
		Scanner sc=new Scanner(System.in);
		n=sc.nextInt();
		if(n>=0)
		{
			System.out.println("Given number is positive");
		}
		else
			System.out.println("Given number is negative");
			
	}

}
