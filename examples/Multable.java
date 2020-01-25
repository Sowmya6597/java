package examples;

import java.util.Scanner;

public class Multable {
	public static void main(String args[])
	{
	
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter range");
	int mul=sc.nextInt();
	for(int i=1;i<=10;i++)
	
	System.out.println("table is:" +(mul*i));

}
}
