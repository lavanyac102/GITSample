package generic;


import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.Date;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;

public class Generic_BrowserActions
{

	public void minimz(Robot r)
	{
		r.keyPress(KeyEvent.VK_ALT);
		r.keyPress(KeyEvent.VK_SPACE);
		r.keyPress(KeyEvent.VK_N);
		
		r.keyRelease(KeyEvent.VK_ALT);
		r.keyRelease(KeyEvent.VK_SPACE);
		r.keyRelease(KeyEvent.VK_N);
	}
	
	
	public void cls(Robot r)
	{
		r.keyPress(KeyEvent.VK_ALT);
		r.keyPress(KeyEvent.VK_SPACE);
		r.keyPress(KeyEvent.VK_C);
		
		r.keyRelease(KeyEvent.VK_ALT);
		r.keyRelease(KeyEvent.VK_SPACE);
		r.keyRelease(KeyEvent.VK_C);
	}
	
	
	public void maxmz(WebDriver dr)
	{
		dr.manage().window().maximize();
	}
	
	
	public void reSze(WebDriver dr, int x, int y)
	{
		Dimension d=new Dimension(x,y);
		dr.manage().window().setSize(d);
	}
	
	
	public void Drag(WebDriver dr, int x, int y)
	{
		Point p=new Point(x, y);
		dr.manage().window().setPosition(p);
	}
	
	
	public Date sysDate()
	{
		Date d=new Date();
		System.out.println(d);
		return d;
	}
	
	
	public void back(WebDriver dr)
	{
		dr.navigate().back();
	}
	
	
	public void fwd(WebDriver dr)
	{
		dr.navigate().forward();
	}
	
	
	public void refresh(WebDriver dr)
	{
		dr.navigate().refresh();
	}

	
}
