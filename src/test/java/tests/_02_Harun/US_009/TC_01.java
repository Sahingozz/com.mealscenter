package tests._02_Harun.US_009;

import org.openqa.selenium.JavascriptExecutor;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.Homepage;
import pages.Homepage;
import utilities.ConfigReader;
import utilities.Driver;

public class TC_01 {
    @Test
    public void PrivacyPolicyTest(){
        Homepage mealsCenterpage=new Homepage();


        //"https://qa.mealscenter.com/"  sitesine git
        Driver.getDriver().get(ConfigReader.getProperty("mealsUrl"));
        //Ana sayfanin en alt kisminda Privacy policy Butonuna tikla
        JavascriptExecutor jse=(JavascriptExecutor) Driver.getDriver();
        jse.executeScript("arguments[0].scrollIntoView();",mealsCenterpage.Privacy_Policiy );
        jse.executeScript("arguments[0].click();",mealsCenterpage.Privacy_Policiy);


        //Privacy policy ekranin acildigini dogrula
        Assert.assertTrue(mealsCenterpage.PrivacyPolicyGorundu.isDisplayed());

        //sayfayi Kapat
        Driver.closeDriver();





    }
}
