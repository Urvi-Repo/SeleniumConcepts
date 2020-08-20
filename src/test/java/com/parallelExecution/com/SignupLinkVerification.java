package com.parallelExecution.com;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SignupLinkVerification {
	
	WebDriver driver;
	
	By username= By.id("username");
	By password=By.id("password");
	By loginButton=By.xpath("//button[@type='submit']");
	By signupLink=By.linkText("Sign Up");
	By dashboardLink= By.linkText("Dashboard");
	
	
	
	@BeforeMethod
	public void init_setup()
	{
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver(); // opening new application
		driver.manage().window().maximize(); // maximize application
		driver.manage().deleteAllCookies(); // delete cookies
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		driver.get("https://www.surveymonkey.com/user/sign-in/");
		
	}
	
	@Test
	public void verifySignUpText() {
	boolean status =	driver.findElement(signupLink).isDisplayed();
	Assert.assertTrue(status);
	}
	
	@AfterMethod
	public void tearDown()
	{
		driver.quit();
	}


}
