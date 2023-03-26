package tests._09_Zafer_Harun.US_038;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.Admin_Dashboard;
import utilities.Driver;
import utilities.ReusableMethods;

public class TC_06 {
    Admin_Dashboard adminLogin = new Admin_Dashboard();
    /*Verify that after logging in to admin panel, in "Orders" menu, and
      clicking "All order" link, there is "date/calendar button" and  it is possible
      to filter the list of orders according to chosen dates (time frames) */

    @Test
    public void TC_06_ordersStartEndDate (){
        ReusableMethods.adminLoginZafer();
        adminLogin.adminOrderLink.click();
        adminLogin.adminAllOrderLink.click();

        adminLogin.ordersStartEndDate.click();
        ReusableMethods.wait(1);
        Driver.getDriver().findElement(By.xpath("(//td[text()='6'])[1]")).click();
        Driver.getDriver().findElement(By.xpath("(//td[text()='23'])[1]")).click();

        Assert.assertTrue(adminLogin.searchResults.isDisplayed());


    }

}
