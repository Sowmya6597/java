package examples;

import java.util.Scanner;

public class Palindrome {
	public static void main(String args[])
	{
		int num,rev=0,rem,temp;
		
		System.out.println("Enter number");
		Scanner sc=new Scanner(System.in);
		num=sc.nextInt();
		temp=num;
	while(num != 0)
    {
        
        rem= num%10;
        rev=rev*10+rem;
        num=num/10;
    }
	if(rev==temp)
	{
    System.out.println("Palindrome ");
	}
	else
		System.out.println("Not palindrome");


}

}
