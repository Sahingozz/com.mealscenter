package tests._04_Ayten.US_018;

import org.openqa.selenium.Keys;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.Homepage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

public class TC_04 {
    /*
         The user opens the browser and enters: https://qa.mealscenter.com/
    -Click the Sing in button
     -Test that the Signin button is clickable
    -Click the "Saved stores" text from the "My Account" menu
     -Click the "Order now" on the opened page Test that ” is visible
     -Closes the page


        - Kullanici tarayiciyi acar ve: https://qa.mealscenter.com/ sayfasina  giris yapar
    -Sing in butonuna tiklar
    -Sign in butonun tiklanabilir oldugu test edilmeli
    -Hesabina giris yapar
    -"My Account" menusunden "Saved stores" yazisi tiklanir
    -Acilan sayfada “Order now” yazisinin gorunur oldugu test edilmeli
    -Sayfayi kapatir
     */


    Homepage homepage = new Homepage();

    @Test
    public void TC_01() {
        Driver.getDriver().get(ConfigReader.getProperty("homePageUrl"));
        Assert.assertTrue(homepage.signInButtonElement.isEnabled());
        homepage.signInButtonElement.click();
        homepage.usernameCheckbox.sendKeys(ConfigReader.getProperty("userEmail") + Keys.ENTER);
        homepage.passwordCheckbox.sendKeys(ConfigReader.getProperty("userPassword"));
        homepage.signInButton2.click();
        ReusableMethods.wait(3);
        homepage.dropdownMenuLink.click();
        ReusableMethods.waitAndClick(homepage.savedStoresLink);
        Assert.assertTrue(homepage.orderNowlink.isDisplayed());
        Driver.closeDriver();
    }
}
