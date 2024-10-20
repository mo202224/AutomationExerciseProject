package Pages;

import Bases.PageBase;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ProductDetailsPage extends PageBase {
    public ProductDetailsPage(WebDriver driver) {
        super(driver);
    }
    @FindBy(xpath = "//h2[normalize-space()='Full Sleeves Top Cherry - Pink']")
    private WebElement ProductName;

    @FindBy(xpath = "//p[normalize-space()='Category: Kids > Tops & Shirts']")
    private WebElement ProductCategory;

    @FindBy(xpath = "//span[normalize-space()='Rs. 679']")
    private WebElement ProductPrice;

    @FindBy(xpath = "//div[@class='product-details']//p[2]")
    private WebElement ProductAvailability;

    @FindBy(xpath = "//body//section//p[3]")
    private WebElement ProductCondition;

   @FindBy(xpath = "//body//section//p[4]")
    private WebElement ProductBrand;

   @FindBy(xpath = "//input[@id='quantity']")
   private WebElement QuantityButton;

   @FindBy(xpath = "//button[@type='button']")
   private WebElement AddToCartButton;

   @FindBy(xpath = "//u[normalize-space()='View Cart']")
   private WebElement ViewCartButton;

   @FindBy(xpath = "//u[normalize-space()='View Cart']")
   private WebElement ViewCartButton4Quantity;

   @FindBy(xpath = "/html[1]/body[1]/header[1]/div[1]/div[1]/div[1]/div[2]/div[1]/ul[1]/li[3]/a[1]")
   private WebElement CartButton;

   @FindBy(xpath = "//button[@class='btn btn-success close-modal btn-block']")
   private WebElement ContinueShopping;


   public ProductDetailsPage checkProductDetail(){
       ProductName.isDisplayed();
       ProductCategory.isDisplayed();
       ProductPrice.isDisplayed();
       ProductAvailability.isDisplayed();
       ProductCondition.isDisplayed();
       ProductBrand.isDisplayed();

       return new ProductDetailsPage(driver);
   }

    public ViewCartPage changeQuantityAndClickAddAndViewCart(){

        QuantityButton.clear();
        QuantityButton.sendKeys("4");
        AddToCartButton.click();
        ViewCartButton4Quantity.click();


      return new ViewCartPage(driver);
    }

    public ViewCartPage clickAddProduct(){

       AddToCartButton.click();

       ContinueShopping.click();
      CartButton.click();

       return new ViewCartPage(driver);
    }




}
