package tests._05_Gulhayat.US_022;

import org.testng.annotations.Test;
import pages.Merchant_Dashboard;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

public class TC_04 {

    @Test
    public void merchantProfilchangeAndSave(){
        //  -  Kullanıcı açtığı browserla merchand paneli olan "Merchant giris" e gider
        //  -  Kullanıcı "username" ve "password" girişi yapıp, "Sign in" butonuna tıklar
        //  -  Basarili bir sekilde giris yaptigini dogrular
        //  - Kullanici Merchant Dashboard sayfasinin header bölümünde bulunan profil linkine tiklar
        //  -  Profil sayfasinda  Change password butonunun  tiklar
        //  -  Acilan change_passwort sayfasinda Old Password, New Password, Confirm New Password textboxlarina bilgi girilebildigi  ve yapilan degisikliklerin kaydedildigi dogrular
        //  - Kullanıcı sayfayı kapatır


        //  - The user goes to the "Merchant login", which is the merchand panel, with the browser he opens
        //  - User enters "username" and "password" and clicks "Sign in" button
        //  - Verifies that you have successfully logged in

        ReusableMethods.merchantLoginAndsuccessfullLogin();
        //  - The user clicks on the profile link in the header section of the Merchant Dashboard page
        Merchant_Dashboard merchant_dashboard=new Merchant_Dashboard();
        merchant_dashboard.profilDropdownmenu.click();
        merchant_dashboard.profile.click();
        //  - Click the Change password button on the profile page
        merchant_dashboard.profilechange_passwort.click();

        //  - On the change_passwort page that opens, information can be entered in the Old Password, New Password,
        //  Confirm New Password textboxes and the changes are saved.
        merchant_dashboard.profilechange_OldPassword.sendKeys(ConfigReader.getProperty("profilechangeOldPassword"));
        merchant_dashboard.profilechange_NewPassword.sendKeys(ConfigReader.getProperty("profilechangeNewPassword"));
        merchant_dashboard.profilechange_ConfirmPassword.sendKeys(ConfigReader.getProperty("profilechangeConfirmPassword"));
        merchant_dashboard.profilechangeSaveButton.click();
        //  - User closes the page
       // Driver.closeDriver();

    }

}
