package _03_Murat;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class Page_US_011 {

    public Page_US_011(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "//li[@class='d-none d-lg-inline line-left']")
    public WebElement signInButton;

    @FindBy(xpath = "(//input[@class='form-control form-control-text'])[1]")
    public WebElement eMailButton;

    @FindBy(xpath = "//button[@class='btn btn-green w-100']")
    public WebElement signInButtonConfirm;

    @FindBy(xpath = "(//input[@class='form-control form-control-text'])[1]")
    public WebElement searchButton;

    @FindBy(xpath = "(//h6[@class='m-0'])[1]")
    public WebElement newOrleansButton;

    @FindBy(xpath = "//button[@class='el-button el-button--default is-round w-100']")
    public WebElement cookiesButton;

    @FindBy(xpath = "(//div[@class='el-image'])[1]")
    public WebElement elevenButton;

    @FindBy(xpath = "(//div[@class='position-relative quantity-wrapper'])[2]")
    public WebElement redBullButton;

    @FindBy(xpath = "(//div[@class='el-image'])[4]")
    public WebElement kosherRestaurantButton;

    @FindBy(xpath = "(//div[@class='el-image'])[7]")
    public WebElement starbucksButton;

   @FindBy(xpath = "(//div[@class='position-relative quantity-wrapper'])[1]")
    public WebElement caffeMistroButton;

     @FindBy(xpath = "(//div[@class='el-image'])[10]")
     public WebElement burgerKingButton;

     @FindBy(xpath = "(//div[@class='position-relative quantity-wrapper'])[3]")
    public WebElement whopperMenuButton;

     @FindBy(xpath = "(//div[@class='flex-col'])[8]")
    public  WebElement checkoutButton;



}
