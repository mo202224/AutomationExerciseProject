package Pages;

import Bases.PageBase;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

public class TestCasesPage extends PageBase {
    public TestCasesPage(WebDriver driver) {
        super(driver);
    }
    @FindBy(css = "h2[class='title text-center'] b")
    private WebElement TestCasesTitle;



    public TestCasesPage checkTestCasesTitle(){
        TestCasesTitle.isDisplayed();


        return new TestCasesPage(driver);
    }


}
