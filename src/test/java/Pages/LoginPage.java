package Pages;

import Bases.PageBase;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

public class LoginPage extends PageBase {
    public LoginPage(WebDriver driver) {
        super(driver);
    }
    @FindBy(xpath = "//input[@placeholder='Name']")
    private WebElement NameField;

    @FindBy(xpath = "//input[@data-qa='signup-email']")
    private WebElement EmailField;

    @FindBy(xpath = "//button[normalize-space()='Signup']")
    private WebElement SingupButton;



    @FindBy(xpath = "//h2[normalize-space()='New User Signup!']")
    private WebElement NewUserSingupTitle;


    @FindBy(xpath = "//h2[normalize-space()='Login to your account']")
    private WebElement LoginToYourAccountTitle;


    @FindBy(xpath = "//input[@data-qa='login-email']")
    private WebElement EmailFieldLogin;

    @FindBy(xpath = "//input[@placeholder='Password']")
    private WebElement PasswordFieldLogin;

    @FindBy(xpath = "//button[normalize-space()='Login']")
    private WebElement LoginButton;

    @FindBy(xpath = "//p[normalize-space()='Your email or password is incorrect!']")
    private WebElement ErrorIncorrectEmailOrPassword;

    @FindBy(xpath = "//p[normalize-space()='Email Address already exist!']")
    private WebElement ErrorEmailAddressAlreadyExistText;





    public LoginPage checkVisiblityNewUSerSingUP(){
        String Title =NewUserSingupTitle.getText();
        Assert.assertEquals(Title,"New User Signup!");
        return new LoginPage(driver);
    }
    public SingupPage enterNameAndEmail(){
        NameField.sendKeys("Tester");
        EmailField.sendKeys("alt.y3-9o1vmumt@yopmail.com");
        SingupButton.click();
        return new SingupPage(driver);


    }
    public LoginPage checkLoginToYourAccountTitle(){
        String text = LoginToYourAccountTitle.getText();
        Assert.assertEquals(text,"Login to your account");
        return new LoginPage(driver);
    }
 public HomeWebPage loginToYourAccount(){
        EmailFieldLogin.sendKeys("alt.y3-9o1vmumt@yopmail.com");
        PasswordFieldLogin.sendKeys("test");
        LoginButton.click();
        return new HomeWebPage(driver);
 }

 public LoginPage loginWithIncorrectEmailAndPassword(){
        EmailFieldLogin.sendKeys("gfdsgs@hotmail.com");
        PasswordFieldLogin.sendKeys("shfghfgdghs");
        LoginButton.click();
        return new LoginPage(driver);
 }
 public LoginPage checkErrorIncorrectEmailOrPassword(){
        String TextError =ErrorIncorrectEmailOrPassword.getText();
        Assert.assertEquals(TextError,"Your email or password is incorrect!");
        return new LoginPage(driver);
 }
    public LoginPage checkUserNavigatedToLoginPage(){
        String Title =NewUserSingupTitle.getText();
        Assert.assertEquals(Title,"New User Signup!");
        String text = LoginToYourAccountTitle.getText();
        Assert.assertEquals(text,"Login to your account");
        return new LoginPage(driver);
    }
    public LoginPage enterNameAndEmailForExistEmail() {
        NameField.sendKeys("Tester");
        EmailField.sendKeys("alt.y3-9o1vmumt@yopmail.com");
        SingupButton.click();
        return new LoginPage(driver);}

        public LoginPage checkError_EmailAddressAlreadyExist () {
            String text = ErrorEmailAddressAlreadyExistText.getText();
            Assert.assertEquals(text, "Email Address already exist!");
            return new LoginPage(driver);
        }





}
