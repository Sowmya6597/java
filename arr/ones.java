package com.arr;

import java.util.Scanner;

public class ones {
	int n1,n2,n3,c=0;
	Scanner sc=new Scanner(System.in);
	 n1=sc.nextInt();
	 n2=sc.nextInt();
	for(int i=n1;i<n2;i++)
	{
		int n3=i;
		while(n3>0)
		{
			int s=n3%10;
			n3=n3/10;
			if(s==1)
			{
				c=c+1;
				
				
			}
				
		}
	}
	
}
