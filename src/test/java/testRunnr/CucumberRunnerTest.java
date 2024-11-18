package testRunnr;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(tags = "", features = {"src/test/resources/features"},glue ={"step_definitions"}
        ,plugin = {"pretty","html:target/htmlReport.html"})

public class CucumberRunnerTest extends AbstractTestNGCucumberTests {

}
