package tests._01_Miyase.US_004;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.Homepage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

public class TC_15 {

    Homepage homepage = new Homepage();

    @Test
    public void testMealFooterBlogBenefitsToLink() {
        WebDriver driver = Driver.getDriver();
        try {
            JavascriptExecutor jse = (JavascriptExecutor) driver;
            driver.get(ConfigReader.getProperty("homePageUrl"));
            jse.executeScript("window.scrollBy(0,5000)");
            ReusableMethods.wait(2);
            homepage.homePageCookiesDecline.click();
            Assert.assertTrue(Homepage.homePageFooterBlogBenefitsLink.isDisplayed());
            Homepage.homePageFooterBlogBenefitsLink.click();
            Assert.assertEquals(Driver.getDriver().getCurrentUrl(), "https://qa.mealscenter.com/the-benefits-of-using-a-food-delivery-platform-for-your-healthy-lifestyle");
        } finally {
            driver.quit();
        }
    }
}
