package examples;

import java.util.Scanner;

public class Fib {
	public static void main(String args[])
	{
	int n1=0,n2=1;
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter range");
	 int range=sc.nextInt();
	System.out.println(+n1);
	System.out.println(+n2);
	for (int i = 2; i <range; ++i)
    {
        int n3 = n1 + n2;
        System.out.println(+n3);
        n1 = n2;
        n2 = n3;
	

}
}
}
