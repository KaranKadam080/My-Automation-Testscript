package Datadriventesting;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.testng.annotations.Test;

public class ReadDataExcel3 {
	@Test]

	
	public void readData() throws EncryptedDocumentException, IOException {
		// TODO Auto-generated method stub
		File path=new File("\"C:\\Users\\Lenovo\\Downloads\\loginfile.xlsx");
		FileInputStream fis = new FileInputStream(path);
		Workbook wb = WorkbookFactory.create(fis);
		Sheet sheet = wb.getSheet("Sheet1");
		int row=3,colum=3;
		for(int i=0;i<row;i++) {
			for(int j=0;j<colum;j++){
				String s=sheet.getRow(i).getCell(j).toString();
				System.out.println(s);
			}
			}
	}

}
