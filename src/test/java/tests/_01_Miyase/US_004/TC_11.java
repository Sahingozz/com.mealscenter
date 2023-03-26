package tests._01_Miyase.US_004;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.Homepage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

import java.util.ArrayList;
import java.util.List;

public class TC_11 {

    Homepage homepage = new Homepage();

    @Test
    public void testMealCenterFooterSocialMediaYoutubeLink() {
        WebDriver driver = Driver.getDriver();
        try {
            JavascriptExecutor jse = (JavascriptExecutor) driver;
            driver.get(ConfigReader.getProperty("homePageUrl"));
            jse.executeScript("window.scrollBy(0,5000)");
            ReusableMethods.wait(2);
            homepage.homePageCookiesDecline.click();
            Assert.assertTrue(homepage.homePageFooterSocialMediaYoutubeLink.isDisplayed());
            homepage.homePageFooterSocialMediaYoutubeLink.click();
            List<String> browserTabs = new ArrayList<>();
            browserTabs.addAll(driver.getWindowHandles());
            driver.switchTo().window(browserTabs.get(1));
            Assert.assertEquals(Driver.getDriver().getCurrentUrl(), "https://www.youtube.com/");
        } finally {
            driver.quit();
        }
    }
}
