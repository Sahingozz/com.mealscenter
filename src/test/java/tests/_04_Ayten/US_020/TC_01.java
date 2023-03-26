package tests._04_Ayten.US_020;

import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;
import pages.Merchant_Dashboard;
import utilities.ConfigReader;
import utilities.Driver;

public class TC_01 {
    /*
     - User opens browser and logs into https://qa.mealscenter.com/backoffice/auth/login
      -Closes the page


     - Kullanici tarayiciyi acar ve https://qa.mealscenter.com/backoffice/auth/login sayfasina  giris yapar
      -Sayfayi kapatir
     */
    Merchant_Dashboard merchant_dashboard = new Merchant_Dashboard();

    @Test
    public void TC_01() {
        Driver.getDriver().get(ConfigReader.getProperty("merchantDashboardUrl"));
        Actions action=new Actions(Driver.getDriver());
        action.click(merchant_dashboard.merchantLoginUsername)
                .sendKeys(ConfigReader.getProperty("merchantDashboardUsername")).perform();
        action.click(merchant_dashboard.merchantLoginPassword)
                .sendKeys(ConfigReader.getProperty("merchantDashboardPassword")).perform();
        merchant_dashboard.merchantLoginSignin.click();
        Driver.closeDriver();
    }
}