package TestCases;

import Bases.TestBase;
import Pages.Homepage;
import org.testng.annotations.Test;

public class AddProductsInCart extends TestBase {

@Test
    public void addProductsInCart(){


        Homepage homepage =new Homepage(driver);

        homepage.
                load().
                checkVisiblityHomePage().
                clickProductsButton().
                hover1Product().
                hoverAndClickProduct1And2().
                checkProductsVisibility().
                checkItemsInCart();





    }
}
