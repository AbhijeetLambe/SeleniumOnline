package pkg09_TestNG;

import org.testng.*;
import org.testng.annotations.*;

public class P01_PrintingStatement
{
	@Test
	public void printingStatement()
	{
		Reporter.log("Abhijeet.....", true);	// print in console + report
		
		Reporter.log("Abhijeet.....", false);	// print in report only
	}
}