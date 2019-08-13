package generic;



import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.Reporter;

public class Generic_BasePage 
{

	public WebDriver driver;
	
	public Generic_BasePage(WebDriver driver)
	{
		this.driver= driver;
		PageFactory.initElements(driver, this);
	}
	
	public void verifyElement(WebElement ele)
	{
		
		WebDriverWait wait= new WebDriverWait(driver, 10);
		try{
			wait.until(ExpectedConditions.visibilityOf(ele));
			Reporter.log("element is present",true);
		}
		
		catch(Exception e){
			Reporter.log("element is not present",true);
			Assert.fail();
		}
		
	}
	
	public void verifyTitle(String title)
	{
		
		WebDriverWait wait= new WebDriverWait(driver, 10);
		try{
			wait.until(ExpectedConditions.titleContains(title));
			Reporter.log("title is displayed",true);
		}
		
		catch(Exception e){
			Reporter.log("title is not displayed",true);
			Assert.fail();
		}
		
	}
	
}
