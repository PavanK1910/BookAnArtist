package utility;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class GenericUtils {
	public WebDriver driver;
	public GenericUtils(WebDriver driver) {
		this.driver = driver;

	}

	public void waitFor() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));// explicitWait
		wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//*[@class='nav']"))));

	}
}
