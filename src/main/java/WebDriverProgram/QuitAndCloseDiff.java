package WebDriverProgram;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class QuitAndCloseDiff {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.facebook.com/");
		
		driver.findElement(By.linkText("Cookies Policy")).click();
		
		//driver.close();// it closes the browser where selelium in residing that  means will close current browser
		
		driver.quit(); // closes all the browsers
		
		

		

	}

}
