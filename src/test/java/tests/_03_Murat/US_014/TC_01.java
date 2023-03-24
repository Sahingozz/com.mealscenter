package tests._03_Murat.US_014;


import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;
import tests._03_Murat.Page_US_014;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

public class TC_01 {

    Page_US_014 page_us_014 = new Page_US_014();
    private ReusableMethods reausableMethods;

    @Test
    private void profileMethod() {

        // 1* User goes to https://qa.mealscenter.com/ homepage

        Driver.getDriver().get(ConfigReader.getProperty("mealUrl"));

        // 2* The user presses the sign in button and writes the mail and password.

        page_us_014.signInButton.click();
        Actions actions = new Actions(Driver.getDriver());
        actions.sendKeys(page_us_014.eMailButton)
                .sendKeys("m.korkmaz4606@gmail.com")
                .sendKeys(Keys.TAB)
                .sendKeys("Murat3656.").perform();

        // 3* User confirms Sign in button.

        page_us_014.signInButtonConfirm.click();
        page_us_014.cookiesButton.click();

        // 4* User closes the Page.

        Driver.getDriver().close();
    }
}