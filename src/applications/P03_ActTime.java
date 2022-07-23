package applications;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class P03_ActTime
{
	public static void main(String[] args)
	{
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://demo.actitime.com/login.do");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		String title = driver.getTitle();
		String url = driver.getCurrentUrl();
		
		driver.findElement(By.id("username")).sendKeys("admin");
		driver.findElement(By.name("pwd")).sendKeys("admin");
		driver.findElement(By.xpath("//div[text()='Login ']")).click();
		
		driver.close();
		
		if (title.equals("actiTIME - Login"))
		{
			System.out.println("Test Pass : Home Page is Displayed.....");
		}
		else
		{
			System.out.println("Test Fail : Home Page is Not Displayed.....");
		}
		
		System.out.println("Title : " + title);
		System.out.println("URL : " + url);
	}
}