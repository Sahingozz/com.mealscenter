package tests._08_Hasan.US_035;

import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.Admin_Dashboard;
import utilities.Driver;
import utilities.ReusableMethods;
import utilities.TestBaseReport;

public class TC_03 extends TestBaseReport {
    Admin_Dashboard adminDashboard=new Admin_Dashboard();
    @Test
    public void TC_03(){
        extentTest=extentReports.createTest("US_35 TC_03","Ilgili Alanin gorunur ve Tiklanabilir oldugu dogrulanmali");
        // - Kullanıcı açtığı browserla admin paneli olan "AdminUrl" ye gider
        // - Kullanıcı "username" ve "password" girişi yapıp, "Sign in" linkine  tıklar
        ReusableMethods.adminLogin("hasan.adiguzel","123456");
        extentTest.info("Admin sayfasina login yapildi ve Admin anasayfaya gidildi ");

        // - Kullanıcı acilan sayfada "Dashboard"  basliginin gorunur oldugunu dogrular
        String expectedTitle="Dashboard";
        String actualTitle =Driver.getDriver().getTitle();
        Assert.assertTrue(actualTitle.contains(expectedTitle));
        extentTest.info("Dashboard anasayfaya gidildigi dogrulandi");

        // - Kullanıcı sayfayı kapatır
        Driver.closeDriver();
        extentTest.info("Sayfa kapatildi");
        extentTest.pass("Test hatasiz gerceklesti");

    }
}
