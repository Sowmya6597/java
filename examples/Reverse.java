package examples;

import java.util.Scanner;

public class Reverse {
	public static void main(String args[])
	{
		int num,rev=0,rem;
		System.out.println("Enter number");
		Scanner sc=new Scanner(System.in);
		num=sc.nextInt();
	while(num != 0)
    {
        
        rem= num%10;
        rev=rev*10+rem;
        num=num/10;
    }
    System.out.println("Reverse: " +rev);


}
}
