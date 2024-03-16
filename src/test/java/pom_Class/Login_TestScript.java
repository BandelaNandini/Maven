package pom_Class;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Login_TestScript {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.edgedriver().setup();
		WebDriver driver=new EdgeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoapp.skillrary.com/login.php?type=login");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		LoginPage_Repository login=new LoginPage_Repository(driver);
		
		if(login.getpageheader().equals("login"))
			System.out.println("successfully logged in");
		else
			System.out.println("loggin failed");
		
		login.setusername("Nandini");
		login.setpassword("Nandini@7");
		login.clickkeepmeloggedin();
		login.clickloginbtn();
		
		Thread.sleep(3000);
		driver.quit();
	}
		

	}

