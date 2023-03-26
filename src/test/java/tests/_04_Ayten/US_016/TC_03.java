package tests._04_Ayten.US_016;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.Homepage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

public class TC_03 {
    /*

           - User opens browser and logs in: https://qa.mealscenter.com/
          -Click the Sing in button
          -User account logins
          - Tests that you are logged into the account
         -The user clicks on the "Address" text in the My Account menu and logs in to the page.
          -Tests if address text is clickable
         -Logs out of your account
          -closes the page

      - Kullanici tarayiciyi acar ve: https://qa.mealscenter.com/ sayfasina  giris yapar
     -Sing in butonuna tiklar
     -Kullanici hesabina giris yapar
     -Hesaba giris yaptigini test eder
     -Kullanici My account menusunden Adres yazisini tiklar ve sayfaya giris yapar
     -adresses yazisinin tiklanabilir oldugunu test eder
     -Hesabindan cikis yapar
     -sayfayi kapatir

     */
    Homepage homepage=new Homepage();
    @Test
    public  void TC_01(){
        Driver.getDriver().get(ConfigReader.getProperty("homePageUrl"));
        homepage.signInButtonElement.click();

        homepage.usernameCheckbox.sendKeys(ConfigReader.getProperty("userEmail")+ Keys.ENTER);
        homepage.passwordCheckbox.sendKeys(ConfigReader.getProperty("userPassword"));

        homepage.signInButton2.click();

        String expectedUrl="https://qa.mealscenter.com/";
        String actualUrl=Driver.getDriver().getCurrentUrl();
        Assert.assertEquals(expectedUrl,actualUrl);

        homepage.dropdownMenuLink.click();
        Assert.assertTrue(homepage.adressesLink.isDisplayed());
        Assert.assertTrue(homepage.adressesLink.isEnabled());
        WebElement adressesLink=homepage.adressesLink;
        ReusableMethods.waitAndClick(adressesLink);
        homepage.logOutLink.click();

        Driver.closeDriver();

    }
}
