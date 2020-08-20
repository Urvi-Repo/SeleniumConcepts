package com.testngconcept.com;

import org.testng.annotations.Test;

public class TestNGException {
	
	@Test(expectedExceptions = {Exception.class, ArrayIndexOutOfBoundsException.class})
	public void exceptionConcept()
	{
		System.out.println("Start test");
		//int i =9/0;
		int no[] = new int[1];
		no[0] =1;
		no[1]=2;
		no[2]=3;
		System.out.println("End test");
	}
	
	@Test(expectedExceptions = ArithmeticException.class, enabled = false)
	public void arithmaticExeption()
	{
		System.out.println("Start test");
		int i =9/0;
		System.out.println("End test");
	}
	
	@Test(expectedExceptions = NullPointerException.class, enabled=false)
	public void nullPointerException()
	{
		System.out.println("Start test");
		int i =9/0;
		System.out.println("End test");
	}
	

}
