package tests._01_Miyase.US_002;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.Homepage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.TestBaseReport;

public class TC_04 extends TestBaseReport {
    /**
     * Open your browser to access the website
     * -Enter the URL "https://qa.mealscenter.com" into your browser's address bar
     * -Navigate to the website
     * -Verify that the cart Link in the header section is active and navigates to the correct pages
     * -Close the page
     */
    Homepage homepage = new Homepage();

    @Test
    public void testMealCenterAccessShoppingCart() {
        extentTest= extentReports.createTest("US_002-TC_04", "testMealCenterAccessShoppingCart");
        Driver.getDriver().get(ConfigReader.getProperty("homePageUrl"));
        homepage.homePageCookiesDecline.click();
        Assert.assertTrue(homepage.homePageHeaderCart.isDisplayed());
        homepage.homePageHeaderCart.click();
        Assert.assertTrue(homepage.shoppingBagSection.isDisplayed());
        extentTest.pass("Test pass");
    }

}
