package cucumberOptions;

//import org.junit.runner.RunWith;
//import cucumber.api.junit.*;
import cucumber.api.testng.AbstractTestNGCucumberTests;
import cucumber.api.CucumberOptions;

//@RunWith(Cucumber.class)
	@CucumberOptions(
			features = "src/test/java/features",
			glue = "stepDefinitions")
public class TestRunner extends AbstractTestNGCucumberTests{

	
}
