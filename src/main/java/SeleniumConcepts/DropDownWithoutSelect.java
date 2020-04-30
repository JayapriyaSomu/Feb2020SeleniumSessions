package SeleniumConcepts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DropDownWithoutSelect {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();

		WebDriver driver = new ChromeDriver();
		driver.get("http://www.facebook.com");

		String dob = "20-Jun-2019";

		String dayXpathValue = "//select[@id='day']/option";
		String monthXpathValue = "//select[@id='month']/option";
		String yearXpathValue = "//select[@id='year']/option";
		
		String dayCSSValue = "select#day option";
		String monthCSSValue = "select#month option";
		String yearCSSValue = "select#year option";
		
		ElementUtil getList = new ElementUtil(driver);

/*		getList.dropDownWithoutSelectmethod("xpath", dayXpathValue, dob.split("-")[0]);
		getList.dropDownWithoutSelectmethod("xpath", monthXpathValue, dob.split("-")[1]);
		getList.dropDownWithoutSelectmethod("xpath", yearXpathValue, dob.split("-")[2]);*/
		
		getList.dropDownWithoutSelectmethod("css", dayCSSValue, dob.split("-")[0]);
		getList.dropDownWithoutSelectmethod("css", monthCSSValue, dob.split("-")[1]);
		getList.dropDownWithoutSelectmethod("css", yearCSSValue, dob.split("-")[2]);
		
	}

}
