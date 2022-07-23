package pkg01_Basics;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.*;

public class P06_GetCurrentUrlMethod
{
	public static void main(String[] args)
	{
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		
		String url = driver.getCurrentUrl();
		System.out.println(url);
		
		driver.close();
	}
}