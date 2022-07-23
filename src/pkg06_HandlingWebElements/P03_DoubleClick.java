package pkg06_HandlingWebElements;

import java.time.Duration;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.*;
import org.openqa.selenium.interactions.Actions;

public class P03_DoubleClick
{
	public static void main(String[] args)
	{
		WebDriver driver = new ChromeDriver();
		driver.get("https://demoapp.skillrary.com/product.php?product=selenium-training");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		WebElement ele = driver.findElement(By.id("add"));
		
		Actions a = new Actions(driver);
		
		a.doubleClick(ele).perform();
	}
}