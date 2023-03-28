package tests._09_Zafer_Harun.US_038;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.Admin_Dashboard;
import utilities.Driver;
import utilities.ReusableMethods;

import java.io.File;

public class TC_08 {
    Admin_Dashboard adminLogin = new Admin_Dashboard();

    /*
Verify that after logging in to admin panel, in "Orders" menu, and
clicking "All order" link, any order details can be downloaded
as a document */

    @Test
    public void TC_08_downLoadOrder (){
        ReusableMethods.adminLoginZafer();
        adminLogin.adminOrderLink.click();
        adminLogin.adminAllOrderLink.click();

        String dosyaYolu = System.getProperty("user.home") + "/Downloads/document.pdf";
        adminLogin.orderDownloadButton.click();
        ReusableMethods.wait(3);

        // dosyanın indirildiğini teyyid
        File file = new File(dosyaYolu);
        Assert.assertTrue(file.exists());

        Driver.closeDriver();

    }
}
