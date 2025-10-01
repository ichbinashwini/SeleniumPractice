package SeleniumSessions;

import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandlePrac {
	
	public static void scrollToBottom(WebDriver driver) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollTo(0, document.body.scrollHeight);");
	}


	
	
	public static void main(String[] args) throws InterruptedException {

		 WebDriver driver = new ChromeDriver();
		driver.get("https://orangehrm.com/en/contact-sales");
//		
		scrollToBottom(driver);
		
		
		Thread.sleep(5000);
		
		By coloumEle = By.xpath("(//div[@class='footer-main'])[1]//li");
		String mainWin = driver.getWindowHandle();
		
		List<WebElement> listEle = driver.findElements(coloumEle);
		
		for(WebElement each : listEle) {
			each.click();
			driver.switchTo().window(mainWin);
			
		}
		
		Set <String> allWin = driver.getWindowHandles();
		
		Iterator<String> it = allWin.iterator();
		String originalWin = it.next();
		String win1 = it.next();
		String win2 = it.next();
		String win3 = it.next();
		String win4 = it.next();
		
		driver.switchTo().window(win4);
		System.out.println("Last window title is (OrangeHRM Careers: Join Our Team | OrangeHRM) "+driver.getTitle());
		
		for(String each :allWin ) {
			driver.switchTo().window(each);
			
			if(!each.equals(originalWin)) {
				driver.switchTo().window(each);
				driver.close();
			}
		}
		
		System.out.println("Closed all windows except main");
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
//		js.executeScript("window.scrollBy(0,500)");
//		
//		String mainWindow = driver.getWindowHandle();
//		
//		List<WebElement> colwebEle = driver.findElements(coloumEle);
//		
//		for(WebElement each : colwebEle) {
//			each.click();
//			driver.switchTo().window(mainWindow);
//			colwebEle = driver.findElements(coloumEle);
//		}
//		
//		Set<String> allWindowHandles = driver.getWindowHandles();
//		System.out.println("Number of window handles"+allWindowHandles.size() );
//	
//		Iterator<String> it= allWindowHandles.iterator();
//		String parentWin = it.next();	
//		String win1 = it.next();	
//		String win2 = it.next();
//		String win3 = it.next();
//		
//		driver.switchTo().window(win3);
//		System.out.println("News artical title (OrangeHRM Newsroom: Latest News | OrangeHRM) ="+driver.getTitle());
//		
//		driver.switchTo().window(parentWin);
//		for(String each : allWindowHandles) {
//			System.out.println("This is window -> "+each);
//			if(!each.equals(parentWin)) {
//				driver.switchTo().window(each);
//				driver.close();
//			}
//		}
		
		
		
		
			}
}
