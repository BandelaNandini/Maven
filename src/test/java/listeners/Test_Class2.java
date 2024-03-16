package listeners;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Test_Class2 {
	@Test
	public void demo1() {
		System.out.println("Test_Class2-demo1");
	}
	@Test
	public void demo2() {
		System.out.println("Test_Class2-demo2");
		Assert.fail();
	}
	@Test
	public void demo3() {
		System.out.println("Test_Class2-demo3");
	}


}

