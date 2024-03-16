package testNG;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Data_Providers2 {

	@Test(dataProvider="credentials")
	public void loginTest(String username,String password) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "./src/main/resources/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoapp.skillrary.com/login.php?type=login");
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.id("email")).sendKeys(username);
		driver.findElement(By.id("password")).sendKeys(password);
		driver.findElement(By.name("login")).click();
		Thread.sleep(3000);
		driver.close();
	}
		@DataProvider
		public Object[][] credentials()
		{
			Object[][] obj=new Object[2][2];
			obj[0][0]="admin";
			obj[0][1]="admin";
			obj[1][0]="user";
			obj[1][1]="user";
			return obj;
		}
	}

