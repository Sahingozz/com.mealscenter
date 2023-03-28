package tests._03_Murat.US_013;


import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;
import pages.Homepage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

public class TC_03 {

    Homepage homepage=new Homepage();
    private ReusableMethods reusableMethods;

    @Test
    private void TC_03() {

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

        // 4* User type New Orleans into the search engine and search.

        homepage.cookiesButton.click();

        actions.sendKeys(homepage.searchButton)
                .sendKeys("New Orleans").perform();
        homepage.newOrleansButton.click();


        // 5* User clicks Vegan Season on the page that comes up.

        homepage.veganSeasonButton.click();

        // 6* User adds Veg Samosa menu to cart.

        homepage.vegSamosaAddButton.click();

        // 7* User clicks new order button

        homepage.newOrderButton.click();

        // 8* User presses the Checkout button.

        homepage.checkOutButton.click();

        // 9* User clicks on Stripe option.

        homepage.stripeButton.click();

        // 10* Enters the User Card information and presses the Add Stripe button.

        actions.sendKeys(homepage.cartNoButton)
                .sendKeys("4242424242424242052533344444").perform();

        homepage.addStripeButton.click();

        // 11* User presses the Place Order button.

        homepage.placeOrderButton.click();


        // 12* User closes the Page.

        Driver.getDriver().close();

    }
}

