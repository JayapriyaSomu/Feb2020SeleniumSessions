package SeleniumConcepts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {
	
	//By Locators - page objects
	
	static By emailId = By.id("username");
	static By password = By.id("password");
	static By loginButon = By.id("loginBtn");
	static By signUpLink = By.id("Sign Up");
	static By homePageHeader = By.className("private-page__title");
	
	public static void main(String args[]) throws InterruptedException{
		
		BrowserActions br = new BrowserActions();
		WebDriver driver = br.launchBrowser("chrome");
		br.launchUrl("https://app.hubspot.com/login");
		Thread.sleep(5000);
		
		ElementUtil elemUtil = new ElementUtil(driver);
		/*elemUtil.getElement(emailId).sendKeys("jayapriya@gmail.com");
		elemUtil.getElement(password).sendKeys("jaya");
		elemUtil.getElement(loginButon).click();*/
		
		elemUtil.doSendKeys(emailId, "naveenanimation30@gmail.com");
		elemUtil.doSendKeys(password, "Test@1234");
		elemUtil.doClick(loginButon);
		
		Thread.sleep(5000);
		
		String header = elemUtil.doGetText(homePageHeader);
		System.out.println("Home page header is " + homePageHeader);
		if(header.equals("Sales Dashboard")){
			System.out.println("user logged in successfully");
		}else {
			System.out.println("could not login");
		}
		
		
		
		
	}
	
	

}
