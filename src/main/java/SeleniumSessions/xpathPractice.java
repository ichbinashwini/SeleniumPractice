package SeleniumSessions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.locators.RelativeLocator;
import org.openqa.selenium.support.ui.Select;

public class xpathPractice {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();

		By day = By.xpath("//input[@id ='sunday']");
		By gender = By.xpath("//label[@for = 'female']");
		By country = By.id("country");
		By colour = By.id("colors");
	
		
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,500)");
		Thread.sleep(3000);
		
		driver.findElement(day).click();
		System.out.println("Selected sunday");

		driver.findElement(gender).click();
		System.out.println("Selected gender- female");
		
		//driver.findElement(country).click();

		Select countryDD = new Select(driver.findElement(country));

		List<WebElement> countryOptions = countryDD.getOptions();

		for (WebElement each : countryOptions) {
			String name = each.getText();
			if (name.equals("China")) {
				each.click();
				System.out.println("Country is selected as China");
			}

		}
		
		driver.findElement(colour).click();
		js.executeScript("window.scrollBy(0,100)");
		
		Select colourDD = new Select(driver.findElement(colour));
		List<WebElement> ColourOptions = colourDD.getOptions();
		
		
		for (WebElement each : ColourOptions) {
			String name = each.getText();
			if (name.equals("White")) {
				each.click();
				System.out.println("Colour is selected as White");
			}

		}
		
		Thread.sleep(3000);
//  	driver.get("https://seleniumpractise.blogspot.com/");
//		By checkBox = By.xpath("//td[contains(text(), 'Selenium')]/preceding-sibling::td");
//		By selenium = By.xpath("//td[contains(text(), 'Selenium')]");
//		js.executeScript("arguments[0].scrollIntoView(true);",driver.findElement(checkBox));
//		Thread.sleep(3000);
//		//WebElement sel = driver.findElement(selenium);
//		driver.findElement(RelativeLocator.with(By.tagName("input")).toLeftOf(selenium)).click();
//		System.out.println("Clicked checkbox");

		driver.close();

	}

}
