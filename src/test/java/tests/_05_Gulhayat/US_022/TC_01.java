package tests._05_Gulhayat.US_022;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.Merchant_Dashboard;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

public class TC_01 {
    //- The user goes to the "Merchant login", which is the merchand panel, with the browser he opens
    //  - User enters "username" and "password" and clicks "Sign in" button
    //  - Verifies that you have successfully logged in


    @Test
    public void merchantLogin_profil() {
        ReusableMethods.merchantLoginAndsuccessfullLogin();
        Merchant_Dashboard merchant_dashboard=new Merchant_Dashboard();

        //  - Verifies that the profile link in the header of the Merchant Dashboard is clickable
        merchant_dashboard.profilDropdownmenu.click();
        merchant_dashboard.profile.click();
        Assert.assertTrue(merchant_dashboard.profile.isEnabled());

        //  - User closes the page

        Driver.closeDriver();




    }







}