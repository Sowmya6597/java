package examples;

import java.util.Scanner;

public class Gcd {
	public static void main(String[] args) {
        int gcd=1,n1,n2;
        
        	Scanner sc=new Scanner(System.in);
			System.out.println("Enter any integers");
			n1=sc.nextInt();
			n2=sc.nextInt();
			for(int i = 1; i <= n1 && i <= n2; ++i)
	        {
            if(n1 % i==0 && n2 % i==0)
                gcd = i;
        }
        System.out.printf("G.C.D is:" +gcd);
    }

}
