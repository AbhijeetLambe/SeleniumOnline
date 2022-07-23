package pkg04_GetterMethods;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.*;

public class P03_Size
{
	public static void main(String[] args)
	{
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		
		WebElement ele = driver.findElement(By.id("email"));
		
		Dimension s = ele.getSize();
		
		int w = s.getWidth();
		int h = s.getHeight();
		
		System.out.println(w);
		System.out.println(h);
	}
}