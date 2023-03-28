package tests._08_Hasan.US_035;

import org.testng.annotations.Test;
import utilities.Driver;
import utilities.ReusableMethods;
import utilities.TestBaseReport;

public class TC_01 extends TestBaseReport {
    @Test
    public void TC_01(){
        extentTest=extentReports.createTest("US_35 TC_01","Ilgili Alanin gorunur ve Tiklanabilir oldugu dogrulanmali");
        //-Kullanıcı açtığı browserla admin paneli olan "AdminUrl" ye gider
        //-Kullanıcı "username" ve "password" girişi yapıp, "Sign in" linkine  tıklar
        ReusableMethods.adminLogin("hasan.adiguzel","123456");
        extentTest.info("Admin sayfasina login yapildi ve Admin anasayfaya gidildi ");
        //-Kullanıcı sayfayı kapatır
        Driver.closeDriver();
        extentTest.info("Sayfa kapatildi");
        extentTest.pass("Test hatasiz gerceklesti");
    }
}
