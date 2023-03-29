package tests._06_Ersin.US_027;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.Homepage;
import pages.Merchant_Dashboard;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;
import utilities.TestBaseReport;

public class TC_03 extends TestBaseReport {


    Merchant_Dashboard merchantDashboard = new Merchant_Dashboard();
    Homepage homepage = new Homepage();
    private ReusableMethods reausableMethods;


    @Test

    private void TC_01() {

        extentTest= extentReports.createTest("TC_03", "Verify that Ready for Pickup button is " +
                "visible and working");

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

        // 3- User clicks Orders and Orders Processing
        // 4- User verifies that Orders Processing page is visible

        Assert.assertTrue(merchantDashboard.orders.isDisplayed());
        merchantDashboard.orders.click();

        merchantDashboard.ordersProcessing.click();

        expectedUrl = "https://qa.mealscenter.com/backoffice/orders/processing";
        actualUrl = Driver.getDriver().getCurrentUrl();
        Assert.assertEquals(expectedUrl, actualUrl);

        extentTest.info("Orders Processing Page is visible");

        // 5- User verifies that Ready for pickup button is visible
        Assert.assertTrue(merchantDashboard.readyForPickup.isDisplayed());

        extentTest.info("Ready for pickup Button is visible");

        // 6- User clicks Ready for pickup button
        merchantDashboard.readyForPickup.click();

        extentTest.info("Ready for pickup Button is working");


        // 7- User closes the page
        Driver.closeDriver();

        extentTest.info("The page was closed");
        extentTest.pass("Test passed");
    }
}

