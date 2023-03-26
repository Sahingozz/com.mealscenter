package tests._10_Ahmet_Gurkan.US_044;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.Admin_Dashboard;
import utilities.Driver;
import utilities.ReusableMethods;

public class TC_14 {

    /*-----------------------------------------------------------------------------------
    - Reports menüsünden “Merchant Sales”  bölümüne gidildiğinde başlangıç ve bitiş tarihi seçilebilmeli, tarihe göre sıralanabildiği doğrulanmalı
    - When you click to the “Merchant Sales” section from the Reports menu, the start and end dates should be selected,
    and it should be verified that they can be sorted by date
    -------------------------------------------------------------------------------------
     */

    Admin_Dashboard adminDashboard=new Admin_Dashboard();

    @Test
    public void TC14(){

        //-"https://qa.mealscenter.com/backoffice/admin/dashboard" linkine gidin
        ReusableMethods.adminLogin("emre.elieyioglu","123456");

        //- Yanda bulunan "Reports" kısmına tıklayın
        adminDashboard.adminReports.click();

        //- Çıkan bölümde "Merchant Sales" kısmına tıklayın
        adminDashboard.adminReportsMerchantSales.click();

        //- Merchant Sales Report yazisinin altinda bulunan "Start Date-End Date" tarih kutucuguna tiklayin
        adminDashboard.adminStartandEndDate.click();

        //- Bir tarih araligi secin ve o tarih araligindaki siparislerin geldigini dogrulayin
        adminDashboard.adminDateLast7Days.click();
        Assert.assertTrue(adminDashboard.adminFirstElementofSearchResultText.isDisplayed());

        //- Sayfayi kapatin
        Driver.closeDriver();
    }
}
