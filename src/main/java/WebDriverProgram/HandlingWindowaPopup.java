package WebDriverProgram;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HandlingWindowaPopup {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("http://popuptest.com/goodpopups.html");
		
		System.out.println("Title is "+driver.getTitle());
		driver.findElement(By.linkText("Good PopUp #3")).click();
		
		//System.out.println("Title of popup window"+ driver.getTitle());
	Set<String> winId =	driver.getWindowHandles();
Iterator<String> itr =	winId.iterator();

String primaryWindow = itr.next();
String secondWindow = itr.next();

System.out.println("Primry Window is: "+primaryWindow+"----- SecondaryWindow is: "+secondWindow);

driver.switchTo().window(secondWindow);
System.out.println("Title of popup window"+ driver.getTitle());

driver.switchTo().window(primaryWindow);

		

	}

}
