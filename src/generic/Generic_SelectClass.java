package generic;

import java.util.LinkedList;
import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class Generic_SelectClass 
{

	Select sel;
	
	public Generic_SelectClass(WebElement ele)
	{
		sel= new Select(ele);
	}
	
	
	public void deslctAll()
	{
		if(sel.isMultiple())
		{
			System.out.println("is multiple");
			sel.deselectAll();
		}
	}
	
	
	public  void deslctIndx(int i)
	{
		sel.deselectByIndex(i);
	}
	
	
	public  void dslctValue(String i)
	{
		sel.deselectByValue(i);
	}
	
	
	public void dslctVisbleTxt(String i)
	{
		sel.deselectByVisibleText(i);
	}
	
	
	public void slctIndx(int i)
	{
		sel.selectByIndex(i);
	}
	
	
	public void slctValue(String i)
	{
		sel.selectByValue(i);
	}
	
	
	public void slctVsbleTxt(String i)
	{
		sel.selectByVisibleText(i);
	}
	
	
	public void printOptn()
	{
		List<WebElement> el = sel.getOptions();
		for(WebElement d:el)
		{
			String s = d.getText();
			System.out.println(s);
		}	
	}
	
	
	public List<String> GetOptn()
	{
		List<WebElement> el = sel.getOptions();
		List<String> l= new LinkedList<String>();
		for(WebElement d:el)
		{
			String s = d.getText();
			l.add(s);
		}
		return l;
	}
	
	
	public List<String> GetSltdOptn()
	{
		List<WebElement> el = sel.getAllSelectedOptions();
		List<String> l= new LinkedList<String>();
		for(WebElement d:el)
		{
			String s = d.getText();
			l.add(s);
		}
		return l;
	}
	
	
	public String getFrstSlctd()
	{
		WebElement el = sel.getFirstSelectedOption();
		String s = el.getText();
		return s;
	}
	
}
