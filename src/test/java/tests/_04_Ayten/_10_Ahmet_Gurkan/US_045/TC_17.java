package tests._04_Ayten._10_Ahmet_Gurkan.US_045;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.Admin_Dashboard;
import utilities.Driver;
import utilities.ReusableMethods;

public class TC_17 {

    /*---------------------------------------------------------------------------------------------
    -Reports menüsünden “Order earnings”  bölümüne gidildiğinde tarihe göre filtelenebildiği dogrulanmalı
    -When you click to the "Order earnings" section from the Reports menu, it should be verified
    that it can be filtered by date
    -----------------------------------------------------------------------------------------------
    */

    Admin_Dashboard adminDashboard=new Admin_Dashboard();

    @Test
    public void TC_17(){

        //-"https://qa.mealscenter.com/backoffice/admin/dashboard" linkine gidin
        ReusableMethods.adminLogin("emre.elieyioglu","123456");

        //- Yanda bulunan "Reports" kısmına tıklayın
        adminDashboard.adminReports.click();

        //- Çıkan bölümde "Order Earnings" kısmına tıklayın
        adminDashboard.adminReportsOrderEarnings.click();

        //-Order Earnings Report yazisinin altinda bulunan "Start Date-End Date" tarih kutucuguna tiklayin
        adminDashboard.adminStartandEndDate.click();

        //- Bir tarih araligi secin ve o tarih araligindaki siparislerin geldigini dogrulayin
        adminDashboard.adminDateLast7Days.click();
        Assert.assertTrue(adminDashboard.adminFirstElementofSearchResultOrderID.isDisplayed());

        //- Sayfayi kapatin
        Driver.closeDriver();
}
}
