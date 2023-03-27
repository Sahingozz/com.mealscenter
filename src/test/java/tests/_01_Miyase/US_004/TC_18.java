package tests._01_Miyase.US_004;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.Homepage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

public class TC_18 {

    Homepage homepage = new Homepage();

    @Test
    public void testMealFooterGoogleStore() {
        WebDriver driver = Driver.getDriver();
        try {
            JavascriptExecutor jse = (JavascriptExecutor) driver;
            driver.get(ConfigReader.getProperty("homePageUrl"));
            jse.executeScript("window.scrollBy(0,5000)");
            ReusableMethods.wait(2);
            homepage.homePageCookiesDecline.click();
            Assert.assertTrue(homepage.homePageFooterGoogleStore.isDisplayed());
            homepage.homePageFooterGoogleStore.click();
            Assert.assertEquals(Driver.getDriver().getCurrentUrl(), "https://store.google.com/");
        } finally {
            driver.quit();
        }
    }
}
