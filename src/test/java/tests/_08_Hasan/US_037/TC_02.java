package tests._08_Hasan.US_037;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.Admin_Dashboard;
import utilities.Driver;
import utilities.ReusableMethods;
import utilities.TestBaseReport;

public class TC_02 extends TestBaseReport {
    Admin_Dashboard adminDashboard = new Admin_Dashboard();

    @Test
    public void TC_11() {
        extentTest=extentReports.createTest("US_37 TC_02","Ilgili Alanin gorunur ve Tiklanabilir oldugu dogrulanmali");
        // - Kullanıcı açtığı browserla admin paneli olan "AdminUrl" ye gider
        // - Kullanıcı "username" ve "password" girişi yapıp, "Sign in" linkine  tıklar
        ReusableMethods.adminLogin("hasan.adiguzel", "123456");
        extentTest.info("Admin sayfasina login yapildi ve Admin anasayfaya gidildi ");
        // - Kullanıcı acilan sayfada sol panelde bulunan "Dasboard" linkine basar
        adminDashboard.dashboardButtonu.click();
        extentTest.info("Dashboard linki tiklandi");
        //-Kullanıcı acilan sayfada sol panelde bulunan "Dasboard"  panelinin altinda bulunan "Merchant" linkine basar
        adminDashboard.merchantButtonu.click();
        extentTest.info("Merchant linki tiklandi");
        //-Kullanici acilan sekmelerden "List"  linkinin tiklar
        adminDashboard.listButtonu.click();
        extentTest.info("List linki tiklandi");
        //Kullanici "List"  linkinin  altinda  acilan sayfada "All Merchant " adinda tum saticilara ait bir listenin oldugunu dogrular
        String expected="All Merchant";
        String actual= adminDashboard.allMerchantBasligi.getText();
        Assert.assertTrue(actual.contains(expected));
        //Basliklari iceren kismi dogrular.
        Assert.assertFalse(ReusableMethods.getElementsText(By.xpath("//th[@class='sorting']")).isEmpty());
        System.out.println(ReusableMethods.getElementsText(By.xpath("//th[@class='sorting']")));
        //Kullanici listenin icerigini dogrular
        Assert.assertFalse(ReusableMethods.getElementsText(By.xpath("//tbody/tr")).isEmpty());
        System.out.println(ReusableMethods.getElementsText(By.xpath("//tbody/tr")));
        extentTest.info("All Merchant listesinde tum saticilarin oldugu tum elemtlerin textleri getirilerek yapilan karsilatirmalar sonunda dogrulandi");
        //-Kullanıcı sayfayı kapatır
        Driver.closeDriver();
        extentTest.info("Sayfa kapatildi");
        extentTest.pass("Test hatasiz gerceklesti");
    }
}
