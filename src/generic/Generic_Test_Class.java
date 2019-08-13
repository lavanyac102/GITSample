package generic;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.ITestResult;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

public class Generic_Test_Class implements Automation_Constants {
	public WebDriver driver;

	static {
		System.setProperty(GECKO_KEY, GECKO_VALUE);
		System.setProperty(CHROME_KEY, CHROME_VALUE);
	}

	// @Parameters({ "browser" })
	@BeforeMethod
	public void launchApp() {
//		if (browser.equals("chrome")) {
//			driver = new ChromeDriver();
//			driver.get("https://www.facebook.com/");
//
//		} else {
			driver = new FirefoxDriver();
			driver.get("https://www.facebook.com/");

//		}
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
	}

	@AfterMethod
	public void closeApp(ITestResult res) throws IOException {
		int status = res.getStatus();
		String tcname = res.getName();

		if (status == 2) {
			Generic_TkScrnShot.getPhto(driver, tcname);
			Reporter.log(tcname, true);
		}

		driver.quit();
	}

}
