package examples;

import java.util.Scanner;

public class Asci {
	public static void main(String[] args) {
        char ch;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter any alphabet");
        ch=sc.next().charAt(0);
        int y = ch;
        System.out.println("The ASCII value of " + ch + " is: " + y);
      
    }
}


