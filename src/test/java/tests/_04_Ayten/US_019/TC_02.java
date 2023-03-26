package tests._04_Ayten.US_019;

import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.Merchant_Dashboard;
import utilities.ConfigReader;
import utilities.Driver;

public class TC_02 {
    /*
     -
      The user opens the browser and logs in to the https://qa.mealscenter.com/backoffice/auth/login page
      -Confirms that Merchant Login appears
      -Enter the username and password, click the login button
      -Logins to his account
      -Closes the page


     - Kullanici tarayiciyi acar ve https://qa.mealscenter.com/backoffice/auth/login sayfasina  giris yapar
     -Merchant Login yazisinin gorundugunu dogrular
     -Username ve passwordu girer ,login in butonuna tiklar
      -Hesabina giris yapar
      -hesabina giris yaptigini dogrular
     -Sayfayi kapatir

     */

    Merchant_Dashboard merchant_dashboard = new Merchant_Dashboard();

    @Test
    public void TC_01() {
        Driver.getDriver().get(ConfigReader.getProperty("merchantDashboardUrl"));
        Assert.assertTrue(merchant_dashboard.merchantLoginText.isDisplayed());
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
