package pom;

import generic.Generic_BasePage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class FacebookPage extends Generic_BasePage
{
	@FindBy(xpath="(//div[.='Account Settings'])[4]")
	private WebElement settings;
	
	@FindBy(xpath="//li[@class='_54ni navSubmenu _6398 _64kz __MenuItem']")
	private WebElement logout;
	
	@FindBy(xpath="//a[@title='Profile']")
	private WebElement profile;
	
	@FindBy(xpath="(//div[@class='uiContextualLayerParent'])[2]/div/div/div[1]/div/a[2]")
	private WebElement kan;
	
	@FindBy(xpath="//a[@class='_42ft _4jy0 layerCancel uiOverlayButton _4jy3 _517h _51sy']")
	private WebElement cancel;
	
	
	public FacebookPage(WebDriver driver)
	{
		super(driver);
	}
	
	public void logoutM()
	{
		settings.click();
		logout.click();
		
	}
	
	public void profile()
	{
		profile.click();
	}
	
	public void lang()
	{
		kan.click();
	}
	
	public void cancel()
	{
		cancel.click();
	}
	

	public void verifyFBPg()
	{
		Generic_BasePage gp= new Generic_BasePage(driver);
		gp.verifyTitle("Facebook");
	}
	
}
