package assertions;

import org.testng.Assert;
import org.testng.annotations.Test;

public class HardAssert_Practice {
	@Test
	public void demo() {
		String s1="Hello";
		String s2="hello";
		Assert.assertEquals(s1, s2);
		
		System.out.println(s1);
		System.out.println(s2);
		
		System.out.println("Test Ends Here");

	}

}

