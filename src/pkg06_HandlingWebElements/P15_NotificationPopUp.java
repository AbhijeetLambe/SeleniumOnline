package pkg06_HandlingWebElements;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.*;

public class P15_NotificationPopUp
{
	public static void main(String[] args)
	{
		ChromeOptions c = new ChromeOptions();
		c.addArguments("--disable notification");
		
		WebDriver driver = new ChromeDriver(c);
		driver.get("");
	}
}