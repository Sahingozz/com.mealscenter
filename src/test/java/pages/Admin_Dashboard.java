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
    @FindBy(xpath = "//h5[text()='148']")
    public WebElement adminReportsOrderEarningsCount;


}
