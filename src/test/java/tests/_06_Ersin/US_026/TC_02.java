package tests._06_Ersin.US_026;

import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.Homepage;
import pages.Merchant_Dashboard;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;
import utilities.TestBaseReport;

public class TC_02 extends TestBaseReport {
    Merchant_Dashboard merchantDashboard=new Merchant_Dashboard();
    Homepage homepage=new Homepage();
    private ReusableMethods reausableMethods;

    @Test

    private void TC_01(){
        extentTest= extentReports.createTest("TC_02", "Verify that Accepted button is visible and working");

        // 1- The user goes to the Merchant panel "MerchantUrl" with the browser they open
        // 2- User enters Username and Password clicks Sign in
        Driver.getDriver().get(ConfigReader.getProperty("merchantUrl"));

        ReusableMethods.merchantLoginErsin();

        Driver.getDriver().get(ConfigReader.getProperty("merchantDashboardMain"));
        String expectedUrl="https://qa.mealscenter.com/backoffice/merchant/dashboard";
        String actualUrl= Driver.getDriver().getCurrentUrl();
        Assert.assertEquals(expectedUrl, actualUrl);

        String expectedTitle = "Dashboard";
        String actualTitle = Driver.getDriver().getTitle();
        Assert.assertEquals(expectedTitle,actualTitle);

        extentTest.info("Login to the merchant dashboard page was completed and the main page was accessed");

        // 3- User clicks Orders and New Orders
        // 4- User verifies that New Order page is visible

        Assert.assertTrue(merchantDashboard.orders.isDisplayed());
        merchantDashboard.orders.click();


        Assert.assertTrue(merchantDashboard.newOrders.isDisplayed());
        merchantDashboard.newOrders.click();

        expectedUrl="https://qa.mealscenter.com/backoffice/orders/new";
        actualUrl= Driver.getDriver().getCurrentUrl();
        Assert.assertEquals(expectedUrl, actualUrl);

        extentTest.info("New order Page is visible");

        // 5- User verifies that Accepted button  is visible
        Assert.assertTrue(merchantDashboard.acceptedButton.isDisplayed());

        extentTest.info("Accepted button  is visible");

        // 6 - User clicks Accepted button
        merchantDashboard.acceptedButton.click();

        extentTest.info("Accepted button  is working");

        // 7-User closes the page
        Driver.closeDriver();

        extentTest.info("The page was closed");
        extentTest.pass("Test passed");

    }

}
