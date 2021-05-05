package NewGMIBank.pages;

import gmiBank_team22.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class US_014_DateCreation_Page {

    public  US_014_DateCreation_Page(){
        PageFactory.initElements(Driver.getDriver(),this);
    }



    @FindBy(xpath = "//span[.='Manage Accounts']")
    public WebElement manageAccountLink;

    @FindBy(xpath = "//span[.='Create a new Account']")
    public WebElement createANewAccountLink;

    @FindBy(id= "tp-account-createDate")
    public WebElement createDateIcon;

    @FindBy(xpath = "//span[.='Create Date']")
    public WebElement createDateBox;

    @FindBy(xpath = "//select[@name='employee.id']")
    public WebElement employeeBox;


    @FindBy(id = "tp-customer-createDate")
    public WebElement createDateBoxCustomer;


    @FindBy(id = "tp-customer-user")
    public WebElement userSelectionBox;


    @FindBy(id = "tp-customer-zelleEnrolled")
    public WebElement zelleCheckBox;

    @FindBy(xpath = "//span[.='Zelle Enrolled']")
    public WebElement zelleEnrolledText;

    @FindBy(id = "save-entity")
    public WebElement saveButton;






}
