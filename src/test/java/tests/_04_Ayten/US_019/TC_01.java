package tests._04_Ayten.US_019;

import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.Merchant_Dashboard;
import utilities.ConfigReader;
import utilities.Driver;

public class TC_01 {
       /*
        - The user opens the browser and logs in to the https://qa.mealscenter.com/backoffice/auth/login page
      Enters the username and password, clicks the login button
    Logs into his account
    -Verifies that he has logged into the page
    -Closes the page


     - Kullanici tarayiciyi acar ve https://qa.mealscenter.com/backoffice/auth/login sayfasina  giris yapar
    Username ve passwordu girer ,login in butonuna tiklar
    Hesabina giris yapar
    Sayfaya giris yaptigini dogrular
    Sayfayi kapatir
     */

  Merchant_Dashboard merchant_dashboard=new Merchant_Dashboard();
@Test
    public void TC_01(){
    Driver.getDriver().get(ConfigReader.getProperty("merchantDashboardUrl"));
   Actions action=new Actions(Driver.getDriver());
   action.click(merchant_dashboard.merchantLoginUsername)
           .sendKeys(ConfigReader.getProperty("merchantDashboardUsername")).perform();
   action.click(merchant_dashboard.merchantLoginPassword)
           .sendKeys(ConfigReader.getProperty("merchantDashboardPassword")).perform();
   merchant_dashboard.merchantLoginSignin.click();
     String expectedUrl="https://qa.mealscenter.com/backoffice/merchant/dashboard";
     String actualUrl=Driver.getDriver().getCurrentUrl();
    Assert.assertEquals(expectedUrl,actualUrl);
    Driver.closeDriver();
}

}
