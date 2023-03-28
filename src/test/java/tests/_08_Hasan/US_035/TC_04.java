package tests._08_Hasan.US_035;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.Admin_Dashboard;
import utilities.Driver;
import utilities.ReusableMethods;
import utilities.TestBaseReport;

public class TC_04 extends TestBaseReport {
    Admin_Dashboard adminDashboard=new Admin_Dashboard();
    @Test
    public  void TC_04(){
        extentTest=extentReports.createTest("US_35 TC_04","Ilgili Alanin gorunur ve Tiklanabilir oldugu dogrulanmali");
        // - Kullanıcı açtığı browserla admin paneli olan "AdminUrl" ye gider
        // - Kullanıcı "username" ve "password" girişi yapıp, "Sign in" linkine  tıklar
        ReusableMethods.adminLogin("hasan.adiguzel","123456");
        extentTest.info("Admin sayfasina login yapildi ve Admin anasayfaya gidildi ");
        // - Kullanıcı sol  ust panelde "Admin ismini "  ve "Email adresinin "  gorunur
        //   oldugunu doğrular.
        String expected ="Hasan";
        String actualProfil= adminDashboard.profilName.getText();
        Assert.assertTrue(actualProfil.contains(expected));
        expected ="adiguzel@gmail";
        actualProfil=adminDashboard.profilName.getText();
        Assert.assertTrue(actualProfil.contains(expected));
        extentTest.info("Girilen sayfada sayfa sahibinin email ve isminin bulundugu dogrulandi");
        // - Kullanıcı sayfayı kapatır
        Driver.closeDriver();
        extentTest.info("Sayfa kapatildi");
        extentTest.pass("Test hatasiz gerceklesti");
    }
}
