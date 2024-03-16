package testNG;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Disabling_TestScripts {
	
	@Test(priority=1,invocationCount=2,enabled=true)
	public void demo1()
	{
		Reporter.log("demo1",true);
	}
	@Test(priority=1,enabled=false)
	public void demo2()
	{
		Reporter.log("demo2",true);
	}

}
