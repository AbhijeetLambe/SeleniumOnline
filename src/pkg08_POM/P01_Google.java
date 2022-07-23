package pkg08_POM;

import org.openqa.selenium.*;
import org.openqa.selenium.support.*;

public class P01_Google
{
	// Declaration
	@FindBy(name="q")
	private WebElement searchBox;
	
	
	// Initialization
	public P01_Google(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	
	// Utilization
	public void search(String i)
	{
		searchBox.sendKeys(i);
	}
}