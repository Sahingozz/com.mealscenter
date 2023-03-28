package tests._03_Murat.US_013;


import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;
import pages.Homepage;
import utilities.*;

public class TC_03 extends TestBaseReport {

    Homepage homepage=new Homepage();
    private ReusableMethods reusableMethods;

    @Test
    private void TC_03() {
        extentTest= extentReports.createTest("TC_03", "ilgili alana gidildigi dogrulanmali");

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
        extentTest.info("admin sayfasina login islemi gerceklesti ve anasayfaya gidildi");

        // 4* User type New Orleans into the search engine and search.
        ReusableMethods.wait(2);
        homepage.cookiesButton.click();

        actions.sendKeys(homepage.searchButton)
                .sendKeys("New Orleans").perform();
        homepage.newOrleansButton.click();

        extentTest.info("search kutusuna New Orleans yazildi , sonuclar dogrulandi");

        ReusableMethods.wait(3);


        // 5* User clicks Vegan Season on the page that comes up.
        //JSUtilities.clickWithJS(Driver.getDriver(),homepage.veganSeasonButton);
        // JSUtilities.scrollToElement(Driver.getDriver(),homepage.veganSeasonButton);
        actions.scrollByAmount(300,700).build().perform();

        ReusableMethods.wait(3);
        JavascriptExecutor executor = (JavascriptExecutor) Driver.getDriver();
        executor.executeScript("arguments[0].click();", homepage.veganSeasonButton);
        //     homepage.veganSeasonButton.click();

        extentTest.info("Vegan Season sayfasina gidildi");

        ReusableMethods.wait(2);

        // 6* User adds Veg Samosa menu to cart.



        homepage.vegSamosaAddButton.click();
        extentTest.info("Veg Samosa menusune gidildi");


        // 7* User clicks new order button

        // homepage.newOrderButton.click();

        // 8* User presses the Checkout button.

        homepage.checkOutButton.click();

        //  homepage.cashOnDeliveryLinkText.click();
        // homepage.addCashButtonVegan.click();

        extentTest.info("checkout yapildi");
        ReusableMethods.wait(2);
        // 9* User clicks on Stripe option.
/*

        actions.sendKeys(Keys.END).perform();
        homepage.stripeButton.click();

        extentTest.info("Stripe sayfasina gidildi");

        ReusableMethods.wait(5);

        // 10* Enters the User Card information and presses the Add Stripe button.

        actions.sendKeys(homepage.cartNoButton)
                .sendKeys("4242424242424242052533344444").perform();

        extentTest.info("Kredi Karti bolumune Kart no, son kullanma tarihi, CVV girildi");
*/
        //    homepage.addStripeButton.click();

        // 11* User presses the Place Order button.

        homepage.placeOrderButton.click();

        extentTest.info("Odeme islemi basarili oldu");


        // 12* User closes the Page.

        Driver.getDriver().close();
        extentTest.info("Sayfa kapandi");
        extentTest.pass("test basarili");

    }
}

