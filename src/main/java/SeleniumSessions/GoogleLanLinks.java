package SeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;

public class GoogleLanLinks {

	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		BrowserUtility brUtil = new BrowserUtility();
		driver = brUtil.initBrowser("Chrome");
		brUtil.goToWebsite("https://www.google.com/");

		By searchFiled = By.xpath("//textarea[@title ='Search']");
		By searchList = By.xpath("//div/ul//li//div[@class='wM6W7d']/span");
		By signOut = By.xpath("//span[text()='Stay signed out' and @class='YrSbJc']");

		Thread.sleep(4000);
		// WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5000));
		// wait.until(ExpectedConditions.visibilityOfElementLocated(signOut)).click();

		//System.out.println("Signed in-->"+ driver.findElement(signOut).getText());
		//Thread.sleep(4000);
		
		driver.findElement(searchFiled).sendKeys("air filter");
		Thread.sleep(3000);
		List<WebElement> elementsList = driver.findElements(searchList);
		System.out.println("Size--> " + elementsList.size());
		for (WebElement each : elementsList) {
			//System.out.println(each.getText());
			if(each.getText().equals("air filter for bike")) {
				each.click();
				break;
			}
		}
	}

//        ElementUtil eUtil = new ElementUtil(driver);
//
//        try {
//            Thread.sleep(2000);
//        } catch (InterruptedException e) {
//            throw new RuntimeException(e);
//        }
//        By lanElement = By.id("//div[@id= 'SIvCob']/a");
//
//      List<WebElement> eList = driver.findElements(lanElement);
//      if (eList.size() ==0){
//          System.out.println("List is empty");
//      }else   System.out.println("List is NOT empty");
//
//      for (WebElement each : eList){
//          System.out.println(each.getText());
//        }
//
//    }

}