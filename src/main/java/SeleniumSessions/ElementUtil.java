package SeleniumSessions;

import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;

public class ElementUtil {

    private WebDriver driver;
    private Actions actions;

    public ElementUtil(WebDriver driver) {

        this.driver = driver;
        actions = new Actions(driver);
    }

    public WebElement getWebElement(By elementLocator) {
        return driver.findElement(elementLocator);
    }


    public void doSendKeys(By elementLocator, String value) {
        getWebElement(elementLocator).sendKeys(value);
    }


    public void doClick(By locator) {
        getWebElement(locator).click();

    }

    public String getElementText(By locator) {
        return getWebElement(locator).getText();
    }

    public boolean isElementDisplayed(By locator) {


        try {
            getWebElement(locator).isDisplayed();
            return true;
        } catch (NoSuchElementException e) {
            System.out.println("Element is not displayed");
            return false;
        }

    }

    public void clickElement(By locator, String eleText) {

        List<WebElement> eleLinks = driver.findElements(locator);
        System.out.println("Total number of links = " + eleLinks.size());

        for (WebElement each : eleLinks) {
            String text = each.getText();
            System.out.println(text);
            if (text.contains(eleText)) {
                each.click();
                System.out.println("Clicked on " + eleText);
                break;
            }
        }


    }

    public void doSearch(By searchTextArea, By predictoinList, String searchKey, String clickSearch)
            throws InterruptedException {

        doSendKeys(searchTextArea, searchKey);

        Thread.sleep(4000);

        List<WebElement> eleLinks = driver.findElements(predictoinList);
        System.out.println("Total number of links = " + eleLinks.size());

        for (WebElement each : eleLinks) {
            String text = each.getText();
            System.out.println(text);
            if (text.equals(clickSearch)) {
                each.click();
                System.out.println("Clicked on " + clickSearch);
                break;
            }
        }

    }
//********************** DropDown methods **************************************

    public void selectDropDownByIndex(By dropDownLocator, int optionIndex) throws InterruptedException {
        Select dropDownWebEle = new Select(getWebElement(dropDownLocator));
        dropDownWebEle.selectByIndex(optionIndex);
        Thread.sleep(2000);
    }

    public void selectDropDownByValue(By dropDownLocator, String value) throws InterruptedException {
        Select dropDownWebEle = new Select(getWebElement(dropDownLocator));
        dropDownWebEle.selectByValue(value);
        System.out.println("Selected "+ value);
        Thread.sleep(2000);
    }

    public void selectDropDownByVisibilty(By dropDownLocator, String visibleString) throws InterruptedException {
        Select dropDownWebEle = new Select(getWebElement(dropDownLocator));
        dropDownWebEle.selectByVisibleText(visibleString);
        Thread.sleep(2000);
    }

    public void getDropDownOptionAndClick(By locator, String clickOn) throws InterruptedException {

        Select selectCountry = new Select(getWebElement(locator));

       
        List<WebElement> optionsList = selectCountry.getOptions();

        
        for (WebElement e : optionsList) {
            System.out.println(e.getText());
            if (e.getText().equals(clickOn)) {
                e.click();
                Thread.sleep(2000);
                System.out.println("Clicked on = "+clickOn);
                break;
            }
        }

    }

    public void getDropDownOptionsWithoutSelectClass (String dropDown ,By dropDownLocator){
        List<WebElement> countryWebElements = driver.findElements(dropDownLocator);

        System.out.println(" ");
        System.out.println("This is the list of " +dropDown);

        for (WebElement e : countryWebElements) {
            System.out.println(e.getText());
        }
    }

    //*********************** Scrolling methods *********************************

    public void partialScrollDown() throws InterruptedException {
        actions.sendKeys(Keys.PAGE_DOWN).perform();
        Thread.sleep(2000);
    }

    public void partialScrollUp() throws InterruptedException {
        actions.sendKeys(Keys.PAGE_UP).perform();
        Thread.sleep(2000);
    }
    
    //*********************** WebDriver Wait methods *********************************
    
    
    public WebElement waitForElementPresent(By lctr, int sec) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(sec));
		return wait.until(ExpectedConditions.presenceOfElementLocated(lctr));
		 
	}

	public WebElement WaitForElementVisibility(By locator, int sec) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(sec));
		return wait.until(ExpectedConditions.visibilityOfElementLocated(locator));

	}

	public String waitforTitleContains(String title, int sec) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(sec));
		try {
	 		
			wait.until(ExpectedConditions.titleContains(title)); 	
			return driver.getTitle();
		}
		catch( TimeoutException e ) {
			return "title does not contains expected";
			
		}
	}
		
		
		public String waitforTitleIs(String title, int sec) {
			WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(sec));
			try {
		 		
				wait.until(ExpectedConditions.titleIs(title)); 	
				return driver.getTitle();
			}
			catch( TimeoutException e ) {
				return "Exact title does not match";
				
			}
    
	}
}
