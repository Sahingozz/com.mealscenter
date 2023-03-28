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
 * -Once the website's homepage is loaded, ensure that the page is fully loaded
 * -Close the page
 */
public class TC_03 extends TestBaseReport {
    Homepage homepage = new Homepage();

    @Test
    public void testWebsiteIsFullLoaded() {
        Driver.getDriver().get(ConfigReader.getProperty("homePageUrl"));
        Assert.assertTrue(homepage.homePageFooterQaMealsCenterLink.isDisplayed());
    }
}