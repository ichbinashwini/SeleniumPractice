package SeleniumSessions.Waits;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import SeleniumSessions.ElementUtil;

public class WebDriverWaitsDemo {
	static WebDriver driver;

	public static void main(String[] args) {
		driver = new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");
		ElementUtil eUtil = new ElementUtil(driver);
		

		By email = By.id("input-email");
		By password = By.id("input-password");
		By loginBtn = By.xpath("//input[@type='submit']");

		eUtil.waitForElementPresent(email, 10);
		eUtil.getWebElement(password).sendKeys("12345");
		eUtil.WaitForElementVisibility(loginBtn, 5).click();
		
		
	
		String partialtitle = eUtil.waitforTitleContains("Account", 5);
		System.out.println(partialtitle);
		

		String title = eUtil.waitforTitleIs("Account login", 5);
		System.out.println(title);

	}


	


	public static WebElement getWebElement(By locator) {
		return driver.findElement(locator);

	}

}
