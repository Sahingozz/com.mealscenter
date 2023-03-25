package tests._08_Hasan.US_034;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.Merchant_Dashboard;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

public class TC_04 {
    Merchant_Dashboard merchantDashboard=new Merchant_Dashboard();
    @Test
    public void TC_04(){

        //- Kullanıcı açtığı browserla admin paneli olan "Merchant Url" ye gider
        // - Kullanıcı "username" ve "password" girişi yapıp, "Sign in" linkine  tıklar
        ReusableMethods.getmerchantLogin("7elevenAdmin","1234567");
        //- Kullanici "Delivery" linkinin gorunur oldugunu ve tiklanabilir oldugunu dogrular
        //-Kullanici acilan sayfadaki settings linkinin gorunur ve tiklanabilir oldugunu dogrular

        String expectedUrl="dashboard";
        String actualUrl=Driver.getDriver().getCurrentUrl();
        Assert.assertTrue(actualUrl.contains(expectedUrl));
        Assert.assertTrue(merchantDashboard.dashboardButtonu.isEnabled());
        // -Kullanıcı sayfayı kapatır
        Driver.closeDriver();
    }
}
