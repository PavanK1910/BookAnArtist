package utility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import pageOject.PageObjectManage;



public class TestContentSetup {
	public TestBase testBase;
	public WebDriver driver;
	public PageObjectManage pageObjectManage;
	public 		GenericUtils genericUtils;

	public TestContentSetup() {
		testBase = new TestBase();
		pageObjectManage =new PageObjectManage(testBase.WebDriverManager());
		genericUtils = new GenericUtils(testBase.WebDriverManager());
	}
	
}
