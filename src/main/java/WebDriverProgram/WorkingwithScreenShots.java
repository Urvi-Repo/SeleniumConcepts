package WebDriverProgram;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


import io.github.bonigarcia.wdm.WebDriverManager;

public class WorkingwithScreenShots {

	public static void main(String[] args) throws IOException, InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.surveymonkey.com/user/sign-in/");
		
		WebElement username= driver.findElement(By.xpath("//input[@id='username']"));
		WebElement password=driver.findElement(By.xpath("//input[@id='password']"));
		WebElement login=driver.findElement(By.xpath("//button[@type='submit']"));
		
	   // captureScreenShot(driver, "Before");
		
		/*driver.findElement(By.xpath("//input[@id='username']")).sendKeys("UrviAmin");
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("Urvi@1995");
		driver.findElement(By.xpath("//button[@type='submit']")).click();*/
	    
		flash(username,driver);
	    username.sendKeys("UrviAmin");
	    captureScreenShotForElement(username, "username");
	    flash(password,driver);
	    password.sendKeys("Urvi@1995");
	    captureScreenShotForElement(password, "password");
	    captureScreenShot(driver,"complete page");
	    login.click();
	    captureScreenShot(driver,"Loggedin page");
		//Thread.sleep(5000);
		
		
	}
	
	//Captures SS for complete page
	public static void captureScreenShot(WebDriver driver, String FileName)
	{
		File srcFile =	((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		try {
			FileUtils.copyFile(srcFile,new File("./target/screenshot/"+FileName+".png"));
		} catch (IOException e) {
			// TODO Auto-generated catch bloc
			e.printStackTrace();
		}
	}
	
	//Capture the SS for individual Element
	public static void captureScreenShotForElement(WebElement element, String FileName)
	{
		File srcFile =	((TakesScreenshot)element).getScreenshotAs(OutputType.FILE);
		try {
			FileUtils.copyFile(srcFile,new File("./target/screenshot/"+FileName+".png"));
		} catch (IOException e) {
			// TODO Auto-generated catch bloc
			e.printStackTrace();
		}
	}
	
	public static void flash(WebElement element, WebDriver driver)
	{
		JavascriptExecutor js=  ((JavascriptExecutor)driver);
		String bgcolor = element.getCssValue("backgroundColor");
		for(int i=0;i<20;i++)
		{
			changeColor("rgb(0,200,0)",element,driver);
			changeColor(bgcolor,element,driver);
		}
			
	}
	
	public static void changeColor(String color, WebElement element, WebDriver driver)
	{
		JavascriptExecutor js=  ((JavascriptExecutor)driver);
		js.executeScript("arguments[0].style.backgroundColor='"+color+"'", element);
		try {
			Thread.sleep(20);
			
		}catch(InterruptedException e)
		{
			
		}
	}
			
			
	

}
