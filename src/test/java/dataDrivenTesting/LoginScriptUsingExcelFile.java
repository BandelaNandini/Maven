package dataDrivenTesting;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;
import java.util.HashMap;
import java.util.Map;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginScriptUsingExcelFile {

	public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "./src/main/resources/chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	Map<String, String> map=readData();
	WebDriverManager.chromedriver().setup();
	driver.manage().window().maximize();
	driver.get(map.get("url"));
	long time=Long.parseLong(map.get("timeouts"));
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(time));
	
	driver.findElement(By.id("email")).sendKeys(map.get("username"));
	driver.findElement(By.id("password")).sendKeys(map.get("password"));
	driver.findElement(By.name("login")).click();
	
	if(driver.getCurrentUrl().contains("home"))
	System.out.println("login success");
	else
		System.out.println("login failed");
	
	driver.quit();
	}
	public static Map<String, String> readData()
	{
	FileInputStream fis=null;
	try{
		fis=new FileInputStream("./src/test/resources/SeleniumTestData.xlsx");
	}
	catch (FileNotFoundException e)
	{
		e.printStackTrace();
	}
	Workbook wb=null;
	try {
		 wb=WorkbookFactory.create(fis);
	} catch (EncryptedDocumentException | IOException e) {

		e.printStackTrace();
	}
	Sheet sh=wb.getSheet("Sheet1");
	DataFormatter df = new DataFormatter();
	Map<String,String> map=new HashMap<String,String>();
	for(int i=0;i<=sh.getLastRowNum();i++)
	{
		String key=df.formatCellValue(sh.getRow(i).getCell(0));
		String value=df.formatCellValue(sh.getRow(i).getCell(1));
		map.put(key, value);
	}
		
		System.out.println(map);
		try {
			wb.close();
		} catch (IOException e) {

			e.printStackTrace();
		}
		
		return map;
	}
}
	
	