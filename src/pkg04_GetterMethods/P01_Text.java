package pkg04_GetterMethods;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

public class P01_Text
{
	public static void main(String[] args)
	{
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		
		WebElement ele = driver.findElement(By.className("_8eso"));
		System.out.println(ele.getText());
	}
}