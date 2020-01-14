package com.cts.activity.main;

public class ThreadCreation {
	public static void main(String args[]) {
		Resource resource = new Resource();
		FirstThread f = new FirstThread(resource);
		SecondThread s = new SecondThread(resource);
		Thread t1 = new Thread(f);
		Thread t2 = new Thread(s);
		t1.start();
		t2.start();
	}
}

class FirstThread implements Runnable {
	Resource resource;

	public FirstThread(Resource resource) {
		this.resource = resource;
	}

	public void run() {
		resource.display("First Thread1");
	}
}

class SecondThread implements Runnable {
	Resource resource;

	public SecondThread(Resource resource) {
		this.resource = resource;
	}

	public void run() {
		resource.display("second thread");
	}

}

class Resource {
	public void display(String message) {
		for (int i = 1; i <= 5; i++) {
			System.out.println(message + " " + i);
			try {
				Thread.sleep(3000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
