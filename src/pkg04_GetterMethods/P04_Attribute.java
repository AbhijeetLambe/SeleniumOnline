package pkg04_GetterMethods;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.*;

public class P04_Attribute
{
	public static void main(String[] args)
	{
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		
		WebElement ele = driver.findElement(By.name("email"));
		
		String s = ele.getAttribute("type");
		
		System.out.println(s);
	}
}