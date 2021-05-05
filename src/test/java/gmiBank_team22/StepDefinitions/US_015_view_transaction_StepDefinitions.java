package gmiBank_team22.StepDefinitions;

import gmiBank_team22.pages.BasePage;
import gmiBank_team22.pages.US_015_view_transaction_Page;
import gmiBank_team22.utilities.Driver;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


public class US_015_view_transaction_StepDefinitions {

    US_015_view_transaction_Page us_015_view_transaction_page = new US_015_view_transaction_Page();
    BasePage basePage = new BasePage();


    @When("click my operations")
    public void click_my_operations() {
        basePage.MyOperaion.click();
    }

    @When("click my accounts")
    public void click_my_accounts() {
        basePage.MyAccounts.click();
    }

    @Then("should be able to see balance")
    public void should_be_able_to_see_balance() {
        Driver.verifyElementDisplayed(us_015_view_transaction_page.accountBalance);
    }

    @Then("should be able to see account type")
    public void should_be_able_to_see_account_type() {
        Driver.verifyElementDisplayed(us_015_view_transaction_page.accountType);
    }

    @Then("see transactions")
    public void see_transactions() {
        us_015_view_transaction_page.viewTransaction.click();
        Driver.verifyElementDisplayed(us_015_view_transaction_page.transactionId);
    }
}
