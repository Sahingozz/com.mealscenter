package tests._04_Ayten.US_015;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.Homepage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

public class TC_04 {
/*
     -The user opens the browser and enters: https://qa.mealscenter.com/
     -Clicks the Sing in button
     -Logs the user account
    -The user tests that the “My Orders” text is visible and clickable from the My Account section
     -Clicks the My Orders text
     -Confirms that the text "Order now" is visible after the user logs in to the My Orders page
     -Closes the page


     - Kullanici tarayiciyi acar ve: https://qa.mealscenter.com/ sayfasina  giris yapar
    -Sing in butonuna tiklar
    --Kullanici hesabina giris yapar
    -Kullanici My Account bolumunden “My Orders” yazisinin gorunur ve tiklanabilir
    oldugunu test eder
    -My Orders yazisina tiklar
    -Kullanici My Orders sayfasina giris yapildiktan sonra "Order now" yazisinin gorunur
    oldugu dogrular
    -Sayfayi kapatir
 */


    Homepage homepage = new Homepage();

    @Test
    public void TC_02() {
        Driver.getDriver().get(ConfigReader.getProperty("homePageUrl"));

        homepage.signInButtonElement.click();
        homepage.usernameCheckbox.sendKeys(ConfigReader.getProperty("userEmail") + Keys.ENTER);
        homepage.passwordCheckbox.sendKeys(ConfigReader.getProperty("userPassword"));
        homepage.signInButton2.click();
        ReusableMethods.wait(3);
        homepage.dropdownMenuLink.click();
        Assert.assertTrue(homepage.myOrdersLink.isDisplayed());
        Assert.assertTrue(homepage.myOrdersLink.isEnabled());
        WebElement myOrders=homepage.myOrdersLink;
        ReusableMethods.waitAndClick(myOrders);
        Assert.assertTrue(homepage.orderNowButton.isDisplayed());


        Driver.closeDriver();

    }
}
