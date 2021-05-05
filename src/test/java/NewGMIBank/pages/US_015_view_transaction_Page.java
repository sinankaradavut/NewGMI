package NewGMIBank.pages;

import gmiBank_team22.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class US_015_view_transaction_Page {
    public US_015_view_transaction_Page() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//th[1]")
    public WebElement accountType;

    @FindBy(xpath = "//th[2]")
    public WebElement accountBalance;

    @FindBy(xpath = "//td[4]")
    public WebElement viewTransaction;

    @FindBy(xpath = "(//td[1])[2]")
    public WebElement transactionId;


}
