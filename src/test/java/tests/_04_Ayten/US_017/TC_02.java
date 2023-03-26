package tests._04_Ayten.US_017;

import org.openqa.selenium.Keys;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.Homepage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

public class TC_02 {
    /*

         - The user opens the browser and enters: https://qa.mealscenter.com/
    -Clicks the Sing in button
     -Logs in the user account
     -Tests that he is logged into the account
    -Tests that the Payment options text is clickable
     - Clicks on the “Payment Options” text Clicks
    -Tests that the text Add new Payment is visible
    -Closes the page


        - Kullanici tarayiciyi acar ve: https://qa.mealscenter.com/ sayfasina  giris yapar
    -Sing in butonuna tiklar
    --Kullanici hesabina giris yapar
    -Hesaba giris yaptigini test eder
    -Payment options yazisinin tiklanabilir oldugunu test eder
    -”Payment Options “ yazisina tiklar
    -Add new Payment yazisinin gorunur oldugunu test eder
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
        String expectedUrl = "https://qa.mealscenter.com/";
        String actualUrl = Driver.getDriver().getCurrentUrl();
        Assert.assertEquals(expectedUrl, actualUrl);

        homepage.dropdownMenuLink.click();
        ReusableMethods.wait(2);
        Assert.assertTrue(homepage.paymentsOptionsLink.isEnabled());
        ReusableMethods.waitAndClick(homepage.paymentsOptionsLink);
        Assert.assertTrue(homepage.addNewPaymentText.isDisplayed());
        Driver.closeDriver();
    }
}