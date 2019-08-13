package scripts;

import generic.Generic_BrowserActions;
import generic.Generic_Test_Class;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.Set;

import org.testng.annotations.Test;

import pom.FacebookPage;
import pom.JagruthiPage;
import pom.LoginPage;

public class Script1 extends Generic_Test_Class
{
	@Test
	public void testScript1() throws AWTException, InterruptedException
	{	
		
		LoginPage lp= new LoginPage(driver);
		
		lp.loginmthd("jagsrocksgoyal15@gmail.com", "meghana1992");	//login
		
		Robot r= new Robot();
		r.keyPress(KeyEvent.VK_ESCAPE);								//close pop up
		r.keyRelease(KeyEvent.VK_ESCAPE);
		
		
		FacebookPage fp= new FacebookPage(driver);					//verify home pg
		fp.verifyFBPg();
		
		fp.profile();												//traverse to personal pg
		
		JagruthiPage jp= new JagruthiPage(driver);					//verify prsnl page
		jp.verifyTitle("Jagruthi Goyal");
		
		jp.like1();													//like frst comment on wall
		Thread.sleep(2000);
		
		jp.msges();
		
		jp.chats();
		
		Thread.sleep(2000);
		
//		jp.sendMsg("i am testing so don mind if u get mny msges");
		
		jp.search("meghana singh");
		
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
		
		Thread.sleep(2000);
		
		Generic_BrowserActions g= new Generic_BrowserActions();
		g.back(driver);
		
		Thread.sleep(2000);
		
		jp.notification();
		
		jp.markAllRead();
		
		fp.logoutM();												//logout

		lp.verifyLoginPg();											//verify login pg
		
	}
}
