package NewGMIBank.pages;

import gmiBank_team22.utilities.ConfigurationReader;
import gmiBank_team22.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class US_003_SecurePasscodePage {

    public US_003_SecurePasscodePage() {
        PageFactory.initElements(Driver.getDriver(), this);

    }

    @FindBy(xpath = "//a[@href='#']")
    private WebElement register;

    @FindBy(xpath = "//a[@href='/account/register']")
    private WebElement getRegister;

    @FindBy(xpath = "//input[@name='firstPassword']")
    private WebElement firstPassword;

   @FindBy(xpath = "//div[@id='strength']/ul/li")
  public WebElement strengthBar;


    public void newPassword(String password){
        firstPassword.sendKeys(password);
    }

    public void registration() {
        Driver.getDriver().get(ConfigurationReader.getProperty("url"));
        register.click();
        getRegister.click();


    }

}
