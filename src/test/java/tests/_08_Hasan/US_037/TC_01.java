package tests._08_Hasan.US_037;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.Admin_Dashboard;
import utilities.Driver;
import utilities.ReusableMethods;
import utilities.TestBaseReport;

public class TC_01 extends TestBaseReport {
    Admin_Dashboard adminDashboard = new Admin_Dashboard();

    @Test
    public void TC_01() {
         extentTest=extentReports.createTest("US_37 TC_01","Ilgili Alanin gorunur ve Tiklanabilir oldugu dogrulanmali");
        // - Kullanıcı açtığı browserla admin paneli olan "AdminUrl" ye gider
        // - Kullanıcı "username" ve "password" girişi yapıp, "Sign in" linkine  tıklar
         ReusableMethods.adminLogin("hasan.adiguzel", "123456");
         extentTest.info("Admin sayfasina login yapildi ve Admin anasayfaya gidildi ");
         // - Kullanıcı acilan sayfada sol panelde bulunan "Dasboard" linkine basar
        adminDashboard.dashboardButtonu.click();
        extentTest.info("Dashboard linki tiklandi");
        //-Kullanıcı acilan sayfada sol panelde bulunan "Dasboard"  panelinin altinda bulunan "Merchant"
        //linkine basar  ve acilan sekmede list linkinin tiklar.
        adminDashboard.merchantButtonu.click();
       extentTest.info("Mercahnt link tiklanir oldugu dogrulandi");
        //-Kullanici acilan sekmelerden "List"  linkinin tiklanabilir  oldugunu dogrular
        adminDashboard.listButtonu.click();
        String expectedUrl="list";
        String actualUrl= Driver.getDriver().getCurrentUrl();
        Assert.assertTrue(actualUrl.contains(expectedUrl));
        extentTest.info("List linkine gidildigi aktuel url ile karsilatirma yapilarak dogrulandi.");
        //-Kullanıcı sayfayı kapatır
        Driver.closeDriver();
        extentTest.info("Sayfa kapatildi");
        extentTest.pass("Test hatasiz gerceklesti");
    }
}
