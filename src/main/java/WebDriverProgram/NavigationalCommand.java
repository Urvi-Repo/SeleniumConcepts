package WebDriverProgram;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class NavigationalCommand {

	public static void main(String[] args) throws InterruptedException {
		// -> <- and Refresh button command in chrome
		
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver= new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.google.com/");
		String googleTitle=	driver.getTitle();
		System.out.println("Google application title is: "+ googleTitle);
		
	
		driver.get("https://www.facebook.com/");
		String FacebookTitle=driver.getTitle();
		System.out.println("Facebbook application title is: "+ FacebookTitle);
		
		Thread.sleep(2000);
		
		//clicking on browser back button
		driver.navigate().back();
		System.out.println("Google ApplicationTiltle is: "+ googleTitle);
		
		Thread.sleep(2000);
		
		//clicking on browser forward button
		driver.navigate().forward();
		System.out.println("Facebbook ApplicationTiltle is: "+ FacebookTitle);
		
		Thread.sleep(2000);
		
		//Refresh a page
		driver.navigate().refresh();
		
		driver.close();
	}

}
