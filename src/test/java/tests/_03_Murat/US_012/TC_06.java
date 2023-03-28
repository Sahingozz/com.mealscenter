package tests._03_Murat.US_012;


import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.Homepage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

public class TC_06 {

    Homepage homepage=new Homepage();
    private ReusableMethods reusableMethods;

    @Test
    public void TC_06() {

        // 1* User goes to https://qa.mealscenter.com/ homepage

        Driver.getDriver().get(ConfigReader.getProperty("mealUrl"));

        // 2* The user presses the sign in button and writes the mail and password.

        homepage.signInButton.click();
        Actions actions = new Actions(Driver.getDriver());
        actions.sendKeys(homepage.eMailButton)
                .sendKeys("m.korkmaz4606@gmail.com")
                .sendKeys(Keys.TAB)
                .sendKeys("Murat3656.").perform();

        // 3* User confirms Sign in button.

        homepage.signInButtonConfirm.click();

        homepage.cookiesButton.click();

        // 4* User clicks Chinese page.

        homepage.moreButton.click();
        homepage.chineseButton.click();

        // 5* User verifies that there is a Sichuanese Cuisine restaurant.

        homepage.sichuaneseButton.click();
        String expectedSichuaneseUrl="https://qa.mealscenter.com/sichuanesecuisine";
        String actaulSichuaneseUrl=Driver.getDriver().getCurrentUrl();
        Assert.assertTrue(expectedSichuaneseUrl.contains(actaulSichuaneseUrl));

        // 6* User closes the page.

        Driver.getDriver().close();

    }
}
