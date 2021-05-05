package gmiBank_team22.StepDefinitions;

import gmiBank_team22.pages.US_016_MoneyTransferPage;
import gmiBank_team22.utilities.Driver;
import io.cucumber.java.en.When;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class US_016_MoneyTransfer_StepDefinitions {
    US_016_MoneyTransferPage us_016_moneyTransferPage = new US_016_MoneyTransferPage();

    @When("click transfer page")
    public void click_transfer_page() throws InterruptedException {
    us_016_moneyTransferPage.TransferMoney.click();
    Thread.sleep(3000);
    }

    @When("choose the sending account")
    public void choose_the_sending_account() throws InterruptedException {
//        us_016_moneyTransferPage.fromAccount.click();
        WebElement fromAccount = us_016_moneyTransferPage.fromAccount;
//        Select selectAccount =new Select(fromAccount);
//        how to add wait for clickability
        Driver.selectByIndex(fromAccount,1);
//        selectAccount.selectByIndex(2);
        Thread.sleep(3000);
    }
    @When("choose the receiver account")
    public void choose_the_receiver_account() throws InterruptedException {
        WebElement toAccount = us_016_moneyTransferPage.toAccount;
//        Driver.selectByIndex(toAccount,1);
        Select selectAccount =new Select(toAccount);
        selectAccount.selectByIndex(1);
        Thread.sleep(3000);
    }

    @When("type the balance and cent")
    public void type_the_balance_and_cent() throws InterruptedException {
        int balance = 5;
        us_016_moneyTransferPage.balance.sendKeys("5");
        us_016_moneyTransferPage.balanceCent.sendKeys(Keys.BACK_SPACE,"3");
//        us_016_moneyTransferPage.balanceCent.sendKeys("3");
        Thread.sleep(3000);
    }

    @When("type description")
    public void type_description() throws InterruptedException {
        us_016_moneyTransferPage.description.sendKeys("For December Rent");
        Thread.sleep(3000);
    }

    @When("click make transfer button")
    public void click_make_transfer_button() throws InterruptedException {
        us_016_moneyTransferPage.makeTransfer.click();
        Thread.sleep(3000);
    }
}
