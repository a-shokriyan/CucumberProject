package testRunners;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features= {"src\\test\\resources\\feature\\SignUpWithDT.feature"}
,glue= {"stepdifinition"}
//,monochrome= true
,dryRun =false
//,plugin= {"pretty", "html:test-output"}
)


public class TestRunner {
	
	
}
