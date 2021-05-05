package NewGMIBank.pages;

import gmiBank_team22.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class US_016_MoneyTransferPage extends BasePage {

    public US_016_MoneyTransferPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(id = "fromAccountId")
    public WebElement fromAccount;

    @FindBy(id = "toAccountId")
    public WebElement toAccount;

    @FindBy(id = "balance")
    public WebElement balance;

    @FindBy(id = "balancecent")
    public WebElement balanceCent;

    @FindBy(id = "description")
    public WebElement description;

    @FindBy(id = "make-transfer")
    public WebElement makeTransfer;


}