package NewGMIBank.StepDefinitions;

import gmiBank_team22.pages.US_003_SecurePasscodePage;
import gmiBank_team22.utilities.ConfigurationReader;
import gmiBank_team22.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class US_003_SecurePasscode_Step_Def {
US_003_SecurePasscodePage passcodePage=new US_003_SecurePasscodePage();


    @Given("Go to registration page")
    public void go_to_registration_page() {

        passcodePage.registration();

    }


    @When("Enter  {string}")
    public void enter(String password) {
        passcodePage.newPassword(password);
    }





    @Then("Should see the level chart shows {string}")
    public void should_see_the_level_chart_shows(String expectedBackgroundColor) {
        String actualBackgroundColor=passcodePage.strengthBar.getAttribute("style");
        System.out.println("expectedBackgroundColor = " + expectedBackgroundColor);

        System.out.println("actualBackgroundColor = " + actualBackgroundColor);
        Assert.assertEquals(actualBackgroundColor,expectedBackgroundColor);

    }



}
