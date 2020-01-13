package com.cts.test;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;


public class Calcuator  {
	Calcuator calculator;
	@Before
public void init()
{
		calculator=new Calcuator();
		System.out.println("Object created");
}
	@After
	public void destroy()
	{
		calculator=null;
		System.out.println("object destroyed");
	}
	
	@Test
	public void testAddNumbers()
	{
		assertEquals(5, calculator.add(2,3));
	}
}
	

	
