package pom_Class;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Google_Repository {
	
	//Declaration
	@FindBy(xpath="//img[@alt='Google']")
	private WebElement GooglePH;
			
	@FindBy(name="q")
	private WebElement SearchTF;
	
	@FindBy(xpath="//div[@jsname]/descendant::input[@name='btnK']")
	private WebElement GoogleSearch;
	
	//Initialization
	public Google_Repository(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	//Utilization
	public WebElement getPageHeader() 
	{
		return GooglePH;
	}
	
	public void setSearchTF(String search) 
	{
		SearchTF.sendKeys(search);
	}
	
	public void ClickGooglesearch() 
	{
		GoogleSearch.click();
	}
	
	
	
	}

	
	
	

