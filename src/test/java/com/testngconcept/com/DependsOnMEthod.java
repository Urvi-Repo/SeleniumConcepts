package com.testngconcept.com;

import org.apache.xerces.util.SynchronizedSymbolTable;
import org.testng.Assert;
import org.testng.annotations.Test;

public class DependsOnMEthod {
	
	@Test(priority =1)
	public void loginTest()
	{
		System.out.println("logintest");
		//Assert.assertTrue(false);
		Assert.assertTrue(true);
	}
	
	@Test(priority =2, dependsOnMethods="loginTest")
	public void bookTickets()
	{
		System.out.println("Booking Tickets");
		int a = 9/0;
	}
	
	@Test(priority =3, dependsOnMethods= {"loginTest", "bookTickets"})
	public void logoutTest()
	{
	System.out.println("logout test");	
	}
	
	
	/*public void afterLogin()
	{
		String actValue = "Dashboard";
		String expValue = "Dashboard";
		Assert.assertEquals(actValue, expValue);
		
		
	}
	
	@Test
	public void logout()
	{
		System.out.println("logiut");
	}*/
	
	

}
