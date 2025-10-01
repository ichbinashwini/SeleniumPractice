package SeleniumSessions;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ShadowDOM {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		driver.get("https://selectorshub.com/iframe-in-shadow-dom/");
		JavascriptExecutor js = (JavascriptExecutor) driver;
		
		String HTMLEle = "return document.querySelector(\"#userName\").shadowRoot.querySelector(\"#app2\").shadowRoot.querySelector(\"#pizza\")";
		WebElement pizzaName = (WebElement) js.executeScript(HTMLEle);
		pizzaName.sendKeys("myPizza");
		System.out.println("Entered the pizza name");
		Thread.sleep(3000);
		driver.close();

	}

}
