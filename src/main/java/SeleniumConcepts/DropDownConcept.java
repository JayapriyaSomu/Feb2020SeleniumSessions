package SeleniumConcepts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DropDownConcept {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();

		WebDriver driver = new ChromeDriver();
		driver.get("http://www.facebook.com");

		By day = By.id("day");
		By month = By.id("month");
		By year = By.id("year");
		
		ElementUtil select = new ElementUtil(driver);
		select.selectDropDown(day, "20");
		select.selectDropDown(month,10);
		select.selectDropDown(year, "1981");

	}
	

}
