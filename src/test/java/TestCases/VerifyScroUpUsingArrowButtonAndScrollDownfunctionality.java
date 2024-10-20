package TestCases;

import Bases.TestBase;
import Pages.HomeWebPage;
import Pages.Homepage;
import org.testng.annotations.Test;

public class VerifyScroUpUsingArrowButtonAndScrollDownfunctionality extends TestBase {
@Test
    public void verifyScroUpUsingArrowButtonAndScrollDownfunctionality(){

        Homepage homepage =new Homepage(driver);
        homepage.load().checkVisiblityHomePage().scrollToBottom().checkSubscription1().clickArrowButton().checkFullFledgedTitle();


    }
}
