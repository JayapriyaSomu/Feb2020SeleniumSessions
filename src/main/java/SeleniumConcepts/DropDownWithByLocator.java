package SeleniumConcepts;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DropDownWithByLocator {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();

		WebDriver driver = new ChromeDriver();
		driver.get("http://www.facebook.com");

		By day = By.id("day");
		By month = By.id("month");
		By year = By.id("year");
		
		ElementUtil getList = new ElementUtil(driver);
		
		List<String> dayList = getList.getDropDownValues(day);
		System.out.println(dayList);
		
		List<String> monthList = getList.getDropDownValues(month);
		System.out.println(monthList);
		
		List<String> yearList =getList.getDropDownValues(year);
		System.out.println(yearList);
		
	}

}
