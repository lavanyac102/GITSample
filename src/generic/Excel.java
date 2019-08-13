package generic;

import java.io.FileInputStream;
import java.io.FileOutputStream;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.testng.Reporter;

public class Excel implements Automation_Constants
{
	
	public static String readFrmExcel(String sht, int r, int c)
	{
		String v="";
		try{
			
			FileInputStream fs= new FileInputStream(EXCEL_PATH);
			Workbook wb = WorkbookFactory.create(fs);
			
			Cell c1 = wb.getSheet(sht).getRow(r).getCell(c);
			
			v= c1.toString();
			
			
		}
		
		catch(Exception e){
			
			Reporter.log("path in invalid", true);
			
		}
		
		return v;
		
	}
	
	
	
	public static void writeToExcel(String str, String sht, int r, int c)
	{
		String v="";
		try{
			
			FileInputStream fs= new FileInputStream(EXCEL_PATH);
			Workbook wb = WorkbookFactory.create(fs);
			
			Cell c1 = wb.getSheet(sht).createRow(r).createCell(c);
			
			c1.setCellValue(str);
			
			FileOutputStream fos= new FileOutputStream(EXCEL_PATH);
			
			wb.write(fos);
			
			
		}
		
		catch(Exception e){
			
			Reporter.log("path in invalid", true);
			
		}
		
	}
	
	
	
	
	
	

}
