package tests._03_Murat.US_014;


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
        homepage.cookiesButton.click();

        extentTest.info("admin sayfasina login islemi gerceklesti ve anasayfaya gidildi");

        ReusableMethods.wait(2);

        // 4* The user clicks on his name in the upper right corner.

        homepage.nameButton.click();

        // 5* The user presses the Manage my account button.

        homepage.manageMyAccountButton.click();

        // 6* User presses the Change Password button."

        homepage.changePasswordButton.click();

        // 7* User writer old password 'Murat3656.' , new passwords 'Murat4606.'.

        actions.sendKeys(homepage.oldPasswordButton)
                .sendKeys("Murat3656.")
                .sendKeys(Keys.TAB)
                .sendKeys("Murat4606.")
                .sendKeys(Keys.TAB)
                .sendKeys("Murat4606.").perform();

        // 8* User click Submit button.

        homepage.changePasswordSubmitButton.click();

        extentTest.info("Password degistirme islemi basarili");

        // 9* User closes the Page.

        Driver.getDriver().close();
        extentTest.info("Sayfa kapandi");
        extentTest.pass("test basarili");
    }
}