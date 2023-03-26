package tests._10_Ahmet_Gurkan.US_044;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.Admin_Dashboard;
import utilities.Driver;
import utilities.ReusableMethods;

public class TC_15 {

    /*-----------------------------------------------------------------------------------
    - Reports menüsünden “Merchant Sales”  bölümüne gidildiğinde site title nın “Merchant Sales Report” oldugu doğrulanabilmeli
    - When you click to the “Merchant Sales” section from the Reports menu, it should be verified that the
    site title is “Merchant Sales Report
    -------------------------------------------------------------------------------------
     */

    Admin_Dashboard adminDashboard = new Admin_Dashboard();

    @Test
    public void TC15(){

        //-"https://qa.mealscenter.com/backoffice/admin/dashboard" linkine gidin
        ReusableMethods.adminLogin("emre.elieyioglu","123456");

        //- Yanda bulunan "Reports" kısmına tıklayın
        adminDashboard.adminReports.click();

        //- Çıkan bölümde "Merchant Sales" kısmına tıklayın
        adminDashboard.adminReportsMerchantSales.click();

        //- Gelen sekmenin titlenin "Merchant Sales Report" yazdigini dogrulayin
        String expectedTitle = "Merchant Sales Report";
        String actualTitle = Driver.getDriver().getTitle();
        Assert.assertEquals(expectedTitle,actualTitle);

        //- Sayfayi kapatin
        Driver.closeDriver();
}
}
