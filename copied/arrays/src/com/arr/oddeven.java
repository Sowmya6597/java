package com.arr;

import java.util.Scanner;

public class oddeven {
	public static void main(String args[])
	{
	int a[],size,i;
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter size");
	size=sc.nextInt();
	a=new int[size];
	for(i=0;i<size;i++)
		{
		 a[i]=sc.nextInt();
		}
		
	System.out.println("Enter elements");
	for(i=0;i<size;i++)
	{
		if(a[i]%2==0);
		System.out.println(a[i]);
		
	}
		for(i=0;i<size;i++)
		{
			if(a[i]!=0)
			System.out.println(a[i]);
				
		}
	
		}
}
		