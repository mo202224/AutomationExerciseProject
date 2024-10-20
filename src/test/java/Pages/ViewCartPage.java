package Pages;

import Bases.PageBase;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

public class ViewCartPage extends PageBase {
    public ViewCartPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "//input[@id='susbscribe_email']")
    private WebElement SubscriptionEmailField;

    @FindBy(xpath = "//button[@id='subscribe']")
    private WebElement EnterSubscriptionButton;

    @FindBy(xpath = "//h2[normalize-space()='Subscription']")
    private WebElement SubscriptionTitle;

    @FindBy(xpath = "//div[@class='alert-success alert']")
    private WebElement SuccessMessageSubscription;


    @FindBy(xpath = "//a[normalize-space()='Blue Top']")
    private WebElement Description1;

    @FindBy(xpath = "//td[@class='cart_price']//p[contains(text(),'Rs. 500')]")
    private WebElement Price1;

    @FindBy(xpath = "//tr[@id='product-1']//button[@class='disabled'][normalize-space()='1']")
    private WebElement Quantity1;

    @FindBy(xpath = "//p[@class='cart_total_price'][normalize-space()='Rs. 500']")
    private WebElement Total;

    @FindBy(xpath = "//a[normalize-space()='Men Tshirt']")
    private WebElement Description2;

    @FindBy(xpath = "//td[@class='cart_price']//p[contains(text(),'Rs. 400')]")
    private WebElement Price2;

    @FindBy(xpath = "//tr[@id='product-2']//button[@class='disabled'][normalize-space()='1']")
    private WebElement Quantity2;

    @FindBy(xpath = "//p[@class='cart_total_price'][normalize-space()='Rs. 400']")
    private WebElement Total2;

    @FindBy(xpath = "//button[normalize-space()='3']")
    private WebElement PriceFor4Quantity;

    @FindBy(xpath = "//a[@class='btn btn-default check_out']")
    private WebElement ProceedToCheckOutButton;

    @FindBy(xpath = "//u[normalize-space()='Register / Login']")
    private WebElement LoginButton;

    @FindBy(xpath = "//li[@class='active']")
    private WebElement ShoppingCartTitle;

    @FindBy(xpath = "//i[@class='fa fa-times']")
    private WebElement XButton;

    @FindBy(xpath = "//b[normalize-space()='Cart is empty!']")
    private WebElement CartIsEmptyTitle;

    @FindBy(xpath = "//a[normalize-space()='Delete Account']")
    private WebElement DeleteAccountButton;

    @FindBy(xpath = "//a[normalize-space()='Blue Top']")
    private WebElement CartItemBlueTop;

    @FindBy(xpath = "//a[normalize-space()='Signup / Login']")
    private WebElement SingupLoginButton;

    @FindBy(xpath = "//a[normalize-space()='Write Your Review']")
    private WebElement WriteYourReviewTitle;

    @FindBy(xpath = "//input[@id='name']")
    private WebElement NameReviewField;

    @FindBy(xpath = "//input[@id='email']")
    private WebElement EmailReviewField;

    @FindBy(xpath = "//textarea[@id='review']")
    private WebElement ReviewField;

    @FindBy(xpath = "//button[@id='button-review']")
    private WebElement SubmitButton;

    @FindBy(xpath = "//div[@class='col-md-12 form-group']//div[@class='alert-success alert']")
    private WebElement ThankYouMessage;

    @FindBy(xpath = "//tr[@id='product-4']//img[@alt='Product Image']")
    private WebElement RecommendedItem;

    @FindBy(css = "ul[id='address_delivery'] li[class='address_firstname address_lastname']")
    private WebElement NameAndLastNameDeliveryAddress;

    @FindBy(css = "ul[id='address_delivery'] li:nth-child(3)")
    private WebElement Address1DeliveryAddress;

    @FindBy(css = "ul[id='address_delivery'] li:nth-child(4)")
    private WebElement Address2DeliveryAddress;

    @FindBy(css = "ul[id='address_delivery'] li:nth-child(5)")
    private WebElement Address3DeliveryAddress;

    @FindBy(css = "ul[id='address_delivery'] li[class='address_city address_state_name address_postcode']")
    private WebElement CityStateZipCodeDeliveryAddress;

    @FindBy(css = "ul[id='address_delivery'] li[class='address_country_name']")
    private WebElement CountryDeliveryAddress;

    @FindBy(css = "ul[id='address_delivery'] li[class='address_phone']")
    private WebElement PhoneDeliveryAddress;

    @FindBy(css = "ul[id='address_invoice'] li[class='address_firstname address_lastname']")
    private WebElement NameAndLastNameBillingAddress;

    @FindBy(css = "ul[id='address_invoice'] li:nth-child(3)")
    private WebElement Address1BillingAddress;

    @FindBy(css = "ul[id='address_invoice'] li:nth-child(4)")
    private WebElement Address2BillingAddress;

    @FindBy(css = "ul[id='address_invoice'] li:nth-child(5)")
    private WebElement Address3BillingAddress;

    @FindBy(css = "ul[id='address_invoice'] li[class='address_city address_state_name address_postcode']")
    private WebElement CityStateZipCodeBillingAddress;

    @FindBy(css = "ul[id='address_invoice'] li[class='address_country_name']")
    private WebElement CountryBillingAddress;

    @FindBy(css = "ul[id='address_invoice'] li[class='address_phone']")
    private WebElement PhoneBillingAddress;

    @FindBy(xpath = "//a[@class='btn btn-default check_out']")
    private WebElement ProceedToCheckoutButton;

    @FindBy(css = "body > section:nth-child(2) > div:nth-child(1) > section:nth-child(2) > div:nth-child(2) > div:nth-child(1) > div:nth-child(1) > div:nth-child(2) > p:nth-child(2) > a:nth-child(1) > u:nth-child(1)")
    private WebElement RegisterButtonCheckout;

    @FindBy(xpath = "//textarea[@name='message']")
    private WebElement CommentField;

    @FindBy(xpath = "//a[@class='btn btn-default check_out']")
    private WebElement PlaceOrderButton;

    @FindBy(xpath = "//u[normalize-space()='View Cart']")
    private WebElement ViewCart;


    public HomeWebPage checkSubscription() {
        Actions action = new Actions(driver);
        action.moveToElement(SubscriptionTitle).perform();

        String text = SubscriptionTitle.getText();
        Assert.assertEquals(text, "SUBSCRIPTION");

        SubscriptionEmailField.sendKeys("alt.y3-9o1vmumt@yopmail.com");
        EnterSubscriptionButton.click();

        String tx = SuccessMessageSubscription.getText();
        Assert.assertEquals(tx, "You have been successfully subscribed!");

        return new HomeWebPage(driver);
    }

    public ViewCartPage checkProductInCart() {
        Description1.isDisplayed();
        Description2.isDisplayed();
        Price1.isDisplayed();
        Price2.isDisplayed();
        Quantity1.isDisplayed();
        Quantity2.isDisplayed();
        Total.isDisplayed();
        Total2.isDisplayed();
        return new ViewCartPage(driver);
    }

    public ViewCartPage checkProduct4Quantity() {
        ViewCart.click();
        PriceFor4Quantity.isDisplayed();

        return new ViewCartPage(driver);

    }

    public LoginPage clickProceedToCheckOut() {
        ProceedToCheckOutButton.click();
        LoginButton.click();

        return new LoginPage(driver);
    }

    public CheckOutPage clickProceedToCheckOutAsUserLoggedIn() {
        ProceedToCheckOutButton.click();
        return new CheckOutPage(driver);
    }

    public ViewCartPage checkShoppingCartTitle() {
        ShoppingCartTitle.isDisplayed();
        return new ViewCartPage(driver);
    }

    public ViewCartPage clickXButton() {
        XButton.click();
        return new ViewCartPage(driver);
    }

    public ViewCartPage checkTheCartEmpty() {
        CartIsEmptyTitle.isDisplayed();
        return new ViewCartPage(driver);
    }

    public DeleteAccountPage clickDeleteAccount() {
        DeleteAccountButton.click();
        return new DeleteAccountPage(driver);

    }

    public ViewCartPage checkProductAddedFromSearchResults() {
        CartItemBlueTop.isDisplayed();
        return new ViewCartPage(driver);
    }

    public LoginPage clickOnSingupLongin() {
        SingupLoginButton.click();

        return new LoginPage(driver);
    }

    public ViewCartPage checkWriteYourReviewTitle() {
        WriteYourReviewTitle.isDisplayed();
        return new ViewCartPage(driver);
    }

    public ViewCartPage enterAndSubmitNameEmailReview() {
        NameReviewField.sendKeys("tester");
        EmailReviewField.sendKeys("tester@hotmail.com");
        ReviewField.sendKeys("test");
        SubmitButton.click();
        return new ViewCartPage(driver);
    }

    public ViewCartPage checkThankYouForReview() {
        ThankYouMessage.isDisplayed();
        String text = ThankYouMessage.getText();
        Assert.assertEquals(text, "Thank you for your review.");
        return new ViewCartPage(driver);
    }

    public ViewCartPage checkRecommendedItemAdded() {
        RecommendedItem.isDisplayed();
        return new ViewCartPage(driver);
    }

    public ViewCartPage Print() {
        String text1 = "Tester";
        String Text2 = "United States";
        String Text3 = "0000000000";
        String Text = "11111";
        System.out.println(NameAndLastNameBillingAddress.getText());
        System.out.println(CityStateZipCodeBillingAddress.getText());
        return new ViewCartPage(driver);
    }

    public ViewCartPage checkDeliverAddressAndBillingAddressAreRight() {
        String text1 = "Tester";
        String Text2 = "United States";
        String Text3 = "0000000000";
        String Text = "11111";

        Assert.assertEquals("Mr. " + text1 + " " + text1, NameAndLastNameDeliveryAddress.getText());
        Assert.assertEquals(text1, Address1DeliveryAddress.getText());
        Assert.assertEquals(text1, Address2DeliveryAddress.getText());
        Assert.assertEquals(text1, Address3DeliveryAddress.getText());
        Assert.assertEquals(text1 + " " + text1 + " " + Text, CityStateZipCodeDeliveryAddress.getText());
        Assert.assertEquals(Text2, CountryDeliveryAddress.getText());
        Assert.assertEquals(Text3, PhoneDeliveryAddress.getText());

        Assert.assertEquals("Mr. " + text1 + " " + text1, NameAndLastNameBillingAddress.getText());
        Assert.assertEquals(text1, Address1BillingAddress.getText());
        Assert.assertEquals(text1, Address2BillingAddress.getText());
        Assert.assertEquals(text1, Address3BillingAddress.getText());
        Assert.assertEquals(Text2, CountryBillingAddress.getText());
        Assert.assertEquals(CityStateZipCodeBillingAddress.getText(), text1 + " " + text1 + " " + Text);
        Assert.assertEquals(Text3, PhoneBillingAddress.getText());
        return new ViewCartPage(driver);

    }

    public LoginPage clickOnRegisterLoginCheckout() {
        RegisterButtonCheckout.click();
        return new LoginPage(driver);
    }

    public ViewCartPage clickProceedToCheck1() {
        ProceedToCheckOutButton.click();
        return new ViewCartPage(driver);
    }

    public PaymentPage writeCommentAndPlaceOrder1() {
        CommentField.sendKeys("Test");
        PlaceOrderButton.click();

        return new PaymentPage(driver);

    }
}
