package WebDriverProgram;



import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HandlingImages {
	
public static void main(String[] args) {
	
	WebDriverManager.chromedriver().setup();
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	
	driver.get("https://www.amazon.ca/");
	
	//1. count no of images
	
	List<WebElement> image = driver.findElements(By.tagName("img"));
	
	int imageCount= image.size();
	
	System.out.println("imageCount is : "+imageCount);

	//2. get the url for all images
	
	for (int i = 0; i < imageCount; i++) {
	String imageURL=	image.get(i).getAttribute("src");
	System.out.println("Image Url :"+ imageURL);
		
	}
}
}
