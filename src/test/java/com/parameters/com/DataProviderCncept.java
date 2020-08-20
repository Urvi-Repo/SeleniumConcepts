package com.parameters.com;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DataProviderCncept {

	WebDriver driver;
	Properties prop;
	By username= By.id("username");
	By password=By.id("password");
	By loginButton=By.xpath("//button[@type='submit']");
	By signupLink=By.linkText("Sign Up");
	By dashboardLink= By.linkText("Dashboard");
	
	//Test
	@BeforeMethod
	public void init_setup() throws IOException
	{
		//properties concept
		
		prop = new Properties();
		//File input o/p stream
		
		FileInputStream fis = new FileInputStream("C:\\Urvi_Doc\\Selenium_Practice\\Selenium_Training\\config.prorerties");
		
		prop.load(fis);
		
	String appurl =	prop.getProperty("url");
		
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver(); // opening new application
		driver.manage().window().maximize(); // maximize application
		driver.manage().deleteAllCookies(); // delete cookies
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		//driver.get("https://www.surveymonkey.com/user/sign-in/");
		driver.get(appurl);
		
	}
	
	
	
	@Test(dataProvider="keepData")
	public void login(String Username, String Password)
	{
		 driver.findElement(username).sendKeys(Username);
		 driver.findElement(password).sendKeys(Password);
		 driver.findElement(loginButton).click();
		 
	}
	
	@AfterMethod
	public void tearDown()
	{
		driver.quit();
	}


	
	
	//DataProvider
	public Object[][] keepData()
	{
		//Username and Password
		Object users[][] = new Object[2][2];
		users[0][0]="UrviAmin";
		users[0][1]="Urvi@1995";
		
		users[1][0]="UrviAmin";
		users[1][1]="Urvi@1995";
		
		return users;
	}
}
