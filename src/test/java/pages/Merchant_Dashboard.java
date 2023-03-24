package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class Merchant_Dashboard {

   public Merchant_Dashboard() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    //Merchant panel login username
    @FindBy(xpath = "//input[@placeholder=\"Username\"]")
    public WebElement merchantUsernameLogin;

    //Merchant panel login password
    @FindBy(xpath = "(//label[@class=\"required\"])[2]")
    public WebElement merchantPasswordLogin;

    //Merchant panel login Sign in
    @FindBy(xpath = "//input[@type=\"submit\"]")
    public WebElement merchantSignInLoginButton;

    //Merchant Dashboard Order link
    @FindBy(xpath = "(//a[text()=\"Orders\"])[1]")
    public WebElement merchantOrderLink;

    //Merchant Dashboard Scheduled link
    @FindBy(xpath = "//a[text()='Scheduled']")
    public WebElement merchantScheduledLink;

    //Merchant>Orders>Scheduled/Delivery Date Time
    @FindBy(xpath = "//p[@class=\"m-0 text-muted\"]")
    public WebElement merchantScheduledDeliveryDateTime;

    //Merchant>All Orders link
    @FindBy(xpath = "//a[text()='All Orders']")
    public WebElement merchantAllOrdersLink;

    //Merchant>All Orders/Orders Amount
    @FindBy(xpath = "(//div[@class=\"bg-light p-3 mb-3 rounded\"])[1]")
    public WebElement merchantOrdersAmount;

    //Dashboard>Attributes link
    @FindBy(xpath = "//a[text()='Attributes']")
    public WebElement attributesLink;

    //Dashboard>Attributes>Size link
    @FindBy(xpath = "//a[text()='Size']")
    public WebElement attributesSizeLink;

    //Dashboard>Attributes>Ingredients link
    @FindBy(xpath = "//a[text()='Ingredients']")
    public WebElement attributesIngredientsLink;

    //Dashboard>Attributes>Cooking Reference link
    @FindBy(xpath = "//a[text()='Cooking Reference ']")
    public WebElement attributesCookingReferenceLink;

    //Dashboard> Add new Button
    @FindBy(xpath = "//a[@type=\"button\"]")
    public WebElement addNewButton;

    //Dashboard>Name Box1
    @FindBy(xpath = "(//input[@class=\"form-control form-control-text\"])[1]")
    public WebElement nameBox;

    //Dashboard>Name Box1
    @FindBy(xpath = "(//input[@class=\"form-control form-control-text\"])[2]")
    public WebElement nameBox2;

    //Dashboard>Name Box3
    @FindBy(xpath = "(//input[@class=\"form-control form-control-text\"])[2]")
    public WebElement nameBox3;

    //Dashboard>ddm1
    @FindBy (xpath = "//select[@class=\"form-control custom-select form-control-select\"]")
    public WebElement ddm1;

    //Dashboard>ddm2
    @FindBy(xpath = "(//select[@class=\"form-control custom-select form-control-select\"])[2]")
    public WebElement ddm2;

    //Dashboard>Promo>Coupon>AllCoupon/Coupon Options ddm
    @FindBy(xpath = "//select[@class=\"form-control custom-select form-control-select coupon_options\"]")
    public WebElement couponOptions_ddmX;

    //Dashboard>Attributes>Size & Ingredients & Cooking Reference /Save button
    @FindBy(xpath = "//input[@class=\"btn btn-green btn-full mt-3\"]")
    public WebElement saveButton;

    //Dashboard>Attributes>Size & Ingredients & Cooking Reference /Showing .. entries
    @FindBy(xpath = "//div[@role=\"status\"]")
    public WebElement showingEntries;

    //Dashboard>Promo link
    @FindBy(xpath = "//a[text()='Promo']")
    public WebElement promoLink;

    //Dashboard>Promo>Coupon link
    @FindBy(xpath = "//a[text()='Coupon']")
    public WebElement couponLink;

    //Dashboard>Promo>Offers link
    @FindBy(xpath = "//a[text()='Offers']")
    public WebElement offersLink;

    //Dashboard>Promo>Coupon>AllCoupon/Days Available Box
    @FindBy(xpath = "//span[@role=\"combobox\"]")
    public WebElement daysAvailableBox;

    //Dashboard>Promo>Coupon>AllCoupon/Expriration17
    @FindBy(xpath = "(//td[@class=\"available\"])[23]")
    public WebElement expriration17;




}

