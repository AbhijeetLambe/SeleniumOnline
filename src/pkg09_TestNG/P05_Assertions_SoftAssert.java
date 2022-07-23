package pkg09_TestNG;

import java.time.*;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.*;

import org.testng.annotations.*;
import org.testng.asserts.*;

public class P05_Assertions_SoftAssert
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
		
		SoftAssert soft = new SoftAssert();
		soft.assertEquals(title, "facebook");
		
		String url = driver.getCurrentUrl();
		System.out.println(url);
		
		soft.assertAll();
	}
	
	@AfterMethod
	public void ending()
	{
		driver.quit();
	}
}