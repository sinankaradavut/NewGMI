package NewGMIBank.StepDefinitions;

import gmiBank_team22.pages.US_006_UserSettingsPage;
import gmiBank_team22.utilities.ConfigurationReader;
import gmiBank_team22.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class US_006_UserSettings_Step_Def {
    US_006_UserSettingsPage us_006_userSettingsPage = new US_006_UserSettingsPage();

    @Given("user sign in with valid credentials")
    public void user_sign_in_with_valid_credentials() {
        Driver.getDriver().get(ConfigurationReader.getProperty("url"));
        us_006_userSettingsPage.menu.click();
        Driver.waitForVisibility(us_006_userSettingsPage.firstSingIn,5).click();
        Driver.waitForVisibility(us_006_userSettingsPage.userName,5).sendKeys(ConfigurationReader.getProperty("US_006_username"));
        us_006_userSettingsPage.password.sendKeys(ConfigurationReader.getProperty("US_006_password"));
        us_006_userSettingsPage.secondSignIn.click();


    }

    @Given("user click user management")
    public void user_click_user_management() {
        us_006_userSettingsPage.accountMenu.click();


    }
    @Given("user select user Info")
    public void user_select_user_Info() {
        us_006_userSettingsPage.userInfo.click();

    }
    @Given("user is on the user settings page")
    public void user_is_on_the_user_settings_page() {
        String title  = Driver.getDriver().getTitle();
        System.out.println(title);
        Assert.assertEquals("GMIBANK", title);

    }
    @Given("user can see his own info")
    public void user_can_see_his_own_info() {
        String userSettingsTitle =us_006_userSettingsPage.userSettingsTitle.getText();
        System.out.println(userSettingsTitle);

    }
    @Given("two language option on the language dropdownmenu")
    public void two_language_option_on_the_language_dropdownmenu() {
        Driver.waitForVisibility(us_006_userSettingsPage.languagedropdown, 10);
        Select select  = new Select(us_006_userSettingsPage.languagedropdown);
        List<WebElement> languageList = select.getOptions();
        for (WebElement a: languageList){
            System.out.println(a.getText());
        }
    }


    @Then("Verify the page belongs to him and two languages options and signout")
    public void verify_the_page_belongs_to_him_and_two_languages_options_and_signout() {
        Select select  = new Select(us_006_userSettingsPage.languagedropdown);
        List<WebElement> languageList = select.getOptions();
        //Assert.assertTrue(languageList.contains("English"));
        String userSettingsTitle =us_006_userSettingsPage.userSettingsTitle.getText();
        System.out.println(userSettingsTitle);
        Assert.assertTrue("it belongs to user", userSettingsTitle.contains("mengels"));
        us_006_userSettingsPage.accountMenu.click();
        us_006_userSettingsPage.signOut.click();
    }

    @Given("user update firstname {string}")
    public void user_update_firstname(String string) {
        us_006_userSettingsPage.firstNameTextBox.clear();
        us_006_userSettingsPage.firstNameTextBox.sendKeys(string);
    }

    @Given("click save button")
    public void click_save_button() {
        us_006_userSettingsPage.submitBtn.click();
    }
    @Then("get success message {string}")
    public void get_success_message(String string) {
        String actualMessage =Driver.waitForVisibility((us_006_userSettingsPage.toastifyContainer), 5).getText();
        System.out.println(actualMessage);
        Assert.assertEquals(string, actualMessage);
        us_006_userSettingsPage.accountMenu.click();
        us_006_userSettingsPage.signOut.click();
    }
    @Given("user update lastname {string}")
    public void user_update_lastname(String string) {
        us_006_userSettingsPage.lastNameTextBox.clear();
        us_006_userSettingsPage.lastNameTextBox.sendKeys(string);
    }

    @Given("user update email {string}")
    public void user_update_email(String string) {
        us_006_userSettingsPage.emailTextBox.clear();
        us_006_userSettingsPage.emailTextBox.sendKeys(string);
    }

    @Given("user try to update with invalid email {string}")
    public void user_try_to_update_with_invalid_email(String string) {
        us_006_userSettingsPage.emailTextBox.clear();
        us_006_userSettingsPage.emailTextBox.sendKeys(string);
    }




    @Then("get error message {string}")
    public void get_error_message(String string) {
        String errorMessage =us_006_userSettingsPage.errorMessage.getText();
        Assert.assertEquals(string, errorMessage);
        us_006_userSettingsPage.accountMenu.click();
        us_006_userSettingsPage.signOut.click();
    }


}
