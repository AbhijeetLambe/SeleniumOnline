package pkg06_HandlingWebElements;

import java.io.*;
import java.time.*;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.*;

public class P09_Screenshot
{
	public static void main(String[] args) throws IOException
	{
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.myntra.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		TakesScreenshot ts = (TakesScreenshot) driver;
		
		File RAM = ts.getScreenshotAs(OutputType.FILE);
		
		File dest = new File("./Photos/myntraHomePage.png");
		
		FileUtils.copyFile(RAM, dest);
		
		driver.close();
	}
}