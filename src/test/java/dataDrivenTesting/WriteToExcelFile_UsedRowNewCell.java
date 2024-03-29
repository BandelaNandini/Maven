package dataDrivenTesting;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class WriteToExcelFile_UsedRowNewCell {

	public static void main(String[] args) throws IOException {
		FileInputStream fis=new FileInputStream("./src/test/resources/SeleniumTestData.xlsx");
		Workbook wb=WorkbookFactory.create(fis);
		Sheet sh=wb.getSheet("Sheet1");
		Row r=sh.getRow(5); //get row to get new row 
		Cell c1=r.createCell(2);
		c1.setCellValue("JAVA");
	
		FileOutputStream fos=new FileOutputStream("./src/test/resources/SeleniumTestData.xlsx");
		wb.write(fos);
		
		wb.close();

	}

}
