package tests._08_Hasan.US_034;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.Merchant_Dashboard;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;
import utilities.TestBaseReport;

public class TC_03 extends TestBaseReport {
    Merchant_Dashboard merchantDashboard=new Merchant_Dashboard();
    @Test
    public void TC_03(){
        extentTest=extentReports.createTest("US_34 TC_02","Ilgili Alanin gorunur ve Tiklanabilir oldugu dogrulanmali");
        //- Kullanıcı açtığı browserla admin paneli olan "Merchant Url" ye gider
        // - Kullanıcı "username" ve "password" girişi yapıp, "Sign in" linkine  tıklar
        ReusableMethods.getmerchantLogin("7elevenAdmin","1234567");
        extentTest.info("Merchant sayfasina login yapildi ve Merchant anasayfaya gidildi ");
        //Dashboard linkine tiklanir
        merchantDashboard.dashboardButtonu.click();
        extentTest.info("Dashboard sayfasina gidildi");

        String expectedUrl="dashboard";
        String actualUrl=Driver.getDriver().getCurrentUrl();
        Assert.assertTrue(actualUrl.contains(expectedUrl));
        Assert.assertTrue(merchantDashboard.dashboardButtonu.isEnabled());
        extentTest.info("Dasboard sayfasina gidildigi url karsilatirilmasi ile dogrulandi");
        // -Kullanıcı sayfayı kapatır
         Driver.closeDriver();
         extentTest.info("Acilan sayfa kapatildi");
         extentTest.pass("Test hatasiz gerceklesti");
    }
}
