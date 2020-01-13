package com.cts.test;

import java.util.Scanner;

public class copy {
	public static void main(String args[])
	{
	int a[],b[],size,i;
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter size");
	size=sc.nextInt();
	a=new int[size];
	b=new int[size];
	System.out.println("Enter elements");
	for(i=0;i<size;i++)
	{
		a[i]=sc.nextInt();
	}
	for(i=0;i<size;i++)
	{
		b[i]=a[i];
	
	System.out.println("copied elements are:" +b[i]);
	}
	}
	

}

