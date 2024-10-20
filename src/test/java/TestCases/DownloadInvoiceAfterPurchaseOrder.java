package TestCases;

import Bases.TestBase;
import Pages.Homepage;
import org.testng.annotations.Test;

public class DownloadInvoiceAfterPurchaseOrder extends TestBase {
 @Test
    public void downloadInvoiceAfterPurchaseOrder(){
        Homepage homepage =new Homepage(driver);

        homepage.load().checkVisiblityHomePage().clickAddToCartRecommendedItems().
                clickCartButton().
                checkShoppingCartTitle().
                clickProceedToCheck1().
                clickOnRegisterLoginCheckout().
                enterNameAndEmail().enterTheInformationSingup().checkVisiblityAccountCreatedTitle().clickContinueButton().checkLoggedInAsUsernameText().
                clickCartButton().
                checkShoppingCartTitle().
                clickProceedToCheck1().
                checkDeliverAddressAndBillingAddressAreRight().
                writeCommentAndPlaceOrder1().
                clickAndEnterPayment().
                clickDownloadInvoice().
                clickContinueButton().
               clickDeleteAccount().
                checkVisibilityForAccountDeletedTitle();


    }
}
