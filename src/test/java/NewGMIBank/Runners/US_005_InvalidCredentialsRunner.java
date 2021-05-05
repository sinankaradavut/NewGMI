package NewGMIBank.Runners;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {"html:target/default-cucumber-reports",
                "json:target/json-reports/cucumber.json",
                "junit:target/xml-report/cucumber.xml"},
        features = "src/test/resources",
        glue = "gmiBank_team22/step_Definitions",
        tags = "@Invalid",
        dryRun = false
)

public class US_005_InvalidCredentialsRunner {
}
