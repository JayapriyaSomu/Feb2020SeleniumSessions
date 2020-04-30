package SeleniumConcepts;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class RightClickConcept {

	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();

		driver.get("https://swisnl.github.io/jQuery-contextMenu/demo.html");
		Thread.sleep(3000);
		
		By rightClickElement = By.xpath("//span[text()='right click me']");
		By rightClickOptionslocator = By.xpath("//ul/li[contains(@class,'context-menu-icon')]/span");
		
	//	WebElement rightClickElement = driver.findElement(By.xpath("//span[text()='right click me']"));
		List<WebElement> rightClickOptions = driver.findElements(By.xpath("//ul/li[contains(@class,'context-menu-icon')]/span"));
		
		//doRightClick(driver,rightClickElement,rightClickOptions,"Copy");
		
	/*	List<String> rightClickOptionsList = getRightClickList(driver,rightClickElement,rightClickOptions);
		System.out.println("Total right click options :" + rightClickOptionsList);*/
		
		ElementUtil element1 = new ElementUtil(driver);
		
		List<String> rightClickOptionsList = element1.getRightClickList(rightClickElement,rightClickOptions);
		System.out.println("Total right click options :" + rightClickOptionsList);
		
		element1.doRightClick(rightClickElement,rightClickOptions, "Copy");

		
	}

	/*public static void doRightClick(WebDriver driver, WebElement rightClickElement,List<WebElement> rightClickOptions, String value) {

		Actions action = new Actions(driver);
		action.contextClick(rightClickElement).build().perform();

		for (int i = 0; i < rightClickOptions.size(); i++) {
			String text = rightClickOptions.get(i).getText();
			System.out.println(text);

			if (text.equals(value)) {
				rightClickOptions.get(i).click();
				break;
			}
		}
	}
	
	public static List<String>  getRightClickList(WebDriver driver, WebElement rightClickElement,List<WebElement> rightClickOptions) {

		List<String> rightClickOptionsList = new ArrayList<String>();
		
		Actions action = new Actions(driver);
		action.contextClick(rightClickElement).build().perform();

		for (int i = 0; i < rightClickOptions.size(); i++) {
			String text = rightClickOptions.get(i).getText();
			System.out.println(text);
			rightClickOptionsList.add(text);
		}
		return rightClickOptionsList;

	}
*/
}
