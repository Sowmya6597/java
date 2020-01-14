package com.cts.activity.main;

public class Lamda2 {
	public static void main(String[] args) {
		Runnable r= () ->System.out.println("I am Runnable Interface");
		Thread t=new Thread(r);
		t.start();
	}

}
