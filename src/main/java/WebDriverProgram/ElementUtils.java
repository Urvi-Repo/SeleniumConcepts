package WebDriverProgram;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

//Wrappers
public class ElementUtils {

	//step 1
	WebDriver driver;
	//step 2
	public ElementUtils(WebDriver driver)
	{
		this.driver=driver;
	}
	
	//step 3 -- Generic methods for all the locators
	/*public WebElement getElement(By locator)
	{
	  WebElement element=	driver.findElement(locator);
	  return element;
	}*/
	
	private WebElement getElement(By locator)
	{
		WebElement element = null;
		try {
			 element =	driver.findElement(locator);
			
		} catch (Exception e) {
			System.out.println("Some exception ocurred ");
			System.out.println(e.getMessage());
		}
		
		return element;
	}
	
	public void fnDoClick(By locator)
	{
		try {
			getElement(locator).click();	
		} catch (Exception e) {
			System.out.println("Some exception ocurred while clicking element ");
			System.out.println(e.getMessage());
		}
		
	}
	
	public void fnDoSendKeys(By locator, String value)
	{
		try {
			getElement(locator).sendKeys(value);
		} catch (Exception e) {
			System.out.println("Some exception ocurred while entering the value ");
			System.out.println(e.getMessage());
		}
	}
	



}
