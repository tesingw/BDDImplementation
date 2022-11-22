package runners;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/featurefiles",
        glue = "stepdefinitions",
        tags = "@SmokeTest",
        monochrome = true)
public class CucumberTestsRunner {

}