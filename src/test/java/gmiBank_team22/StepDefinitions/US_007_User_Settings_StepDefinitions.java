package gmiBank_team22.StepDefinitions;

import gmiBank_team22.pages.US_007_User_Settings_Page;
import gmiBank_team22.utilities.ConfigurationReader;
import gmiBank_team22.utilities.Driver;
import gmiBank_team22.utilities.ExcelUtil;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;

public class US_007_User_Settings_StepDefinitions {

    US_007_User_Settings_Page us_007_user_settings_page = new US_007_User_Settings_Page();


    @Given("user signs in")
    public void user_signs_in() {
    //    Driver.getDriver().get(ConfigurationReader.getProperty("url"));   homepage called in hooks instead of doing this
        us_007_user_settings_page.accountMenu.click();
        Driver.waitForVisibility(us_007_user_settings_page.firstSingIn, 8).click();
        Driver.waitForVisibility(us_007_user_settings_page.userName, 8).sendKeys(ConfigurationReader.getProperty("employeeUserName"));
        us_007_user_settings_page.password.sendKeys(ConfigurationReader.getProperty("employeePassword"));
        us_007_user_settings_page.signInButton.click();
    }

    @Given("user clicks on the user icon")
    public void user_clicks_on_the_user_icon() {
        us_007_user_settings_page.userMenu.click();
    }

    @Given("user clicks on user info")
    public void user_clicks_on_user_info() {
        us_007_user_settings_page.userInfo.click();
    }

    @Given("user enters {string} in the email text box")
    public void user_enters_in_the_email_text_box(String string) {
        us_007_user_settings_page.emailTextBox.clear();
        us_007_user_settings_page.emailTextBox.sendKeys(string);
        String errorMessage = us_007_user_settings_page.invalidMessage.getText();
        String expectedMessage = "This field is invalid";

        Assert.assertTrue(errorMessage.equals(expectedMessage));


    }


    @Given("user clicks on save button")
    public void user_clicks_on_save_button() {
        us_007_user_settings_page.saveButton.click();
    }



    @Given("user clicks on the language menu")
    public void user_clicks_on_the_language_menu() {
        us_007_user_settings_page.languageDropdown.click();
    }



    @Given("user displays available language options")
    public void user_displays_available_language_options() {
        String languages = us_007_user_settings_page.languageDropdown.getText();
        System.out.println(languages);
        Assert.assertTrue(languages.contains("English") && languages.contains("Türkçe"));


    }



    @Then("user clicks on save")
    public void user_clicks_on_save() {
        us_007_user_settings_page.saveButton.click();
    }


}
