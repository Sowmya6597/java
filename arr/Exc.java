package com.arr;
import java.util.PriorityQueue;

public class Exc {
	public static void main(String args[])
	{
		PriorityQueue<Integer> numbers =new PriorityQueue();
		numbers.add(800);
		numbers.add(900);
		numbers.add(890);
		numbers.add(809);
		numbers.poll();
		while(!numbers.isEmpty())
		{
			System.out.println(numbers.remove());
		}
	}

}
