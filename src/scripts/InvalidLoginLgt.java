package scripts;

import generic.Generic_Test_Class;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.testng.annotations.Test;

import pom.FacebookPage;
import pom.LoginPage;

public class InvalidLoginLgt extends Generic_Test_Class{
	@Test
	public void testvalidLoginLogout() throws AWTException
	{
		LoginPage lp= new LoginPage(driver);
		
		lp.loginmthd("jagsrocksgoyal15@gmail.com", "megh");
		
		Robot r= new Robot();
		r.keyPress(KeyEvent.VK_ESCAPE);
		r.keyRelease(KeyEvent.VK_ESCAPE);
		
		
		lp.verifyErrMsg();
	}

}
