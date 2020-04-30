package SeleniumConcepts;
import java.util.Iterator;
import java.util.Set;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class BrowserWindowPopUp {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		driver.get("http://popuptest.com/goodpopups.html");
		
		driver.findElement(By.linkText("Good PopUp #1")).click();
		driver.findElement(By.linkText("Good PopUp #2")).click();
		driver.findElement(By.linkText("Good PopUp #3")).click();
		driver.findElement(By.linkText("Good PopUp #4")).click();

		Set<String> handles = driver.getWindowHandles();
		Iterator<String> it = handles.iterator();
		
		String parentWindowID = it.next();
		String childWindowID1 = it.next();
		String childWindowID2 = it.next();
		String childWindowID3 = it.next();
		String childWindowID4 = it.next();
		
		driver.switchTo().window(childWindowID1);
		System.out.println("child window 1 title : " + 	driver.getTitle());
		driver.close();
		
		driver.switchTo().window(childWindowID2);
		System.out.println("child window 2  title : " + driver.getTitle());
		driver.close();
		
		driver.switchTo().window(childWindowID3);
		System.out.println("child window 3 title : " + 	driver.getTitle());
		driver.close();
		
		driver.switchTo().window(childWindowID4);
		System.out.println("child window 4 title : " + 	driver.getTitle());
		driver.close();
		
		driver.switchTo().window(parentWindowID);
		System.out.println("parent window title : " + 	driver.getTitle());
		driver.close();
		
	}

}
