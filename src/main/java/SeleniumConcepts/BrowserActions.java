package SeleniumConcepts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BrowserActions {

	WebDriver driver;
	/**
	 * This method is used to initialize and launch the browser, based on the input provided.
	 * @param browser
	 */
	public WebDriver launchBrowser(String browser) {
		
		switch (browser) {
		case "chrome":
			WebDriverManager.chromedriver().setup();
			/*ChromeOptions co = new ChromeOptions();
			co.addArguments("--headless");*/
			driver = new ChromeDriver();
			break;
		case "firefox":
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
			break;
		case "ie":
			WebDriverManager.iedriver().setup();
			driver = new InternetExplorerDriver();
			break;

		default:
			System.out.println("Browser is incorrect. Please revisit " + browser);
			break;

		}
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		
		return driver;
	}
	
	/**
	 * This method is used to launch the url based on the input URL provided.
	 * @param url
	 */
	public void launchUrl(String url){
		driver.get(url);
		
	}
	
	/**
	 * This method gets the title of the launched page.
	 * @return
	 */
	public String doGetTitle() {
		System.out.println(driver.getTitle());
		return driver.getTitle();
	}
	
	public String getPageUrl(){
		return driver.getCurrentUrl();
		
	}
	
	public String getPageSource(){
		return driver.getPageSource();
		
	}
	
	/**
	 * This method quits the browser once the actions are completed.
	 */
	
	public void quitBrowser(){
		driver.quit();
	}

} //end of class
