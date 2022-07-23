package pkg09_TestNG;

import org.testng.*;
import org.testng.annotations.*;

public class P02_Priority_InvocationCount_Skip
{
	@Test (priority = 1, invocationCount = 3)
	public void activision()
	{
		Reporter.log("Call Of Duty.....", true);
	}
	
	@Test (priority = -1, invocationCount = 4, enabled = false)
	public void rockstar()
	{
		Reporter.log("Grand Thief Auto.....", true);
	}
	
	@Test (priority = 0, invocationCount = 2)
	public void krafton()
	{
		Reporter.log("Battlegrounds Mobile India.....", true);
	}
}