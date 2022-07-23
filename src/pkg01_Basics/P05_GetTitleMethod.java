package pkg01_Basics;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.*;

public class P05_GetTitleMethod
{
	public static void main(String[] args)
	{
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		
		String title = driver.getTitle();
		System.out.println(title);
		
		driver.close();
	}
}