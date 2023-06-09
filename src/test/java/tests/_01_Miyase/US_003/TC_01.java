package tests._01_Miyase.US_003;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.Homepage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;
import utilities.TestBaseReport;

public class TC_01 extends TestBaseReport {

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
    public void testMealCenterAccessAmericanCuisine() {
        extentTest= extentReports.createTest("US_003-TC_01", "testMealCenterAccessAmericanCuisine");
        WebDriver driver = Driver.getDriver();
        driver.get(ConfigReader.getProperty("homePageUrl"));
        ReusableMethods.wait(3);
        homepage.homePageCookiesDecline.click();
        Assert.assertTrue(homepage.homePageBodyAmerican.isDisplayed());
        homepage.homePageBodyAmerican.click();
        Assert.assertEquals(Driver.getDriver().getCurrentUrl(), "https://qa.mealscenter.com/cuisine/american");
        extentTest.pass("Test pass");
    }
}
