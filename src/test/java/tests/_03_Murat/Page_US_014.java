package _03_Murat;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class Page_US_014 {

    public Page_US_014(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "//li[@class='d-none d-lg-inline line-left']")
    public WebElement signInButton;

    @FindBy(xpath = "(//input[@class='form-control form-control-text'])[1]")
    public WebElement eMailButton;

    @FindBy(xpath = "//button[@class='btn btn-green w-100']")
    public WebElement signInButtonConfirm;

    @FindBy(xpath = "//button[@class='el-button el-button--default is-round w-100']")
    public WebElement cookiesButton;

    @FindBy(xpath = "//li[@class='d-none d-lg-inline']")
    public WebElement nameButton;

    @FindBy(xpath = "//a[@class='dropdown-item with-icon-account']")
    public WebElement manageMyAccountButton;

    @FindBy(xpath = "//a[@class='dropdown-item with-icon-orders']")
    public WebElement myOrdersButton;

    @FindBy(xpath = "//li[@class='user-change-password']")
    public WebElement changePasswordButton;

    @FindBy(xpath = "(//label[@class='required'])[1]")
    public WebElement oldPasswordButton;

    @FindBy(xpath = "//button[@class='mt-3 btn btn-green w-100']")
    public WebElement changePasswordSubmitButton;

    @FindBy(xpath = "//a[@class='dropdown-item with-icon-addresses']")
     public WebElement adressButton;

    @FindBy(xpath = "(//a[@class='btn normal small'])[2]")
    public WebElement adressDeleteButton;

    @FindBy(xpath = "//button[@class='btn btn-green small pl-4 pr-4 bootbox-accept']")
    public WebElement adressDeleteConfirmButton;

    @FindBy(xpath = "//a[@class='dropdown-item with-icon-payments']")
    public WebElement paymentsOptionsButton;

    @FindBy(xpath = "(//a[@class='btn normal small'])[2]")
    public WebElement paymentDeleteButton;

    @FindBy(xpath = "//a[@class='dropdown-item with-icon-logout']")
    public WebElement logoutButton;

}
