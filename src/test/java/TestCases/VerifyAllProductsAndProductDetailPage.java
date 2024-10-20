package TestCases;

import Bases.TestBase;
import Pages.Homepage;
import org.testng.annotations.Test;

public class VerifyAllProductsAndProductDetailPage extends TestBase {

@Test
    public void verifyAllProductsAndProductDetailPage(){
        Homepage homepage =new Homepage(driver);

        homepage.
                load().
                checkVisiblityHomePage().
                clickProductsButton().
                checkAllProductsTitle().
                checkProductsVisibility().
                clickViewProduct1().
                checkProductDetail();





    }
}
