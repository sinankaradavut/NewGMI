package gmiBank_team22.StepDefinitions;

import gmiBank_team22.pages.US_014_DateCreation_Page;
import gmiBank_team22.utilities.Driver;
import io.cucumber.java.en.Given;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;

import java.util.Date;

public class US_014_DateCreation_Step_Def {


    US_014_DateCreation_Page us14Page =new US_014_DateCreation_Page();
    Actions actions = new Actions(Driver.getDriver());

    @Given("user clicks manageAccounts link")
    public void user_clicks_manageAccounts_link() {
        us14Page.manageAccountLink.click();


    }

    @Given("user clicks createANewAccount link")
    public void user_clicks_createANewAccount_link() {
        us14Page.createANewAccountLink.click();
    }

    @Given("user sends an earlier date")
    public void user_sends_an_earlier_date() {
        us14Page.createDateBox.click();
        Driver.wait(2);
        us14Page.createDateIcon.sendKeys("01012000"+ Keys.ENTER);
        System.out.println(us14Page.createDateIcon.getAttribute("value"));

    }

    @Given("user verifies date is an early date")
    public void user_verifies_date_is_an_early_date() {

        String dailyDateValue = us14Page.createDateIcon.getAttribute("value");
        System.out.println("ExpectedDate : " + dailyDateValue);
        String expectedYear=dailyDateValue.substring(0,4);
        System.out.println(expectedYear);
        int expectedYearInt = Integer.parseInt(expectedYear);

        Date date = new Date();
        String dateActual = date.toString();
        System.out.println("ActualDate : " + dateActual);
        String actualYear = dateActual.substring(dateActual.length()-4);
        System.out.println(actualYear);
        int actualYearInt = Integer.parseInt(actualYear);

        if (expectedYearInt<actualYearInt){
            System.out.println("Early Date can be selected");
        } else{
            System.out.println("Check further month, day and time");
        }

    }

    @Given("user account send a date {string} and click tab")
    public void user_account_send_a_date_and_click_tab(String string) {

        us14Page.createDateBox.click();

        us14Page.createDateIcon.sendKeys(string + Keys.TAB);
    }

    @Given("user account send a time {string} and user click tab")
    public void user_account_send_a_time_and_user_click_tab(String string) {

        us14Page.createDateIcon.sendKeys(string + Keys.TAB);
    }

    @Given("user account click tab")
    public void user_account_click_tab() {

        us14Page.createDateIcon.sendKeys(Keys.TAB);

    }

    @Given("user account verifies valid data entry to Create Date box")
    public void user_account_verifies_valid_data_entry_to_Create_Date_box() {

        Date date = new Date();
        String dateActual = date.toString();
        System.out.println("ActualDate : " + dateActual);
        String actualYear = dateActual.substring(dateActual.length()-4);
        System.out.println("actualYear="+actualYear);

        String dailyDateValue = us14Page.createDateIcon.getAttribute("value");
        System.out.println(dailyDateValue);
        Assert.assertTrue(dailyDateValue.contains(actualYear));

    }

    @Given("user customer send a date {string} and click tab")
    public void user_customer_send_a_date_and_click_tab(String string) {
        actions.sendKeys(Keys.PAGE_DOWN).perform();
        Driver.wait(2);
        us14Page.createDateBoxCustomer.sendKeys(string + Keys.TAB);
    }

    @Given("user customer send a time {string} and user click tab")
    public void user_customer_send_a_time_and_user_click_tab(String string) {

        us14Page.createDateBoxCustomer.sendKeys(string + Keys.TAB);
    }

    @Given("user customer click tab")
    public void user_customer_click_tab() {
        actions.sendKeys(Keys.TAB).perform();
    }

    @Given("user customer verifies valid data entry to Create Date box")
    public void user_customer_verifies_valid_data_entry_to_Create_Date_box() {

        String valueDateBoxCustomer = us14Page.createDateBoxCustomer.getAttribute("value");
        System.out.println(valueDateBoxCustomer);
        Assert.assertFalse(valueDateBoxCustomer.isEmpty());

    }

    @Given("user customer click user box and select a user")
    public void user_customer_click_user_box_and_select_a_user() {


        Driver.selectByIndex(us14Page.userSelectionBox,4);
        Driver.wait(2);


    }

    @Given("user customer verifies valid selection of user")
    public void user_customer_verifies_valid_selection_of_user() {

        String userName = us14Page.userSelectionBox.getAttribute("value");
        Assert.assertFalse(userName.isEmpty());

    }

    @Given("user customer click Zelle Enrolled box")
    public void user_customer_click_Zelle_Enrolled_box() {

        actions.sendKeys(Keys.PAGE_DOWN).perform();
        us14Page.zelleCheckBox.click();
        Driver.wait(2);
        Assert.assertTrue(us14Page.zelleCheckBox.isSelected());

    }

    @Given("user customer verifies that there is no allert message related to Zelle box")
    public void user_customer_verifies_that_there_is_no_allert_message_related_to_Zelle_box() {

        us14Page.saveButton.click();
        String valueAfterClick = us14Page.zelleCheckBox.getAttribute("value");
        System.out.println(valueAfterClick);
        Assert.assertEquals(valueAfterClick,"true");

    }

}
