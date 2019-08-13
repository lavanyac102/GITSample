package generic;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class Generic_ActionsClass 
{

 Actions act;
	
	Generic_ActionsClass(WebDriver driver)
	{
		act=new Actions(driver); 
	}
	
	public  void mouseHvr(WebElement ele)
	{

		act.moveToElement(ele).perform();
	}
	
	public void DragandDrop(WebElement ele1,WebElement ele2)
	{
		act.dragAndDrop(ele1, ele2).perform();;
	}
	
	public void doubleClc(WebElement ele)
	{
		act.contextClick(ele).perform();
	}
	
	public void rightClk(WebElement ele)
	{
		act.contextClick(ele).perform();
	}
	
}
