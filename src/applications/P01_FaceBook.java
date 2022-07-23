package applications;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class P01_FaceBook
{
	public static void main(String[] args)
	{
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		String title = driver.getTitle();
		String url = driver.getCurrentUrl();
		
		driver.findElement(By.id("email")).sendKeys("abhilambe@gmail.com");
		driver.findElement(By.id("pass")).sendKeys("12345678");
		driver.findElement(By.name("login")).click();
		
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
		System.out.println("URL : " + url);
	}
}