package TestCases;

import Bases.TestBase;
import Pages.Homepage;
import org.testng.annotations.Test;

public class AddReviewOnProduct extends TestBase {
@Test
    public void addReviewOnProduct(){

        Homepage homepage =new Homepage(driver);
        homepage.
                load().
                clickProductsButton().
                checkAllProductsTitle().
                clickProduct11().
                checkWriteYourReviewTitle().
                enterAndSubmitNameEmailReview().
                checkThankYouForReview();


    }
}
