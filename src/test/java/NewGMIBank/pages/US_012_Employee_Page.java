package NewGMIBank.pages;

import gmiBank_team22.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class US_012_Employee_Page {
    public US_012_Employee_Page() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//*[@id=\"entity-menu\"]/a/span")
    public WebElement MyOperationsMenu;

    @FindBy(xpath = "//*[@id=\"entity-menu\"]/div/a[1]/span")
    public WebElement ManageCostumerButton;

    @FindBy(xpath = "//*[@id=\"app-view-container\"]/div[1]/div/div/div/div[2]/div[1]/div/span")
    public WebElement ShowingItems;

    @FindBy(xpath = "//*[@id=\"app-view-container\"]/div[1]/div/div/div/div[1]/div/table/thead/tr/th")
    public WebElement headerrows;

    @FindBy(xpath = "//*[@id=\"app-view-container\"]/div[1]/div/div/div/div[1]/div/table/tbody/tr[1]/td[10]/div/a[1]/span/span")
    public WebElement viewbutton;

    @FindBy(xpath = "//*[@id=\"app-view-container\"]/div[1]/div/div/div/div[1]/div/table/tbody/tr[1]/td[10]/div/a[3]")
    public WebElement deletebutton;

    @FindBy(xpath = "//*[@id=\"app-view-container\"]/div[1]/div/div/div/div[1]/div/table/tbody/tr[2]/td[10]/div/a[2]")
    public WebElement editbtnofthirduser;

    @FindBy(xpath = "//*[@id=\"tp-customer-mobilePhoneNumber\"]")
    public WebElement mphoneacostumer;

    @FindBy(xpath = "//*[@id=\"tp-customer-email\"]")
    public WebElement emailacostumer;

    @FindBy(xpath = "//*[@id=\"tp-customer-zelleEnrolled\"]")
    public WebElement zellebtn;

    @FindBy(xpath = "//*[@id=\"save-entity\"]/span")
    public WebElement savebtn;

    @FindBy(xpath = "//*[@id=\"root\"]/div/div/div[1]/div/div/div[1]")
    public WebElement tostifwarning;


    @FindBy(xpath = "//*[@id=\"app-view-container\"]/div[1]/div/div/div/div[1]/div/table/tbody/tr[1]/td[10]/div/a[3]")
    public WebElement deleteauserbtn;


    @FindBy(xpath = "//*[@id=\"gmibankfrontendApp.tPCustomer.delete.question\"]")
    ////*[@class="modal-content"]
    public WebElement modalbox;

    @FindBy(xpath = "//*[@id=\"jhi-confirm-delete-tPCustomer\"]")
    public WebElement deletebtninmodal;


    @FindBy(xpath = "//*[@id=\"app-view-container\"]/div[1]/div/div/div/div/a[2]")
    public WebElement editbtninview;
}
