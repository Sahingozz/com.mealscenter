package tests._09_Zafer_Harun.US_041;

import org.apache.hc.core5.http.nio.entity.AbstractBinDataConsumer;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.Admin_Dashboard;
import utilities.Driver;
import utilities.ReusableMethods;

public class TC_05 {
    Admin_Dashboard adminLogin = new Admin_Dashboard();

    /*Verify that after logging in to admin panel, there is a "Buyers" link on the
    left side bar and after clicking the "Customers" link, there is a "search field"
    on the page and it is possible to make search */

    @Test
    public void TC_05_CustomerSearchField (){
        ReusableMethods.adminLoginZafer();
        adminLogin.buyersLink.click();
        ReusableMethods.wait(1);
        adminLogin.customersLink.click();
        String listResultText=adminLogin.couponListResultsText.getText();
        adminLogin.couponSearchField.sendKeys("xyz"+ Keys.ENTER);
        String searchResultsText= Driver.getDriver()
                .findElement(By.xpath("//div[@class='dataTables_info']")).getText();
        boolean isSearchOk;
        if(listResultText.equals(searchResultsText)){
            isSearchOk=false;
            Assert.assertTrue(isSearchOk);
        }

        Driver.closeDriver();
    }
}