package tests._10_Ahmet_Gurkan.US_045;

import org.testng.annotations.Test;
import pages.Admin_Dashboard;
import utilities.Driver;
import utilities.ReusableMethods;

public class TC_20 {

    /*---------------------------------------------------------------------------------------------
    -Reports menüsünden “Order earnings”  bölümüne gidildiğinde kac adet sonuc oldugunun ekranda yazdıgını dogrulayın
    -Verify how many results are displayed on the screen when you click to the "Order earnings" section from the Reports menu
    -----------------------------------------------------------------------------------------------
    */

    Admin_Dashboard adminDashboard = new Admin_Dashboard();

    @Test
    public void TC_20(){

        //-"https://qa.mealscenter.com/backoffice/admin/dashboard" linkine gidin
        ReusableMethods.adminLogin("emre.elieyioglu","123456");

        //- Yanda bulunan "Reports" kısmına tıklayın
        adminDashboard.adminReports.click();

        //- Çıkan bölümde "Order Earnings" kısmına tıklayın
        adminDashboard.adminReportsOrderEarnings.click();

        //- Gelen sekmede kac adet sonuc ciktigini bulun ve kac adet oldugunu yazdirin
        int count= Integer.parseInt(adminDashboard.adminReportsOrderEarningsCount.getText());
        System.out.println(count);

        //- Sayfayi kapatin
        Driver.closeDriver();

}
}
