package tests._06_Ersin.US_026;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.Merchant_Dashboard;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

public class TC_02 {
    Merchant_Dashboard merchantDashboard=new Merchant_Dashboard();
    @Test

    private void TC_02(){

        // 1- The user goes to the Merchant panel "MerchantUrl" with the browser they open
        // 2- User enters Username and Password clicks Sign in
        Driver.getDriver().get(ConfigReader.getProperty("merchantUrl"));

        ReusableMethods.merchantLoginErsin();

        // 3- User clicks Orders and New Orders
        // 4- User verifies that New Order page is visible

        merchantDashboard.orders.click();

        merchantDashboard.newOrders.click();


        // 5- User verifies that Accepted button is visible
        // 6- User clicks Accepted button

        merchantDashboard.acceptedButton.click();


        String expectedUrl="new";
        String actualUrl= Driver.getDriver().getCurrentUrl();
        Assert.assertTrue(actualUrl.contains(expectedUrl));

        // 7-Kullanıcı sayfayı kapatır
        Driver.closeDriver();

    }

}
