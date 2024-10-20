package TestCases;

import Bases.TestBase;
import Pages.Homepage;
import org.testng.annotations.Test;

public class RegisterUser extends TestBase {


    @Test
    public void CheckRegisterUser(){
        Homepage homepage =new Homepage(driver);

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
        checkLoggedInAsUsernameText().
        clickDeleteAccount().
        checkVisibilityForAccountDeletedTitle();
    }

}
