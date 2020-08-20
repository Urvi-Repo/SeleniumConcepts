package WebDriverProgram;

import java.util.List;

import org.apache.xerces.util.SynchronizedSymbolTable;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HandlingDropDowns {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.facebook.com/");
		
		//1. Using Sendkeys
		
		WebElement month= driver.findElement(By.id("month"));
		
		//month.sendKeys("March");
		
		//2. Using Select Class
		
		Select select =  new Select(month);
			//1. Select by visible text
			select.selectByVisibleText("Apr");
			//2. Select by index value                  
			//select.selectByIndex(10);
			//2. Select by  value
			//select.selectByValue("1999");
			
		//3. Count no of values in dropdown
			
		List<WebElement> months=	select.getOptions();
		System.out.println("months count: "+months.size());
		
		//4. print all the month name
		
		for (int i = 0; i < months.size(); i++) {
			
		String monthName=	months.get(i).getText();
		System.out.println("Months name: "+monthName);
		}
		
		//5. Selecting value without use of Select class
		
		List<WebElement> list = driver.findElements(By.xpath("//*[@id=\'month\']/option"));
		System.out.println(" : "+ list.size());
		
		for (int i = 0; i < list.size(); i++) {
			
	String GetMonths=		list.get(i).getText();
	
	System.out.println("GetMonths: "+GetMonths);
	if(GetMonths.equals("Oct")) {
		months.get(i).click();
		break;
	}
			
		}
	}

}
