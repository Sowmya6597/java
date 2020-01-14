package com.arr;
import java.util.Scanner;

public class reverse {
	public static void main(String args[])
	{
	int arr[],size,i;
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
		System.out.println(arr[i]);
	}
	for(i=size-1;i>=0;i--)
	{
		System.out.println(arr[i]);
	}
	}
	}
		
		
		
		
	
	
	


