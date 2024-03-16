package testNG;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class ReRunningTS_Prioritizing {

	@Test(invocationCount=0,priority=0)
	public void demo1()
	{
		Reporter.log("demo1",true);
	}
	@Test(invocationCount=2,priority=1)
	public void demo2()
	{
		Reporter.log("demo2",true);
	}
	@Test (priority=0)
	public void demo3()
	{
		Reporter.log("demo3",true);
	}
	@Test(invocationCount=3,priority=-2)
	public void demo4()
	{
		Reporter.log("demo4",true);
	}
	//4.3,3,2.2
}
