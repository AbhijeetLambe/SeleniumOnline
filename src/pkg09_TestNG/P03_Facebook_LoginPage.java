package pkg09_TestNG;

import org.testng.*;
import org.testng.annotations.*;

import java.time.*;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.*;

public class P03_Facebook_LoginPage
{
	WebDriver driver;
	
	@BeforeMethod
	public void opening()
	{
		driver = new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		String title = driver.getTitle();
		String url = driver.getCurrentUrl();
		
		Reporter.log(title, true);
		Reporter.log(url, true);
	}
	
	@Test
	public void process()
	{
		driver.findElement(By.id("email")).sendKeys("abhilambe@gmail.com");
		driver.findElement(By.id("pass")).sendKeys("1234567890");
		
		driver.findElement(By.name("login")).click();
	}
	
	@AfterMethod
	public void ending()
	{
		driver.quit();
	}
}