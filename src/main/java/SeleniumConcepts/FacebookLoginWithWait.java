package SeleniumConcepts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FacebookLoginWithWait {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();

		driver.get("https://www.facebook.com");
		
		By emailID = By.id("email");
		By password = By.id("pass");
		By LoginButton = By.id("u_0_b");
		
		ElementUtil elementUtil = new ElementUtil(driver);
		elementUtil.waitForElementPresent(emailID, 5).sendKeys("jayapriya.somu@gmail.com");
		elementUtil.doSendKeys(password, "ragavendra@987");
		elementUtil.doClick(LoginButton);
				
		
	}

}
