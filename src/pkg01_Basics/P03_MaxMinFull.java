package pkg01_Basics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class P03_MaxMinFull
{
	public static void main(String[] args) throws InterruptedException
	{
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.amazon.in/");
		
		// Maximize
		driver.manage().window().maximize();
		
		Thread.sleep(3000);
		
		// Minimize
		driver.manage().window().minimize();
		
		Thread.sleep(3000);
		
		// Full Screen
		driver.manage().window().fullscreen();
		
		driver.close();
	}
}