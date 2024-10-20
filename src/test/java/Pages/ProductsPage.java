package Pages;

import Bases.PageBase;
import com.beust.ah.A;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.testng.Assert;

public class ProductsPage extends PageBase {
    public ProductsPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "//h2[@class='title text-center']")
    private WebElement AllProductsTitle;

    @FindBy(xpath = "//div[3]//div[1]//div[1]//div[2]")
    private WebElement ProductsVisibility;

    @FindBy(xpath = "//div[13]//div[1]//div[2]//ul[1]//li[1]//a[1]")
    private WebElement ViewProduct1Button;

    @FindBy(xpath = "//input[@id='search_product']")
    private WebElement SearchField;

    @FindBy(xpath = "//button[@id='submit_search']")
    private WebElement SearchButton;

    @FindBy(xpath = "//a[normalize-space()='View Product']")
    private WebElement Searchresult;

    @FindBy(xpath = "//div[@class='col-sm-9 padding-right']//div[2]//div[1]//div[1]//div[2]//div[1]//a[1]")
    private WebElement AddButton1;

    @FindBy(xpath = "//button[@class='btn btn-success close-modal btn-block']")
    private WebElement ContinueButton;

    @FindBy(css = "body > section:nth-child(3) > div:nth-child(1) > div:nth-child(1) > div:nth-child(2) > div:nth-child(1) > div:nth-child(4) > div:nth-child(1) > div:nth-child(1) > div:nth-child(2) > div:nth-child(1) > a:nth-child(3)")
    private WebElement AddButton2;

    @FindBy(css = "body > section:nth-child(3) > div:nth-child(1) > div:nth-child(1) > div:nth-child(2) > div:nth-child(1) > div:nth-child(2) > div:nth-child(1) > div:nth-child(1) > div:nth-child(2) > p:nth-child(2) > a:nth-child(1) > u:nth-child(1)")
    private WebElement ViewCartButton;

    @FindBy(xpath = "//a[normalize-space()='Cart']")
    private WebElement CartButton;

    @FindBy(xpath = "//div[@class='col-sm-9 padding-right']//div[2]//div[1]//div[1]//div[2]//div[1]//a[1]")
  private WebElement AddToCartProductPage;

    @FindBy(xpath = "//h2[@class='title text-center']")
    private WebElement WomenDressProducttitle;

    @FindBy(xpath = "//a[normalize-space()='Men']")
    private WebElement MenCategory;

    @FindBy(css = "a[href='/category_products/6']")
    private WebElement JeansMenCategory;

    @FindBy(xpath = "//a[normalize-space()='Jeans']")
    private WebElement MenCategoryTitle;

    @FindBy(xpath = "//h2[normalize-space()='Brands']")
    private WebElement BrandsTitle;

    @FindBy(xpath = "//a[@href='/brand_products/Polo']")
    private WebElement PoloBrandButton;

    @FindBy(xpath = "//h2[@class='title text-center']")
    private WebElement PoloBrandTitle;

    @FindBy(xpath = "//a[@href='/brand_products/Biba']")
    private WebElement BibaBrandButton;

    @FindBy(xpath = "//body//section//div[@class='container']")
    private WebElement BibaBrandTitle;

    @FindBy(xpath = "//h2[@class='title text-center']")
    private WebElement SearchedProductTitle;

    @FindBy(xpath = "//div[@class='overlay-content']//p[contains(text(),'Blue Top')]")
    private WebElement SearchResultsForBlueTop;

    @FindBy(xpath = "//button[@type='button']")
    private WebElement AddToCartBlurTop;

    @FindBy(xpath = "//a[normalize-space()='View Product']")
    private WebElement ViewButtonBlueTop;

    @FindBy(xpath = "//div[@class='features_items']//div[2]//div[1]//div[1]//div[2]//div[1]//a[1]")
    private WebElement AddToCartFirstProduct;



    @FindBy(xpath = "//div[3]//div[1]//div[1]//div[2]//div[1]//a[1]")
    private WebElement AddToCart2Product;

    @FindBy(xpath = "//u[normalize-space()='View Cart']")
    private WebElement ViewCart;








    public ProductsPage checkAllProductsTitle() {
        String text = AllProductsTitle.getText();
        Assert.assertEquals(text, "ALL PRODUCTS");
        return new ProductsPage(driver);
    }

    public ProductsPage checkProductsVisibility() {
        ProductsVisibility.isDisplayed();
        return new ProductsPage(driver);
    }

    public ProductDetailsPage clickViewProduct1() {
        ViewProduct1Button.click();
        return new ProductDetailsPage(driver);
    }

    public ProductsPage enterProductNameAndSearch() {
        SearchField.sendKeys("Stylish Dress");
        SearchButton.click();
        return new ProductsPage(driver);
    }

    public ProductsPage checkProductNameResult() {
        Searchresult.isDisplayed();

        return new ProductsPage(driver);
    }

    public ProductsPage hover1Product() {
        Actions action = new Actions(driver);
        action.moveToElement(ViewProduct1Button);
        return new ProductsPage(driver);

    }

    public ViewCartPage clickAddToCart12AndViewCart() {

        Actions action = new Actions(driver);
        action.moveToElement(ViewProduct1Button);
        AddButton1.click();
        ContinueButton.click();
        Actions action2 = new Actions(driver);
        action2.moveToElement(AddButton2).perform();

        AddButton2.click();
        ViewCartButton.click();

        return new ViewCartPage(driver);
    }

    public ProductDetailsPage clickProduct1() {
        ViewProduct1Button.click();
        return new ProductDetailsPage(driver);
    }
    public ViewCartPage clickProduct11() {
        ViewProduct1Button.click();
        return new ViewCartPage(driver);
    }

    public ViewCartPage clickAddToCartAndCart() {




        AddToCartProductPage.click();
        CartButton.click();

        return new ViewCartPage(driver);

    }
    public ProductsPage checkWomenDressTitle(){
        WomenDressProducttitle.isDisplayed();
        String text = WomenDressProducttitle.getText();
        Assert.assertEquals(text,"WOMEN - DRESS PRODUCTS");
        return new ProductsPage(driver);

    }
    public ProductsPage clickMenCategory(){
        MenCategory.click();

        return new ProductsPage(driver);
    }
    public ProductsPage clickJeansMenCategory() {
        JeansMenCategory.click();

        return new ProductsPage(driver);

    }

    public ProductsPage checkMenCategoryTitle(){
        MenCategoryTitle.isDisplayed();

        return new ProductsPage(driver);
    }

    public ProductsPage checkBrandsTitle(){
        BrandsTitle.isDisplayed();
        String text =BrandsTitle.getText();
        Assert.assertEquals(text,"BRANDS");
        return new ProductsPage(driver);
    }

    public ProductsPage clickPoloBrand(){
        PoloBrandButton.click();
        return new ProductsPage(driver);

    }
    public ProductsPage checkBrandPagePolo(){
        PoloBrandTitle.isDisplayed();
        return new ProductsPage(driver);
    }

    public ProductsPage clickBibaBrand(){
      BibaBrandButton.click();
        return new ProductsPage(driver);
    }
     public ProductsPage checkBibaBrandTitlePage(){
       BibaBrandTitle.isDisplayed();
        return new ProductsPage(driver);
     }

     public ProductsPage clickSearchFieldForBlueTop(){
        SearchField.sendKeys("Blue Top");
        SearchButton.click();
        return new ProductsPage(driver);
     }

     public ProductsPage checkSearchproductTitle(){
        SearchedProductTitle.isDisplayed();
        return new ProductsPage(driver);

     }
     public ProductsPage checkAllProductRelatedToThesearch(){
        String text = SearchResultsForBlueTop.getText();
        Assert.assertEquals(text, "");
        return new ProductsPage(driver);
     }
     public ViewCartPage clickonAddToCartAndCart(){
        ViewButtonBlueTop.click();
        AddToCartBlurTop.click();
        ContinueButton.click();
        CartButton.click();
        return new ViewCartPage(driver);
     }

     public ProductsPage hoverAndClickProduct1And2(){
        Actions actions = new Actions(driver);
        actions.clickAndHold(AddToCartFirstProduct);


        Actions actions2 = new Actions(driver);
        actions2.click(AddToCart2Product).click(ContinueButton);

        return new ProductsPage(driver);
     }

     public ProductsPage checkItemsInCart(){



        return new ProductsPage(driver);
     }




     }


