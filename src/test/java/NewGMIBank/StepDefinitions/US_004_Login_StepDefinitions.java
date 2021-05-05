package NewGMIBank.StepDefinitions;

import gmiBank_team22.pages.US_004_Login_Page;
import gmiBank_team22.utilities.ConfigurationReader;
import gmiBank_team22.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;


public class US_004_Login_StepDefinitions {
    US_004_Login_Page us_004_login_page = new US_004_Login_Page();

    @Given("click user icon")
    public void click_user_icon() {
        Driver.waitForClickablility(us_004_login_page.menu,10).click();
    }

    @Given("click Sign in")
    public void click_Sign_in() {
        us_004_login_page.firstSingIn.click();
    }


    @Then("user sees her name on the new page")
    public void user_sees_her_name_on_the_new_page() {

        String actualName = us_004_login_page.userAssert.getText();
        Assert.assertEquals(ConfigurationReader.getProperty("userNameName"), actualName);
    }


    @Then("employee sees her name on the new page")
    public void employee_sees_her_name_on_the_new_page() {
        String actualName = us_004_login_page.employeeAssert.getText();
        Assert.assertEquals(ConfigurationReader.getProperty("employeeNameName"), actualName);
    }

    @Then("admin sees her name on the new page")
    public void admin_sees_her_name_on_the_new_page() {
        String actualName = us_004_login_page.adminAssert.getText();
        System.out.println(actualName);
        Assert.assertEquals(ConfigurationReader.getProperty("adminNameName"), actualName);
    }

    @Then("manager sees her name on the new page")
    public void manager_sees_her_name_on_the_new_page() {
        String actualName = us_004_login_page.managerAssert.getText();
        Assert.assertEquals(ConfigurationReader.getProperty("managerNameName"), actualName);
    }


    @Then("customer sees her name on the new page")
    public void costumer_sees_her_name_on_the_new_page() {
        String actualName = us_004_login_page.customerAssert.getText();
        Assert.assertEquals(ConfigurationReader.getProperty("customerNameName"), actualName);
    }

    @When("cancel sign in")
    public void cancel_sign_in() {
        us_004_login_page.cancelButton.click();
    }

    @Then("user at home page")
    public void user_at_home_page() {
        Assert.assertNotNull(us_004_login_page.menu);
    }


    @When("user user login")
    public void user_User_login() throws Exception {
        Driver.signIn("user");

    }

    @When("user admin login")
    public void user_Admin_login() throws Exception {
        Driver.signIn("admin");

    }


    @When("user manager login")
    public void user_manager_login() throws Exception {
        Driver.signIn("manager");

    }

    @When("user employee login")
    public void user_employee_login() throws Exception {
        Driver.signIn("employee");

    }

    @When("user customer login")
    public void user_customer_login() throws Exception {
        Driver.signIn("customer");
    }



}

