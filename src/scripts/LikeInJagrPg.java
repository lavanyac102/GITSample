package scripts;

import generic.Generic_Test_Class;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.testng.annotations.Test;

import pom.FacebookPage;
import pom.JagruthiPage;
import pom.LoginPage;

public class LikeInJagrPg extends Generic_Test_Class {

	@Test
	public void testvalidLoginLogout() throws AWTException, InterruptedException
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
		
		Thread.sleep(2000);
		jp.like1();													//like frst comment on wall
		Thread.sleep(2000);
		
		fp.logoutM();												//logout

		lp.verifyLoginPg();											//verify login pg
		
	}
	
}
