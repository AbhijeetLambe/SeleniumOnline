package pkg01_Basics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class P02_OpenURL
{
	public static void main (String[] args)
	{
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.amazon.in/");
		
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		
		driver.close();
	}
}