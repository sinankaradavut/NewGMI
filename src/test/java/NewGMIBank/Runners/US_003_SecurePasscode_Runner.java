package NewGMIBank.Runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

//@RunWith(Cucumber.class)
//@CucumberOptions(
//        plugin = {"pretty","html:target/default-cucumber-reports",
//                "json:target/json-reports/cucumber.json",
//                "junit:target/xml-report/cucumber.xml"}, strict = true,
//        monochrome = true,
//        features = "src/test/resources/features",
//        glue = "gmiBank_team22/step_Definitions",
//        tags = "",
//       dryRun = true
//)
@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = "html:target/cucumber-report.html",
        features = "src/test/resources/features",
        glue = "gmiBank_team22/step_Definitions",
        tags = "@US_003_SecurePasscode",

        dryRun = false
)

public class US_003_SecurePasscode_Runner {
}
