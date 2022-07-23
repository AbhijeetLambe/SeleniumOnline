package pkg09_TestNG;

import java.time.*;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.*;

import org.testng.*;
import org.testng.annotations.*;

public class P05_Assertions_Assert
{
	WebDriver driver;
	
	@Test
	public void processes()
	{
		driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		String title = driver.getTitle();
		System.out.println(title);
		
		Assert.assertEquals(title, "facebook");
		
		String url = driver.getCurrentUrl();
		System.out.println(url);
	}
	
	@AfterMethod
	public void ending()
	{
		driver.quit();
	}
}