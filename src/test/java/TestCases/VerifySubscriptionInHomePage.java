package TestCases;

import Bases.TestBase;
import Pages.Homepage;
import org.testng.annotations.Test;

public class VerifySubscriptionInHomePage extends TestBase {

@Test
    public void subsctibtiption(){
        Homepage homepage =new Homepage(driver);

        homepage.
                load().
                checkVisiblityHomePage().
                checkSubscription();


    }
}
