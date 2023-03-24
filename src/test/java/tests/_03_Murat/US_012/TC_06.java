package _03_Murat.US_012;


import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;
import tests._03_Murat.Page_US_012;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

public class TC_06 {

    Page_US_012 page_us_012 = new Page_US_012();
    private ReusableMethods reausableMethods;

    @Test
    public void yerelLezzetler() {

        // 1* User goes to https://qa.mealscenter.com/ homepage

        Driver.getDriver().get(ConfigReader.getProperty("mealUrl"));

        // 2* The user presses the sign in button and writes the mail and password.

        page_us_012.signInButton.click();
        Actions actions = new Actions(Driver.getDriver());
        actions.sendKeys(page_us_012.eMailButton)
                .sendKeys("m.korkmaz4606@gmail.com")
                .sendKeys(Keys.TAB)
                .sendKeys("Murat3656.").perform();

        // 3* User confirms Sign in button.

        page_us_012.signInButtonConfirm.click();

        // 4* User clicks Chinese page.

        page_us_012.moreButton.click();
        page_us_012.chineseButton.click();

        // 5* User verifies that there is a Sichuanese Cuisine restaurant.

        page_us_012.sichuaneseButton.click();
        String expectedSichuaneseUrl="https://qa.mealscenter.com/sichuanesecuisine";
        String actaulSichuaneseUrl=Driver.getDriver().getCurrentUrl();
        Assert.assertTrue(expectedSichuaneseUrl.contains(actaulSichuaneseUrl));

        // 6* User closes the page.

        Driver.getDriver().close();

    }
}
