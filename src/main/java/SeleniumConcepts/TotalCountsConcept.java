package SeleniumConcepts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class TotalCountsConcept {

	public static void main(String args[]) throws InterruptedException{
		
		//By locators
		By totalCountlink = By.tagName("a");
		
		BrowserActions br = new BrowserActions();
		WebDriver driver = br.launchBrowser("chrome");
		br.launchUrl("https://www.amazon.in");
		
		Thread.sleep(1000);
		
		ElementUtil elem = new ElementUtil(driver);
		int totalLinksCount = elem.getElements(totalCountlink);
		System.out.println("Total links on this page is : " + totalLinksCount);
		
	
		
				
	}
}
