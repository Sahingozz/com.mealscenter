package tests._04_Ayten._10_Ahmet_Gurkan.US_044;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.Admin_Dashboard;
import utilities.Driver;
import utilities.ReusableMethods;

public class TC_11 {

    /*---------------------------------------------------------------------------------------------
    Reports menüsünden “Merchant Sales”  bölümüne gidildiği doğrulanmalı
    It should be verified that you click to the "Merchant Sales" section from the Reports menu
    -----------------------------------------------------------------------------------------------
    */

    Admin_Dashboard adminDashboard=new Admin_Dashboard();

    @Test
    public void TC_11(){
        //-"https://qa.mealscenter.com/backoffice/admin/dashboard" linkine gidin
        ReusableMethods.adminLogin("emre.elieyioglu","123456");

        //- Yanda bulunan "Reports" kısmına tıklayın
        adminDashboard.adminReports.click();

        //- Çıkan bölümde "Merchant Sales" kısmına tıklayın
        adminDashboard.adminReportsMerchantSales.click();

        //- Gittiğiniz yerin urlsini alarak doğru urlde olduğunuzu test edin
        String expectedUrl= "https://qa.mealscenter.com/backoffice/reports/merchant_sales";
        String actualUrl = Driver.getDriver().getCurrentUrl();
        Assert.assertEquals(expectedUrl,actualUrl);

        //- Sayfayi kapatin
        Driver.closeDriver();
    }
}
