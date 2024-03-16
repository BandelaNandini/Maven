package testNG;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class SampleTest {

	@Test
	public void demotest() {
		
		Reporter.log("Hello TestNG",true);
	}

}
