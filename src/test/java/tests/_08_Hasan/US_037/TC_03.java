package tests._08_Hasan.US_037;

import com.github.javafaker.Faker;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.Admin_Dashboard;
import utilities.Driver;
import utilities.ReusableMethods;
import utilities.TestBaseReport;

public class TC_03 extends TestBaseReport {
    Admin_Dashboard adminDashboard = new Admin_Dashboard();
    Faker faker=new Faker();

    @Test
    public void TC_03() {
        extentTest=extentReports.createTest("US_37 TC_03","Ilgili Alanin gorunur ve Tiklanabilir oldugu dogrulanmali");
        // - Kullanıcı açtığı browserla admin paneli olan "AdminUrl" ye gider
        // - Kullanıcı "username" ve "password" girişi yapıp, "Sign in" linkine  tıklar
        ReusableMethods.adminLogin("hasan.adiguzel", "123456");
        extentTest.info("Admin sayfasina login yapildi ve Admin anasayfaya gidildi ");

        // - Kullanıcı acilan sayfada sol panelde bulunan "Dasboard" linkine basar
        adminDashboard.dashboardButtonu.click();
        extentTest.info("Dashboard linki tiklandi");

        //-Kullanıcı acilan sayfada sol panelde bulunan "Dasboard"  panelinin altinda bulunan "Merchant"
        //linkine basar
        adminDashboard.merchantButtonu.click();
        extentTest.info("Merchant  linki tiklandi");

        //-Kullanici acilan sekmelerden "List"  linkinin tiklar
        adminDashboard.listButtonu.click();
        extentTest.info("List linki tiklandi");

        //  acilan sayfada "All Merchant" adindaki tum saticilara ait  olan listede degisiklik yapilabildiginin dogrular
         adminDashboard.allMerchantListEdit.click();
        Actions actions=new Actions(Driver.getDriver());

        //emailin erisilebilir olmasi dogurlanir.
        Assert.assertTrue(adminDashboard.editRestuarantName.isEnabled());
        extentTest.info("Restuarant isim  bolumune erisilebilir oldugu dogrulandi");
        adminDashboard.editRestuarantName.clear();
        actions.moveToElement(adminDashboard.editRestuarantName).click().perform();
        actions.sendKeys(faker.name().lastName())
                .sendKeys(Keys.TAB)
                .sendKeys(Keys.DELETE)
                .sendKeys(faker.animal().name())
                .sendKeys(Keys.TAB)
                .sendKeys(faker.name().fullName())
                .sendKeys(Keys.TAB)
                .sendKeys(faker.phoneNumber().cellPhone())
                .sendKeys(Keys.TAB)
                .sendKeys(faker.internet().emailAddress())
                .sendKeys(Keys.TAB)
                .sendKeys(Keys.TAB)
                .sendKeys(Keys.TAB)
                .sendKeys("iyi gunler")
                .sendKeys(Keys.TAB)
                .sendKeys("iyi gunler")
                .sendKeys(Keys.TAB)
                .sendKeys(Keys.ENTER)
                .build().perform();

        Select select  =new Select(adminDashboard.cuisineDDm);
        select.selectByVisibleText("Japanese");
        actions.sendKeys(Keys.TAB).build().perform();
        select=new Select(adminDashboard.servicesDDM);
        select.selectByIndex(1);


        select=new Select(adminDashboard.statusButton);
        select.selectByIndex(1);

        actions.moveToElement(adminDashboard.saveButton).click().perform();

        String expectedText="updated";
        String actualtext =adminDashboard.editUpdated.getText();
        Assert.assertTrue(actualtext.contains(expectedText));
        extentTest.info("Yapilan degisiklik sonrasinda yeni bilgilerin sayfada gorunur oldugu dogrulandi");

        //-Kullanıcı sayfayı kapatır
        // Driver.closeDriver();
        extentTest.info("Sayfa kapatildi");
        extentTest.pass("Test hatasiz gerceklesti");










    }
}