package com.arr;

import java.util.Scanner;

public class sum {
	public static void main(String args[])
	{
	int arr[],size,i,sum=0;
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter size");
	size=sc.nextInt();
	arr=new int[size];
	for(i=0;i<size;i++)
	{
		arr[i]=sc.nextInt();
	}
	for(i=0;i<size;i++)
	{
		sum=sum+arr[i];
	}
	System.out.println("sum is:" +sum);
	}
	

}
