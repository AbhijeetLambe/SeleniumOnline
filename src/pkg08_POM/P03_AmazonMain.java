package pkg08_POM;

import java.time.*;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.*;

public class P03_AmazonMain
{
	public static void main(String[] args)
	{
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		P03_Amazon a = new P03_Amazon(driver);
		
		a.search("Asus ROG 6 Pro");
		a.submit();
	}
}