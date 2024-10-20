package TestCases;

import Bases.TestBase;
import Pages.Homepage;
import org.testng.annotations.Test;

@Test
public class LoginUserWithCorrectEmailAndPassword extends TestBase {
    public void loginUserWithCorrectEmailAndPassword() {
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
                clickDeleteAccount().
                checkVisibilityForAccountDeletedTitle();










    }
}
