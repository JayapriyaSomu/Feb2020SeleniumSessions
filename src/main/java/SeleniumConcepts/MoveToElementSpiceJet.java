package SeleniumConcepts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MoveToElementSpiceJet {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.spicejet.com");
		Thread.sleep(3000);
		
		WebElement loginLink = driver.findElement(By.className("link"));
		WebElement spiceClubMember = driver.findElement(By.xpath("//a[contains(text(),'SpiceClub Members')]"));
		
		Actions action = new Actions(driver);
		action.moveToElement(loginLink).build().perform();
		action.moveToElement(spiceClubMember).build().perform();
		driver.findElement(By.xpath("//li[@class='hide-mobile']//ul//li//a[contains(text(),'Member Login')]")).click();
		
		
	/*	driver.findElement
		(By.xpath("//li[@class='hide-mobile']//ul/li/a[@href='https://book.spicejet.com/Login.aspx' and contains(.,'Member Login')]")).click();
		*/
		
		
	}

}
