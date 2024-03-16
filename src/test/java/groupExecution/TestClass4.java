package groupExecution;

import org.testng.annotations.Test;

public class TestClass4 {
	
	@Test(groups={"sanity","regression","smoke"})
	public void demo1()
	{
		System.out.println("TC4-D1-Sanity,smoke & regression");
	}
	@Test
	public void demo2()
	{
		System.out.println("TC4-D2-No Group");
	}

}
