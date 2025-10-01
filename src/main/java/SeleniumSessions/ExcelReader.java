package SeleniumSessions;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.*;
import org.apache.poi.EncryptedDocumentException;

public class ExcelReader {
	

	public static void main(String[] args) {
		
		
		
		meth1();
		 

//		try {
//			FileInputStream fis = new FileInputStream("./src/main/java/resource/Country.xlsx");
//			Workbook book = WorkbookFactory.create(fis);
//			
//			Sheet sheet = book.getSheet("Sheet1");
//			
//			for(int i=1; i<= sheet.getLastRowNum();i++) {
//				
//				Row row = sheet.getRow(i);
//				for(Cell cell : row) {
//					if(cell.getCellType() == CellType.STRING) {
//						System.out.print(cell.getStringCellValue()+ "\t\t");
//					}else {
//						String intCell = cell.getStringCellValue();
//						System.out.print(Integer.parseInt(intCell)+ "\t\t");
//					}
//				}
//				System.out.println();
//				
//			}
//			
//			
//			
//			
//		} catch (FileNotFoundException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		} catch (EncryptedDocumentException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		} catch (IOException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//		

	}



	public static void meth1() {
		
		
		
			try {
				FileInputStream fis = new FileInputStream("./src/main/java/resource/Country.xlsx");
				Workbook book = WorkbookFactory.create(fis);
				Sheet sheet = book.getSheet("Sheet1");
				for(int i=1; i<=sheet.getLastRowNum();i++) {
					Row row = sheet.getRow(i);
					for(Cell c: row) {
						
						if(c.getCellType() == CellType.STRING) {
							System.out.print(c.getStringCellValue()+"\t");
						}
						
						
						
					}
					System.out.println();
				}
				
				
			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (EncryptedDocumentException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			
			
			
			
			
			
			
			
			
	
		
		
		
		
	}
}
