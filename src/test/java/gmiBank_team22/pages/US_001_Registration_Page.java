package gmiBank_team22.pages;

import gmiBank_team22.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class US_001_Registration_Page {
    public  US_001_Registration_Page()  { PageFactory.initElements(Driver.getDriver(), this); }

    @FindBy(linkText = "Register")
    public WebElement register;

    @FindBy(id="ssn")
    public WebElement ssn;

    @FindBy(xpath = "//input[@name='firstname']")
    public WebElement firstname;

    @FindBy(xpath = "//input[@name='lastname']")
    public WebElement lastname;

    @FindBy(id="address")
    public WebElement address;

    @FindBy(id="mobilephone")
    public WebElement mobilephone;

    @FindBy(xpath = "//input[@name='username']")
    public WebElement username;

    @FindBy(id="email")
    public WebElement email;

    @FindBy(id="firstPassword")
    public WebElement password;

    @FindBy(id="secondPassword")
    public WebElement confirmPassword;

    @FindBy(id="register-submit")
    public WebElement registerButton;

    @FindBy(xpath = "//div[@role='alert']")
    public WebElement verifyMessage;

}
