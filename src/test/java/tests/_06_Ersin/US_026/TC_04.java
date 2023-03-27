package tests._06_Ersin.US_026;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.Homepage;
import pages.Merchant_Dashboard;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

public class TC_04 {


    Merchant_Dashboard merchantDashboard = new Merchant_Dashboard();
    Homepage homepage = new Homepage();
    private ReusableMethods reausableMethods;

    @Test

    private void TC_01() {
        // 1- The user goes to the Merchant panel "MerchantUrl" with the browser they open
        // 2- User enters Username and Password clicks Sign in
        Driver.getDriver().get(ConfigReader.getProperty("merchantUrl"));

        ReusableMethods.merchantLoginErsin();

        Driver.getDriver().get(ConfigReader.getProperty("merchantDashboardMain"));
        String expectedUrl = "https://qa.mealscenter.com/backoffice/merchant/dashboard";
        String actualUrl = Driver.getDriver().getCurrentUrl();
        Assert.assertEquals(expectedUrl, actualUrl);

        String expectedTitle = "Dashboard";
        String actualTitle = Driver.getDriver().getTitle();
        Assert.assertEquals(expectedTitle, actualTitle);

        // 3- User clicks Orders and New Orders
        // 4- User verifies that New Order page is visible

        Assert.assertTrue(merchantDashboard.orders.isDisplayed());
        merchantDashboard.orders.click();

        Assert.assertTrue(merchantDashboard.newOrders.isDisplayed());
        merchantDashboard.newOrders.click();

        expectedUrl = "https://qa.mealscenter.com/backoffice/orders/new";
        actualUrl = Driver.getDriver().getCurrentUrl();
        Assert.assertEquals(expectedUrl, actualUrl);

        // 5- User verifies that Print button is visible
        Assert.assertTrue(merchantDashboard.print.isDisplayed());

        // 6-  - User clicks Print button and again clicks Print order
        merchantDashboard.print.click();
        merchantDashboard.printButton.click();

        // 7-User closes the page
        Driver.closeDriver();


    }
}
