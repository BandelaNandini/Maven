package groupExecution;

import org.testng.annotations.Test;

public class TestClass3 {
	
	@Test(groups="sanity")
	public void demo1()
	{
		System.out.println("TC3-D1-Sanity");
	}
	@Test(groups="regression")
	public void demo2()
	{
		System.out.println("TC3-D2-regression");
	}
	@Test(groups={"regression","sanity"})
	public void demo3()
	{
		System.out.println("TC3-D3-regression & sanity");
	}

}
