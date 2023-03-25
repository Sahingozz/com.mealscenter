package tests._08_Hasan.US_034;

import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.Merchant_Dashboard;
import utilities.Driver;
import utilities.ReusableMethods;

public class TC_09 {
    Merchant_Dashboard merchantDashboard=new Merchant_Dashboard();
    Actions actions=new Actions(Driver.getDriver());
    @Test
    public void TC_09 () {
        //- Kullanıcı açtığı browserla admin paneli olan "AdminUrl" ye gider
        //- Kullanıcı "username" ve "password" girişi yapıp, "Sign in" linkine  tıklar
        ReusableMethods.getmerchantLogin("7elevenAdmin","1234567");
        //-Kullanıcı sol taraftaki menüde bulunan "Orders Type" ı bulur ve tıklar
        merchantDashboard.orderTypeLink.click();
        // - Kullanici acilan sayfada "Delivery" linkini tiklar
        merchantDashboard.deliveryLink.click();
        //-Kullanici acilan sayfada bulunan "Fixed Charge " bolumune tiklar ve Service Fee kismini  doldurur
        merchantDashboard.dynamicRates.click();
        actions.sendKeys(Keys.ARROW_UP).click().perform();
        merchantDashboard.serviceFee.click();
        actions.sendKeys(Keys.DELETE)
                .sendKeys(Keys.DELETE)
                .sendKeys(Keys.DELETE)
                .sendKeys(Keys.DELETE).perform();
        merchantDashboard.serviceFee2.sendKeys("4.00");
        //"Service Fee" bolumune yazilanlarin kaydedilebildigi  dogrulanir
        merchantDashboard.saveButton.click();

        String expectedText= "save";
        String actualtext= merchantDashboard.settingSavedText.getText();

        Assert.assertTrue(actualtext.contains(expectedText));
        //-Kullanıcı sayfayı kapatır
        Driver.closeDriver();
    }
}
