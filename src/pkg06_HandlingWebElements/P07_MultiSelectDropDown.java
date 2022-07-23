package pkg06_HandlingWebElements;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.*;
import org.openqa.selenium.support.ui.Select;

public class P07_MultiSelectDropDown
{
	public static void main(String[] args)
	{
		WebDriver driver = new ChromeDriver();
		driver.get("file:///C:/Users/lambe/Downloads/Programs/HTML/Drop%20Down%20(Multi).html");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		WebElement ele = driver.findElement(By.id("menu"));
		
		Select s = new Select(ele);
		s.selectByIndex(1);
		s.selectByValue("v4");
		s.selectByVisibleText("Misal");
		
		List<WebElement> li = s.getOptions();
		int size = li.size();
		
		for(int i=0; i<size; i++)
		{
			System.out.println(li.get(i).getText());
		}
		
		System.out.println(s.isMultiple());
		
		if(s.isMultiple())
		{
			s.deselectAll();
		}
		else
		{
			System.out.println("It is not Multi Select Drop Down.....");
		}
	}
}