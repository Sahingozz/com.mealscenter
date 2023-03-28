
package tests._01_Miyase.US_003;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.Homepage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;
import utilities.TestBaseReport;

public class TC_21 extends TestBaseReport {
    /**
     * Open your browser to access the website
     * -Enter the URL "https://qa.mealscenter.com" into your browser's address bar
     * -Go to Url on your browser to confirm the entered URL
     * -Verify that all functionalities in the body section are visible
     * -Click on each body item in the body section and verify that it navigates to the intended page
     * -Close the page
     */

    Homepage homepage = new Homepage();

    @Test
    public void testMealCenterDiscoverHealthyFood() {
        extentTest= extentReports.createTest("US_003-TC_21", "testMealCenterDiscoverHealthyFood");
        WebDriver driver = Driver.getDriver();
        driver.get(ConfigReader.getProperty("homePageUrl"));
        ReusableMethods.wait(3);
        homepage.homePageCookiesDecline.click();
        Assert.assertTrue(homepage.homePageBodyReadText4.isDisplayed());
        extentTest.pass("Test pass");
    }
}
