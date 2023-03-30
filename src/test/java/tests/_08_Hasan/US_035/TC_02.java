package tests._08_Hasan.US_035;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.Admin_Dashboard;
import utilities.Driver;
import utilities.ReusableMethods;
import utilities.TestBaseReport;

public class TC_02 extends TestBaseReport {

    @Test
    public void TC_02(){
        extentTest=extentReports.createTest("US_35 TC_02","Ilgili Alanin gorunur ve Tiklanabilir oldugu dogrulanmali");
        // - Kullanıcı açtığı browserla admin paneli olan "AdminUrl" ye gider
        // - Kullanıcı "username" ve "password" girişi yapıp, "Sign in" linkine  tıklar
        // - Kullanıcı "Url"ye gider
        ReusableMethods.adminLogin("hasan.adiguzel","123456");

        //  ve Url'nin "https://qa.mealscenter.com/backoffice/admin/dashboard"  icerdiginin dogrular
        extentTest.info("Admin sayfasina login yapildi ve Admin anasayfaya gidildi ");
        String expectedUrl="admin/dashboard";
        String actualUrl= Driver.getDriver().getCurrentUrl();
        Assert.assertTrue(actualUrl.contains(expectedUrl));
        extentTest.info("Admin sayfasina gidildigi dogrulandi");

        // - Kullanıcı sayfayı kapatır
        Driver.closeDriver();
        extentTest.info("Sayfa kapatildi");
        extentTest.pass("Test hatasiz gerceklesti");
    }
}
