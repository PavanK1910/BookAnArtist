package pageOject;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LandingPage {
public WebDriver driver;
	
	public LandingPage(WebDriver driver) {
		this.driver = driver;
	}
	
	By user = By.id("EmailId");
	By pass = By.id("pwd");
	By clickButton = By.id("btnSubmit");

	By burgurButton = By.xpath("//*[@class='nav']");
	
	By getDashboard = By.id("dashboardtab");
	
	
	public void adminLogin(String username, String password) {
		driver.findElement(user).sendKeys(username);
		
		driver.findElement(pass).sendKeys(password);
		
		driver.findElement(clickButton).click();
	}
	public void ClickonBugurButton() {
		
		driver.findElement(burgurButton).click();

	}
	
	public String Dashboardtab() {
		String dash= driver.findElement(getDashboard).getText();
		return dash;
	}

}
