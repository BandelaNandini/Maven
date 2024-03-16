package crossbrowser_ParallelExceution;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class SwiggyTest extends Baseclass{
	@Test
	public void googleTest() {
    driver.get("https://www.swiggy.com/");
    WebElement SwiggyImage=driver.findElement(By.xpath("//*[name()='svg']"));
    
    if(SwiggyImage.isDisplayed())
    	System.out.println("Swiggy Test Pass");
    else
    	System.out.println("Swiggy Test Fail");
}
}
