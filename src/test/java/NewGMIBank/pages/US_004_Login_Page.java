package NewGMIBank.pages;


import gmiBank_team22.utilities.ConfigurationReader;
import gmiBank_team22.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class US_004_Login_Page {
    public US_004_Login_Page() {


        PageFactory.initElements(Driver.getDriver(), this);
    }



    @FindBy (id= "account-menu")
    public WebElement menu;

    @FindBy (xpath = "(//*[text()='Sign in'])[1]")
    public WebElement firstSingIn;

    @FindBy (name= "username")
    public WebElement userName;

    @FindBy (name= "password")
    public WebElement password;

    @FindBy (xpath = "//button[@type='submit']")
    public WebElement secondSignIn;

    @FindBy (xpath = "//button[@class='btn btn-secondary']")
    public WebElement cancelButton;

    @FindBy (xpath = "//span[.='sam Cruz']")

    public WebElement userAssert;

    @FindBy (xpath = "//span[.='Cathy Woburn']")
    public WebElement adminAssert;

    @FindBy (xpath = "//span[.='Mike Johnson']")
    public WebElement employeeAssert;

    @FindBy (xpath = "//span[.='Salma Donahue']")
    public WebElement customerAssert;

    @FindBy (xpath = "//span[.='Billy Rose']")
    public WebElement managerAssert;

    public void login(String userName, String password) {
        this.userName.sendKeys(userName);
        this.password.sendKeys(password);
        secondSignIn.click();
    }


}