package tests._08_Hasan.US_036;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.Admin_Dashboard;
import utilities.Driver;
import utilities.ReusableMethods;
import utilities.TestBaseReport;

public class TC_06 extends TestBaseReport {

    Admin_Dashboard adminDashboard=new Admin_Dashboard();
    @Test
    public void TC_06(){
        extentTest=extentReports.createTest("US_36 TC_06","Ilgili Alanin gorunur ve Tiklanabilir oldugu dogrulanmali");
        // - Kullanıcı açtığı browserla admin paneli olan "AdminUrl" ye gider
        // - Kullanıcı "username" ve "password" girişi yapıp, "Sign in" linkine  tıklar
        ReusableMethods.adminLogin("hasan.adiguzel","123456");
        extentTest.info("Admin sayfasina login yapildi ve Admin anasayfaya gidildi ");
        // - Kullanıcı acilan sayfada sol panelde bulunan "Dasboard" linkine basar
        adminDashboard.dashboardButtonu.click();
        extentTest.info("Dashboard linki tiklandi");
        // ve acilan sayfada "Today Deliverd" bolumunun gorunur oldugunu ve degerler icerdigini dogrular
        Assert.assertTrue(adminDashboard.totalSubscriptionsButtonu.isDisplayed());
        Assert.assertFalse(adminDashboard.totalSubscriptionsButtonu.getText().isEmpty());
        extentTest.info("Merchant linki tiklandi ve acilan sayfada bulunan 'Total total' bolumununun ozet bilgiler icerdigi dogrulandi");
        // - Kullanıcı sayfayı kapatır
        Driver.closeDriver();
        extentTest.info("Sayfa kapatildi");
        extentTest.pass("Test hatasiz gerceklesti");
    }
}
