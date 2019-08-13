package generic;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;
import org.testng.Reporter;

public class Generic_WebElement 
{

	public void clr(WebElement ele)
	{
		ele.clear();
	}
	
	
	public void clck(WebElement ele)
	{
		ele.click();
	}
	
	
	public String getAttr(WebElement ele,String str)
	{
		String atr = ele.getAttribute(str);
		System.out.println(atr);
		return atr;
	}
	
	
	public String getCssVal(WebElement ele,String str)
	{
		String val = ele.getCssValue(str);
		System.out.println(val);
		return val;
	}
	
	
	public int locatnX(WebElement ele)
	{
		int x = ele.getLocation().getX();
		System.out.println(x);
		return x;
	}
	

	public int LoctnY(WebElement ele)
	{
		int y = ele.getLocation().getY();
		System.out.println(y);
		return y;
	}
	
	
	public Dimension getSze(WebElement ele)
	{
		Dimension sz = ele.getSize();
		System.out.println(sz);
		return sz;
	}
	
	
	public String getTag(WebElement ele)
	{
		String tg = ele.getTagName();
		System.out.println(tg);
		return tg;
	}
	
	
	public String getTxt(WebElement ele)
	{
		String tg = ele.getText();
		System.out.println(tg);
		return tg;
	}
	
	
	public void sendKey(WebElement ele, String str)
	{
		ele.sendKeys(str);
	}
	
	
	public void isDsplyd(WebElement ele)
	{
		if(ele.isDisplayed())
		{
			Reporter.log("element is displayed");
		}
		else
		{
			Reporter.log("element is not displayed");
		}
	}
	
	
	public void isEnbld(WebElement ele)
	{
		if(ele.isEnabled())
		{
			Reporter.log("element is enabled");
		}
		else
		{
			Reporter.log("element is not enabled");
		}	
	}
	
	
	public void isSlctd(WebElement ele)
	{
		if(ele.isSelected())
		{
			Reporter.log("element is selected");
		}
		else
		{
			Reporter.log("element is not selected");
		}
	}
	
	
	
}
