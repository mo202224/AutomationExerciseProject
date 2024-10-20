package TestCases;

import Bases.TestBase;
import Pages.Homepage;
import org.testng.annotations.Test;

public class ViewCategoryProducts extends TestBase {

@Test
    public void viewCategoryProducts(){
        Homepage homepage =new Homepage(driver);
        homepage.
                load().
                checkVisiblityHomePage().
                clickWomenCategory().
                clickDressWomenCategory().
                checkWomenDressTitle().
                clickMenCategory().
                clickJeansMenCategory().
                checkMenCategoryTitle();


    }
}
