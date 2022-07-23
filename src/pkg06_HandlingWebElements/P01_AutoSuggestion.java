package pkg06_HandlingWebElements;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.*;

public class P01_AutoSuggestion
{
	public static void main(String[] args) throws InterruptedException
	{
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.myntra.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		WebElement ele = driver.findElement(By.className("desktop-searchBar"));
		ele.sendKeys("Hoodie");
		
		Thread.sleep(5000);
		
		List<WebElement> as = driver.findElements(By.xpath("//li[@class='desktop-suggestion null']"));
		
		System.out.println(as.size());
		
		for (WebElement a:as)
		{
			System.out.println(a.getText());
		}
	}
}