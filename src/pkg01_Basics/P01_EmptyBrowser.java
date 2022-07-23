package pkg01_Basics;

import org.openqa.selenium.chrome.ChromeDriver;

public class P01_EmptyBrowser
{
	public static void main(String[] args)
	{	
		ChromeDriver c = new ChromeDriver();
		System.out.println(c);
	}
}