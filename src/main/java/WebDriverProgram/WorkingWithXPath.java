package WebDriverProgram;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WorkingWithXPath {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.surveymonkey.com/user/sign-in/");
		
		driver.findElement(By.xpath("//input[@id='username']")).sendKeys("UrviAmin");
		
		//Syntax of  Relative XPath
		//we never use absolute path bcoz if some tag chnage script will be fail
		
		// 1. //tagname[@attributename='attributevalue']
		//xpath with 2 attribute
		//2. input[@id='username' and @type='text']
		
		/*
		 * contains
		 *///3. tagname[contains(@attributename,'attributevalue')]
		
	//	<button class="wds-button wds-button--stretch wds-button--icon-right wds-button--arrow-right" type="submit">LOG IN<span></span></button>
		//3. button[contains(@class,'wds-button wds-button--stretch wds-button--icon-right wds-button--arrow-right')]
		//button[contains(@class,'wds-button')]
		
		// 4. input[contains(@id,'username') and @type='text']
		//5. input[contains(@id,'') and @type='text']
		
		//6. for a link
		// //a[contains(text(),'Log in with SSO')]
		
		
	//7.	(//input[contains(@class,'sm-input--stretch')])[1]
		//8. (//input[contains(@class,'sm-input--stretch')])[position()=1]
		
		//9. last elemnet from number of element
		
		//(//input[contains(@id,'u_')])[last()]
		
		//10 .Xpath with only tagname
		//(//a)[1]
		
		//a[text()='Forgot account?']
		

	}

}
