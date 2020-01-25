package examples;

import java.util.Scanner;

public class Power {
	public static void main(String args[])
	{   int res=1;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter base and exponent");
		int b=sc.nextInt();
		int p=sc.nextInt();
		for(int i=1;i<=p;i++)
		{
			res=res*b;
		}
		System.out.println("after cal power:" +res);

}
}
