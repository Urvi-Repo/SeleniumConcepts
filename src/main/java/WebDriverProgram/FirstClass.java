package WebDriverProgram;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FirstClass {

	public static void main(String[] args) {
		
	/*//set up new chrome driver. 
	WebDriverManager.chromedriver().setup();
	
	//TopCasting
	WebDriver driver=new ChromeDriver();*/
	
		
	// set up internet explorer	
	WebDriverManager.iedriver().setup();
	WebDriver driver = new InternetExplorerDriver();

	}

}
