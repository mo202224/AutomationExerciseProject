package TestCases;

import Bases.TestBase;
import Pages.Homepage;
import org.testng.annotations.Test;

public class PlaceOrderRegisterbeforeCheckout extends TestBase {

@Test
    public void PlaceOrderRegisterBeforeCheckout(){
        Homepage homepage = new Homepage(driver);
    homepage.
            load().
            checkVisiblityHomePage().
            clickOnSingup().
            checkVisiblityNewUSerSingUP().
            enterNameAndEmail().
            checkEnterAccountInformationTitle().
            enterTheInformationSingup().
            checkVisiblityAccountCreatedTitle().
            clickContinueButton().
            clickLogout().
            checkLoginToYourAccountTitle().
            loginToYourAccount().
            checkLoggedInAsUsernameText().

            clickProductsButton().
            clickViewProduct1().
            clickAddProduct().
            checkShoppingCartTitle().
            clickProceedToCheckOutAsUserLoggedIn().
            checkAddressAndReviewOrder().
            writeCommentAndPlaceOrder().
            clickAndEnterPayment().
            clickDeleteMyAccount().
            checkVisibilityForAccountDeletedTitle();








    }
}
