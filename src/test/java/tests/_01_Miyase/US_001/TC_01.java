package tests._01_Miyase.US_001;

import org.testng.Assert;
import org.testng.annotations.Test;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.TestBaseReport;

/**
 * This Test Case controls the following:
 * -Open browser to access the website
 * -Enter the URL ""https://qa.mealscenter.com"" into browser's address bar
 * -Go to Url on your browser to confirm the entered URL
 * -Close the page
 */
public class TC_01 extends TestBaseReport {
    @Test
    public void testMealCenterAccessWebsite() {
        Driver.getDriver().get(ConfigReader.getProperty("homePageUrl"));
        String expectedTitle = "Meals Center";
        String actualTitle = Driver.getDriver().getTitle();
        Assert.assertTrue(expectedTitle.contains(actualTitle));

    }

}