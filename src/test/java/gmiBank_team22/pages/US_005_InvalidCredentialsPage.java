package gmiBank_team22.pages;

import gmiBank_team22.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class US_005_InvalidCredentialsPage {

    public US_005_InvalidCredentialsPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "//a[@aria-haspopup='true']")
    public WebElement logInDropdownMenu;

    @FindBy(xpath = "(//span[.='Sign in'])[1]")
    public WebElement signInButton;

    @FindBy(name = "username")
    public WebElement userName;

    @FindBy(name = "password")
    public WebElement passWord;

    @FindBy(xpath = "(//span[.='Sign in'])[3]")
    public WebElement signIn;

    @FindBy(xpath = "//strong[.='Failed to sign in!']")
    public WebElement failedMessage;

    @FindBy(xpath = "//span[.='Did you forget your password?']")
    public WebElement didYouForget;

    @FindBy(name = "email")
    public WebElement email;

    @FindBy(xpath = "//span[.='Reset your password']")
    public WebElement resetPassWord;

    @FindBy(xpath = "//span[.='Register a new account']/..")
    public WebElement registerAccount;

    @FindBy(xpath = "//span[.='Registration']/..")
    public WebElement registerValidation;






}
