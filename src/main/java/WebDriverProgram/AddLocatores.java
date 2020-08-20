package WebDriverProgram;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AddLocatores {

	public static void main(String[] args) {
		
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.surveymonkey.com/user/sign-in");
		
		/*//1. ID Locator -- 1st preference given by depend on speed. 
		//sendKeys is use for sending some value the browser. like sending some text to TextBox. 
	 	driver.findElement(By.id("username")).sendKeys("UrviAmin");
		driver.findElement(By.id("password")).sendKeys("Urvi@1995");*/
		
		//2. Name Locator -- 2nd preference
		driver.findElement(By.name("username")).sendKeys("UrviAmin");
		driver.findElement(By.name("password")).sendKeys("Urvi@1995");
		
		/*//3. XPath Locator -- 3rd preference -- 1st best -- this two are less speed but only .1 sec difference but it is accurate
		driver.findElement(By.xpath("//*[@id=\'sign_in_form\']/fieldset/div/div[5]/button")).click();*/
		
			
		//4. CSSSelector -- 3rd preference -- 1st best
		//driver.findElement(By.cssSelector("#sign_in_form > fieldset > div > div:nth-child(5) > button")).click();
		
		//5. ClassName locator -- 4th preference
		//driver.findElement(By.className("wds-button--icon-right")).click();
		
		//6. LinkText -- 5th preference
		//driver.findElement(By.linkText("SIGN UP")).click();
		
		//7. PartialLinkText - just use SING out of complete text "SIGN UP" -- -- 6th preference
		driver.findElement(By.partialLinkText("SIGN")).click();
		
		//TagName
		
	}

}
