package pkg04_GetterMethods;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.*;

public class P02_Location
{
	public static void main(String[] args)
	{
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		
		WebElement ele = driver.findElement(By.id("email"));
		
		Point loc = ele.getLocation();
		
		int x = loc.getX();
		int y = loc.getY();
		
		System.out.println(x);
		System.out.println(y);
	}
}