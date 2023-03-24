package tests._03_Murat;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class Page_US_012 {

    public Page_US_012(){
        PageFactory.initElements(Driver.getDriver(),this);
    }


    // Homepage panel> sign  in button
    @FindBy(xpath = "//li[@class='d-none d-lg-inline line-left']")
    public WebElement signInButton;

    // Homepage panel> sign in > eMail button
    @FindBy(xpath = "(//input[@class='form-control form-control-text'])[1]")
    public WebElement eMailButton;

    // Homepage panel> sign in confirm
    @FindBy(xpath = "//button[@class='btn btn-green w-100']")
    public WebElement signInButtonConfirm;

    // Homepage panel > search button
    @FindBy(xpath = "(//input[@class='form-control form-control-text'])[1]")
    public WebElement searchButton;

    @FindBy(xpath = "(//div[@class='col cuisineMainPage'])[1]")
    public  WebElement americanButton;

    @FindBy(xpath = "(//div[@class='el-image'])[3]")
    public  WebElement mcDonaldsButton;

    @FindBy(xpath = "(//div[@class='col cuisineMainPage'])[5]")
    public  WebElement mexicanButton;

     @FindBy(xpath = "(//div[@class='col cuisineMainPage'])[7]")
    public  WebElement japaniseButton;

    @FindBy(xpath = "//div[@class='layer-grey']")
    public  WebElement brolarKebapButton;

    @FindBy(xpath = "(//div[@class='col cuisineMainPage'])[8]")
    public  WebElement thaiButton;

    @FindBy(xpath = "//div[@class='el-image']")
    public  WebElement streetCafeButton;

    @FindBy(xpath = "//a[@id='dropdownCuisine']")
    public  WebElement moreButton;

    @FindBy(xpath = "(//a[@class='p-2 pl-2 d-block'])[1]")
    public  WebElement chineseButton;

    @FindBy(xpath = "//img[@class='el-image__inner']")
    public WebElement sichuaneseButton;
}
