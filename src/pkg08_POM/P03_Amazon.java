package pkg08_POM;

import org.openqa.selenium.*;
import org.openqa.selenium.support.*;

public class P03_Amazon
{
	// Declaration
	@FindBy(id = "twotabsearchtextbox")
	private WebElement searchBox;
	
	@FindBy(id = "nav-search-submit-button")
	private WebElement submitButton;
	
	
	// Initializing
	public P03_Amazon(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	
	// Utilization
	public void search(String i)
	{
		searchBox.sendKeys(i);
	}
	
	public void submit()
	{
		submitButton.click();
	}
}