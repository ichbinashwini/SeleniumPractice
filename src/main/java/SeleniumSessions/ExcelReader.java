package SeleniumSessions;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelReader {

	public static void main(String[] args) {

		// meth1();

		int[] si = { 0, 3, 5, 7, 11, 1 };
		int diff = Integer.MAX_VALUE;

		List<Integer> al = new ArrayList<>();

		for (int i = 0; i < si.length; i++) {
			for (int j = i+1; j < si.length; j++) {

				int temp = Math.abs(si[i] - si[j]);

				if (temp < diff) {
					al.clear();
					diff = temp;
					al.add(si[i]);
					al.add(si[j]);
				}

			}

		}
		System.out.println(al);
		
		
		
		
		
		

	}

	/*
	 * for (int i = 1; i <= 5; i++) { // For each row, print numbers from 1 to i for
	 * (int j = 1; j <= i; j++) { // Print 'j' exactly j times for (int k = 1; k <=
	 * j; k++) { System.out.print(j); } } System.out.println(); // Move to next line
	 * } }
	 */

	public static void meth1() {

		try {
			FileInputStream fis = new FileInputStream("./src/main/java/resource/Country.xlsx");
			Workbook book = WorkbookFactory.create(fis);
			Sheet sheet = book.getSheet("Sheet1");
			for (int i = 1; i <= sheet.getLastRowNum(); i++) {
				Row row = sheet.getRow(i);
				for (Cell c : row) {

					if (c.getCellType() == CellType.STRING) {
						System.out.print(c.getStringCellValue() + "\t");
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
