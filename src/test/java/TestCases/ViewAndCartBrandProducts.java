package TestCases;

import Bases.TestBase;
import Pages.Homepage;
import org.testng.annotations.Test;

public class ViewAndCartBrandProducts extends TestBase {

@Test
    public void viewAndCartBrandProducts(){

        Homepage homepage = new Homepage(driver);
        homepage.
                load().
                clickProductsButton().
                checkBrandsTitle().
                clickPoloBrand().
                clickBibaBrand().
                checkBibaBrandTitlePage();
    }
}
