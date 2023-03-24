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

}
