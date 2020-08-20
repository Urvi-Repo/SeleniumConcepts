
package WebDriverProgram;



import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HandingLinks {
	public static void main(String[] args) throws InterruptedException {
		
		String linkExp="Resources";
		Boolean status= true;
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.surveymonkey.com/");
		
		
		
		//1. Clicking Links 
		//2. Capture the link text - you can capture that text only available in html DOM. can not capture entered value or else.
		// for this you have to use getAttribute()
		/*String loginText = driver.findElement(By.linkText("LOG IN")).getText();
		System.out.println("Link Text is :"+ loginText); */
		
		//3. Count total no. of links available
		List<WebElement> links =  driver.findElements(By.tagName("a"));
		int linkcount = links.size();
		System.out.println("Link couht "+ linkcount);
		
		//4. Printing all the link names
		for (int i = 0; i < linkcount; i++) {
		String LinkName =links.get(i).getText();
		//5. print only link which has value
		if(!(LinkName.isEmpty()))
		{
			System.out.println("Name of links: "+ LinkName);
		 //6. Verify lnk is available
			if (linkExp.equalsIgnoreCase(LinkName)) {
				//System.out.println("pass");
				//break;
				status=true;
				break;
				
			} else {
				//System.out.println("fail");
				status=false;

			}
		}
		
		
		}
	//verify link is present	
if (status=true) {
	System.out.println("pass");
	
} else {
	System.out.println("fail");

}	
		
		
		
		
	}
	

}
