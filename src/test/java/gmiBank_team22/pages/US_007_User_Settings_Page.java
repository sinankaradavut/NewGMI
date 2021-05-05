package gmiBank_team22.pages;

import gmiBank_team22.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class US_007_User_Settings_Page {

    public US_007_User_Settings_Page(){
        PageFactory.initElements(Driver.getDriver(),this);
    }


    @FindBy (xpath = "//li[@id='account-menu']")
    public WebElement accountMenu;

    @FindBy (xpath = "(//*[text()='Sign in'])[1]")
    public WebElement firstSingIn;

    @FindBy (name= "username")
    public WebElement userName;

    @FindBy (name= "password")
    public WebElement password;

    @FindBy (xpath = "//button[@type='submit']")
    public WebElement signInButton;

    @FindBy (id= "account-menu")
    public WebElement userMenu;

    @FindBy (linkText = "User Info")
    public WebElement userInfo;

    @FindBy (id= "email")
    public WebElement emailTextBox;

    @FindBy (xpath= "//button[@type='submit']")
    public WebElement saveButton;

    @FindBy(id = "langKey")
    public WebElement languageDropdown;

    @FindBy(xpath = "//div[@class='invalid-feedback']")
    public WebElement invalidMessage;

    @FindBy(xpath = "//div[@class='Toastify__toast-body']")
    public WebElement toastifyContainer;


}
