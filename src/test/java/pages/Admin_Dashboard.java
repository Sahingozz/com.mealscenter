package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class Admin_Dashboard {

    public Admin_Dashboard () {
        PageFactory.initElements(Driver.getDriver(),this);
    }

    //Admin panel login username
    @FindBy (xpath = "//input[@id='LoginForm_username']")
    public WebElement adminUsernameLogin;

    //Admin panel login password
    @FindBy (xpath = "//input[@id='LoginForm_password']")
    public WebElement adminPasswordLogin;

    //Admin panel Login Sign In Butonu
    @FindBy (xpath = "//input[@type='submit']")
    public WebElement adminLoginSignInButton;

    // Admin Dashboard Order WebElementi
    @FindBy (xpath = "//li[@class='admin_orders']")
    public WebElement adminOrderLink;

    // Admin Dashboard All Order WebElementi
    @FindBy (xpath = "//a[@href='/backoffice/order/list']")
    public WebElement adminAllOrderLink;

    // Admin Dashboard All Order Text on the list page
    @FindBy (xpath = "//h5[text()='All Orders']")
    public WebElement allOrderListText;

    // Admin Dashboard All Order -> 'Cancel' Text
    @FindBy (xpath = "//p[text()='Cancel']")
    public WebElement cancelledOrderText;

    // Admin Dashboard All Order -> cancelled order 'Number'
    @FindBy (xpath = "(//h5[@class='m-0'])[2]")
    public WebElement cancelledOrderNumber;

    // Admin Dashboard All Order -> 'Total Refund' Text
    @FindBy (xpath = "//p[text()='Total refund']")
    public WebElement totalRefundText ;

    // Admin Dashboard All Order -> total Refund 'Number'
    @FindBy (xpath = "(//h5[@class='m-0'])[3]")
    public WebElement totalRefundNumber;

    // Admin Dashboard All Order -> 'Total Orders' Text
    @FindBy (xpath = "//p[text()='Total Orders']")
    public WebElement totalValueOfOrdersText ;

    // Admin Dashboard All Order -> total orders 'Value'
    @FindBy (xpath = "(//h5[@class='m-0'])[4]")
    public WebElement totalValueOfOrders;

    //Admin Dashboard All order -> start-date-end-date
    @FindBy (xpath = "//input[@placeholder='Start date -- End date']")
    public WebElement ordersStartEndDate ;

    //Admin Dashboard All Order -> date search result element

    @FindBy (xpath = "//div[@class='dataTables_info']")
    public WebElement searchResults ;

    // Admin Dashboard > Reports WebElementi
    @FindBy(xpath = "//a[text()='Reports']")
    public WebElement adminReports;

    //Admin Dashboard Reports > Merchant Sales WebElementi
    @FindBy(xpath = "//a[text()='Merchant Sales']")
    public WebElement adminReportsMerchantSales;

    //Admin Dashboard Reports > Merchant Sales > Sari Renkli filtreleme WebElementi
    @FindBy (xpath = "//i[@class='zmdi zmdi-filter-list']")
    public  WebElement adminReportsMerchantSalesYellowFilter;

    //Admin Dashboard Reports > Merchant Sales > Sari Renkli filtreleme > By Merchant yazisi
    @FindBy(xpath = "//b[text()='By Merchant']")
    public WebElement adminFilterByMerchantText;

    //Admin Dashboard Reports > Merchant Sales > Sari Renkli filtreleme > Apply Filters
    @FindBy(xpath = "//button[@class='btn btn-green w-100']")
    public WebElement adminFiltersApply;

    //Admin Dashboard Reports > Merchant Sales > Merchant Sutunu
    @FindBy (xpath = "//*[@id=\"DataTables_Table_0\"]/tbody/tr[1]/td[4]")
    public WebElement adminMerchantColumn;

    //Admin Dashboard Reports > Merchant Sales > Order ID
    @FindBy(xpath = "//th[text()='Order ID']")
    public WebElement adminReportsMerchantSalesOrderID;

    //Admin Dashboard Reports > Merchant Sales > Start and End Date
    @FindBy (xpath = "//input[@placeholder=\"Start date -- End date\"]")
    public WebElement adminStartandEndDate;

    //Admin Dashboard Reports > Merchant Sales > Arama Sonucu Text
    @FindBy (xpath = "(//td[@class='sorting_1'])[1]")
    public WebElement adminFirstElementofSearchResultText;

    //Admin Dashboard Reports > Order Earnings
    @FindBy(xpath = "//a[text()='Order earnings']")
    public WebElement adminReportsOrderEarnings;

    //Admin Dashboard : Start and End Date > Last 7 Days
    @FindBy(xpath = "//li[@data-range-key='Last 7 Days']")
    public WebElement adminDateLast7Days;

    //Admin Dashboard Reports > Order Earnings > Arama Sonucu Order ID
    @FindBy(xpath = "(//tr[@class='odd'])[1]")
    public WebElement adminFirstElementofSearchResultOrderID;

    ////Admin Dashboard Reports > Order Earnings > Arama kutusu
    @FindBy(xpath = "(//div[@class=\"col-sm-12 col-md-6\"])[2]")
    public WebElement adminReportsOrderEarningsSearchBox;

    //Admin Dashboard Reports > Order Earnings > Subtotal
    @FindBy(xpath = "//th[text()='Subtotal']")
    public WebElement adminReportsSubtotal;

    //Admin Dashboard Reports > Order Earnings > Total
    @FindBy(xpath = "//th[text()='Total']")
    public WebElement adminReportsTotal;

    //Admin Dashboard Reports > Order Earnings > Merchant Earnings
    @FindBy(xpath = "//th[text()='Merchant Earnings']")
    public WebElement adminReportsMerchantEarnings;

    //Admin Dashboard Reports > Order Earnings > Admin commission
    @FindBy(xpath = "//th[text()='Admin commission']")
    public WebElement adminReportsAdminCommission;

    //Admin Dashboard Reports > Order Earnings > Count: ?
    @FindBy(xpath = "(//h5[@class='m-0'])[1]")
    public WebElement adminReportsOrderEarningsCount;

    //------------------------------------------

    // Admin Dashboard ->Order>All order > Order by ID butonu
    @FindBy (xpath = "//th[text()='Order ID']")
    public WebElement sortByOrderIDButton ;

    // Admin Dashboard ->Order->All order > Download any order butonu

    @FindBy (xpath = "(//i[@class='zmdi zmdi-download'])[1]")
    public WebElement orderDownloadButton ;

    // Admin Dashboard -> Earnings butonu

    @FindBy (xpath = "//a[text()='Earnings']")
    public WebElement earningsButton;

    // Admin Dashboard -> Earnings -> Merchant Earnings butonu

    @FindBy (xpath = "//a[text()='Merchant Earnings']")
    public WebElement merchantEarningsButton;

    //Admin Dashboard ->Earnings->Merchant Earnings->Merchant Earnings Text
    @FindBy (xpath = "//h5[text()='Merchant Earnings']")
    public WebElement merchantEarningsText;

    //Admin Dashboard ->Earnings->Merchant Earnings->Merchant Earnings Text
    @FindBy (xpath = "//th[text()='Balance']")
    public WebElement balanceText ;

    //Admin Dashboard ->Earnings->Merchant Earnings->Merchant Text Button
    @FindBy (xpath = "//th[text()='Merchant']")
    public WebElement merchantText ;

    //Admin Dashboard ->Earnings->Merchant Earnings->Actions Eye Button
    @FindBy (xpath = "//i[@class='zmdi zmdi-eye']")
    public WebElement actionsEyeButton;

    //Admin Dashboard -> Earnings ->Merchant Earnings ->Merchant Info Pop-up Text
    @FindBy (xpath = "//h6[text()='Merchant Info']")
    public WebElement merchantInfoText;

    //Admin Dashboard -> Earnings -> Merchant Earnings -> SearchField
    @FindBy (xpath = "(//div[@class='col-sm-12 col-md-6'])[2]")
    public WebElement merchantEarningsSearchField;

    //Admin meals center basligi
    @FindBy(xpath = "//img[@class=\"img-200\"]")
    public WebElement adminMealsCenter;
    // Sol ust kosede bulunan profil sahibinin isminin ve emailinin locateri
    @FindBy(xpath = "//div[@class='col-md-9 m-0 p-0']")
    public WebElement profilName;
    // sol ustte bulunan "Dashboard" buttonu locateri

    @FindBy(xpath = "//a[text()='Dashboard']")
    public WebElement dashboardButtonu;
//Total Sales bolumune ait locater
    @FindBy(xpath = "(//div[@class='report-inner'])[1]")
    public WebElement totalSalesButtonu;
    //Total Merchant  bolumune ait locater
    @FindBy(xpath = "(//div[@class='report-inner'])[2]")
    public WebElement totalMerchantButtonu;

    //Total Commission bolumune ait locater
    @FindBy(xpath = "(//div[@class='report-inner'])[3]")
    public WebElement totalCommissionButtonu;

    //Total Subscriptions bolumune ait locater
    @FindBy(xpath = "(//div[@class='report-inner'])[4]")
    public WebElement totalSubscriptionsButtonu;

    //Total merchant sayinin bulundugu  bolumune ait locater
    @FindBy(xpath = "//*[@id=\"vue-dashboard\"]/div[1]/div[2]/div/div/p")
    public WebElement totalMerchantsayiButtonu;

    //Today deliverd sayinin bulundugu  bolumune ait locater
    @FindBy(xpath = "(//div[@class='d-flex align-items-center'])[6]")
    public WebElement todayDeliverdLink;

    //Order recevierd sayfasinin bulundugu  bolume ait locater
    @FindBy(xpath = "(//div[@class='d-flex align-items-center'])[5]")
    public WebElement orderRecevedLink;

    //Total Refund sayfasinin bulundugu  bolume ait locater
    @FindBy(xpath = "(//div[@class='d-flex align-items-center'])[8]")
    public WebElement totalRefundLink;

    //New customer sayfasinin bulundugu  bolume ait locater
    @FindBy(xpath = "(//div[@class='d-flex align-items-center'])[7]")
    public WebElement newCustomerLink;

    //Sales overview  bolumune ait locater
    @FindBy(xpath = "(//div[@class='card-body'])[11]")
    public WebElement salesoverViewlink;

    //Dashboard altinda bulunan merchant buttonu
    @FindBy(xpath = "//li[@class='merchant']")
    public WebElement merchantButtonu;
    //Merchant altinda bulunan link buttonu
    @FindBy(xpath = "//li[@class='position-relative vendor_list']")
    public WebElement listButtonu;
    //All Merchant basligi ait locater

    @FindBy(xpath = "//a[@class=\"navbar-brand\"]")
    public WebElement allMerchantBasligi;
    //All merchant listesini edit etme locateri
    @FindBy(xpath = "(//a[@class='btn btn-light tool_tips'])[1]")
    public WebElement allMerchantListEdit;

    //All merchant listesini edit etme icin email isim kisminin  locateri
    @FindBy(xpath = "(//input[@class='form-control form-control-text'])[1]")
    public WebElement editEmailIsim;

    //Yaplan edit sonrasi yeni name degisiklik icin locater
    @FindBy(xpath = "(//tr[@class='odd'])[1]")
    public WebElement editName;

    //All Merchant listesinde bulunan silme buttonu
    @FindBy(xpath = "//a[@data-original-title=\"Delete\"]")
    public WebElement deleteButton;

//-------------------------------------------------------------
    //Admin Dashboard - > Promo Link
    @FindBy (xpath = "//a[text()='Promo']")
    public WebElement promoLink;

    //Admin Dashboard - > Promo Link -> Coupon Link
    @FindBy (xpath = "//a[text()='Coupon']")
    public WebElement couponLink;

    // Admin Dashboard -> Promo Link -> Coupon Link - > Add new Button
    @FindBy (xpath = "//i[@class='zmdi zmdi-plus']")
    public WebElement  addNewCouponButton ;

    // Admin Dashboard -> Promo->Cupon->Add new coupon->Coupon Name field
    @FindBy (xpath = "(//input[@type='text'])[1]")
    public WebElement addCouponNameField;

    // Admin Dashboard -> Promo -> Coupon -> Add new Coupon ->CouponType Drop Down Menu
    @FindBy (xpath = "//select[@class='form-control custom-select form-control-select']")
    public WebElement couponTypeDDM;

    // Admin Dashboard -> Promo -> Coupon -> Add new Coupon ->Coupon Amount Field
    @FindBy (xpath = "(//input[@type='text'])[2]")
    public WebElement couponAmountField;

    // Admin Dashboard -> Promo -> Coupon -> Add new Coupon ->Min Order Field
    @FindBy (xpath = "(//input[@type='text'])[3]")
    public WebElement minOrdertField;

    // Admin Dashboard -> Promo -> Coupon -> Add new Coupon ->Days Available DDM
    @FindBy (xpath = "//select[@class='form-control custom-select form-control-select " +
            "select_two select2-hidden-accessible']")
    public WebElement daysAvailableDDM;

    // Admin Dashboard -> Promo -> Coupon -> Add new Coupon -> Applicable merchants
    @FindBy (xpath = "//span[@aria-owns='select2-AR_voucher_apply_to_merchant-results']")
    public WebElement couponApplicableToMerchant;


    // Admin Dashboard -> Promo -> Coupon -> Add new Coupon ->coupon expiration date
    @FindBy (xpath = "//input[@id='AR_voucher_expiration']")
    public WebElement couponExpirationDDM ;

    // Admin Dashboard -> Promo -> Coupon -> Add new Coupon ->coupon expiration date
    @FindBy (xpath = "//td[@data-title='r5c5']")
    public WebElement couponExpiryDate;

    // Admin Dashboard -> Promo -> Coupon -> Add new Coupon ->coupon Options DDM
    @FindBy (xpath = "//select[@class='form-control custom-select form-control-select coupon_options']")
    public WebElement couponOptionsDDM;

    // Admin Dashboard -> Promo -> Coupon -> Add new Coupon ->coupon status drop down menu
    @FindBy (xpath = "//select[@id='AR_voucher_status']")
    public WebElement couponStatusDDM;

    // Admin Dashboard -> Promo -> Coupon -> Add new Coupon -> save button
    @FindBy (xpath = "//input[@value='Save']")
    public WebElement couponSaveButton ;

    // Admin Dashboard -> Promo -> Coupon -> Add new Coupon -> save ->Coupon Name Text
    @FindBy (xpath = "//*[text()='Fruehling Campaign ']")
    public WebElement couponNameText;

    // Admin Dashboard -> Promo -> Coupon -> Coupon List Text
    @FindBy (xpath = "//h5[text()='Coupon list']")
    public WebElement couponListText;

    // Admin Dashboard -> Promo -> Coupon -> Couponlist results text
    @FindBy (xpath = "//div[@class='dataTables_info']")
    public WebElement couponListResultsText;

    // Admin Dashboard -> Promo -> Coupon -> Coupon update button
    @FindBy (xpath = "(//a[@class='btn btn-light tool_tips'])[1]")
    public WebElement couponUpdateButton;


    // Admin Dashboard -> Promo -> Coupon -> Coupon delete button
    @FindBy (xpath = "(//a[@class='btn btn-light datatables_delete tool_tips'])[1]")
    public WebElement couponDeleteButton;

    // Admin Dashboard -> Promo -> Coupon -> Coupon list sort by name button

    @FindBy (xpath = "//th[text()='Name']")
    public WebElement couponSortByNameButton;

    // Admin Dashboard -> Promo -> Coupon -> Coupon list sort by usage button

    @FindBy (xpath = "//th[text()='#Used']")
    public WebElement couponSortByUsage;

    // Admin Dashboard -> Promo -> Coupon -> Coupon Search Field
    @FindBy (xpath = "//input[@placeholder='Search']")
    public WebElement couponSearchField;

    // Admin Dashboard -> Promo -> Coupon -> Coupon Search Button
    @FindBy (xpath = "//button[@class='submit input-group-text border-0 ml-2 normal']")
    public WebElement couponSearchButton;

    //Admin Dashboard ->Buyers ->Buyers Link
    @FindBy (xpath = "//a[text()='Buyers']")
    public WebElement buyersLink ;

    //Admin Dashboard ->Buyers -> Customers Link
    @FindBy (xpath = "//a[text()='Customers']")
    public WebElement customersLink ;

    //Admin Dashboard ->Buyers -> Customers List Text
    @FindBy (xpath = "//h5[text()='Customer list']")
    public WebElement customersListText ;

    //Admin dashboard -> Buyers -> Customers List -> Showing total entries text
    @FindBy (xpath = "//div[@id='DataTables_Table_0_info']")
    public WebElement customersListTotalEntries;

    //Admin dashboard -> Buyers -> Customers List -> sorting list by name
    @FindBy (xpath = "//th[text()='Name']")
    public WebElement customersListSortbyName;

    //Admin dashboard -> Buyers -> Customers List ->Add new customer button
    @FindBy (xpath = "//a[@class='btn btn-black btn-circle']")
    public WebElement addNewCustomerButton;

    //Admin dashboard -> Buyers -> Customers List -> new customer First Name
    @FindBy (xpath = "//input[@id='AR_client_first_name']" )
    public WebElement firstName ;

    //Admin dashboard -> Buyers -> Customers List -> new customer Last Name
    @FindBy (xpath = "//input[@id='AR_client_last_name']" )
    public WebElement lastName ;

    //Admin dashboard -> Buyers -> Customers List -> new customer email
    @FindBy (xpath = "//input[@id='AR_client_email_address']" )
    public WebElement emailAdresse ;

    //Admin dashboard -> Buyers -> Customers List -> new customer contactPhone
    @FindBy (xpath = "//input[@id='AR_client_contact_phone']" )
    public WebElement contactPhone ;

    //Admin dashboard -> Buyers -> Customers List -> new customer passWord
    @FindBy (xpath = "//input[@id='AR_client_npassword']" )
    public WebElement passWord ;

    //Admin dashboard -> Buyers -> Customers List -> new customer confirmPassword
    @FindBy (xpath = "//input[@id='AR_client_cpassword']" )
    public WebElement confirmPassWord ;

    //Admin ->DAshboard->Buyers->Customers->Add customer->Browse for photo upload
    @FindBy (xpath = "//button[text()='Browse']")
    public WebElement browseForPhotoUpload;

    //Admin ->DAshboard->Buyers->Customers->Add customer->Browse for photo upload->New Photo Upload
    @FindBy (xpath = "//a[text()='Upload New']")
    public WebElement newPhotoUpload;

    //Admin ->DAshboard->Buyers->Customers->Add customer->Browse for photo upload->New Photo Upload->Select Files
    @FindBy (xpath = "//a[@class='btn btn-green fileinput-button dz-clickable'")
    public WebElement selectFiles;

    //Admin ->DAshboard->Buyers->Customers->Add customer->Browse for photo upload
    // ->New Photo Upload->Select Files->AddFiles Butonu
    @FindBy (xpath = "//span[text()='Add Files']")
    public  WebElement addFilesButonu;

    //Admin ->DAshboard->Buyers->Customers->Add customer->customer status DDM
    @FindBy (xpath = "//select[@class='form-control custom-select form-control-select']")
    public WebElement newCustomerClassDDM;

    //Admin ->DAshboard->Buyers->Customers->Add customer->customer save Button
    @FindBy (xpath = "//input[@value='Save']")
    public WebElement newCustomerSaveButton;

    //Admin ->DAshboard->Buyers->Customers->Add customer->customer search Field
    @FindBy (xpath = "//input[@placeholder='Search']")
    public WebElement customerSearchField;

    //Admin ->DAshboard->Buyers->Customers->Add customer->customer search 1st result
    @FindBy (className = "odd")
    public WebElement customerSearch1stResult;

    //Admin dashboard -> Buyers -> Customers List -> updating customer Info
    @FindBy (xpath = "//a[@class='btn btn-light tool_tips']")
    public WebElement customerInfoUpdateButton;

    //Admin dashboard -> Buyers -> Customers List -> updating info save button
    @FindBy (xpath = "//input[@value='Save']")
    public WebElement customerInfoUpdateSaveButton;

    //Admin dashboard -> Buyers -> Customers List -> updated message
    @FindBy (xpath = "//div[@class='alert alert-success']")
    public WebElement updatedMessage;

    //Admin dashboard -> Buyers -> Customers List -> delete Customer
    @FindBy (xpath = "//a[@data-original-title='Delete']")
    public WebElement customerDeleteButton;

    //Admin dashboard -> Buyers -> Customers List -> delete Customer Confirm button
    @FindBy (xpath = "//a[@class='btn btn-green item_delete']")
    public WebElement customerDeleteConfirm;


}
