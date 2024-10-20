package Bases;

import Factorypage.DriverFactory;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Factory;

public class TestBase {

    protected WebDriver driver;

    @BeforeClass
    public void setup(){
       driver = new DriverFactory().initilaizer();

    }


   @AfterTest
    public void teardown(){
        driver.quit();
   }

}
