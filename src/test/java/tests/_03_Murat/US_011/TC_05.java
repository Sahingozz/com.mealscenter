package tests._03_Murat.US_011;


import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;
import tests._03_Murat.Page_US_011;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

public class TC_05 {

    Page_US_011 page_us_011 = new Page_US_011();
    private ReusableMethods reausableMethods;

    @Test
    private void restaurantMethod() {

        // 1* User goes to https://qa.mealscenter.com/ homepage

        Driver.getDriver().get(ConfigReader.getProperty("mealUrl"));

        // 2* User presses the sign in button and writes the mail and password.

        page_us_011.signInButton.click();
        Actions actions = new Actions(Driver.getDriver());
        actions.sendKeys(page_us_011.eMailButton)
                .sendKeys("m.korkmaz4606@gmail.com")
                .sendKeys(Keys.TAB)
                .sendKeys("Murat3656.").perform();

        // 3* User confirms Sign in button."

        page_us_011.signInButtonConfirm.click();

        // 4* press the cookies button

        page_us_011.cookiesButton.click();

        // 5* User type New Orleans into the search engine and search.



        actions.sendKeys(page_us_011.searchButton)
                .sendKeys("New Orleans").perform();
        page_us_011.newOrleansButton.click();

        // 5* User clicks on Burger King restaurant.

        page_us_011.burgerKingButton.click();

        // 6* User adds Double Whopper menu to cart.

        page_us_011.whopperMenuButton.click();

        // 7* User Ceheckout does.

        page_us_011.checkoutButton.click();

        // 8* User closes the page.

        Driver.getDriver().close();

    }
}