package tests._08_Hasan.US_034;

import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.Merchant_Dashboard;
import utilities.Driver;
import utilities.ReusableMethods;

public class TC_07 {
    Merchant_Dashboard merchantDashboard=new Merchant_Dashboard();
    Actions actions=new Actions(Driver.getDriver());

    @Test
    public void TC07(){
        //- Kullanıcı açtığı browserla admin paneli olan "Merchant Url" ye gider
        //- Kullanıcı "username" ve "password" girişi yapıp, "Sign in" linkine  tıklar
        ReusableMethods.getmerchantLogin("7elevenAdmin","1234567");
        //-Kullanıcı sol taraftaki menüde bulunan "Orders Type" ı bulur ve tıklar
        merchantDashboard.orderTypeLink.click();
        //- Kullanici "Delivery" linkinin gorur ve tiklar
        merchantDashboard.deliveryLink.click();
        //-Kullanici acilan sayfada bulunan "Fixed Charge " linkinin
        // erisilebilir ve secilebilir oldugunu dogrular
        merchantDashboard.dynamicRates.click();
        actions.sendKeys(Keys.ARROW_UP).click().perform();
        Assert.assertTrue(merchantDashboard.fixedChargeSelect.isEnabled());
        //-Kullanıcı sayfayı kapatır
        Driver.closeDriver();
    }
}
