package _03_Murat.US_013;


import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;
import tests._03_Murat.Page_US_013;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

public class TC_02 {

    Page_US_013 page_us_013 = new Page_US_013();
    private ReusableMethods reausableMethods;

    @Test
    private void checkoutMethod() {

        // 1* User goes to https://qa.mealscenter.com/ homepage

        Driver.getDriver().get(ConfigReader.getProperty("mealUrl"));

        // 2* The user presses the sign in button and writes the mail and password.

        page_us_013.signInButton.click();
        Actions actions = new Actions(Driver.getDriver());
        actions.sendKeys(page_us_013.eMailButton)
                .sendKeys("m.korkmaz4606@gmail.com")
                .sendKeys(Keys.TAB)
                .sendKeys("Murat3656.").perform();

        // 3* User confirms Sign in button.

        page_us_013.signInButtonConfirm.click();

        // 4* User type New Orleans into the search engine and search.

        page_us_013.cookiesButton.click();

        actions.sendKeys(page_us_013.searchButton)
                .sendKeys("New Orleans").perform();
        page_us_013.newOrleansButton.click();

        // 5* User closes the Page.

        Driver.getDriver().close();

    }
}

