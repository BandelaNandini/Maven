package pom_Class;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Google_TestScript{
	
	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.edgedriver().setup();
		WebDriver driver=new EdgeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		Google_Repository google=new Google_Repository(driver);
		if(google.getPageHeader().isDisplayed())
		    System.out.println("Login success");
		else
			System.out.println("Login failed");
		
		google.setSearchTF("Mahesh Babu");
		google.ClickGooglesearch();
		
		Thread.sleep(3000);
		driver.quit();
	}
	

	}


