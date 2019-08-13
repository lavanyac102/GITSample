package pom;

import generic.Generic_BasePage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends Generic_BasePage
{
	@FindBy(id="email")
	private WebElement usrname;
	
	@FindBy(xpath="//input[@type='password']")
	private WebElement pwd;
	
	@FindBy(xpath="//input[@value='Log In']")
	private WebElement login;
	
	@FindBy(xpath="/html/body/div[1]/div[3]/div[3]/div")
	private WebElement errorMsg;
	
	
	public LoginPage(WebDriver driver)
	{
		super(driver);
	}
	
	
	public void loginmthd(String u, String p)
	{
		usrname.sendKeys(u);
		pwd.sendKeys(p);
		login.click();
	}
	
	public void verifyLoginPg()
	{
		Generic_BasePage gp= new Generic_BasePage(driver);
		gp.verifyTitle("Facebook – log in or sign up");
	}

	public void verifyErrMsg()
	{
		Generic_BasePage gp= new Generic_BasePage(driver);
		gp.verifyElement(errorMsg);
	}
	
	
}
