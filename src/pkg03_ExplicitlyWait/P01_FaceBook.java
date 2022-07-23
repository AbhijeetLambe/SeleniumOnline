package pkg03_ExplicitlyWait;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class P01_FaceBook
{
	public static void main(String[] args)
	{
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		
		WebDriverWait w = new WebDriverWait(driver, Duration.ofSeconds(10));
		
		String title = driver.getTitle();
		w.until(ExpectedConditions.titleContains("Facebook – log in or sign up"));
		
		WebElement username01 = driver.findElement(By.id("email"));
		w.until(ExpectedConditions.visibilityOf(username01)).sendKeys("abhilambe@gmail.com");
		
		WebElement password01 = driver.findElement(By.id("pass"));
		w.until(ExpectedConditions.visibilityOf(password01)).sendKeys("12345678");
		
		WebElement login01 = driver.findElement(By.name("login"));
		w.until(ExpectedConditions.elementToBeClickable(login01)).click();
		
		driver.close();
		
		if (title.equals("Facebook – log in or sign up"))
		{
			System.out.println("Test Pass : Login Page is Displayed.....");
		}
		else
		{
			System.out.println("Test Fail : Login Page is Not Dispaled.....");
		}
		
		System.out.println("Title : " + title);
	}
}