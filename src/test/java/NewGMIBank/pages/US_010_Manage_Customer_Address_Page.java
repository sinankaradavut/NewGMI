package NewGMIBank.pages;

import gmiBank_team22.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class US_010_Manage_Customer_Address_Page extends BasePage {
    public US_010_Manage_Customer_Address_Page() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(id = "jh-create-entity")
    public WebElement createCustomer;

    @FindBy(id = "tp-customer-address")
    public WebElement address;

    @FindBy(id = "tp-customer-city")
    public WebElement city;

    @FindBy(id = "tp-customer-state")
    public WebElement state;

    @FindBy(id = "tp-customer-country")
    public WebElement country;

    @FindBy(xpath = "//input[@id='tp-customer-address']/following-sibling::div[text()='This field is required.']")
    public WebElement noAddressText;

    @FindBy(xpath = "//input[@id='tp-customer-city']/following-sibling::div[text()='This field is required.']")
    public WebElement noCityText;

    @FindBy(id = "save-entity")
    public WebElement saveBtn;

    @FindBy(id = "cancel-save")
    public WebElement backBtn;
}
