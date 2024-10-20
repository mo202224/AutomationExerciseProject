package TestCases;

import Bases.TestBase;
import Pages.Homepage;
import org.testng.annotations.Test;

public class LogoutUser extends TestBase {
    @Test
    public void logoutUser(){
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
                checkUserNavigatedToLoginPage().

                loginToYourAccount().
                checkLoggedInAsUsernameText().
                clickDeleteAccount().
                checkVisibilityForAccountDeletedTitle();
    }
}
