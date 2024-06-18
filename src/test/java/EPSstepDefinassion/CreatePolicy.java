package EPSstepDefinassion;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;


public class CreatePolicy {

	WebDriver driver;
	public CreatePolicy(WebDriver driver) {
		this.driver = driver;
	}
	
@Given("Click on Policy Management buttoon")
public void click_on_policy_management_buttoon() {

    driver.findElement(By.id("IntranetPolicyTab")).click();
}

@Then("Admin create policy for DLPUser")
public void admin_create_policy_for_dlp_user() {
System.out.println("gitt push and pull");   
}
@Then("Verify Policy is created successfully")
public void verify_policy_is_created_successfully() {
    // Write code here that turns the phrase above into concrete actions
    throw new io.cucumber.java.PendingException();
}

}
