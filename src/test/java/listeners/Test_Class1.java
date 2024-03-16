package listeners;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Test_Class1 {
	@Test
	public void demo1() {
		System.out.println("Test_Class1-demo1");
	}
	@Test
	public void demo2() {
		System.out.println("Test_Class1-demo2");
	}
	@Test
	public void demo3() {
		System.out.println("Test_Class1-demo3");
		Assert.fail();
	}
}

