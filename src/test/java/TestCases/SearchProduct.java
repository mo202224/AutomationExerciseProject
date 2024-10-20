package TestCases;

import Bases.TestBase;
import Pages.Homepage;
import org.testng.annotations.Test;

public class SearchProduct extends TestBase {

@Test
    public void searchProduct(){
        Homepage homepage =new Homepage(driver);

        homepage.
                load().
                checkVisiblityHomePage().
                clickProductsButton().
                checkAllProductsTitle().
                enterProductNameAndSearch().
                checkProductNameResult();





    }
}
