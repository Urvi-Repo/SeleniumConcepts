package WebDriverProgram;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HandlingPopups {

	//file upload popup
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("http://the-internet.herokuapp.com/upload");
		
		
		// upload file
		driver.findElement(By.id("file-upload")).sendKeys("C:\\Urvi_Doc\\Global ERP\\ImportantNotes.txt");

	}

}
