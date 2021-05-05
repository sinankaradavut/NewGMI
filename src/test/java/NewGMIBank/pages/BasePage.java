package NewGMIBank.pages;

import NewGMIBank.Utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class BasePage {

    public BasePage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//*[@id='account-menu']/a//span")
    public WebElement ApplicantName;

    @FindBy(xpath = "//span[text()='My Operations']")
    public WebElement MyOperaion;

    @FindBy(xpath = "//span[text()='Home']")
    public WebElement HomePage;

    @FindBy(xpath = "//span[text()='Manage Customers']")
    public WebElement ManageCustomers;

    @FindBy(xpath = "//span[text()='Manage Accounts']")
    public WebElement ManageAccounts;

    @FindBy(xpath = "//a[text()='My Accounts']")
    public WebElement MyAccounts;

    @FindBy(xpath = "//a[text()='Transfer Money']")
    public WebElement TransferMoney;

}

