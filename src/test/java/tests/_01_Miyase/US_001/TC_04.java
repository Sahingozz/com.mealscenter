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
 * -Click on any available feature on the homepage (such as the ""meals Center"" element)
 * -Close the page
 */
public class TC_04 {

    @Test
    public void testAnyAvailableFeatureOnTheHomepage() {
        Driver.getDriver().get(ConfigReader.getProperty("homePageUrl"));
        Assert.assertTrue(Homepage.homePageHeaderLogo.isDisplayed());
        Driver.getDriver().quit();
    }
}