package SeleniumConcepts;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BrowserWindowPopUpAssignment {
	
	static WebDriver driver;

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();

		driver = new ChromeDriver();
		driver.get("http://popuptest.com/goodpopups.html");
		
		driver.findElement(By.linkText("Good PopUp #1")).click();
		switchWindows();
		
		driver.findElement(By.linkText("Good PopUp #2")).click();
		switchWindows();
		
		driver.findElement(By.linkText("Good PopUp #3")).click();
		switchWindows();
		
		driver.findElement(By.linkText("Good PopUp #4")).click();
		switchWindows();
			
		driver.close();
	}
	
	public static void switchWindows(){
		
		Set<String> handles = driver.getWindowHandles();
		Iterator<String> it = handles.iterator();
		
		String parentWindowID = it.next();
		String childWindowID = it.next();
		driver.switchTo().window(childWindowID);
		System.out.println("child window title : " + driver.getTitle());
		driver.close();
		driver.switchTo().window(parentWindowID);
		System.out.println("parent window title : " + driver.getTitle());
		
	}
	
}
