package pages;

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


}
