package WebDriverProgram;

import java.util.List;

import org.apache.commons.lang3.SystemUtils;
import org.apache.xerces.util.SynchronizedSymbolTable;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.gargoylesoftware.htmlunit.javascript.host.Console;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HandlingCheckboxes {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.spicejet.com");
		
		//check checkbox and find total number of checkboxes available in webpage
		
		driver.findElement(By.xpath("//label[contains(text(),'Family and Friends')]")).click();
		
		List<WebElement> countOfCheckbox = driver.findElements(By.xpath("//input[@type='checkbox']"));
		
		int totalCheckboxCount= countOfCheckbox.size();
		System.out.println("Total Number of Checkbox available in Webpage is: "+totalCheckboxCount);
		
		//Select RadioButtons and find total number of radio buttons available in webpage
		
		driver.findElement(By.xpath("//label[contains(text(),'One Way')]")).click();
		
		List<WebElement> counOfRadio = driver.findElements(By.xpath("//input[@type='radio']"));
		
		int totalRadioCount = counOfRadio.size();
		
		System.out.println("Total Number of RadioButton available in Webpage is: "+totalRadioCount);

	}

}
