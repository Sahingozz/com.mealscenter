package tests._06_Ersin.US_027;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.Homepage;
import pages.Merchant_Dashboard;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;
import utilities.TestBaseReport;

public class TC_06 extends TestBaseReport {


    Merchant_Dashboard merchantDashboard = new Merchant_Dashboard();
    Homepage homepage = new Homepage();
    private ReusableMethods reausableMethods;


    @Test

    private void TC_01() {

        extentTest= extentReports.createTest("TC_06", "Verify that Delay Order button is visible ");

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

        // 5- User clicks three point button and verifies Delay Order button is visible
        merchantDashboard.threePointButton.click();
        Assert.assertTrue(merchantDashboard.delayOrder.isDisplayed());

        extentTest.info("Three point button and Delay Order are visible ");

        // 6- User closes the page
        Driver.closeDriver();

        extentTest.info("The page was closed");
        extentTest.pass("Test passed");
    }
}