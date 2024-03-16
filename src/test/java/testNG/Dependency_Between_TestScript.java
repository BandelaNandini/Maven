package testNG;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Dependency_Between_TestScript {
	
	
	@Test(dependsOnMethods="demo2")
	public void demo1()
	{
		Reporter.log("demo1",true);
	}
	@Test (dependsOnMethods="demo3")
	public void demo2()
	{
		Reporter.log("demo2",true);
	}
	@Test
	public void demo3()
	{
		Reporter.log("demo3",true);
	}
	

}
