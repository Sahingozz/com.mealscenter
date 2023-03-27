package tests._01_Miyase.US_004;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.Homepage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

public class TC_14 {

    Homepage homepage = new Homepage();

    @Test
    public void testMealFooterBlogHowToLink() {
        WebDriver driver = Driver.getDriver();
        try {
            JavascriptExecutor jse = (JavascriptExecutor) driver;
            driver.get(ConfigReader.getProperty("homePageUrl"));
            jse.executeScript("window.scrollBy(0,5000)");
            ReusableMethods.wait(2);
            homepage.homePageCookiesDecline.click();
            Assert.assertTrue(homepage.homePageFooterBlogHowToLink.isDisplayed());
            homepage.homePageFooterBlogHowToLink.click();
            Assert.assertEquals(Driver.getDriver().getCurrentUrl(), "https://qa.mealscenter.com/how-to-eat-healthy-with-food-delivery");
        } finally {
            driver.quit();
        }
    }
}
