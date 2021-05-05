package NewGMIBank.StepDefinitions;

import gmiBank_team22.pages.US_012_Employee_Page;
import gmiBank_team22.utilities.Driver;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;


public class US_012_Employee_Steps {
    US_012_Employee_Page employeePage = new US_012_Employee_Page();

    // Scenario: US012_001
    @Then("Validate the message of Showing Items and column names in header")
    public void validate_the_message_of_Showing_Items_and_column_names_in_header() {
        employeePage.MyOperationsMenu.click();
        employeePage.ManageCostumerButton.click();
        String message = employeePage.ShowingItems.getText();
        boolean isshown = employeePage.ShowingItems.isDisplayed();
        //List<WebElement> headers = Driver.driver.findElements(
        List<WebElement> headers = employeePage.headerrows.findElements(By.xpath("//*[@id=\"app-view-container\"]/div[1]/div/div/div/div[1]/div/table/thead/tr/th"));
        List<String> actualList = new ArrayList<String>();
        List<String> expectedList;
        expectedList = Arrays.asList("First Name", "Last Name", "Middle Initial", "Email", "Mobile Phone Number", "Phone Number", "Address", "Create Date");
        for (int x = 1; x < headers.size() - 1; x++) {
            String data = headers.get(x).getText();
            actualList.add(data);
        }

        Collections.sort(actualList);
        Collections.sort(expectedList);
        boolean islistequal = expectedList.equals(actualList);
        Assert.assertTrue(isshown);
        Assert.assertTrue(islistequal);
    }

    @Then("Employee should see  View option and edit button in it")
    public void employee_should_see_View_option_and_edit_button_in_it() {
        employeePage.MyOperationsMenu.click();
        employeePage.ManageCostumerButton.click();
        Driver.waitForVisibility(employeePage.viewbutton, 3);
        employeePage.viewbutton.click();
        boolean iseditwshown = employeePage.editbtninview.isDisplayed();
        Assert.assertTrue(iseditwshown);
    }

    // Scenario: US012_003
    @Then("Employee should see Delete button")
    public void employee_should_see_Delete_button() {
        employeePage.MyOperationsMenu.click();
        employeePage.ManageCostumerButton.click();
        Driver.waitForVisibility(employeePage.deletebutton, 1);
        boolean isdeleteshown = employeePage.deletebutton.isDisplayed();
        Assert.assertTrue(isdeleteshown);
    }

    // Scenario: US012_004
    @When("Click on edit button for a costumer")
    public void click_on_edit_button_for_a_costumer() {
        employeePage.MyOperationsMenu.click();
        employeePage.ManageCostumerButton.click();
        employeePage.editbtnofthirduser.click();
    }

    @When("Change mphone email and disable zelle enrolment and click on save")
    public void change_mphone_email_and_disable_zelle_enrolment_and_click_on_save() throws InterruptedException {
        employeePage.mphoneacostumer.clear();
        employeePage.mphoneacostumer.sendKeys("999-999-9999");
        employeePage.emailacostumer.clear();
        employeePage.emailacostumer.sendKeys("abc@abc.com");
        Thread.sleep(1000);
        //JavascriptExecutor js = (JavascriptExecutor) Driver.driver;
        //js.executeScript("window.scrollBy(0,1000)");
        Driver.scrollToElement(employeePage.savebtn);
        employeePage.zellebtn.click();
        Thread.sleep(2000);
        employeePage.savebtn.click();
    }

    @Then("Employee should see translation-not-found message")
    public void employee_should_see_translation_not_found_message() {
        Driver.waitForVisibility(employeePage.tostifwarning, 100);
        boolean isalertshown = employeePage.tostifwarning.isDisplayed();
        String tosstifymessage = employeePage.tostifwarning.getText();
        Assert.assertTrue(isalertshown);
    }

    // Scenario: US012_005
    @Then("employee should see\"Create a costumer\" option")
    public void employee_should_see_Create_a_costumer_option() {
        Assert.fail();
    }


    //  Scenario: US012_006
    @When("Click on delete button for a user")
    public void click_on_delete_button_for_a_user() {
        employeePage.MyOperationsMenu.click();
        employeePage.ManageCostumerButton.click();
        employeePage.deleteauserbtn.click();
    }

    @When("See alert popup of Confirm delete operation and click on delete")
    public void see_alert_popup_of_Confirm_delete_operation_and_click_on_delete() throws InterruptedException {
        Driver.waitForClickablility(employeePage.modalbox, 1);
        boolean isalertshown = employeePage.modalbox.isDisplayed();
        String text = employeePage.modalbox.getText();
        String expectedMessage = "Are you sure you want to delete Customer";
        Assert.assertTrue(expectedMessage.contains(text));
        employeePage.deletebtninmodal.click();
    }
}
