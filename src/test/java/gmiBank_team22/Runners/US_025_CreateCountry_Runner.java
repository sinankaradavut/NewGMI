package gmiBank_team22.Runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        strict = true,
        features = "src/test/resources/features",
        glue = "gmiBank_team22/step_Definitions",
        plugin = {
                "html:target/default-cucumber-reports",
                "json:target/json-reports/cucumber.json",
                "junit:target/xml-report/cucumber.xml"
        },
        tags ="@Scenario2",
        dryRun = false
)
public class US_025_CreateCountry_Runner {
}
