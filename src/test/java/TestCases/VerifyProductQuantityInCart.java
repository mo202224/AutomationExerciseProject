package TestCases;

import Bases.TestBase;
import Pages.Homepage;
import org.testng.annotations.Test;

public class VerifyProductQuantityInCart extends TestBase {

@Test

    public void verifyProductQuantityInCart(){


        Homepage homepage =new Homepage(driver);

        homepage.
                load().
                checkVisiblityHomePage().
                clickProductsButton().
                clickProduct1();

    }
}
