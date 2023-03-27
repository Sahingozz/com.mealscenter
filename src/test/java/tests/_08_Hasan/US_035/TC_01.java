package tests._08_Hasan.US_035;

import org.testng.annotations.Test;
import utilities.Driver;
import utilities.ReusableMethods;

public class TC_01 {
    @Test
    public void TC_01(){
        //-Kullanıcı açtığı browserla admin paneli olan "AdminUrl" ye gider
        //-Kullanıcı "username" ve "password" girişi yapıp, "Sign in" linkine  tıklar
        ReusableMethods.adminLogin("hasan.adiguzel","123456");
        //-Kullanıcı sayfayı kapatır
        Driver.closeDriver();
    }
}
