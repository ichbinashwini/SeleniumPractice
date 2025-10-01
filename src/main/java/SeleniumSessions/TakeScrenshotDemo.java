package SeleniumSessions;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class TakeScrenshotDemo {

	public static void main(String[] args) throws IOException {
		
	 ChromeOptions ch = new ChromeOptions();
	 ch.addArguments("--disable-popup-blocking");

	 
	WebDriver driver = new ChromeDriver(ch);
	
	File ss = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	
	FileUtils.copyFile(ss,new File("./Storage"));
	
	
	
	}

}
