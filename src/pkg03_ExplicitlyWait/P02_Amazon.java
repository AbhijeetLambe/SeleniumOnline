package pkg03_ExplicitlyWait;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class P02_Amazon
{
	public static void main(String[] args)
	{
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		
		WebDriverWait w = new WebDriverWait(driver, Duration.ofSeconds(10));
		
		String title = driver.getTitle();
		w.until(ExpectedConditions.titleContains("Online Shopping site in India: Shop Online for Mobiles, Books, Watches, Shoes and More - Amazon.in"));
		
		WebElement searchBar = driver.findElement(By.id("twotabsearchtextbox"));
		w.until(ExpectedConditions.elementToBeClickable(searchBar)).click();
		
		w.until(ExpectedConditions.elementToBeClickable(searchBar)).sendKeys("One Plus Mobile");
		
		WebElement button01 = driver.findElement(By.id("nav-search-submit-button"));
		w.until(ExpectedConditions.elementToBeClickable(button01)).click();
		
		// driver.close();
		
		if (title.equals("Online Shopping site in India: Shop Online for Mobiles, Books, Watches, Shoes and More - Amazon.in"))
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