package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class Merchant_Dashboard {



        public Merchant_Dashboard(){
            PageFactory.initElements(Driver.getDriver(),this);

        }



        //Merchant Dashboard/sign In
        @FindBy(xpath = "//input[@value='Sign in']")
        public WebElement merchantLoginSignin;

        //Merchant Dashboard>sign In/merchant login text
        @FindBy(xpath = "(//*[text()='Merchant Login'])[2]")
        public WebElement merchantLoginText;

        //Merchant Dashboard>sign In/merchant dropdown menu button
        @FindBy(xpath = "//*[text()='Merchant']")
        public WebElement merchantDropdownMenuButton;


        //Merchant Dashboard/Incorrect username or password text
        @FindBy(xpath = "//*[text()='Incorrect username or password.']")
        public WebElement incorrectMessageText;


        //Merchant Dashboard/forgot password text
        @FindBy(xpath = "//*[@class='dim underline']")
        public WebElement forgotPasswordLink;


        //Merchant Dashboard>forgot password text/Email checkbox
        @FindBy(xpath = "//label[@for='AR_merchant_login_email_address']")
        public WebElement forgotPasswordEmailCheckbox;



        //Merchant Dashboard>forgot password text/forgotPasswort Link RequestEmailButton
        @FindBy(xpath = "//input[@type='submit']")
        public WebElement forgotPasswortLinkRequestEmailButton;


        @FindBy(xpath = "//body/div[1]/div[1]/div/div[4]")
        public WebElement merchantMenuElements;

        @FindBy(xpath = "(//*[text()='Dashboard'])[2]")
        public WebElement dashboardPanelButton;






    //----------------------------------------------------------------------------------------
    //merchant login icin gerekli username locateri
    @FindBy(xpath = "//input[@placeholder='Username']")
    public static WebElement merchantLoginUsername;
    //merchant login icin gerekli password locateri
    @FindBy(xpath = "//input[@placeholder='Password']")
    public WebElement merchantLoginPassword;

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


    //-----------------Ersin---------------------------------

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

    @FindBy (xpath = "//h5[text()='Order Details will show here']")
    public WebElement acceptedOk;

    @FindBy (xpath = "//button[text()='Print']")
    public WebElement print;

    @FindBy (xpath = "//*[@id=\"vue-order-management\"]/div[8]/div[2]/div[13]/div/div/div[3]/button[2]")
    public WebElement printButton;

    @FindBy (xpath = "/html/body/div[1]/div[2]/div/div/div[1]/div[8]/div[2]/div[4]/div/div[1]/div[2]/div/div[2]/div/a")
    public  WebElement threePointButton;

    @FindBy (xpath = "//a[text()= 'Contact customer']")
    public WebElement contactCustomer;

    @FindBy (xpath = "//a[text()= 'Delay Order']")
    public WebElement delayOrder;

    @FindBy (xpath = "//a[text()= 'Cancel order']")
    public WebElement cancelOrder;

    @FindBy (xpath = "//a[text()= 'Timeline']")
    public WebElement timeline;

    @FindBy (xpath = "//*[@id=\"vue-order-management\"]/div[8]/div[2]/div[4]/div/div[1]/div[2]/div/div[2]/div/div/a[4]")
    public WebElement downloadPdf;

    @FindBy (xpath = "//button[text()='Assign Driver']")
    public WebElement assignButton;

    @FindBy (xpath= "//*[@id=\"yw0\"]/li[3]/ul/li[2]/a")
    public WebElement ordersProcessing;

    @FindBy (xpath= "//span[text()='Ready for pickup']")
    public WebElement readyForPickup;

    @FindBy (xpath= "//*[@id=\"yw0\"]/li[3]/ul/li[3]/a")
    public WebElement ordersReady;

    @FindBy (xpath= "//*[@id=\"vue-order-management\"]/div[8]/div[2]/div[4]/div/div[2]/div[1]/div[1]/div[2]/div/div[2]/h6")
    public WebElement deliveryOnItsWayOk;

    @FindBy (xpath= " //span[text()='Delivery on its way']")
    public WebElement deliveryOnItsWay;

    @FindBy (xpath= " //span[text()='Delivered']")
    public WebElement delivered;

    @FindBy (xpath= " //*[@id=\"vue-order-management\"]/div[8]/div[2]/div[4]/div/div[1]/div[1]/button[3]/span")
    public WebElement deliveryFailed;

    @FindBy (xpath= " //*[@id=\"yw0\"]/li[3]/ul/li[4]/a")
    public WebElement completed;

    @FindBy (xpath= " //h5[text()='Completed Today']")
    public WebElement completedToday;



    //----------------------------------------


    //Merchant panel login password 2
    @FindBy(xpath = "//*[@id=\"AR_merchant_login_password\"]")
    public WebElement merchantPasswordLogin2;

    //Merchant Dashboard/ successfull Login Element
    @FindBy(xpath = "//img[@class='img-200']")
    public WebElement successfullLoginElement;
    //Merchant Dashboard>Stephanie Eleven
    @FindBy(xpath = "(//*[@id=\"dropdownMenuLink\"])[1]")
    public WebElement profilDropdownmenu;
    // Merchant Dashboard>Stephanie Eleven/profil
     @FindBy(xpath = "//*[@class='dropdown-item']")
    public WebElement profile;
   // Merchant Dashboard>Stephanie Eleven>profil/FirstName
     @FindBy(xpath = "//*[@id=\"AR_merchant_user_first_name\"]")
    public WebElement merchanProfileFirstName;
   // Merchant Dashboard>Stephanie Eleven>profil/LastName
   @FindBy(xpath = "//*[@id=\"AR_merchant_user_last_name\"]")
   public WebElement merchanProfileLastName;
 // Merchant Dashboard>Stephanie Eleven>profil/Email address
 @FindBy(xpath = "//*[@id=\"AR_merchant_user_contact_email\"]")
 public WebElement merchanProfileEmailAdresse;
 // Merchant Dashboard>Stephanie Eleven>profil/ContactNumber
 @FindBy(xpath = "//*[@id=\"AR_merchant_user_contact_number\"]")
 public WebElement merchanProfileContactNumber;
 // Merchant Dashboard>Stephanie Eleven>profil/SaveButton
 @FindBy(xpath = "//*[@value=\"Save\"]")
 public WebElement merchanProfileSaveButton;

 // Merchant Dashboard>Stephanie Eleven>profil/Change Password
 @FindBy(xpath = "(//*[text()='Change Password'])[1]")
 public WebElement profilechange_passwort;
 // Merchant Dashboard>Stephanie Eleven>profil>Change Password/Old Password
 @FindBy(xpath = "//*[@id=\"AR_merchant_user_old_password\"]")
 public WebElement profilechange_OldPassword;
 // Merchant Dashboard>Stephanie Eleven>profil>Change Password/New Password
 @FindBy(xpath = "//*[@id=\"AR_merchant_user_new_password\"]")
 public WebElement profilechange_NewPassword;
 // Merchant Dashboard>Stephanie Eleven>profil>Change Password/Confirm Password
 @FindBy(xpath = "//*[@id=\"AR_merchant_user_repeat_password\"]")
 public WebElement profilechange_ConfirmPassword;
 // Merchant Dashboard/Total Orders
 @FindBy(xpath = "//*[@class=\"rounded-status-report rounded r1\"]")
 public WebElement totalOrders;

 // Merchant Dashboard/Total Cancel
 @FindBy(xpath = "//*[@class=\"rounded-status-report rounded r2\"]")
 public WebElement totalCancel;

 // Merchant Dashboard/Total Refund
 @FindBy(xpath = "//*[@class=\"rounded-status-report rounded r3\"]")
 public WebElement totalRefund;

 // Merchant Dashboard/Total Sales
 @FindBy(xpath = "//*[@class=\"rounded-status-report rounded r4\"]")
 public WebElement totalSales;

 // Merchant Dashboard/Sales this week
 @FindBy(xpath = "//*[text()='Sales this week']")
 public WebElement SalesThisWeek;

 // Merchant Dashboard/Earning this week
 @FindBy(xpath = "//*[text()='Earning this week']")
 public WebElement EarningThisWeek;

 // Merchant Dashboard/Order received
 @FindBy(xpath = "//*[text()='Order received']")
 public WebElement OrderReceived;

 // Merchant Dashboard/Today delivered
 @FindBy(xpath = "//*[text()='Today delivered']")
 public WebElement TodayDelivered;

 // Merchant Dashboard/Today sales
 @FindBy(xpath = "//*[text()='Today sales']")
 public WebElement TodaySales;

 // Merchant Dashboard/Today refund
 @FindBy(xpath = "//*[text()='Today refund']")
 public WebElement TodayRefund;

 // Merchant Dashboard/Top Customers
 @FindBy(xpath = "//*[text()='Top Customers']")
 public WebElement TopCustomers;

 // Merchant Dashboard/Popular items
 @FindBy(xpath = "(//*[text()='Popular items'])[1]")
 public WebElement PopularItems;

 // Merchant Dashboard/Overview of Review
 @FindBy(xpath = "//*[text()='Overview of Review']")
 public WebElement OverviewOfReview;


 // Merchant Dashboard/Food
 @FindBy(xpath = "//*[text()='Food']")
 public WebElement FoodLink;

 // Merchant Dashboard/Food
 @FindBy(xpath = "//*[text()='Category']")
 public WebElement CategoryLink;

 @FindBy(xpath = "(//*[text()='Category List'])[2]")
 public WebElement CategoryList;





}


