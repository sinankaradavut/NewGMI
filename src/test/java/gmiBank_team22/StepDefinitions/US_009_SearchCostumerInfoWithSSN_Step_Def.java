package gmiBank_team22.StepDefinitions;

import gmiBank_team22.pages.US_009_SearchWithSSN_Page;
import gmiBank_team22.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class US_009_SearchCostumerInfoWithSSN_Step_Def {

    US_009_SearchWithSSN_Page us09Page = new US_009_SearchWithSSN_Page();
    WebElement actualElements []={us09Page.firstnameBox,us09Page.lastnameBox,us09Page.emailBox,us09Page.mobilePhonBox,
            us09Page.phoneNumberBox,us09Page.addressBox,us09Page.ssnBox2,us09Page.createDateBox};
    String expectedData="";


    @When("user clicks myOperations link")
    public void user_clicks_myOperations_link() {
        us09Page.myOperationsLink.click();

    }

    @When("user clicks manageCostomers link")
    public void user_clicks_manageCostomers_link() {
        us09Page.manageCostomersLink.click();

    }


    @When("user clicks createNewCustomer link")
    public void user_clicks_createNewCustomer_link() {
        us09Page.createNewCostomersLink.click();

    }

    @Given("admin enter correct SSN {string}")
    public void admin_enter_correct_SSN(String ssn) {
        us09Page.ssnSearchBox1.sendKeys(ssn);

    }

    @Then("click search button")
    public void click_search_button() {
        us09Page.searchButton.click();

    }

    @Then("sees firstname,lastname,email,mobilnumber,phoneNumber,addres ,ssn ,createDate")
    public void sees_firstname_lastname_email_mobilnumber_phoneNumber_addres_ssn_createDate() {

        for (WebElement actualData:actualElements){

            System.out.println(actualData.getAttribute("value"));
            expectedData=actualData.getAttribute("value");

            Assert.assertEquals(actualData.getAttribute("value"),expectedData);

            Assert.assertTrue(actualData.isDisplayed());

        }




    }



    @Then("admin enter {string} same correct SSN  and doesnt  see unfeiled record in registration")
    public void admin_enter_same_correct_SSN_and_doesnt_see_unfeiled_record_in_registration(String ssn) {

        us09Page.ssnSearchBox1.clear();
        us09Page.ssnSearchBox1.sendKeys(ssn);
        us09Page.searchButton.click();

        WebElement unfieldElements []={us09Page.zipBox, us09Page.stateBox, us09Page.countrySelectBox, us09Page.cityBox};

        for (WebElement actualData:unfieldElements){

            System.out.println("EmptyField="+actualData.getAttribute("value"));
            expectedData=actualData.getAttribute("value");

            Assert.assertEquals(actualData.getAttribute("value"),expectedData);


        }

    }


    @Then("admin signOut")
    public void admin_signOut() {

        us09Page.userIconLink.click();
        us09Page.singOutLink.click();


    }


    @Given("admin enter false SNN {string} doesnt  see any info of costumers")
    public void admin_enter_false_SNN_doesnt_see_any_info_of_costumers(String ssn) {

        us09Page.ssnSearchBox1.sendKeys(ssn);
        us09Page.searchButton.click();


        for (WebElement actualData:actualElements){

            System.out.println(actualData.getAttribute("value"));
            expectedData=actualData.getAttribute("value");

            Assert.assertEquals(actualData.getAttribute("value"),expectedData);

            Assert.assertTrue(actualData.isDisplayed());

        }

    }

    @Then("admin enter incorrect SSN {string} and should see alert Error message")
    public void admin_enter_incorrect_SSN_and_should_see_alert_Error_message(String string) {
        us09Page.ssnSearchBox1.clear();
        us09Page.ssnSearchBox1.sendKeys(string);
        us09Page.searchButton.click();
        Driver.wait(2);
        System.out.println(us09Page.alertErrorMessage.getText());
        Assert.assertTrue(us09Page.alertErrorMessage.isDisplayed());

    }


    @Given("admin enters to firstname Box {string}")
    public void admin_enters_to_firstname_Box(String name) {

        us09Page.firstnameBox.sendKeys(name);
        us09Page.searchButton.click();



    }


    @Then("admin  doesnt see any of info of costumer")
    public void admin_doesnt_see_any_of_info_of_costumer() {

        for (WebElement actualData:actualElements){

            System.out.println(actualData.getAttribute("value"));
            expectedData=actualData.getAttribute("value");

            Assert.assertEquals(actualData.getAttribute("value"),expectedData);

            Assert.assertTrue(actualData.isDisplayed());


        }

        System.out.println(us09Page.alertErrorMessage.getText());
        Assert.assertTrue(us09Page.alertErrorMessage.isDisplayed());

    }

    @Given("admin selects from user Box a data")
    public void admin_selects_from_user_Box_a_data() {


        Driver.selectByIndex(us09Page.userSelectBox,1);

        WebElement verifyElements []={us09Page.lastnameBox,us09Page.emailBox,us09Page.mobilePhonBox,us09Page.phoneNumberBox, us09Page.ssnBox2};

        for (WebElement verifyEach:verifyElements){

            System.out.println(verifyEach.getAttribute("value"));

            expectedData=verifyEach.getAttribute("value");
            Assert.assertTrue(expectedData.isEmpty());

        }




    }

    @Then("admin can select all username")
    public void admin_can_select_all_username() {

        Select select=new Select(us09Page.userSelectBox);
        List<WebElement > allName=select.getOptions();

        for (WebElement w:allName){

            System.out.println(w.getText());
            w.click();
            Assert.assertTrue(w.isDisplayed());

        }

        System.out.println(select.getOptions().size());


    }

    @Then("admin  wont be see any data of costumer")
    public void admin_wont_be_see_any_data_of_costumer() {


        Driver.selectByIndex(us09Page.userSelectBox,5);


        for (WebElement w:actualElements){

            System.out.println(w.getAttribute("value"));

            expectedData=w.getAttribute("value");
            Assert.assertEquals(w.getAttribute("value"),expectedData);

        }


    }

    @Given("admin enter correct ssn data {string}")
    public void admin_enter_correct_ssn_data(String ssn) {
        us09Page.ssnSearchBox1.sendKeys(ssn);
        us09Page.searchButton.click();

    }

    @Then("admin fill miss box of data")
    public void admin_fill_miss_box_of_data() {

        us09Page.middleNameBox.sendKeys("A");
        us09Page.phoneNumberBox.sendKeys("651-221-1339");
        us09Page.zipBox.sendKeys("45670");
        us09Page.cityBox.sendKeys("sanford");
        Driver.selectByIndex(us09Page.countrySelectBox,5);
        us09Page.stateBox.sendKeys("FL");
        Driver.selectByIndex(us09Page.accountSelectBox,1);


    }

    @Then("admin click save")
    public void admin_click_save() {
        us09Page.saveButton.click();
        Assert.assertTrue(us09Page.alertSuccessMessage.isDisplayed());
        System.out.println("success create account = " + us09Page.alertSuccessMessage.getText());


    }

}
