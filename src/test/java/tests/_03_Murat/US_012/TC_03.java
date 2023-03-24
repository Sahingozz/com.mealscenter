package tests._03_Murat.US_012;

import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.Homepage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

public class TC_03 {

    Homepage homepage=new Homepage();
    private ReusableMethods reausableMethods;

    @Test
    public void TC_03() {

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

        // 4* Click Mexican page.

        homepage.mexicanButton.click();

        // 5* User verifies that Lapalmera restaurant exists.

        String expectedLapalmerasUrl="https://qa.mealscenter.com/cuisine/mexican";
        String actaulLapalmeraUrl=Driver.getDriver().getCurrentUrl();
        Assert.assertTrue(expectedLapalmerasUrl.contains(actaulLapalmeraUrl));

        // 6* User closes the page.

        Driver.getDriver().close();

    }
}
