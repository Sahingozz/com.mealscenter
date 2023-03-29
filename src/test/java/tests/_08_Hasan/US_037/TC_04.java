package tests._08_Hasan.US_037;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.Admin_Dashboard;
import utilities.Driver;
import utilities.ReusableMethods;
import utilities.TestBaseReport;

import java.io.IOException;

public class TC_04 extends TestBaseReport {


    Admin_Dashboard adminDashboard = new Admin_Dashboard();

    @Test
    public void TC_04() throws IOException {
        extentTest=extentReports.createTest("US_37 TC_04","Ilgili Alanin gorunur ve Tiklanabilir oldugu dogrulanmali");
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
        extentTest.info("Merchant  linki tiklandi");

        //-Kullanici acilan sekmelerden "List"  linkinin tiklar
        adminDashboard.listButtonu.click();
        extentTest.info("List linkine tiklandi");

        // sonra da  acilan sayfada "All Merchant " adindaki tum saticilara ait  olan listede silme isleminin  yapilabildiginin dogrular.
        extentTest.info("All Merchant olan listede  silme isleminin gerceklesemedigi tespit edildi. Bug bulundu");
       ReusableMethods.getScreenShotFullScreen(Driver.getDriver());
        adminDashboard.deleteButton.click();

        //-Kullanıcı sayfayı kapatır
        Driver.closeDriver();
        extentTest.info("Sayfa kapatildi");
        extentTest.fail("Test gerceklesemedi, Bug bulundu");

    }
}
