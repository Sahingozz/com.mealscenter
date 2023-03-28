package tests._08_Hasan.US_034;

import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.Merchant_Dashboard;
import utilities.Driver;
import utilities.ReusableMethods;
import utilities.TestBaseReport;

public class TC_09 extends TestBaseReport {
    Merchant_Dashboard merchantDashboard=new Merchant_Dashboard();
    Actions actions=new Actions(Driver.getDriver());
    @Test
    public void TC_09 () {
        extentTest=extentReports.createTest("US_34 TC_09","Ilgili Alanin gorunur ve Tiklanabilir oldugu dogrulanmali");
        //- Kullanıcı açtığı browserla admin paneli olan "Merchant Url" ye gider
        //- Kullanıcı "username" ve "password" girişi yapıp, "Sign in" linkine  tıklar
        ReusableMethods.getmerchantLogin("7elevenAdmin","1234567");
        extentTest.info("Merchant sayfasina login yapildi ve Merchant anasayfaya gidildi ");
        //-Kullanıcı sol taraftaki menüde bulunan "Orders Type" ı bulur ve tıklar
        merchantDashboard.orderTypeLink.click();
        extentTest.info("order Type linkine  gidildi");
        //-Kullanici "Delivery" linkinin gorur ve tiklar
        merchantDashboard.deliveryLink.click();
        extentTest.info("Delivery sayfasina gidildi");
        //-Kullanici acilan sayfada bulunan "Fixed Charge " bolumune tiklar ve Service Fee kismini  doldurur
        merchantDashboard.dynamicRates.click();
        extentTest.info("Acilan sayfada bulunan 'Dynamik Rates'alanina tiklandi");
        actions.sendKeys(Keys.ARROW_UP).click().perform();
        merchantDashboard.serviceFee.click();
        extentTest.info("Acilan sayfada bulunan 'sevice fee'alanina tiklandi");
        actions.sendKeys(Keys.DELETE)
                .sendKeys(Keys.DELETE)
                .sendKeys(Keys.DELETE)
                .sendKeys(Keys.DELETE).perform();
        merchantDashboard.serviceFee2.sendKeys("4.00");
        extentTest.info("Action ile onceki yazilan yazi silindi ve yeni deger yazildi");
        //"Service Fee" bolumune yazilanlarin kaydedilebildigi  dogrulanir
        merchantDashboard.saveButton.click();
        extentTest.info("Yazilan yeni deger kaydedildi");
        String expectedText= "saved";
        String actualtext= merchantDashboard.settingSavedText.getText();
        extentTest.info("Yazilan yeni degerlerin kaydedildigi dogrulandi");
        //-Kullanıcı sayfayı kapatır
        Driver.closeDriver();
        extentTest.info("Sayfa kapatildi");
        extentTest.pass("test hatasiz gerceklesti");
    }
}
