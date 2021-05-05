package gmiBank_team22.StepDefinitions;

import com.github.javafaker.Faker;
import gmiBank_team22.pages.US_011_DatePage;
import gmiBank_team22.utilities.ConfigurationReader;
import gmiBank_team22.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.text.SimpleDateFormat;

public class US_011_DateStep_Def {

   WebDriverWait wait = new WebDriverWait(Driver.getDriver(), 15);
    Faker fake = new Faker();
    US_011_DatePage dateobject = new US_011_DatePage();

    @Given("go to web page")
    public void goToWebPage() {
        Driver.getDriver().get(ConfigurationReader.getProperty("url"));
    }

    @And("click DropDownMenu")
    public void clickDropDownMenu() throws InterruptedException {

        Driver.waitForVisibility(dateobject.menuDropdown, 15).click();



    }

    @And("click first signin")
    public void clickFirstSignin() throws InterruptedException {
    Driver.waitForVisibility(   dateobject.firstSingIn, 15).click();


    }

    @And("click enter username")
    public void clickEnterUsername() throws InterruptedException {

        Driver.waitForVisibility(dateobject.userName, 15);
        dateobject.userName.sendKeys(ConfigurationReader.getProperty("managerUserName"));

    }

    @And("click enter password")
    public void clickEnterPassword() throws InterruptedException {
        Driver.waitForVisibility(dateobject.password, 15);
        dateobject.password.sendKeys(ConfigurationReader.getProperty("managerPassword"));



    }

    @And("click secondsignin")
    public void clickSecondsignin() throws InterruptedException {
        Driver.waitForVisibility(dateobject.secondSignIn, 15).click();



    }

    @And("click MyOperation Dropdown")
    public void clickMyOperationDropdown() throws InterruptedException {
        Driver.waitForVisibility(dateobject.clickMyoperation, 15).click();



    }

    @And("click manage customer")
    public void clickManageCustomer() throws InterruptedException {
        Driver.waitForVisibility(dateobject.clickmangeCustomers, 15).click();



    }

    @And("click creat new customer")
    public void clickCreatNewCustomer() throws InterruptedException {
        Driver.waitForVisibility(dateobject.clickCreateCustomer, 15).click();



    }

    @And("enter firstname")
    public void enterFirstname() throws InterruptedException {
        Driver.waitForVisibility(dateobject.enterFirstname, 15);

        dateobject.enterFirstname.sendKeys(fake.name().firstName() + "" + Keys.ENTER);

    }

    @And("enter lastname")
    public void enterLastname() throws InterruptedException {
        Driver.waitForVisibility(dateobject.enterlastName, 15);
        dateobject.enterlastName.sendKeys(fake.name().lastName() + "" + Keys.ENTER);
    }

    @And("enter middlename")
    public void enterMiddlename() throws InterruptedException {
        Driver.waitForVisibility(dateobject.enterMiddlename, 15);
        dateobject.enterMiddlename.sendKeys(fake.name().nameWithMiddle() + "" + Keys.ENTER);


    }

    @And("enter email")
    public void enterEmail() throws InterruptedException {
        Driver.waitForVisibility(dateobject.enterEmail, 15);
        dateobject.enterEmail.sendKeys(fake.name() + "@gmail.com" + Keys.ENTER);


    }

    @And("enter mobilephone number")
    public void enterMobilephoneNumber() throws InterruptedException {
        Driver.waitForVisibility(dateobject.enterMobileNumber, 15);
        dateobject.enterMobileNumber.sendKeys(fake.number().numberBetween(100, 999) + "-" +
                fake.number().numberBetween(100, 999) + "-" + fake.number().numberBetween(1000, 9999) + Keys.ENTER);


    }

    @And("enter phone number")
    public void enterPhoneNumber() throws InterruptedException {
        Driver.waitForVisibility(dateobject.enterPhoneNumber, 15);
        dateobject.enterPhoneNumber.sendKeys(fake.number().numberBetween(100, 999) + "-" + fake.number().numberBetween(100, 999) + "-" + fake.number().numberBetween(1000, 9999) + Keys.ENTER);


    }

    @And("zip Code")
    public void zipCode() throws InterruptedException {
        Driver.waitForVisibility(dateobject.enterZipCode, 15);
        dateobject.enterZipCode.sendKeys("67321" + Keys.ENTER);


    }

