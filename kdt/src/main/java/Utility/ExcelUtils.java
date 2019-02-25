package Utility;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
//import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelUtils {
	
	private static XSSFWorkbook wb;
	private static XSSFSheet sh;
	private static XSSFCell Cell;
	
	public static void setExcelPath(String excelPath, String Sheetname) throws IOException {
		System.out.println("Excel setup method");		
		FileInputStream fis = new FileInputStream(excelPath);
		wb = new XSSFWorkbook(fis);
		sh = wb.getSheet("TestSteps");
	}
	
	public static String cellData(int rownum, int cellnum) {
		
		System.out.println("Cell data method");
		
		System.out.println("Row Num:"+ rownum);
		System.out.println("Cell Num:"+ cellnum);
		
		System.out.println(sh);
		String data = sh.getRow(rownum).getCell(cellnum).getStringCellValue();
		System.out.println(data);
		return data;
	}

}
