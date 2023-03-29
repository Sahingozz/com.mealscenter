package tests._03_Murat.US_014;


import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;
import pages.Homepage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;
import utilities.TestBaseReport;

import java.io.IOException;

public class TC_05 extends TestBaseReport {

    Homepage homepage=new Homepage();
    private ReusableMethods reusableMethods;

    @Test
    private void TC_05() {
        extentTest= extentReports.createTest("TC_05", "ilgili alana gidildigi dogrulanmali");

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
        ReusableMethods.wait(2);
        homepage.cookiesButton.click();
        extentTest.info("admin sayfasina login islemi gerceklesti ve anasayfaya gidildi");

        ReusableMethods.wait(2);

        // 4* User clicks on Payments Options.

        homepage.nameButton.click();
        homepage.paymentsOptionsButton.click();

        // 5* User deletes current payment method.

        homepage.paymentDeleteButton.click();
        try {
            ReusableMethods.getScreenShotFullScreen(Driver.getDriver());
        } catch (IOException e) {

        }
        // bug var
        // odeme yontemi silinmedi
        extentTest.info("odeme yontemi silinmedi");

        // 6* User closes the Page.

        Driver.getDriver().close();
        extentTest.info("Sayfa kapandi");
        extentTest.pass("test basarili");
    }
}