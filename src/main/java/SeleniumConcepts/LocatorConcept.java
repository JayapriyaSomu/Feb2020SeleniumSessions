package SeleniumConcepts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LocatorConcept {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://app.hubspot.com/");
		
		Thread.sleep(5000);
		
		//driver.findElement(By.xpath("//i18n-string[contains(text(),'Sign up')")).click();
		driver.findElement(By.linkText("Sign up")).click();
		

	}

}
