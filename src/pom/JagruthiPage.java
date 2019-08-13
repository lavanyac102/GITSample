package pom;

import generic.Generic_BasePage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class JagruthiPage extends Generic_BasePage
{
	@FindBy(xpath="//div[@id='pagelet_main_column_personal']/div[2]/div/div[2]/div/div[3]/div[3]/div/div/div[3]/div[2]/form/div/div[2]//div[@data-testid='UFI2ReactionLink/actionLink']")
	private WebElement like1;
	
	@FindBy(xpath="//a[@data-tooltip-content='Messages']")
	private WebElement msges;
	
	@FindBy(xpath="/html/body/div[1]/div[2]/div/div[1]/div/div/div/div[2]/div[2]/div[2]/div/div/div[3]/div/div[1]/div/div/ul/li[10]/a")
	private WebElement chat;
	
	@FindBy(xpath="/html/body/div[1]/div[6]/div[1]/div/div/div[4]/div/div[1]/div/div/div/div/div/div/div/div[2]/div[4]/div")
	private WebElement msg;
	
	@FindBy(xpath="//div[@class='close']")
	private WebElement cls;
	
	@FindBy(xpath="//a[.='Home']")
	private WebElement home;
	
	@FindBy(xpath="(//input[@placeholder='Search'])[1]")
	private WebElement search;
	
	@FindBy(xpath="/html/body/div[1]/div[2]/div/div[1]/div/div/div/div[2]/div[2]/div[3]")
	private WebElement notification;
	
	@FindBy(xpath="//a[.='Mark all as read']")
	private WebElement markAllRead;
	
	
	public JagruthiPage(WebDriver driver) {
		super(driver);
		
	}
	
	public void like1()
	{
		like1.click();
	}
	
	public void msges()
	{
		msges.click();
	}
	
	public void chats()
	{
		chat.click();
	}
	

	public void sendMsg(String mg)
	{
		msg.sendKeys(mg);
	}
	
	public void close()
	{
		cls.click();
	}
	
	public void home()
	{
		home.click();
	}
	
	public void search(String s)
	{
		search.sendKeys(s);
	}
	
	public void notification()
	{
		notification.click();
	}
	
	public void markAllRead()
	{
		markAllRead.click();
	}
	
}
