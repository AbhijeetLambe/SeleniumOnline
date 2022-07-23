package pkg06_HandlingWebElements;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.*;

public class P14_ChildBrowserPopUp02
{
	public static void main(String[] args)
	{
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.skillrary.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		WebElement ele1 = driver.findElement(By.xpath("//a[text()=' GEARS ']"));
		ele1.click();
		
		WebElement ele2 = driver.findElement(By.xpath("(//a[@class='ignorelink'])[11]"));
		ele2.click();
		
		//String newWindow = driver.getWindowHandle();
		
		Set<String> allWindows = driver.getWindowHandles();
		
		for(String b:allWindows)
		{
			driver.switchTo().window(b);
		}
		
		WebElement ele3 = driver.findElement(By.id("mytext"));
		ele3.sendKeys("Abhijeet");
		
		driver.quit();
	}
}