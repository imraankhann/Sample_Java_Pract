package PracticeSelenium;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadAndWriteExcel 
{
	public void readExcel() throws IOException{
		String filePath="/Users/12045/Desktop/TestData.xlsx";
		FileInputStream fis=new FileInputStream(filePath);
		XSSFWorkbook wb=new XSSFWorkbook(fis);
		XSSFSheet sh=wb.getSheet("Sheet1");
		System.out.println(sh.getRow(0).getCell(0).getStringCellValue());		
	}
	///Users/12045/Desktop
	

}
