package listeners;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
@Listeners(listeners.Listener_Implementation.class)
public class Test_Class extends Base_class {
	@Test
	public void testMethod() {
		System.out.println("@Test");
	}

}
