package TestCases;

import Bases.TestBase;
import Pages.Homepage;
import org.testng.annotations.Test;

public class AddToCartFromRecommendedItems extends TestBase {
@Test
    public void addToCartFromRecommendedItems(){

        Homepage homepage =new Homepage(driver);

        homepage.load().
                scrollToBottom().
                checkrecommendedItems().
                clickAddToCartRecommendedItems().
                clickViewCartRecommendedButton().
                checkRecommendedItemAdded();

    }
}
