package SeleniumSessions;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetLinks {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();

		driver.get("");

		Set<String> windowHandles = driver.getWindowHandles();
		Iterator <String> it = windowHandles.iterator();
		it.next();
		
		String parentwindor = driver.getTitle();
		
		

	}

}
