package tests._10_Ahmet_Gurkan.US_042;

import org.testng.annotations.Test;
import pages.Admin_Dashboard;
import utilities.Driver;
import utilities.ReusableMethods;

public class TC_04 {

    //

    Admin_Dashboard adminDashboard=new Admin_Dashboard();
    @Test
    public void test04(){

        //https://qa.mealscenter.com/backoffice/admin/dashboard URL'ye gider
        // "User goes to https://qa.mealscenter.com/backoffice/admin/dashboard URL
        ReusableMethods.adminLogin("gurkan.gulsoy","123456");

        //sol tarafta bulunan Buyers basligina tiklar
        // Click on Buyers on the left
        adminDashboard.buyers.click();

        //altinda bulunan baslikta Reviews'e tiklar
        // Click Reviews in the header below
        adminDashboard.reviews.click();
        //Actions sekmesi altindaki Update butonuna tiklanir
        //under the Actions tab.Click on the Update button
        adminDashboard.actionsUpdate.click();
        //acilan sayfada All Review tiklanir
        // Click All Review on the page that opens.
        adminDashboard.allReview.click();
        //delete butonuna tiklanir
        //click on delete button
        adminDashboard.actionsDelete.click();
        //sayfa kapatilir
        // page is closed"
        Driver.closeDriver();
    }
}
