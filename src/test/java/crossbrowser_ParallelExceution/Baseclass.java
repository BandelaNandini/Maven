package crossbrowser_ParallelExceution;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;

import io.github.bonigarcia.wdm.WebDriverManager;


public class Baseclass {
	
	WebDriver driver;
	@Parameters("Browser")
	@BeforeClass
	public void browserSetup(String browser)
	{
		switch(browser) 
		{
		case "chrome":
			System.setProperty("webdriver.chrome.driver", "./src/main/resources/chromedriver.exe");
			driver=new ChromeDriver();
			break;
		case "edge":
			WebDriverManager.edgedriver().setup();
			driver=new EdgeDriver();
			break;
			default:
				System.out.println("Invalid Browser");
				
		}
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}
	
		
		@AfterClass
		public void browserTeardown()
		{
			driver.quit();
		}
		
	}
	
	


