package DLGTests.runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {
                "html:target/default-cucumber-reports",
                "json:target//json-reports/cucumber.json",
                "rerun:target/rerun.txt"},
        features = "src/test/resources/features",
        glue = "com/greenflag/step_definitions",
        dryRun = false,
        tags = "@login"

)
public class CucumberRunner {
}