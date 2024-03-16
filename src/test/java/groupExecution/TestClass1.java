package groupExecution;

import org.testng.annotations.Test;

public class TestClass1 {
	
	@Test(groups="smoke")
	public void demo1()
	{
		System.out.println("TC1-D1-Smoke");
	}
	@Test(groups="regression")
	public void demo2()
	{
		System.out.println("TC1-D2-regression");
	}
	@Test(groups={"smoke","regression"})
	public void demo3()
	{
		System.out.println("TC1-D3-Smoke & regression");
	}
}
