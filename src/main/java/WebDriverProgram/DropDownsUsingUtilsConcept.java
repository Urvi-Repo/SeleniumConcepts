package WebDriverProgram;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DropDownsUsingUtilsConcept {

	public static void main(String[] args) {
		CommonUtils cu = new CommonUtils();
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.facebook.com/");
		
		WebElement month= driver.findElement(By.id("month"));
		
		
		cu.fnSelectValueFromDropdownByText(month, "Oct");
		
		ArrayList<String> monthList = cu.getAllDropdownValue(month);
		System.out.println("monthList" + monthList);
		

	}

}
