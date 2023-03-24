package tests._03_Murat.US_012;


import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.Homepage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

public class TC_05 {

    Homepage homepage=new Homepage();
    private ReusableMethods reausableMethods;

    @Test
    public void TC_05() {

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

        // 4* User clicks on Thai page.

        homepage.thaiButton.click();
        homepage.streetCafeButton.click();

        // 5* User confirms that Bai Tong Thai Sreet Cafe exists.

        String expectedSreetCafeUrl="https://qa.mealscenter.com/bai-tong-thai-street-cafe";
        String actaulSreetCafeUrl=Driver.getDriver().getCurrentUrl();
        Assert.assertTrue(expectedSreetCafeUrl.contains(actaulSreetCafeUrl));

        // 6* User closes the page.

        Driver.getDriver().close();

    }
}
