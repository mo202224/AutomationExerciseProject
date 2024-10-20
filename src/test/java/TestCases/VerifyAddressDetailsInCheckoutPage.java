package TestCases;

import Bases.TestBase;
import Pages.HomeWebPage;
import Pages.Homepage;
import org.testng.annotations.Test;

public class VerifyAddressDetailsInCheckoutPage extends TestBase {
@Test
    public void verifyAddressDetailsInCheckoutPage(){
        Homepage homepage =new Homepage(driver);

        homepage.load().checkVisiblityHomePage().
                clickOnSingup().
                enterNameAndEmail().
                enterTheInformationSingup().
                checkVisiblityAccountCreatedTitle().
                clickContinueButton().
                checkLoggedInAsUsernameText().
                clickAddToCartRecommendedItems().
                clickCartButton().

                checkShoppingCartTitle().
                clickProceedToCheck1().

                Print().

                checkDeliverAddressAndBillingAddressAreRight().
                clickDeleteAccount().
               checkVisibilityForAccountDeletedTitle();


    }


}
