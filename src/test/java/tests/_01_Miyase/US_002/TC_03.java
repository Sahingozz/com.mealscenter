package tests._01_Miyase.US_002;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.Homepage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.TestBaseReport;

public class TC_03 extends TestBaseReport {
    /**
     * Open your browser to access the website
     * -Enter the URL "https://qa.mealscenter.com" into your browser's address bar
     * -Navigate to the website
     * -Verify that the Shopping bag is active
     * -Close the page
     */
    Homepage homepage = new Homepage();

    @Test
    public void testMealCenterAccessBasket() {
        extentTest= extentReports.createTest("US_002-TC_03", "testMealCenterAccessBasket");
        Driver.getDriver().get(ConfigReader.getProperty("homePageUrl"));
        homepage.homePageCookiesDecline.click();
        Assert.assertTrue(homepage.homePageHeaderShoppingBag.isDisplayed());
        homepage.homePageHeaderShoppingBag.click();
        Assert.assertTrue(homepage.shoppingBagSection.isDisplayed());
        extentTest.pass("Test pass");
    }


}
