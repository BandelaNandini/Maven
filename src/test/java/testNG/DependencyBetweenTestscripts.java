package testNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class DependencyBetweenTestscripts {
	
	@Test // (enabled=false)
	public  void navigateToUrl()
	{
		System.setProperty("webdriver.chrome.driver", "./src/main/resources/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.close();
	}
	@Test (dependsOnMethods="navigateToUrl")
	public void login()
	{
		
		Reporter.log("Login");
		
	}
	

}
