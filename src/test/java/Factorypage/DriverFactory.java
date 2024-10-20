package Factorypage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.time.Duration;

public class DriverFactory {

    public WebDriver initilaizer() {

        WebDriver driver = new FirefoxDriver();



        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        driver.manage().window().maximize();
        driver.manage().window().minimize();

        return driver;
    }
}