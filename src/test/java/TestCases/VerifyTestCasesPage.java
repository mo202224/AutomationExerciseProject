package TestCases;

import Bases.TestBase;
import Pages.Homepage;
import org.testng.annotations.Test;

public class VerifyTestCasesPage extends TestBase {


    @Test
    public void verifyTestCasesPage(){
        Homepage homepage =new Homepage(driver);

        homepage.
                load().
                checkVisiblityHomePage().
                clickTestCasesButton().
                checkTestCasesTitle();


    }
}
