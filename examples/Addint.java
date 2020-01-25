package examples;

import java.util.Scanner;

public class Addint {
		public static void main(String args[])
		{   int sum=0;
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter any integers");
			int n1=sc.nextInt();
			int n2=sc.nextInt();
			sum=n1+n2;
			System.out.println("Sum is:" +sum);
		}

	}



