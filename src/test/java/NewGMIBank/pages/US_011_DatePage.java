package NewGMIBank.pages;

import gmiBank_team22.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class US_011_DatePage {
    public US_011_DatePage() {


        PageFactory.initElements(Driver.getDriver(), this);

    }
    @FindBy(xpath = "//span[.='My Operations']")
    public WebElement clickMyoperation;


   @FindBy(xpath = "//span[.='Manage Customers']")
    public WebElement clickmangeCustomers;

   @FindBy(xpath = "//span[.='Create a new Customer']")
   public WebElement clickCreateCustomer;

   @FindBy(xpath = "//input[@id='tp-customer-createDate']")
    public WebElement datebox;

    @FindBy(id="tp-customer-user")
    public WebElement userBox;


    @FindBy (id ="tp-customer-account")
    public WebElement accountBox ;

    @FindBy(xpath = "//body/div[@id='root']/div[1]/div[1]/div[3]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/form[1]/div[16]/select[1]/option[2]")
    public WebElement selectAccount;

    @FindBy(id="tp-customer-zelleEnrolled")
    public WebElement zelleCheckBox;

    @FindBy (xpath = "(//*[text()='Sign in'])[1]")
    public WebElement firstSingIn;

    @FindBy (name= "username")
    public WebElement userName;

    @FindBy (name= "password")
    public WebElement password;

    @FindBy (xpath = "//button[@type='submit']")
    public WebElement secondSignIn;

    @FindBy (id= "account-menu")
    public WebElement menuDropdown;

    @FindBy(xpath = "//span[.='Save']")
    public WebElement savebutton;

    @FindBy(id="tp-customer-firstName")
    public WebElement enterFirstname;

    @FindBy(id = "tp-customer-lastName")
    public WebElement enterlastName;

    @FindBy(id = "tp-customer-middleInitial")
    public WebElement enterMiddlename;

    @FindBy(id = "tp-customer-email")
    public WebElement enterEmail;

    @FindBy(xpath = "//input[@name='mobilePhoneNumber']")
    public WebElement enterMobileNumber;

    @FindBy(xpath = "//div//input[@name='phoneNumber']")
    public WebElement enterPhoneNumber;

    @FindBy(xpath = "//div//input[@name='zipCode']")
    public WebElement enterZipCode;

    @FindBy(xpath = "//div//input[@name='address']")
    public WebElement enterAddress;

    @FindBy(xpath = "//div//input[@name='city']")
    public WebElement enterCity;

    @FindBy(xpath = "//div//input[@name='ssn']")
    public WebElement enterSsnNumber;

    @FindBy(xpath = "//*[@id=\"tp-customer-heading\"]/span")
    public WebElement accountConfirmation;







}
