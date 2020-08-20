package WebDriverProgram;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HandlingFrames {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		// ** move to / hover element 
		driver.get("https://www.amazon.ca/");
		
		Actions actions = new Actions(driver);
		WebElement target =	driver.findElement(By.xpath("//*[@id='nav-link-accountList']/div/span"));
		
		actions.moveToElement(target).build().perform();
		
		
		
		/*Actions actions = new Actions(driver);
		** Send some value using action
		driver.get("https://www.surveymonkey.com/user/sign-in/");
		actions.sendKeys(driver.findElement(By.id("username")),"UrviAmin").build().perform();
		actions.sendKeys(driver.findElement(By.id("password")),"Urvi@1995").build().perform();
		actions.click(driver.findElement(By.xpath("//*[@id='sign_in_form']/fieldset/div/div[5]/button"))).build().perform();*/
		
		
		/*driver.get("https://jqueryui.com/droppable/");
		
		driver.switchTo().frame(0); // to switch to first frame
		
		WebElement source = driver.findElement(By.id("draggable"));
		WebElement target = driver.findElement(By.id("droppable"));
		
		//** to capture the drag text
		
	String getDragTest=	driver.findElement(By.id("draggable")).getText();
	System.out.println(getDragTest);
	
	String getDropTest = driver.findElement(By.id("droppable")).getText();
	
	//** perfome some actions using mouse or keyboard
	Actions actions = new Actions(driver);
	
	actions.dragAndDrop(source,target).build().perform();*/
	
	
	// ** navigate to out of frame
	//driver.switchTo().defaultContent();
	
	//driver.findElement(By.linkText("Selectable")).click();
	
	
	}

}
