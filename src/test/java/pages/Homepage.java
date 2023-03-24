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


    }


