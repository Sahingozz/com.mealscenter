package tests._10_Ahmet_Gurkan.US_042;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.Admin_Dashboard;
import utilities.Driver;
import utilities.ReusableMethods;

public class TC_05 {
    Admin_Dashboard adminDashboard=new Admin_Dashboard();

    @Test
    public void test05(){








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
        // under the Actions tab.Click the Update button
        adminDashboard.actionsUpdate.click();
        //Acilan ekranda All review yazisi dogrulanir
        // All review text is verified on the screen that appears.
        String expected="All Review";
        String actual=adminDashboard.allReview.getText();
        Assert.assertTrue(actual.contains(expected));
        //acilan sayfada All Review tiklanir

        adminDashboard.allReview.click();
        //delete butonuna tiklanir,acilan ekranda Delete Confirmation yazisi dogrulanir
        //Click on the delete button, and confirm the Delete Confirmation text on the screen that appears.
        adminDashboard.actionsDelete.click();
        Assert.assertTrue(adminDashboard.deleteConfirmation.isDisplayed());

        //acilan sayfada cancel button'a tiklanir
        adminDashboard.cancel.click();
        //sayfa kapatilir
        // page is closed
        Driver.closeDriver();

    }
}
