package pkg09_TestNG;

import java.time.*;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.*;
import org.openqa.selenium.firefox.*;
import org.testng.annotations.*;

public class P04_ParallelExecution
{
	WebDriver driver;
	
	@Parameters({"browserName"})
	
	@Test
	public void process(String browser) throws InterruptedException
	{
		if(browser.equals("chrome"))
		{
			driver = new ChromeDriver();
		}
		else
		{
			driver = new FirefoxDriver();
		}
		
		driver.get("https://www.facebook.com/");
		//driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		Thread.sleep(10000);
		
		driver.quit();
	}
}