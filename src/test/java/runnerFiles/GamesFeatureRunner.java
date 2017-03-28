package runnerFiles;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;


@CucumberOptions(features = "src/test/java/features/games/",glue = "stepDefs",tags = {"~@ignore"},
plugin = {"pretty","json:Automation Reports/Latest Results/Json Reports/games/Test.json","html:Automation Reports/Latest Results/Html Reports/games/Test"})
public class GamesFeatureRunner extends AbstractTestNGCucumberTests {
	
}
