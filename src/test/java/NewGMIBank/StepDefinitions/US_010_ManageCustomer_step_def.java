package NewGMIBank.StepDefinitions;
import com.github.javafaker.Faker;
import gmiBank_team22.pages.US_010_Manage_Customer_Address_Page;
import gmiBank_team22.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class US_010_ManageCustomer_step_def {
    Faker faker = new Faker();
    US_010_Manage_Customer_Address_Page us_010_manage_customer_address_page = new US_010_Manage_Customer_Address_Page();


    @When("click on My Operations")
    public void click_on_My_Operations_button() {
        us_010_manage_customer_address_page.MyOperaion.click();
    }

    @When("click on Manage Customers")
    public void click_on_Manage_Customers() {
        us_010_manage_customer_address_page.ManageCustomers.click();
    }

    @When("click on Create a new Customer")
    public void click_on_Create_a_new_Customer() {
        us_010_manage_customer_address_page.createCustomer.click();
    }

    @When("click on Address field and type the address")
    public void click_on_Address_field_and_type_the_address() throws InterruptedException {
        WebElement address = Driver.waitForClickablility(us_010_manage_customer_address_page.address, 5);
        address.sendKeys(faker.address().fullAddress() + Keys.ENTER);
    }

    @When("click on Address field and type the invalid address")
    public void click_on_Address_field_and_type_the_invalid_address() throws InterruptedException {
        WebElement address = Driver.waitForClickablility(us_010_manage_customer_address_page.address, 5);
        address.sendKeys(faker.name().firstName() + Keys.ENTER);
    }

    @When("click on City field and type the city")
    public void click_on_City_field() throws InterruptedException {
        WebElement city = Driver.waitForClickablility(us_010_manage_customer_address_page.city, 5);
        city.sendKeys(faker.address().city() + Keys.ENTER);
    }

    @When("click on City field and type the city2")
    public void click_on_City_field_2() throws InterruptedException {
        WebElement city = Driver.waitForClickablility(us_010_manage_customer_address_page.city, 5);
        city.sendKeys(faker.number().digit() + Keys.ENTER);
    }

    @When("click on Country field and Select Country from dropdown list")
    public void click_on_Country_field() throws InterruptedException {
        WebElement country = Driver.waitForClickablility(us_010_manage_customer_address_page.country, 5);
//        Select selectCountry = new Select(country);
//        Driver.selectRandomTextFromDropdown(selectCountry);
        Driver.selectRandomTextFromDropdown(new Select(country));
//        selectCountry.selectByVisibleText("FRANCE");

    }

    @When("click on state field and type the state")
    public void click_on_state_field() throws InterruptedException {
        WebElement state = Driver.waitForClickablility(us_010_manage_customer_address_page.state, 5);
        state.sendKeys(faker.address().state() + Keys.ENTER);
//        Thread.sleep(3000);
    }

    @When("click on state field and type the invalid state")
    public void click_on_invalid_state_field() throws InterruptedException {
        WebElement state = Driver.waitForClickablility(us_010_manage_customer_address_page.state, 5);
        state.sendKeys(faker.address().country() + Keys.ENTER);
//        Thread.sleep(3000);
    }

    @When("click on Save")
    public void click_on_Save() throws InterruptedException {
        us_010_manage_customer_address_page.saveBtn.click();
//        Thread.sleep(5000);
    }

    @Given("verify address field's empty message")
    public void verify_address_field_empty_message() throws InterruptedException {
        String actual = Driver.waitForVisibility(us_010_manage_customer_address_page.noAddressText, 5).getText();
        String expected = "This field is required.";
        Assert.assertEquals(expected, actual);
    }

    @Given("verify city field's empty message")
    public void verify_city_field_empty_message() throws InterruptedException {
        String actual = Driver.waitForVisibility(us_010_manage_customer_address_page.noCityText, 5).getText();
        String expected = "This field is required.";
        Assert.assertEquals(expected, actual);
    }

    @Given("verify state field's empty message")
    public void verify_state_field_empty_message() throws InterruptedException {
//        String actual = Driver.waitForVisibility(us_010_manage_customer_address_page.noAddressText, 5).getText();
//        String expected = "This field is required.";
//        Assert.assertEquals(expected, actual);
    }

    @Given("verify country field's empty message")
    public void verify_country_field_empty_message() throws InterruptedException {
//        String actual = Driver.waitForVisibility(us_010_manage_customer_address_page.noAddressText, 5).getText();
//        String expected = "This field is required.";
//        Assert.assertEquals(expected, actual);
    }


}

