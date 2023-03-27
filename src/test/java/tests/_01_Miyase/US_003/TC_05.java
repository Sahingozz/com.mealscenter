
package tests._01_Miyase.US_003;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.Homepage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

public class TC_05 {

    Homepage homepage = new Homepage();

    @Test
    public void testMealCenterAccessMexicanCuisine() {
        WebDriver driver = Driver.getDriver();
        driver.get(ConfigReader.getProperty("homePageUrl"));
        ReusableMethods.wait(3);
        homepage.homePageCookiesDecline.click();
        Assert.assertTrue(homepage.homePageBodyMexican.isDisplayed());
        homepage.homePageBodyMexican.click();
        Assert.assertEquals(Driver.getDriver().getCurrentUrl(), "https://qa.mealscenter.com/cuisine/mexican");
        driver.quit();
    }
}
