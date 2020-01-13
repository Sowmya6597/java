package com.arr;

class Outer1 {
	int x=10;
	static int y=20;
	static class Inner{
		public void display()
		{
			
			System.out.println(y);
		}
	}
}
class Outer
{ 
public static void main(String args[])
{
	Outer1.Inner i=new Outer1.Inner();
	i.display();
}
}

