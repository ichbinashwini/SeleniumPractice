package SeleniumSessions.Waits;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ImplicitlyWait {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		By email = By.id("input-email");
		By password = By.id("input-password");
		By loginBtn = By.xpath("//input[@type='submit']");
		driver.findElement(email).sendKeys("ashwini.nanware@gmail.com");
		driver.findElement(password).sendKeys("1235467");
		driver.findElement(loginBtn).click();
		
		System.out.println("executed");
		driver.close();

	}

}
