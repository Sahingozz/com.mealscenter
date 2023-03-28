package tests._10_Ahmet_Gurkan.US_042;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.Admin_Dashboard;
import utilities.Driver;
import utilities.ReusableMethods;

public class TC_02 {
    Admin_Dashboard adminDashboard=new Admin_Dashboard();
    @Test
    public void test02(){

        //Kullanici https://qa.mealscenter.com/backoffice/admin/dashboard URL'ye gider
        // "User goes to https://qa.mealscenter.com/backoffice/admin/dashboard URL
        ReusableMethods.adminLogin("gurkan.gulsoy","123456");

        //sol tarafta bulunan Buyers basligina tiklar
        // Click on Buyers on the left
        adminDashboard.buyers.click();

        //altinda bulunan baslikta Reviews'e tiklar
        // Click Reviews in the header below
        adminDashboard.reviews.click();
        ReusableMethods.wait(2);

        //gelen sekmede Reviews yazdigi dogrulanir
        // It is verified that Reviews is written on the incoming tab
        String expectedTitle="Reviews";
        String actualTitle=adminDashboard.reviews.getText();
        Assert.assertEquals(expectedTitle,actualTitle);
        Assert.assertTrue(adminDashboard.reviews.isDisplayed());

        //sayfayi kapatir
        // closes the page
        Driver.closeDriver();
    }
}
