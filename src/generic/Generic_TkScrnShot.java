package generic;

import java.io.*;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;


public class Generic_TkScrnShot 
{

	public static void getPhto(WebDriver dr, String tcname) throws IOException
	{
		String photos="./photos/";
		Date d=new Date();
		String d1=d.toString();
		String date=d1.replaceAll(":", "-");
		TakesScreenshot ts=(TakesScreenshot) dr;
		File src= ts.getScreenshotAs(OutputType.FILE);
		File dst= new File(photos+date+tcname+".jpeg");
		FileUtils.copyFile(src, dst);
	}
	
	
	public void readFrmXl(String path, String sht) throws EncryptedDocumentException, InvalidFormatException, IOException
	{
		FileInputStream f= new FileInputStream(path);
		Workbook w=WorkbookFactory.create(f);
		Sheet sh=w.getSheet(sht);
		int row=sh.getLastRowNum();
		for(int i=0; i<row; i++)
		{
			Row r=sh.getRow(i);
			short cell = r.getLastCellNum();
			for(int j=0; j<cell; j++)
			{
				Cell c=r.getCell(j);
				String s=c.toString();
				System.out.println(s);
			}
			System.out.println();
		}
		
	}
	
	
	public void writeToSht(String path, String sht, int i, int j,String str) throws EncryptedDocumentException, InvalidFormatException, IOException
	{
		FileInputStream f= new FileInputStream(path);
		Workbook w=WorkbookFactory.create(f);
		Sheet sh=w.getSheet(sht);
		Row r=sh.createRow(i);
		Cell c=r.createCell(j);
		c.setCellValue(str);
		FileOutputStream fos= new FileOutputStream(path);
		w.write(fos);
		
	}
	
}
