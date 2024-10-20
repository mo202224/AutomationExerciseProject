package Pages;

import Bases.PageBase;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

import javax.xml.xpath.XPath;
import java.io.File;
import java.io.IOException;

public class ContactUsPage extends PageBase {
    public ContactUsPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "//input[@placeholder='Name']")
    private WebElement NameFieldContactUs;

    @FindBy(xpath = "//input[@placeholder='Email']")
    private WebElement EmailFieldContactUs;

    @FindBy(xpath = "//input[@placeholder='Subject']")
    private WebElement SubjectFieldContactUs;

    @FindBy(xpath = "//textarea[@id='message']" )
    private WebElement MessageFieldContactUs;

    @FindBy(xpath = "//input[@name='upload_file']")
    private WebElement BrowseButton;

   @FindBy(xpath = "//input[@name='submit']")
    private WebElement SubmitButton;

   @FindBy(xpath = "//div[@class='status alert alert-success']")
   private WebElement SuccessMessage;

    @FindBy(xpath = "//a[contains(text(),'Home')]")
    private WebElement HomeButton;




    public ContactUsPage sendingMessageFromContactUs(){
       NameFieldContactUs.sendKeys("tester");
       EmailFieldContactUs.sendKeys("alt.y3-9o1vmumt@yopmail.com");
       SubjectFieldContactUs.sendKeys("test");
       MessageFieldContactUs.sendKeys("test");
       File file = new File("temp.txt.Test.png");
       try {
           file.createNewFile();
       } catch (IOException e) {
           e.printStackTrace();
       }
       BrowseButton.sendKeys(file.getAbsolutePath());
       SubmitButton.click();
       driver.switchTo().alert().accept();
       return new ContactUsPage(driver);

   }
   public ContactUsPage checkSuccessmessage(){
       String text = SuccessMessage.getText();
       Assert.assertEquals(text,"Success! Your details have been submitted successfully.");
       return new ContactUsPage(driver);
   }
    public HomeWebPage clickHomeButton(){
        HomeButton.click();
        return new HomeWebPage(driver);
    }









}
