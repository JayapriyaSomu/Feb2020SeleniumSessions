package SeleniumConcepts;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BrowserPopUpWindowCase3 {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();

		WebDriver driver = new ChromeDriver();
		driver.get("http://popuptest.com/goodpopups.html");
		
		driver.findElement(By.linkText("Good PopUp #2")).click();
		
		Set<String> handles = driver.getWindowHandles();
		Iterator<String> it = handles.iterator();
		
		String parentWindowID = it.next();
		String childWindowID1 = it.next();
		
		driver.switchTo().window(childWindowID1);
		System.out.println("Child window title is  : " + driver.getTitle());
		driver.close();
		
		driver.switchTo().window(parentWindowID);
		System.out.println("Parent window title is  : " + driver.getTitle());
		driver.close();
	}

}
