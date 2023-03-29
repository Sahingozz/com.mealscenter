package tests._08_Hasan.US_034;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.Merchant_Dashboard;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;
import utilities.TestBaseReport;

public class TC_02 extends TestBaseReport {
      Merchant_Dashboard merchantDashboard=new Merchant_Dashboard();
      @Test
      public void TC_02(){
          extentTest=extentReports.createTest("US_34 TC_02","Ilgili Alanin gorunur ve Tiklanabilir oldugu dogrulanmali");
          // - Kullanıcı açtığı browserla admin paneli olan "Merchant Url" ye gider
          // - Kullanıcı "username" ve "password" girişi yapıp, "Sign in" linkine  tıklar
           ReusableMethods.merchantLoginHasan();
           extentTest.info("Merchant sayfasina  login islemi yapildi ve Merchant Anasayfaya gidildi" );

           // -Kullanıcı sol taraftaki menüde bulunan "Orders Type" ı bulur ve tıklanabildiğini doğrular
          merchantDashboard.orderTypeLink.click();
          extentTest.info("Order Type Linki tiklandi" );

          //- Kullanici "Delivery" linkinin gorunur oldugunu ve tiklanabilir oldugunu dogrular
          merchantDashboard.deliveryLink.click();
          extentTest.info("Delivery Linki tiklandi" );
          String expectedUrl="delivery";
          String actualUrl= Driver.getDriver().getCurrentUrl();
          Assert.assertTrue(actualUrl.contains(expectedUrl));
          extentTest.info("Delivery linki tiklandigi dogrulandi" );

          //-Kullanıcı sayfayı kapatır
           Driver.closeDriver();
          extentTest.info("Sayfa kapandi" );
          extentTest.pass("Test hatasiz gerceklesti");

    }
}
