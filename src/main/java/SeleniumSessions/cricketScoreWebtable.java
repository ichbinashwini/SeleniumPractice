package SeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class cricketScoreWebtable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.espncricinfo.com/records/series/batting-most-runs-career/anderson-tendulkar-trophy-2025-16595");
		
		String playersName = "KL Rahul (IND)";
		
		String runs = driver.findElement(By.xpath("//span[text() ='"+playersName+"']/ancestor::td/following-sibling::td//strong")).getText();		
		
		System.out.println("Runs of  "+ playersName+ "are " + runs);

	}

}
