package pkg06_HandlingWebElements;

import java.time.Duration;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.*;
import org.openqa.selenium.interactions.*;

public class P02_MouseHover
{
	public static void main(String[] args)
	{
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.myntra.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		WebElement ele = driver.findElement(By.xpath("(//a[text()='Women'])[1]"));
		
		Actions a = new Actions(driver);
		
		a.moveToElement(ele).perform();
		
		driver.findElement(By.xpath("(//a[text()='Dresses'])[1]")).click();
	}
}