package com.cts.test;

import java.util.Scanner;

public class duplicate {
	public static void main(String args[])
	{
	int a[],count=0,size,i,j;
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter size");
	size=sc.nextInt();
	a=new int[size];
	System.out.println("Enter elements");
	for(i=0;i<size;i++)
	{
		a[i]=sc.nextInt();
	}
	for(i=0;i<size;i++)
	{
		for(j=0;j<i;j++)
	     {
		if(a[i]==a[j])
			count++;
		}
	}
	
	System.out.println("null elements are:" +count);
	
	}
}





