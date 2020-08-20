package com.testngconcept.com;

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

public class InvocationCount {
	
	//page objects/Repository
	
	//WebDriverManager.chromedriver().setup();
	//WebDriver driver = new ChromeDriver();
	//driver.manage().window().maximize();
	
	//driver.get("https://www.surveymonkey.com/user/sign-in/");
	WebDriver driver;
	
	By username= By.id("username");
	By password=By.id("password");
	By loginButton=By.xpath("//button[@type='submit']");
	By signupLink=By.linkText("Sign Up");
	By dashboardLink= By.linkText("Dashboard");
	
	
	//Prerequasite : invoke chrome, maximise, open application, deletecookies
	
	@BeforeTest //-> execute before every test
	//@BeforeMethod
	public void init_setup()
	{
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver(); // opening new application
		driver.manage().window().maximize(); // maximize application
		driver.manage().deleteAllCookies(); // delete cookies
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		driver.get("https://www.surveymonkey.com/user/sign-in/");
		
	}
	
	//Test-1 -> verify title
	@Test(priority=1, enabled=false)
	public void checkApplicationTitle()
	{
		String appTitle =	driver.getTitle();
		Assert.assertEquals(appTitle, "Log in to your account");
	}
	
	//Test-2 -> verify signup
	@Test(priority=2, enabled=false)
	public void verifySignUpText() {
	boolean status =	driver.findElement(signupLink).isDisplayed();
	Assert.assertTrue(status);
	}
	
	//Test-3 -> verify login is successful
	@Test(priority=3, invocationCount=5)
	public void login()
	{
		 driver.findElement(username).sendKeys("UrviAmin");
		 driver.findElement(password).sendKeys("Urvi@1995");
		 driver.findElement(loginButton).click();
		 
		 
		 //verify login successfull
		String dashboard = driver.findElement(dashboardLink).getText();
		
		Assert.assertEquals(dashboard, "Dashboard");
		 
	}

	//close
	 
	@AfterTest //-> execute after every test.
	//@AfterMethod
	public void tearDown()
	{
		driver.quit();
	}
}
