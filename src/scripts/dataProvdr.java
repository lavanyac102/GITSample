package scripts;

import generic.Generic_Test_Class;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import pom.FacebookPage;
import pom.LoginPage;

public class dataProvdr extends Generic_Test_Class {
	public WebDriver driver;

	@DataProvider(name = "atc")
	public static Object[][] getData() throws EncryptedDocumentException,
			InvalidFormatException, IOException {
		return dataprovider();

	}

	public static Object[][] dataprovider() throws EncryptedDocumentException,
			InvalidFormatException, IOException {
		FileInputStream fi = new FileInputStream("./excel/j1.xlsx");
		Workbook wb = WorkbookFactory.create(fi);
		Sheet sh = wb.getSheet("Sheet1");
		int rc = sh.getLastRowNum();
		Row r = sh.getRow(0);
		int cc = r.getLastCellNum();
		Object data[][] = new Object[rc + 1][cc];

		for (int i = 0; i < rc; i++) {
			for (int j = 0; j < cc; j++) {
				try {
					Row row = sh.getRow(i);

					Cell cell = row.getCell(j);
					data[i][j] = cell.toString();
				}

				catch (Exception e) {
					data[i][j] = "";
				}
			}
		}
		return data;
	}

	@Test(dataProvider = "atc")
	public void login(String us, String pwd) {
		LoginPage lp = new LoginPage(driver);

		lp.loginmthd(us,pwd);

		FacebookPage fp = new FacebookPage(driver);
		fp.logoutM();

	}
}
