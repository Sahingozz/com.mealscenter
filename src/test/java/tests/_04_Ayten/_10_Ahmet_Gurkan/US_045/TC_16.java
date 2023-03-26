package tests._04_Ayten._10_Ahmet_Gurkan.US_045;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.Admin_Dashboard;
import utilities.Driver;
import utilities.ReusableMethods;

public class TC_16 {

    /*---------------------------------------------------------------------------------------------
    -Reports menüsünden “Order earnings”  bölümüne gidildiğinde site title nın “Order earnings report” oldugu doğrulanabilmeli
    -When you click to the "Order earnings" section from the Reports menu, it should be verified that the site
    title is "Order earnings report
    -----------------------------------------------------------------------------------------------
    */

    Admin_Dashboard adminDashboard=new Admin_Dashboard();

    @Test
    public void TC_16(){

        //-"https://qa.mealscenter.com/backoffice/admin/dashboard" linkine gidin
        ReusableMethods.adminLogin("emre.elieyioglu","123456");

        //- Yanda bulunan "Reports" kısmına tıklayın
        adminDashboard.adminReports.click();

        //- Çıkan bölümde "Order Earnings" kısmına tıklayın
        adminDashboard.adminReportsOrderEarnings.click();

        //- Gelen sekmenin titlenin "Order earnings report" yazdigini dogrulayin
        String expectedTitle = "Order earnings report";
        String actualTitle = Driver.getDriver().getTitle();
        Assert.assertEquals(expectedTitle,actualTitle);

        //- Sayfayi kapatin
        Driver.closeDriver();
    }
}
