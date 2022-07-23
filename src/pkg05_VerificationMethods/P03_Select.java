package pkg05_VerificationMethods;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.*;

public class P03_Select
{
	public static void main(String[] args)
	{
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.actitime.com/login.do");
		driver.manage().window().maximize();
		
		WebElement ele = driver.findElement(By.id("keepLoggedInCheckBox"));
		
		if(ele.isSelected())
		{
			System.out.println("Pass : Element is Selected.....");
		}
		else
		{
			System.out.println("Fail : Element is not Selected.....");
			ele.click();
		}
	}
}