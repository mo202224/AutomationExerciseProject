package TestCases;

import Bases.TestBase;
import Pages.Homepage;
import org.testng.annotations.Test;

public class ContactUsForm extends TestBase {

    @Test
    public void contactUsForm(){
        Homepage homepage =new Homepage(driver);

        homepage.
                load().
                checkVisiblityHomePage().
                clickContactUsbutton().
                sendingMessageFromContactUs().
                checkSuccessmessage().
                clickHomeButton().
                checkVisiblityHomePage();







    }
}
