package NewGMIBank.Runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {"html:target/default-cucumber-reports",
                "json:target/json-reports/cucumber.json",
                "junit:target/xml-report/cucumber.xml", "pretty"},
        features = "src/test/resources/features",
        glue = "gmiBank_team22/step_Definitions",
        tags = "@US_012",
        dryRun = false,
        strict = true

)

public class US_012_Employee_Runner {
}
