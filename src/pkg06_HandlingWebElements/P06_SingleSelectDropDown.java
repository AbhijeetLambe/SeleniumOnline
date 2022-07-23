package pkg06_HandlingWebElements;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.*;
import org.openqa.selenium.support.ui.Select;

public class P06_SingleSelectDropDown
{
	public static void main(String[] args) throws InterruptedException
	{
		 WebDriver driver = new ChromeDriver();
		 driver.get("https://www.ebay.com/");
		 driver.manage().window().maximize();
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		 
		 WebElement ele = driver.findElement(By.id("gh-cat"));
		 
		 Select s = new Select(ele);
		 
		 s.selectByIndex(3);
		 
		 Thread.sleep(3000);
		 s.selectByValue("15032");
		 
		 Thread.sleep(3000);
		 s.selectByVisibleText("Video Games & Consoles");
		 
		 List<WebElement> allopt =  s.getOptions();
		 System.out.println(allopt.size());
		 
		 for(WebElement b : allopt)
		 {
			 System.out.println(b.getText());
		 }
	}
}