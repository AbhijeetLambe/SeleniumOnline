package pkg07_DataDrivenTesting;

import java.io.*;
import java.time.Duration;
import java.util.*;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.*;

public class P01_PropertyFile
{
	public static void main(String[] args) throws IOException
	{
		Properties p = new Properties();
		FileInputStream file = new FileInputStream("./PropertyFiles/Facebook.properties");
		p.load(file);
		
		String url = p.getProperty("url");
		String username = p.getProperty("username");
		String password = p.getProperty("password");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get(url);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		WebElement ele1 = driver.findElement(By.id("email"));
		ele1.sendKeys(username);
		
		WebElement ele2 = driver.findElement(By.id("pass"));
		ele2.sendKeys(password);
		
		WebElement ele3 = driver.findElement(By.name("login"));
		ele3.click();
		
		driver.quit();
	}
}