package SeleniumConcepts;

public class GoogleTest {

	public static void main(String[] args) {
		
		BrowserActions br = new BrowserActions();
		
		br.launchBrowser("chrome");
		
		br.launchUrl("https://www.delta.com");
		
		String title = br.doGetTitle();
		System.out.println("Page title:" + title);
		
		if(title.equalsIgnoreCase("Airline Tickets & Flights: Book Direct with Delta Air Lines - Official Site")){
			System.out.println("correct title");
		}else {
			System.out.println("incorrect title");
		}
		
		String pageUrl = br.getPageUrl();
		System.out.println("PAge Url is : " + pageUrl);
		
		String pageSource = br.getPageSource();
		System.out.println("Page Source is :" + pageSource);
		
		br.quitBrowser();
		
		
		
		
		

		
		
	}

}
