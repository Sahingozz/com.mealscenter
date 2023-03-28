package tests._03_Murat.US_012;


import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.Homepage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;
import utilities.TestBaseReport;

public class TC_06 extends TestBaseReport {

    Homepage homepage=new Homepage();
    private ReusableMethods reusableMethods;

    @Test
    public void TC_06() {
        extentTest= extentReports.createTest("TC_06", "ilgili alana gidildigi dogrulanmali");
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

        // 4* User type New Orleans into the search engine and search

        actions.sendKeys(homepage.searchButton)
                .sendKeys("New Orleans").perform();
        homepage.newOrleansButton.click();

        ReusableMethods.wait(2);

        homepage.cookiesButton.click();

        ReusableMethods.wait(2);

        // 4* User clicks Chinese page.

        homepage.showMorebutton.click();

        ReusableMethods.wait(2);
        homepage.chineseButton.click();

        ReusableMethods.wait(2);

        // 5* User verifies that there is a Sichuanese Cuisine restaurant.

        homepage.sichuaneseButton.click();
        String expectedUrl="https://qa.mealscenter.com/sichuanesecuisine";
        String actaulUrl=Driver.getDriver().getCurrentUrl();
        Assert.assertEquals(actaulUrl,expectedUrl);
        extentTest.info("Bai Tong Thai Sreet Cafe linkine girilemedi");
        // 6* User closes the page.

        Driver.getDriver().close();
        extentTest.info("Sayfa kapandi");
        extentTest.pass("test basarili");

    }
}
