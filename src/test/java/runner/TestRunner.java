package runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/resources/Features",
        glue = {"step_definitions"},
        plugin = {"pretty", "summary", "html:target/CucumberReports/publix.html"},
        publish = true
        //tags = "@login"

)

public class TestRunner {
}

