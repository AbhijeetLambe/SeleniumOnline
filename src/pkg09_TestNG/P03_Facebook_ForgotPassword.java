package pkg09_TestNG;

import java.time.*;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.*;

import org.testng.*;
import org.testng.annotations.*;

public class P03_Facebook_ForgotPassword
{
	WebDriver driver;
	
	@BeforeMethod
	public void starting()
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
		driver.findElement(By.linkText("Forgotten password?")).click();
		driver.findElement(By.xpath("(//input[@name='email'])[2]")).sendKeys("abhilambe@gmail.com");
		
		driver.findElement(By.id("did_submit")).click();
	}
	
	@AfterMethod
	public void ending()
	{
		driver.quit();
	}
}