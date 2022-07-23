package pkg06_HandlingWebElements;

import java.time.Duration;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.*;
import org.openqa.selenium.interactions.*;

public class P11_AlertPopUp
{
	public static void main(String[] args)
	{
		WebDriver driver = new ChromeDriver();
		driver.get("https://demoapp.skillrary.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		WebElement ele1 = driver.findElement(By.id("course"));
		
		Actions a = new Actions(driver);
		a.moveToElement(ele1).perform();
		
		WebElement ele2 = driver.findElement(By.xpath("(//a[text()='Selenium Training'])[1]"));
		ele2.click();
		
		WebElement ele3 = driver.findElement(By.xpath("//button[@class='btn btn-primary btn-lg btn-flat']"));
		ele3.click();
		
		Alert popup = driver.switchTo().alert();
		popup.accept();
		// popup.dismiss();
	}
}