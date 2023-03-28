package tests._08_Hasan.US_034;

import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.Merchant_Dashboard;
import utilities.Driver;
import utilities.ReusableMethods;
import utilities.TestBaseReport;

public class TC_06 extends TestBaseReport {
    Merchant_Dashboard merchantDashboard=new Merchant_Dashboard();
    Actions actions=new Actions(Driver.getDriver());

    @Test
    public void TC_06(){
        extentTest=extentReports.createTest("US_34 TC_07","Ilgili Alanin gorunur ve Tiklanabilir oldugu dogrulanmali");

        //- Kullanıcı açtığı browserla admin paneli olan "Merchant Url" ye gider
        //- Kullanıcı "username" ve "password" girişi yapıp, "Sign in" linkine  tıklar
        ReusableMethods.getmerchantLogin("7elevenAdmin","1234567");
        extentTest.info("Merchant sayfasina login yapildi ve Merchant anasayfaya gidildi ");
        //-Kullanıcı sol taraftaki menüde bulunan "Orders Type" ı bulur ve tıklar
        merchantDashboard.orderTypeLink.click();
        extentTest.info("order Type linkine  gidildi");
        //- Kullanici "Delivery" linkinin gorur ve tiklar
        merchantDashboard.deliveryLink.click();
        extentTest.info("Delivery sayfasina gidildi");
        //-Kullanici acilan sayfada bulunan "Fixed Charge " linkinin
        // erisilebilir ve secilebilir oldugunu dogrular
        merchantDashboard.dynamicRates.click();
        extentTest.info(" Dynamik rates bolumune tiklandi");
        actions.sendKeys(Keys.ARROW_UP).click().perform();
       extentTest.info("Action ile ust sekmedeki 'Fixed Charge' sekmesi secildi");
        Assert.assertTrue(merchantDashboard.fixedChargeSelect.isEnabled());
        extentTest.info("Secilen 'fixed Charged' alaninin secilebilir ve erisilebilir oldugu dogrulandi");
        //-Kullanıcı sayfayı kapatır
        Driver.closeDriver();
        extentTest.info("sayfa Kapatildi");
        extentTest.pass("Test basariyla gerceklesti.");
    }
}
