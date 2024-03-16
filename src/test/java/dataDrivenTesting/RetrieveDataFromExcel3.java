package dataDrivenTesting;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class RetrieveDataFromExcel3 {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		
		FileInputStream fis = new FileInputStream("./src/test/resources/SeleniumTestData.xlsx");
		Workbook wb=WorkbookFactory.create(fis);
		
		Cell c=wb.getSheet("Sheet1").getRow(2).getCell(1);
		
		DataFormatter df =new DataFormatter(); // converts any datatype to string format present in apache poi libraries
		 String Data = df.formatCellValue(c);
		
		System.out.println(Data);
		
		wb.close();
		

	}

}
