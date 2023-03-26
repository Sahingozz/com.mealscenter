package tests._04_Ayten.US_021;

import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.Merchant_Dashboard;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

public class TC_04 {
    /*
     The user opens the browser and logs in to the https://qa.mealscenter.com/backoffice/auth/login page
     -Verifies that the Merchant Login text appears
     -Enters the user name and password, clicks the Sign in button
      -Logs into his account
       -Verifies the existence of the Merchant panel
       - Tests the visibility of the menus on the Merchant page
        -Closes the page


    - Kullanici tarayiciyi acar ve https://qa.mealscenter.com/backoffice/auth/login sayfasina  giris yapar
    -Merchant Login yazisinin gorundugunu dogrular
    -Kullanici ismi ve sifreyi  girer ,Sign in butonuna tiklar
    --Hesabina giris yapar
    - -Merchant panelinin varoldugunu dogrular
    - -Merchant sayfasindaki  menulerin gorunurlulugunu  test eder
   -Sayfayi kapatir


     */

    Merchant_Dashboard merchant_dashboard = new Merchant_Dashboard();

    @Test
    public void TC_01() {
        Driver.getDriver().get(ConfigReader.getProperty("merchantDashboardUrl"));
        Assert.assertTrue(merchant_dashboard.merchantLoginText.isDisplayed());
        Actions action = new Actions(Driver.getDriver());
        action.click(merchant_dashboard.merchantLoginUsername)
                .sendKeys(ConfigReader.getProperty("merchantDashboardUsername")).perform();
        action.click(merchant_dashboard.merchantLoginPassword)
                .sendKeys(ConfigReader.getProperty("merchantDashboardPassword")).perform();
        merchant_dashboard.merchantLoginSignin.click();
        Assert.assertTrue(merchant_dashboard.merchantDropdownMenuButton.isDisplayed());
        ReusableMethods.dashboardMenuElements();
        Assert.assertTrue(merchant_dashboard.merchantMenuElements.isDisplayed());
        Driver.closeDriver();
    }
}