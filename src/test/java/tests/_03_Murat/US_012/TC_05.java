package tests._03_Murat.US_012;


import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;
import tests._03_Murat.Page_US_012;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

public class TC_05 {

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

        // 4* User clicks on Thai page.

        page_us_012.thaiButton.click();
        page_us_012.streetCafeButton.click();

        // 5* User confirms that Bai Tong Thai Sreet Cafe exists.

        String expectedSreetCafeUrl="https://qa.mealscenter.com/bai-tong-thai-street-cafe";
        String actaulSreetCafeUrl=Driver.getDriver().getCurrentUrl();
        Assert.assertTrue(expectedSreetCafeUrl.contains(actaulSreetCafeUrl));

        // 6* User closes the page.

        Driver.getDriver().close();

    }
}
