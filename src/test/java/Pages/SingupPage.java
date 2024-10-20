package Pages;

import Bases.PageBase;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

import javax.xml.xpath.XPath;

public class SingupPage extends PageBase {
    public SingupPage(WebDriver driver) {
        super(driver);
    }


     @FindBy(xpath = "//b[normalize-space()='Enter Account Information']")
     private WebElement EnterAccountInformationTitle;

    @FindBy(xpath = "//input[@id='id_gender1']")
    private WebElement MrTitleButton;

    @FindBy(xpath = "//input[@id='name']")
    private WebElement Namefield;

    @FindBy(xpath = "//input[@id='password']")
    private WebElement PasswordField;

    @FindBy(xpath = "//select[@id='days']")
    private WebElement Daylist;

    @FindBy(xpath = "//select[@id='months']")
    private WebElement MonthList;

    @FindBy(xpath = "//select[@id='years']")
    private WebElement YearList;

    @FindBy(xpath = "//input[@id='newsletter']")
    private WebElement checkboxSignUpForOurNewsletterbutton;

    @FindBy(xpath = "//input[@id='optin']")
    private WebElement checkboxReceiveSpecialOffersFromOurPartnersButton;

    @FindBy(xpath = "//input[@id='first_name']")
    private WebElement FirstNameField;

    @FindBy(xpath = "//input[@id='last_name']")
    private WebElement LastNameField;

    @FindBy(xpath = "//input[@id='company']")
    private WebElement CompanyField;

    @FindBy(xpath = "//input[@id='address1']")
    private WebElement AdressField;

    @FindBy(xpath = "//input[@id='address2']")
    private WebElement Adress2Field;

    @FindBy(xpath = "//select[@id='country']")
    private WebElement CountryList;

    @FindBy(xpath ="//input[@id='state']" )
    private WebElement StateField;

    @FindBy(xpath = "//input[@id='city']")
    private WebElement CityField;

    @FindBy(xpath = "//input[@id='zipcode']" )
    private WebElement ZipCodeField;

    @FindBy(xpath = "//input[@id='mobile_number']")
    private WebElement MobileNumberField;

    @FindBy(xpath = "//button[normalize-space()='Create Account']")
    private WebElement CreateAccountButton;






    public SingupPage checkEnterAccountInformationTitle(){
        String title = EnterAccountInformationTitle.getText();
        Assert.assertEquals(title,"ENTER ACCOUNT INFORMATION");
        return new SingupPage(driver);

    }

    public AccountCreatedPage enterTheInformationSingup(){
        MrTitleButton.click();
        Namefield.sendKeys("tester");
        PasswordField.sendKeys("test");
        Daylist.sendKeys("1");
        MonthList.sendKeys("April");
        YearList.sendKeys("2000");
        checkboxSignUpForOurNewsletterbutton.click();
        checkboxReceiveSpecialOffersFromOurPartnersButton.click();

        FirstNameField.sendKeys("Tester");
        LastNameField.sendKeys("Tester");
        CompanyField.sendKeys("Tester");
        AdressField.sendKeys("Tester");
        Adress2Field.sendKeys("Tester");
        CountryList.sendKeys("United States");
        StateField.sendKeys("Tester");
        ZipCodeField.sendKeys("11111");
        MobileNumberField.sendKeys("0000000000");
        CityField.sendKeys("Tester");

        CreateAccountButton.click();
        return new AccountCreatedPage(driver);
    }
}
