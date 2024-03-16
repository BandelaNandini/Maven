package dataDrivenTesting;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class RetrieveMultipleDataFromExcel {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		
		FileInputStream fis = new FileInputStream("./src/test/resources/SeleniumTestData.xlsx");
		Workbook wb=WorkbookFactory.create(fis);
		
		Sheet sh=wb.getSheet("Sheet1");
		DataFormatter df = new DataFormatter();
		
		for(int i=0;i<=sh.getLastRowNum();i++)
		{
			String Key=df.formatCellValue(sh.getRow(i).getCell(0));
			String Value=df.formatCellValue(sh.getRow(i).getCell(1));
		System.out.println(Key+"\t"+Value);
		}
		wb.close();
	}

}
