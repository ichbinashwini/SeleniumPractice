package SeleniumSessions;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class excelDemo {

	public static void main(String[] args) throws InterruptedException, IOException {

		WebDriver driver = new ChromeDriver();
		driver.get("https://practice.expandtesting.com/upload");
		WebElement inEle =  driver.findElement(By.xpath("//input[@id='fileInput']"));
		
		inEle.sendKeys("C:/Users/Aniket Sawant/Desktop/Dummy");
		System.out.println("Uploaded successfully");
		driver.findElement(By.xpath("//button[@id='fileSubmit']")).click();
		
		
		File ss = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		
		FileUtils.copyFile(ss, new File("./Storage/ss.png"));
		System.out.println("SS captured");
		
		//Thread.sleep(3000);
	//	driver.close();
		
		
		
		
		
		
		
		
		
		

		try {
			FileInputStream fis = new FileInputStream("./src/main/java/resource/Country.xlsx");
			Workbook book = WorkbookFactory.create(fis);
			Sheet sheet = book.getSheetAt(0);

			for (int i = 1; i <= sheet.getLastRowNum(); i++) {
				Row row = sheet.getRow(i);

				for (Cell each : row) {

					if (each.getCellType() == CellType.STRING) {
						System.out.print(each.getStringCellValue() + "\t");
					}

				}
				System.out.println();
			}

		} catch (FileNotFoundException e) {
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
