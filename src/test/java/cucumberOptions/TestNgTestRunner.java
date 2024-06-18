package cucumberOptions;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features="src/test/java/featurefile",glue="EPSstepDefinassion",monochrome=true,
plugin={"html:target/cucumber.html"})

public class TestNgTestRunner extends AbstractTestNGCucumberTests{

}
