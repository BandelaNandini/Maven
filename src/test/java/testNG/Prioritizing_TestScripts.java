package testNG;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Prioritizing_TestScripts {
	
	@Test(priority=1)
	public void demo1()
	{
		Reporter.log("demo1",true);
	}
	@Test(priority=1)
	public void demo2()
	{
		Reporter.log("demo2",true);
	}
	@Test
	public void demo3()
	{
		Reporter.log("demo3",true);
	}
	@Test(priority=-2)
	public void demo4()
	{
		Reporter.log("demo4",true);
	}
	@Test(priority=-5)
	public void demo5()
	{
		Reporter.log("demo5",true);
	}
	@Test(priority=5)
	public void demo6()
	{
		Reporter.log("demo6",true);
	}
	@Test(priority=-7)
	public void demo7()
	{
		Reporter.log("demo7",true);
	}
	//7543126
	

}
