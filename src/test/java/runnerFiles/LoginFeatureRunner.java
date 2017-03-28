package runnerFiles;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;


@CucumberOptions(features = "src/test/java/features/login/",glue = "stepDefs",tags = {"~@ignore"},
plugin = {"pretty","json:Automation Reports/Latest Results/Json Reports/login/Test.json","html:Automation Reports/Latest Results/Html Reports/login/Test"})
public class LoginFeatureRunner extends AbstractTestNGCucumberTests {
	
}
