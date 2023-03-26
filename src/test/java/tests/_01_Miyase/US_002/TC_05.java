package tests._01_Miyase.US_002;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.Homepage;
import utilities.ConfigReader;
import utilities.Driver;

public class TC_05 {
    /**
     * Open your browser to access the website
     * -Enter the URL "https://qa.mealscenter.com" into your browser's address bar
     * -Navigate to the website
     * -Verify that the text "Hungry? We got you" is present in the header section
     * -Close the page
     */
    Homepage homepage = new Homepage();

    @Test
    public void testMealCenterHomePageHeaderText() {
        Driver.getDriver().get(ConfigReader.getProperty("homePageUrl"));
        homepage.homePageCookiesDecline.click();
        Assert.assertTrue(homepage.homePageHeaderText.isDisplayed());
        Driver.getDriver().quit();
    }

}

