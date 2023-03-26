package tests._10_Ahmet_Gurkan.US_045;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.Admin_Dashboard;
import utilities.Driver;
import utilities.ReusableMethods;

public class TC_18 {

    /*---------------------------------------------------------------------------------------------
    -Reports menüsünden “Order earnings”  bölümüne gidildiğinde arama yapabildiği doğrulanmalı
    -When you click to the "Order earnings" section from the Reports menu, it should be verified that you can search
    -----------------------------------------------------------------------------------------------
    */

    Admin_Dashboard adminDashboard=new Admin_Dashboard();

    @Test
    public void TC_18(){

        //-"https://qa.mealscenter.com/backoffice/admin/dashboard" linkine gidin
        ReusableMethods.adminLogin("emre.elieyioglu","123456");

        //- Yanda bulunan "Reports" kısmına tıklayın
        adminDashboard.adminReports.click();

        //- Çıkan bölümde "Order Earnings" kısmına tıklayın
        adminDashboard.adminReportsOrderEarnings.click();

        //- Gelen sekmede arama kutusuna gidin ve arama yapin
        adminDashboard.adminReportsOrderEarningsSearchBox.sendKeys("10246");

        //- Arama yaptiginiz Order Id nin ekranınıza geldigini dogrulayin
        Assert.assertTrue(adminDashboard.adminFirstElementofSearchResultOrderID.isDisplayed());

        //- Sayfayi kapatin
        Driver.closeDriver();
}
        /*
        32. satirda gerceklesen bug nedeniyle test fail olmustur.
        Bug: Gelen ekranda bulunan arama kutusu tiklanabilir olmamasi sebebiyle arama yapilamamis ve test FAILED olmustur.
         */
}
