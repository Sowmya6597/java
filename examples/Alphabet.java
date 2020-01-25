package examples;

import java.util.Scanner;

public class Alphabet {
	public static void main(String args[])
	{
		char n;
		System.out.println("Enter any text");
		Scanner sc=new Scanner(System.in);
		n=sc.next().charAt(0);
		if( (n >= 'a' && n <= 'z') || (n >= 'A' && n <= 'Z'))
            System.out.println(n+ " is an alphabet.");
        else
            System.out.println(n+ " is not an alphabet.");

}
}
