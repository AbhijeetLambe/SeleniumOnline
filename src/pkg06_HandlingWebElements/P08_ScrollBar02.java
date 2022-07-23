package pkg06_HandlingWebElements;

import java.time.Duration;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.*;

public class P08_ScrollBar02
{
	public static void main(String[] args) throws InterruptedException
	{
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		WebElement ele = driver.findElement(By.xpath("//img[@alt='Shop activity trackers and smartwatches']"));
		Point loc = ele.getLocation();
		int x = loc.getX();
		int y = loc.getY();
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(" + x +"," + y +")");
		
		Thread.sleep(5000);
		
		ele.click();
	}
}