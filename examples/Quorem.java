package examples;

import java.util.Scanner;

public class Quorem {
	public static void main(String[] args)
	{
		int numerator,deno,rem=0,quo=0;
		System.out.println("Enter numerator,denominator");
		Scanner sc=new Scanner(System.in);
		numerator=sc.nextInt();
		deno=sc.nextInt();
		quo=numerator/deno;
		rem=numerator%deno;
		System.out.println("Remainder:" +rem);
		System.out.println("Quotient:" +quo);
	}

}
