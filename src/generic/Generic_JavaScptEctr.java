package generic;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

public class Generic_JavaScptEctr 
{
	
		JavascriptExecutor js;
		
		Generic_JavaScptEctr(WebDriver driver)
		{
			js=(JavascriptExecutor)driver;
		}
		
		
		public void dsbldElmt(JavascriptExecutor js, String id, String val)
		{
			js.executeScript("document.getElementByTd("+id+").value="+val);
		}
		
		
		public void clrData(JavascriptExecutor js, String id)
		{
			js.executeScript("document.getElementByTd("+id+").value=' '");
		}
		
		
		public void scrollTo(JavascriptExecutor js, int x, int y)
		{
			js.executeScript("window.scrollBy("+x+","+y+")");
		}
		
}
