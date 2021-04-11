package readingExcel;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadExcel {

	public static void main(String[] args) throws IOException {
File src = new File("C:\\Users\\RAIANI\\eclipse-workspace\\ApachePoiExample\\Excel\\TestData.xlsx");
		
		FileInputStream ip = new FileInputStream(src);
		
		XSSFWorkbook wb = new XSSFWorkbook(ip);
		XSSFSheet sheet = wb.getSheetAt(0);

		int rowcount  = sheet.getLastRowNum();
		System.out.println("Number of Rows : "+rowcount);
		
		for(int r=0;r<=rowcount;r++)
		{
			//String data = sheet.getRow(r).getCell(0).getStringCellValue();
			//System.out.println(data);
			for(int c=0;c<sheet.getRow(r).getLastCellNum();c++)
			{
				System.out.print(sheet.getRow(r).getCell(c).getStringCellValue()+"||");	
			}
			System.out.println();
		}
		wb.close();
	}
}
