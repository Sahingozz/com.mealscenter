package tests._04_Ayten.US_020;

import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.Merchant_Dashboard;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

public class TC_03 {
    /*
   - The user opens the browser and logs in to the https://qa.mealscenter.com/backoffice/auth/login page
    -Confirms that Merchant Login appears  -The user enters the wrong name and password, clicks the Sign in button  - "Incorrect username or password" appears tests  -Confirms the visibility of the “Forgot password” text  -Clicks on “Forgot password”  -Fills the necessary boxes on the new page that opens  -Clicks the “Request Email” button  -Closes the page


   - Kullanici tarayiciyi acar ve https://qa.mealscenter.com/backoffice/auth/login sayfasina  giris yapar
   -Merchant Login yazisinin gorundugunu dogrular
   -Kullanici yanlis isim ve sifreyi  girer ,Sign in butonuna tiklar
   -”Incorrect username or password” yazisinin ciktigini test eder
   -”Forgot password” yazisinin gorunurlulugunu dogrular
   -”Forgot password” yazisina tiklar
   -Acilan yeni sayfada gerekli kutucuklar doldurulur
   -”Request Email” butonu tiklanir
   -Sayfayi kapatir

     */
    Merchant_Dashboard merchant_dashboard = new Merchant_Dashboard();

    @Test
    public void TC_01() {
        Driver.getDriver().get(ConfigReader.getProperty("merchantDashboardUrl"));
        Actions action = new Actions(Driver.getDriver());
        action.click(merchant_dashboard.merchantLoginUsername)
                .sendKeys(ConfigReader.getProperty("merchantDashboarFalsedUsername")).perform();
        action.click(merchant_dashboard.merchantLoginPassword)
                .sendKeys(ConfigReader.getProperty("merchantDashboardFalsePassword")).perform();
        merchant_dashboard.merchantLoginSignin.click();
        Assert.assertTrue(  merchant_dashboard.incorrectMessageText.isDisplayed());
        Assert.assertTrue(merchant_dashboard.forgotPasswordLink.isDisplayed());
        merchant_dashboard.forgotPasswordLink.click();

        Actions actions=new Actions(Driver.getDriver());
        actions.click( merchant_dashboard.forgotPasswordEmailCheckbox)
                        .sendKeys(ConfigReader.getProperty("merchantDashboardEmail")).perform();
        ReusableMethods.wait(1);

        merchant_dashboard.forgotPasswortLinkRequestEmailButton.click();
     Driver.closeDriver();
    }
}