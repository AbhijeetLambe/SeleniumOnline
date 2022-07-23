package pkg06_HandlingWebElements;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.time.Duration;

import org.openqa.selenium.*;
import org.openqa.selenium.firefox.*;

public class P13_FileDownloadPopUp
{
	public static void main(String[] args) throws AWTException
	{
		WebDriver driver = new FirefoxDriver();
		
		driver.get("https://www.selenium.dev/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		WebElement ele1 = driver.findElement(By.xpath("//span[text()='Downloads']"));
		ele1.click();
		
		WebElement ele2 = driver.findElement(By.xpath("//a[text()='4.3.0']"));
		ele2.click();
		
		Robot rbt = new Robot();
		
		rbt.keyPress(KeyEvent.VK_CONTROL);
		rbt.keyPress(KeyEvent.VK_TAB);
		rbt.keyPress(KeyEvent.VK_TAB);
		rbt.keyPress(KeyEvent.VK_ENTER);
		
		rbt.keyRelease(KeyEvent.VK_CONTROL);
		rbt.keyRelease(KeyEvent.VK_TAB);
		rbt.keyRelease(KeyEvent.VK_TAB);
		rbt.keyRelease(KeyEvent.VK_ENTER);
	}
}