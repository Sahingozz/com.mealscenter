package tests._04_Ayten._10_Ahmet_Gurkan.US_045;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.Admin_Dashboard;
import utilities.Driver;
import utilities.ReusableMethods;

public class TC_19 {

    /*---------------------------------------------------------------------------------------------
    -Reports menüsünden “Order earnings”  bölümüne gidildiğinde order id, subtotal, total, merchant earnings, admin commision e göre sıralanabildiği doğrulanmalı
    -When you click to the "Order earnings" section from the Reports menu, it should be verified that it can be sorted by order id,
    subtotal, total, merchant earnings, admin commission
    -----------------------------------------------------------------------------------------------
    */

    Admin_Dashboard adminDashboard = new Admin_Dashboard();

    @Test
    public void TC_19(){

        //-"https://qa.mealscenter.com/backoffice/admin/dashboard" linkine gidin
        ReusableMethods.adminLogin("emre.elieyioglu","123456");

        //- Yanda bulunan "Reports" kısmına tıklayın
        adminDashboard.adminReports.click();

        //- Çıkan bölümde "Order Earnings" kısmına tıklayın
        adminDashboard.adminReportsOrderEarnings.click();

        //- Gelen sekmede gözuken listeyi order id, subtotal, total, merchant earnings,admin commision basliklarinin gorunur ve tiklanabilir oldugu doğrulanmalı
        Assert.assertTrue(adminDashboard.adminReportsMerchantSalesOrderID.isDisplayed());
        Assert.assertTrue(adminDashboard.adminReportsSubtotal.isDisplayed());
        Assert.assertTrue(adminDashboard.adminReportsTotal.isDisplayed());
        Assert.assertTrue(adminDashboard.adminReportsMerchantEarnings.isDisplayed());
        Assert.assertTrue(adminDashboard.adminReportsAdminCommission.isDisplayed());

        Assert.assertTrue(adminDashboard.adminReportsMerchantSalesOrderID.isEnabled());
        Assert.assertTrue(adminDashboard.adminReportsSubtotal.isEnabled());
        Assert.assertTrue(adminDashboard.adminReportsTotal.isEnabled());
        Assert.assertTrue(adminDashboard.adminReportsMerchantEarnings.isEnabled());
        Assert.assertTrue(adminDashboard.adminReportsAdminCommission.isEnabled());

        //- Sayfayi kapatin
        Driver.closeDriver();

}
}
