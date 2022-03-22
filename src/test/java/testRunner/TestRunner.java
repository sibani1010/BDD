package testRunner;

import org.junit.runner.RunWith;
import cucumber.api.junit.Cucumber;
import cucumber.api.CucumberOptions;


@RunWith(Cucumber.class)
@CucumberOptions(
	features = ".//Features/Customers.feature",
    glue = "stepDefinations",
    monochrome=true,
    dryRun = false,
	plugin= {"pretty",
			"html:test-output"
			}
	
)
public class TestRunner {
	
	

}
