package TestCases;

import Bases.TestBase;
import Pages.Homepage;
import org.testng.annotations.Test;

public class PlaceOrderRegisterwhileCheckout extends TestBase {
@Test
    public void placeOrderRegisterwhileCheckout(){
        Homepage homepage =new Homepage(driver);

        homepage.
                load().
                checkVisiblityHomePage().
                clickProductsButton().
                clickViewProduct1().
                changeQuantityAndClickAddAndViewCart().
                clickProceedToCheckOut().

                enterNameAndEmail().
                enterTheInformationSingup().
                checkVisiblityAccountCreatedTitle().
                clickContinueButton().
                checkLoggedInAsUsernameText().
                clickCartButton().
                clickProceedToCheckOutAsUserLoggedIn().
                checkAddressAndReviewOrder().
                writeCommentAndPlaceOrder().
                clickAndEnterPayment().
                clickDeleteMyAccount().
                checkVisibilityForAccountDeletedTitle();









    }
}
