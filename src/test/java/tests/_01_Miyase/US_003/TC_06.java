
package tests._01_Miyase.US_003;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.Homepage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

public class TC_06 {

    Homepage homepage = new Homepage();

    @Test
    public void testMealCenterAccessBurgers() {
        WebDriver driver = Driver.getDriver();
        driver.get(ConfigReader.getProperty("homePageUrl"));
        ReusableMethods.wait(3);
        homepage.homePageCookiesDecline.click();
        Assert.assertTrue(homepage.homePageBodyBurgers.isDisplayed());
        homepage.homePageBodyBurgers.click();
        Assert.assertEquals(Driver.getDriver().getCurrentUrl(), "https://qa.mealscenter.com/cuisine/burgers");
        driver.quit();
    }
}
