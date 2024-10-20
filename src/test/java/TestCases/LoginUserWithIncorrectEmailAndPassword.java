package TestCases;

import Bases.TestBase;
import Pages.Homepage;
import org.testng.annotations.Test;

public class LoginUserWithIncorrectEmailAndPassword extends TestBase {
@Test
    public void loginUserWithIncorrectEmailAndPassword(){
        Homepage homepage = new Homepage(driver);
        homepage.
                load().
                checkVisiblityHomePage().
                clickOnSingup().
                checkLoginToYourAccountTitle().
                loginWithIncorrectEmailAndPassword().
                checkErrorIncorrectEmailOrPassword();





    }
}
