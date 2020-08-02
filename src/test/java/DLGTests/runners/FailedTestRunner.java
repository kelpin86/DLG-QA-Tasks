package DLGTests.runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {
                "html:target/failed-cucumber-reports",
                "json:target//json-reports/failed_cucumber.json"},
        features = "@target/rerun.txt",
        glue = "com/greenflag/step_definitions"
)
public class FailedTestRunner {
}