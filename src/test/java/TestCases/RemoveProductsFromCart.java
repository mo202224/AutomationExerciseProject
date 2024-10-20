package TestCases;

import Bases.TestBase;
import Pages.HomeWebPage;
import Pages.Homepage;
import org.testng.annotations.Test;

public class RemoveProductsFromCart extends TestBase {
   @Test
    public void removeProductsFromCart(){
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
                        clickXButton().
                        checkTheCartEmpty().
                        clickDeleteAccount();





    }
}
