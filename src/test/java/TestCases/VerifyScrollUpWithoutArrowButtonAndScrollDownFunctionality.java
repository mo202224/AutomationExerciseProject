package TestCases;

import Bases.TestBase;
import Pages.Homepage;
import org.testng.annotations.Test;

public class VerifyScrollUpWithoutArrowButtonAndScrollDownFunctionality extends TestBase {
@Test
    public void verifyScrollUpWithoutArrowButtonAndScrollDownFunctionality(){
        Homepage homepage =new Homepage(driver);
        homepage.load().checkVisiblityHomePage().scrollToBottom().checkSubscription1().scrollUp().checkFullFledgedTitle();
    }
}
