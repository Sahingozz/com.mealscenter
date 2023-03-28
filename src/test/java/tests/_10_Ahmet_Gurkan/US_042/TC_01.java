package tests._10_Ahmet_Gurkan.US_042;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.Admin_Dashboard;
import utilities.Driver;
import utilities.ReusableMethods;

import java.util.NoSuchElementException;

public class TC_01 {

    Admin_Dashboard adminDashboard=new Admin_Dashboard();
    @Test
    public void test01(){

        //https://qa.mealscenter.com/backoffice/admin/dashboard URL'ye gider
        //"User goes to https://qa.mealscenter.com/backoffice/admin/dashboard URL
        ReusableMethods.adminLogin("gurkan.gulsoy","123456");

        //sol tarafta bulunan Buyers basligina tiklar
        //Click on Buyers on the left
        adminDashboard.buyers.click();

        //altinda bulunan baslikta Reviews'e tiklar
        //Click Reviews in the header below
        adminDashboard.reviews.click();
        ReusableMethods.wait(2);

        //Gelen sekmede Reviews yazisinin altinda bulunan Merchant basligina tiklar
        //Click on the Merchant title under Reviews on the incoming tab.

            adminDashboard.reviewsMerchant.click();
        //Merchant'a tiklayinca ilk sirada Mcdonalds yazisinin yazdigini dogrulayin.
        //Click on Merchant and verify that Vegan Season is listed first.
        String expectedMerchant="Vegan Season";
        String actualMerchant=adminDashboard.reviewsVersionSeason.getText();
        Assert.assertEquals(expectedMerchant,actualMerchant);
        //sayfa kapatilir
        //closes the page
        Driver.closeDriver();







    }



}
