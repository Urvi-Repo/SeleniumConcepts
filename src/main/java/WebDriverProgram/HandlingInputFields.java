package WebDriverProgram;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HandlingInputFields {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.surveymonkey.com/user/sign-in");
		
	    WebElement userName=driver.findElement(By.id("username"));
	    
		//1. Clearing Existing Value
		//existing value
		userName.sendKeys("UrviAmin");
		
		Thread.sleep(5000);
		
		//clear existing value
		userName.clear();
		//send new value
		userName.sendKeys("TestText");
		
		//2. Entering value

		userName.sendKeys("UrviAmin");
		
		//2. Captured the value entered -> will capture the value entered during runtime.
		userName.getAttribute("value");
	}

}
