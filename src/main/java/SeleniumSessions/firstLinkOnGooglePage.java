package SeleniumSessions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class firstLinkOnGooglePage {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.google.com");
		Thread.sleep(3000);
		By searchArea = By.xpath("//textarea[@role='combobox']");
		
//		WebElement area = driver.findElement(searchArea);
//		area.sendKeys("java");
//		area.submit();
//		
		List<WebElement> links = driver.findElements(By.tagName("a"));
		System.out.println(links.size());
		
		String ss = "asdf";
		ss.contains("s");
	}

}
