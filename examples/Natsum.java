package examples;

import java.util.Scanner;

public class Natsum {
	public static void main(String args[])
	{   int sum=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter range");
		int range=sc.nextInt();
		for(int i=0;i<=range;i++)
			sum=sum+i;
		
		System.out.println("Sum is:" +sum);
	}

}
