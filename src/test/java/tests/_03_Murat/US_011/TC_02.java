package tests._03_Murat.US_011;


import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.Homepage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;
import utilities.TestBaseReport;

public class TC_02 extends TestBaseReport {

    Homepage homepage=new Homepage();
    private ReusableMethods reusableMethods;

    @Test
    private void TC_02
            (){
        extentTest= extentReports.createTest("TC_02", "ilgili alana gidildigi dogrulanmali");

        // 1* User goes to https://qa.mealscenter.com/ homepage

        Driver.getDriver().get(ConfigReader.getProperty("mealUrl"));

        // 2* User presses the sign in button and writes the mail and password.

        homepage.signInButton.click();
        Actions actions = new Actions(Driver.getDriver());
        actions.sendKeys(homepage.eMailButton)
                .sendKeys("m.korkmaz4606@gmail.com")
                .sendKeys(Keys.TAB)
                .sendKeys("Murat3656.").perform();

        // 3* User confirms Sign in button."

        homepage.signInButtonConfirm.click();

        extentTest.info("admin sayfasina login islemi gerceklesti ve anasayfaya gidildi");

        // 4* press the cookies button

        ReusableMethods.wait(2);

        homepage.cookiesButton.click();

        // 5* User type New Orleans into the search engine and search

        actions.sendKeys(homepage.searchButton)
                .sendKeys("New Orleans").perform();
        homepage.newOrleansButton.click();

        // 6* Verifies that the  section exists.

        String expectedUrl="https://qa.mealscenter.com/restaurants";
        String actualUrl=Driver.getDriver().getCurrentUrl();
        Assert.assertEquals(actualUrl,expectedUrl);


        // 7* User goes to Eleven page.
        // 8* Checks that there is a User Menu section.

        homepage.elevenButton.click();

        // 9* User adds Red Bull 12oz to cart.

        homepage.redBullButton.click();
        ReusableMethods.wait(3);

        // 10* User closes the page.

        Driver.getDriver().close();
        extentTest.info("Sayfa kapandi");
        extentTest.pass("test basarili");
    }
}
