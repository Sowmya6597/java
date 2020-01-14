package com.cts.activity.main;

public class Lamda {
public static void main(String[] args) {
			Hello h=() ->
			{
		 System.out.println("This is Lamda Expression ");
			};
			h.display();
		}
	}
	interface Hello
	{
		public void display();
	}


