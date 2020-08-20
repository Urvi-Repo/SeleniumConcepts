package WebDriverProgram;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HandlingWebTables {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.w3schools.com/html/html_tables.asp");
		
	/*List<WebElement> tables =	driver.findElements(By.xpath("//table[@id='customers']//tr"));
	System.out.println("size of table ="+ tables.size());*/
	
int rowscount =	driver.findElements(By.xpath("//table[@id='customers']//tr")).size()-1;
System.out.println("size of table ="+ rowscount);

for (int i = 2; i < rowscount+1; i++) {
	String  xPAth = "//table[@id='customers']/tbody/tr["+i+"]/td[1]";
	
String rowValue =	driver.findElement(By.xpath(xPAth)).getText();
System.out.println(""+ rowValue);
	
	
	
}

	}

}
