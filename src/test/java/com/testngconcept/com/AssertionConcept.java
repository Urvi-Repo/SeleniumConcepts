package com.testngconcept.com;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

//Assertions -> to verify that one value is matching with another value
//			-> if any step is failed it will not continue with other steps of execution - hard assertion.
//			-> if any step will fail it will continue with other steps of execution. - soft assertion.

public class AssertionConcept {
	
	@Test
	public void VerifyValues()
	{
		/*String value1 = "Urvi";
		String value2 = "Urvi";
		
		Assert.assertEquals(value1, value2);*/
		
		SoftAssert sa= new SoftAssert();
		
		sa.assertEquals("apple", "orange","fruits are not same");
		sa.assertEquals(10,10, "number are not match ");
		sa.assertTrue(false,"links are not displayed");
		sa.assertFalse(true,"button should not be displayed");
		sa.assertAll();
	}

}
