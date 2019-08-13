package scripts;

import generic.Generic_Test_Class;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.testng.Reporter;
import org.testng.annotations.Test;

import pom.FacebookPage;
import pom.JagruthiPage;
import pom.LoginPage;

public class PrsnalPage extends Generic_Test_Class{

	@Test
	public void testvalidLoginLogout() throws AWTException, InterruptedException
	{	
		
		LoginPage lp= new LoginPage(driver);
		
		lp.loginmthd("jagsrocksgoyal15@gmail.com", "meghana1992");
		
		Robot r= new Robot();
		r.keyPress(KeyEvent.VK_ESCAPE);
		r.keyRelease(KeyEvent.VK_ESCAPE);
		
		
		FacebookPage fp= new FacebookPage(driver);
		fp.verifyFBPg();
		
		fp.profile();
		
		JagruthiPage jp= new JagruthiPage(driver);
		jp.verifyTitle("Jagruthi Goyal");
		
		fp.logoutM();
		
		lp.verifyLoginPg();
	}
}
