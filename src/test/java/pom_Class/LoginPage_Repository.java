package pom_Class;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage_Repository {
	
	// Declaration
	
	@FindBy(xpath="//h3[text()='Login']")
	private WebElement pageheader;
	
	@FindBy(id="email")
	private WebElement usernameTF;
	
	@FindBy(name="password")
	private WebElement passwordTF;
	
	@FindBy(id="keepLoggedInCheckBox")
	private WebElement KMLcheckbox;
	
	@FindBy(className="Forgot")
	private WebElement forgotpswdlink;
	
	@FindBy(name="login")
	private WebElement loginbtn;
	
	// Initialization 
	public LoginPage_Repository(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	// Utilization
	public String getpageheader()
	{
		return pageheader.getText();
	}
	public void setusername(String username)
	{
		usernameTF.sendKeys(username);
	}
	public void setpassword(String password)
	{
		passwordTF.sendKeys(password);
	}
	public void clickkeepmeloggedin()
	{
		KMLcheckbox.click();
	}
	public void clickforgotpswdlink()
	{
		forgotpswdlink.click();
	}
	public void clickloginbtn()
	{
		loginbtn.click();
	}
}
