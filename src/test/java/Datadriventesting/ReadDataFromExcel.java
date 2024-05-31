package Datadriventesting;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.sl.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.testng.annotations.Test;

public abstract class ReadDataFromExcel {	
@Test
	public abstract void readData() throws EncryptedDocumentException, IOException ;
	{
		File path=new File("C:\\Users\\Lenovo\\Downloads \\test case2");
		FileInputStream fis=new FileInputStream(path);
		 Workbook wb = WorkbookFactory.create(fis);
	    Sheet sheet=wb.getSheet("Sheet1");
		String s1=sheet.getRow(0).getCell(0).toString();
		String s2=sheet.getRow(0).getCell(1).toString();
		String s3=sheet.getRow(1).getCell(0).toString();
		String s4=sheet.getRow(1).getCell(1).toString();
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);
		System.out.println(s4);
		
		
		
		
		
		
		
		
		
	}

}
