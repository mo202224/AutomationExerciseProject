package Pages;

import Bases.PageBase;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class PaymentDonePage extends PageBase {
    public PaymentDonePage(WebDriver driver) {
        super(driver);
    }
    @FindBy(xpath = "//a[normalize-space()='Delete Account']")
    private WebElement DeleteMyAccountButton;

    @FindBy(xpath = "//a[@class='btn btn-default check_out']")
    private WebElement DownloadInvoiceButton;

    @FindBy(xpath = "//a[@class='btn btn-primary']")
    private WebElement ContinueButton;


    public DeleteAccountPage clickDeleteMyAccount(){
DeleteMyAccountButton.click();
        return new DeleteAccountPage(driver);

    }

    public PaymentDonePage clickDownloadInvoice(){
        DownloadInvoiceButton.click();
        return new PaymentDonePage(driver);
    }
    public HomeWebPage clickContinueButton(){
        ContinueButton.click();
        return new HomeWebPage(driver);

    }

}
