package pkg06_HandlingWebElements;

import java.time.Duration;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.*;
import org.openqa.selenium.interactions.*;

public class P10_Frame
{
	public static void main(String[] args)
	{
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.snapdeal.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		WebElement ele1 = driver.findElement(By.xpath("//span[text()='Sign In']"));
		WebElement ele2 = driver.findElement(By.xpath("//a[text()='login']"));
		
		Actions a = new Actions(driver);
		
		a.moveToElement(ele1).perform();
		
		ele2.click();
		
		driver.switchTo().frame(0);
		
		WebElement ele3 = driver.findElement(By.id("userName"));
		ele3.sendKeys("8806073693");
		
		WebElement ele4 = driver.findElement(By.xpath("//i[@class='sd-icon sd-icon-delete-sign fnt-22']"));
		ele4.click();
		
		driver.switchTo().defaultContent();
		
		driver.findElement(By.xpath("//span[text()='Cart']")).click();
	}
}