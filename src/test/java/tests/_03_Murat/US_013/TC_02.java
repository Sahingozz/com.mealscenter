package tests._03_Murat.US_013;


import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
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
    private void TC_02() {
        extentTest= extentReports.createTest("TC_02", "ilgili alana gidildigi dogrulanmali");

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

        homepage.cookiesButton.click();

        actions.sendKeys(homepage.searchButton)
                .sendKeys("New Orleans").perform();
        homepage.newOrleansButton.click();

        extentTest.info("search kutusuna New Orleans yazildi , sonuclar dogrulandi");

        // 5* User closes the Page.

        Driver.getDriver().close();
        extentTest.info("Sayfa kapandi");
        extentTest.pass("test basarili");

    }
}

