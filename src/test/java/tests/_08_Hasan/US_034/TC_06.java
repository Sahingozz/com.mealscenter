package tests._08_Hasan.US_034;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.Merchant_Dashboard;
import utilities.Driver;
import utilities.ReusableMethods;

public class TC_06 {
    Merchant_Dashboard merchantDashboard=new Merchant_Dashboard();

    @Test
    public void TC_06(){

        //- Kullanıcı açtığı browserla admin paneli olan "Merchant Url" ye gider
        //- Kullanıcı "username" ve "password" girişi yapıp, "Sign in" linkine  tıklar
        ReusableMethods.getmerchantLogin("7elevenAdmin","1234567");
        //-Kullanıcı sol taraftaki menüde bulunan "Orders Type" ı bulur ve tıklar
        merchantDashboard.orderTypeLink.click();
        //- Kullanici "Delivery" linkinin  tiklar
        merchantDashboard.deliveryLink.click();
        //-Kullanici acilan sayfada bulunan "Free Delivery On First Order"" linkinin
        // erisilebilir ve secilebilir oldugunu dogrular
        merchantDashboard.deliveryLink.click();
        Assert.assertTrue(merchantDashboard.deliveryLink.isSelected(), "hatalı element");
        //  -Kullanıcı sayfayı kapatır
        Driver.closeDriver();
    }

}
