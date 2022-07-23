package pkg08_POM;

import java.time.*;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.*;

public class P02_FacebookMain
{
	public static void main(String[] args)
	{
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		P02_Facebook fb = new P02_Facebook(driver);
		
		fb.username("abhilambe@gmail.com");
		fb.password("1234567890");
		fb.login();
	}
}