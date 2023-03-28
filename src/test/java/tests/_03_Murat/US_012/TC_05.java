package tests._03_Murat.US_012;


import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.Homepage;
import utilities.*;

public class TC_05 extends TestBaseReport {

    Homepage homepage=new Homepage();
    private ReusableMethods reusableMethods;

    @Test
    public void TC_05() {
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
        extentTest.info("admin sayfasina login islemi gerceklesti ve anasayfaya gidildi");

        ReusableMethods.wait(2);
        homepage.cookiesButton.click();

        // 4* User type New Orleans into the search engine and search

        actions.sendKeys(homepage.searchButton)
                .sendKeys("New Orleans").perform();
        homepage.newOrleansButton.click();

        ReusableMethods.wait(2);

        // 4* User clicks on Thai page.
       // JSUtilities.clickWithJS(Driver.getDriver(),homepage.thaiButton);
        homepage.showMorebutton.click();

        ReusableMethods.wait(2);
        homepage.thaiButton.click();

        ReusableMethods.wait(2);
        //JSUtilities.clickWithJS(Driver.getDriver(),homepage.streetCafeButton);
        homepage.streetCafeButton.click();

        // 5* User confirms that Bai Tong Thai Sreet Cafe exists.

        String expectedUrl="https://qa.mealscenter.com/bai-tong-thai-street-cafe";
        String actaulUrl=Driver.getDriver().getCurrentUrl();
        Assert.assertEquals(actaulUrl,expectedUrl);
        extentTest.info("Bai Tong Thai Sreet Cafe linkine girilemedi");

        // 6* User closes the page.

        Driver.getDriver().close();
        extentTest.info("Sayfa kapandi");
        extentTest.pass("test basarili");

    }
}
