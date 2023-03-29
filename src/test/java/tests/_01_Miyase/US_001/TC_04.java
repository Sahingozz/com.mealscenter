package tests._01_Miyase.US_001;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.Homepage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.TestBaseReport;

/**
 * This Test Case controlls the following:
 * -Open browser to access the website
 * -Enter the URL ""https://qa.mealscenter.com"" into browser's address bar
 * -Go to Url on your browser to confirm the entered URL
 * -Click on any available feature on the homepage (such as the "meals Center" element)
 * -Close the page
 */
public class TC_04 extends TestBaseReport {


    @Test
    public void testAnyAvailableFeatureOnTheHomepage() {
        extentTest= extentReports.createTest("US_001-TC_04", "Check a random property from Homepage");
        Homepage homepage = new Homepage();
        Driver.getDriver().get(ConfigReader.getProperty("homePageUrl"));
        Assert.assertTrue(homepage.homePageHeaderLogo.isDisplayed());
        extentTest.pass("Test pass");
    }
}