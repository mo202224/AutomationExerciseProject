package TestCases;

import Bases.TestBase;
import Pages.Homepage;
import org.testng.annotations.Test;

public class RegisterUserWithExistingEmail extends TestBase {
@Test
    public void registerUserWithExistingEmail(){
        Homepage homepage =new Homepage(driver);

        homepage.
                load().
                checkVisiblityHomePage().
                clickOnSingup().
                checkVisiblityNewUSerSingUP().
                enterNameAndEmail().

                enterTheInformationSingup().
                checkVisiblityAccountCreatedTitle().
                clickContinueButton().
                clickLogout().

                enterNameAndEmailForExistEmail().
                checkError_EmailAddressAlreadyExist().

                loginToYourAccount().
                checkLoggedInAsUsernameText().
                clickDeleteAccount();



    }
}
