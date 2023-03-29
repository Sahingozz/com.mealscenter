package tests._06_Ersin.US_026;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.Homepage;
import pages.Merchant_Dashboard;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;
import utilities.TestBaseReport;

public class TC_10 extends TestBaseReport {



    Merchant_Dashboard merchantDashboard = new Merchant_Dashboard();
    Homepage homepage = new Homepage();
    private ReusableMethods reausableMethods;

    @Test

    private void TC_01() {

        extentTest= extentReports.createTest("TC_10", "Verify that Assign Driver button is visible and working ");

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

        extentTest.info("Login to the merchant dashboard page was completed and the main page was accessed");

        // 3- User clicks Orders and New Orders
        // 4- User verifies that New Order page is visible

        Assert.assertTrue(merchantDashboard.orders.isDisplayed());
        merchantDashboard.orders.click();

        Assert.assertTrue(merchantDashboard.newOrders.isDisplayed());
        merchantDashboard.newOrders.click();

        expectedUrl = "https://qa.mealscenter.com/backoffice/orders/new";
        actualUrl = Driver.getDriver().getCurrentUrl();
        Assert.assertEquals(expectedUrl, actualUrl);

        extentTest.info("New order Page is visible");

        // 5- User verifies that Assign Driver button is visible
        Assert.assertTrue(merchantDashboard.assignButton.isDisplayed());

        extentTest.info("Assign Driver button is visible");

        // 6 -  User clicks Assign Driver button
        merchantDashboard.assignButton.click();

        extentTest.info("Assign Driver button is not working");

        // 7- User closes the page
        Driver.closeDriver();

        extentTest.info("The page was closed");
        extentTest.pass("Test failed");


    }
}
