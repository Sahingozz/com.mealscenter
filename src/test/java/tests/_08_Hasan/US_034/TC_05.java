package tests._08_Hasan.US_034;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.Merchant_Dashboard;
import utilities.Driver;
import utilities.ReusableMethods;
import utilities.TestBaseReport;

public class TC_05 extends TestBaseReport {
    Merchant_Dashboard merchantDashboard=new Merchant_Dashboard();

    @Test
    public void TC_05(){
        extentTest=extentReports.createTest("US_34 TC_06","Ilgili Alanin gorunur ve Tiklanabilir oldugu dogrulanmali");

        //- Kullanıcı açtığı browserla admin paneli olan "Merchant Url" ye gider
        //- Kullanıcı "username" ve "password" girişi yapıp, "Sign in" linkine  tıklar
        ReusableMethods.getmerchantLogin("7elevenAdmin","1234567");
        extentTest.info("Merchant sayfasina login yapildi ve Merchant anasayfaya gidildi ");

        //-Kullanıcı sol taraftaki menüde bulunan "Orders Type" ı bulur ve tıklar
        merchantDashboard.orderTypeLink.click();
        extentTest.info("order Type linkine  gidildi");

        //- Kullanici "Delivery" linkinin  tiklar
        merchantDashboard.deliveryLink.click();
        extentTest.info("Delivery sayfasina gidildi");

        //-Kullanici acilan sayfada bulunan "Free Delivery On First Order"" linkinin
        // erisilebilir ve secilebilir oldugunu dogrular
        merchantDashboard.freeDeliveryLink.click();
        extentTest.info("Acilan sayfada bulunan Free delivery linki basariyla tiklandi ");
        Assert.assertTrue(merchantDashboard.freeDeliveryLink.isDisplayed(), "hatalı element");
        extentTest.info("Free delivery   linki basariyla tiklanmasina ragmen ,sayfada herhangi bir degisiklik meydana gelmedi.Fonksiyonu olmayan bir button bulundu ");

        //  -Kullanıcı sayfayı kapatır
        Driver.closeDriver();
        extentTest.info("Sayfa kapatildi.");
        extentTest.fail("'Free Delivery on first order ' linkinin bir fonksiyonu yok");
    }

}
