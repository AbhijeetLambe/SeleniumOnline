package pkg06_HandlingWebElements;

import java.io.IOException;
import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.*;

public class P16_FileUploadPopUp
{
	public static void main(String[] args) throws IOException
	{
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.naukri.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		WebElement ele1 = driver.findElement(By.xpath("//div[text()='Register']"));
		ele1.click();
		
		Set<String> allTabs = driver.getWindowHandles();
		
		for (String i : allTabs)
		{
			driver.switchTo().window(i);
		}
		
		WebElement ele2 = driver.findElement(By.xpath("//button[text()='Upload Resume']"));
		ele2.click();
		
		Runtime run = Runtime.getRuntime();
		run.exec("C:\\Users\\lambe\\Downloads\\Programs\\Selenium\\AutoIT\\FileUploadPopUp.exe");
	}
}