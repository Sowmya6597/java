package com.arr;

class Demo{
	public void display()
	{
		System.out.println("Hello");
		
	}
	}
class Ano
{
	public static void main(String args[])
	{
		Demo t=new Demo()
		{
		public void display()
		{
		System.out.println("gmm");
	    }
				};

	    t.display();
}
}