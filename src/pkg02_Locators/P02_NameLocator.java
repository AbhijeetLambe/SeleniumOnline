package pkg02_Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class P02_NameLocator
{
	public static void main(String[] args)
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		
		driver.findElement(By.name("email")).sendKeys("abhilambe@gmail.com");
		driver.findElement(By.name("pass")).sendKeys("12345678");
		driver.findElement(By.name("login")).click();
	}
}