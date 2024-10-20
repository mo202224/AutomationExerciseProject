package Pages;

import Bases.PageBase;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CheckOutPage extends PageBase {
    public CheckOutPage(WebDriver driver) {
        super(driver);
    }
  @FindBy(xpath = "//h2[normalize-space()='Address Details']")
  private WebElement AddressDetailsTitle;

    @FindBy(xpath = "//h2[normalize-space()='Review Your Order']")
    private WebElement ReviewYourOrder;

    @FindBy(xpath = "//textarea[@name='message']")
    private WebElement CommentField;

    @FindBy(xpath = "//a[@class='btn btn-default check_out']")
    private WebElement PlaceOrderButton;




    public CheckOutPage checkAddressAndReviewOrder(){
        AddressDetailsTitle.isDisplayed();
        ReviewYourOrder.isDisplayed();
        return new CheckOutPage(driver);


    }
    public PaymentPage writeCommentAndPlaceOrder(){
        CommentField.sendKeys("Test");
        PlaceOrderButton.click();

        return new PaymentPage(driver);
    }




}
