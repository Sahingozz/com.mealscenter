package tests._04_Ayten.US_015;

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
     - Kullanici tarayiciyi acar ve: https://qa.mealscenter.com/ sayfasina  giris yapar
     -Sing in butonuna tiklar
     --Kullanici hesabina giris yapar
     -My Account bolumunden “My Orders” yazisinin gorunur ve tiklanabilir
     oldugunu test eder
     -sayfayi kapatir


      - The user opens the browser and enters: https://qa.mealscenter.com/
     -Clicks the Sing in button
      -Logins to the user account
      -Tests that the “My Orders” text is visible and clickable from the My Account section
     -Closes the page
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


        Driver.closeDriver();

    }
}