package WebDriverProgram;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SurveyMonkeyTestCase {

	
	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.surveymonkey.com/user/sign-in/");
		
		ElementUtils utils = new ElementUtils(driver);
		
	By userName =	By.xpath("//input[@id='username']");
	By Password =	By.xpath("//input[@id='password']");
	By signInButton =	By.xpath("//button[@type='submit']");
	
		
		/*utils.getElement(userName).sendKeys("UrviAmin");
		utils.getElement(Password).sendKeys("Urvi@1995");
		utils.getElement(signInButton).click();*/

		utils.fnDoSendKeys(userName, "userName");
		utils.fnDoSendKeys(Password, "Urvi@1995");
		utils.fnDoClick(signInButton);
	}

}
