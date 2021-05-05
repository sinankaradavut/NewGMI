package gmiBank_team22.StepDefinitions;

import gmiBank_team22.pages.US_002_RegistrationNegative_Page;
import gmiBank_team22.utilities.ConfigurationReader;
import gmiBank_team22.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class US_002_RegistrationPageNegative_StepDefinitions {


    US_002_RegistrationNegative_Page registrationNegativePage= new US_002_RegistrationNegative_Page();

    @Given("user is on the homePage")
    public void user_is_on_the_homePage() {
        Driver.getDriver().get(ConfigurationReader.getProperty("url"));
    }



    @When("user click the User icon")
    public void user_click_the_User_icon() {
        registrationNegativePage.userIcon.click();
    }

    @Then("user click on the  Register")
    public void user_click_on_the_Register() {
        registrationNegativePage.dropdownRegister.click();
    }

    @Given("user is on the registration page")
    public void user_is_on_the_registration_page() {
        String expectedTitle="Registration";
        String actualTitle= registrationNegativePage.registrationPageTitle.getText();
        Assert.assertEquals(expectedTitle,actualTitle);
    }

    @When("user click on the First name textbox and enters firstName {string}")
    public void user_click_on_the_First_name_textbox_and_enters_firstName(String firstName) {
       registrationNegativePage.firstNameTextbox.sendKeys(firstName);
    }

    @Then("user click on the Last Name textbox  and enters lastName {string}")
    public void user_click_on_the_Last_Name_textbox_and_enters_lastName(String lastName) {
     registrationNegativePage.lastNameTextbox.sendKeys(lastName);
    }

    @Then("user click on the Address textbox  and enters address {string}")
    public void user_click_on_the_Address_textbox_and_enters_address(String address) {
        registrationNegativePage.addressTextbox.sendKeys(address);
    }

    @Then("user click on the Mobile Phone Number textbox  and enter phoneNumber {string}")
    public void user_click_on_the_Mobile_Phone_Number_textbox_and_enter_phoneNumber(String mobilePhone) {
      registrationNegativePage.mobilePhoneNumberTextbox.sendKeys(mobilePhone);
    }

    @Then("user click on the Username  and enters username {string}")
    public void user_click_on_the_Username_and_enters_username(String username) {
       registrationNegativePage.usernameTextbox.sendKeys(username);
    }

    @Then("user click on the Email textbox  and enters email {string}")
    public void user_click_on_the_Email_textbox_and_enters_email(String email) {
       registrationNegativePage.emailTextbox.sendKeys(email);
    }

    @Then("user click on the New password  and enters password {string}")
    public void user_click_on_the_New_password_and_enters_password(String password) {
        registrationNegativePage.newPasswordTextbox.sendKeys(password);
    }

    @Then("user click on the New password confirmation  and enters confirmationPassword {string}")
    public void user_click_on_the_New_password_confirmation_and_enters_confirmationPassword(String confirmationPassword) {
      registrationNegativePage.passwordConfirmationTextbox.sendKeys(confirmationPassword);
    }

    @Then("user click on the register button")
    public void user_click_on_the_register_button() {
       registrationNegativePage.registerButton.click();
    }


    @Then("user click on the SSN textbox  and enters ssn {string}")
    public void userClickOnTheSSNTextboxAndEntersSsn(String ssn) {
        registrationNegativePage.ssnTextbox.sendKeys(ssn);
    }

    @Then("user should see the emptySSNErrorMessage")
    public void userShouldSeeTheEmptySSNErrorMessage() {
        String expectedErrorMessage="translation-not-found[Your SSN is required]";
        String actualErrorMessage= registrationNegativePage.emptySSNTextboxErrorMessage.getText();
        Assert.assertEquals(expectedErrorMessage,actualErrorMessage);
    }

    @Then("user should see the emptyFirstNameErrorMessage")
    public void userShouldSeeTheEmptyFirstNameErrorMessage() {
        String expectedErrorMessage="Your First Name is required";
        String actualErrorMessage= registrationNegativePage.emptyFirstNameTextboxErrorMessage.getText();
        Assert.assertEquals(expectedErrorMessage,actualErrorMessage);
    }

    @Then("user should see the emptyLastNameErrorMessage")
    public void userShouldSeeTheEmptyLastNameErrorMessage() {
        String expectedErrorMessage="Your Last Name is required";
        String actualErrorMessage= registrationNegativePage.emptyLastNameErrorMessage.getText();
        Assert.assertEquals(expectedErrorMessage,actualErrorMessage);
    }


    @Then("user should see the emptyUsernameErrorMessage")
    public void userShouldSeeTheEmptyUsernameErrorMessage() {
        String expectedErrorMessage="Your username is required.";
        String actualErrorMessage= registrationNegativePage.emptyUsernameErrorMessage.getText();
        Assert.assertEquals(expectedErrorMessage,actualErrorMessage);
    }

    @Then("user should see the emptyEmailErrorMessage")
    public void userShouldSeeTheEmptyEmailErrorMessage() {
        String expectedErrorMessage="Your email is required.";
        String actualErrorMessage= registrationNegativePage.emptyEmailErrorMessage.getText();
        Assert.assertEquals(expectedErrorMessage,actualErrorMessage);
    }

    @Then("user should see the emptyPasswordErrorMessage")
    public void userShouldSeeTheEmptyPasswordErrorMessage() {
        String expectedErrorMessage="Your password is required.";
        String actualErrorMessage= registrationNegativePage.emptyPasswordErrorMessage.getText();
        Assert.assertEquals(expectedErrorMessage,actualErrorMessage);
    }

    @Then("user should see the emptyConfirmationPasswordErrorMessage")
    public void userShouldSeeTheEmptyConfirmationPasswordErrorMessage() {
        String expectedErrorMessage="Your confirmation password is required.";
        String actualErrorMessage= registrationNegativePage.emptyConfirmationPasswordErrorMessage.getText();
        Assert.assertEquals(expectedErrorMessage,actualErrorMessage);
    }

    @Then("user should see the invalidSSNErrorMessage")
    public void userShouldSeeTheInvalidSSNErrorMessage() {
        String expectedErrorMessage="Your SSN is invalid";
        String actualErrorMessage= registrationNegativePage.invalidSSNErrorMessage.getText();
        Assert.assertEquals(expectedErrorMessage,actualErrorMessage);
    }

    @Then("user should see the invalidMobilePhoneErrorMessage")
    public void userShouldSeeTheInvalidMobilePhoneErrorMessage() {
        String expectedErrorMessage="Your mobile phone number is invalid";
        String actualErrorMessage= registrationNegativePage.invalidMobilePhoneNumberTextboxErrorMessage.getText();
        Assert.assertEquals(expectedErrorMessage,actualErrorMessage);
    }

    @Then("user should see the invalidEmailErrorMessage")
    public void userShouldSeeTheInvalidEmailErrorMessage() {
        String expectedErrorMessage="This field is invalid";
        String actualErrorMessage= registrationNegativePage.invalidEmailErrorMessage.getText();
        Assert.assertEquals(expectedErrorMessage,actualErrorMessage);
    }

    @Then("user should not see the successMessage")
    public void userShouldNotSeeTheSuccessMessage() {
        String expectedErrorMessage="Registration saved! Please check your email for confirmation.";
        Driver.waitForVisibility(registrationNegativePage.registrationSuccessMessage,10);
        String actualErrorMessage= registrationNegativePage.registrationSuccessMessage.getText();
        System.out.println(actualErrorMessage);
        Assert.assertNotEquals(expectedErrorMessage,actualErrorMessage);
    }
}
