package tests._08_Hasan.US_034;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.Merchant_Dashboard;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

public class TC_02_TC_03 {
      Merchant_Dashboard merchantDashboard=new Merchant_Dashboard();
      @Test
      public void TC_02(){
          //User goes to "Merchant Url" which is admin panel with browser opened
          //- User enters "username" and "password" and clicks "Sign in" link
          //- User finds "Orders Type" on the left side menu and verifies that it can be clicked
          //- User "Delivery" Verifies that the " link is visible and clickable -User closes the page


          // - Kullanıcı açtığı browserla admin paneli olan "Merchant Url" ye gider
          // - Kullanıcı "username" ve "password" girişi yapıp, "Sign in" linkine  tıklar
         ReusableMethods.merchantLoginHasan();
          // -Kullanıcı sol taraftaki menüde bulunan "Orders Type" ı bulur ve tıklanabildiğini doğrular
          merchantDashboard.orderTypeLink.click();
          //- Kullanici "Delivery" linkinin gorunur oldugunu ve tiklanabilir oldugunu dogrular
          merchantDashboard.deliveryLink.click();
          String expectedUrl="delivery";
          String actualUrl= Driver.getDriver().getCurrentUrl();
          Assert.assertTrue(actualUrl.contains(expectedUrl));
          // -Kullanıcı sayfayı kapatır
          Driver.closeDriver();
    }
}
