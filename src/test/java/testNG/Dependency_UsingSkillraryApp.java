package testNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Dependency_UsingSkillraryApp {
	
	@Test //(dependsOnMethods="login")
	public  void navigateToUrl()
	{
		System.setProperty("webdriver.chrome.driver", "./src/main/resources/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://demoapp.skillrary.com/");
		driver.findElement(By.xpath("//a[text()='LOGIN']")).click();
		WebElement header=driver.findElement(By.xpath("//h3[text()='Login']"));
		if(header.getText().contains("Login"))
		{
			System.out.println("Test pass");
		}
		else
		{
			System.out.println("Test fail");
		}
		driver.quit();
	}
	
	
	@Test (dependsOnMethods="navigateToUrl")
	public void login()
	{
		System.setProperty("webdriver.chrome.driver", "./src/main/resources/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://demoapp.skillrary.com/login.php?type=login");
		driver.findElement(By.id("email")).sendKeys("admin");
		driver.findElement(By.id("password")).sendKeys("admin");
		driver.findElement(By.id("keepLoggedInCheckBox")).click();
		driver.findElement(By.name("login")).click();
		
		WebElement adminicon=driver.findElement(By.xpath("//span[text()='SkillRary Admin']"));
		if(adminicon.isDisplayed())
		{
			System.out.println("Test pass");
		}
		else
		{
			System.out.println("Test fail");
		}
		
		driver.quit();
		
	}

}
