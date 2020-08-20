package WebDriverProgram;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HandlingAlerts {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
		
		driver.findElement(By.name("proceed")).click();	
		Alert alert = driver.switchTo().alert(); // to move into alert
		
	String alertVal =	alert.getText();  // get text from alert box
	
	System.out.println("alertVal: "+alertVal);
		
alert.accept(); // to click on OK buttton
alert.dismiss(); // click on OK button  -> you can use when yu have only one button  -> when you have cancel button must use dismiss()

		

	}

}
