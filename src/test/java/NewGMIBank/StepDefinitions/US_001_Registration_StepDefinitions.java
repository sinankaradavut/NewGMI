package NewGMIBank.StepDefinitions;

import gmiBank_team22.pages.US_001_Registration_Page;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;

public class US_001_Registration_StepDefinitions {
    US_001_Registration_Page registrationPage = new US_001_Registration_Page();


    @Given("click on register")
    public void click_on_register() {
        registrationPage.register.click();
    }
    @Given("user enters the ssn {string}")
    public void user_enters_the_ssn(String ssn) {
        registrationPage.ssn.sendKeys(ssn);


    }
    @Given("user enters the firstname {string}")
    public void user_enters_the_firstname(String firstname) {
        registrationPage.firstname.sendKeys(firstname);

    }
    @Given("user enters the last name {string}")
    public void user_enters_the_last_name(String lastname) {
        registrationPage.lastname.sendKeys(lastname);

    }
    @Given("user enters the address   {string}")
    public void user_enters_the_address(String address) {
        registrationPage.address.sendKeys(address);

    }
    @Given("user enters the phone number {string}")
    public void user_enters_the_phone_number(String mobilephone ) {
        registrationPage.mobilephone.sendKeys(mobilephone);
    }
    @Given("user enters the username  {string}")
    public void user_enters_the_username(String username) {
        registrationPage.username.sendKeys(username);

    }
    @Given("user enters the email address {string}")
    public void user_enters_the_email_address(String email) {
        registrationPage.email.sendKeys(email);
    }
    @Given("user enters the password {string}")
    public void user_enters_the_password(String password) {
        registrationPage.password.sendKeys(password);
    }
    @Given("user enters the password for confirm {string}")
    public void user_enters_the_password_for_confirm_password(String confirmPassword) {
        registrationPage.confirmPassword.sendKeys(confirmPassword);

    }
    @Given("user clicks the register button")
    public void user_clicks_the_register_button() {
        registrationPage.registerButton.click();

    }
    @Then("verify the registration completed successfully")
    public void verify_the_registration_completed_successfully() {
        String actualVerifyingMessage = registrationPage.verifyMessage.getText();
        String expectedVerifyingMessage="Registration saved! Please check your email for confirmation.";

        Assert.assertEquals(actualVerifyingMessage, expectedVerifyingMessage);

    }


}
