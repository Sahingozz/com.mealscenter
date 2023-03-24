package tests._03_Murat;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class Page_US_013 {

    public Page_US_013(){
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

    @FindBy(xpath = "(//h6[@class='m-0'])[1]")
    public WebElement newOrleansButton;

    @FindBy(xpath = "//button[@class='el-button el-button--default is-round w-100']")
    public WebElement cookiesButton;

    @FindBy(xpath = "(//h5[@class='m-0 text-truncate'])[10]")
    public WebElement veganSeasonButton;

    @FindBy(xpath = "(//div[@class='position-relative quantity-wrapper'])[2]")
    public WebElement vegSamosaAddButton;

    @FindBy(xpath = "(//div[@class='modal-footer justify-content-start'])[9]")
    public WebElement newOrderButton;

    @FindBy(xpath = "//a[@class='btn btn-green w-100 pointer d-flex justify-content-between']")
    public WebElement checkOutButton;

    @FindBy(xpath = "(//span[@class='mr-1'])[3]")
    public WebElement stripeButton;

    @FindBy(xpath = "//div[@class='CardField-input-wrapper']")
    public WebElement cartNoButton;

    @FindBy(xpath = "(//span[@class='label'])[11]")
    public WebElement addStripeButton;

    @FindBy(xpath = "//button[@class='btn btn-green w-100 pointer']")
    public WebElement placeOrderButton;




}
