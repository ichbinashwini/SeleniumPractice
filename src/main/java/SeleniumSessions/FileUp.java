package SeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FileUp {

	public static void main(String[] args) throws InterruptedException {

		
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.file.io/");
		
	By uploadFile = By.xpath("//label[@for='upload-folder']/following-sibling::input[@type='file']");
	Thread.sleep(3000);
	driver.findElement(uploadFile).sendKeys("C:/Users/Aniket Sawant/Desktop/Dummy");
	System.out.println("file is uploaded successfully");
	
	driver.close();
	
	}

}
