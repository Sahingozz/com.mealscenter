package tests._04_Ayten.US_017;

import org.openqa.selenium.Keys;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.Homepage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

public class TC_03 {
    /*
        - User opens the browser and logs in to: https://qa.mealscenter.com/
    -Clicks the Sing in button
   -Logins to the user account
    -Tests the account login
    -User clicks the "Add new Payment" button
    -Cash on delivery and Tests that Stripe text appears
    -User clicks Cash on delivery button
    -Clicks Add cash in the Alert that appears
    -Clicks on Close payment
    -closes the page


    - Kullanici tarayiciyi acar ve: https://qa.mealscenter.com/ sayfasina  giris yapar
   -Sing in butonuna tiklar
   --Kullanici hesabina giris yapar
   -Hesaba giris yaptigini test eder
   -My account dropdown meusunden payments options butounu tiklar
   -Kullanici “Add new Payment” butonuna tiklar
   -Cash on delivery ve Stripe yazisinin gorundugunu test eder
   -Kullanici Cash on delivery butonuna tiklar
   -Cikan Alert’te Add cash yazisina tiklar
   -Close payment yazisina tiklar
   -sayfayi kapatir
     */
    Homepage homepage = new Homepage();

    @Test
    public void TC_02() {
        Driver.getDriver().get(ConfigReader.getProperty("homePageUrl"));
        homepage.signInButtonElement.click();
        homepage.usernameCheckbox.sendKeys(ConfigReader.getProperty("userEmail") + Keys.ENTER);
        homepage.passwordCheckbox.sendKeys(ConfigReader.getProperty("userPassword"));
        homepage.signInButton2.click();
        ReusableMethods.wait(2);
        String expectedUrl = "https://qa.mealscenter.com/";
        String actualUrl = Driver.getDriver().getCurrentUrl();
        Assert.assertEquals(expectedUrl, actualUrl);

        homepage.dropdownMenuLink.click();
        ReusableMethods.wait(2);
        ReusableMethods.waitAndClick(homepage.paymentsOptionsLink);

        String expextedCashOnDeliveryText="Cash On delivery";
        String actualCashOnDeliveryText=homepage.cashOnDeliveryText.getText();
        Assert.assertTrue(actualCashOnDeliveryText.contains(expextedCashOnDeliveryText));
        homepage.addNewPaymentText.click();
        homepage.cashOnDeliveryButton.click();
        ReusableMethods.waitAndClick(homepage.addCashButton);
        homepage.crossElement.click();
        homepage.closePaymentButton.click();
        Driver.closeDriver();


    }
}