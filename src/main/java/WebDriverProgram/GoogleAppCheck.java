package WebDriverProgram;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class GoogleAppCheck {

	public static void main(String[] args) {
		// Open chrome 
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		
		//maximize applications
		driver.manage().window().maximize();
		//Open Google Application
		driver.get("https://www.google.com/");
		
		//Expected Result check with actual result
		//Capture Title
		String Title= driver.getTitle();
		System.out.println("Application title is: "+Title);
		
		//check with actual result
		
		//to match string always use .EQAUL METHOD
		if(Title.equals("Google"))
		{
			System.out.println("Pass");
		}
		else
		{
			System.out.println("fail");
		}
		
		//closing application

		driver.close();
	}

}
