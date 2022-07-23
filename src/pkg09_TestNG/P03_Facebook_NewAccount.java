package pkg09_TestNG;

import java.time.*;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.*;
import org.openqa.selenium.support.ui.*;

import org.testng.*;
import org.testng.annotations.*;

public class P03_Facebook_NewAccount
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
		driver.findElement(By.xpath("//a[@class='_42ft _4jy0 _6lti _4jy6 _4jy2 selected _51sy']")).click();
		
		driver.findElement(By.xpath("(//input[@type='text'])[2]")).sendKeys("Abhijeet");
		driver.findElement(By.xpath("(//input[@type='text'])[3]")).sendKeys("Lambe");
		driver.findElement(By.xpath("(//input[@type='text'])[4]")).sendKeys("1234567890");
		driver.findElement(By.xpath("(//input[@type='password'])[2]")).sendKeys("abhi@1234");
		
		WebElement ele1 = driver.findElement(By.id("day"));
		WebElement ele2 = driver.findElement(By.id("month"));
		WebElement ele3 = driver.findElement(By.id("year"));
		
		Select s1 = new Select(ele1);
		s1.selectByVisibleText("16");
		
		Select s2 = new Select(ele2);
		s2.selectByVisibleText("Jul");
		
		Select s3 = new Select(ele3);
		s3.selectByVisibleText("1996");
		
		driver.findElement(By.xpath("(//input[@type='radio'])[2]")).click();
		
		driver.findElement(By.xpath("//img[@class='_8idr img']")).click();
	}
	
	@AfterMethod
	public void ending()
	{
		driver.quit();
	}
}