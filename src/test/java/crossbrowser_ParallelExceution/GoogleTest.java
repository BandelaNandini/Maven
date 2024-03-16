package crossbrowser_ParallelExceution;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class GoogleTest extends Baseclass {
	@Test
	public void googleTest() {
    driver.get("https://www.google.com/");
    WebElement GoogleImage=driver.findElement(By.xpath("//img[@alt='Google']"));
    
    if(GoogleImage.isDisplayed())
    	System.out.println("Google Test Pass");
    else
    	System.out.println("Google Test Fail");
    
	}
	
	

}
