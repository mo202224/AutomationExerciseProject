package Pages;

import Bases.PageBase;
import org.openqa.selenium.WebDriver;

public class Homepage extends PageBase {
    public Homepage(WebDriver driver) {
        super(driver);
    }


    public HomeWebPage load() {
        driver.navigate().to("http://automationexercise.com");
        return new HomeWebPage(driver);
    }




}
