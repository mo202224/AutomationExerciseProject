package Pages;

import Bases.PageBase;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

public class HomeWebPage extends PageBase {
    public HomeWebPage(WebDriver driver) {
        super(driver);
    }
  @FindBy(xpath = "//h2[normalize-space()='Features Items']")
  private WebElement HomeTitle;

    @FindBy(xpath = "//a[normalize-space()='Signup / Login']")
    private WebElement SingupButton;

    @FindBy(xpath = "//b[normalize-space()='Testertester']")
    private WebElement  TextLoggedInAsUsernameText;

    @FindBy(xpath = "//a[normalize-space()='Delete Account']")
    private WebElement DeleteAccountButton;

    @FindBy(xpath = "//a[normalize-space()='Logout']")
    private WebElement LogoutButton;

    @FindBy(xpath = "//a[normalize-space()='Contact us']")
    private WebElement ContactUsBtton;

    @FindBy(xpath = "//a[normalize-space()='Test Cases']")
    private WebElement TestCasesButton;

    @FindBy(xpath = "//a[@href='/products']")
    private WebElement ProductsButton;

    @FindBy(xpath = "//h2[normalize-space()='Subscription']")
    private WebElement SubscriptionText;

    @FindBy(xpath = "//input[@id='susbscribe_email']")
    private WebElement SubscriptionFieldEmail;

    @FindBy(xpath = "//button[@id='subscribe']")
    private WebElement SubscriptionButton;

    @FindBy(xpath = "//h2[normalize-space()='Subscription']")
    private WebElement SuccessMessageSubscription;

    @FindBy(xpath = "/html[1]/body[1]/header[1]/div[1]/div[1]/div[1]/div[2]/div[1]/ul[1]/li[3]/a[1]")
    private WebElement CartButton;


    @FindBy(xpath = "//a[normalize-space()='Women']")
    private WebElement WomenCategory;

    @FindBy(css = "a[href='/category_products/1']")
    private WebElement DressWomenCategory;

    @FindBy(xpath = "//h2[normalize-space()='recommended items']")
    private WebElement RecommendedItems;

    @FindBy(xpath = "//div[@class='item active']//div[1]//div[1]//div[1]//div[1]//a[1]")
    private WebElement AddToCartRecommendedButton;

    @FindBy(css = "body > section:nth-child(3) > div:nth-child(1) > div:nth-child(1) > div:nth-child(2) > div:nth-child(1) > div:nth-child(2) > div:nth-child(1) > div:nth-child(1) > div:nth-child(2) > p:nth-child(2) > a:nth-child(1) > u:nth-child(1)")
    private WebElement ViewCartRecommendedButton;

    @FindBy(css = ".btn.btn-success.close-modal.btn-block")
    private WebElement ContinueButton;

    @FindBy(css = ".fa.fa-angle-up")
    private WebElement ArrowButton;

    @FindBy(css = "div[class='item active'] div[class='col-sm-6'] h2")
    private WebElement FullFledgedTitle;

    @FindBy(xpath = "//h2[normalize-space()='Subscription']")
    private WebElement SubscriptionTitle;





   public HomeWebPage checkVisiblityHomePage(){
    HomeTitle.isDisplayed();
    return new HomeWebPage(driver);
    }

   public LoginPage clickOnSingup(){
        SingupButton.click();
        return new LoginPage(driver);
    }
  public HomeWebPage checkLoggedInAsUsernameText(){
       String text =TextLoggedInAsUsernameText.getText();
       TextLoggedInAsUsernameText.isDisplayed();
      Assert.assertEquals(text,"Testertester");
     return new HomeWebPage(driver);
  }
  public DeleteAccountPage clickDeleteAccount(){
       DeleteAccountButton.click();
       return new DeleteAccountPage(driver);
  }
  public LoginPage clickLogout(){
       LogoutButton.click();
       return new LoginPage(driver);
  }
    public ContactUsPage clickContactUsbutton(){
        ContactUsBtton.click();
        return new ContactUsPage(driver);
    }

    public TestCasesPage clickTestCasesButton(){
       TestCasesButton.click();
       return new TestCasesPage(driver);
    }

    public ProductsPage clickProductsButton(){
       ProductsButton.click();
       return new ProductsPage(driver);

    }

    public HomeWebPage checkSubscription(){
        Actions action = new Actions(driver);
        action.moveToElement(SingupButton).perform();

        String text = SubscriptionText.getText();
        Assert.assertEquals(text,"SUBSCRIPTION");

        SubscriptionFieldEmail.sendKeys("alt.y3-9o1vmumt@yopmail.com");
        SingupButton.click();

        SuccessMessageSubscription.isDisplayed();


        return new HomeWebPage(driver);
    }

    public ViewCartPage clickCartButton(){
       CartButton.click();
       return new ViewCartPage(driver);
    }

    public HomeWebPage clickWomenCategory(){
       WomenCategory.click();

       return new HomeWebPage(driver);
    }
    public ProductsPage clickDressWomenCategory() {
      DressWomenCategory.click();

        return new ProductsPage(driver);

    }

    public HomeWebPage scrollToBottom(){
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollTo(0, document.body.scrollHeight)");

        return new HomeWebPage(driver);
    }
    public HomeWebPage checkrecommendedItems(){
       String text = RecommendedItems.getText();
       Assert.assertEquals(text,"RECOMMENDED ITEMS");
       return new HomeWebPage(driver);
    }

    public HomeWebPage clickAddToCartRecommendedItems(){
       AddToCartRecommendedButton.click();
       ContinueButton.click();
       return new HomeWebPage(driver);
    }

    public ViewCartPage clickViewCartRecommendedButton(){
       ViewCartRecommendedButton.click();
       return new ViewCartPage(driver);
    }
    public HomeWebPage clickArrowButton(){
       ArrowButton.click();
       return new HomeWebPage(driver);
    }
    public HomeWebPage checkFullFledgedTitle(){
       FullFledgedTitle.isDisplayed();
       return new HomeWebPage(driver);
    }
    public HomeWebPage checkSubscription1(){
     SubscriptionTitle.isDisplayed();
       return new HomeWebPage(driver);
    }
    public HomeWebPage scrollUp(){
       JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollTo(0, 0)");
        return new HomeWebPage(driver);
    }


}
