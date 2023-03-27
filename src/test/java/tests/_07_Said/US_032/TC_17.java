package tests._07_Said.US_032;

import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.Merchant_Dashboard;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

import java.util.Arrays;

public class TC_17 {


    //    When the Save button is clicked, the information we have written
    //    it must be confirmed that it was recorded.

    @Test
    public void test12() {
        ReusableMethods.merchantLoginHasan();
        Merchant_Dashboard merchant_dashboard = new Merchant_Dashboard();
        merchant_dashboard.attributesLink.click();
        merchant_dashboard.attributesCookingReferenceLink.click();
        merchant_dashboard.addNewButton.click();
        merchant_dashboard.nameBox1.sendKeys(ConfigReader.getProperty("merchantIngredients"));
        Assert.assertTrue(merchant_dashboard.ddm1.isEnabled());
        Select select = new Select(merchant_dashboard.ddm1);
        select.selectByVisibleText("Draft");
        merchant_dashboard.saveButton.click();

        String entries= merchant_dashboard.showingEntries.getText();
        String []entriesSplit=entries.split(" ");
        System.out.println(Arrays.toString(entriesSplit));
        int num=Integer.parseInt(entriesSplit[5]);
        System.out.println("num = " + num);
        Assert.assertTrue(num>0);

        //delete
        Assert.assertTrue(merchant_dashboard.deleteButton.isEnabled());
        Assert.assertTrue(merchant_dashboard.deleteButtonIcon.isEnabled());
        merchant_dashboard.deleteButtonIcon.click();
        ReusableMethods.wait(2);
        merchant_dashboard.deleteButton.click();
        ReusableMethods.wait(2);


        Driver.closeDriver();
    }
}
