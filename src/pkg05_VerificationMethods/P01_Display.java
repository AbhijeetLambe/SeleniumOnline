package pkg05_VerificationMethods;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.*;

public class P01_Display
{
	public static void main(String[] args)
	{
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		
		WebElement ele = driver.findElement(By.id("email"));
		
		if(ele.isDisplayed())
		{
			System.out.println("Pass : Element is Displayed.....");
		}
		else
		{
			System.out.println("Fail : Element is not Displayed.....");
		}
	}
}