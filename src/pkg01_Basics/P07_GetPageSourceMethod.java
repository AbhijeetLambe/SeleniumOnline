package pkg01_Basics;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.*;

public class P07_GetPageSourceMethod
{
	public static void main(String[] args)
	{
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		
		String sourceCode = driver.getPageSource();
		System.out.println(sourceCode);
		
		driver.close();
	}
}