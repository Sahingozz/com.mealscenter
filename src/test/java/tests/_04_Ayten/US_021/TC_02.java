package tests._04_Ayten.US_021;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.Merchant_Dashboard;
import utilities.ConfigReader;
import utilities.Driver;

public class TC_02 {
    /*
     - The user opens the browser and logs in to the -https://qa.mealscenter.com/backoffice/auth/login page
     -Verifies that the Merchant Login text appears
      -Closes the page


- Kullanici tarayiciyi acar ve https://qa.mealscenter.com/backoffice/auth/login sayfasina  giris yapar
-Merchant Login yazisinin gorundugunu dogrular
 -Sayfayi kapatir

     */
    Merchant_Dashboard merchant_dashboard = new Merchant_Dashboard();

    @Test
    public void TC_01() {
        Driver.getDriver().get(ConfigReader.getProperty("merchantDashboardUrl"));
        Assert.assertTrue(merchant_dashboard.merchantLoginText.isDisplayed());
        Driver.closeDriver();
    }
}