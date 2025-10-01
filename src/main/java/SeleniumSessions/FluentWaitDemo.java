package SeleniumSessions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;

public class FluentWaitDemo {

	public static void main(String[] args) throws InterruptedException {

		
		
		WebDriver driver =  new ChromeDriver();
		 driver.get("https://classic.crmpro.com/index.html?e=1");
		 
		 By username = By.xpath("//input[@name='username']");
		Wait<WebDriver> fluentWait = new FluentWait<WebDriver>(driver)
				.withTimeout(Duration.ofSeconds(10))
				.pollingEvery(Duration.ofSeconds(5))
				.withMessage("==not found==");
		 fluentWait.until(ExpectedConditions.visibilityOfElementLocated(username)).sendKeys("ashwini");
		 Thread.sleep(5000);
		// driver.close();
		 
	}

}
