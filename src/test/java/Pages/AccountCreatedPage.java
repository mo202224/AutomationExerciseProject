package Pages;

import Bases.PageBase;
import com.beust.ah.A;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

public class AccountCreatedPage extends PageBase {
    public AccountCreatedPage(WebDriver driver) {
        super(driver);
    }
    @FindBy(xpath = "//b[normalize-space()='Account Created!']")
    private WebElement AccountCreatedTitle;


    @FindBy(xpath = "//a[@class='btn btn-primary']")
    private WebElement ContinueButton;







    public AccountCreatedPage checkVisiblityAccountCreatedTitle(){
        String title= AccountCreatedTitle.getText();
        Assert.assertEquals(title,"ACCOUNT CREATED!");
        return new AccountCreatedPage(driver);
    }

    public HomeWebPage clickContinueButton(){
        ContinueButton.click();
        return new HomeWebPage(driver);

    }


}
