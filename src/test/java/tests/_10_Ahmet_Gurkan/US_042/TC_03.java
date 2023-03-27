package tests._10_Ahmet_Gurkan.US_042;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.Admin_Dashboard;
import utilities.Driver;
import utilities.ReusableMethods;

public class TC_03 {
    Admin_Dashboard adminDashboard=new Admin_Dashboard();
    @Test
    public void test03(){







        //tested to work


        //https://qa.mealscenter.com/backoffice/admin/dashboard URL'ye gider
        // "User goes to https://qa.mealscenter.com/backoffice/admin/dashboard URL
        ReusableMethods.adminLogin("gurkan.gulsoy","123456");

        //sol tarafta bulunan Buyers basligina tiklar
        // Click on Buyers on the left
        adminDashboard.buyers.click();

        //altinda bulunan baslikta Reviews'e tiklar
        // Click Reviews in the header below
        adminDashboard.reviews.click();
        ReusableMethods.wait(2);
        //gelen sekmede alt basliklardaki Reviews'e tiklanir
        // Click on Reviews in the sub-headings in the next tab.
        adminDashboard.reviewsReviews.click();
        //ve siaralama yapildigi dogrulanir
        // and the sorting is verified
        Assert.assertTrue(adminDashboard.itwasnice.isDisplayed());
        //Actions basligi altinda bulunan Delete butonunun calismadigi test edilir
        // Click the Delete button under the Actions heading.
        Assert.assertFalse(adminDashboard.actionsDelete.isSelected());
        //sayfayi kapatir
        // closes the page
        Driver.closeDriver();
    }
}
