package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class Merchant_Dashboard {
    public Merchant_Dashboard(){
        PageFactory.initElements(Driver.getDriver(),this);
    }
    //merchant login icin gerekli username locateri
    @FindBy(xpath = "//label[@for='AR_merchant_login_username']")
    public WebElement merchantLoginUsername;
    //merchant login icin gerekli password locateri
    @FindBy(xpath = "//label[@for='AR_merchant_login_password']")
    public WebElement merchantLoginPassword;

    ////merchant login icin gerekli sign in  locateri
    @FindBy(xpath = "//input[@class='btn btn-green btn-full']")
    public WebElement merchantLoginSignin;

    @FindBy(xpath = "//a[text()='Order Type']")
    public WebElement orderTypeLink;

    @FindBy(xpath = "//a[text()='Delivery']")
    public WebElement deliveryLink;

    @FindBy(xpath = "(//i[@class=\"zmdi zmdi-settings\"])[1]")
    public WebElement settingsLink;

    @FindBy(xpath = "//label[@for=\"merchant_opt_contact_delivery\"]")
    public WebElement enabledLink;

    @FindBy(xpath = "//label[@for=\"free_delivery_on_first_order\"]")
    public WebElement freeDeliveryLink;

    @FindBy(xpath = "//select[@class=\"form-control custom-select form-control-select merchant_delivery_charges_type\"]")
    public WebElement fixedChargeSeleckt;

    @FindBy(xpath = "//input[@class=\"btn btn-green btn-full mt-3\"]")
    public WebElement saveButton;
}