    @And("enter Address")
    public void enterAddress() throws InterruptedException {
        Driver.waitForVisibility(dateobject.enterAddress, 15);
        dateobject.enterAddress.sendKeys("I live in St louis MO" + Keys.ENTER);


    }

    @And("enter City")
    public void enterCity() throws InterruptedException {
        Driver.waitForVisibility(dateobject.enterCity, 15);
        dateobject.enterCity.sendKeys("St Louis" + Keys.ENTER);



    }

    @And("enter Ssn number")
    public void enterSsnNumber() throws InterruptedException {
        Driver.waitForVisibility(dateobject.enterSsnNumber, 15);
        dateobject.enterSsnNumber.sendKeys(fake.number().numberBetween(100, 999) + "-" +
                fake.number().numberBetween(10, 99) + "-" + fake.number().numberBetween(1000, 9999));


    }

    @Given("user select previous day")
    public void userSelectPreviousDay() throws InterruptedException {
        Driver.waitForVisibility(dateobject.datebox, 15).click();

        dateobject.datebox.sendKeys("01/01/2010");




    }

    @And("user click save")
    public void userClickSave() throws InterruptedException {
      Driver.waitForVisibility(  dateobject.savebutton, 15).click();



    }

    @Then("Verify system should give error message")
    public void verifySystemShouldGiveErrorMessage() throws InterruptedException {
        Driver.verifyElementDisplayed(By.xpath("//*[@id=\"tp-customer-heading\"]/span")) ;





    }

    @Given("user should select  current date")
    public void userShouldSelectCurrentDate() throws InterruptedException {
        SimpleDateFormat currentDate = new SimpleDateFormat("yyyy/MM-dd'T'HH:mm");
        Driver.waitForVisibility(dateobject.datebox, 15).click();

        dateobject.datebox.sendKeys(currentDate+"");




    }

    @Then("verify account is created with current date")
    public void verifyAccountIsCreatedWithCurrentDate() {
        Driver.waitForVisibility(dateobject.accountConfirmation, 15);
        Assert.assertTrue( dateobject.accountConfirmation.isDisplayed());
    }

    @Given("user leave userTextBox blank")
    public void userLeaveUserTextBoxBlank() throws InterruptedException {
        Driver.waitForVisibility(dateobject.userBox, 15).click();


    }

    @Then("verify account is not created with blank userTextBox")
    public void verifyAccountIsNotCreatedWithBlankUserTextBox() throws InterruptedException {
        Driver.waitForVisibility(dateobject.accountConfirmation, 15);
        String actual = dateobject.accountConfirmation.getText();
        String expected = "Internal server error.";
        Assert.assertFalse("There is Bug", actual.contentEquals(expected));

    }

    @Then("verify account is created with blank usertextbox")
    public void verifyAccountIsCreatedWithBlankUsertextbox() throws InterruptedException {
      Driver.waitForVisibility(dateobject.accountConfirmation, 15);
        Assert.assertTrue(dateobject.accountConfirmation.isDisplayed());
    }

    @Then("user select account from registration")
    public void userSelectAccountFromRegistration() {
        Driver.waitForVisibility(dateobject.selectAccount, 15);
        dateobject.selectAccount.isSelected();
    }

    @Then("verify account is created with selected account")
    public void verifyAccountIsCreatedWithSelectedAccount() throws InterruptedException {
        Driver.waitForVisibility(dateobject.accountConfirmation, 15);
        Assert.assertTrue(dateobject.accountConfirmation.isDisplayed());

    }

    @And("user select Zelle checkbox")
    public void userSelectZelleCheckbox() throws InterruptedException {
        Driver.waitForVisibility(dateobject.zelleCheckBox, 15).click();


    }

    @Then("verify account is created with  Zelle Selection")
    public void verifyAccountIsCreatedWithZelleSelection() throws InterruptedException {
        Driver.verifyElementDisplayed(By.xpath("//*[@id=\"tp-customer-heading\"]/span"));



    }

    @And("user does not select Zelle checkbox")
    public void userDoesNotSelectZelleCheckbox() throws InterruptedException {
        Driver.waitForVisibility(dateobject.zelleCheckBox, 15).click();


    }

    @Then("verify account is created with not selecting Zelle checkbox")
    public void verifyAccountIsCreatedWithNotSelectingZelleCheckbox() throws InterruptedException {
        Driver.waitForVisibility(dateobject.accountConfirmation, 15);
        Assert.assertTrue(dateobject.accountConfirmation.isDisplayed());

    }
}

