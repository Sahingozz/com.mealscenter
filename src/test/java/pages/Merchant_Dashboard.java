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
    public WebElement merchantLoginUsername;
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
    @FindBy(xpath = "//input[@class=\"btn btn-green btn-full mt-3\"]")
    public WebElement saveButton;
    //service free  buttonu icin gerekli olan locater
    @FindBy(xpath = "//label[@for='AR_option_merchant_service_fee']")
    public WebElement serviceFee;
    // buttonu icin gerekli olan locater
    @FindBy(xpath = "//input[@id='AR_option_merchant_service_fee']")
    public WebElement serviceFee2;
    // settingsaved icin gerekli olan locater
    @FindBy(xpath = "//div[@class='alert alert-success']")
    public WebElement settingSavedText;

}
