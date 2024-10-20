package TestCases;

import Bases.TestBase;
import Pages.Homepage;
import org.testng.annotations.Test;

public class VerifySubscriptionInCartPage extends TestBase {

@Test
    public void verifySubscriptionInCartPage(){
        Homepage homepage =new Homepage(driver);

        homepage.
                load().
                checkVisiblityHomePage().
                clickCartButton().
                checkSubscription();



        
    }
}
