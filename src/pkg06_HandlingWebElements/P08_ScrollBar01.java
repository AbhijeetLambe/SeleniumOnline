package pkg06_HandlingWebElements;

import java.time.Duration;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.*;

public class P08_ScrollBar01
{
	public static void main(String[] args) throws InterruptedException
	{
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		
		// Scroll from Top to Down
		js.executeScript("window.scrollBy(0,5000)");
		
		Thread.sleep(3000);
		
		// Scroll from Bottom to Up
		js.executeScript("window.scrollBy(0,-5000)");
	}
}