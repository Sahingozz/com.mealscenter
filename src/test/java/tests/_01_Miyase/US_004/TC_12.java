package tests._01_Miyase.US_004;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.Homepage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;
import utilities.TestBaseReport;

public class TC_12 extends TestBaseReport {
    /**
     * Open your browser to access the website
     * -Enter the URL "https://qa.mealscenter.com" into your browser's address bar
     * -Go to Url on your browser to confirm the entered URL
     * -Scroll down towards the footer section of the page
     * -Confirm that BlogList in the footer section is visible
     * -Close the page
     */

    Homepage homepage = new Homepage();

    @Test
    public void testMealCenterFooterBlogList() {
        extentTest= extentReports.createTest("US_004-TC_12", "testMealCenterFooterBlogList");
        WebDriver driver = Driver.getDriver();

        JavascriptExecutor jse = (JavascriptExecutor) driver;
        driver.get(ConfigReader.getProperty("homePageUrl"));
        jse.executeScript("window.scrollBy(0,5000)");
        ReusableMethods.wait(2);
        homepage.homePageCookiesDecline.click();
        Assert.assertTrue(Homepage.homePageFooterBlogList.isDisplayed());
        extentTest.pass("Test pass");

    }
}
