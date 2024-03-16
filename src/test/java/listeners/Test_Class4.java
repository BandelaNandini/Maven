package listeners;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Test_Class4 {
	@Test(retryAnalyzer=listeners.Retry_Implementation.class)
	public void demo() {
		System.out.println("demo");
		Assert.fail();
	}

}

