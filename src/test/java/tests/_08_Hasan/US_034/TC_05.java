package tests._08_Hasan.US_034;

import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.Merchant_Dashboard;
import utilities.Driver;
import utilities.ReusableMethods;


public class TC_05 {
  Merchant_Dashboard merchantDashboard=new Merchant_Dashboard();
    @Test
    public void TC_05(){
        // - Kullanıcı açtığı browserla admin paneli olan "Merchant Url" ye gider
        // - Kullanıcı "username" ve "password" girişi yapıp, "Sign in" linkine  tıklar
        ReusableMethods.getmerchantLogin("7elevenAdmin","1234567");
        // -Kullanıcı sol taraftaki menüde bulunan "Orders Type" ı bulur ve tıklar
         merchantDashboard.orderTypeLink.click();
        // - Kullanici cikan ekranda  "Delivery" linkini tiklar.
        merchantDashboard.deliveryLink.click();
        // -Kullanici acilan sayfada bulunan "Enabled Opt in for no contact delivery" linkinin
        //  erisilebilir ve secilebilir oldugunu dogrular

    merchantDashboard.enabledLink.click();
    Assert.assertTrue(merchantDashboard.enabledLink.isSelected(), "hatalı element");
        //  -Kullanıcı sayfayı kapatır
        Driver.closeDriver();
    }
}
