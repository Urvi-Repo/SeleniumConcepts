package WebDriverProgram;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class CommonUtils {
	
	/**
	 * This method can be used to select value from dropdown based on value passed to the method
	 * @param element
	 * @param valueToSelect
	 */
	public void fnSelectValueFromDropdownByText(WebElement element, String valueToSelect)
	{
		Select select = new Select(element);
		select.selectByVisibleText(valueToSelect);
	}
	
	/**
	 * This method can be used to select value form dropdown based on index
	 * @param element
	 * @param index
	 */
	
	public void fnSelectValueFromDropdownByIndex(WebElement element, int index)
	{
		Select select = new Select(element);
		select.selectByIndex(index);
	}
	
	public ArrayList<String> getAllDropdownValue(WebElement element)
	{
		Select select = new Select(element);
		
		List<WebElement> dropdownlist =	select.getOptions();
		ArrayList<String> ar = new ArrayList<String>();
		
		for (int i = 0; i < dropdownlist.size(); i++) {
			String dropdownvalue = 	dropdownlist.get(i).getText();
			ar.add(dropdownvalue);
			
		}
		return ar;
	}
	

}
	