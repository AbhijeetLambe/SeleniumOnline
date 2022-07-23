package pkg05_VerificationMethods;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.*;

public class P02_Enable
{
	public static void main(String[] args)
	{
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		
		WebElement ele = driver.findElement(By.name("login"));
		
		if(ele.isEnabled())
		{
			System.out.println("Pass : Element is Enabled.....");
			ele.click();
		}
		else
		{
			System.out.println("Fail : Element is not Enabled.....");
		}
	}
}