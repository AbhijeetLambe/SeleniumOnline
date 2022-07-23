package pkg08_POM;

import java.time.Duration;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.*;

public class P01_GoogleMain
{
	public static void main(String[] args)
	{
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.co.in/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		P01_Google g = new P01_Google(driver);
		
		driver.navigate().refresh();
		
		g.search("ASUS ROG 6 Pro");
	}
}