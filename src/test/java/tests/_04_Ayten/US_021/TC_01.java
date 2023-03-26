package tests._04_Ayten.US_021;

import org.testng.annotations.Test;
import pages.Merchant_Dashboard;
import utilities.ConfigReader;
import utilities.Driver;

public class TC_01 {
    /*
     - The user opens the browser and logs in to https://qa.mealscenter.com/backoffice/auth/login
     -Verifies that he can login to the Merchant page
     -Closes the page


- Kullanici tarayiciyi acar ve https://qa.mealscenter.com/backoffice/auth/login sayfasina  giris yapar -
-Merchant sayfasina giris yapabildigini dogrular
-Sayfayi kapatir

     */
    Merchant_Dashboard merchant_dashboard = new Merchant_Dashboard();

    @Test
    public void TC_01() {
        Driver.getDriver().get(ConfigReader.getProperty("merchantDashboardUrl"));
       String expectedUrl="https://qa.mealscenter.com/backoffice/auth/login";
       String actualUrl=Driver.getDriver().getCurrentUrl();
    }
}
