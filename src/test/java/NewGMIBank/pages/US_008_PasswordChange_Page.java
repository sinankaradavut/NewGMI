package NewGMIBank.pages;

import gmiBank_team22.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class US_008_PasswordChange_Page {
    public US_008_PasswordChange_Page() {
        PageFactory.initElements(Driver.getDriver(), this);
    }


    @FindBy(xpath = "(//*[text()='Password'])")
    public WebElement passwordButton;

    @FindBy (id= "currentPassword")
    public WebElement currentPassword;

    @FindBy(id = "newPassword")
    public WebElement newPassword;

    @FindBy(id = "confirmPassword")
    public WebElement confirmPassword;

    @FindBy(xpath = "//span[.='Save']")
    public WebElement save;

    @FindBy(xpath = "//span[.='Sign out']")
    public WebElement signOut;

    @FindBy(xpath = "//strong[.='Failed to sign in!']")
    public WebElement failedToSign;

    @FindBy(xpath = "(//ul[@id='strengthBar']/li[@class='point'])[1]")
    public WebElement barLevel1;

    @FindBy(xpath = "(//ul[@id='strengthBar']/li[@class='point'])[2]")
    public WebElement barLevel2;

    @FindBy(xpath = "(//ul[@id='strengthBar']/li[@class='point'])[3]")
    public WebElement barLevel3;

    @FindBy(xpath = "(//ul[@id='strengthBar']/li[@class='point'])[4]")
    public WebElement barLevel4;

    @FindBy(xpath = "(//ul[@id='strengthBar']/li[@class='point'])[5]")
    public WebElement barLevel5;

    @FindBy(xpath = "(//ul[@id='strengthBar']/li[@class='point'])[i]")
    public WebElement barLevel;

    @FindBy(xpath = "//*[text()='Password changed!']")
    public WebElement passwordChangedMessage;


}
