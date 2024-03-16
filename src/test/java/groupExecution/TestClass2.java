package groupExecution;

import org.testng.annotations.Test;

public class TestClass2 {
	
	@Test(groups="sanity")
	public void demo1()
	{
		System.out.println("TC2-D1-Sanity");
	}
	@Test(groups="smoke")
	public void demo2()
	{
		System.out.println("TC2-D2-smoke");
	}
	@Test(groups={"smoke","sanity"})
	public void demo3()
	{
		System.out.println("TC2-D3-Smoke & sanity");
	}

}
