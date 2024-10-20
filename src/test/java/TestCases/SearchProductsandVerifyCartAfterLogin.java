package TestCases;

import Bases.TestBase;
import Pages.Homepage;
import org.testng.annotations.Test;

public class SearchProductsandVerifyCartAfterLogin extends TestBase {

@Test
    public void SearchProductsAndVerifyCartAfterLogin(){

        Homepage homepage =new Homepage(driver);
        homepage.
                load().
                clickProductsButton().
                checkAllProductsTitle().
                clickSearchFieldForBlueTop().
                checkSearchproductTitle().
                checkAllProductRelatedToThesearch().
                clickonAddToCartAndCart().
                checkProductAddedFromSearchResults().
                clickOnSingupLongin().
                enterNameAndEmail().enterTheInformationSingup().clickContinueButton().
                clickCartButton().
                checkProductAddedFromSearchResults().
                clickDeleteAccount();
    }
}
