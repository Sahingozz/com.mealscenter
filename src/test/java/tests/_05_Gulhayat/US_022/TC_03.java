package tests._05_Gulhayat.US_022;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import pages.Merchant_Dashboard;
import utilities.Driver;
import utilities.ReusableMethods;

public class TC_03 {

    @Test
    public void merchantProfilchange(){
        // - Kullanıcı açtığı browserla merchand paneli olan "Merchant giris" e gider
        //  - Kullanıcı "username" ve "password" girişi yapıp, "Sign in" butonuna tıklar
        //  - Basarili bir sekilde giris yaptigini dogrular
        //  - Kullanici Merchant Dashboard sayfasinin header bölümünde bulunan profil linkine tiklar
        //  - Profil sayfasinda  Change password butonununa  tiklar
        //  - Change password sayfasinda oldugunu dogrular
        //  - Kullanıcı sayfayı kapatır

        //  - The user goes to the "Merchant login", which is the merchand panel, with the browser he opens
        //  - User enters "username" and "password" and clicks "Sign in" button
        //  - Verifies that you have successfully logged in
        //  - The user clicks on the profile link in the header section of the Merchant Dashboard page
        ReusableMethods.merchantLoginAndsuccessfullLogin();

        //  - Click the Change password button on the profile pagehttps://qa.mealscenter.com/backoffice/merchant/change_password
        Merchant_Dashboard merchant_dashboard=new Merchant_Dashboard();
        merchant_dashboard.profilDropdownmenu.click();
        merchant_dashboard.profile.click();
        //  - Verifies that you are on the Change password page
        merchant_dashboard.profilechange_passwort.click();
        String expectedUrl="https://qa.mealscenter.com/backoffice/merchant/change_password";
        String actualUrl=Driver.getDriver().getCurrentUrl();
        Assert.assertEquals(expectedUrl,actualUrl);

        //  - User closes the page
        Driver.closeDriver();



    }
}
