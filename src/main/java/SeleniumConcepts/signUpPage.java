package SeleniumConcepts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class signUpPage {
	
	//By Locators
	static By signUpLink = By.linkText("Sign up");
	
	public static void main(String args[]) throws InterruptedException{
		
		BrowserActions br = new BrowserActions();
		WebDriver driver = br.launchBrowser("chrome");
		br.launchUrl("https://app.hubspot.com/login");
		
		Thread.sleep(5000);
		
	   // driver.findElement(By.linkText("Sign up")).click();
		
		ElementUtil elemUtil = new ElementUtil(driver);
		elemUtil.signUp(signUpLink);
		
	}
	

}
