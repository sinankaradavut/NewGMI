package NewGMIBank.pages;

import gmiBank_team22.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class US_006_UserSettingsPage {

    public US_006_UserSettingsPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy (xpath = "//li[@id='account-menu']")
    public WebElement accountMenu;

    @FindBy (xpath = "//*[text()='User Info']")
    public WebElement userInfo;

    @FindBy(xpath = "//h2[@id='settings-title']")
    public WebElement userSettingsTitle;

    @FindBy(xpath = "//input[@name='firstName']")
    public WebElement firstNameTextBox;

    @FindBy(xpath = "//input[@name='lastName']")
    public  WebElement lastNameTextBox;

    @FindBy(xpath = "//input[@name='email']")
    public WebElement emailTextBox;

    @FindBy(id = "langKey")
    public WebElement languagedropdown;

    @FindBy (xpath = "//*[text()='Sign out']")
    public WebElement signOut;

    @FindBy(xpath = "//div[@class='Toastify__toast-body']")
    public WebElement toastifyContainer;

    @FindBy (xpath = "//div[@class='invalid-feedback']")
    public WebElement errorMessage;

    @FindBy (xpath = "//button[@type='submit']")
    public WebElement submitBtn;


    @FindBy(id= "account-menu")
    public WebElement menu;

    @FindBy (xpath = "(//*[text()='Sign in'])[1]")
    public WebElement firstSingIn;

    @FindBy (name= "username")
    public WebElement userName;

    @FindBy (name= "password")
    public WebElement password;

    @FindBy (xpath = "//button[@type='submit']")
    public WebElement secondSignIn;
    //deneme
    //deneme2
    //deneme3

}
