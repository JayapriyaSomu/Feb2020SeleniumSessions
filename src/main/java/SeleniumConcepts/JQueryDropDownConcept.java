package SeleniumConcepts;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class JQueryDropDownConcept {

	public static void main(String[] args) throws InterruptedException {
	
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.jqueryscript.net/demo/Drop-Down-Combo-Tree/");
		Thread.sleep(3000);
		
		driver.findElement(By.id("justAnInputBox")).click();
		List<WebElement> list = driver.findElements(By.cssSelector("span.comboTreeItemTitle input"));
		
		for(int i = 0; i < list.size();i++){
			list.get(i).getText();
		}
		
		
		
	}

}
