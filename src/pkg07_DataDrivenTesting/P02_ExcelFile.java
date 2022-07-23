package pkg07_DataDrivenTesting;

import java.io.*;
import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.*;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.*;

public class P02_ExcelFile
{
	public static void main(String[] args) throws EncryptedDocumentException, IOException
	{
		FileInputStream file = new FileInputStream("./ExcelFiles/Facebook.xlsx");
		
		Workbook wb = WorkbookFactory.create(file);
		
		String url = wb.getSheet("Sheet1").getRow(1).getCell(0).getStringCellValue();
		String username = wb.getSheet("Sheet1").getRow(1).getCell(1).getStringCellValue();
		String password = wb.getSheet("Sheet1").getRow(1).getCell(2).getStringCellValue();
		
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
	}
}