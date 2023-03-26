package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class Merchant_Dashboard {

    public Merchant_Dashboard(){
        PageFactory.initElements(Driver.getDriver(),this);
    }
    //----------------------------------------------------------------------------------------
    //merchant login icin gerekli username locateri
    @FindBy(xpath = "//input[@placeholder='Username']")
    public static WebElement merchantLoginUsername;
    //merchant login icin gerekli password locateri
    @FindBy(xpath = "//input[@placeholder='Password']")
    public WebElement merchantLoginPassword;
    ////merchant login icin gerekli sign in  locateri
    @FindBy(xpath = "//input[@value=\"Sign in\"]")
    public WebElement merchantLoginSignin;

    //Dashboard buttonun soldaa bulunan locateri.
    @FindBy(xpath = "//a[text()='Dashboard']")
    public WebElement dashboardButtonu;
    //order Type Buttonu icin gerekli olan locater
    @FindBy(xpath = "//a[text()='Order Type']")
    public WebElement orderTypeLink;
    //Delivery icin gerekli olan locater
    @FindBy(xpath = "//a[text()='Delivery']")
    public WebElement deliveryLink;
    //Delivery sayfasinda settings linki icin gerekli olan locater

    @FindBy(xpath = "(//i[@class=\"zmdi zmdi-settings\"])[1]")
    public WebElement settingsLink;
    //enabeld buttonu icin gerekli olan locater
    @FindBy(xpath = "//label[@for=\"merchant_opt_contact_delivery\"]")
    public WebElement enabledLink;
    // free delivery icin gerekli olan link locateri

    @FindBy(xpath = "//label[@for=\"free_delivery_on_first_order\"]")
    public WebElement freeDeliveryLink;
    //Diynamik Rates  buttonu icin gerekli olan locater
    @FindBy(xpath = "//select[@id='AR_option_merchant_delivery_charges_type']")
    public WebElement dynamicRates;
    //Fixed charge buttonu icin gerekli olan locater
    @FindBy(xpath = "//select[@class=\"form-control custom-select form-control-select merchant_delivery_charges_type\"]")
    public WebElement fixedChargeSelect;
    //save buttonu icin gerekli olan locater

    //service free  buttonu icin gerekli olan locater
    @FindBy(xpath = "//label[@for='AR_option_merchant_service_fee']")
    public WebElement serviceFee;
    // buttonu icin gerekli olan locater
    @FindBy(xpath = "//input[@id='AR_option_merchant_service_fee']")
    public WebElement serviceFee2;
    // settingsaved icin gerekli olan locater
    @FindBy(xpath = "//div[@class='alert alert-success']")
    public WebElement settingSavedText;

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

    //--------------------------------------------------

    // Dashboard>Orders
    @FindBy(xpath = "//a[text()='Orders'][1]")
    public WebElement orders;

    //Dashboard>New Orders
    @FindBy (xpath= "//li[@class='position-relative orders_new']")
    public WebElement newOrders;

    //Dashboard>New Order>Accepted
    @FindBy (xpath = "//span[text()='Accepted']")
    public WebElement acceptedButton;

    //Dashboard>New Order>Reject
    @FindBy (xpath = "//span[text()='Reject']")
    public WebElement reject;

    //Dashboard>New Order>Other Button
    @FindBy (xpath = "//a[text()='other']")
    public WebElement otherButton;

    //Dashboard>New Order>Reject Other
    @FindBy (xpath = " //span[text()='Reject order']")
    public WebElement rejectOther;
















}

