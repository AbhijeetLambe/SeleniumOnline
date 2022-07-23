package pkg06_HandlingWebElements;

import java.time.Duration;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.*;

public class P12_HiddenOrCalenderPopUp
{
	public static void main(String[] args)
	{
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.makemytrip.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		WebElement ele1 = driver.findElement(By.xpath("(//span[@class='lbl_input latoBold appendBottom10'])[1]"));
		ele1.click();
		
		WebElement ele2 = driver.findElement(By.xpath("(//p[text()='16'])[1]"));
		ele2.click();
	}
}