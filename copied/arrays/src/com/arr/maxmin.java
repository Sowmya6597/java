package com.arr;

import java.util.Scanner;

public class maxmin {
	public static void main(String args[])
	{
	int a[],size,i;
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter size");
	size=sc.nextInt();
	a=new int[size];
	int max=a[0];
	System.out.println("Enter elements");
	for(i=0;i<size;i++)
	{
		a[i]=sc.nextInt();
		if(a[i]>max)
		{
			max=a[i];
		}
	}
			System.out.println("maximum is:" +max);
	
	int min=a[0];
	for(i=0;i<size;i++)
	{
		if(a[i]<min)
		{
			 min=a[i];
		}
	}
			System.out.println("minimum is:" +min);
	
	}
}
	
	





