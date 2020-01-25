package examples;

import java.util.Scanner;

public class Factorial {
	public static void main(String args[])
	{   int fact=1;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter range");
		int range=sc.nextInt();
		for(int i=1;i<=range;i++)
			fact=fact*i;
		
		System.out.println("Factorial is:" +fact);
	}

}
