
package tests._01_Miyase.US_003;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.Homepage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

public class TC_23 {

    Homepage homepage = new Homepage();

    @Test
    public void testMealCenterDiscoverHealthyFood() {
        WebDriver driver = Driver.getDriver();
        JavascriptExecutor jse = (JavascriptExecutor)driver;
        driver.get(ConfigReader.getProperty("homePageUrl"));
        jse.executeScript("window.scrollBy(0,2000)");
        ReusableMethods.wait(1);
        homepage.homePageCookiesDecline.click();
        Assert.assertTrue(homepage.homePageBodyJoinUsLink.isDisplayed());
        homepage.homePageBodyJoinUsLink.click();
        ReusableMethods.wait(1);
        Assert.assertEquals(Driver.getDriver().getCurrentUrl(), "https://qa.mealscenter.com/merchant/signup");
        driver.quit();
    }
}
