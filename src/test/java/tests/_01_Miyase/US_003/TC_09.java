
package tests._01_Miyase.US_003;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.Homepage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

public class TC_09 {

    Homepage homepage = new Homepage();

    @Test
    public void testMealCenterAccessChineseCuisine() {
        WebDriver driver = Driver.getDriver();
        driver.get(ConfigReader.getProperty("homePageUrl"));
        ReusableMethods.wait(3);
        homepage.homePageCookiesDecline.click();
        if (homepage.homePageBodyMenuDropDown.isDisplayed()){
            homepage.homePageBodyMenuDropDown.click();
        }
        Assert.assertTrue(homepage.homePageBodyMenuDropDownChinese.isDisplayed());
        homepage.homePageBodyMenuDropDownChinese.click();
        ReusableMethods.wait(3);
        Assert.assertEquals(Driver.getDriver().getCurrentUrl(), "https://qa.mealscenter.com/cuisine/chinese");
        driver.quit();
    }
}
