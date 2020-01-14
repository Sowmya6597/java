package com.arr;

public class construct 
{

	public static void main(String args[])
	{
		A a=new A();
		A c=new A(11);
		B b=new B();
	}

}
class A
{
	A()
	{
		super();
		System.out.println("1");
	}
	A(int a)
	{
		super();
		{
		System.out.println("2");
	    }
	   System.out.println("3");
	}
}
	class B extends A
	{
		B()
		{
			super();
			System.out.println("4");
		}
		{
		System.out.println("5");
	}
	}