package com.cts.activity.main;

public class ThreadDemo {
	public static void main(String args[])
	{
		Thread thread=Thread.currentThread();
		//System.out.println(thread);
		thread.setName("CTS Thread");
		System.out.println("Thread Name :"+thread.getName());
		System.out.println("Is thread Daemon:" +thread.isDaemon());
		System.out.println("Is thread alive:" +thread.isAlive());
		System.out.println("Thread State:"+thread.getState());
		 System.out.println("Thread ID:"+thread.getId());
	}

}
