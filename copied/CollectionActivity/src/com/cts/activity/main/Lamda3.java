package com.cts.activity.main;

import java.io.IOException;

public class Lamda3
{
	public static void main(String[] args)throws IOException
	{
		Sony s=(a,b) -> a/b;
		System.out.println(s.add(40,20));
		System.out.println(((Second) s).sub(40,20));
	}
}
interface Sony
{
	public int add(int a,int b);
}
interface Second extends Sony
{
	public int sub(int a, int  b);
}
