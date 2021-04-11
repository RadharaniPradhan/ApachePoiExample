package readingExcel;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadExcel1 {

	public static void main(String[] args) throws IOException {
File src = new File("C:\\Users\\RAIANI\\eclipse-workspace\\ApachePoiExample\\Excel\\TestData.xlsx");
		
		FileInputStream ip = new FileInputStream(src);
		
		XSSFWorkbook wb = new XSSFWorkbook(ip);
		XSSFSheet sheet = wb.getSheetAt(0);
		
		String data0 = sheet.getRow(0).getCell(0).getStringCellValue();
		System.out.print(data0);
		
		String data1 = sheet.getRow(0).getCell(1).getStringCellValue();
		System.out.print("||"+data1);
		

		wb.close();

	}

}
