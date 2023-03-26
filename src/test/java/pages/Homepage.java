package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class Homepage {

    public Homepage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }
    //HomePage/Sign in buttonElement
    @FindBy(linkText = "Sign in")
    public WebElement signInButtonElement;

    //HomePage>Sign In/Username
    @FindBy(xpath = "//input[@id='username']")
    public WebElement usernameCheckbox;

    //HomePage>Sign In/Password
    @FindBy(xpath = "//input[@id='password']")
    public WebElement passwordCheckbox;

    //HomePage>Sign In/Sign in
    @FindBy(xpath = "(//*[text()='Sign in'])[2]")
    public WebElement signInButton2;

   // Homepage/cookies
    @FindBy(className = "Decline")
    public WebElement cookiesElement;

    //HomePage>Sign in>Sign in/join us
    @FindBy(xpath = "//*[text()='Join']")
    public WebElement joinUsLink;

    //Homepage>sign in>sign in>join us/Become Restaurant partner
    @FindBy(xpath = "//*[text()='Become Restaurant partner']")
    public WebElement becomeRestauranPartnerText;

//-----------------------------------------------------------------------------------//
//HomePage>sign in>My account/dropdownMenu
@FindBy(id = "dropdownMenuLink")
public WebElement dropdownMenuLink;

    //HomePage>sign in>My account>dropdownMenu/my Orders link
    @FindBy(xpath = "//*[@class='dropdown-item with-icon-orders']")
    public WebElement myOrdersLink;

    //HomePage>sign in>My account>dropdownMenu>my Orders link/order now text
    @FindBy(xpath = "//*[@class='btn btn-green']")
    public WebElement orderNowButton;


    //HomePage>sign in>My account>dropdownMenu/adresses link
    @FindBy(xpath = "//*[@class='dropdown-item with-icon-addresses']")
    public WebElement adressesLink;


    //HomePage>sign in>My account>dropdownMenu/payments Options link
    @FindBy(xpath = "//*[@class='dropdown-item with-icon-payments']")
    public WebElement paymentsOptionsLink;

    //HomePage>sign in>My account>dropdownMenu/saved stores link
    @FindBy(xpath = "//*[@class='dropdown-item with-icon-savedstore']")
    public WebElement savedStoresLink;

    //HomePage>sign in>My account>dropdownMenu/Logout link
    @FindBy(xpath = "//*[@class='dropdown-item with-icon-logout']")
    public WebElement logOutLink;

    //HomePage>sign in>My account>dropdownMenu>adresses/add new adress
    @FindBy(xpath = "(//*[@class='btn btn-green'])[1]")
    public WebElement addNewAdressButton;

    //HomePage>sign in>My account>dropdownMenu>adresses>add new adress/change adress
    @FindBy(xpath = "//*[text()='Change address']")
    public WebElement changeAdressText;

    //HomePage>sign in>My account>dropdownMenu>adresses>add new adress>change adress/Enter delivery address
    @FindBy(xpath = "//input[@placeholder='Enter delivery address']")
    public WebElement enterDeliveryAddressbutton;


    //HomePage>sign in>My account>dropdownMenu>adresses>add new adress>change adress>Enter delivery address/United States Holocaust Memorial Museum
    @FindBy(xpath = "//*[*='United States Holocaust Memorial Museum']")
    public WebElement unitedStatesHolocaustMemorialMuseumtext;

    //HomePage>sign in>My account>dropdownMenu>adresses>add new adress>change adress>Enter delivery address>United States Holocaust/Delivery options
    @FindBy(xpath = "//*[@class='form-control custom-select']")
    public WebElement deliveryOptionsDropdown;

    //HomePage>sign in>My account>dropdownMenu>adresses>add new adress>change adress>Enter delivery address/save button
    @FindBy(xpath = "//span[text()='Save']")
    public WebElement saveButton;


    //HomePage>sign in>My account>dropdownMenu>adresses>add new adress>change adress>Enter delivery address>save/home adress information
    @FindBy(xpath = "//*[@class='module truncate-overflow']")
    public WebElement adressInformation;

    //HomePage>sign in>My account>dropdownMenu>adresses>add new adress>change adress>Enter delivery address>save/edit
    @FindBy(xpath = "(//*[@class='btn normal small'])[1]")
    public WebElement editbutton;

    //HomePage>sign in>My account>dropdownMenu>adresses>add new adress>change adress>Enter delivery address>save/delete
    @FindBy(xpath = "(//*[text()='Delete'])[1]")
    public WebElement deleteButton;

    //HomePage>sign in>My account>dropdownMenu>adresses>add new adress>change adress>Enter delivery address>save>delete/yes
    @FindBy(xpath = "//button[text()='Yes']")
    public WebElement yesButton;


    //HomePage>sign in>My account>dropdownMenu>adresses>add new adress>change adress>Enter delivery address>save>delete/Are you sure you want to continue?
    @FindBy(xpath = "//*[text()='Are you sure you want to continue?']")
    public WebElement areYouSureYouWantToContinueText;


    //HomePage>My account>dropdownMenu>Payments Options/add new payments
    @FindBy(xpath = "(//*[text()='Add new payment'])[1]")
    public WebElement addNewPaymentText;


    //HomePage>My account>dropdownMenu>Payments Options>add new payments/cash on delivery
    @FindBy(xpath = "(//*[@class='card p-3 fixed-height card-listing'])[2]")
    public WebElement cashOnDeliveryText;

    //HomePage>My account>dropdownMenu>Payments Options>add new payments/cash on delivery button
    @FindBy(xpath = "//span[text()='Cash On delivery']")
    public WebElement cashOnDeliveryButton;

    //HomePage>My account>dropdownMenu>Payments Options>add new payments>cash on delivery button/add cash button
    @FindBy(xpath = "//span[text()='Add Cash']")
    public WebElement addCashButton;


    //HomePage>My account>dropdownMenu>Payments Options>add new payments>cash on delivery button/cross element
    @FindBy(xpath = "(//*[@class='zmdi zmdi-close font20'])[1]")
    public WebElement crossElement;

    //HomePage>My account>dropdownMenu>Payments Options>add new payments>cash on delivery button>cross element/close payment
    @FindBy(xpath = "(//*[@class='btn btn-green'])[1]")
    public WebElement closePaymentButton;

    //HomePage>My account>dropdownMenu>saved stores/order now
    @FindBy(xpath = "(//*[@class='btn btn-green'])[1]")
    public WebElement orderNowlink;
}




