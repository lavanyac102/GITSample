package scripts;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.seleniumhq.jetty9.server.HomeBaseWarning;
import org.testng.Reporter;
import org.testng.annotations.Test;

import pom.FacebookPage;
import pom.LoginPage;
import generic.Excel;
import generic.Generic_Test_Class;

public class validLoginLogout extends Generic_Test_Class
{
	
	@Test
	public void testvalidLoginLogout() throws AWTException
	{	
		
		LoginPage lp= new LoginPage(driver);
		
		lp.loginmthd("lavanya.c102@gmail.com", "Lavin@1028");
		
		Robot r= new Robot();
		r.keyPress(KeyEvent.VK_ESCAPE);
		r.keyRelease(KeyEvent.VK_ESCAPE);
		
		
		FacebookPage fp= new FacebookPage(driver);
		fp.verifyFBPg();
		
		fp.logoutM();
		
		lp.verifyLoginPg();
	}
	
}