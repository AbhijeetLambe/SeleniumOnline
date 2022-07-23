package pkg01_Basics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class P04_NavAPI
{
	public static void main(String[] args) throws InterruptedException
	{
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.amazon.in/");
		
		// Go to Another Application
		driver.navigate().to("https://www.flipkart.com/");
		
		// Back
		driver.navigate().back();
		
		Thread.sleep(3000);
		
		// Forward
		driver.navigate().forward();
		
		Thread.sleep(3000);
		
		// Refresh
		driver.navigate().refresh();
		
		driver.close();
	}
}