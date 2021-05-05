package NewGMIBank.pages;

import gmiBank_team22.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class US_009_SearchWithSSN_Page {

    public US_009_SearchWithSSN_Page(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "//span[text()='My Operations']")
    public WebElement myOperationsLink;

    @FindBy(xpath = "//span[text()='Manage Customers']")
    public WebElement manageCostomersLink;
    @FindBy(xpath = "//span[text()='Create a new Customer']")
    public WebElement createNewCostomersLink;
    @FindBy(xpath = "//input[@id='search-ssn']")
    public  WebElement ssnSearchBox1;

    @FindBy(xpath = "//button[@class='btn btn-secondary']")
    public WebElement searchButton;

    @FindBy(xpath = "//div[@class='Toastify__toast-body']")
    public WebElement alertErrorMessage;

    @FindBy(xpath = "//div[@class='Toastify__toast-body']")
    public WebElement alertSuccessMessage;

    @FindBy(linkText = "Mike Johnson")
    public WebElement userIconLink;

    @FindBy(linkText = "Sign out")
    public WebElement singOutLink;

    @FindBy(xpath = "//input[@id='tp-customer-firstName']")
    public WebElement firstnameBox;

    @FindBy(xpath = "//input[@name='middleInitial']")
    public  WebElement middleNameBox;

    @FindBy(xpath = "//input[@id='tp-customer-lastName']")
    public WebElement lastnameBox;

    @FindBy(xpath = "//input[@id='tp-customer-email']")
    public WebElement emailBox;

    @FindBy(xpath = "//input[@id='tp-customer-mobilePhoneNumber']")
    public WebElement mobilePhonBox;

    @FindBy(xpath = "//input[@id='tp-customer-phoneNumber']")
    public WebElement phoneNumberBox;

    @FindBy(xpath = "//input[@id='tp-customer-zipCode']")
    public  WebElement zipBox;

    @FindBy(xpath = "//input[@id='tp-customer-address']")
    public  WebElement addressBox;

    @FindBy(xpath = "//input[@id='tp-customer-city']")
    public WebElement cityBox;

    @FindBy(xpath = "//input[@id='tp-customer-ssn']")
    public WebElement ssnBox2;

    @FindBy(xpath = "//input[@id='tp-customer-createDate']")
    public WebElement createDateBox;

    @FindBy(xpath = "//select[@id='tp-customer-user']")
    public WebElement userSelectBox;

    @FindBy(xpath = "//select[@id='tp-customer-country']")
    public WebElement countrySelectBox;

    @FindBy(xpath = "//input[@id='tp-customer-state']")
    public WebElement stateBox;

    @FindBy(xpath = "//select[@id='tp-customer-account']")
    public WebElement accountSelectBox;

    @FindBy(xpath = "//button[@id='save-entity']")
    public  WebElement saveButton;
}
