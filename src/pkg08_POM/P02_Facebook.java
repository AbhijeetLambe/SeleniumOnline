package pkg08_POM;

import org.openqa.selenium.*;
import org.openqa.selenium.support.*;

public class P02_Facebook
{
	// Declaration
	@FindBy (id = "email")
	private WebElement usernameTF;
	
	@FindBy (id = "pass")
	private WebElement passwordTF;
	
	@FindBy (name = "login")
	private WebElement loginButton;
	
	
	// Initialization
	public P02_Facebook(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	
	// Utilization
	public void username(String i)
	{
		usernameTF.sendKeys(i);
	}
	
	public void password(String i)
	{
		passwordTF.sendKeys(i);
	}
	
	public void login()
	{
		loginButton.click();
	}
}