package tests._01_Miyase.US_001;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.Homepage;
import utilities.ConfigReader;
import utilities.Driver;

/**
 * This Test Case controlls the following:
 * -Open browser to access the website
 * -Enter the URL ""https://qa.mealscenter.com"" into browser's address bar
 * -Go to Url on your browser to confirm the entered URL and navigate to the website
 * -Once the website's homepage is loaded, ensure that the page is fully loaded
 * -Confirm that you have navigated to the correct page
 * -Close the page
 */
public class TC_03 {

    @Test
    public void testWebsiteIsFullLoaded() {
        Driver.getDriver().get(ConfigReader.getProperty("homePageUrl"));
        Assert.assertTrue(Homepage.homePageFooterQaMealsCenterLink.isDisplayed());
        Driver.getDriver().quit();
    }
}