package applications;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class P02_Amazon
{
	public static void main(String[] args)
	{
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		String title = driver.getTitle();
		String url = driver.getCurrentUrl();
		
		driver.findElement(By.id("twotabsearchtextbox")).click();
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("One Plus Mobile");
		driver.findElement(By.id("nav-search-submit-button")).click();
		
		driver.close();
		
		if (title.equals("Online Shopping site in India: Shop Online for Mobiles, Books, Watches, Shoes and More - Amazon.in"))
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