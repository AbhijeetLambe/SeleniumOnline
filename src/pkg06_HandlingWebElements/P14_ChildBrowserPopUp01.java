package pkg06_HandlingWebElements;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.*;

public class P14_ChildBrowserPopUp01
{
	public static void main(String[] args)
	{
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.switchTo().newWindow(WindowType.TAB);
		driver.get("https://www.amazon.in/");
		
		String currentTab = driver.getWindowHandle();
		System.out.println(currentTab);
		
		Set<String> allSimul = driver.getWindowHandles();
		System.out.println(allSimul);
		
		driver.quit();
	}
}