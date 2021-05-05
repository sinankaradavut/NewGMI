package gmiBank_team22.StepDefinitions;

import gmiBank_team22.pages.US_004_Login_Page;
import gmiBank_team22.pages.US_008_PasswordChange_Page;
import gmiBank_team22.utilities.ConfigurationReader;
import gmiBank_team22.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class US_008_PasswordChange_StepDefinitions {


    US_008_PasswordChange_Page us_008_passwordChange_page = new US_008_PasswordChange_Page();
    US_004_Login_Page us_004_login_page = new US_004_Login_Page();

    @Given("User goes to page")
    public void user_goes_to_page() {
        Driver.getDriver().get(ConfigurationReader.getProperty("url"));
    }

    int barLevel1 = 1;
    int barLevel2 = 1;
    int barLevel4 = 1;
    int barLevel5 = 1;

    @Then("click Password")
    public void click_Password() {
        us_008_passwordChange_page.passwordButton.click();
    }

    @Given("click sign in")
    public void click_sign_in() {
        us_004_login_page.secondSignIn.click();
    }

    @Then("type users current password")
    public void type_users_current_password() {
        us_008_passwordChange_page.currentPassword.clear();
        us_008_passwordChange_page.currentPassword.sendKeys(ConfigurationReader.getProperty("customerPassword"));

    }

    @Then("type users new {string}")
    public void type_users_new_password(String string) {
        us_008_passwordChange_page.newPassword.clear();
        us_008_passwordChange_page.newPassword.sendKeys(string);

    }

    @Then("confirm users {string}")
    public void confirm_users_password(String string) throws InterruptedException {
        us_008_passwordChange_page.confirmPassword.clear();
        us_008_passwordChange_page.confirmPassword.sendKeys(string);

    }

    @Then("save it")
    public void save_it() throws InterruptedException {
        us_008_passwordChange_page.save.click();
    }

    @Then("sign out")
    public void sign_out() {
        us_008_passwordChange_page.signOut.click();
    }

    @Then("verify failed message")
    public void verify_failed_message() {
        String actuel = Driver.waitForVisibility(us_008_passwordChange_page.failedToSign, 5).getText();
        System.out.println("actuel = " + actuel);
        String expected = "Failed to sign in!";
        Assert.assertEquals(expected, actuel);
    }

    @When("new username and {string}")
    public void repair_user_enters_username_and_password(String string) throws InterruptedException {
        us_004_login_page.userName.click();
        us_004_login_page.userName.sendKeys(ConfigurationReader.getProperty("customerUserName"));
        us_004_login_page.password.click();
        us_004_login_page.password.sendKeys(string);
        Thread.sleep(3000);
    }

    @When("repair current {string}")
    public void repair_current_password(String string) throws InterruptedException {
        us_008_passwordChange_page.currentPassword.clear();
        us_008_passwordChange_page.currentPassword.sendKeys(string);
    }

    @Then("check bar level")
    public void check_bar_level() {


        if (us_008_passwordChange_page.barLevel2.getAttribute("style").contains("255")) {
            barLevel2++;
            if (us_008_passwordChange_page.barLevel4.getAttribute("style").contains("255")) {
                barLevel4 = 4;
                if (us_008_passwordChange_page.barLevel5.getAttribute("style").contains("255")) {
                    barLevel5 = 5;
                }
            }
        }
//        System.out.println(barLevel2+" level2//"+barLevel4+" level4//"+barLevel5+" level5" );
    }

    @Then("verify bar level increased")
    public void verify_bar_level_increased() {
        Assert.assertTrue(barLevel2 > 1);
    }

    @Then("verify password changed")
    public void verify_password_changed() {
        String actuel = Driver.waitForVisibility(us_008_passwordChange_page.passwordChangedMessage, 10).getText();
        String expected = "Password changed!";
        Assert.assertEquals(expected, actuel);
    }

    @Then("type users current {string}")
    public void type_users_current(String string) {
        us_008_passwordChange_page.currentPassword.sendKeys(string);
    }

    @Then("type users new password")
    public void type_users_new_password() {
        us_008_passwordChange_page.newPassword.clear();
        us_008_passwordChange_page.newPassword.sendKeys(ConfigurationReader.getProperty("customerPassword"));
    }

    @Then("confirm users password")
    public void confirm_users_password() {
        us_008_passwordChange_page.confirmPassword.clear();
        us_008_passwordChange_page.confirmPassword.sendKeys(ConfigurationReader.getProperty("customerPassword"));
    }
}
