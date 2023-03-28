package tests._08_Hasan.US_036;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.Admin_Dashboard;
import utilities.Driver;
import utilities.ReusableMethods;
import utilities.TestBaseReport;

public class TC_07 extends TestBaseReport {
    Admin_Dashboard adminDashboard=new Admin_Dashboard();
    @Test
    public void TC_07() {
        extentTest=extentReports.createTest("US_36 TC_07","Ilgili Alanin gorunur ve Tiklanabilir oldugu dogrulanmali");
        // - Kullanıcı açtığı browserla admin paneli olan "AdminUrl" ye gider
        // - Kullanıcı "username" ve "password" girişi yapıp, "Sign in" linkine  tıklar
        ReusableMethods.adminLogin("hasan.adiguzel","123456");
        extentTest.info("Admin sayfasina login yapildi ve Admin anasayfaya gidildi ");
        // - Kullanıcı acilan sayfada sol panelde bulunan "Dasboard" linkine basar
        adminDashboard.dashboardButtonu.click();
        extentTest.info("Dashboard linki tiklandi");
        // ve acilan sayfada "Order Receuved" bolumunun gorunur oldugunu ve degerler icerdigini dogrular
        Assert.assertTrue(adminDashboard.orderRecevedLink.isDisplayed());
        Assert.assertFalse(adminDashboard.orderRecevedLink.getText().isEmpty());
        extentTest.info("Merchant linki tiklandi ve acilan sayfada bulunan 'order Receved' bolumununun ozet bilgiler icerdigi dogrulandi");
        // - Kullanıcı sayfayı kapatır
        Driver.closeDriver();
        extentTest.info("Sayfa kapatildi");
        extentTest.pass("Test hatasiz gerceklesti");
    }
}

