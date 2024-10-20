package Pages;

import Bases.PageBase;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

public class DeleteAccountPage extends PageBase {
    public DeleteAccountPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "//b[normalize-space()='Account Deleted!']")
    private WebElement AccountDeletedTitle;


    public DeleteAccountPage checkVisibilityForAccountDeletedTitle(){
        String title =AccountDeletedTitle.getText();
        Assert.assertEquals(title,"ACCOUNT DELETED!");
        return new DeleteAccountPage(driver);

    }
}
