package tests._03_Murat.US_014;


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
        homepage.cookiesButton.click();
        extentTest.info("admin sayfasina login islemi gerceklesti ve anasayfaya gidildi");

        ReusableMethods.wait(2);

        // 4* User clicks My Orders link.

        homepage.nameButton.click();
        homepage.myOrdersButton.click();

        // 5* The number of User Orders confirms.

        WebElement orderNumber=Driver.getDriver().
                findElement(By.xpath("//div[@class='col-lg-3 d-none d-lg-block']"));
        Assert.assertTrue(orderNumber.isDisplayed());

        extentTest.info("Begenilen restaurantlarin adedi basariyla goruldu");


        // 6* User closes the Page.

        Driver.getDriver().close();
        extentTest.info("Sayfa kapandi");
        extentTest.pass("test basarili");
    }
}