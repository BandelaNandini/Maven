
package dataDrivenTesting;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FacebookloginUsingPropertiesFile {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./src/main/resources/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(fbdata("url"));
		long time=Long.parseLong(fbdata("timeouts"));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(time));
		
		driver.findElement(By.id("email")).sendKeys(fbdata("username"));
		driver.findElement(By.id("pass")).sendKeys(fbdata("password"));
		driver.findElement(By.name("login")).click();

		Thread.sleep(6000);
		driver.close();
	}

		public static String fbdata (String Value)
		{
			FileInputStream fis=null;
			try {
				fis = new FileInputStream("./src/test/resources/Facebook.properties");
			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			Properties property=new Properties();
			try {
				property.load(fis);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			return property.getProperty(Value);
			
		}
	}


