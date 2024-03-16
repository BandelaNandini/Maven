package dataDrivenTesting;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class RetrieveDataFromExcel2 {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		
		FileInputStream fis = new FileInputStream("./src/test/resources/SeleniumTestData.xlsx");
		Workbook wb=WorkbookFactory.create(fis);
		
		double d=wb.getSheet("Sheet1").getRow(2).getCell(1).getNumericCellValue();
		System.out.println(d);
		
		wb.close();

	}
	

}
