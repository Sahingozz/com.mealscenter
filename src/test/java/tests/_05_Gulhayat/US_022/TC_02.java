package tests._05_Gulhayat.US_022;

import org.testng.annotations.Test;
import pages.Merchant_Dashboard;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

public class TC_02 {
    @Test
    public void merchantProfil(){
        //  -  Kullanıcı açtığı browserla merchand paneli olan "Merchant giris" e gider

        //  -  Kullanıcı "username" ve "password" girişi yapıp, "Sign in" butonuna tıklar
        //  -  Basarili bir sekilde giris yaptigini dogrular
        //  -  Kullanici profil linkine tiklar
        //  -  Kullanici acian profil sayfasinda First Name, Last Name, Email address, Contact number  textboxlarina bilgi girilebildigi  ve yapilan degisikliklerin kaydedildigini dogrular
        //  -  Kullanıcı sayfayı kapatır

        //- The user goes to the "Merchant login", which is the merchand panel, with the browser he opens
        //  - User enters "username" and "password" and clicks "Sign in" button
        //  - Verifies that you have successfully logged in
        ReusableMethods.merchantLoginAndsuccessfullLogin();

        //  - User clicks on profile link
        Merchant_Dashboard merchant_dashboard=new Merchant_Dashboard();
        merchant_dashboard.profilDropdownmenu.click();
        merchant_dashboard.profile.click();
        //  - On the user's profile page, it confirms that information can be entered in the First Name, Last Name, Email address, Contact number  textboxes and that the changes are saved.
       merchant_dashboard.merchanProfileFirstName.clear();
        merchant_dashboard.merchanProfileFirstName.sendKeys(ConfigReader.getProperty("merchanProfileFirstName"));
        merchant_dashboard.merchanProfileLastName.clear();
        merchant_dashboard.merchanProfileLastName.sendKeys(ConfigReader.getProperty("merchanProfileLastName"));
        merchant_dashboard.merchanProfileEmailAdresse.clear();
        merchant_dashboard.merchanProfileEmailAdresse.sendKeys(ConfigReader.getProperty("merchanProfileEmailaddress"));
        merchant_dashboard.merchanProfileContactNumber.clear();
        merchant_dashboard.merchanProfileContactNumber.sendKeys(ConfigReader.getProperty("merchanProfileContactnumber"));
        merchant_dashboard.merchanProfileSaveButton.click();

        //  - User closes the page
        Driver.closeDriver();


    }

}
