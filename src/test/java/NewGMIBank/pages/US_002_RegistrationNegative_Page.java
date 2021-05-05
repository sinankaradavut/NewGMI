package NewGMIBank.pages;

import gmiBank_team22.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

  public class US_002_RegistrationNegative_Page {
    public US_002_RegistrationNegative_Page() {

        PageFactory.initElements(Driver.getDriver(), this);

    }

   @FindBy(xpath = "//a[@aria-haspopup='true']")
    public WebElement userIcon;

    @FindBy(xpath="(//a[@class='dropdown-item'])[2]")
    public WebElement dropdownRegister;

    @FindBy(xpath = "//input[@name='ssn']")
    public WebElement ssnTextbox;

    @FindBy(xpath ="//input[@name='firstname']")
    public WebElement firstNameTextbox;

     @FindBy (xpath = "//input[@name='lastname']")
    public WebElement lastNameTextbox;

     @FindBy(xpath = "//input[@id='address']")
    public WebElement addressTextbox;

     @FindBy(xpath="//input[@name='mobilephone']")
    public  WebElement mobilePhoneNumberTextbox;

     @FindBy(xpath="//input[@name='username']")
    public WebElement usernameTextbox;

     @FindBy(xpath= "//input[@name='email']")
    public WebElement emailTextbox;

     @FindBy(xpath= "//input[@name='firstPassword']")
    public WebElement newPasswordTextbox;

     @FindBy(xpath= "//input[@name='secondPassword']")
    public WebElement passwordConfirmationTextbox;

     @FindBy (xpath = "//button[@id='register-submit']")
    public WebElement registerButton;

     @FindBy(css = "h1#register-title")
     public WebElement registrationPageTitle;

      @FindBy (xpath = "//div[text()='translation-not-found[Your SSN is required]']")
      public WebElement emptySSNTextboxErrorMessage;

      @FindBy (xpath = "//div[text()='Your SSN is invalid']")
      public WebElement invalidSSNErrorMessage;

      @FindBy (xpath = "//div[text()='Your First Name is required']")
      public WebElement emptyFirstNameTextboxErrorMessage;

      @FindBy (xpath = "//div[text()='Your Last Name is required']")
      public WebElement emptyLastNameErrorMessage;

      @FindBy (xpath = "//div[text()='Your mobile phone number is invalid']")
      public WebElement invalidMobilePhoneNumberTextboxErrorMessage;

      @FindBy (xpath = "//div[text()='Your username is required.']")
      public WebElement emptyUsernameErrorMessage;

      @FindBy (xpath = "//div[text()='This field is invalid']")
      public WebElement invalidEmailErrorMessage;

      @FindBy (xpath = "//div[text()='Your email is required.']")
      public WebElement emptyEmailErrorMessage;


      @FindBy (xpath = "//div[text()='Your password is required.']")
      public WebElement emptyPasswordErrorMessage;

      @FindBy (xpath = "//div[text()='Your confirmation password is required.']")
      public WebElement emptyConfirmationPasswordErrorMessage;


      @FindBy (xpath = "//*[text()='translation-not-found[error.ssnexists]']")
      public WebElement failureMessage;

   @FindBy (xpath = "//*[text()='Registration saved! Please check your email for confirmation.']")
   public WebElement registrationSuccessMessage1;

   @FindBy(xpath = "//*[@class = 'Toastify__toast-body']")
   public WebElement registrationSuccessMessage;

  }
