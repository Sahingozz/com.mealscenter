package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class Merchant_Dashboard {


        public Merchant_Dashboard(){
            PageFactory.initElements(Driver.getDriver(),this);

        }

        //Merchant Dashboard/username
        @FindBy(xpath = "//label[@for='AR_merchant_login_username']")
        public WebElement merchantLoginUsername;

        //Merchant Dashboard/password
        @FindBy(xpath = "//label[@for='AR_merchant_login_password']")
        public WebElement merchantLoginPassword;

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
    }



