package com.arr;

class Out1{
	int x=10;
	static int y=20;
	class Inner{
		public void display()
		{
			System.out.println(x);
			System.out.println(y);
		}
	}
}
class Out
{ 
public static void main(String args[])
{
	Out1 outer=new Out1();
	Out1.Inner inner=outer.new Inner();
	inner.display();
}
}




