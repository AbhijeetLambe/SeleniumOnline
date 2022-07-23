package pkg03_ExplicitlyWait;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class P03_ActTime
{
	public static void main(String[] args)
	{
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://demo.actitime.com/login.do");
		driver.manage().window().maximize();
		
		WebDriverWait w = new WebDriverWait(driver, Duration.ofSeconds(10));
		
		String title = driver.getTitle();
		w.until(ExpectedConditions.titleContains("actiTIME - Login"));
		
		WebElement username01 = driver.findElement(By.id("username"));
		w.until(ExpectedConditions.visibilityOf(username01)).sendKeys("admin");
		
		WebElement password01 = driver.findElement(By.name("pwd"));
		w.until(ExpectedConditions.visibilityOf(password01)).sendKeys("admin");
		
		WebElement login01 = driver.findElement(By.xpath("//div[text()='Login ']"));
		w.until(ExpectedConditions.elementToBeClickable(login01)).click();
		
		// driver.close();
		
		if (title.equals("actiTIME - Login"))
		{
			System.out.println("Test Pass : Home Page is Displayed.....");
		}
		else
		{
			System.out.println("Test Fail : Home Page is Not Displayed.....");
		}
		
		System.out.println("Title : " + title);
	}
}