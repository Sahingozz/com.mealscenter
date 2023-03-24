package tests._03_Murat;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class Page_US_011 {

    public Page_US_011(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    // Homepage panel> sign  in button
    @FindBy(xpath = "//li[@class='d-none d-lg-inline line-left']")
    public WebElement signInButton;

    // Homepage panel> sign in > eMail button
    @FindBy(xpath = "(//input[@class='form-control form-control-text'])[1]")
    public WebElement eMailButton;

    // Homepage panel> sign in confirm
    @FindBy(xpath = "//button[@class='btn btn-green w-100']")
    public WebElement signInButtonConfirm;

    // Homepage panel > search button
    @FindBy(xpath = "(//div[@class='position-relative search-geocomplete'])[1]")
    public WebElement searchButton;

    // Homepage panel > search button >
    @FindBy(xpath = "(//h6[@class='m-0'])[1]")
    public WebElement newOrleansButton;

    // Homepage panel > search button > cookies button
    @FindBy(xpath = "//button[@class='el-button el-button--default is-round w-100']")
    public WebElement cookiesButton;

    // Homepage panel > search button > eleven button
    @FindBy(xpath = "(//div[@class='el-image'])[1]")
    public WebElement elevenButton;

    // Homepage panel > search button > eleven button > redbul
    @FindBy(xpath = "(//div[@class='position-relative quantity-wrapper'])[2]")
    public WebElement redBullButton;

    // Homepage panel > search button > kosher restaurant
    @FindBy(xpath = "(//div[@class='el-image'])[4]")
    public WebElement kosherRestaurantButton;

    // Homepage panel > search button > Starbucks Caffe
    @FindBy(xpath = "(//div[@class='el-image'])[7]")
    public WebElement starbucksButton;

    // Homepage panel > search button > Starbucks Caffe > Caffe Mistro
   @FindBy(xpath = "(//div[@class='position-relative quantity-wrapper'])[1]")
    public WebElement caffeMistroButton;

    // Homepage panel > search button > Burger King
     @FindBy(xpath = "(//div[@class='el-image'])[10]")
     public WebElement burgerKingButton;


    // Homepage panel > search button > Burger King > Whopper Menu
     @FindBy(xpath = "(//div[@class='position-relative quantity-wrapper'])[3]")
    public WebElement whopperMenuButton;

    // Homepage panel > search button > Burger King > checkout button
     @FindBy(xpath = "(//div[@class='flex-col'])[8]")
    public  WebElement checkoutButton;



}
