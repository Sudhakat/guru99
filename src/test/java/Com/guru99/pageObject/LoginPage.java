package Com.guru99.pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

	WebDriver ldriver;
	
	//create the constructor 
	
	public LoginPage(WebDriver rdriver)
	{
		ldriver=rdriver;
		PageFactory.initElements(rdriver, this);
		}
	
	// write all element which are presents in login page. 
	
	@FindBy(name="uid")
	WebElement txtUserName;
	
	@FindBy(name="password")
	WebElement txtPassword;
	
	@FindBy(name="btnLogin")
	WebElement btnLogin;
	
	
	//write the action method for all 3 WebElements.
	
	public void setUserName(String uname)
	{
		txtUserName.sendKeys(uname);
		
	}
	
	public void setpassword(String password)
	{
		txtPassword.sendKeys(password);
		
	}
	
	public void handleWindows()
	{
		ldriver.switchTo().alert().accept();
		
	}
	public void clickSubmit()
	{
		btnLogin.click();
	}
	
	
}


