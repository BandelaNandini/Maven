package dataDrivenTesting;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class RetrieveDataFromExcel {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
	     //Step 1 : Convert physical file into java readable object
		FileInputStream fis = new FileInputStream("./src/test/resources/SeleniumTestData.xlsx");
		
		//Step 2 : Open Workbook
            Workbook wb=WorkbookFactory.create(fis);
            
          //Step 3 : Get control over sheet
            Sheet s=wb.getSheet("Sheet1");
            
          //Step 4 : Get control over Row
            Row r=s.getRow(0);
            
          //Step 5 : Get control over cell
            Cell c= r.getCell(1);
            
          //Step 6 : Retrieve data from cell
            System.out.println(c.getStringCellValue());
            
          //Step 7 : close workbook
            wb.close();          

	}

}
