package examples;

import java.util.Scanner;

public class Count {
	public static void main(String args[])
	{
		int num,c=0;
		System.out.println("Enter number");
		Scanner sc=new Scanner(System.in);
		num=sc.nextInt();
	while(num != 0)
    {
        
        num /= 10;
        ++c;
    }
    System.out.println("Number of digits: " + c);

}
}
