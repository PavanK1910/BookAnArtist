package pageOject;

import org.openqa.selenium.WebDriver;

public class PageObjectManage {

	public WebDriver driver;
	public PageObjectManage(WebDriver driver) {
		this.driver = driver;
	}
	public LandingPage landingPage;
	
	public  LandingPage GetLandingPage() {
		landingPage = new LandingPage(driver);
	return landingPage;
	
	}
	
}
