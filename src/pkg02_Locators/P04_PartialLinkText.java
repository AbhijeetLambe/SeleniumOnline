package pkg02_Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class P04_PartialLinkText
{
	public static void main(String[] args)
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.skillrary.com/user/login");
		
		driver.findElement(By.linkText("Forgot Password")).click();
		// driver.findElement(By.linkText("Return to login page")).click();
		
		driver.findElement(By.partialLinkText("Return")).click();
	}
}