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

public class TC_04 extends TestBaseReport {
    /**
     * Open your browser to access the website
     * -Enter the URL "https://qa.mealscenter.com" into your browser's address bar
     * -Go to Url on your browser to confirm the entered URL
     * -Scroll down towards the footer section of the page
     * -Confirm that Terms And Conditions Link in the footer section is visible
     * -Confirm that Terms And Conditions Link in the footer section is active by clicking on the function
     * -Close the page
     */


    Homepage homepage = new Homepage();

    @Test
    public void testMealCenterVerifyFooterTermsAndConditionsLink() {
        extentTest= extentReports.createTest("US_004-TC_04", "testMealCenterVerifyFooterTermsAndConditionsLink");
        WebDriver driver = Driver.getDriver();

        JavascriptExecutor jse = (JavascriptExecutor) driver;
        driver.get(ConfigReader.getProperty("homePageUrl"));
        jse.executeScript("window.scrollBy(0,5000)");
        ReusableMethods.wait(2);
        homepage.homePageCookiesDecline.click();
        Assert.assertTrue(homepage.homePageFooterTermsAndConditionsLink.isDisplayed());
        homepage.homePageFooterTermsAndConditionsLink.click();
        Assert.assertEquals(Driver.getDriver().getCurrentUrl(), "https://qa.mealscenter.com/terms-and-conditions");
        extentTest.pass("Test pass");

    }
}
