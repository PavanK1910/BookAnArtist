package EPSstepDefinassion;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import pageOject.LandingPage;
import utility.TestContentSetup;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class LoginPageStepDefinassion {
	public WebDriver driver;
	public WebDriverWait wait;
	public TestContentSetup testContentSetup;
	public LandingPage landingPage;

	public LoginPageStepDefinassion(TestContentSetup testContentSetup) {
		this.testContentSetup = testContentSetup;
	}

	@Given("User is on login page")
	public void user_is_on_login_page() {

		WebDriverManager.chromedriver().setup();
		testContentSetup.driver = new ChromeDriver();
		testContentSetup.driver.manage().window().maximize();
		testContentSetup.driver.get("https://epsweb.adminconsole.net");

	}

	@When("^Enter (.+) and (.+)$")
	public void enter_and(String username, String password) {
		landingPage = new LandingPage(testContentSetup.driver);
		
		LandingPage	landingPage = testContentSetup.pageObjectManage.GetLandingPage();
		landingPage.adminLogin(username, password);
		testContentSetup.driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

	}

	@Then("User can login succssefully")
	public void user_can_login_succssefully() {
		testContentSetup.genericUtils.waitFor();;
		landingPage.ClickonBugurButton();

	}

	@Then("Land on Dasboard Page")
	public void land_on_dasboard_page() {
System.out.println("Dashboasrf Page");
		Assert.assertEquals("Dashboard", landingPage.Dashboardtab());
	}

}
