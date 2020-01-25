package examples;

import java.util.Scanner;

public class Mul {
	public static void main(String args[])
	{
	float mul=0;
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter two integers");
	float n1=sc.nextFloat();
	float n2=sc.nextFloat();
	mul=n1*n2;
	System.out.println("Sum is:" +mul);

}
}
