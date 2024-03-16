package Sample;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchChrome {

	public static void main(String[] args) {
		//WebDriverManager.chromedriver().setup();
		
		System.setProperty("webdriver.chrome.driver", "./src/main/resources/chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.google.com/");
		
	}

}
