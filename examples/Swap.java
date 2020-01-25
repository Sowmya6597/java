package examples;

import java.util.Scanner;

public class Swap {
	public static void main (String args[])
	{
		int a,b,temp;
		System.out.println("Enter a and b");
		Scanner sc=new Scanner(System.in);
		a=sc.nextInt();
		b=sc.nextInt();
		temp=b;
		b=a;
		a=temp;
		System.out.println("Swapped numbers are:" +a +"\n" +b);
	}

}
